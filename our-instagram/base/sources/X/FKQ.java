package X;

import android.view.View;
import android.widget.EditText;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FKQ {
    public final View A00;
    public final View A01;
    public final EditText A02;

    public FKQ(View view) {
        this.A00 = view.requireViewById(R.id.direct_private_share_message_view);
        this.A01 = view.requireViewById(R.id.sharesheet_write_message_header);
        EditText A0H = AbstractC31173DnH.A0H(view, R.id.direct_private_share_message_box);
        this.A02 = A0H;
        A0H.setHint(view.getContext().getString(2131960653));
        A0H.setTextSize(0, view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
    }
}
