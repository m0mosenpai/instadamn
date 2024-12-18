package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Iwc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42800Iwc implements InterfaceC58290Psi {
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public TextView A03;
    public TextView A04;
    public CircularImageView A05;
    public IgProgressImageView A06;

    public C42800Iwc(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A06 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.preview_image);
        this.A05 = AbstractC31176DnK.A0U(this.A00, R.id.reel_preview_profile_picture);
        this.A04 = AbstractC167007dF.A0N(this.A00, R.id.reel_preview_username);
        this.A03 = AbstractC167007dF.A0N(this.A00, R.id.reel_preview_subtitle);
        this.A02 = (FrameLayout) this.A00.findViewById(R.id.reel_preview_container);
        this.A01 = (FrameLayout) AbstractC166997dE.A0R(this.A00, R.id.reel_preview_frame_layout);
    }

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A06);
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A06);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A06.setVisibility(8);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A06.setVisibility(0);
    }
}
