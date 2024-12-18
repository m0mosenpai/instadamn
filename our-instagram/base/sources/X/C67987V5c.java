package X;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.V5c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67987V5c extends AbstractC66422zJ {
    public final String A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C66469UIt(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_header, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C66637URb c66637URb = (C66637URb) interfaceC66482zP;
        C66469UIt c66469UIt = (C66469UIt) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c66637URb, c66469UIt);
        String str = this.A00;
        C51760Mtj c51760Mtj = c66637URb.A00;
        Number number = (Number) c51760Mtj.A00;
        ImageView imageView = c66469UIt.A00;
        if (number == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(number.intValue());
        }
        TextView textView = c66469UIt.A02;
        CharSequence A00 = BHX.A00(AbstractC166997dE.A0L(textView), (C5QE) c51760Mtj.A02);
        if (A00.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(A00);
        }
        TextView textView2 = c66469UIt.A01;
        Context A0L = AbstractC166997dE.A0L(textView2);
        CharSequence A002 = BHX.A00(A0L, (C5QE) c51760Mtj.A01);
        if (A002.length() == 0) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        if (C14360o3.A0K(str, "activity_feed_notification_3PD_content")) {
            AnonymousClass773.A07(new VB7(c66637URb, A0L.getColor(AbstractC53242c7.A0C(A0L)), A1R ? 1 : 0), textView2, AbstractC166997dE.A0p(A0L, 2131952207), A002.toString());
        } else {
            Html.escapeHtml(new String[]{""}[0]);
            String obj = A002.toString();
            if (obj == null) {
                obj = "";
            }
            textView2.setText(Html.fromHtml(obj));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C66637URb.class;
    }

    public C67987V5c(String str) {
        this.A00 = str;
    }
}
