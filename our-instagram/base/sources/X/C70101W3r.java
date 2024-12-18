package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W3r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70101W3r {
    public static final C70101W3r A00 = new Object();

    public final C4PX A00(Context context, WindowLayoutInfo windowLayoutInfo) {
        C52882bU AIr;
        W4E w4e;
        W4D w4d;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AIr = C52842bQ.A00.AIs(context);
        } else if (i >= 29 && (context instanceof Activity)) {
            AIr = C52842bQ.A00.AIr((Activity) context);
        } else {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList A10 = AbstractC31174DnI.A10(displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C14360o3.A05(foldingFeature);
                FoldingFeature foldingFeature2 = foldingFeature;
                C14360o3.A0B(foldingFeature2, 1);
                int type = foldingFeature2.getType();
                if (type != 1) {
                    if (type == 2) {
                        w4e = W4E.A02;
                    }
                } else {
                    w4e = W4E.A01;
                }
                int state = foldingFeature2.getState();
                if (state != 1) {
                    if (state == 2) {
                        w4d = W4D.A02;
                    }
                } else {
                    w4d = W4D.A01;
                }
                Rect bounds = foldingFeature2.getBounds();
                C14360o3.A07(bounds);
                C52872bT c52872bT = new C52872bT(bounds);
                Rect A002 = AIr.A00();
                int i2 = c52872bT.A00 - c52872bT.A03;
                if (i2 != 0 || c52872bT.A02 - c52872bT.A01 != 0) {
                    int i3 = c52872bT.A02 - c52872bT.A01;
                    if (i3 == A002.width() || i2 == A002.height()) {
                        if (i3 >= A002.width() || i2 >= A002.height()) {
                            if (i3 != A002.width() || i2 != A002.height()) {
                                Rect bounds2 = foldingFeature2.getBounds();
                                C14360o3.A07(bounds2);
                                A10.add(new WTE(new C52872bT(bounds2), w4d, w4e));
                            }
                        }
                    }
                }
            }
        }
        return new C4PX(A10);
    }
}
