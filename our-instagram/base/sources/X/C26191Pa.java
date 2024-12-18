package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.1Pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26191Pa {
    public C1P1 A00;
    public C41541IZq A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C1P1 A09;
    public final UserSession A0A;
    public final C1PC A0B;
    public final boolean A0C;

    public final void A00(Object obj) {
        Object obj2;
        Integer num;
        boolean z = true;
        this.A04 = true;
        C1P1 c1p1 = this.A00;
        C1P1 c1p12 = this.A09;
        if (c1p1 != c1p12) {
            if (this.A01 != null) {
                C40741uh c40741uh = (C40741uh) obj;
                C14360o3.A0B(c40741uh, 0);
                Integer num2 = c40741uh.A02;
                if (num2 == null || (num = c40741uh.A04) == null || num2.intValue() < 0 || num.intValue() >= Integer.MAX_VALUE) {
                    z = false;
                }
            }
            C1P1 c1p13 = this.A00;
            if (!z && (obj2 = this.A02) != null) {
                obj = obj2;
            }
            c1p13.onSuccess(obj);
            this.A00 = c1p12;
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
            return;
        }
        this.A03 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r5.A04 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r1.A09() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01() {
        /*
            r5 = this;
            boolean r0 = r5.A0C
            r4 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r5.A06
            if (r0 != 0) goto L3c
            boolean r0 = r5.A05
            if (r0 != 0) goto L3c
        Ld:
            r3 = 1
        Le:
            boolean r0 = r5.A07
            if (r0 == 0) goto L17
            boolean r0 = r5.A04
            r2 = 0
            if (r0 != 0) goto L18
        L17:
            r2 = 1
        L18:
            com.instagram.common.session.UserSession r0 = r5.A0A
            X.1PH r1 = X.C1PH.A00(r0)
            X.1PC r0 = r5.A0B
            X.1PY r1 = r1.A06(r0)
            java.util.LinkedList r0 = r1.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L33
            boolean r1 = r1.A09()
            r0 = 1
            if (r1 != 0) goto L34
        L33:
            r0 = 0
        L34:
            if (r3 == 0) goto L3b
            if (r2 != 0) goto L3a
            if (r0 == 0) goto L3b
        L3a:
            r4 = 1
        L3b:
            return r4
        L3c:
            r3 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26191Pa.A01():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r1.intValue() < Integer.MAX_VALUE) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(final X.C1P1 r7, X.C41541IZq r8, java.lang.Object r9) {
        /*
            r6 = this;
            com.instagram.common.session.UserSession r0 = r6.A0A
            X.1PH r1 = X.C1PH.A00(r0)
            X.1PC r0 = r6.A0B
            X.1PY r4 = r1.A06(r0)
            java.lang.Object r3 = r6.A03
            r0 = 0
            r6.A03 = r0
            boolean r0 = r6.A05
            r5 = 1
            if (r0 == 0) goto L1d
            r6.A00 = r7
            r6.A01 = r8
            r6.A02 = r9
            return r5
        L1d:
            boolean r0 = r6.A08
            r2 = 0
            if (r0 != 0) goto L29
            boolean r0 = r4.A09()
            if (r0 == 0) goto L29
        L28:
            return r2
        L29:
            if (r3 == 0) goto L5b
            if (r8 == 0) goto L4a
            r1 = r3
            X.1uh r1 = (X.C40741uh) r1
            X.C14360o3.A0B(r1, r2)
            java.lang.Integer r0 = r1.A02
            if (r0 == 0) goto L5b
            java.lang.Integer r1 = r1.A04
            if (r1 == 0) goto L5b
            int r0 = r0.intValue()
            if (r0 < 0) goto L5b
            int r1 = r1.intValue()
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r0) goto L5b
        L4a:
            java.util.LinkedList r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5b
            X.6WY r0 = new X.6WY
            r0.<init>()
        L57:
            X.C11T.A03(r0)
            return r5
        L5b:
            java.util.LinkedList r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.lang.String r1 = "stories_ads_prefetch"
            java.lang.String r0 = "Detected a stories ads session that has ads in pool but unknown prefetch request"
            X.C0w9.A03(r1, r0)
            if (r9 == 0) goto L28
            X.J5T r0 = new X.J5T
            r0.<init>(r7, r6, r9)
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26191Pa.A02(X.1P1, X.IZq, java.lang.Object):boolean");
    }

    public C26191Pa(UserSession userSession, C1PC c1pc) {
        C1P1 c1p1 = new C1P1() { // from class: X.1Pb
        };
        this.A09 = c1p1;
        this.A00 = c1p1;
        this.A05 = false;
        this.A04 = false;
        this.A0B = c1pc;
        this.A0A = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0C = C18U.A06(c06090Tz, userSession, 36310538285154442L);
        this.A07 = C18U.A06(c06090Tz, userSession, 36310538285547663L);
        this.A08 = C18U.A06(c06090Tz, userSession, 36310538288300203L) || C18U.A06(c06090Tz, userSession, 36321426026800552L);
        if (this.A07) {
            C1PY A06 = C1PH.A00(userSession).A06(c1pc);
            C42969IzL c42969IzL = new C42969IzL(this);
            List list = A06.A00;
            if (!list.contains(c42969IzL)) {
                list.add(c42969IzL);
            }
        }
    }
}
