package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Iwb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42799Iwb implements InterfaceC58290Psi {
    public final View A00;
    public final C41066IGj A01;
    public final IJ7 A02;
    public final IFE A03;
    public final IIG A04;

    public C42799Iwb(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = new IJ7(view, R.id.content);
        this.A03 = new IFE(view);
        this.A04 = new IIG(view);
        this.A01 = new C41066IGj(view, R.id.content);
        this.A00 = view;
    }

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A00.setVisibility(4);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A00.setVisibility(0);
    }
}
