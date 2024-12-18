package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.IwW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42794IwW implements C3Ow {
    public final RectF A00;
    public final CircularImageView A01;
    public final GradientSpinner A02;
    public final /* synthetic */ C66346UAn A03;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    public C42794IwW(C66346UAn c66346UAn) {
        this.A03 = c66346UAn;
        CircularImageView circularImageView = c66346UAn.A03;
        this.A01 = circularImageView;
        this.A00 = AbstractC13880nE.A0G(circularImageView);
        this.A02 = c66346UAn.A04;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return this.A00;
    }

    @Override // X.C3Ow
    public final /* bridge */ /* synthetic */ View Aek() {
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
        this.A03.A03.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A03.A03.setVisibility(0);
    }
}
