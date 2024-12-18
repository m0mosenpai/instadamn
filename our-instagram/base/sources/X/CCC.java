package X;

import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes5.dex */
public abstract class CCC {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 500;
            case 2:
                return 600;
            case 3:
                return 700;
            default:
                return ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
        }
    }
}
