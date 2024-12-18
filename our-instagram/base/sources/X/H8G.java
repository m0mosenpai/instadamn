package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class H8G extends C668630d {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public H8G(View view, boolean z) {
        this.A01 = z;
        this.A00 = view;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        if (c55982hj != null) {
            f = (float) c55982hj.A09.A00;
        } else {
            f = 0.0f;
        }
        boolean z = this.A01;
        View view = this.A00;
        if (z) {
            view.setScaleX(f);
        } else {
            view.setScaleY(f);
        }
    }
}
