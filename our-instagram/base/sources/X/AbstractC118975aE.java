package X;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* renamed from: X.5aE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118975aE {
    public static C119005aH A00(View view) {
        ContentCaptureSession A00;
        if (Build.VERSION.SDK_INT < 29 || (A00 = AbstractC118995aG.A00(view)) == null) {
            return null;
        }
        return C119005aH.A00(view, A00);
    }

    public static void A01(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC118985aF.A00(view);
        }
    }
}
