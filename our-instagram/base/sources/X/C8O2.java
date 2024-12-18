package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8O2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O2 extends C668630d {
    public float A00;
    public float A01;
    public Drawable A02;
    public C202278x7 A03;
    public InterfaceC16820sZ A04 = C8O3.A00;
    public final /* synthetic */ C8O1 A05;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        this.A04.invoke();
        this.A05.A04.A0Q(this.A02);
        c55982hj.A0B(this);
        c55982hj.A08(0.0d, true);
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) (c55982hj.A09.A00 / c55982hj.A01);
        C202278x7 c202278x7 = this.A03;
        if (c202278x7 != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A05.A04;
            float f2 = 1.0f - f;
            interactiveDrawableContainer.A0n(this.A02, c202278x7.A01 * f2, c202278x7.A02 * f2);
            interactiveDrawableContainer.A0m(this.A02, c202278x7.A06 + (this.A01 * f));
            interactiveDrawableContainer.A0l(this.A02, c202278x7.A05 + (this.A00 * f));
        }
    }

    public C8O2(C8O1 c8o1) {
        this.A05 = c8o1;
    }
}
