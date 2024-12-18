package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.selectableview.SingleSelectableAvatar;

/* loaded from: classes6.dex */
public final class FN5 {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final SingleSelectableAvatar A04;

    public FN5(View view) {
        this.A00 = AbstractC31173DnH.A0F(view, R.id.row_user_container);
        this.A03 = AbstractC166997dE.A0T(view, R.id.row_user_username);
        this.A02 = AbstractC166997dE.A0T(view, R.id.row_user_info);
        this.A04 = (SingleSelectableAvatar) view.requireViewById(R.id.row_single_user_imageview);
        this.A01 = (CheckBox) view.requireViewById(R.id.row_user_checkbox);
    }
}
