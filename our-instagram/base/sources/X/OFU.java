package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* loaded from: classes9.dex */
public final class OFU {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final RoundedCornerImageView A07;
    public final IgdsRadioButton A08;
    public final PJK A09;
    public final View A0A;

    public OFU(View view, View view2) {
        this.A0A = view;
        this.A00 = view2;
        this.A06 = AbstractC31176DnK.A0U(view2, R.id.row_threads_in_stories_photo_profile_imageview);
        this.A05 = AbstractC167007dF.A0N(view2, R.id.row_threads_in_stories_photo_profile_name);
        this.A03 = AbstractC167007dF.A0N(view2, R.id.row_threads_in_stories_reposter_profile_name);
        this.A04 = AbstractC167007dF.A0N(view2, R.id.row_threads_in_stories_timestamp);
        this.A01 = AbstractC167007dF.A0N(view2, R.id.row_threads_in_stories_content_text);
        this.A02 = AbstractC167007dF.A0N(view2, R.id.row_threads_in_stories_replies_and_likes);
        this.A07 = (RoundedCornerImageView) AbstractC166997dE.A0R(view2, R.id.row_threads_in_stories_media_image);
        this.A09 = new PJK(AbstractC166997dE.A0S(view, R.id.row_threads_in_stories_video_view));
        this.A08 = (IgdsRadioButton) AbstractC166997dE.A0R(view2, R.id.row_threads_in_stories_report_radio_button);
    }
}
