package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EYb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32627EYb extends AbstractC66422zJ {
    public final Context A00;
    public final UserSession A01;

    public C32627EYb(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.channel_education_dropdown_headline, viewGroup, false);
        List list = E46.A0A;
        UserSession userSession = this.A01;
        Context context = this.A00;
        C14360o3.A0A(inflate);
        return new E46(context, inflate, userSession);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36183Fxx c36183Fxx = (C36183Fxx) interfaceC66482zP;
        E46 e46 = (E46) c3oo;
        AbstractC167007dF.A1K(c36183Fxx, e46);
        e46.A09.setImageResource(R.drawable.instagram_illustrations_product_illustration_pi_plus_what_are_channels);
        IgTextView igTextView = e46.A07;
        Context context = e46.A00;
        AbstractC166987dD.A1P(context, igTextView, 2131955063);
        AbstractC166987dD.A1P(context, e46.A05, 2131955040);
        AbstractC166987dD.A1P(context, e46.A06, 2131955041);
        List list = c36183Fxx.A00;
        Iterator A0q = AbstractC31180DnO.A0q(E46.A0A, list);
        int i = 0;
        while (A0q.hasNext()) {
            Object next = A0q.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            int A0H = AbstractC166987dD.A0H(next);
            C32073E6z c32073E6z = (C32073E6z) list.get(i);
            InterfaceC56392iX A0U = AbstractC31173DnH.A0U(e46.A03, A0H);
            AbstractC166997dE.A19(context, AbstractC31173DnH.A0I(A0U.getView(), R.id.icon), c32073E6z.A01);
            AbstractC166987dD.A1P(C02G.A01(context), AbstractC31180DnO.A06(A0U.getView()), c32073E6z.A02);
            TextView A0N = AbstractC167007dF.A0N(A0U.getView(), R.id.description);
            A0N.setVisibility(8);
            Number number = (Number) c32073E6z.A03;
            if (number != null) {
                int intValue = number.intValue();
                if (c32073E6z.A04 != null) {
                    Number number2 = (Number) c32073E6z.A04;
                    if (number2 != null) {
                        String A0p = AbstractC166997dE.A0p(context, number2.intValue());
                        String A0b = AbstractC31177DnL.A0b(context, A0p, intValue);
                        AbstractC25227BEk.A11(A0N);
                        int A02 = AbstractC31174DnI.A02(context);
                        AnonymousClass773.A07(new EPT(new C012804r(16, A0p), c32073E6z, e46, C05F.A01, A0p, A02), A0N, A0p, A0b);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    AbstractC166987dD.A1P(C02G.A01(context), A0N, intValue);
                }
                A0N.setVisibility(0);
            }
            i = i2;
        }
        e46.A02.setVisibility(8);
        ViewOnClickListenerC35681FpG.A01(e46.A01, 18, e46);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36183Fxx.class;
    }
}
