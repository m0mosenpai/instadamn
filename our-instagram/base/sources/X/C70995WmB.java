package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.WmB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70995WmB implements C3Ow {
    public final CircularImageView A00;
    public final GradientSpinner A01;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A00;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A01;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A00.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A00.setVisibility(0);
    }

    public C70995WmB(CircularImageView circularImageView, GradientSpinner gradientSpinner) {
        AbstractC167017dG.A1P(circularImageView, gradientSpinner);
        this.A00 = circularImageView;
        this.A01 = gradientSpinner;
    }
}
