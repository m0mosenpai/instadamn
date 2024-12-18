package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FQU {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final EVN A06;

    public final void A00(boolean z) {
        View view;
        CharSequence text;
        View view2 = this.A00;
        int i = 8;
        view2.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        Context context = view2.getContext();
        int A0H = AbstractC53242c7.A0H(context, R.attr.textColorSelected);
        int A09 = AbstractC53242c7.A09(context);
        TextView textView = this.A04;
        Context context2 = textView.getContext();
        int i2 = A09;
        if (z) {
            i2 = A0H;
        }
        AbstractC166987dD.A1O(context2, textView, i2);
        View view3 = this.A02;
        if (!z) {
            A0H = A09;
        }
        view3.setBackgroundResource(A0H);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        layoutParams.getClass();
        int i3 = 2;
        if (z) {
            i3 = 4;
        }
        layoutParams.height = i3;
        view3.requestLayout();
        View view4 = this.A01;
        if (z) {
            i = 0;
        }
        view4.setVisibility(i);
        if (z) {
            AbstractC35259Fgt.A06(this.A05);
            this.A06.A02();
            view = this.A03;
            view.setClickable(false);
            view.setFocusable(true);
            text = AbstractC166997dE.A0r(view.getResources(), textView.getText(), 2131975101);
        } else {
            view = this.A03;
            view.setClickable(true);
            text = textView.getText();
        }
        view.setContentDescription(text);
    }

    public FQU(View view, View view2, View view3, View view4, TextView textView, TextView textView2, EVN evn) {
        this.A00 = view;
        this.A02 = view2;
        this.A01 = view3;
        this.A05 = textView;
        this.A04 = textView2;
        this.A03 = view4;
        this.A06 = evn;
    }
}
