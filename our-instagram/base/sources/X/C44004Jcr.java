package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jcr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44004Jcr extends AbstractC43790JYd {
    public final UserSession A00;
    public final MRG A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44114Jee(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_header_pill_layout, false), this.A00, this.A01);
    }

    public C44004Jcr(UserSession userSession, MRG mrg) {
        this.A00 = userSession;
        this.A01 = mrg;
    }
}
