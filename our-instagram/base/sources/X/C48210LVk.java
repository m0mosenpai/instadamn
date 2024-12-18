package X;

import android.view.View;

/* renamed from: X.LVk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48210LVk implements InterfaceC55932he {
    public final /* synthetic */ C7ET A00;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public C48210LVk(C7ET c7et) {
        this.A00 = c7et;
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        this.A00.A00 = 0.0f;
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C7ET c7et = this.A00;
        if (c7et.A0D != C05F.A00) {
            float A01 = (float) AbstractC70163Da.A01(c55982hj.A09.A00, c7et.A0K.A09.A00 * c7et.A00);
            View view = c7et.A06;
            if (view != null) {
                view.setTranslationX(A01);
            }
        }
    }
}
