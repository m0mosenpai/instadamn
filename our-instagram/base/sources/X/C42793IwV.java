package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.IwV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42793IwV implements C3Ow {
    public final View A00;
    public final IgImageView A01;
    public final GradientSpinner A02;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A01);
    }

    @Override // X.C3Ow
    public final /* bridge */ /* synthetic */ View Aek() {
        return this.A01;
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A01);
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

    public C42793IwV(View view, IgImageView igImageView, GradientSpinner gradientSpinner) {
        AbstractC167017dG.A1R(igImageView, gradientSpinner);
        this.A00 = view;
        this.A01 = igImageView;
        this.A02 = gradientSpinner;
    }
}
