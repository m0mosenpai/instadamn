package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EXT extends AbstractC66412zI {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C31969E2x(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.user_pay_earnings_header, false));
    }

    public EXT(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = EO9.__redex_internal_original_name;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36196FyA c36196FyA = (C36196FyA) interfaceC66482zP;
        C31969E2x c31969E2x = (C31969E2x) c3oo;
        AbstractC167007dF.A1K(c36196FyA, c31969E2x);
        Context A05 = AbstractC31172DnG.A05(c31969E2x);
        c31969E2x.A03.setText(c36196FyA.A01);
        c31969E2x.A01.setText(2131976487);
        c31969E2x.A00.setText(c36196FyA.A00);
        UserSession userSession = this.A01;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36312960645858884L)) {
            String A0p = AbstractC166997dE.A0p(A05, 2131976491);
            FragmentActivity fragmentActivity = this.A00;
            String str = this.A02;
            FW0.A00(c31969E2x.A02, fragmentActivity, userSession, C2Fb.A2l, str, AbstractC31177DnL.A0b(A05, A0p, 2131976490), A0p, "https://help.instagram.com/907314980182940", null);
            return;
        }
        AbstractC31177DnL.A0r(A05, c31969E2x.A02, "", 2131976490);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36196FyA.class;
    }
}
