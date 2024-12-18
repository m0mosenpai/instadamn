package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fbh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35010Fbh {
    public E70 A00;
    public C35003Fba A01;
    public final int A02;
    public final Context A03;
    public final FragmentActivity A04;
    public final UserSession A05;
    public final ENA A06;
    public final java.util.Set A07;
    public final InterfaceC11380iw A08;

    public C35010Fbh(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ENA ena, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = fragmentActivity;
        this.A06 = ena;
        this.A08 = interfaceC11380iw;
        this.A02 = ((C35018Fbr) C31651DvH.A00(userSession, C35018Fbr.class, 7)).A01(EnumC31337Dq2.A05, 0, z);
        this.A07 = AbstractC31171DnF.A0l();
    }

    public static final void A00(C35010Fbh c35010Fbh) {
        E70 e70 = c35010Fbh.A00;
        C35003Fba c35003Fba = c35010Fbh.A01;
        if (e70 != null && c35003Fba != null) {
            AbstractC25651Mw.A00(c35010Fbh.A05).E4s(new C161037Jm(AbstractC1345466e.A06(e70.A0L), c35003Fba.A00));
        }
    }

    public final void A01() {
        E70 e70 = this.A00;
        if (e70 != null) {
            int size = this.A07.size();
            int size2 = AbstractC001800i.A0a(e70.A0T).size() + size;
            boolean z = true;
            boolean A1O = AbstractC167007dF.A1O(size);
            if (size2 <= this.A02 / 2) {
                z = false;
            }
            EQN eqn = this.A06.A04;
            if (eqn != null) {
                C33608EtK c33608EtK = eqn.A02;
                c33608EtK.A00 = A1O;
                c33608EtK.A02 = z;
                eqn.notifyDataSetChanged();
            }
        }
    }
}
