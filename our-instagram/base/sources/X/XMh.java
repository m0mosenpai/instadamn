package X;

import android.view.Surface;

/* loaded from: classes12.dex */
public abstract class XMh {
    public static void A00(Surface surface, float f) {
        int i = 1;
        if (f == 0.0f) {
            i = 0;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            AbstractC46512Bo.A05("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
