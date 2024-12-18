package X;

import com.instagram.creator.agent.settings.keyword.KeywordRepository;

/* renamed from: X.BuA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26907BuA extends AbstractC61152qd {
    public AnonymousClass195 A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public final KeywordRepository A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final C0UO A0A;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r19.longValue() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r4 >= java.lang.System.currentTimeMillis()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26907BuA(com.instagram.creator.agent.settings.keyword.KeywordRepository r18, java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r17 = this;
            r1 = r17
            r1.<init>()
            r0 = r18
            r1.A03 = r0
            r8 = r20
            r1.A06 = r8
            r10 = r21
            r1.A05 = r10
            r0 = r22
            r1.A04 = r0
            r6 = 0
            r9 = r19
            if (r19 == 0) goto L2d
            long r4 = r9.longValue()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L2d
            long r2 = java.lang.System.currentTimeMillis()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r16 = 1
            if (r0 < 0) goto L2f
        L2d:
            r16 = 0
        L2f:
            int r0 = r8.length()
            boolean r15 = X.AbstractC167007dF.A1N(r0)
            if (r16 != 0) goto L44
            if (r19 == 0) goto L44
            long r2 = r9.longValue()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r14 = 1
            if (r0 > 0) goto L45
        L44:
            r14 = 0
        L45:
            r4 = 0
            X.Cur r7 = X.C29248Cur.A00
            X.C6R r5 = X.C6R.A04
            r13 = 2000(0x7d0, float:2.803E-42)
            X.Bg3 r3 = new X.Bg3
            r11 = r23
            r12 = r24
            r6 = r4
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.02u r0 = X.AbstractC25225BEi.A1H(r3)
            r1.A08 = r0
            X.059 r0 = X.AbstractC208910l.A02(r0)
            r1.A0A = r0
            X.Cus r0 = X.C29249Cus.A00
            X.02u r0 = X.C10E.A00(r0)
            r1.A07 = r0
            X.059 r0 = X.AbstractC208910l.A02(r0)
            r1.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26907BuA.<init>(com.instagram.creator.agent.settings.keyword.KeywordRepository, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A00() {
        Object value;
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C26074Bg3 c26074Bg3 = (C26074Bg3) this.A0A.getValue();
        if (c26074Bg3.A08.length() > 0 && c26074Bg3.A07.length() > 0 && (c26074Bg3.A04 instanceof C29248Cur) && (c26074Bg3.A05 instanceof C29248Cur)) {
            C05A c05a = this.A08;
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, C26074Bg3.A00(null, null, C6R.A03, null, null, (C26074Bg3) value, null, null, null, null, 6143, false)));
            this.A02 = AbstractC25226BEj.A1L(new D4v(this, null, 3), AbstractC141776au.A00(this));
        }
    }
}
