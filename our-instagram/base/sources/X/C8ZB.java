package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.8ZB, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8ZB {
    public static void A01(final C1825387s c1825387s, final C1824787m c1824787m, final C8HI c8hi, C1821786b c1821786b, C83C c83c, C184418Gf c184418Gf, final C81J c81j, final AnonymousClass880 anonymousClass880, C8C0 c8c0, AnonymousClass860 anonymousClass860, C8TI c8ti, InterfaceC1818984z interfaceC1818984z, C1814382v c1814382v, boolean z, boolean z2) {
        interfaceC1818984z.Ela();
        c184418Gf.A00.Egh(false);
        c1821786b.A0D = true;
        C1821786b.A06(c1821786b);
        c1814382v.A00().CMe();
        c1814382v.A00().CN1();
        c1814382v.A00().Elj();
        if (c83c != null) {
            c83c.A00().A04(true);
        }
        c8c0.A0P.setVisibility(8);
        anonymousClass880.A00().ETg(true);
        if (anonymousClass860 != null) {
            if (z) {
                anonymousClass860.A0d.Egh(false);
            }
            if (z2) {
                anonymousClass860.A0a.Egh(false);
            }
        }
        c8ti.A0H.COs(null);
        c8hi.A07 = new C8IA() { // from class: X.AcZ
            @Override // X.C8IA
            public final boolean Eii(MotionEvent motionEvent) {
                C8HI c8hi2 = c8hi;
                C81J c81j2 = c81j;
                AnonymousClass880 anonymousClass8802 = anonymousClass880;
                C1824787m c1824787m2 = c1824787m;
                C1825387s c1825387s2 = c1825387s;
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                Rect A0U = AbstractC166987dD.A0U();
                ((AnonymousClass834) c8hi2.A0t).getView().getGlobalVisibleRect(A0U);
                if (AbstractC166987dD.A0V(A0U.left + 10, A0U.top + 10, A0U.right + 10, A0U.bottom + 10).contains(rawX, rawY)) {
                    AbstractC50677MYv.A0H(c81j2.A0S, c8hi2.A0N());
                    c8hi2.A0Z(null, null);
                } else if (anonymousClass8802.A00().CRL(motionEvent)) {
                    if (motionEvent.getAction() == 1) {
                        ((C8ZD) c1824787m2.A00.A00()).A03();
                        AbstractC167007dF.A16(c1825387s2.A00);
                        return true;
                    }
                } else {
                    return false;
                }
                return true;
            }
        };
    }

    public static void A02(C8HI c8hi, C8XV c8xv, C1821786b c1821786b, C184418Gf c184418Gf, C81J c81j, AnonymousClass880 anonymousClass880, C8C0 c8c0, C8FG c8fg, AnonymousClass860 anonymousClass860, C8TI c8ti, InterfaceC1818984z interfaceC1818984z, C1814382v c1814382v, InterfaceC1810081c interfaceC1810081c, C89P c89p, InterfaceC09390do interfaceC09390do, boolean z, boolean z2) {
        interfaceC1818984z.CMw();
        c184418Gf.A00.Egh(true);
        c1814382v.A00().CMz();
        if (!interfaceC1810081c.CRB(EnumC1810181d.A0f) && !interfaceC1810081c.CRB(EnumC1810181d.A1N) && !"story_selfie_reply".equals(c81j.A2q)) {
            c1814382v.A00().El4();
            if (anonymousClass860 != null && !((Boolean) anonymousClass860.A0b.getValue()).booleanValue() && c89p.A04 == null) {
                c1814382v.A00().Els();
            }
        }
        c1821786b.A0D = false;
        C1821786b.A06(c1821786b);
        if (c8fg != null) {
            C88X A0D = c8fg.A0D();
            c8xv.A09.A09(A0D);
            C1821786b c1821786b2 = c8xv.A0C;
            c1821786b2.A03 = A0D;
            C1821786b.A06(c1821786b2);
        }
        c8c0.A0P.setVisibility(0);
        anonymousClass880.A00().ETg(false);
        if (anonymousClass860 != null) {
            if (z) {
                anonymousClass860.A0d.Egh(true);
            }
            if (z2) {
                anonymousClass860.A0a.Egh(true);
            }
        }
        c8ti.A0H.A00(c8ti.A0P, c8ti.A0O);
        c8hi.A07 = null;
        ((C172227lr) interfaceC09390do.getValue()).A02.Dyf(0, 0, 1.0f, 1.0f);
        c1814382v.A00().EQP(0);
    }

    public static void A00(final C1825387s c1825387s, final C1824787m c1824787m, AbstractC59962oe abstractC59962oe, final TouchInterceptorFrameLayout touchInterceptorFrameLayout, final C8HI c8hi, final C8XV c8xv, final C1821786b c1821786b, final C83C c83c, final C184418Gf c184418Gf, final C81J c81j, final AnonymousClass880 anonymousClass880, final C8C0 c8c0, final C8FG c8fg, final AnonymousClass860 anonymousClass860, final C188798Xv c188798Xv, final C8TI c8ti, final InterfaceC1818984z interfaceC1818984z, final C1814382v c1814382v, final InterfaceC1810081c interfaceC1810081c, final C89P c89p, final C83E c83e, final InterfaceC09390do interfaceC09390do) {
        C8RQ c8rq = (C8RQ) new C52942bb((InterfaceC018407e) c81j.A05).A00(C8RQ.class);
        C82K c82k = c1824787m.A00;
        C05A c05a = ((C8ZD) c82k.A00()).A02.A0O;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC58232lf.A00(anonymousClass191, c05a).A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8ZE
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                InterfaceC1810081c interfaceC1810081c2 = interfaceC1810081c;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = touchInterceptorFrameLayout;
                InterfaceC1818984z interfaceC1818984z2 = interfaceC1818984z;
                C184418Gf c184418Gf2 = c184418Gf;
                C1821786b c1821786b2 = c1821786b;
                C1814382v c1814382v2 = c1814382v;
                C83C c83c2 = c83c;
                C8C0 c8c02 = c8c0;
                AnonymousClass860 anonymousClass8602 = anonymousClass860;
                C8TI c8ti2 = c8ti;
                C8HI c8hi2 = c8hi;
                C81J c81j2 = c81j;
                C1824787m c1824787m2 = c1824787m;
                C1825387s c1825387s2 = c1825387s;
                AnonymousClass880 anonymousClass8802 = anonymousClass880;
                C89P c89p2 = c89p;
                C8FG c8fg2 = c8fg;
                C8XV c8xv2 = c8xv;
                InterfaceC09390do interfaceC09390do2 = interfaceC09390do;
                EnumC1824287h enumC1824287h = (EnumC1824287h) obj;
                if (interfaceC1810081c2.Cap()) {
                    int ordinal = enumC1824287h.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1 && touchInterceptorFrameLayout2.isLaidOut()) {
                            C8ZB.A02(c8hi2, c8xv2, c1821786b2, c184418Gf2, c81j2, anonymousClass8802, c8c02, c8fg2, anonymousClass8602, c8ti2, interfaceC1818984z2, c1814382v2, interfaceC1810081c2, c89p2, interfaceC09390do2, true, false);
                            return;
                        }
                        return;
                    }
                    if (!touchInterceptorFrameLayout2.isLaidOut()) {
                        return;
                    }
                    C8ZB.A01(c1825387s2, c1824787m2, c8hi2, c1821786b2, c83c2, c184418Gf2, c81j2, anonymousClass8802, c8c02, anonymousClass8602, c8ti2, interfaceC1818984z2, c1814382v2, true, false);
                    return;
                }
                if (!interfaceC1810081c2.Cae() || enumC1824287h.ordinal() != 1 || !touchInterceptorFrameLayout2.isLaidOut()) {
                    return;
                }
                ((C172227lr) interfaceC09390do2.getValue()).A02.Dyf(0, 0, 1.0f, 1.0f);
            }
        });
        C75M.A00(AbstractC58232lf.A00(anonymousClass191, ((C8ZD) c82k.A00()).A02.A0N)).A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8ZF
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = TouchInterceptorFrameLayout.this;
                InterfaceC09390do interfaceC09390do2 = interfaceC09390do;
                Number number = (Number) obj;
                if (touchInterceptorFrameLayout2.isLaidOut()) {
                    ((C172227lr) interfaceC09390do2.getValue()).A00(number.intValue());
                }
            }
        });
        UserSession userSession = c81j.A0S;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A06, userSession, 36327533469317790L)) {
            c1825387s.A02.A00.A06(abstractC59962oe, new C151846sU(new InterfaceC58362lv() { // from class: X.AUQ
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    C81J c81j2 = C81J.this;
                    C83E c83e2 = c83e;
                    Boolean bool = (Boolean) obj;
                    UserSession userSession2 = c81j2.A0S;
                    if (C18U.A06(AbstractC166997dE.A0U(userSession2), userSession2, 36327533469317790L) && bool.booleanValue() && c83e2.A03) {
                        C05A c05a2 = c83e2.A06;
                        if (c05a2.getValue() != C83F.A02) {
                            c05a2.Egh(C83F.A04);
                        }
                    }
                }
            }));
        }
        C1825187q c1825187q = c1825387s.A02;
        AbstractC58232lf.A00(anonymousClass191, c1825187q.A06).A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8ZG
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                C05A c05a2;
                C83F c83f;
                InterfaceC1810081c interfaceC1810081c2 = interfaceC1810081c;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = touchInterceptorFrameLayout;
                InterfaceC1818984z interfaceC1818984z2 = interfaceC1818984z;
                C184418Gf c184418Gf2 = c184418Gf;
                C1821786b c1821786b2 = c1821786b;
                C1814382v c1814382v2 = c1814382v;
                C83C c83c2 = c83c;
                C8C0 c8c02 = c8c0;
                AnonymousClass860 anonymousClass8602 = anonymousClass860;
                C8TI c8ti2 = c8ti;
                C8HI c8hi2 = c8hi;
                C81J c81j2 = c81j;
                C1824787m c1824787m2 = c1824787m;
                C1825387s c1825387s2 = c1825387s;
                AnonymousClass880 anonymousClass8802 = anonymousClass880;
                C83E c83e2 = c83e;
                C89P c89p2 = c89p;
                C8FG c8fg2 = c8fg;
                C8XV c8xv2 = c8xv;
                InterfaceC09390do interfaceC09390do2 = interfaceC09390do;
                EnumC1825287r enumC1825287r = (EnumC1825287r) obj;
                if (interfaceC1810081c2.Cap()) {
                    int ordinal = enumC1825287r.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1 && touchInterceptorFrameLayout2.isLaidOut()) {
                            C8ZB.A02(c8hi2, c8xv2, c1821786b2, c184418Gf2, c81j2, anonymousClass8802, c8c02, c8fg2, anonymousClass8602, c8ti2, interfaceC1818984z2, c1814382v2, interfaceC1810081c2, c89p2, interfaceC09390do2, false, true);
                            c05a2 = c83e2.A06;
                            c83f = C83F.A02;
                        } else {
                            return;
                        }
                    } else {
                        if (!touchInterceptorFrameLayout2.isLaidOut()) {
                            return;
                        }
                        C8ZB.A01(c1825387s2, c1824787m2, c8hi2, c1821786b2, c83c2, c184418Gf2, c81j2, anonymousClass8802, c8c02, anonymousClass8602, c8ti2, interfaceC1818984z2, c1814382v2, false, true);
                        c05a2 = c83e2.A06;
                        c83f = C83F.A03;
                    }
                    c05a2.Egh(c83f);
                }
            }
        });
        C75M.A00(AbstractC58232lf.A00(anonymousClass191, c1825187q.A05)).A06(abstractC59962oe, new InterfaceC58362lv() { // from class: X.8ZH
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj) {
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = TouchInterceptorFrameLayout.this;
                InterfaceC09390do interfaceC09390do2 = interfaceC09390do;
                Number number = (Number) obj;
                if (touchInterceptorFrameLayout2.isLaidOut()) {
                    ((C172227lr) interfaceC09390do2.getValue()).A00(number.intValue());
                }
            }
        });
        if (c8rq != null) {
            c8rq.A00.A06(abstractC59962oe.getViewLifecycleOwner(), new InterfaceC58362lv() { // from class: X.8ZI
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    C188798Xv c188798Xv2 = C188798Xv.this;
                    if (((Boolean) obj).booleanValue()) {
                        c188798Xv2.A00().A0N(false);
                    }
                }
            });
            c8rq.A01.A06(abstractC59962oe.getViewLifecycleOwner(), new InterfaceC58362lv() { // from class: X.8ZJ
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    C8TI c8ti2 = c8ti;
                    C188798Xv c188798Xv2 = c188798Xv;
                    C1821786b c1821786b2 = c1821786b;
                    if (((Boolean) obj).booleanValue()) {
                        c8ti2.A0H.COs(null);
                        c188798Xv2.A00().A0L(false);
                        c1821786b2.A0H = true;
                    } else {
                        c1821786b2.A0H = false;
                    }
                    C1821786b.A06(c1821786b2);
                }
            });
            c8rq.A02.A06(abstractC59962oe.getViewLifecycleOwner(), new InterfaceC58362lv() { // from class: X.8ZK
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    C8TI c8ti2 = C8TI.this;
                    if (((Boolean) obj).booleanValue()) {
                        c8ti2.A0H.A00(c8ti2.A0P, c8ti2.A0O);
                    }
                }
            });
        }
    }
}
