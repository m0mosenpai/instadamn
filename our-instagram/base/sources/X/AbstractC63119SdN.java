package X;

/* renamed from: X.SdN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63119SdN {
    public static final C62500SEc A00;
    public static final C62501SEd A01;
    public static final C62502SEe A02;
    public static final C62503SEf A03;
    public static final C58526Pwu A04;

    public static C60818RUd A00(RTO parameters) {
        int i = parameters.A02;
        if (i == 16) {
            PxQ pxQ = (PxQ) C60818RUd.DEFAULT_INSTANCE.A0F(C05F.A0Y);
            ((C60818RUd) PxQ.A00(pxQ)).ivSize_ = parameters.A00;
            return (C60818RUd) pxQ.A02();
        }
        throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", AbstractC25228BEl.A1Y(i));
    }

    public static PxH A01(C62931SXy variant) {
        if (C62931SXy.A03.equals(variant)) {
            return PxH.TINK;
        }
        if (C62931SXy.A01.equals(variant)) {
            return PxH.CRUNCHY;
        }
        if (C62931SXy.A02.equals(variant)) {
            return PxH.RAW;
        }
        throw AbstractC58320PtC.A19(variant, "Unable to serialize variant: ", AbstractC166987dD.A1C());
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.AesEaxKey");
        A04 = A012;
        A03 = new C62503SEf(new C58365Pu5(3), RTO.class);
        A02 = C58366Pu6.A00(A012, 3);
        A01 = new C62501SEd(new C58363Pu3(3), RTB.class);
        A00 = C58367Pu7.A00(A012, 3);
    }
}
