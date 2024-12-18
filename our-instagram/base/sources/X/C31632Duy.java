package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.Duy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31632Duy extends AbstractC66412zI {
    public final Context A00;
    public final C31620Dum A01;
    public final UserSession A02;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.E0u] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_empty_inbox_header, false);
        C14360o3.A0B(A0D, A1R ? 1 : 0);
        ?? c3oo = new C3OO(A0D);
        c3oo.A00 = AbstractC31175DnJ.A0L(A0D, R.id.title_text);
        c3oo.A01 = (IgView) AbstractC166987dD.A0c(A0D, R.id.divider);
        return c3oo;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31914E0u c31914E0u = (C31914E0u) c3oo;
        C14360o3.A0B(c31914E0u, 1);
        IgTextView igTextView = c31914E0u.A00;
        igTextView.setVisibility(0);
        c31914E0u.A01.setVisibility(8);
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131959592);
        String A0p2 = AbstractC166997dE.A0p(context, 2131959591);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AnonymousClass001.A0T(A0p, A0p2, ' '));
        AnonymousClass773.A05(A0H, new C33252Elm(this, AbstractC167007dF.A09(context, R.attr.igds_color_gradient_blue)), A0p2);
        AbstractC31176DnK.A1G(igTextView, A0H);
    }

    public C31632Duy(Context context, UserSession userSession, C31620Dum c31620Dum) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = c31620Dum;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32613EXn.class;
    }
}
