package X;

import android.view.Surface;

/* renamed from: X.Xfc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72523Xfc {
    public static void A00(Surface surface) {
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e) {
            AbstractC63374Sil.A05("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
