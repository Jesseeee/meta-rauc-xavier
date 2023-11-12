require recipes-core/images/core-image-minimal.bb

SUMMARY = "Jetson AGX Xavier Devkit minimal image"
DESCRIPTION = "\
        Small image capable of booting a device with support for: \
        * tegra-mmapi \
        * gstreamer1.0 \
        * RAUC \
"

IMAGE_INSTALL_GSTREAMER = "\
        gstreamer1.0-plugins-tegra \
        gstreamer1.0-plugins-bad \
        gstreamer1.0-plugins-base \
        gstreamer1.0-plugins-good \
"

IMAGE_INSTALL:append = " \
        tegra-mmapi \
        tegra-eeprom-tool \
        rauc \
        e2fsprogs \
        mtd-utils \
        ethtool \
        net-tools \
        iptables \
        tcpdump \
        packagegroup-core-tools-debug \
        pciutils \
        i2c-tools \
        devmem2 \
        ldd \
        tegra-tools-tegrastats \
        ${IMAGE_INSTALL_GSTREAMER} \
"

IMAGE_FEATURES:append = " \
        read-only-rootfs \
        overlayfs-etc \
        ssh-server-dropbear \
	debug-tweaks \
        allow-root-login \
"
IMAGE_FEATURES:remove = "package-management"

