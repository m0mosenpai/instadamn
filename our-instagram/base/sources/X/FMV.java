package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class FMV {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public FMV(View view) {
        this.A00 = view;
        this.A03 = AbstractC31173DnH.A0T(view, R.id.row_user_imageview);
        this.A02 = AbstractC166997dE.A0T(view, R.id.group_subtitle);
        this.A01 = AbstractC166997dE.A0T(view, R.id.group_follow_request_count);
    }
}
