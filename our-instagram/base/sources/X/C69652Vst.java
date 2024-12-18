package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Vst, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69652Vst {
    public IgSimpleImageView A00;
    public IgSimpleImageView A01;
    public final View A02;
    public final ViewStub A03;
    public final ImageView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final ViewStub A08;
    public final ViewStub A09;

    public C69652Vst(View view) {
        C14360o3.A0B(view, 1);
        this.A04 = AbstractC31176DnK.A0D(view, R.id.row_search_profile_image);
        View A0S = AbstractC166997dE.A0S(view, R.id.row_hashtag_container);
        this.A02 = A0S;
        IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.row_hashtag_textview_tag_name);
        this.A05 = A0d;
        AbstractC37300Gc1.A0d(A0d, true);
        this.A06 = (IgTextView) view.requireViewById(R.id.row_hashtag_textview_tag_subtitle);
        this.A07 = (IgTextView) view.requireViewById(R.id.row_hashtag_textview_tag_subtitle_ultradense);
        this.A09 = (ViewStub) view.requireViewById(R.id.selection_toggle_stub);
        this.A08 = (ViewStub) view.requireViewById(R.id.dismiss_button_stub);
        this.A03 = (ViewStub) view.requireViewById(R.id.icon_stub);
        A0S.setBackgroundResource(AbstractC53242c7.A0H(view.getContext(), R.attr.backgroundDrawable));
    }

    public final IgSimpleImageView A00() {
        IgSimpleImageView igSimpleImageView = this.A01;
        if (igSimpleImageView == null) {
            View inflate = this.A08.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView");
            IgSimpleImageView igSimpleImageView2 = (IgSimpleImageView) inflate;
            this.A01 = igSimpleImageView2;
            return igSimpleImageView2;
        }
        return igSimpleImageView;
    }
}
