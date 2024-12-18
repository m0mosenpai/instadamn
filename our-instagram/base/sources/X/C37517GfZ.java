package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GfZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37517GfZ implements JH5 {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.JH5
    public final void EDZ(View view, C38321qM c38321qM, C75113Zb c75113Zb) {
        if (!c75113Zb.A2w) {
            c75113Zb.A2w = true;
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                C55101ObE c55101ObE = new C55101ObE(this.A01, AbstractC166997dE.A0L(view));
                String A0o = AbstractC25233BEq.A0o(c38321qM);
                UserSession userSession = c55101ObE.A07;
                InterfaceC11380iw interfaceC11380iw = c55101ObE.A05;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(1023));
                if (A0f.isSampled()) {
                    AbstractC25225BEi.A1M(EnumC39652Hih.A0k, A0f);
                    AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
                    Long l = null;
                    try {
                        l = AbstractC166997dE.A0j(A2u);
                    } catch (NumberFormatException unused) {
                    }
                    AbstractC37300Gc1.A0h(A0f, l);
                    AbstractC37300Gc1.A0k(A0f, C55101ObE.A00(A0o));
                    AbstractC25225BEi.A1N(A0f, c55101ObE.A08);
                    A0f.Cht();
                }
            }
        }
    }

    @Override // X.JH5
    public final void DWi(C38321qM c38321qM, C75113Zb c75113Zb) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C41717Idn.A00(activity, this.A01, c38321qM);
        }
    }

    public C37517GfZ(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
