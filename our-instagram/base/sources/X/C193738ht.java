package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193738ht extends AbstractC52922bZ {
    public C55U A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public boolean A05;
    public final UserSession A06;
    public final C1810981l A07;
    public final C193718hr A08;
    public final C1810281e A09;
    public final InterfaceC24731Iq A0A;
    public final InterfaceC19390xP A0B;

    public C193738ht(UserSession userSession, C1810981l c1810981l, C193718hr c193718hr, C1810281e c1810281e) {
        C14360o3.A0B(c1810981l, 1);
        C14360o3.A0B(c1810281e, 2);
        C14360o3.A0B(userSession, 3);
        this.A07 = c1810981l;
        this.A09 = c1810281e;
        this.A06 = userSession;
        this.A08 = c193718hr;
        Integer num = C05F.A0C;
        this.A01 = num;
        this.A02 = num;
        Integer num2 = C05F.A00;
        this.A03 = num2;
        this.A04 = num2;
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A0A = c24721Ip;
        this.A0B = AbstractC07080Za.A03(c24721Ip);
        c1810281e.A02(new InterfaceC1810781j() { // from class: X.8hu
            @Override // X.InterfaceC1810781j
            public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
                C193738ht c193738ht = C193738ht.this;
                UserSession userSession2 = c193738ht.A06;
                if (AbstractC1822686m.A01(userSession2) && C14360o3.A0K(c193738ht.A07.A08.A00, C208509Kk.A00) && obj == EnumC1810381f.A02 && obj2 == EnumC1810381f.A03) {
                    Integer num3 = c193738ht.A04;
                    Integer num4 = C05F.A00;
                    if ((num3 == num4 && C18U.A06(C06090Tz.A05, userSession2, 36321915652089740L)) || c193738ht.A04 == C05F.A01) {
                        C141796aw A00 = AbstractC141776au.A00(c193738ht);
                        AbstractC23641Du.A03(num4, AnonymousClass191.A00, new C25024B5f(c193738ht, null, 5), A00);
                    }
                }
            }
        });
        c1810981l.A0H(new AnonymousClass822() { // from class: X.8hv
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
            
                if (r7 != r1) goto L14;
             */
            @Override // X.AnonymousClass822
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r10) {
                /*
                    r9 = this;
                    X.55U r10 = (X.C55U) r10
                    r0 = 0
                    X.C14360o3.A0B(r10, r0)
                    X.8ht r4 = X.C193738ht.this
                    X.81e r0 = r4.A09
                    android.util.Pair r0 = r0.A00
                    java.lang.Object r1 = r0.first
                    X.81f r0 = X.EnumC1810381f.A03
                    if (r1 != r0) goto L64
                    java.lang.Integer r7 = r4.A01
                    java.lang.Integer r0 = X.C05F.A0N
                    if (r7 == r0) goto L64
                    boolean r5 = r10 instanceof X.C81V
                    r8 = 1
                    if (r5 == 0) goto L2a
                    java.lang.Integer r2 = r4.A03
                    java.lang.Integer r1 = X.C05F.A00
                    if (r2 == r1) goto L27
                    java.lang.Integer r0 = X.C05F.A01
                    if (r2 != r0) goto L2a
                L27:
                    r6 = 1
                    if (r7 == r1) goto L2b
                L2a:
                    r6 = 0
                L2b:
                    boolean r3 = r10 instanceof X.C208509Kk
                    if (r3 == 0) goto Laf
                    java.lang.Integer r2 = r4.A04
                    java.lang.Integer r1 = X.C05F.A00
                    if (r2 == r1) goto L39
                    java.lang.Integer r0 = X.C05F.A01
                    if (r2 != r0) goto Laf
                L39:
                    java.lang.Integer r0 = r4.A02
                    if (r0 != r1) goto Laf
                L3d:
                    java.lang.Integer r1 = X.C05F.A0C
                    if (r7 != r1) goto L45
                    java.lang.Integer r0 = r4.A02
                    if (r0 == r1) goto L64
                L45:
                    r2 = 0
                    if (r6 == 0) goto L4a
                    if (r7 != r1) goto L50
                L4a:
                    if (r8 == 0) goto L65
                    java.lang.Integer r0 = r4.A02
                    if (r0 == r1) goto L65
                L50:
                    X.6aw r5 = X.AbstractC141776au.A00(r4)
                    r0 = 31
                    X.9D3 r3 = new X.9D3
                    r3.<init>(r4, r10, r2, r0)
                L5b:
                    X.191 r1 = X.AnonymousClass191.A00
                    java.lang.Integer r0 = X.C05F.A00
                    X.AbstractC23641Du.A03(r0, r1, r3, r5)
                L62:
                    r4.A00 = r10
                L64:
                    return
                L65:
                    if (r5 != 0) goto L83
                    X.55U r1 = r4.A00
                    X.81U r0 = X.C81U.A00
                    boolean r0 = X.C14360o3.A0K(r1, r0)
                    if (r0 == 0) goto L83
                    java.lang.Integer r1 = r4.A03
                    java.lang.Integer r0 = X.C05F.A01
                    if (r1 != r0) goto L83
                    X.6aw r5 = X.AbstractC141776au.A00(r4)
                    r0 = 27
                L7d:
                    X.9Cu r3 = new X.9Cu
                    r3.<init>(r4, r2, r0)
                    goto L5b
                L83:
                    if (r3 != 0) goto L9c
                    X.55U r1 = r4.A00
                    X.9Kk r0 = X.C208509Kk.A00
                    boolean r0 = X.C14360o3.A0K(r1, r0)
                    if (r0 == 0) goto L9c
                    java.lang.Integer r1 = r4.A04
                    java.lang.Integer r0 = X.C05F.A01
                    if (r1 != r0) goto L9c
                    X.6aw r5 = X.AbstractC141776au.A00(r4)
                    r0 = 28
                    goto L7d
                L9c:
                    X.55U r0 = r4.A00
                    boolean r0 = X.C14360o3.A0K(r0, r10)
                    if (r0 != 0) goto L62
                    if (r3 != 0) goto L62
                    if (r5 != 0) goto L62
                    X.6aw r5 = X.AbstractC141776au.A00(r4)
                    r0 = 29
                    goto L7d
                Laf:
                    r8 = 0
                    goto L3d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C193758hv.onChanged(java.lang.Object):void");
            }
        });
    }

    public final void A00(boolean z, boolean z2) {
        Integer num;
        Integer num2;
        if (this.A09.A00.first != EnumC1810381f.A03 && C14360o3.A0K(this.A07.A08.A00, C208509Kk.A00) && AbstractC1822686m.A01(this.A06)) {
            return;
        }
        Object obj = this.A07.A08.A00;
        if (obj instanceof C81V) {
            if (z) {
                num2 = C05F.A01;
            } else {
                num2 = C05F.A0C;
            }
            this.A03 = num2;
            return;
        }
        if (!(obj instanceof C208509Kk)) {
            return;
        }
        if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        this.A04 = num;
        if (!AbstractC1822686m.A01(this.A06)) {
            return;
        }
        this.A05 = z2;
    }
}
