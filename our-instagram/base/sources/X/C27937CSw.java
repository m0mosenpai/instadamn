package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.CSw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27937CSw {
    public final View A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final IgdsButton A05;
    public final FrameLayout A06;

    public C27937CSw(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A06 = (FrameLayout) AbstractC166997dE.A0R(view, R.id.avatar_container);
        this.A04 = (CircularImageView) AbstractC166997dE.A0R(view, R.id.row_invite_user_imageview);
        this.A01 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.row_invite_user_info_container);
        this.A02 = AbstractC167007dF.A0N(view, R.id.row_invite_contact_name);
        this.A03 = AbstractC167007dF.A0N(view, R.id.row_invite_contact_phone_number);
        this.A05 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.row_invite_contact_invite_button);
    }
}
