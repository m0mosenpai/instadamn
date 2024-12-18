package X;

/* loaded from: classes9.dex */
public abstract class ONI {
    public static String A00(Integer num) {
        if (1 - num.intValue() != 0) {
            return "video/avc";
        }
        return "video/hevc";
    }

    public static String A01(Integer num) {
        if (1 - num.intValue() != 0) {
            return "H264";
        }
        return "H265";
    }
}
