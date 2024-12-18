package X;

/* renamed from: X.SdO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63120SdO {
    public static final C62500SEc A00;
    public static final C62501SEd A01;
    public static final C62502SEe A02;
    public static final C62503SEf A03;
    public static final C58526Pwu A04;

    public static PxH A00(SXz variant) {
        if (SXz.A03.equals(variant)) {
            return PxH.TINK;
        }
        if (SXz.A01.equals(variant)) {
            return PxH.CRUNCHY;
        }
        if (SXz.A02.equals(variant)) {
            return PxH.RAW;
        }
        throw AbstractC58320PtC.A19(variant, "Unable to serialize variant: ", AbstractC166987dD.A1C());
    }

    public static void A01(C58529Pwx parameters) {
        int i = parameters.A02;
        if (i == 16) {
            int i2 = parameters.A00;
            if (i2 == 12) {
                return;
            } else {
                throw AbstractC58319PtB.A0z("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", AbstractC25228BEl.A1Y(i2));
            }
        }
        throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", AbstractC25228BEl.A1Y(i));
    }

    static {
        C58526Pwu A012 = AbstractC58538Px6.A01("type.googleapis.com/google.crypto.tink.AesGcmKey");
        A04 = A012;
        A03 = new C62503SEf(new C58365Pu5(4), C58529Pwx.class);
        A02 = C58366Pu6.A00(A012, 4);
        A01 = new C62501SEd(new C58363Pu3(4), RTC.class);
        A00 = C58367Pu7.A00(A012, 4);
    }
}
