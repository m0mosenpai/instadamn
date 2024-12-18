package X;

/* renamed from: X.8uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC200928uZ {
    public static final EnumC200798uM A01(EnumC200808uN enumC200808uN) {
        if (enumC200808uN == null) {
            return null;
        }
        switch (enumC200808uN) {
            case A03:
                return EnumC200798uM.FACEBOOK;
            case A04:
                return EnumC200798uM.FACEBOOK_DEBUG;
            case A05:
                return EnumC200798uM.FACEBOOK_LITE;
            case A06:
                return EnumC200798uM.INSTAGRAM;
            case A07:
                return EnumC200798uM.INSTAGRAM_WITH_V2_PROVIDER;
            case A0A:
                return EnumC200798uM.MLITE;
            case A08:
                return EnumC200798uM.MESSENGER;
            case A09:
                return EnumC200798uM.MESSENGER_WITH_LITE_PROVIDER;
            default:
                return null;
        }
    }

    public static final EnumC200808uN A00(EnumC200798uM enumC200798uM) {
        switch (enumC200798uM) {
            case FACEBOOK:
                return EnumC200808uN.A03;
            case FACEBOOK_DEBUG:
                return EnumC200808uN.A04;
            case FACEBOOK_LITE:
                return EnumC200808uN.A05;
            case INSTAGRAM:
                return EnumC200808uN.A06;
            case INSTAGRAM_WITH_V2_PROVIDER:
                return EnumC200808uN.A07;
            case MLITE:
                return EnumC200808uN.A0A;
            case MESSENGER:
                return EnumC200808uN.A08;
            case MESSENGER_WITH_LITE_PROVIDER:
                return EnumC200808uN.A09;
            case OCULUS:
                return EnumC200808uN.A0D;
            default:
                return EnumC200808uN.A0E;
        }
    }
}
