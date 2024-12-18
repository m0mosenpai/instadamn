package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* loaded from: classes9.dex */
public final class PJK implements InterfaceC43456JHu {
    public final View A00;
    public final View A01;
    public final View A02;
    public final IgTextView A03;
    public final IgImageView A04;
    public final SimpleVideoLayout A05;
    public final IgSimpleImageView A06;
    public final IgImageView A07;

    @Override // X.InterfaceC43456JHu
    public final IgImageView BGm() {
        return this.A04;
    }

    @Override // X.InterfaceC43456JHu
    public final SimpleVideoLayout CF1() {
        return this.A05;
    }

    @Override // X.InterfaceC43456JHu
    public final void CMZ() {
        this.A04.setVisibility(8);
    }

    @Override // X.InterfaceC43456JHu
    public final void Ekw() {
        this.A04.setVisibility(0);
    }

    public PJK(View view) {
        this.A00 = view;
        this.A01 = AbstractC166997dE.A0S(view, R.id.background_content_black_gradient);
        this.A02 = AbstractC166997dE.A0S(view, R.id.background_content_black_gradient_top);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.dynamic_text_view);
        this.A07 = AbstractC167007dF.A0T(view, R.id.like_heart_view);
        this.A06 = AbstractC31176DnK.A0T(view, R.id.card_facepile);
        this.A04 = AbstractC167007dF.A0T(view, R.id.image_placeholder);
        this.A05 = (SimpleVideoLayout) AbstractC166997dE.A0R(view, R.id.video_view);
    }
}
