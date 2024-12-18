package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* loaded from: classes6.dex */
public final class GF5 implements C3Ow {
    public final /* synthetic */ CircularImageView A00;
    public final /* synthetic */ GradientSpinner A01;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    public GF5(CircularImageView circularImageView, GradientSpinner gradientSpinner) {
        this.A00 = circularImageView;
        this.A01 = gradientSpinner;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A00.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A00.setVisibility(0);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A00;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A01;
    }
}
