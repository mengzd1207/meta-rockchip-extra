DESCRIPTION = "A image with Rockchip's multimedia packages."

IMAGE_FEATURES += "\
	package-management \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11-base', '', d)} \
"

LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += " \
	dhcp-client \
    packagegroup-rk-gstreamer \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', \
						'weston weston-init weston-examples \
							gtk+3-demo clutter-1.0-examples', '', d)} \
"
