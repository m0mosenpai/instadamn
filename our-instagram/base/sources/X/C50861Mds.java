package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.user.userlist.data.LikesListRepository;

/* renamed from: X.Mds, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50861Mds extends C193578hc {
    public final C51757Mtg A00;
    public final UserSession A01;
    public final LikesListRepository A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final InterfaceC19390xP A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50861Mds(Application application, C51757Mtg c51757Mtg, UserSession userSession, LikesListRepository likesListRepository) {
        super(application);
        AbstractC25233BEq.A0v(1, application, userSession, c51757Mtg);
        this.A01 = userSession;
        this.A00 = c51757Mtg;
        this.A02 = likesListRepository;
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A04 = A1H;
        C008002u A0u = MSY.A0u(0);
        this.A03 = A0u;
        PVJ pvj = new PVJ(8, application, this, likesListRepository.A01);
        this.A06 = pvj;
        C15230pd A00 = C10Q.A00(new C57185PaM(this, null, 6), A1H, pvj, A0u);
        this.A05 = AbstractC208910l.A01(new C26047Bfa(null, null, null, null, null, "", null, null, 0, true, false, false), AbstractC141776au.A00(this), A00, C10I.A01);
    }

    public final int A0E(Integer num) {
        C51757Mtg c51757Mtg = this.A00;
        InterfaceC38371qR A04 = c51757Mtg.A04();
        if (A04 != null) {
            C38321qM BQN = A04.BQN();
            boolean z = true;
            if (BQN != null) {
                if (!BQN.A4a()) {
                    z = false;
                }
                if ((BQN.A5b() || BQN.A5Z()) && C77153d1.A03(this.A01, BQN, num)) {
                    return 2131965124;
                }
                if (BQN.A0C.CFm() != null) {
                    UserSession userSession = this.A01;
                    if (BO2.A02(userSession, BQN)) {
                        if (z) {
                            return 2131976906;
                        }
                        if (!C18U.A06(C06090Tz.A05, userSession, 36320820435493801L)) {
                            return 2131969691;
                        }
                        return 2131969689;
                    }
                    if (!z) {
                        if (((QIv) c51757Mtg.A00).A01) {
                            return 2131969688;
                        }
                        if (!BQN.A5P() && C77153d1.A02(userSession, BQN)) {
                            return 2131976905;
                        }
                        return 2131965123;
                    }
                    return 2131976905;
                }
                return 2131965123;
            }
            return 2131965123;
        }
        return 2131965123;
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A02.close();
    }
}
