package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes8.dex */
public final class LIW {
    public final ViewGroup A00;

    public static final void A00(View.OnClickListener onClickListener, LIW liw, String str, int i, int i2) {
        ViewGroup viewGroup = liw.A00;
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(viewGroup, i);
        igdsButton.setText(str);
        C0fQ.A00(onClickListener, igdsButton);
        igdsButton.setVisibility(0);
        AbstractC31173DnH.A0W(viewGroup, i).setTextColor(i2);
    }

    public static final void A01(LIW liw, int i) {
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(liw.A00, i);
        igdsButton.setText("");
        igdsButton.setOnClickListener(null);
        igdsButton.setVisibility(8);
    }

    public LIW(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public final void A02(String str, View.OnClickListener onClickListener) {
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(this.A00, R.id.permissions_choice_button_right);
        igdsButton.setText(str);
        C0fQ.A00(onClickListener, igdsButton);
        igdsButton.setVisibility(0);
    }
}
