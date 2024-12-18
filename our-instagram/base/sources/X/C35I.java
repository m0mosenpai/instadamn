package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.35I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35I extends AnonymousClass346 {
    public final AbstractC64292vo A00;
    public final AbstractC64292vo A01;
    public final AbstractC64292vo A02;
    public final AbstractC64292vo A03;
    public final AbstractC64292vo A04;
    public final AbstractC64292vo A05;
    public final AbstractC64292vo A06;
    public final AbstractC64292vo A07;
    public final AbstractC64292vo A08;
    public final AbstractC64292vo A09;
    public final AbstractC64292vo A0A;
    public final AbstractC64292vo A0B;
    public final AbstractC64292vo A0C;

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu2(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c59072n8, 0);
        C14360o3.A0B(c38321qM, 1);
        if (c38321qM.CdW()) {
            c59072n8.A00(this.A0B);
        }
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu3(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        AbstractC64292vo abstractC64292vo;
        C14360o3.A0B(c59072n8, 1);
        C14360o3.A0B(c38321qM, 2);
        if (c38321qM.CdW()) {
            if (i != EnumC65592xv.A0g.ordinal() && i != EnumC65592xv.A0o.ordinal() && i != EnumC65592xv.A13.ordinal()) {
                if (i == EnumC65592xv.A0U.ordinal()) {
                    abstractC64292vo = this.A0C;
                } else if (i != EnumC65592xv.A0c.ordinal() && i != EnumC65592xv.A06.ordinal() && i != EnumC65592xv.A1c.ordinal()) {
                    if (i == EnumC65592xv.A09.ordinal()) {
                        abstractC64292vo = this.A04;
                    } else if (i == EnumC65592xv.A0z.ordinal()) {
                        abstractC64292vo = this.A08;
                    } else if (i == EnumC65592xv.A14.ordinal()) {
                        abstractC64292vo = this.A09;
                    } else if (i == EnumC65592xv.A0h.ordinal()) {
                        abstractC64292vo = this.A06;
                    } else if (i != EnumC65592xv.A0f.ordinal()) {
                        return;
                    } else {
                        abstractC64292vo = this.A05;
                    }
                } else {
                    abstractC64292vo = this.A07;
                }
            } else {
                abstractC64292vo = this.A0A;
            }
            c59072n8.A00(abstractC64292vo);
        }
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void DeT(View view, int i, Object obj, Object obj2) {
        AbstractC64292vo abstractC64292vo;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(obj, 2);
        if ((obj instanceof C38321qM) && ((C38321qM) obj).CdW()) {
            if (i != EnumC65592xv.A0g.ordinal() && i != EnumC65592xv.A0o.ordinal() && i != EnumC65592xv.A13.ordinal()) {
                if (i != EnumC65592xv.A0c.ordinal() && i != EnumC65592xv.A06.ordinal() && i != EnumC65592xv.A1c.ordinal()) {
                    if (i == EnumC65592xv.A09.ordinal()) {
                        abstractC64292vo = this.A04;
                    } else if (i == EnumC65592xv.A0z.ordinal()) {
                        abstractC64292vo = this.A08;
                    } else if (i != EnumC65592xv.A0n.ordinal() && i != EnumC65592xv.A0w.ordinal()) {
                        if (i == EnumC65592xv.A0B.ordinal()) {
                            abstractC64292vo = this.A00;
                        } else if (i == EnumC65592xv.A0G.ordinal()) {
                            abstractC64292vo = this.A01;
                        } else if (i == EnumC65592xv.A0v.ordinal()) {
                            abstractC64292vo = this.A02;
                        } else if (i == EnumC65592xv.A14.ordinal()) {
                            abstractC64292vo = this.A09;
                        } else if (i == EnumC65592xv.A0h.ordinal()) {
                            abstractC64292vo = this.A06;
                        } else if (i != EnumC65592xv.A0f.ordinal()) {
                            return;
                        } else {
                            abstractC64292vo = this.A05;
                        }
                    } else {
                        abstractC64292vo = this.A03;
                    }
                } else {
                    abstractC64292vo = this.A07;
                }
            } else {
                abstractC64292vo = this.A0A;
            }
            abstractC64292vo.A00.put(obj, view);
        }
    }

    public C35I(final UserSession userSession, final InterfaceC60442pS interfaceC60442pS) {
        this.A0B = new AbstractC64292vo(userSession, interfaceC60442pS) { // from class: X.35J
            public final C18920wW A00;
            public final UserSession A01;
            public final InterfaceC60442pS A02;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                String str;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                Object obj = c59062n7.A03;
                C38321qM c38321qM = (C38321qM) obj;
                String id = c38321qM.getId();
                if (id != null) {
                    C115785Lr c115785Lr = (C115785Lr) C115775Lq.A02.get(id);
                    if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
                        if (c115785Lr != null && (!c115785Lr.A01.isEmpty()) && c115785Lr.A02 && c115785Lr.A03) {
                            C14360o3.A06(obj);
                            LinkedHashMap A02 = AbstractC77703du.A02(id);
                            if (!A02.isEmpty()) {
                                C18920wW c18920wW = this.A00;
                                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_rendering_validation_automatic");
                                if (A00.isSampled()) {
                                    String A07 = AbstractC41071vF.A07(this.A01, c38321qM);
                                    String str2 = "";
                                    if (A07 == null) {
                                        A07 = "";
                                    }
                                    A00.AAP("ad_id", A07);
                                    User CDj = c38321qM.A0C.CDj();
                                    if (CDj == null) {
                                        str = "";
                                    } else {
                                        str = CDj.getId();
                                    }
                                    A00.AAP("a_pk", str);
                                    A00.AAP("m_pk", id);
                                    String A33 = c38321qM.A33();
                                    if (A33 == null) {
                                        A33 = "";
                                    }
                                    A00.AAP("tracking_token", A33);
                                    String moduleName = this.A02.getModuleName();
                                    if (moduleName != null) {
                                        str2 = moduleName;
                                    }
                                    A00.AAP("source_of_action", str2);
                                    A00.AAP("fb_locale", C1Q2.A00());
                                    A00.AAP("country", C1Q2.A02().getCountry());
                                    A00.AAP("media_type", c38321qM.BRp().name());
                                    A00.A9M("pc_component_dict_new", A02);
                                    A00.A7v("is_dark_mode", Boolean.valueOf(C1H6.A03()));
                                    A00.Cht();
                                }
                            }
                        }
                        C115775Lq.A03(id);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            {
                super(userSession);
                this.A01 = userSession;
                this.A02 = interfaceC60442pS;
                this.A00 = AbstractC12220kQ.A00(interfaceC60442pS, C12180kM.A05, userSession);
            }
        };
        this.A0A = new AbstractC64292vo(userSession) { // from class: X.35K
            public final C65502xm A00;
            public final C35L A01;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                C35L c35l = this.A01;
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                c35l.A00((View) super.A00.get(obj), c59062n7, interfaceC57162jr);
            }

            {
                super(userSession);
                java.util.Set set;
                C65502xm A00 = AbstractC65492xl.A00(userSession);
                this.A00 = A00;
                if (A00.A0I) {
                    set = AbstractC16830sb.A07(EnumC77663dq.A03, EnumC77663dq.A05, EnumC77663dq.A04);
                } else {
                    set = C16910sj.A00;
                }
                this.A01 = new C35L(userSession, set, new C9E6(this, 5));
            }
        };
        this.A0C = new AbstractC64292vo(userSession);
        this.A04 = new AbstractC64292vo(userSession);
        this.A08 = new AbstractC64292vo(userSession);
        this.A03 = new AbstractC64292vo(userSession);
        this.A07 = new AbstractC64292vo(userSession) { // from class: X.35P
            public final C35L A00;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                C35L c35l = this.A00;
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                c35l.A00((View) super.A00.get(obj), c59062n7, interfaceC57162jr);
            }

            {
                super(userSession);
                this.A00 = new C35L(userSession, C16910sj.A00, new C9E6(this, 4));
            }
        };
        this.A00 = new AbstractC64292vo(userSession);
        this.A01 = new AbstractC64292vo(userSession);
        this.A02 = new AbstractC64292vo(userSession);
        this.A09 = new AbstractC64292vo(userSession);
        this.A05 = new AbstractC64292vo(userSession);
        this.A06 = new AbstractC64292vo(userSession);
    }
}
