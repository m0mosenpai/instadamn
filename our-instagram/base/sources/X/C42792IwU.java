package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.IwU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42792IwU implements C3Ow {
    public final RectF A00;
    public final View A01;
    public final GradientSpinner A02;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return false;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return this.A00;
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A01;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return this.A00;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A02;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A01.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A01.setVisibility(0);
    }

    public C42792IwU(View view, GradientSpinner gradientSpinner) {
        AbstractC167017dG.A1P(view, gradientSpinner);
        this.A01 = view;
        this.A02 = gradientSpinner;
        RectF rectF = AbstractC13880nE.A01;
        RectF rectF2 = new RectF();
        AbstractC13880nE.A0M(rectF2, view);
        this.A00 = rectF2;
    }
}
