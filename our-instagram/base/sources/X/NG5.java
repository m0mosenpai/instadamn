package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NG5 extends AbstractViewOnClickListenerC13340mK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NG5(C24042Ale c24042Ale, C56099OvJ c56099OvJ, int i) {
        super(1000L);
        this.A00 = i;
        this.A01 = c24042Ale;
        this.A02 = c56099OvJ;
    }

    @Override // X.AbstractViewOnClickListenerC13340mK
    public final void A00(View view) {
        int i;
        C24042Ale c24042Ale = (C24042Ale) this.A01;
        boolean z = ((C56099OvJ) this.A02).A01;
        UserSession userSession = c24042Ale.A02;
        if (C180377zR.A0B(userSession, z)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, userSession, 36328972283363232L);
            FragmentActivity fragmentActivity = c24042Ale.A00;
            C214959fX c214959fX = c24042Ale.A05;
            C82G c82g = C82G.A0u;
            EnumC72412Xd8 enumC72412Xd8 = EnumC72412Xd8.A0N;
            String A01 = enumC72412Xd8.A01();
            C195918ld c195918ld = c24042Ale.A06;
            OE3 oe3 = new OE3(fragmentActivity, c82g, c214959fX, userSession, c195918ld, A01);
            if (A06) {
                NVk.A03.A02(fragmentActivity, c214959fX, c82g, C82H.A0Q, userSession, oe3, PGD.A00, null, null, "", "", false);
                return;
            }
            String A012 = enumC72412Xd8.A01();
            C9GQ c9gq = new C9GQ(c214959fX, 2);
            C14360o3.A0B(A012, 4);
            C193328hC A0O = AbstractC31175DnJ.A0O(c214959fX);
            A0O.A0A(2131962071);
            A0O.A0s(true);
            A0O.A0t(true);
            long A013 = C18U.A01(c06090Tz, userSession, 36610447259998289L);
            if (A013 == 1) {
                i = 2131952267;
            } else {
                i = 2131956794;
                if (A013 == 2) {
                    i = 2131973758;
                }
            }
            A0O.A0J(new LMO(fragmentActivity, c82g, c214959fX, userSession, c195918ld, c9gq, A012, 0), i);
            A0O.A0D(DialogInterfaceOnClickListenerC55321Ogj.A00(c82g, userSession, 52));
            int i2 = 2131962026;
            if (AnonymousClass252.A00(userSession).A01) {
                i2 = 2131962027;
            }
            A0O.A09(i2);
            AbstractC166987dD.A1W(A0O);
            OSV.A00(c82g, EnumC201098ur.VIEW, userSession);
            return;
        }
        C214959fX c214959fX2 = c24042Ale.A05;
        Integer num = C05F.A0C;
        boolean A00 = C196008lp.A00(userSession);
        C195918ld c195918ld2 = c24042Ale.A06;
        new C55626OnB(C82G.A0u, c214959fX2, userSession, null, c24042Ale, num, A00, c195918ld2.A06()).A01();
        c195918ld2.A03 = C196008lp.A00(userSession);
        C24042Ale.A00(EnumC201098ur.VIEW, c24042Ale);
    }
}
