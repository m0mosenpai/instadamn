package X;

/* loaded from: classes10.dex */
public abstract class SVE {
    public static final C62717SNg A00;
    public static final C62717SNg A01;
    public static final C62500SEc A02;
    public static final C62501SEd A03;
    public static final C62502SEe A04;
    public static final C62503SEf A05;
    public static final C58526Pwu A06;

    public static C60830RUp A00(C60800RTl parameters) {
        PxQ pxQ = (PxQ) C60830RUp.DEFAULT_INSTANCE.A0F(C05F.A0Y);
        ((C60830RUp) PxQ.A00(pxQ)).tagSize_ = parameters.A01;
        Rj3 rj3 = (Rj3) A00.A00(parameters.A02);
        C60830RUp c60830RUp = (C60830RUp) PxQ.A00(pxQ);
        if (rj3 != Rj3.UNRECOGNIZED) {
            c60830RUp.hash_ = rj3.A00;
            return (C60830RUp) pxQ.A02();
        }
        throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.HmacKey");
        A06 = A012;
        SYK syk = new SYK();
        syk.A01(PxH.RAW, SY9.A03);
        syk.A01(PxH.TINK, SY9.A04);
        syk.A01(PxH.LEGACY, SY9.A02);
        A01 = SYK.A00(syk, PxH.CRUNCHY, SY9.A01);
        SYK syk2 = new SYK();
        syk2.A01(Rj3.SHA1, SYC.A01);
        syk2.A01(Rj3.SHA224, SYC.A02);
        syk2.A01(Rj3.SHA256, SYC.A03);
        syk2.A01(Rj3.SHA384, SYC.A04);
        A00 = SYK.A00(syk2, Rj3.SHA512, SYC.A05);
        A05 = new C62503SEf(new C58365Pu5(12), C60800RTl.class);
        A04 = C58366Pu6.A00(A012, 12);
        A03 = new C62501SEd(new C58363Pu3(15), C60798RTj.class);
        A02 = C58367Pu7.A00(A012, 14);
    }
}
