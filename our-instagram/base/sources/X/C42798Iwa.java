package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Iwa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42798Iwa implements InterfaceC58290Psi {
    public final View A00;
    public final IgProgressImageView A01;
    public final C41066IGj A02;
    public final IJ7 A03;
    public final IFE A04;

    public C42798Iwa(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = new IJ7(view, R.id.content);
        this.A04 = new IFE(view);
        this.A02 = new C41066IGj(view, R.id.content);
        this.A01 = (IgProgressImageView) AbstractC166987dD.A0c(view, R.id.photo);
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
