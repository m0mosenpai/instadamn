package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Vn9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69424Vn9 {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final C57012jc A03;
    public final C57012jc A04;
    public final C57012jc A05;
    public final C57012jc A06;
    public final C57012jc A07;
    public final C57012jc A08;

    public C69424Vn9(View view) {
        this.A00 = view;
        this.A02 = (CircularImageView) view.requireViewById(R.id.row_user_imageview);
        this.A08 = AbstractC31177DnL.A0V(view, R.id.row_user_imageview_reelring);
        this.A03 = AbstractC31177DnL.A0V(view, R.id.row_user_branding_badge);
        this.A01 = (TextView) view.requireViewById(R.id.row_text);
        this.A04 = AbstractC31177DnL.A0V(view, R.id.row_hashtag_follow_button);
        this.A07 = AbstractC31177DnL.A0V(view, R.id.row_media_set);
        this.A06 = AbstractC31177DnL.A0V(view, R.id.row_inline_survey);
        this.A05 = AbstractC31177DnL.A0V(view, R.id.row_inline_survey_confirmation);
    }
}
