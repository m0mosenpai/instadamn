package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.WmA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70994WmA implements C3Ow {
    public final /* synthetic */ C66483UJj A00;

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    public C70994WmA(C66483UJj c66483UJj) {
        this.A00 = c66483UJj;
    }

    @Override // X.InterfaceC72963Ox
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00.A0A);
    }

    @Override // X.C3Ow
    public final View Aek() {
        return this.A00.A0A;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        return this.A00.A0G;
    }

    @Override // X.C3Ow
    public final void CMM() {
        this.A00.A0A.setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        this.A00.A0A.setVisibility(0);
    }
}
