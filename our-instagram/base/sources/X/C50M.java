package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.50M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50M extends C3OO implements InterfaceC72953Ov {
    public final C50N A00;
    public final C72973Oy A01;

    @Override // X.InterfaceC72953Ov
    public final void CJH(float f) {
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.InterfaceC72963Ox
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00.A0D);
    }

    @Override // X.InterfaceC72953Ov
    public final View AeT() {
        return this.A01.A02.A00();
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A00.A0D;
    }

    @Override // X.InterfaceC72953Ov
    public final View BlH() {
        return this.itemView;
    }

    @Override // X.InterfaceC72953Ov
    public final String BlW() {
        return this.A01.A02.A01;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A00.A0B;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A00.A0D.setVisibility(4);
    }

    @Override // X.InterfaceC72953Ov
    public final void EcK(C140626Xq c140626Xq) {
        this.A01.A01 = c140626Xq;
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A00.A0D.setVisibility(0);
    }

    public C50M(View view) {
        super(view);
        this.A01 = new C72973Oy(view);
        this.A00 = new C50N(view.requireViewById(R.id.avatar_container));
    }
}
