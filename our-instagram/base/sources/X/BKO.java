package X;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class BKO implements InterfaceC43071ya {
    public boolean A00;
    public C120985dq A01;
    public final Handler A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final C37556GgC A05;
    public final HashMap A06;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C120985dq c120985dq;
        long j;
        long A0F;
        C4o9 c4o9;
        Integer AwU;
        C06090Tz c06090Tz;
        long j2;
        long j3;
        long j4;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A04;
        C37644Ghd c37644Ghd = (C37644Ghd) obj;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            int hashCode = c75113Zb.hashCode();
            int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
            if (intValue != 0) {
                if (intValue != A1R) {
                    if (this.A00) {
                        HashMap hashMap = this.A06;
                        Integer valueOf = Integer.valueOf(hashCode);
                        Runnable runnable = (Runnable) hashMap.get(valueOf);
                        if (runnable != null) {
                            this.A02.removeCallbacks(runnable);
                            hashMap.remove(valueOf);
                        }
                        Integer num = c75113Zb.A10;
                        Integer num2 = C05F.A00;
                        if (num != num2) {
                            c75113Zb.A0Z(num2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (interfaceC57162jr.CGk(c59062n7) != 1.0f || (c120985dq = this.A01) == null) {
                    return;
                }
                C59942oc c59942oc = AbstractC25470BOj.A00;
                UserSession userSession = this.A04;
                if (!c59942oc.A0L(c120985dq, userSession)) {
                    return;
                }
                D1J d1j = new D1J(c75113Zb);
                HashMap hashMap2 = this.A06;
                Integer valueOf2 = Integer.valueOf(hashCode);
                if (hashMap2.containsKey(valueOf2)) {
                    return;
                }
                if (AbstractC40918IAq.A00(this.A03, c120985dq, userSession)) {
                    C06090Tz c06090Tz2 = C06090Tz.A06;
                    boolean A06 = C18U.A06(c06090Tz2, userSession, 36317517606556973L);
                    C14360o3.A06(obj);
                    j = c59942oc.A0G(c120985dq, c37644Ghd, userSession, A06);
                    if (A06 && CLN.A00(userSession).A00(c120985dq)) {
                        j4 = 36598992583462251L;
                    } else {
                        j4 = 36598992583134568L;
                    }
                    A0F = C18U.A01(c06090Tz2, userSession, j4);
                } else {
                    boolean z = false;
                    if (!c120985dq.CdW()) {
                        z = true;
                    }
                    j = 0;
                    if (!z && (c4o9 = c120985dq.A06().A0N) != null && (AwU = c4o9.AwU()) != null) {
                        j = AwU.intValue();
                    }
                    C14360o3.A06(obj);
                    A0F = c59942oc.A0F(c120985dq, c37644Ghd, userSession);
                }
                long j5 = j + A0F;
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    long A1C = c38321qM.A1C();
                    if (A1C != 0) {
                        j3 = Math.max(j5, A1C + c59942oc.A0H(c120985dq, userSession));
                        hashMap2.put(valueOf2, d1j);
                        this.A02.postDelayed(d1j, j3);
                        return;
                    }
                }
                if (c59942oc.A0I(c120985dq, userSession)) {
                    c06090Tz = C06090Tz.A06;
                    j2 = 36605452213294342L;
                } else {
                    boolean A0N = c59942oc.A0N(c120985dq, userSession, false);
                    c06090Tz = C06090Tz.A06;
                    if (A0N) {
                        j2 = 36607204559754801L;
                    } else {
                        j2 = 36597016898308825L;
                    }
                }
                long A01 = C18U.A01(c06090Tz, userSession, j2);
                C14360o3.A0A(Long.valueOf(A01));
                j3 = A01 + j5;
                hashMap2.put(valueOf2, d1j);
                this.A02.postDelayed(d1j, j3);
                return;
            }
            C37556GgC c37556GgC = this.A05;
            C120985dq A09 = c37556GgC.A09(c37556GgC.A03());
            this.A01 = A09;
            if (A09 == null || A09.CdW()) {
                return;
            }
            this.A01 = c37556GgC.A09(AbstractC25234BEr.A03(c37556GgC, A1R ? 1 : 0));
        }
    }

    public BKO(FragmentActivity fragmentActivity, UserSession userSession, C37556GgC c37556GgC) {
        AbstractC167027dH.A13(userSession, c37556GgC, fragmentActivity);
        this.A04 = userSession;
        this.A05 = c37556GgC;
        this.A03 = fragmentActivity;
        this.A02 = AbstractC167007dF.A0J();
        this.A06 = AbstractC166987dD.A1G();
    }
}
