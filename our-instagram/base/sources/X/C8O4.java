package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8O4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O4 extends C668630d {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public Drawable A07;
    public final /* synthetic */ C8O1 A08;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        c55982hj.A0B(this);
        c55982hj.A08(0.0d, true);
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) (c55982hj.A09.A00 / c55982hj.A01);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A08.A04;
        interactiveDrawableContainer.A0n(this.A07, this.A01 + (this.A05 * f), this.A02 + (this.A06 * f));
        interactiveDrawableContainer.A0m(this.A07, this.A00 + (this.A04 * f));
        interactiveDrawableContainer.A0l(this.A07, this.A03 * f);
    }

    public C8O4(C8O1 c8o1) {
        this.A08 = c8o1;
    }
}
