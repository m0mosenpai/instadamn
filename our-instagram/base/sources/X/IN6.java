package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class IN6 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;

    public final void A00(int i) {
        TextView textView = this.A02;
        if (textView != null) {
            textView.setVisibility(i);
        }
        View view = this.A00;
        if (view != null) {
            view.setVisibility(i);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            textView2.setVisibility(i);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            textView3.setVisibility(i);
        }
        TextView textView4 = this.A05;
        if (textView4 != null) {
            textView4.setVisibility(i);
        }
        View view2 = this.A01;
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    public final void A01(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View view, int i, int i2, int i3, int i4) {
        this.A01 = view.findViewById(R.id.tag_management_footer_action_bar);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.tagging_choice_button_left);
        this.A02 = A0T;
        A0T.setText(i);
        this.A02.setTextColor(i2);
        C0fQ.A00(onClickListener, this.A02);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.tagging_choice_button_right);
        this.A05 = A0T2;
        A0T2.setText(i3);
        this.A05.setTextColor(i4);
        C0fQ.A00(onClickListener2, this.A05);
    }
}
