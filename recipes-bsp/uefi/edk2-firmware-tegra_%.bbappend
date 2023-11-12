FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

DEPENDS:append = " dtc-native"

SRC_URI:append = " \
        file://L4TConfigurationAB.dts \
"

do_compile:append() {
        dtc -I dts -O dtb -o ${WORKDIR}/L4TConfigurationAB.dtbo \
                ${WORKDIR}/L4TConfigurationAB.dts
        cp ${WORKDIR}/L4TConfigurationAB.dtbo ${B}/images/L4TConfiguration.dtbo
        cp ${WORKDIR}/L4TConfigurationAB.dtbo ${B}/images/L4TConfiguration-rcmboot.dtbo
        fdtput -t s ${B}/images/L4TConfiguration-rcmboot.dtbo /fragment@0/__overlay__/firmware/uefi/variables/gNVIDIATokenSpaceGuid/DefaultBootPriority data boot.img
}
