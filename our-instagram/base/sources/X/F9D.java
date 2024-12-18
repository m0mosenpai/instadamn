package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public abstract class F9D {
    public static final View A00(ViewGroup viewGroup) {
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        View inflate = LayoutInflater.from(A06).inflate(R.layout.spinner_dropdown_numeric_row, viewGroup, false);
        C14360o3.A0A(A06);
        CircularImageView circularImageView = (CircularImageView) AbstractC166997dE.A0S(inflate, R.id.row_user_imageview);
        inflate.setTag(new FOD(A06, inflate, (ImageView) AbstractC166997dE.A0S(inflate, R.id.check), (TextView) AbstractC166997dE.A0S(inflate, R.id.row_user_textview), (TextView) AbstractC166997dE.A0S(inflate, R.id.row_user_categorized_notification_textview), (TextView) AbstractC166997dE.A0S(inflate, R.id.notification_count_avatar), circularImageView, (IgdsButton) AbstractC166997dE.A0S(inflate, R.id.login_button)));
        return inflate;
    }
}
