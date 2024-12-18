package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class EYP extends AbstractC66422zJ {
    public final Context A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C31942E1w(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.fan_club_consideration_more_teaser_view, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31942E1w c31942E1w = (C31942E1w) c3oo;
        C14360o3.A0B(c31942E1w, 1);
        IgTextView igTextView = c31942E1w.A00;
        Context context = this.A00;
        AbstractC166987dD.A1P(context, igTextView, 2131962102);
        AbstractC166997dE.A19(context, c31942E1w.A01, R.drawable.ig_illustrations_qp_crown_badge_refresh);
    }

    public EYP(Context context) {
        this.A00 = context;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36176Fxq.class;
    }
}
