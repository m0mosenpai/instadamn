package X;

import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Dsn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31503Dsn extends C1P1 {
    public final /* synthetic */ C1570473j A00;
    public final /* synthetic */ C156086zc A01;

    public C31503Dsn(C1570473j c1570473j, C156086zc c156086zc) {
        this.A01 = c156086zc;
        this.A00 = c1570473j;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1338579231);
        C1570473j c1570473j = this.A00;
        c1570473j.A0E("fetch_request_fail");
        ((MTJ) c1570473j).A00.A01();
        this.A01.A03.A0L(EnumC155676yw.A02);
        C0f9.A0A(972535898, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(324766668);
        this.A01.A03.A0L(EnumC155676yw.A03);
        C0f9.A0A(1720118751, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        EnumC155676yw enumC155676yw;
        int i;
        int A03 = C0f9.A03(-1686941525);
        C168027ex c168027ex = (C168027ex) obj;
        int A0N = AbstractC167017dG.A0N(c168027ex, -1390244393);
        C1570473j c1570473j = this.A00;
        c1570473j.A0E("fetch_request_end");
        ((MTJ) c1570473j).A00.A05();
        C156086zc c156086zc = this.A01;
        boolean A06 = C18U.A06(C06090Tz.A05, c156086zc.A01, 36329131197218844L);
        UserDetailTabController userDetailTabController = c156086zc.A03;
        User user = userDetailTabController.A0O.A0J;
        if (A06) {
            if (user == null) {
                i = 420304775;
                C0f9.A0A(i, A0N);
                C0f9.A0A(-1489985922, A03);
            }
        } else if (user == null) {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0A(-1556772266, A0N);
            throw A0g;
        }
        InterfaceC72043Lc interfaceC72043Lc = c168027ex.A00;
        Boolean AeE = ((InterfaceC168297fO) interfaceC72043Lc.F7f()).AeE();
        Boolean BBJ = ((InterfaceC168297fO) interfaceC72043Lc.F7f()).BBJ();
        if (AeE != null) {
            user.A03.EQ5(AeE);
        }
        if (BBJ != null) {
            user.A03.EVI(BBJ);
        }
        List items = c168027ex.getItems();
        if (!items.isEmpty()) {
            user.A0t(items);
            c156086zc.A02.A0r();
            enumC155676yw = EnumC155676yw.A04;
        } else {
            enumC155676yw = EnumC155676yw.A02;
        }
        userDetailTabController.A0L(enumC155676yw);
        i = -613213600;
        C0f9.A0A(i, A0N);
        C0f9.A0A(-1489985922, A03);
    }
}
