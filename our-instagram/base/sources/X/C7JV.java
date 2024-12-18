package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7JV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7JV {
    public C164817Yu A00;
    public final InterfaceC41501vz A01;
    public final InterfaceC41501vz A02;
    public final InterfaceC41501vz A03;
    public final InterfaceC41501vz A04;
    public final UserSession A05;
    public final C160917Ja A06;
    public final C7U0 A07;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.7Ja] */
    public C7JV(UserSession userSession, C7U0 c7u0) {
        C14360o3.A0B(c7u0, 2);
        this.A05 = userSession;
        this.A07 = c7u0;
        this.A04 = new InterfaceC41501vz() { // from class: X.7JW
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                C164817Yu c164817Yu;
                int A03 = C0f9.A03(-1184313875);
                C48032Iq c48032Iq = (C48032Iq) obj;
                int A032 = C0f9.A03(155935647);
                C14360o3.A0B(c48032Iq, 0);
                C7JV c7jv = C7JV.this;
                InterfaceC163837Ux C7r = c7jv.A07.C7r();
                if (C7r.CeQ() && C14360o3.A0K(AbstractC1345466e.A05(c48032Iq.A00), C7r.B90()) && (c164817Yu = c7jv.A00) != null) {
                    C164707Yj c164707Yj = c164817Yu.A00;
                    c164707Yj.A02 = true;
                    C164707Yj.A01(c164707Yj);
                }
                C0f9.A0A(-2141149436, A032);
                C0f9.A0A(514972087, A03);
            }
        };
        this.A03 = new InterfaceC41501vz() { // from class: X.7JX
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1534681860);
                C72393Mm c72393Mm = (C72393Mm) obj;
                int A032 = C0f9.A03(-1260494224);
                C14360o3.A0B(c72393Mm, 0);
                C164817Yu c164817Yu = C7JV.this.A00;
                if (c164817Yu != null) {
                    String str = c72393Mm.A03;
                    C14360o3.A0B(str, 0);
                    ((C7ZX) c164817Yu.A00.A0W.get()).Cs3(str, false, null);
                }
                C0f9.A0A(1707469063, A032);
                C0f9.A0A(151549502, A03);
            }
        };
        this.A02 = new InterfaceC41501vz() { // from class: X.7JY
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-2040025902);
                C72413Mo c72413Mo = (C72413Mo) obj;
                int A032 = C0f9.A03(1249253045);
                C14360o3.A0B(c72413Mo, 0);
                C164817Yu c164817Yu = C7JV.this.A00;
                if (c164817Yu != null) {
                    String str = c72413Mo.A03;
                    C14360o3.A0B(str, 0);
                    ((C7ZX) c164817Yu.A00.A0W.get()).Cr4(str);
                }
                C0f9.A0A(2108147461, A032);
                C0f9.A0A(-1914271437, A03);
            }
        };
        this.A01 = new InterfaceC41501vz() { // from class: X.7JZ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-151534752);
                C1571073p c1571073p = (C1571073p) obj;
                int A032 = C0f9.A03(-1986924512);
                C14360o3.A0B(c1571073p, 0);
                C164817Yu c164817Yu = C7JV.this.A00;
                if (c164817Yu != null) {
                    C41451vu c41451vu = C41451vu.A01;
                    AbstractC59962oe abstractC59962oe = c164817Yu.A00.A03;
                    c41451vu.E4s(c1571073p.A00(abstractC59962oe.requireActivity(), abstractC59962oe.requireContext()));
                }
                C0f9.A0A(-121151822, A032);
                C0f9.A0A(-1650491075, A03);
            }
        };
        this.A06 = new InterfaceC42271xH() { // from class: X.7Ja
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
            
                if (X.C14360o3.A0K(r0, r4) != false) goto L17;
             */
            @Override // X.InterfaceC42271xH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ boolean A79(java.lang.Object r7) {
                /*
                    r6 = this;
                    X.3IL r7 = (X.C3IL) r7
                    r0 = 0
                    X.C14360o3.A0B(r7, r0)
                    java.lang.String r2 = r7.A00
                    java.lang.String r0 = "direct"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L5e
                    X.7JV r5 = X.C7JV.this
                    java.lang.String r1 = r7.A02
                    java.lang.String r0 = "thread_id:"
                    java.lang.String r4 = X.AbstractC162167Oa.A01(r0, r1)
                    X.7U0 r0 = r5.A07
                    X.7Ux r3 = r0.C7r()
                    java.lang.String r1 = r3.C7I()
                    if (r1 == 0) goto L5e
                    int r0 = r1.length()
                    if (r0 == 0) goto L5e
                    boolean r0 = r1.equals(r4)
                    if (r0 != 0) goto L46
                    boolean r0 = r3.CWO()
                    if (r0 == 0) goto L5e
                    X.3oE r0 = r3.BNh()
                    if (r0 == 0) goto L5c
                    java.lang.String r0 = r0.A00
                L40:
                    boolean r0 = X.C14360o3.A0K(r0, r4)
                    if (r0 == 0) goto L5e
                L46:
                    com.instagram.common.session.UserSession r0 = r5.A05
                    java.lang.String r1 = r0.userId
                    java.lang.String r0 = r7.A01
                    boolean r0 = X.C14360o3.A0K(r1, r0)
                    if (r0 == 0) goto L5e
                    java.lang.String r0 = "user in thread shown"
                    r7.A04 = r0
                    r0 = 1000(0x3e8, float:1.401E-42)
                    r7.A03 = r0
                L5a:
                    r0 = 1
                    return r0
                L5c:
                    r0 = 0
                    goto L40
                L5e:
                    r0 = 519(0x207, float:7.27E-43)
                    java.lang.String r0 = X.MSV.A00(r0)
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L80
                    X.7JV r0 = X.C7JV.this
                    com.instagram.common.session.UserSession r3 = r0.A05
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36318939239684901(0x8107e200001b25, double:3.0315816475820834E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    if (r0 == 0) goto L80
                    java.lang.String r0 = "user in any thread"
                    r7.A04 = r0
                    goto L5a
                L80:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C160917Ja.A79(java.lang.Object):boolean");
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1879718854);
                C0f9.A0A(-1790748876, C0f9.A03(1854616139));
                C0f9.A0A(266163557, A03);
            }
        };
    }
}
