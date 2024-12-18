package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Goj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38056Goj extends AbstractC66412zI {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A01;
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        UserSession userSession = this.A00;
        if (AbstractC25225BEi.A07(AbstractC25225BEi.A0j(userSession, 0), userSession, 36609807310198752L) > 0) {
            A01 = C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.layout_listview_empty_state, 0, false, A1R);
        } else {
            A01 = AbstractC153236ur.A01(layoutInflater, viewGroup);
        }
        return new C153276uw(A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44080Je5 c44080Je5 = (C44080Je5) interfaceC66482zP;
        C153276uw c153276uw = (C153276uw) c3oo;
        AbstractC167017dG.A1N(c44080Je5, c153276uw);
        AbstractC153236ur.A02(c44080Je5.A02, c153276uw, c44080Je5.A03);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C44080Je5.class;
    }

    public C38056Goj(UserSession userSession) {
        this.A00 = userSession;
    }
}
