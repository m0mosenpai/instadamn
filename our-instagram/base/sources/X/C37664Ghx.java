package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Ghx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37664Ghx implements InterfaceC43071ya {
    public boolean A00;
    public C120985dq A01;
    public final Handler A02;
    public final UserSession A03;
    public final C37556GgC A04;
    public final HashMap A05;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C38321qM c38321qM;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C75113Zb c75113Zb = ((C37644Ghd) c59062n7.A04).A0E;
        if (c75113Zb != null) {
            int hashCode = c75113Zb.hashCode();
            int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
            if (A01 != 0) {
                if (A01 != A1R) {
                    if (this.A00) {
                        HashMap hashMap = this.A05;
                        Integer valueOf = Integer.valueOf(hashCode);
                        Runnable runnable = (Runnable) hashMap.get(valueOf);
                        if (runnable != null) {
                            this.A02.removeCallbacks(runnable);
                            hashMap.remove(valueOf);
                        }
                        boolean z = c75113Zb.A26;
                        boolean z2 = c75113Zb.A24;
                        if (z) {
                            if (z2 != A1R) {
                                c75113Zb.A24 = A1R;
                            } else {
                                return;
                            }
                        } else if (!z2) {
                            return;
                        } else {
                            c75113Zb.A24 = false;
                        }
                        C75113Zb.A00(c75113Zb, 65);
                        return;
                    }
                    return;
                }
                if (interfaceC57162jr.CGk(c59062n7) != 1.0f) {
                    return;
                }
                C120985dq c120985dq = this.A01;
                if (c120985dq != null) {
                    c38321qM = c120985dq.A02;
                } else {
                    c38321qM = null;
                }
                UserSession userSession = this.A03;
                if (!C25375BKs.A03(userSession, c38321qM) || c75113Zb.A24) {
                    return;
                }
                HashMap hashMap2 = this.A05;
                Integer valueOf2 = Integer.valueOf(hashCode);
                if (hashMap2.containsKey(valueOf2)) {
                    return;
                }
                RunnableC43107J3w runnableC43107J3w = new RunnableC43107J3w(c75113Zb);
                C14360o3.A0B(userSession, 0);
                long A012 = C18U.A01(C06090Tz.A06, userSession, 36603012671935347L);
                hashMap2.put(valueOf2, runnableC43107J3w);
                this.A02.postDelayed(runnableC43107J3w, A012);
                return;
            }
            C37556GgC c37556GgC = this.A04;
            C120985dq A013 = C37556GgC.A01(c37556GgC);
            this.A01 = A013;
            if (A013 == null || A013.CdW()) {
                return;
            }
            int A03 = c37556GgC.A03();
            int A06 = c37556GgC.A06();
            int A032 = c37556GgC.A03();
            int i = A032 + 1;
            if (A03 == A06) {
                i = A032 - (A1R ? 1 : 0);
            }
            this.A01 = c37556GgC.A09(i);
        }
    }

    public C37664Ghx(UserSession userSession, C37556GgC c37556GgC) {
        AbstractC167017dG.A1P(userSession, c37556GgC);
        this.A03 = userSession;
        this.A04 = c37556GgC;
        this.A02 = AbstractC167007dF.A0J();
        this.A05 = AbstractC166987dD.A1G();
    }
}
