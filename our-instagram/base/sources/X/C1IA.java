package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1IA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IA extends C1IB implements InterfaceC13050lr {
    public final Map A00;
    public final Map A01;
    public final EnumC23071Am A02;
    public final UserSession A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1IA(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = new HashMap();
        this.A00 = new HashMap();
        this.A02 = EnumC23071Am.A0h;
        this.A04 = C18U.A06(C06090Tz.A05, userSession, 36324007303261988L);
    }

    public static final synchronized void A00(C1IA c1ia, InterfaceC23511Cn interfaceC23511Cn, InterfaceC24551Hy interfaceC24551Hy, InterfaceC24551Hy interfaceC24551Hy2, C24531Hw c24531Hw, C24531Hw c24531Hw2, String str, long j, boolean z, boolean z2) {
        synchronized (c1ia) {
            if (c24531Hw2 != null) {
                if (c1ia.A03(str, j, z)) {
                    C11Q c11q = new C11Q(null, c24531Hw2, c1ia.A04);
                    c11q.A04(new C42217In3(c1ia, interfaceC23511Cn, c11q, interfaceC24551Hy2, interfaceC24551Hy, c24531Hw, str, z2), c11q.getName());
                    interfaceC23511Cn.EpC(c24531Hw2);
                }
            }
            if (c24531Hw != null && (!z2 || c1ia.A02())) {
                A01(c1ia, interfaceC23511Cn, interfaceC24551Hy, interfaceC24551Hy2, c24531Hw, str);
            }
        }
    }

    public static final synchronized void A01(final C1IA c1ia, InterfaceC23511Cn interfaceC23511Cn, final InterfaceC24551Hy interfaceC24551Hy, final InterfaceC24551Hy interfaceC24551Hy2, C24531Hw c24531Hw, final String str) {
        synchronized (c1ia) {
            final C11Q c11q = new C11Q(new InterfaceC24551Hy(c1ia) { // from class: X.1II
                public final /* synthetic */ C1IA A00;

                @Override // X.InterfaceC24551Hy
                public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(c3jx, 1);
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.D6Z(interfaceC26451Qa, c3jx);
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(abstractC115105If, 1);
                    C1IA c1ia2 = this.A00;
                    Map map = c1ia2.A01;
                    String str2 = str;
                    map.remove(str2);
                    ((C1IB) c1ia2).A02.remove(str2);
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.DFq(abstractC115105If, interfaceC26451Qa);
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(abstractC115105If, 1);
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.DFs(abstractC115105If, interfaceC26451Qa);
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(c3jx, 1);
                    C14360o3.A0B(interfaceC40801un, 2);
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.DVQ(interfaceC40801un, interfaceC26451Qa, c3jx);
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final /* bridge */ /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(c3jx, 1);
                    C14360o3.A0B(interfaceC40801un, 2);
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.DVS(interfaceC40801un, interfaceC26451Qa, c3jx);
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(c3jx, 1);
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.Dgo(interfaceC26451Qa, c3jx);
                    }
                }

                {
                    this.A00 = c1ia;
                }

                @Override // X.InterfaceC24551Hy
                public final void DVR() {
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.DVR();
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final void Dg4() {
                    C1IA c1ia2 = this.A00;
                    Map map = c1ia2.A01;
                    String str2 = str;
                    map.remove(str2);
                    ((C1IB) c1ia2).A02.remove(str2);
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.Dg4();
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final void DgK() {
                    InterfaceC24551Hy interfaceC24551Hy3 = interfaceC24551Hy;
                    if (interfaceC24551Hy3 != null) {
                        interfaceC24551Hy3.DgK();
                    }
                }
            }, c24531Hw, c1ia.A04);
            InterfaceC24551Hy interfaceC24551Hy3 = new InterfaceC24551Hy(c1ia) { // from class: X.1IM
                public final /* synthetic */ C1IA A00;

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                }

                @Override // X.InterfaceC24551Hy
                public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(abstractC115105If, 1);
                    C1IA c1ia2 = this.A00;
                    Map map = c1ia2.A01;
                    String str2 = str;
                    map.remove(str2);
                    ((C1IB) c1ia2).A02.remove(str2);
                    InterfaceC24551Hy interfaceC24551Hy4 = interfaceC24551Hy2;
                    if (interfaceC24551Hy4 != null) {
                        interfaceC24551Hy4.DFq(abstractC115105If, interfaceC26451Qa);
                    }
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void DVR() {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void DgK() {
                }

                @Override // X.InterfaceC24551Hy
                public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                }

                {
                    this.A00 = c1ia;
                }

                @Override // X.InterfaceC24551Hy
                public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
                    InterfaceC55612h1 interfaceC55612h1 = (InterfaceC55612h1) interfaceC40801un;
                    C14360o3.A0B(interfaceC26451Qa, 0);
                    C14360o3.A0B(c3jx, 1);
                    C14360o3.A0B(interfaceC55612h1, 2);
                    InterfaceC24551Hy interfaceC24551Hy4 = interfaceC24551Hy2;
                    if (interfaceC24551Hy4 != null) {
                        InterfaceC124295jj interfaceC124295jj = (InterfaceC124295jj) interfaceC55612h1;
                        C14360o3.A0B(interfaceC124295jj, 2);
                        if (!C5R3.A05(interfaceC124295jj)) {
                            return;
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    C1IA c1ia2 = this.A00;
                    C1ID c1id = ((C1IB) c1ia2).A00;
                    String str2 = str;
                    c1id.A02(str2, currentTimeMillis);
                    c1id.A03(str2, ((C1IB) c1ia2).A02.contains(str2));
                    C1ID.A00(c1id);
                    c1ia2.A00.put(str2, new C62292sU(c11q, currentTimeMillis));
                    if (interfaceC24551Hy4 == null) {
                        return;
                    }
                    interfaceC24551Hy4.DVQ(interfaceC55612h1, interfaceC26451Qa, c3jx);
                }

                @Override // X.InterfaceC24551Hy
                public final void Dg4() {
                    C1IA c1ia2 = this.A00;
                    Map map = c1ia2.A01;
                    String str2 = str;
                    map.remove(str2);
                    ((C1IB) c1ia2).A02.remove(str2);
                    InterfaceC24551Hy interfaceC24551Hy4 = interfaceC24551Hy2;
                    if (interfaceC24551Hy4 != null) {
                        interfaceC24551Hy4.Dg4();
                    }
                }
            };
            if (C11Q.A06) {
                c11q.A00.A02(interfaceC24551Hy3);
            } else {
                c11q.A04(interfaceC24551Hy3, c11q.getName());
            }
            c1ia.A01.put(str, c11q);
            interfaceC23511Cn.EpC(c11q);
        }
    }

    public final synchronized Integer A05(final InterfaceC24551Hy interfaceC24551Hy, C1GL c1gl, String str, long j, boolean z, boolean z2, boolean z3) {
        final C62292sU c62292sU;
        C11Q c11q;
        Integer num;
        C14360o3.A0B(str, 0);
        Object obj = this.A00.get(str);
        if (obj instanceof C62292sU) {
            c62292sU = (C62292sU) obj;
        } else {
            c62292sU = null;
        }
        Object obj2 = this.A01.get(str);
        if (obj2 instanceof C11Q) {
            c11q = (C11Q) obj2;
        } else {
            c11q = null;
        }
        num = C05F.A0C;
        if (c11q != null) {
            if (str.equals("main_feed")) {
                C226418s A01 = C226218q.A01(AbstractC12960li.A00);
                A01.A0P(A01.A02, "FEED_REQUEST_FOUND_RUNNING_REQUESTS");
                C11T.A06("This operation must be run on UI thread.");
            }
            if (z3) {
                c11q.A03(new C62362sb(str), interfaceC24551Hy, c11q.getName());
            } else {
                UserSession userSession = this.A03;
                C06090Tz c06090Tz = C06090Tz.A05;
                c1gl.schedule(new C62302sV(c11q, interfaceC24551Hy, (int) C18U.A01(c06090Tz, userSession, 36609532435765145L), C18U.A06(c06090Tz, userSession, 36328057458998389L)));
            }
            num = C05F.A00;
            super.A02.add(str);
        } else if (c62292sU != null && A03(str, j, z)) {
            if (z2 && !z3) {
                c1gl.schedule(new C11R() { // from class: X.4rV
                    @Override // X.C11R
                    public final String getName() {
                        return "ReplayableStreamingCacheData";
                    }

                    @Override // X.C11R
                    public final int getRunnableId() {
                        return 773867903;
                    }

                    @Override // X.C11R
                    public final void onCancel() {
                    }

                    @Override // X.C11R
                    public final void onFinish() {
                    }

                    @Override // X.C11R
                    public final void onStart() {
                    }

                    @Override // X.C11R
                    public final void run() {
                        C62292sU.this.A01.A04(interfaceC24551Hy, "ReplayableStreamingCacheData");
                    }
                });
            } else {
                c62292sU.A01.A04(interfaceC24551Hy, "ReplayableStreamingCacheData");
            }
            num = C05F.A01;
        }
        if (num == C05F.A01) {
            C1ID c1id = super.A00;
            c1id.A03(str, true);
            C1ID.A00(c1id);
        }
        return num;
    }

    public final synchronized Integer A06(String str, long j, boolean z) {
        Integer num;
        C14360o3.A0B(str, 0);
        if (this.A01.containsKey(str)) {
            num = C05F.A00;
        } else if (((C62292sU) this.A00.get(str)) != null && A03(str, j, z)) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        return num;
    }

    public final synchronized boolean A07(String str) {
        C14360o3.A0B(str, 0);
        return this.A01.containsKey(str);
    }

    @Override // X.C1IB
    public final EnumC23071Am A04() {
        return this.A02;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C11T.A02(new RunnableC43082J2x(this));
    }
}
