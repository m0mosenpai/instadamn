package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71603Jf {
    public final UserSession A00;
    public final User A01;

    public C71603Jf(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C08730cb.A00(userSession).A00();
    }

    public final long A00() {
        List Bjm;
        C43K c43k;
        Integer B23;
        User user = this.A01;
        if (user.A2K() && !AnonymousClass280.A01.A06(this.A00).getBoolean("BYPASS_QUIET_MODE_UPSELL_CHECKS", false) && (Bjm = user.A03.Bjm()) != null && (c43k = (C43K) AbstractC001800i.A0O(Bjm, 0)) != null && (B23 = c43k.B23()) != null) {
            return B23.intValue();
        }
        return C18U.A01(C06090Tz.A05, this.A00, 36597454984055629L);
    }

    public final long A01() {
        List Bjm;
        C43K c43k;
        Integer Bzj;
        User user = this.A01;
        if (user.A2K() && !AnonymousClass280.A01.A06(this.A00).getBoolean("BYPASS_QUIET_MODE_UPSELL_CHECKS", false) && (Bjm = user.A03.Bjm()) != null && (c43k = (C43K) AbstractC001800i.A0O(Bjm, 0)) != null && (Bzj = c43k.Bzj()) != null) {
            return Bzj.intValue();
        }
        return C18U.A01(C06090Tz.A05, this.A00, 36597454984186702L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r3 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C69436VnL A03(long r20) {
        /*
            r19 = this;
            r2 = r19
            X.4rk r3 = r2.A02()
            r12 = 0
            if (r3 == 0) goto L47
            java.lang.Long r0 = r3.A01
            if (r0 == 0) goto L47
            long r10 = r0.longValue()
        L12:
            java.lang.Long r0 = r3.A00
            if (r0 == 0) goto L1a
            long r12 = r0.longValue()
        L1a:
            com.instagram.user.model.User r0 = r2.A01
            boolean r16 = r0.A1W()
            long r0 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r4
            boolean r17 = r2.A07(r0)
            long r4 = r2.A01()
            long r6 = r2.A00()
            r18 = 0
            if (r3 == 0) goto L39
            r18 = 1
        L39:
            long r14 = r12 - r10
            java.util.List r3 = r2.A04()
            X.VnL r2 = new X.VnL
            r8 = r20
            r2.<init>(r3, r4, r6, r8, r10, r12, r14, r16, r17, r18)
            return r2
        L47:
            r10 = 0
            if (r3 == 0) goto L1a
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71603Jf.A03(long):X.VnL");
    }

    public final List A04() {
        List Bjm;
        C43K c43k;
        List Avr;
        User user = this.A01;
        if (user.A2K() && (Bjm = user.A03.Bjm()) != null && (c43k = (C43K) AbstractC001800i.A0O(Bjm, 0)) != null && (Avr = c43k.Avr()) != null) {
            return Avr;
        }
        return AbstractC206079Ao.A02();
    }

    public final void A05(long j, long j2) {
        User user = this.A01;
        List singletonList = Collections.singletonList(new C106834rk(Long.valueOf(j2), Long.valueOf(j)));
        C14360o3.A07(singletonList);
        user.A0u(singletonList);
    }

    public final boolean A06() {
        EnumC206089Ap enumC206089Ap;
        UserSession userSession = this.A00;
        int i = 1;
        if (AbstractC455527p.A00(userSession)) {
            Calendar calendar = Calendar.getInstance();
            C14360o3.A07(calendar);
            EnumC206089Ap A01 = AbstractC206079Ao.A01(calendar);
            if (A01 != null) {
                List A04 = new C71603Jf(userSession).A04();
                ArrayList arrayList = new ArrayList();
                Iterator it = A04.iterator();
                while (it.hasNext()) {
                    EnumC206089Ap A00 = AbstractC206079Ao.A00((String) it.next());
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
                ArrayList A0U = AbstractC001800i.A0U(arrayList);
                int i2 = A01.A00;
                if (i2 != 7) {
                    i = 1 + i2;
                }
                EnumC206089Ap[] values = EnumC206089Ap.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        enumC206089Ap = values[i3];
                        if (enumC206089Ap.A00 == i) {
                            break;
                        }
                        i3++;
                    } else {
                        enumC206089Ap = null;
                        break;
                    }
                }
                return AbstractC001800i.A0u(A0U, enumC206089Ap);
            }
        }
        return true;
    }

    public final boolean A07(long j) {
        List<InterfaceC106844rl> Bjl;
        User user = this.A01;
        List Bjl2 = user.A03.Bjl();
        if (Bjl2 != null && !Bjl2.isEmpty() && (Bjl = user.A03.Bjl()) != null) {
            for (InterfaceC106844rl interfaceC106844rl : Bjl) {
                Long startTimestamp = interfaceC106844rl.getStartTimestamp();
                Long B2A = interfaceC106844rl.B2A();
                if (startTimestamp != null && B2A != null && startTimestamp.longValue() + 1 <= j && j < B2A.longValue()) {
                    break;
                }
            }
        }
        if (!user.A1W() || !A08(j)) {
            return false;
        }
        return true;
    }

    public final boolean A09(EnumC206089Ap enumC206089Ap) {
        if (!AbstractC455527p.A00(this.A00)) {
            return true;
        }
        List A04 = A04();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A04, 10));
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC206079Ao.A00((String) it.next()));
        }
        ArrayList A0U = AbstractC001800i.A0U(arrayList);
        if (enumC206089Ap == null || A0U.isEmpty() || A0U.contains(enumC206089Ap)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C106834rk A02() {
        /*
            r13 = this;
            long r11 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r0
            com.instagram.user.model.User r2 = r13.A01
            X.17P r0 = r2.A03
            java.util.List r0 = r0.Bjl()
            if (r0 == 0) goto L18
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L19
        L18:
            r0 = 1
        L19:
            r0 = r0 ^ 1
            r10 = 0
            if (r0 == 0) goto L61
            X.17P r0 = r2.A03
            java.util.List r0 = r0.Bjl()
            if (r0 == 0) goto L61
            java.util.Iterator r9 = r0.iterator()
        L2a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r9.next()
            X.4rl r0 = (X.InterfaceC106844rl) r0
            java.lang.Long r8 = r0.getStartTimestamp()
            java.lang.Long r7 = r0.B2A()
            if (r8 == 0) goto L2a
            if (r7 == 0) goto L2a
            long r5 = r8.longValue()
            r3 = 1
            long r1 = r5 + r3
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L5c
            long r1 = r7.longValue()
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5c
        L56:
            X.4rk r0 = new X.4rk
            r0.<init>(r7, r8)
            return r0
        L5c:
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 > 0) goto L2a
            goto L56
        L61:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71603Jf.A02():X.4rk");
    }

    public final boolean A08(long j) {
        long A01 = A01();
        long A00 = A00();
        long A002 = C123815iv.A00() / 1000;
        long j2 = A01 + A002;
        long j3 = A002 + A00;
        if (j3 < j2) {
            j2 -= SandboxRepository.CACHE_TTL;
        }
        if (j > j3) {
            j2 += SandboxRepository.CACHE_TTL;
            j3 += SandboxRepository.CACHE_TTL;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2 * 1000);
        if (A09(AbstractC206079Ao.A01(calendar)) && j2 <= j && j < j3) {
            return true;
        }
        return false;
    }
}
