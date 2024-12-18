package X;

/* renamed from: X.SdP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63121SdP {
    public static final C62500SEc A00;
    public static final C62501SEd A01;
    public static final C62502SEe A02;
    public static final C62503SEf A03;
    public static final C58526Pwu A04;

    public static PxH A01(SY8 variant) {
        if (SY8.A04.equals(variant)) {
            return PxH.TINK;
        }
        if (SY8.A01.equals(variant)) {
            return PxH.CRUNCHY;
        }
        if (SY8.A03.equals(variant)) {
            return PxH.RAW;
        }
        if (SY8.A02.equals(variant)) {
            return PxH.LEGACY;
        }
        throw AbstractC58320PtC.A19(variant, "Unable to serialize variant: ", AbstractC166987dD.A1C());
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.AesCmacKey");
        A04 = A012;
        A03 = new C62503SEf(new C58365Pu5(11), C60799RTk.class);
        A02 = C58366Pu6.A00(A012, 11);
        A01 = new C62501SEd(new C58363Pu3(14), C60797RTi.class);
        A00 = C58367Pu7.A00(A012, 13);
    }

    public static SY8 A00(PxH outputPrefixType) {
        int ordinal = outputPrefixType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 4) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return SY8.A03;
                    }
                    throw AbstractC58320PtC.A18(outputPrefixType);
                }
                return SY8.A02;
            }
            return SY8.A01;
        }
        return SY8.A04;
    }
}
