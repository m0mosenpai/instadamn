package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.HYi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39317HYi extends AbstractC39063HHn {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.cta_section, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38423Guy(A0D)), "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.cta.GenericCTASectionViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42316Ioe.class;
    }

    public C39317HYi(UserSession userSession, C41622IbC c41622IbC) {
        super(c41622IbC);
        this.A00 = userSession;
    }
}
