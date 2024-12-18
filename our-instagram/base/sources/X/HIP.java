package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HIP extends AbstractC66412zI {
    public final C62862tP A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42296IoK c42296IoK = (C42296IoK) interfaceC66482zP;
        C38485Gw6 c38485Gw6 = (C38485Gw6) c3oo;
        AbstractC167017dG.A1N(c42296IoK, c38485Gw6);
        C1338462s c1338462s = (C1338462s) c42296IoK.A00.A01;
        if (c1338462s != null) {
            AbstractC37301Gc2.A0B(c38485Gw6.A00, c1338462s, c38485Gw6.A03).A07(c38485Gw6.A02);
            c38485Gw6.A01.setVisibility(0);
        } else {
            c38485Gw6.A01.setVisibility(8);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42296IoK.class;
    }

    public HIP(C62862tP c62862tP, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c62862tP;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        C62862tP c62862tP = this.A00;
        AbstractC167017dG.A1R(userSession, c62862tP);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.tagging_feed_bloks, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
        return new C38485Gw6((FrameLayout) inflate, c62862tP, userSession);
    }
}
