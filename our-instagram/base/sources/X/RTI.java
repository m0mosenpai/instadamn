package X;

/* loaded from: classes10.dex */
public final class RTI extends RTJ {
    public final RTL A00;
    public final C58526Pwu A01;
    public final C58552PxP A02;
    public final Integer A03;

    public static RTI A00(SY2 variant, C58552PxP secretBytes, Integer idRequirement) {
        C58526Pwu A0c;
        SY2 sy2 = SY2.A02;
        if (variant != sy2 && idRequirement == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("For given Variant ");
            A1C.append(variant);
            throw AbstractC58318PtA.A0x(AbstractC166997dE.A0x(" the value of idRequirement must be non-null", A1C));
        }
        if (variant == sy2 && idRequirement != null) {
            throw AbstractC58318PtA.A0x("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        int length = secretBytes.A00.A00.length;
        if (length == 32) {
            RTL rtl = new RTL(variant);
            SY2 sy22 = rtl.A00;
            if (sy22 == sy2) {
                A0c = AbstractC62333S7d.A00;
            } else if (sy22 == SY2.A01) {
                A0c = AbstractC58319PtB.A0b(idRequirement);
            } else if (sy22 == SY2.A03) {
                A0c = AbstractC58319PtB.A0c(idRequirement);
            } else {
                throw AbstractC43594JPz.A0o(sy22, "Unknown Variant: ", AbstractC166987dD.A1C());
            }
            return new RTI(rtl, A0c, secretBytes, idRequirement);
        }
        throw AbstractC58320PtC.A1A("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length);
    }

    public RTI(RTL parameters, C58526Pwu keyBytes, C58552PxP outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A02 = outputPrefix;
        this.A01 = keyBytes;
        this.A03 = idRequirement;
    }
}
