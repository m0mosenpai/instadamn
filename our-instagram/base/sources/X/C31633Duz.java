package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Duz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31633Duz extends AbstractC66412zI {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E1R(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.partnerships_inbox_header_row_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        SpannableStringBuilder A00;
        C31610Duc c31610Duc = (C31610Duc) interfaceC66482zP;
        E1R e1r = (E1R) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c31610Duc, e1r);
        boolean z = c31610Duc.A01;
        IgTextView igTextView = e1r.A00;
        if (z) {
            Context context = igTextView.getContext();
            String A0p = AbstractC166997dE.A0p(context, 2131976869);
            A00 = AbstractC31178DnM.A07(context, A0p, 2131957208);
            AnonymousClass773.A05(A00, new C50764MbV(2, context, this), A0p);
        } else {
            Context context2 = igTextView.getContext();
            Spanned fromHtml = Html.fromHtml(context2.getResources().getString(2131957205));
            C14360o3.A07(fromHtml);
            C85383rT c85383rT = new C85383rT(AbstractC25225BEi.A0H(fromHtml), this.A00);
            c85383rT.A0B = c31610Duc.A00;
            c85383rT.A0b = A1a;
            c85383rT.A04 = AbstractC31174DnI.A02(context2);
            A00 = c85383rT.A00();
        }
        AbstractC31176DnK.A1G(igTextView, A00);
    }

    public C31633Duz(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31610Duc.class;
    }
}
