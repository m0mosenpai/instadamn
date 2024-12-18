package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class LFv {
    public final UserSession A00;
    public final AtomicBoolean A01;

    public LFv(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new AtomicBoolean(true);
    }

    private final boolean A00() {
        UserSession userSession = this.A00;
        if (AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36598614626733307L) <= 0 || System.currentTimeMillis() - AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "last_message_requests_prefetch_timestamp") <= AbstractC25225BEi.A07(r7, userSession, 36598614626733307L) * 1000) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r6 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r27 = this;
            r4 = r27
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A01
            r8 = 0
            boolean r0 = r0.getAndSet(r8)
            if (r0 != 0) goto L12
            boolean r0 = r4.A00()
            if (r0 != 0) goto L12
            return
        L12:
            com.instagram.common.session.UserSession r11 = r4.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36593387651007730(0x82017e001104f2, double:3.20514392801769E-306)
            int r10 = X.AbstractC25225BEi.A07(r2, r11, r0)
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r1 = X.AbstractC2042992d.A00(r11)
            r3 = 1
            if (r1 == 0) goto L33
            boolean r0 = r1.A09()
            if (r0 != r3) goto L35
            boolean r0 = r4.A00()
            if (r0 != 0) goto L35
            return
        L33:
            r9 = 1
            goto L44
        L35:
            boolean r0 = r1.A08()
            if (r0 != r3) goto L33
            r0 = 36593387651073267(0x82017e001204f3, double:3.205143928059136E-306)
            int r9 = X.AbstractC25225BEi.A07(r2, r11, r0)
        L44:
            java.util.UUID r7 = X.C0HM.A00()
            X.C14360o3.A07(r7)
            boolean r0 = X.AbstractC1337462f.A0A(r11, r8)
            r2 = 0
            if (r0 == 0) goto L8a
            X.0Tz r5 = X.C06090Tz.A06
            r0 = 36317139649631040(0x81063f00131340, double:3.030443579585654E-306)
            boolean r0 = X.C18U.A06(r5, r11, r0)
            if (r0 == 0) goto L8a
            X.LA3 r1 = new X.LA3
            r1.<init>(r11)
            X.Khs r0 = X.AbstractC46782Kmd.A00(r11)
            X.Kcw r6 = r0.A00
            X.2EB r0 = r6.A01
            java.util.ArrayList r0 = r1.A03(r0, r8)
            java.util.ArrayList r1 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r5 = r0.iterator()
        L78:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r5.next()
            X.KdP r0 = (X.EnumC46248KdP) r0
            int r0 = r0.A00
            X.AbstractC166997dE.A1W(r1, r0)
            goto L78
        L8a:
            r6 = r2
            r1 = r2
        L8c:
            X.98z r12 = X.C2057498z.A00
            r13 = 0
            r25 = -1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r9)
            if (r6 == 0) goto Ld4
            X.4I3 r5 = r6.A02
            if (r5 == 0) goto Ld4
            X.2Dm r0 = X.EnumC46982Dm.A06
            java.lang.String r20 = X.C99P.A01(r11, r0, r5)
        La5:
            X.2EB r0 = r6.A01
            if (r0 == 0) goto Lab
            java.lang.String r2 = r0.A00
        Lab:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            java.lang.String r23 = r7.toString()
            r15 = r13
            r18 = r13
            r19 = r13
            r21 = r2
            r22 = r13
            r24 = r1
            X.777 r2 = X.C99W.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 19
            X.EV0 r0 = new X.EV0
            r0.<init>(r4, r1)
            r2.A00(r0)
            r1 = 1910427429(0x71decf25, float:2.206595E30)
            r0 = 4
            X.C1GJ.A06(r2, r1, r0, r3, r3)
            return
        Ld4:
            r20 = r2
            if (r6 == 0) goto Lab
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LFv.A01():void");
    }
}
