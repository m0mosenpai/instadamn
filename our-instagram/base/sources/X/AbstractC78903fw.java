package X;

import android.view.View;

/* renamed from: X.3fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78903fw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public static final int A00(Object obj) {
        ?? r2;
        if (obj instanceof View) {
            View view = (View) obj;
            boolean isClickable = view.isClickable();
            boolean z = isClickable;
            if (view.isLongClickable()) {
                z = (isClickable ? 1 : 0) | 2;
            }
            boolean z2 = z;
            if (view.isFocusable()) {
                z2 = (z ? 1 : 0) | 4;
            }
            boolean z3 = z2;
            if (view.isEnabled()) {
                z3 = (z2 ? 1 : 0) | '\b';
            }
            boolean z4 = z3;
            if (view.isSelected()) {
                z4 = (z3 ? 1 : 0) | 16;
            }
            boolean z5 = z4;
            if (view.isKeyboardNavigationCluster()) {
                z5 = (z4 ? 1 : 0) | 128;
            }
            int visibility = view.getVisibility();
            if (visibility != 4) {
                r2 = z5;
                if (visibility == 8) {
                    r2 = (z5 ? 1 : 0) | 512;
                }
            } else {
                r2 = (z5 ? 1 : 0) | 256;
            }
            int layerType = view.getLayerType();
            if (layerType != 0) {
                if (layerType != 1) {
                    if (layerType == 2) {
                        return r2 | 64;
                    }
                    throw new IllegalArgumentException("Unhandled layer type encountered.");
                }
                return r2 | 32;
            }
            return r2;
        }
        return 0;
    }
}
