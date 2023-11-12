FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "file://flashvars"

do_install:append() {
    install -m 0644 ${WORKDIR}/flashvars ${D}${datadir}/tegraflash/
}
