package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class L8E {
    public boolean A00;
    public Integer A01;
    public final int A02;
    public final View A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final Context A09;
    public final TextView A0A;
    public final TextView A0B;
    public final C97574Zs A0C;
    public final Integer A0D;

    public L8E(View view, InterfaceC101384gv interfaceC101384gv, C97574Zs c97574Zs, Integer num, Integer num2, int i, int i2) {
        C14360o3.A0B(view, 1);
        this.A03 = view;
        this.A02 = i;
        this.A0C = c97574Zs;
        this.A0D = num;
        this.A01 = num2;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A09 = A0L;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.poll_v2_sticker_answer_text);
        this.A0A = A0N;
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.poll_v2_sticker_answer_text_white);
        this.A0B = A0N2;
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.poll_v2_sticker_result_percentage);
        this.A07 = A0N3;
        TextView A0N4 = AbstractC167007dF.A0N(view, R.id.poll_v2_sticker_result_percentage_white);
        this.A08 = A0N4;
        TextView A0N5 = AbstractC167007dF.A0N(view, R.id.poll_v2_sticker_result_percentage_sign);
        this.A05 = A0N5;
        TextView A0N6 = AbstractC167007dF.A0N(view, R.id.poll_v2_sticker_result_percentage_sign_white);
        this.A06 = A0N6;
        LinearLayout linearLayout = (LinearLayout) AbstractC166997dE.A0R(view, R.id.white_text_layout);
        this.A04 = linearLayout;
        int color = A0L.getColor(R.color.poll_v2_sticker_option_text);
        int color2 = A0L.getColor(R.color.poll_v2_sticker_option_text_white);
        A0N.setText(interfaceC101384gv.getText());
        A0N.setTextColor(color);
        A0N2.setText(interfaceC101384gv.getText());
        A0N2.setTextColor(color2);
        A0N3.setTextColor(color);
        A0N4.setTextColor(color2);
        A0N5.setTextColor(color);
        A0N6.setTextColor(color2);
        C6QV.A00(A0N3);
        C6QV.A00(A0N4);
        C6QV.A00(A0N5);
        C6QV.A00(A0N6);
        AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, linearLayout.getBackground().mutate(), A0L.getColor(i2));
        Integer num3 = this.A01;
        if (num3 == null) {
            num3 = AbstractC25227BEk.A0p();
            this.A01 = num3;
        }
        AbstractC13880nE.A0q(this.A03, new RunnableC49968M4j(this, num3.intValue()));
        float f = num == null ? 0.0f : 1.0f;
        A0N3.setAlpha(f);
        A0N4.setAlpha(f);
        A0N5.setAlpha(f);
        A0N6.setAlpha(f);
        if (c97574Zs != null) {
            C0fQ.A00(new LOz(1, this, c97574Zs), this.A03);
        }
        this.A00 = true;
    }

    public final void A00(int i, Runnable runnable) {
        TextView textView = this.A07;
        Integer valueOf = Integer.valueOf(i);
        textView.setText(AbstractC13670mt.A06("%d", valueOf));
        TextView textView2 = this.A08;
        textView2.setText(AbstractC13670mt.A06("%d", valueOf));
        TextView textView3 = this.A05;
        textView3.setText(AbstractC13670mt.A06("%%", new Object[0]));
        TextView textView4 = this.A06;
        textView4.setText(AbstractC13670mt.A06("%%", new Object[0]));
        if (this.A0D == null) {
            textView2.animate().setDuration(350L).alpha(1.0f);
            textView4.animate().setDuration(350L).alpha(1.0f);
            textView.animate().setDuration(350L).alpha(1.0f);
            textView3.animate().setDuration(350L).alpha(1.0f);
            AbstractC13880nE.A0q(this.A03, new M63(this, runnable, i));
        }
        this.A00 = false;
    }
}
