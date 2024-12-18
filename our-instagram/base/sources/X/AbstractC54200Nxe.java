package X;

/* renamed from: X.Nxe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54200Nxe {
    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            return "ReelShareHandlerActivity.EXTRA_SHARE_REELS_INTENT";
                        }
                        throw B4Z.A00();
                    }
                    return "ShareHandlerActivity.EXTRA_SHARE_INTENT";
                }
                return "ClipsMusicShareHandlerActivity.EXTRA_SHARE_REELS_MUSIC_INTENT";
            }
            return "ClipsShareHandlerActivity.EXTRA_SHARE_REELS_INTENT";
        }
        return "ClipsThreadShareHandlerActivity.EXTRA_SHARE_REELS_THREAD_INTENT";
    }
}
