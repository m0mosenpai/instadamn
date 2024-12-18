package X;

import android.view.View;

/* renamed from: X.AnP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24140AnP implements InterfaceC74253Vg {
    public final View A00;

    @Override // X.InterfaceC74253Vg
    public final /* synthetic */ void CwW() {
    }

    @Override // X.InterfaceC74253Vg
    public final void Cwl(boolean z, float f) {
        View view = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        if (z) {
            f = (float) Math.min(Math.max(f, view.getAlpha()), 1.0d);
        }
        view.setAlpha(f);
    }

    public C24140AnP(View view) {
        this.A00 = view;
    }
}
