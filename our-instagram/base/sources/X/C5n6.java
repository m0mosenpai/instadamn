package X;

/* renamed from: X.5n6, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5n6 {
    public static Integer A00(String str) {
        if (str.equals("UNKNOWN")) {
            return C05F.A00;
        }
        if (str.equals("DASH")) {
            return C05F.A01;
        }
        if (str.equals("DASH_LIVE")) {
            return C05F.A0C;
        }
        if (str.equals("PROGRESSIVE_DOWNLOAD")) {
            return C05F.A0N;
        }
        if (str.equals("RTC_LIVE")) {
            return C05F.A0Y;
        }
        if (str.equals("HLS")) {
            return C05F.A0j;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "dash";
            case 2:
                return "dash_live";
            case 3:
                return "progressive";
            case 4:
                return "rtc_live";
            case 5:
                return "hls";
            default:
                return "unknown";
        }
    }
}
