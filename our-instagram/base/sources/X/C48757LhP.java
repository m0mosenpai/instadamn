package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.LhP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48757LhP implements InterfaceC50465MPt {
    public final FragmentActivity A00;
    public final EnumC152186t3 A01;
    public final C48759LhR A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC50492MQu A05;
    public final C47364KwD A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public C48757LhP(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC50492MQu interfaceC50492MQu, Integer num) {
        EnumC152186t3 enumC152186t3;
        C14360o3.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = interfaceC50492MQu;
        if (num.intValue() != 0) {
            enumC152186t3 = EnumC152186t3.FRIEND_MAP_FLOATY_GRID;
        } else {
            enumC152186t3 = EnumC152186t3.FRIEND_MAP;
        }
        this.A01 = enumC152186t3;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A07 = MHM.A00(this, enumC09460dv, 0);
        this.A09 = MHM.A00(this, enumC09460dv, 2);
        this.A08 = MHM.A00(this, enumC09460dv, 1);
        this.A02 = new C48759LhR(this, 1);
        this.A06 = new C47364KwD(this);
    }

    @Override // X.InterfaceC50465MPt
    public final void DW0(L5X l5x) {
        C14360o3.A0B(l5x, 0);
        C45216Jzw c45216Jzw = l5x.A05;
        if (c45216Jzw == null) {
            C6C9 c6c9 = l5x.A03;
            if (c6c9 != null) {
                c45216Jzw = JY1.A00.A08(this.A00, c6c9);
            } else {
                return;
            }
        }
        User user = c45216Jzw.A02;
        String id = user.getId();
        UserSession userSession = this.A04;
        if (!AbstractC31171DnF.A1W(userSession, id)) {
            FragmentActivity fragmentActivity = this.A00;
            C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 2342164731595335436L)) {
                String A0c = AbstractC31178DnM.A0c(c50674MYs.A00, user, 2131976084);
                C14360o3.A07(A0c);
                c50674MYs.A09(A0c, new ViewOnClickListenerC48066LPr(62, c45216Jzw, this));
            }
            if (C18U.A06(c06090Tz, userSession, 2342164731595400973L)) {
                String A0c2 = AbstractC31178DnM.A0c(c50674MYs.A00, user, 2131962883);
                C14360o3.A07(A0c2);
                c50674MYs.A09(A0c2, new FpQ(37, this, c45216Jzw));
            }
            c50674MYs.A01(new ViewOnClickListenerC48066LPr(63, c45216Jzw, this), 2131954100);
            c50674MYs.A03(new ViewOnClickListenerC48066LPr(64, c45216Jzw, this), 2131954093);
            c50674MYs.A03(new ViewOnClickListenerC48066LPr(65, c45216Jzw, this), 2131976876);
            c50674MYs.A03 = new C49478Ltr(this, 0);
            C31727DwY.A00(fragmentActivity, c50674MYs);
        }
    }

    @Override // X.InterfaceC50465MPt
    public final void DW3(L5X l5x) {
        C14360o3.A0B(l5x, 0);
        C6C9 c6c9 = l5x.A03;
        if (c6c9 != null) {
            UserSession userSession = this.A04;
            C4F5 A00 = LLE.A00(c6c9, userSession);
            C135976Dc A01 = AbstractC135966Db.A01(userSession);
            A01.A0N(A00);
            A01.A0L(this.A01, A00);
            A01.A0D(EnumC46303KeZ.A0b);
            if (AbstractC31171DnF.A1W(userSession, A00.A0A.getId())) {
                ((C48756LhO) this.A09.getValue()).DW3(l5x);
                return;
            } else {
                ((C48754LhM) this.A08.getValue()).DW3(l5x);
                return;
            }
        }
        C135976Dc A012 = AbstractC135966Db.A01(this.A04);
        A012.A01 = new C152706ty(null, EnumC152696tw.POG, null, null, null, null, A012.A06.userId, null, null, null, AbstractC166987dD.A1J(JZA.FRIEND_MAP_NOTE), 0, false);
        ((C48751LhJ) this.A07.getValue()).DW3(l5x);
    }

    public static final void A00(C48757LhP c48757LhP) {
        AbstractC92954Eo.A00(c48757LhP.A04).A09(null, null, C106854rm.A00, true, false);
    }
}
