FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

CUR_DIR := "${THISDIR}"

SRC_URI:append = " \
    file://flash_t194_sdmmc_rootfs_ab_data.xml \
"

do_install:prepend() {
    install -m 755 ${CUR_DIR}/files/${PARTITION_LAYOUT_TEMPLATE} \
        ${S}/bootloader/${NVIDIA_BOARD}/cfg/
    sed -ie "s,DATA_SIZE,${DATA_SIZE}," \
        ${S}/bootloader/${NVIDIA_BOARD}/cfg/${PARTITION_LAYOUT_TEMPLATE}
}
