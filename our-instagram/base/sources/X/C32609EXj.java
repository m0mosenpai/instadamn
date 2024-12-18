package X;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EXj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32609EXj extends AbstractC66412zI {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36192Fy6 c36192Fy6 = (C36192Fy6) interfaceC66482zP;
        E1G e1g = (E1G) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c36192Fy6, e1g);
        UserSession userSession = this.A00;
        int i = c36192Fy6.A00;
        InterfaceC37124GXj interfaceC37124GXj = c36192Fy6.A01;
        IgTextView igTextView = e1g.A00;
        Context context = igTextView.getContext();
        if (userSession != null && interfaceC37124GXj != null) {
            Spanned fromHtml = Html.fromHtml(context.getResources().getString(i));
            C14360o3.A07(fromHtml);
            C85383rT c85383rT = new C85383rT(AbstractC25225BEi.A0H(fromHtml), userSession);
            c85383rT.A0B = interfaceC37124GXj;
            c85383rT.A0b = A1R;
            c85383rT.A04 = AbstractC31174DnI.A02(context);
            AbstractC31176DnK.A1G(igTextView, c85383rT.A00());
        } else {
            AbstractC166987dD.A1P(context, igTextView, i);
        }
        igTextView.setPadding(44, 0, 44, 0);
        AbstractC31177DnL.A0y(igTextView, context);
    }

    public C32609EXj(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E1G(new IgTextView(AbstractC31176DnK.A04(viewGroup)));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36192Fy6.class;
    }

    public C32609EXj() {
        this(null);
    }
}
