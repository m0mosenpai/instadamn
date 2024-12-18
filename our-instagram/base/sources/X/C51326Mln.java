package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Mln, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51326Mln extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final RoundedCornerImageView A04;

    public C51326Mln(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.scheduled_content_item_container);
        this.A04 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.scheduled_content_image);
        this.A02 = AbstractC167007dF.A0N(view, R.id.scheduled_content_caption);
        this.A03 = AbstractC167007dF.A0N(view, R.id.scheduled_content_scheduled_publish_time);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.scheduled_content_scheduled_more_button);
    }
}
