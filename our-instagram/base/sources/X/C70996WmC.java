package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.WmC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70996WmC implements C3Ow {
    public final IgImageView A00;
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

    public C70996WmC(IgImageView igImageView, GradientSpinner gradientSpinner) {
        this.A00 = igImageView;
        this.A01 = gradientSpinner;
    }
}
