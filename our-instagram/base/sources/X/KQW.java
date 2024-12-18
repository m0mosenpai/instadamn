package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KQW extends AbstractC43790JYd {
    public final UserSession A00;
    public final MRG A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new KQX(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_linear_layout_pill_layout, false), this.A00, this.A01);
    }

    public KQW(UserSession userSession, MRG mrg) {
        this.A00 = userSession;
        this.A01 = mrg;
    }
}
