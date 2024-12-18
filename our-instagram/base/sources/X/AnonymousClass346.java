package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.346, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass346 implements AnonymousClass347 {
    @Override // X.AnonymousClass347
    public void Cu2(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
    }

    @Override // X.AnonymousClass347
    public void Cu3(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
    }

    @Override // X.AnonymousClass347
    public void DeT(View view, int i, Object obj, Object obj2) {
    }

    @Override // X.AnonymousClass347
    public void Ctt(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        InterfaceC43071ya interfaceC43071ya;
        if (this instanceof C680734v) {
            C680734v c680734v = (C680734v) this;
            InterfaceC60442pS interfaceC60442pS = c680734v.A02;
            if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
                c59072n8.A00(c680734v.A05);
            }
            if (AbstractC75423a9.A01(c38321qM, interfaceC60442pS)) {
                UserSession userSession = c680734v.A01;
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A06, userSession, 36324084610510720L)) {
                    interfaceC43071ya = new C105684pf(userSession);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof C679834m) {
            C679834m c679834m = (C679834m) this;
            InterfaceC60442pS interfaceC60442pS2 = c679834m.A01;
            if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS2) || !AbstractC75423a9.A01(c38321qM, interfaceC60442pS2)) {
                return;
            } else {
                interfaceC43071ya = c679834m.A00;
            }
        } else if (this instanceof C679234g) {
            C679234g c679234g = (C679234g) this;
            InterfaceC60442pS interfaceC60442pS3 = c679234g.A00;
            if (!AbstractC75423a9.A02(c38321qM, interfaceC60442pS3)) {
                if (AbstractC75423a9.A01(c38321qM, interfaceC60442pS3)) {
                    c59072n8.A00(c679234g.A05.A01);
                }
                interfaceC43071ya = c679234g.A02.A00;
            }
            c59072n8.A00(c679234g.A04.A00);
            interfaceC43071ya = c679234g.A02.A00;
        } else {
            if (this instanceof AnonymousClass345) {
                boolean CdW = c38321qM.CdW();
                InterfaceC673231x interfaceC673231x = ((AnonymousClass345) this).A00;
                if (CdW) {
                    interfaceC673231x.ABm(c59072n8);
                    return;
                } else {
                    interfaceC673231x.ABj(c59072n8);
                    return;
                }
            }
            if (this instanceof AnonymousClass368) {
                AnonymousClass368 anonymousClass368 = (AnonymousClass368) this;
                if (!c38321qM.A4i() && !c38321qM.A4z()) {
                    return;
                } else {
                    interfaceC43071ya = anonymousClass368.A00;
                }
            } else if (this instanceof C681735f) {
                interfaceC43071ya = ((C681735f) this).A01;
            } else if (this instanceof C682035i) {
                C682035i c682035i = (C682035i) this;
                if (!c75113Zb.A34) {
                    return;
                } else {
                    interfaceC43071ya = new C37331GcZ(c682035i.A00);
                }
            } else {
                if (this instanceof C36D) {
                    C36D.A00(c59072n8, c38321qM, (C36D) this);
                    return;
                }
                if (this instanceof C682135j) {
                    interfaceC43071ya = ((C682135j) this).A00;
                } else if (this instanceof C35I) {
                    C35I c35i = (C35I) this;
                    if (!c38321qM.CdW()) {
                        return;
                    } else {
                        interfaceC43071ya = c35i.A00;
                    }
                } else if (this instanceof C682535n) {
                    C682535n c682535n = (C682535n) this;
                    if (!c38321qM.CdW()) {
                        return;
                    } else {
                        interfaceC43071ya = c682535n.A00;
                    }
                } else if (this instanceof C36B) {
                    C36B c36b = (C36B) this;
                    if (!c38321qM.A4i() || !c38321qM.A4z()) {
                        return;
                    } else {
                        interfaceC43071ya = c36b.A00;
                    }
                } else if (this instanceof C76373bh) {
                    interfaceC43071ya = ((C76373bh) this).A00;
                } else if (!(this instanceof C76393bj)) {
                    return;
                } else {
                    interfaceC43071ya = ((C76393bj) this).A00;
                }
            }
        }
        c59072n8.A00(interfaceC43071ya);
    }

    @Override // X.AnonymousClass347
    public final void Ctu(C59072n8 c59072n8, C38321qM c38321qM, C42C c42c) {
        InterfaceC43071ya interfaceC43071ya;
        InterfaceC43071ya interfaceC43071ya2;
        if (this instanceof C35Y) {
            C35Y c35y = (C35Y) this;
            if (AbstractC75423a9.A02(c38321qM, c35y.A00)) {
                c59072n8.A00(c35y.A01);
                interfaceC43071ya = c35y.A02;
            } else {
                return;
            }
        } else if (this instanceof C35U) {
            C35U c35u = (C35U) this;
            C75993b4 c75993b4 = C75993b4.A00;
            int i = c42c.A01.A0E;
            if ((i != EnumC65592xv.A06.ordinal() && i != EnumC65592xv.A07.ordinal() && i != EnumC65592xv.A0F.ordinal() && i != EnumC65592xv.A0Y.ordinal() && i != EnumC65592xv.A1Q.ordinal() && i != EnumC65592xv.A1T.ordinal() && i != EnumC65592xv.A10.ordinal() && i != EnumC65592xv.A11.ordinal() && i != EnumC65592xv.A1b.ordinal() && i != EnumC65592xv.A1c.ordinal() && i != EnumC65592xv.A1G.ordinal() && i != EnumC65592xv.A1H.ordinal() && i != EnumC65592xv.A08.ordinal()) || !c75993b4.A05(c35u.A00, c38321qM, c35u.A01)) {
                return;
            } else {
                interfaceC43071ya = c35u.A02;
            }
        } else if (this instanceof C680734v) {
            C680734v c680734v = (C680734v) this;
            InterfaceC60442pS interfaceC60442pS = c680734v.A02;
            if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
                interfaceC43071ya = c680734v.A03;
            } else if (!AbstractC75423a9.A01(c38321qM, interfaceC60442pS)) {
                return;
            } else {
                interfaceC43071ya = c680734v.A04;
            }
        } else if (this instanceof C679234g) {
            C679234g c679234g = (C679234g) this;
            InterfaceC60442pS interfaceC60442pS2 = c679234g.A00;
            if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS2)) {
                interfaceC43071ya2 = c679234g.A03.A02;
            } else {
                if (!AbstractC75423a9.A01(c38321qM, interfaceC60442pS2)) {
                    return;
                }
                c59072n8.A00(c679234g.A03.A00);
                interfaceC43071ya2 = c679234g.A05.A00;
            }
            c59072n8.A00(interfaceC43071ya2);
            interfaceC43071ya = c679234g.A01.A00;
        } else if (!(this instanceof C681735f)) {
            return;
        } else {
            interfaceC43071ya = ((C681735f) this).A00;
        }
        c59072n8.A00(interfaceC43071ya);
    }

    @Override // X.AnonymousClass347
    public final void Ctv(C59072n8 c59072n8, C38321qM c38321qM, C79233gU c79233gU) {
        InterfaceC43071ya interfaceC43071ya;
        if (this instanceof AnonymousClass356) {
            AnonymousClass356 anonymousClass356 = (AnonymousClass356) this;
            if (anonymousClass356.A03) {
                c59072n8.A00(anonymousClass356.A02);
            }
            interfaceC43071ya = anonymousClass356.A00;
            if (interfaceC43071ya != null) {
                if (!C18U.A06(C06090Tz.A06, anonymousClass356.A01, 36313424501868514L)) {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof C35I) {
            C35I c35i = (C35I) this;
            if (!c38321qM.CdW()) {
                return;
            } else {
                interfaceC43071ya = c35i.A02;
            }
        } else {
            if (!(this instanceof C682535n)) {
                return;
            }
            C682535n c682535n = (C682535n) this;
            if (!c38321qM.CdW()) {
                return;
            } else {
                interfaceC43071ya = c682535n.A01;
            }
        }
        c59072n8.A00(interfaceC43071ya);
    }

    @Override // X.AnonymousClass347
    public final void Ctw(C59072n8 c59072n8) {
        if (this instanceof C35D) {
            c59072n8.A00(((C35D) this).A00);
        }
    }

    @Override // X.AnonymousClass347
    public void Ctx(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        InterfaceC43071ya interfaceC43071ya;
        if (this instanceof C680734v) {
            C680734v c680734v = (C680734v) this;
            InterfaceC60442pS interfaceC60442pS = c680734v.A02;
            if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS)) {
                c59072n8.A00(c680734v.A05);
            }
            if (AbstractC75423a9.A01(c38321qM, interfaceC60442pS)) {
                UserSession userSession = c680734v.A01;
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A06, userSession, 36324084610510720L)) {
                    interfaceC43071ya = new C105684pf(userSession);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this instanceof C679834m) {
            C679834m c679834m = (C679834m) this;
            InterfaceC60442pS interfaceC60442pS2 = c679834m.A01;
            if (AbstractC75423a9.A02(c38321qM, interfaceC60442pS2) || !AbstractC75423a9.A01(c38321qM, interfaceC60442pS2)) {
                return;
            } else {
                interfaceC43071ya = c679834m.A00;
            }
        } else if (this instanceof C679234g) {
            C679234g c679234g = (C679234g) this;
            InterfaceC60442pS interfaceC60442pS3 = c679234g.A00;
            if (!AbstractC75423a9.A02(c38321qM, interfaceC60442pS3)) {
                if (AbstractC75423a9.A01(c38321qM, interfaceC60442pS3)) {
                    c59072n8.A00(c679234g.A05.A01);
                }
                interfaceC43071ya = c679234g.A02.A00;
            }
            c59072n8.A00(c679234g.A04.A00);
            interfaceC43071ya = c679234g.A02.A00;
        } else {
            if (this instanceof AnonymousClass345) {
                boolean CdW = c38321qM.CdW();
                InterfaceC673231x interfaceC673231x = ((AnonymousClass345) this).A00;
                if (CdW) {
                    interfaceC673231x.ABm(c59072n8);
                    return;
                } else {
                    interfaceC673231x.ABj(c59072n8);
                    return;
                }
            }
            if (this instanceof C681735f) {
                interfaceC43071ya = ((C681735f) this).A01;
            } else {
                if (this instanceof C36D) {
                    C36D.A00(c59072n8, c38321qM, (C36D) this);
                    return;
                }
                if (this instanceof C682135j) {
                    interfaceC43071ya = ((C682135j) this).A00;
                } else if (this instanceof AnonymousClass368) {
                    AnonymousClass368 anonymousClass368 = (AnonymousClass368) this;
                    C33P c33p = anonymousClass368.A01;
                    if (!C3Q5.A04(c33p.A0A, c33p.A0D, c38321qM)) {
                        return;
                    } else {
                        interfaceC43071ya = anonymousClass368.A00;
                    }
                } else if (this instanceof C35I) {
                    C35I c35i = (C35I) this;
                    if (!c38321qM.CdW()) {
                        return;
                    }
                    c59072n8.A00(c35i.A03);
                    interfaceC43071ya = c35i.A01;
                } else if (this instanceof C682535n) {
                    C682535n c682535n = (C682535n) this;
                    if (!c38321qM.CdW()) {
                        return;
                    }
                    c59072n8.A00(c682535n.A02);
                    c59072n8.A00(c682535n.A05);
                    c59072n8.A00(c682535n.A07);
                    c59072n8.A00(c682535n.A03);
                    c59072n8.A00(c682535n.A04);
                    if (c38321qM.BRp() != EnumC40111tc.A0B) {
                        return;
                    } else {
                        interfaceC43071ya = c682535n.A06;
                    }
                } else if (this instanceof C76373bh) {
                    interfaceC43071ya = ((C76373bh) this).A00;
                } else if (!(this instanceof C76393bj)) {
                    return;
                } else {
                    interfaceC43071ya = ((C76393bj) this).A00;
                }
            }
        }
        c59072n8.A00(interfaceC43071ya);
    }

    @Override // X.AnonymousClass347
    public final void Cty(C59072n8 c59072n8) {
        if (this instanceof C35C) {
            c59072n8.A00((AbstractC64162vb) ((C35C) this).A00.getValue());
        }
    }

    @Override // X.AnonymousClass347
    public final void Cu0(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        if (this instanceof C35A) {
            c59072n8.A00(((C35A) this).A00);
        }
    }

    @Override // X.AnonymousClass347
    public final void pause() {
        C28091Xn c28091Xn;
        if (this instanceof C679834m) {
            c28091Xn = ((C679834m) this).A02;
        } else {
            if (this instanceof C679234g) {
                C679234g c679234g = (C679234g) this;
                C34Q c34q = c679234g.A03;
                ((AbstractC64162vb) c34q.A01).A01.A09();
                ((AbstractC64162vb) c34q.A03).A01.A09();
                ((AbstractC64162vb) c34q.A00).A01.A09();
                ((AbstractC64162vb) c34q.A02).A01.A09();
                C34Z c34z = c679234g.A05;
                ((AbstractC62682t7) c34z.A01).A02.A09();
                c34z.A00.A02.A09();
                return;
            }
            if (!(this instanceof C36D)) {
                return;
            } else {
                c28091Xn = ((C36D) this).A03;
            }
        }
        C28091Xn.A01(c28091Xn, c28091Xn.A00);
    }
}
