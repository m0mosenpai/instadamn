package X;

/* renamed from: X.SgR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63267SgR {
    public static final C62500SEc A00;
    public static final C62501SEd A01;
    public static final C62502SEe A02;
    public static final C62503SEf A03;
    public static final C58526Pwu A04;

    public static C60830RUp A01(RTQ parameters) {
        Rj3 rj3;
        PxQ pxQ = (PxQ) C60830RUp.DEFAULT_INSTANCE.A0F(C05F.A0Y);
        ((C60830RUp) PxQ.A00(pxQ)).tagSize_ = parameters.A03;
        SYA sya = parameters.A04;
        if (SYA.A01.equals(sya)) {
            rj3 = Rj3.SHA1;
        } else if (SYA.A02.equals(sya)) {
            rj3 = Rj3.SHA224;
        } else if (SYA.A03.equals(sya)) {
            rj3 = Rj3.SHA256;
        } else if (SYA.A04.equals(sya)) {
            rj3 = Rj3.SHA384;
        } else if (SYA.A05.equals(sya)) {
            rj3 = Rj3.SHA512;
        } else {
            throw AbstractC58320PtC.A19(sya, "Unable to serialize HashType ", AbstractC166987dD.A1C());
        }
        ((C60830RUp) PxQ.A00(pxQ)).hash_ = rj3.A00;
        return (C60830RUp) pxQ.A02();
    }

    public static PxH A02(C62930SXx variant) {
        if (C62930SXx.A03.equals(variant)) {
            return PxH.TINK;
        }
        if (C62930SXx.A01.equals(variant)) {
            return PxH.CRUNCHY;
        }
        if (C62930SXx.A02.equals(variant)) {
            return PxH.RAW;
        }
        throw AbstractC58320PtC.A19(variant, "Unable to serialize variant: ", AbstractC166987dD.A1C());
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        A04 = A012;
        A03 = new C62503SEf(new C58365Pu5(2), RTQ.class);
        A02 = C58366Pu6.A00(A012, 2);
        A01 = new C62501SEd(new C58363Pu3(2), RTE.class);
        A00 = C58367Pu7.A00(A012, 2);
    }

    public static SYA A00(Rj3 hashType) {
        int ordinal = hashType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 5) {
                if (ordinal != 3) {
                    if (ordinal != 2) {
                        if (ordinal == 4) {
                            return SYA.A05;
                        }
                        if (hashType != Rj3.UNRECOGNIZED) {
                            throw AbstractC58320PtC.A1A("Unable to parse HashType: ", hashType.A00);
                        }
                        throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
                    }
                    return SYA.A04;
                }
                return SYA.A03;
            }
            return SYA.A02;
        }
        return SYA.A01;
    }
}
