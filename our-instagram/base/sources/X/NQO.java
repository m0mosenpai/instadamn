package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NQO extends AbstractC38513GwY {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    @Override // X.AbstractC38513GwY
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A02(C51761Mtk c51761Mtk) {
        C51u c51u;
        C14360o3.A0B(c51761Mtk, 0);
        int A0H = AbstractC166987dD.A0H(c51761Mtk.A02);
        String str = null;
        if (A0H != 0) {
            if (A0H == 1) {
                c51u = new C51u(2131968036, 2131968036, null);
            } else {
                throw B4Z.A00();
            }
        } else {
            c51u = new C51u(2131971540, 2131968029, 2131955188);
        }
        int A0H2 = AbstractC166987dD.A0H(c51u.A00);
        int A0H3 = AbstractC166987dD.A0H(c51u.A01);
        Number number = (Number) c51u.A02;
        TextView textView = this.A02;
        AbstractC31173DnH.A19(AbstractC37301Gc2.A03(this).getResources(), textView, A0H2);
        AbstractC31172DnG.A1E(AbstractC37301Gc2.A03(this).getResources(), textView, A0H3);
        AbstractC56932jR.A03(textView);
        TextView textView2 = this.A01;
        if (number != null) {
            str = AbstractC37301Gc2.A03(this).getResources().getString(number.intValue());
        }
        textView2.setText(str);
        C0fQ.A00((View.OnClickListener) c51761Mtk.A00, textView2);
        AbstractC56952jT.A01(textView2);
    }

    public NQO(View view) {
        super(view);
        this.A00 = view;
        this.A02 = AbstractC167007dF.A0N(view, R.id.header);
        this.A01 = AbstractC167007dF.A0N(view, R.id.action_text);
    }
}
