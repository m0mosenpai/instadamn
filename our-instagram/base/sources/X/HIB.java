package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes7.dex */
public final class HIB extends AbstractC66412zI {
    public final ID8 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C39089HIn c39089HIn = (C39089HIn) interfaceC66482zP;
        C38396GuX c38396GuX = (C38396GuX) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c39089HIn, c38396GuX);
        ID8 id8 = this.A00;
        int i = c39089HIn.A00;
        C14360o3.A0B(id8, A1a ? 1 : 0);
        IgTextView igTextView = c38396GuX.A00;
        if (igTextView != null) {
            Context context = igTextView.getContext();
            String A0p = AbstractC166997dE.A0p(context, 2131952335);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(context, A0p, i));
            AnonymousClass773.A05(A0H, new C39404Hao(id8, AbstractC31174DnI.A02(context), A1a ? 1 : 0), A0p);
            AbstractC31176DnK.A1G(igTextView, A0H);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39089HIn.class;
    }

    public HIB(ID8 id8) {
        this.A00 = id8;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.GuX] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        IgTextView igTextView;
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.shop_management_learn_more, false);
        ?? c3oo = new C3OO(A0R);
        if (A0R instanceof IgTextView) {
            igTextView = (IgTextView) A0R;
        } else {
            igTextView = null;
        }
        c3oo.A00 = igTextView;
        return c3oo;
    }
}
