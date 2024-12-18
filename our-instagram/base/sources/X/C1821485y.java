package X;

import android.content.Context;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.85y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1821485y extends AbstractC61132qb {
    public final Context A00;
    public final AnonymousClass845 A01;
    public final C85Z A02;
    public final AnonymousClass858 A03;
    public final AnonymousClass830 A04;
    public final C1821385x A05;
    public final C1815383g A06;
    public final UserSession A07;
    public final C1810981l A08;
    public final InterfaceC1810081c A09;
    public final AnonymousClass825 A0A;
    public final C1821585z A0B;
    public final C1821585z A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public C1821485y(Context context, AnonymousClass845 anonymousClass845, C85Z c85z, AnonymousClass858 anonymousClass858, AnonymousClass830 anonymousClass830, C1821385x c1821385x, C1815383g c1815383g, UserSession userSession, C1810981l c1810981l, InterfaceC1810081c interfaceC1810081c, AnonymousClass825 anonymousClass825, C1821585z c1821585z, C1821585z c1821585z2, String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1810981l, 4);
        C14360o3.A0B(anonymousClass858, 6);
        C14360o3.A0B(c1815383g, 9);
        C14360o3.A0B(anonymousClass825, 11);
        C14360o3.A0B(context, 13);
        this.A0I = z;
        this.A07 = userSession;
        this.A05 = c1821385x;
        this.A08 = c1810981l;
        this.A0B = c1821585z;
        this.A03 = anonymousClass858;
        this.A04 = anonymousClass830;
        this.A0D = str;
        this.A06 = c1815383g;
        this.A0C = c1821585z2;
        this.A0A = anonymousClass825;
        this.A0G = z2;
        this.A00 = context;
        this.A09 = interfaceC1810081c;
        this.A02 = c85z;
        this.A0F = list;
        this.A0E = str2;
        this.A01 = anonymousClass845;
        this.A0H = z3;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C86B c86a;
        boolean z = this.A0I;
        final UserSession userSession = this.A07;
        Context context = this.A00;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        InterfaceC1810081c interfaceC1810081c = this.A09;
        C1815383g c1815383g = this.A06;
        EffectTrayService effectTrayService = new EffectTrayService(this.A02, AbstractC142256bi.A00(context, userSession), c1815383g, C12L.A00, userSession, C13920nI.A00, this.A0C);
        C1821385x c1821385x = this.A05;
        C142246bh A00 = AbstractC149796oY.A00(context, userSession);
        final C1810981l c1810981l = this.A08;
        C1821585z c1821585z = this.A0B;
        AnonymousClass858 anonymousClass858 = this.A03;
        AnonymousClass830 anonymousClass830 = this.A04;
        String str = this.A0D;
        boolean z2 = this.A0H;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1810981l, 3);
        AnonymousClass866 anonymousClass866 = new AnonymousClass866(userSession, c1810981l) { // from class: X.865
            public final C1810981l A00;
            public final UserSession A01;

            @Override // X.AnonymousClass866
            public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
                C191258dU[] c191258dUArr;
                String str2;
                C14360o3.A0B(c85d, 0);
                C14360o3.A0B(c9cb, 1);
                C1810981l c1810981l2 = this.A00;
                if (!c1810981l2.A0R()) {
                    if (c1810981l2.A0R()) {
                        str2 = AbstractC189108Zb.A01(c85d);
                    } else {
                        str2 = null;
                    }
                    return new C9KP(AbstractC191248dT.A01(c9cb, c85d), str2);
                }
                String A01 = AbstractC189108Zb.A01(c85d);
                C191258dU A012 = AbstractC191248dT.A01(c9cb, c85d);
                C191258dU A002 = AbstractC191248dT.A00(c9cb);
                if (C14360o3.A0K(A002.A01, "SAVED")) {
                    c191258dUArr = new C191258dU[]{C191258dU.A09, AbstractC191248dT.A00(new C9CB(AnonymousClass859.A06, "FOR_YOU"))};
                } else {
                    c191258dUArr = new C191258dU[]{C191258dU.A09, A002};
                }
                return new C191278dW(A012, null, A01, AbstractC16960so.A1Q(c191258dUArr), 3L, false);
            }

            @Override // X.AnonymousClass866
            public final boolean Akz() {
                return false;
            }

            @Override // X.AnonymousClass866
            public final Integer B0k() {
                return C05F.A01;
            }

            @Override // X.AnonymousClass866
            public final boolean Bv5() {
                return !(!this.A00.A0R());
            }

            @Override // X.AnonymousClass866
            public final boolean Bv8() {
                return !this.A00.A0R();
            }

            @Override // X.AnonymousClass866
            public final boolean Bvf() {
                return true;
            }

            @Override // X.AnonymousClass866
            public final boolean Bvp() {
                return true;
            }

            {
                this.A01 = userSession;
                this.A00 = c1810981l;
            }
        };
        AnonymousClass866 anonymousClass8662 = new AnonymousClass866(userSession, c1810981l) { // from class: X.867
            public final C1810981l A00;
            public final UserSession A01;

            @Override // X.AnonymousClass866
            public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
                C191258dU[] c191258dUArr;
                String str2;
                C14360o3.A0B(c85d, 0);
                C14360o3.A0B(c9cb, 1);
                C1810981l c1810981l2 = this.A00;
                if (!c1810981l2.A0R()) {
                    if (c1810981l2.A0R()) {
                        str2 = AbstractC189108Zb.A01(c85d);
                    } else {
                        str2 = null;
                    }
                    return new C9KP(AbstractC191248dT.A01(c9cb, c85d), str2);
                }
                String A01 = AbstractC189108Zb.A01(c85d);
                C191258dU A012 = AbstractC191248dT.A01(c9cb, c85d);
                C191258dU A002 = AbstractC191248dT.A00(c9cb);
                if (C14360o3.A0K(A002.A01, "SAVED")) {
                    c191258dUArr = new C191258dU[]{C191258dU.A0I, AbstractC191248dT.A00(new C9CB(AnonymousClass859.A08, "FOR_YOU"))};
                } else {
                    c191258dUArr = new C191258dU[]{C191258dU.A0I, A002};
                }
                return new C191278dW(A012, null, A01, AbstractC16960so.A1Q(c191258dUArr), 3L, true);
            }

            @Override // X.AnonymousClass866
            public final boolean Akz() {
                return !(!this.A00.A0R());
            }

            @Override // X.AnonymousClass866
            public final Integer B0k() {
                return C05F.A01;
            }

            @Override // X.AnonymousClass866
            public final boolean Bv5() {
                return !(!this.A00.A0R());
            }

            @Override // X.AnonymousClass866
            public final boolean Bv8() {
                return !this.A00.A0R();
            }

            @Override // X.AnonymousClass866
            public final boolean Bvf() {
                return true;
            }

            @Override // X.AnonymousClass866
            public final boolean Bvp() {
                return false;
            }

            {
                this.A01 = userSession;
                this.A00 = c1810981l;
            }
        };
        AnonymousClass866 anonymousClass8663 = new AnonymousClass866(userSession, c1810981l) { // from class: X.868
            public final C1810981l A00;
            public final UserSession A01;

            @Override // X.AnonymousClass866
            public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
                String str2;
                C14360o3.A0B(c85d, 0);
                C14360o3.A0B(c9cb, 1);
                C1810981l c1810981l2 = this.A00;
                if (!c1810981l2.A0R()) {
                    if (c1810981l2.A0R()) {
                        str2 = AbstractC189108Zb.A01(c85d);
                    } else {
                        str2 = null;
                    }
                    return new C9KP(AbstractC191248dT.A01(c9cb, c85d), str2);
                }
                return new C191278dW(AbstractC191248dT.A01(c9cb, c85d), 25, AbstractC189108Zb.A01(c85d), AbstractC16960so.A1Q(C191258dU.A05, C191258dU.A04), 6L, true);
            }

            @Override // X.AnonymousClass866
            public final boolean Akz() {
                if (!(!this.A00.A0R())) {
                    if (C18U.A06(C06090Tz.A05, this.A01, 36327443274938958L)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.AnonymousClass866
            public final Integer B0k() {
                return C05F.A01;
            }

            @Override // X.AnonymousClass866
            public final boolean Bv5() {
                return !(!this.A00.A0R());
            }

            @Override // X.AnonymousClass866
            public final boolean Bv8() {
                return !this.A00.A0R();
            }

            @Override // X.AnonymousClass866
            public final boolean Bvf() {
                return true;
            }

            @Override // X.AnonymousClass866
            public final boolean Bvp() {
                return false;
            }

            {
                this.A01 = userSession;
                this.A00 = c1810981l;
            }
        };
        if (z) {
            c86a = new C23778Afp(userSession);
        } else if (str.equals("live_broadcast")) {
            c86a = new C23777Afo(userSession, new AnonymousClass866(userSession) { // from class: X.869
                public final UserSession A00;

                @Override // X.AnonymousClass866
                public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
                    C14360o3.A0B(c85d, 0);
                    C14360o3.A0B(c9cb, 1);
                    return new C191278dW(AbstractC191248dT.A01(c9cb, c85d), null, AbstractC189108Zb.A01(c85d), AbstractC16960so.A1Q(C191258dU.A07, C191258dU.A06), 3L, false);
                }

                @Override // X.AnonymousClass866
                public final boolean Akz() {
                    return false;
                }

                @Override // X.AnonymousClass866
                public final Integer B0k() {
                    return C05F.A01;
                }

                @Override // X.AnonymousClass866
                public final boolean Bv5() {
                    return true;
                }

                @Override // X.AnonymousClass866
                public final boolean Bv8() {
                    return false;
                }

                @Override // X.AnonymousClass866
                public final boolean Bvf() {
                    return true;
                }

                @Override // X.AnonymousClass866
                public final boolean Bvp() {
                    return false;
                }

                {
                    this.A00 = userSession;
                }
            });
        } else {
            c86a = new C86A(userSession, c1810981l, AbstractC06930Yk.A06(new C09530e4(C208509Kk.A00, anonymousClass8662), new C09530e4(C81T.A00, anonymousClass8663), new C09530e4(C81U.A00, anonymousClass866), new C09530e4(C1811181n.A00, anonymousClass866), new C09530e4(C81S.A00, new AnonymousClass866(userSession) { // from class: X.869
                public final UserSession A00;

                @Override // X.AnonymousClass866
                public final AbstractC191288dX ANN(C9CB c9cb, C85D c85d) {
                    C14360o3.A0B(c85d, 0);
                    C14360o3.A0B(c9cb, 1);
                    return new C191278dW(AbstractC191248dT.A01(c9cb, c85d), null, AbstractC189108Zb.A01(c85d), AbstractC16960so.A1Q(C191258dU.A07, C191258dU.A06), 3L, false);
                }

                @Override // X.AnonymousClass866
                public final boolean Akz() {
                    return false;
                }

                @Override // X.AnonymousClass866
                public final Integer B0k() {
                    return C05F.A01;
                }

                @Override // X.AnonymousClass866
                public final boolean Bv5() {
                    return true;
                }

                @Override // X.AnonymousClass866
                public final boolean Bv8() {
                    return false;
                }

                @Override // X.AnonymousClass866
                public final boolean Bvf() {
                    return true;
                }

                @Override // X.AnonymousClass866
                public final boolean Bvp() {
                    return false;
                }

                {
                    this.A00 = userSession;
                }
            })), z2);
        }
        AnonymousClass825 anonymousClass825 = this.A0A;
        boolean z3 = this.A0G;
        List list = this.A0F;
        String str2 = this.A0E;
        return new AnonymousClass860(applicationContext, this.A01, anonymousClass858, anonymousClass830, A00, effectTrayService, c1821385x, userSession, c1810981l, c86a, interfaceC1810081c, anonymousClass825, c1821585z, str, str2, list, z, z3);
    }
}
