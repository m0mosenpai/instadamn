package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes6.dex */
public final class FL4 {
    public final TextView A00;
    public final CircularImageView A01;
    public final IgdsSwitch A02;

    public FL4(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        this.A01 = AbstractC31176DnK.A0U(viewGroup, R.id.row_user_avatar);
        this.A00 = AbstractC167007dF.A0N(viewGroup, R.id.row_username_textview);
        this.A02 = (IgdsSwitch) AbstractC166997dE.A0R(viewGroup, R.id.featured_account_switch);
    }
}
