package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes7.dex */
public final class IHU {
    public final TextView A00;
    public final TextView A01;
    public final CircularImageView A02;

    public IHU(View view) {
        this.A02 = (CircularImageView) view.findViewById(R.id.support_inbox_event_row_icon);
        this.A01 = AbstractC166987dD.A0e(view, R.id.support_inbox_event_row_title);
        this.A00 = AbstractC166987dD.A0e(view, R.id.support_inbox_event_row_subtitle);
    }
}
