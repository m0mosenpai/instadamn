package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.E9n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32115E9n extends C668630d {
    public final /* synthetic */ AbstractC31776DxZ A00;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        AbstractC31776DxZ abstractC31776DxZ = this.A00;
        Drawable drawable = abstractC31776DxZ.A02;
        if (drawable != null) {
            drawable.setAlpha((int) c55982hj.A09.A00);
        }
        abstractC31776DxZ.invalidate();
    }

    public C32115E9n(AbstractC31776DxZ abstractC31776DxZ) {
        this.A00 = abstractC31776DxZ;
    }
}
