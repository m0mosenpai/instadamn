package X;

/* loaded from: classes10.dex */
public abstract class SV6 {
    public static final C62500SEc A00;
    public static final C62501SEd A01;
    public static final C62502SEe A02;
    public static final C62503SEf A03;
    public static final C58526Pwu A04;

    public static PxH A00(SY0 variant) {
        if (SY0.A03.equals(variant)) {
            return PxH.TINK;
        }
        if (SY0.A01.equals(variant)) {
            return PxH.CRUNCHY;
        }
        if (SY0.A02.equals(variant)) {
            return PxH.RAW;
        }
        throw AbstractC58320PtC.A19(variant, "Unable to serialize variant: ", AbstractC166987dD.A1C());
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        A04 = A012;
        A03 = new C62503SEf(new C58365Pu5(5), RTM.class);
        A02 = C58366Pu6.A00(A012, 5);
        A01 = new C62501SEd(new C58363Pu3(5), RTD.class);
        A00 = C58367Pu7.A00(A012, 5);
    }
}
