package X;

import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.5wU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131395wU extends C668630d {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public BEd A04;
    public final /* synthetic */ InteractiveDrawableContainer A05;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        this.A02 = 0.0f;
        this.A03 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A04 = null;
        C55982hj c55982hj2 = this.A05.A0n;
        c55982hj2.A0B(this);
        c55982hj2.A05(0.0d);
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        BEd bEd = this.A04;
        if (bEd != null) {
            C55992hk c55992hk = c55982hj.A09;
            bEd.EZk((float) AbstractC70163Da.A03(c55992hk.A00, this.A02, this.A00));
            bEd.EZl((float) AbstractC70163Da.A03(c55992hk.A00, this.A03, this.A01));
        }
    }

    public C131395wU(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A05 = interactiveDrawableContainer;
    }
}
