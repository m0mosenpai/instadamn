package X;

import android.graphics.Matrix;
import android.view.TextureView;
import android.view.ViewGroup;

/* renamed from: X.9zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226849zg {
    public static final C09530e4 A00(TextureView textureView, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float f;
        C56302iJ c56302iJ;
        ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        if ((layoutParams instanceof C56302iJ) && (c56302iJ = (C56302iJ) layoutParams) != null) {
            c56302iJ.A0F = -1;
        }
        float f2 = i3;
        float f3 = i4;
        boolean z3 = false;
        if (f2 / f3 <= 0.5625d) {
            z3 = true;
        }
        if (z2 && !z && !z3) {
            textureView.setTransform(null);
            textureView.setLayoutParams(layoutParams);
            Float valueOf = Float.valueOf(1.0f);
            return new C09530e4(valueOf, valueOf);
        }
        float f4 = i;
        float f5 = i2;
        if (z && !z3) {
            f = f5 / f3;
        } else {
            f = f4 / f2;
        }
        C09530e4 A1L = AbstractC166987dD.A1L(Float.valueOf((f2 / f4) * f), Float.valueOf((f3 / f5) * f));
        layoutParams.width = i;
        layoutParams.height = i2;
        if (z2) {
            Float valueOf2 = Float.valueOf(Math.max(AbstractC166987dD.A09(A1L.A00), AbstractC166987dD.A09(A1L.A01)));
            A1L = new C09530e4(valueOf2, valueOf2);
        }
        Matrix A0Q = AbstractC166987dD.A0Q();
        float f6 = f4 / 2.0f;
        float f7 = f5 / 2.0f;
        A0Q.setScale(AbstractC166987dD.A09(A1L.A00), AbstractC166987dD.A09(A1L.A01), f6, f7);
        textureView.setPivotX(f6);
        textureView.setPivotY(f7);
        textureView.setTransform(A0Q);
        return A1L;
    }
}
