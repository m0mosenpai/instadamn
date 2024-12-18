package X;

import android.app.Application;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.89P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89P extends C193578hc {
    public int A00;
    public int A01;
    public C22P A02;
    public C24H A03;
    public InterfaceC110214xq A04;
    public ClipsTemplateModel A05;
    public Medium A06;
    public EnumC222689s9 A07;
    public C84B A08;
    public User A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public C05A A0D;
    public boolean A0E;
    public boolean A0F;
    public final C2GT A0G;
    public final C2GT A0H;
    public final C89R A0I;
    public final C1828189b A0J;
    public final UserSession A0K;
    public final ClipsCreationViewModel A0L;
    public final C89N A0M;
    public final InterfaceC24731Iq A0N;
    public final InterfaceC19390xP A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C05A A0S;
    public final C0UO A0T;
    public final Application A0U;
    public final C05A A0V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89P(Application application, C89R c89r, C1828189b c1828189b, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C89N c89n) {
        super(application);
        int i;
        List BsT;
        C14360o3.A0B(clipsCreationViewModel, 3);
        C14360o3.A0B(c89r, 4);
        C14360o3.A0B(c1828189b, 6);
        this.A0U = application;
        this.A0K = userSession;
        this.A0L = clipsCreationViewModel;
        this.A0I = c89r;
        this.A0M = c89n;
        this.A0J = c1828189b;
        InterfaceC110214xq interfaceC110214xq = this.A04;
        if (interfaceC110214xq != null && (BsT = interfaceC110214xq.BsT()) != null) {
            i = BsT.size();
        } else {
            i = 0;
        }
        this.A0D = C10E.A00(Integer.valueOf(i));
        C008002u A00 = C10E.A00(null);
        this.A0Q = A00;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A0H = AbstractC58232lf.A00(anonymousClass191, A00);
        C008002u A002 = C10E.A00(null);
        this.A0P = A002;
        this.A0G = AbstractC58232lf.A00(anonymousClass191, A002);
        C008002u A003 = C10E.A00(C16930sl.A00);
        this.A0V = A003;
        this.A0T = AbstractC208910l.A02(A003);
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0N = c24721Ip;
        this.A0O = AbstractC208910l.A00(AbstractC141776au.A00(this), AbstractC07080Za.A03(c24721Ip), new C15020pI(0L), 1);
        this.A0R = new C008002u(false);
        this.A0S = new C008002u(EnumC1828289c.A07);
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new C9D0(this, null, 39), c89r.A04));
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new C9D0(this, null, 40), c1828189b.A05));
    }

    public static final void A00(final C89P c89p) {
        C121275eQ A04 = AbstractC50633MWu.A04(c89p.A0U.getApplicationContext(), c89p.A0K, new OUQ(c89p.A0B, "ClipsTemplateViewModel", true, false, false), -1L, false);
        c89p.A0P.Egh(null);
        A04.A00 = new C2AH() { // from class: X.9gy
            @Override // X.C2AH
            public final void onFail(Exception exc) {
                C14360o3.A0B(exc, 0);
                C89P c89p2 = C89P.this;
                c89p2.A0P.Egh(null);
                C25024B5f.A02(c89p2, AbstractC141776au.A00(c89p2), 48);
            }

            @Override // X.C2AH
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                C05A c05a;
                EnumC1828289c enumC1828289c;
                File file = (File) obj;
                C14360o3.A0B(file, 0);
                try {
                    Medium A03 = C8IU.A03(file, 3, (int) MY4.A02(file).A02);
                    C89P c89p2 = C89P.this;
                    if (c89p2.A0H()) {
                        c89p2.A06 = A03;
                        c89p2.A0M.A02(A03);
                        C25024B5f.A02(c89p2, AbstractC141776au.A00(c89p2), 49);
                        c05a = c89p2.A0S;
                        enumC1828289c = EnumC1828289c.A04;
                    } else {
                        c89p2.A0P.Egh(A03);
                        c05a = c89p2.A0S;
                        if (c89p2.A0M()) {
                            enumC1828289c = EnumC1828289c.A04;
                        } else {
                            enumC1828289c = EnumC1828289c.A02;
                        }
                    }
                    c05a.Egh(enumC1828289c);
                    AbstractC166997dE.A1Y(c89p2.A0R, true);
                } catch (IllegalArgumentException unused) {
                    C89P c89p3 = C89P.this;
                    c89p3.A0P.Egh(null);
                    AbstractC166987dD.A1Z(new PYv(c89p3, null, 0), AbstractC141776au.A00(c89p3));
                }
            }
        };
        C1GJ.A06(A04, 1365845790, 1, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0sl] */
    public static final void A01(C89P c89p) {
        C05A c05a;
        Object arrayList;
        Integer valueOf;
        C115475Kh c115475Kh;
        InterfaceC110214xq interfaceC110214xq = c89p.A04;
        if (interfaceC110214xq != null) {
            List BsT = interfaceC110214xq.BsT();
            if ((c89p.A0N() && c89p.A0A != null) || c89p.A01 >= BsT.size()) {
                c05a = c89p.A0V;
                arrayList = C16930sl.A00;
            } else {
                int i = c89p.A01;
                if (i == 0) {
                    c05a = c89p.A0V;
                    arrayList = AbstractC001800i.A0i(BsT, C17s.A0C(i, BsT.size()));
                } else {
                    C84B c84b = (C84B) c89p.A0L.A0c.getValue();
                    C14360o3.A0B(c84b, 0);
                    ArrayList A05 = c84b.A05();
                    C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.video.model.IgClipSegment>");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = A05.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                break;
                            }
                            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) next;
                            if (!(abstractC115485Ki instanceof C115475Kh) || (c115475Kh = (C115475Kh) abstractC115485Ki) == null || (valueOf = c115475Kh.A0H) == null) {
                                valueOf = Integer.valueOf(i2);
                            }
                            arrayList2.add(valueOf);
                            i2 = i3;
                        } else {
                            c05a = c89p.A0V;
                            arrayList = new ArrayList();
                            int i4 = 0;
                            for (Object obj : BsT) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    if (!arrayList2.contains(Integer.valueOf(i4))) {
                                        arrayList.add(obj);
                                    }
                                    i4 = i5;
                                }
                            }
                        }
                    }
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
            }
            c05a.Egh(arrayList);
            c89p.A0Q.Egh(EnumC189158Zj.A04);
            c89p.A0S.Egh(EnumC1828289c.A06);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0E() {
        this.A0S.Egh(EnumC1828289c.A05);
        this.A0Q.Egh(EnumC189158Zj.A07);
        this.A0I.A01();
    }

    public final void A0F() {
        EnumC189158Zj enumC189158Zj;
        C05A c05a;
        EnumC1828289c enumC1828289c;
        C05A c05a2 = this.A0Q;
        if (c05a2.getValue() == EnumC189158Zj.A04) {
            if (this.A00 > 0) {
                A0E();
                this.A0M.A00();
            } else {
                if (this.A0E) {
                    c05a2.Egh(EnumC189158Zj.A03);
                    c05a = this.A0S;
                } else {
                    if (A0K()) {
                        enumC189158Zj = EnumC189158Zj.A05;
                    } else {
                        enumC189158Zj = EnumC189158Zj.A03;
                    }
                    c05a2.Egh(enumC189158Zj);
                    c05a = this.A0S;
                    if (A0K()) {
                        enumC1828289c = EnumC1828289c.A04;
                        c05a.Egh(enumC1828289c);
                    }
                }
                enumC1828289c = EnumC1828289c.A02;
                c05a.Egh(enumC1828289c);
            }
        }
        this.A0A = null;
    }

    public final boolean A0I() {
        List BsT;
        InterfaceC110214xq interfaceC110214xq = this.A04;
        if (interfaceC110214xq != null && (BsT = interfaceC110214xq.BsT()) != null) {
            if ((BsT instanceof Collection) && BsT.isEmpty()) {
                return false;
            }
            Iterator it = BsT.iterator();
            while (it.hasNext()) {
                if (AbstractC189168Zk.A03((InterfaceC110074xc) it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A0J() {
        int i;
        Integer BTu;
        int i2 = this.A00;
        if (i2 < 1) {
            return false;
        }
        InterfaceC110214xq interfaceC110214xq = this.A04;
        if (interfaceC110214xq != null && (BTu = interfaceC110214xq.BTu()) != null) {
            i = BTu.intValue();
        } else {
            i = 3;
        }
        if (i2 < i) {
            return false;
        }
        return true;
    }

    public final boolean A0K() {
        if (this.A04 != null) {
            if (C18U.A06(C06090Tz.A05, this.A0K, 36322108925552640L)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0L() {
        if (this.A04 != null && ((!A0N() || this.A0A == null) && this.A07 != EnumC222689s9.A03)) {
            return true;
        }
        return false;
    }

    public final boolean A0M() {
        if (this.A04 != null) {
            C2GT c2gt = this.A0H;
            if (c2gt.A02() == EnumC189158Zj.A05 || c2gt.A02() == null) {
                if (C18U.A06(C06090Tz.A05, this.A0K, 36322108925552640L)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0N() {
        if (this.A04 != null && this.A07 != EnumC222689s9.A03) {
            return true;
        }
        return false;
    }

    public final void A0G(boolean z) {
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZW(this, (InterfaceC23621Ds) null, 17, z), A00);
    }

    public final boolean A0H() {
        if (A0M()) {
            if (C18U.A06(C06090Tz.A05, this.A0K, 36322108925683714L)) {
                return true;
            }
        }
        return false;
    }
}
