package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class FM8 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public FM8(View view) {
        this.A00 = view.requireViewById(R.id.uhl_account_row);
        this.A03 = AbstractC31173DnH.A0T(view, R.id.uhl_account_profile_image);
        this.A01 = AbstractC166997dE.A0T(view, R.id.uhl_account_full_name);
        this.A02 = AbstractC166997dE.A0T(view, R.id.uhl_account_username);
    }
}
