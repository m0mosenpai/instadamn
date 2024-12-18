package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EXH extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final FFL A01;

    public EXH(InterfaceC11380iw interfaceC11380iw, FFL ffl) {
        C14360o3.A0B(ffl, 2);
        this.A00 = interfaceC11380iw;
        this.A01 = ffl;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E2J(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_row_item, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32096E8u c32096E8u = (C32096E8u) interfaceC66482zP;
        E2J e2j = (E2J) c3oo;
        AbstractC167007dF.A1K(c32096E8u, e2j);
        e2j.A01.setText(c32096E8u.A04);
        TextView textView = e2j.A00;
        Context A0L = AbstractC166997dE.A0L(textView);
        String str = c32096E8u.A02;
        String str2 = c32096E8u.A00;
        String str3 = str;
        if (c32096E8u.A05) {
            int A08 = AbstractC001900j.A08(str, str2, 0, false);
            str3 = str;
            if (A08 != -1) {
                boolean A02 = AbstractC13620mo.A02(A0L);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
                if (!A02) {
                    A08 += AbstractC167007dF.A0A(str2);
                }
                C85963sQ.A04(A0L, A0H, A08);
                str3 = A0H;
            }
        }
        textView.setText(str3);
        e2j.A02.setUrl(AbstractC25225BEi.A0t(c32096E8u.A01), this.A00);
        ViewOnClickListenerC35683FpI.A00(e2j.itemView, 58, c32096E8u, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32096E8u.class;
    }
}
