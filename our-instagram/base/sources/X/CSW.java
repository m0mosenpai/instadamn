package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class CSW {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    public CSW(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0S(view, R.id.row_feed_media_notice);
        this.A02 = (ImageView) AbstractC166997dE.A0R(view, R.id.row_feed_media_notice_icon);
        this.A04 = AbstractC167007dF.A0N(view, R.id.row_feed_media_notice_text);
        this.A03 = AbstractC167007dF.A0N(view, R.id.row_feed_media_notice_sub_text);
        this.A01 = (ImageView) AbstractC166997dE.A0R(view, R.id.row_feed_media_notice_chevron);
    }
}
