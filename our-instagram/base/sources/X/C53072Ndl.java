package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.Ndl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53072Ndl extends AbstractC51356MmH {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final RoundedCornerImageView A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53072Ndl(View view, UserSession userSession) {
        super(view, (ImageView) AbstractC166997dE.A0S(view, R.id.gallery_drafts_list_video_preview), (ImageView) AbstractC166997dE.A0S(view, R.id.invalid_draft_indicator), (ImageView) AbstractC166997dE.A0S(view, R.id.pinned_draft_indicator), (ImageView) AbstractC166997dE.A0S(view, R.id.overflow_launcher), (TextView) AbstractC166997dE.A0S(view, R.id.gallery_drafts_list_duration), userSession, (LoadingSpinnerView) AbstractC166997dE.A0S(view, R.id.gallery_drafts_list_import_draft_loading_indicator));
        AbstractC167017dG.A1P(userSession, view);
        ImageView imageView = super.A03;
        C14360o3.A0C(imageView, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.RoundedCornerImageView");
        this.A06 = (RoundedCornerImageView) imageView;
        this.A00 = AbstractC166997dE.A0S(view, R.id.gallery_drafts_list_duration_gradient);
        this.A02 = AbstractC167007dF.A0N(view, R.id.draft_list_item_first_row_text);
        this.A03 = AbstractC167007dF.A0N(view, R.id.draft_list_item_second_row_text);
        this.A04 = AbstractC167007dF.A0N(view, R.id.draft_list_item_third_row_text1);
        this.A05 = AbstractC167007dF.A0N(view, R.id.draft_list_item_third_row_text2);
        this.A01 = AbstractC166997dE.A0S(view, R.id.draft_list_item_third_row_divider);
    }
}
