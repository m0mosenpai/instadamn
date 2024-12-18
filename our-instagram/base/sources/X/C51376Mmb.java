package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Mmb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51376Mmb extends C3OO implements InterfaceC58290Psi {
    public final View A00;
    public final ImageView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final MediaFrameLayout A04;
    public final C177907vP A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51376Mmb(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = (MediaFrameLayout) AbstractC166987dD.A0c(view, R.id.item_container);
        this.A03 = AbstractC37302Gc3.A0K(view, R.id.story_cover_image);
        C177907vP c177907vP = new C177907vP(AbstractC166997dE.A0L(view));
        this.A05 = c177907vP;
        View requireViewById = this.itemView.requireViewById(R.id.gallery_grid_item_selection_circle);
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageDrawable(c177907vP);
        C14360o3.A07(requireViewById);
        this.A01 = imageView;
        this.A00 = AbstractC166997dE.A0S(this.itemView, R.id.gallery_grid_item_selection_overlay);
        this.A02 = AbstractC25231BEo.A0d(this.itemView, R.id.highlight_video_duration_label);
    }

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A04);
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A04);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A04.setVisibility(4);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A04.setVisibility(0);
    }
}
