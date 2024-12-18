package X;

/* loaded from: classes10.dex */
public abstract class S3J {
    public static C60789RTa A00(RTX rtx, RTY rty, RTZ rtz, SY6 sy6) {
        if (rtz != null) {
            if (rty != null) {
                if (rtx != null) {
                    if (sy6 != null) {
                        return new C60789RTa(rtx, rty, rtz, sy6);
                    }
                    throw AbstractC58318PtA.A0x("HPKE variant is not set");
                }
                throw AbstractC58318PtA.A0x("HPKE AEAD parameter is not set");
            }
            throw AbstractC58318PtA.A0x("HPKE KDF parameter is not set");
        }
        throw AbstractC58318PtA.A0x("HPKE KEM parameter is not set");
    }
}
