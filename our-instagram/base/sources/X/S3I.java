package X;

/* loaded from: classes10.dex */
public abstract class S3I {
    public static C60790RTb A00(AbstractC61590RqE abstractC61590RqE, SY7 sy7, SYB syb, SY4 sy4, SY5 sy5, C58526Pwu c58526Pwu) {
        if (sy7 != null) {
            if (syb != null) {
                if (abstractC61590RqE != null) {
                    if (sy5 != null) {
                        SY7 sy72 = SY7.A04;
                        if (sy7 != sy72 && sy4 == null) {
                            throw AbstractC58318PtA.A0x("Point format is not set");
                        }
                        if (sy7 == sy72 && sy4 != null) {
                            throw AbstractC58318PtA.A0x("For Curve25519 point format must not be set");
                        }
                        return new C60790RTb(abstractC61590RqE, sy7, syb, sy4, sy5, c58526Pwu);
                    }
                    throw AbstractC58318PtA.A0x("Variant is not set");
                }
                throw AbstractC58318PtA.A0x("DEM parameters are not set");
            }
            throw AbstractC58318PtA.A0x("Hash type is not set");
        }
        throw AbstractC58318PtA.A0x("Elliptic curve type is not set");
    }
}
