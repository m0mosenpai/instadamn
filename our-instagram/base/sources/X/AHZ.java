package X;

import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;

/* loaded from: classes4.dex */
public abstract class AHZ {
    public static final Integer A02(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1212837439) {
            if (hashCode != 3415681) {
                if (hashCode == 668488878 && str.equals("permanent")) {
                    return C05F.A0C;
                }
                return null;
            }
            if (str.equals("once")) {
                return C05F.A00;
            }
            return null;
        }
        if (str.equals("replayable")) {
            return C05F.A01;
        }
        return null;
    }

    public static final Integer A00(LocalSendSpeedMessageTypes localSendSpeedMessageTypes) {
        switch (localSendSpeedMessageTypes.ordinal()) {
            case 1:
                return C05F.A1F;
            case 2:
                return C05F.A09;
            case 3:
                return C05F.A06;
            case 4:
                return C05F.A0N;
            case 5:
                return C05F.A0Y;
            case 6:
                return C05F.A0A;
            case 7:
                return C05F.A04;
            case 8:
                return C05F.A03;
            default:
                return C05F.A00;
        }
    }

    public static final Integer A01(Integer num) {
        switch (num.intValue()) {
            case 2:
                return C05F.A0N;
            case 3:
                return C05F.A0Y;
            case 4:
            default:
                return C05F.A00;
            case 5:
                return C05F.A06;
            case 6:
                return C05F.A09;
            case 7:
                return C05F.A0A;
            case 8:
                return C05F.A04;
            case 9:
                return C05F.A03;
        }
    }
}
