package X;

/* renamed from: X.4Ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC91984Ae {
    UNKNOWN(-1, "UNKNOWN"),
    DASH_VIDEO(2, "DASH_VIDEO"),
    DASH_AUDIO(1, "DASH_AUDIO"),
    DASH_TEXT(3, "DASH_TEXT"),
    DASH_UNKNOWN(0, "DASH_UNKNOWN"),
    PROGRESSIVE(10, "PROGRESSIVE"),
    LIVE_VIDEO(11, "LIVE_VIDEO"),
    LIVE_AUDIO(12, "LIVE_AUDIO"),
    LIVE_MANIFEST(13, "LIVE_MANIFEST"),
    LIVE_TEXT(14, "LIVE_TEXT");

    public final int A00;
    public final String A01;

    public static boolean A01(EnumC91984Ae enumC91984Ae) {
        if (enumC91984Ae != LIVE_VIDEO && enumC91984Ae != LIVE_AUDIO && enumC91984Ae != LIVE_MANIFEST && enumC91984Ae != LIVE_TEXT) {
            return false;
        }
        return true;
    }

    EnumC91984Ae(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public static EnumC91984Ae A00(int i) {
        for (EnumC91984Ae enumC91984Ae : values()) {
            if (enumC91984Ae.A00 == i) {
                return enumC91984Ae;
            }
        }
        return UNKNOWN;
    }
}
