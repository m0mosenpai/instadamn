package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class H8J extends C668630d {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC16660sJ A01;
    public final /* synthetic */ boolean A02;

    public H8J(View view, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A01 = interfaceC16660sJ;
        this.A02 = z;
        this.A00 = view;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        this.A01.invoke(c55982hj);
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        if (c55982hj != null) {
            f = (float) c55982hj.A09.A00;
        } else {
            f = 0.0f;
        }
        boolean z = this.A02;
        View view = this.A00;
        if (z) {
            view.setTranslationX(f);
        } else {
            view.setTranslationY(f);
        }
    }
}
