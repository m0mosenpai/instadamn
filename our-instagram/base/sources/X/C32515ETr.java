package X;

import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;

/* renamed from: X.ETr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32515ETr extends C1P1 {
    public final /* synthetic */ C1570473j A00;
    public final /* synthetic */ AnonymousClass740 A01;

    public C32515ETr(C1570473j c1570473j, AnonymousClass740 anonymousClass740) {
        this.A01 = anonymousClass740;
        this.A00 = c1570473j;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1527111376);
        AnonymousClass740 anonymousClass740 = this.A01;
        AnonymousClass740.A01(anonymousClass740, 16919810);
        C1570473j c1570473j = this.A00;
        c1570473j.A0E("fetch_request_fail");
        ((MTJ) c1570473j).A00.A01();
        anonymousClass740.A08.A0L(EnumC155676yw.A02);
        C0f9.A0A(1084435617, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1092335292);
        this.A01.A08.A0L(EnumC155676yw.A03);
        C0f9.A0A(-2141398808, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(480300233);
        C168027ex c168027ex = (C168027ex) obj;
        int A0N = AbstractC167017dG.A0N(c168027ex, 1428634583);
        AnonymousClass740 anonymousClass740 = this.A01;
        AnonymousClass740.A01(anonymousClass740, 16919918);
        C1570473j c1570473j = this.A00;
        c1570473j.A0E("fetch_request_end");
        ((MTJ) c1570473j).A00.A05();
        UserDetailTabController userDetailTabController = anonymousClass740.A08;
        User user = userDetailTabController.A0O.A0J;
        if (user != null) {
            Boolean Cbc = c168027ex.F7f().Cbc();
            boolean A1b = AbstractC31172DnG.A1b(Cbc);
            user.A03.EVe(Cbc);
            if (A1b) {
                user.A03.EcC(c168027ex.getItems());
            } else {
                user.A0t(c168027ex.getItems());
                user.A03.ERK(c168027ex.F7f().Ams());
            }
            anonymousClass740.A07.A0r();
            userDetailTabController.A0L(EnumC155676yw.A04);
            C0f9.A0A(-33740739, A0N);
            C0f9.A0A(-1121011953, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(920605892, A0N);
        throw A0g;
    }
}
