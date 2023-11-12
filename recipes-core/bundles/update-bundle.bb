DESCRIPTION = "RAUC bundle generator"

inherit bundle

RAUC_BUNDLE_FORMAT ?= "plain"

RAUC_BUNDLE_COMPATIBLE ?= "jetson-agx-xavier-devkit"
RAUC_BUNDLE_VERSION ?= "v20231112"
RAUC_BUNDLE_DESCRIPTION ?= "RAUC Jetson AGX Xavier devkit Bundle"
RAUC_BUNDLE_SLOTS ?= "rootfs kernel dtb"

RAUC_SLOT_rootfs ?= "xavier-raucdemo-image"
RAUC_SLOT_rootfs[fstype] ?= "ext4"

RAUC_SLOT_kernel ?= "linux-tegra"
RAUC_SLOT_kernel[type] ?= "kernel"
RAUC_SLOT_kernel[file] ?= "tegra-minimal-initramfs-xavier-rauc.cboot"

RAUC_SLOT_dtb ?= "linux-tegra"
RAUC_SLOT_dtb[type] ?= "file"
RAUC_SLOT_dtb[file] ?= "tegra194-p2888-0001-p2822-0000.dtb"

RAUC_KEY_FILE ?= "${THISDIR}/files/development-1.key.pem"
RAUC_CERT_FILE ?= "${THISDIR}/files/development-1.cert.pem"
