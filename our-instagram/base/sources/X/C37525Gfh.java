package X;

import com.facebook.pando.TreeJNI;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.UserTagInfoDictIntf;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.FollowStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gfh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37525Gfh extends AbstractC39459Hbl {
    public int A00;
    public C50526MSf A01;
    public final ClipsViewerSource A02;
    public final List A03;
    public final java.util.Set A04;
    public final C37644Ghd A05;
    public final InterfaceC41501vz A06;
    public final InterfaceC41501vz A07;
    public final UserSession A08;
    public final Map A09;
    public final java.util.Set A0A;
    public final boolean A0B;

    public C37525Gfh(ClipsViewerSource clipsViewerSource, UserSession userSession, boolean z) {
        AbstractC167007dF.A1D(userSession, 1, clipsViewerSource);
        this.A08 = userSession;
        this.A02 = clipsViewerSource;
        this.A0B = z;
        this.A03 = AbstractC166987dD.A1E();
        this.A04 = AbstractC31171DnF.A0l();
        this.A09 = AbstractC166987dD.A1I();
        this.A01 = new C50526MSf(3, 4, false);
        C37816GkW A00 = C37816GkW.A00(this, 49);
        this.A07 = A00;
        C37816GkW A002 = C37816GkW.A00(this, 48);
        this.A06 = A002;
        C25671My A003 = AbstractC25651Mw.A00(userSession);
        A003.A01(A00, C57452kK.class);
        A003.A01(A002, C3MC.class);
        FollowStatus followStatus = FollowStatus.A08;
        EnumC39535Hd6 enumC39535Hd6 = EnumC39535Hd6.A03;
        EnumC75193Zm enumC75193Zm = EnumC75193Zm.A0F;
        C51737MtK c51737MtK = new C51737MtK(7);
        Float valueOf = Float.valueOf(0.0f);
        this.A05 = new C37644Ghd(c51737MtK, null, null, enumC39535Hd6, enumC75193Zm, null, null, followStatus, null, null, null, null, new C09530e4(valueOf, valueOf), 0, 0, false, false, true, false, false, false, false, false, false, true, true, true, false, true, false, false, false, false, false, false);
        this.A0A = AbstractC16830sb.A07(new AnonymousClass019() { // from class: X.JFF
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0f);
            }
        }, new AnonymousClass019() { // from class: X.JFG
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0T);
            }
        }, new AnonymousClass019() { // from class: X.JFH
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0U);
            }
        }, new AnonymousClass019() { // from class: X.JFI
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0D;
            }
        }, new AnonymousClass019() { // from class: X.JFJ
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0C;
            }
        }, new AnonymousClass019() { // from class: X.JFK
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0M);
            }
        }, new AnonymousClass019() { // from class: X.JFL
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0c);
            }
        }, new AnonymousClass019() { // from class: X.JFM
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0d);
            }
        }, new AnonymousClass019() { // from class: X.JFN
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0b);
            }
        }, new AnonymousClass019() { // from class: X.JF6
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0a);
            }
        }, new AnonymousClass019() { // from class: X.JF7
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0e);
            }
        }, new AnonymousClass019() { // from class: X.JF8
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0P);
            }
        }, J7B.A00, new AnonymousClass019() { // from class: X.JF9
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0Y);
            }
        }, new AnonymousClass019() { // from class: X.JFA
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0B;
            }
        }, new AnonymousClass019() { // from class: X.JFB
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0R);
            }
        }, new AnonymousClass019() { // from class: X.JFC
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0S);
            }
        }, new AnonymousClass019() { // from class: X.JFD
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0Q);
            }
        }, new AnonymousClass019() { // from class: X.JFE
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Integer.valueOf(((C37644Ghd) obj).A07);
            }
        });
    }

    @Override // X.AbstractC37552Gg8
    public int A0C(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        A07("getIndexOfItem", AbstractC06930Yk.A0E());
        Iterator it = this.A03.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!C14360o3.A0K(((C120985dq) it.next()).A0C(), c120985dq.A0C())) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC37552Gg8
    public List A0L(EnumC129395t1 enumC129395t1) {
        C14360o3.A0B(enumC129395t1, 0);
        List A00 = A00(this, "getItemsOfType()");
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A00) {
            if (((C120985dq) obj).A01 == enumC129395t1) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // X.AbstractC37552Gg8
    public void A0S(C120985dq c120985dq, C120985dq c120985dq2) {
        C14360o3.A0B(c120985dq, 0);
        List A00 = A00(this, "swapItem()");
        int indexOf = A00.indexOf(c120985dq);
        if (indexOf >= 0) {
            A00.set(indexOf, c120985dq2);
            A0Q(c120985dq2, indexOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC37552Gg8
    public void A0T(C120985dq c120985dq, PeopleTag peopleTag) {
        ArrayList arrayList;
        InterfaceC84523py CEF;
        Object A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (CEF = c38321qM.A0C.CEF()) != 0) {
            ArrayList A0U = AbstractC001800i.A0U(CEF.CIr());
            A0U.removeIf(new C31424DrU(7, C43362JEd.A01(peopleTag, 33)));
            InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
            CEF.CIr();
            AbstractC37302Gc3.A0n();
            if (CEF instanceof C38005Gnq) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A0U.iterator();
                while (it.hasNext()) {
                    UserTagInfoDictIntf userTagInfoDictIntf = (UserTagInfoDictIntf) it.next();
                    if (userTagInfoDictIntf != null) {
                        A1E.add(userTagInfoDictIntf.F7o());
                    }
                }
                TreeJNI treeJNI = (TreeJNI) CEF;
                A00 = AbstractC25234BEr.A0P(treeJNI, AbstractC167007dF.A0n("in", A1E)).applyToTree(treeJNI);
                C14360o3.A07(A00);
            } else {
                A00 = AbstractC40442HwX.A00(A0U);
            }
            interfaceC38831rF.Egf((InterfaceC84523py) A00);
        }
        List list = c120985dq.A0S;
        if (list != null) {
            arrayList = AbstractC166987dD.A1F(list);
            arrayList.remove(peopleTag);
        } else {
            arrayList = null;
        }
        InterfaceC120995dr interfaceC120995dr = c120985dq.A0G;
        String str = c120985dq.A0P;
        String str2 = c120985dq.A0M;
        boolean z = c120985dq.A0Y;
        boolean z2 = c120985dq.A0W;
        EnumC129395t1 enumC129395t1 = c120985dq.A01;
        C38321qM c38321qM2 = c120985dq.A02;
        EnumC40111tc enumC40111tc = c120985dq.A0J;
        AdFormatType adFormatType = c120985dq.A0E;
        List list2 = c120985dq.A0R;
        InterfaceC87893vx interfaceC87893vx = c120985dq.A0F;
        String str3 = c120985dq.A0Q;
        String str4 = c120985dq.A0O;
        long j = c120985dq.A0D;
        EnumC76383bi enumC76383bi = c120985dq.A0I;
        String str5 = c120985dq.A0N;
        String str6 = c120985dq.A0L;
        boolean z3 = c120985dq.A0V;
        boolean z4 = c120985dq.A0a;
        boolean z5 = c120985dq.A0Z;
        int i = c120985dq.A0C;
        C5HS c5hs = c120985dq.A0H;
        boolean z6 = c120985dq.A0U;
        List list3 = c120985dq.A0T;
        List list4 = c120985dq.A08;
        Integer num = c120985dq.A04;
        Integer num2 = c120985dq.A05;
        Long l = c120985dq.A06;
        String str7 = c120985dq.A07;
        boolean z7 = c120985dq.A0A;
        int i2 = c120985dq.A00;
        Integer num3 = c120985dq.A03;
        boolean z8 = c120985dq.A09;
        AbstractC167007dF.A1G(interfaceC120995dr, 0, enumC129395t1);
        C14360o3.A0B(enumC76383bi, 14);
        C14360o3.A0B(num3, 32);
        A0S(c120985dq, new C120985dq(adFormatType, interfaceC87893vx, interfaceC120995dr, enumC129395t1, c5hs, c38321qM2, enumC76383bi, enumC40111tc, num, num2, num3, l, str, str2, str3, str4, str5, str6, str7, list2, arrayList, list3, list4, i, i2, j, z, z2, z3, z4, z5, z6, z7, z8));
    }

    @Override // X.AbstractC37552Gg8
    public void A0U(C120985dq c120985dq, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        List A00 = A00(this, "removeItem()");
        int indexOf = A00.indexOf(c120985dq);
        if (indexOf >= 0) {
            this.A04.remove(c120985dq.A0C());
            A00.remove(indexOf);
            A01(indexOf);
        }
        A0N();
    }

    @Override // X.AbstractC37552Gg8
    public void A0W(List list) {
        C38321qM c38321qM;
        if (this.A03.isEmpty() && this.A02 == ClipsViewerSource.A0s) {
            UserSession userSession = this.A08;
            if (C7M3.A01(userSession) || C7M3.A00(userSession)) {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C120985dq c120985dq = (C120985dq) it.next();
                    boolean z = true;
                    if (i != list.size() - 1) {
                        z = false;
                    }
                    A04(c120985dq, this, z);
                    i++;
                }
                return;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C120985dq c120985dq2 = (C120985dq) it2.next();
            A04(c120985dq2, this, false);
            if (c120985dq2.A01 == EnumC129395t1.A0G && (c38321qM = c120985dq2.A02) != null) {
                c38321qM.A3x();
            }
        }
        A0N();
    }

    @Override // X.AbstractC37552Gg8
    public boolean A0b(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        return this.A04.contains(c120985dq.A0C());
    }

    @Override // X.AbstractC37552Gg8
    public boolean A0c(C120985dq c120985dq, int i) {
        if (!this.A04.add(c120985dq.A0C()) && c120985dq.A08 == null) {
            return false;
        }
        A07("insertItem()", AbstractC25233BEq.A0p("size", String.valueOf(A0B()), AbstractC166987dD.A1L("pos", String.valueOf(i))));
        this.A03.add(i, c120985dq);
        A01(i);
        A0N();
        return true;
    }

    @Override // X.AbstractC39459Hbl
    public void A0g(C120985dq c120985dq, boolean z) {
        A05(c120985dq, true, new C25310BIf(true, 36), new AnonymousClass019() { // from class: X.JEu
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0W);
            }
        });
    }

    @Override // X.AbstractC39459Hbl
    public void A0h(C120985dq c120985dq, boolean z) {
        A05(c120985dq, true, new C25310BIf(true, 37), new AnonymousClass019() { // from class: X.JEv
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0V);
            }
        });
    }

    @Override // X.InterfaceC61782rf
    public C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C75113Zb c75113Zb = C09(C120985dq.A0d.A04(c38321qM)).A0E;
        if (c75113Zb != null) {
            return c75113Zb;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JPb
    public C37644Ghd C09(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        Map map = this.A09;
        Object obj = map.get(c120985dq);
        if (obj == null) {
            UserSession userSession = this.A08;
            obj = AbstractC37652Ghl.A01(c120985dq, userSession, C3YS.A00(userSession), null, new C37648Ghh(new InterfaceC43393JFi[]{EnumC37742GjH.A06, EnumC37742GjH.A03, EnumC37742GjH.A05, EnumC37742GjH.A04, EnumC37742GjH.A02}));
            map.put(c120985dq, obj);
        }
        return (C37644Ghd) obj;
    }

    @Override // X.JPb
    public List C0A(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        if (c120985dq.A0G()) {
            List A01 = C42159Im7.A01(c120985dq);
            ArrayList A0q = AbstractC167017dG.A0q(A01);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                A0q.add(C09(C128085qc.A03((C40971v4) it.next())));
            }
            return A0q;
        }
        throw AbstractC166987dD.A12("expecting clipsItem type MULTI_ADS");
    }

    @Override // X.InterfaceC31077DlK
    public void ERo(C120985dq c120985dq, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 28), new AnonymousClass019() { // from class: X.JEm
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0M);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EVG(C120985dq c120985dq, boolean z) {
        A05(c120985dq, true, new C25310BIf(true, 29), new AnonymousClass019() { // from class: X.JEp
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0N);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EWM(C120985dq c120985dq, boolean z) {
        A05(c120985dq, true, new C25310BIf(true, 30), new AnonymousClass019() { // from class: X.GmA
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0O);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EWT(C120985dq c120985dq, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 33), new AnonymousClass019() { // from class: X.GrW
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0R);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EWU(C120985dq c120985dq, boolean z) {
        C14360o3.A0B(c120985dq, 0);
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 34), new AnonymousClass019() { // from class: X.JEs
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0S);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EX0(C120985dq c120985dq, Integer num) {
        C14360o3.A0B(c120985dq, 0);
        A03(c120985dq, this, num, new AnonymousClass019() { // from class: X.Gik
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0J;
            }
        }, 18);
    }

    @Override // X.InterfaceC31077DlK
    public void Ea3(C120985dq c120985dq, boolean z) {
        A05(c120985dq, true, new C25310BIf(true, 41), new AnonymousClass019() { // from class: X.JEw
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0U);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EcV(C120985dq c120985dq, EnumC39550HdM enumC39550HdM) {
        C14360o3.A0B(c120985dq, 0);
        if (enumC39550HdM != null) {
            A03(c120985dq, this, enumC39550HdM, new AnonymousClass019() { // from class: X.JEx
                @Override // X.AnonymousClass019, X.InterfaceC016606k
                public final Object get(Object obj) {
                    return ((C37644Ghd) obj).A0B;
                }
            }, 19);
        }
    }

    @Override // X.InterfaceC31077DlK
    public void Ecj(C120985dq c120985dq, EnumC75193Zm enumC75193Zm) {
        C14360o3.A0B(enumC75193Zm, 1);
        A03(c120985dq, this, enumC75193Zm, new AnonymousClass019() { // from class: X.JEy
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0D;
            }
        }, 20);
    }

    @Override // X.InterfaceC31077DlK
    public void Edn(C120985dq c120985dq, EnumC39535Hd6 enumC39535Hd6) {
        C14360o3.A0B(enumC39535Hd6, 1);
        A03(c120985dq, this, enumC39535Hd6, new AnonymousClass019() { // from class: X.JEz
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0C;
            }
        }, 21);
    }

    @Override // X.InterfaceC31077DlK
    public void Ee8(C120985dq c120985dq, boolean z) {
        A05(c120985dq, false, new C25310BIf(false, 45), new AnonymousClass019() { // from class: X.JF3
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0d);
            }
        });
    }

    public static void A02(C120985dq c120985dq, C37525Gfh c37525Gfh, int i, int i2) {
        c37525Gfh.A06(c120985dq, new C25512BQa(i, i2));
    }

    public static void A03(C120985dq c120985dq, C37525Gfh c37525Gfh, Object obj, InterfaceC016606k interfaceC016606k, int i) {
        c37525Gfh.A05(c120985dq, obj, new DRR(obj, i), interfaceC016606k);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0pQ, java.lang.Object] */
    public static final void A04(C120985dq c120985dq, C37525Gfh c37525Gfh, boolean z) {
        if (!c37525Gfh.A04.add(c120985dq.A0C()) && c120985dq.A08 == null) {
            return;
        }
        ?? obj = new Object();
        obj.A00 = c37525Gfh.A0B();
        if (c37525Gfh.A0B) {
            obj.A00 = 0;
        }
        A07("addItemInternal()", AbstractC06930Yk.A0E());
        c37525Gfh.A06(c120985dq, new DRR(obj, 13));
        c37525Gfh.A03.add(obj.A00, c120985dq);
        if (!z) {
            return;
        }
        c37525Gfh.A0N();
    }

    @Override // X.AbstractC37552Gg8
    public int A0B() {
        A07("size()", AbstractC06930Yk.A0E());
        return this.A03.size();
    }

    @Override // X.AbstractC37552Gg8
    public int A0D(C38321qM c38321qM) {
        Iterator it = A00(this, "getIndexOdMedia()").iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!C14360o3.A0K(((C120985dq) it.next()).A02, c38321qM)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // X.AbstractC37552Gg8
    public List A0J() {
        A07("getItems", AbstractC06930Yk.A0E());
        return this.A03;
    }

    @Override // X.AbstractC37552Gg8
    public void A0O() {
        A00(this, "clear()").clear();
        this.A04.clear();
        this.A09.clear();
        A0N();
    }

    @Override // X.AbstractC37552Gg8
    public void A0R(C120985dq c120985dq, int i) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            c38321qM.A03 = i;
        }
        c120985dq.A00 = i;
    }

    @Override // X.AbstractC37552Gg8
    public void A0V(String str, int i) {
        C38661Gz2 A02;
        List list = this.A03;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                C120985dq A0A = AbstractC37300Gc1.A0A(it);
                if (A0A.A0H()) {
                    C38661Gz2 A022 = A0A.A02();
                    if (A022 != null) {
                        str2 = A022.A09;
                    }
                    if (C14360o3.A0K(str2, str)) {
                        if (i2 != -1 && (A02 = ((C120985dq) list.get(i2)).A02()) != null) {
                            C120985dq c120985dq = (C120985dq) list.get(i2);
                            Integer valueOf = Integer.valueOf(i);
                            String str3 = A02.A09;
                            String str4 = A02.A0B;
                            Integer num = A02.A03;
                            String str5 = A02.A0E;
                            C38321qM c38321qM = A02.A01;
                            String str6 = A02.A0D;
                            String str7 = A02.A0A;
                            String str8 = A02.A07;
                            String str9 = A02.A05;
                            String str10 = A02.A06;
                            boolean z = A02.A0H;
                            Long l = A02.A04;
                            String str11 = A02.A08;
                            InterfaceC43509JJv interfaceC43509JJv = A02.A00;
                            List list2 = A02.A0F;
                            List list3 = A02.A0G;
                            String str12 = A02.A0C;
                            AbstractC167017dG.A1Q(str4, str5);
                            C38225GrU c38225GrU = new C38225GrU(new C38661Gz2(interfaceC43509JJv, c38321qM, num, valueOf, l, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list2, list3, z));
                            String str13 = c120985dq.A0P;
                            String str14 = c120985dq.A0M;
                            boolean z2 = c120985dq.A0Y;
                            boolean z3 = c120985dq.A0W;
                            EnumC129395t1 enumC129395t1 = c120985dq.A01;
                            C38321qM c38321qM2 = c120985dq.A02;
                            EnumC40111tc enumC40111tc = c120985dq.A0J;
                            AdFormatType adFormatType = c120985dq.A0E;
                            List list4 = c120985dq.A0R;
                            InterfaceC87893vx interfaceC87893vx = c120985dq.A0F;
                            String str15 = c120985dq.A0Q;
                            String str16 = c120985dq.A0O;
                            long j = c120985dq.A0D;
                            EnumC76383bi enumC76383bi = c120985dq.A0I;
                            String str17 = c120985dq.A0N;
                            String str18 = c120985dq.A0L;
                            boolean z4 = c120985dq.A0V;
                            boolean z5 = c120985dq.A0a;
                            boolean z6 = c120985dq.A0Z;
                            int i3 = c120985dq.A0C;
                            C5HS c5hs = c120985dq.A0H;
                            List list5 = c120985dq.A0S;
                            boolean z7 = c120985dq.A0U;
                            List list6 = c120985dq.A0T;
                            List list7 = c120985dq.A08;
                            Integer num2 = c120985dq.A04;
                            Integer num3 = c120985dq.A05;
                            Long l2 = c120985dq.A06;
                            String str19 = c120985dq.A07;
                            boolean z8 = c120985dq.A0A;
                            int i4 = c120985dq.A00;
                            Integer num4 = c120985dq.A03;
                            boolean z9 = c120985dq.A09;
                            C14360o3.A0B(enumC129395t1, 5);
                            C14360o3.A0B(enumC76383bi, 14);
                            C14360o3.A0B(num4, 32);
                            C120985dq c120985dq2 = new C120985dq(adFormatType, interfaceC87893vx, c38225GrU, enumC129395t1, c5hs, c38321qM2, enumC76383bi, enumC40111tc, num2, num3, num4, l2, str13, str14, str15, str16, str17, str18, str19, list4, list5, list6, list7, i3, i4, j, z2, z3, z4, z5, z6, z7, z8, z9);
                            list.set(i2, c120985dq2);
                            A0Q(c120985dq2, i2);
                            return;
                        }
                        return;
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // X.AbstractC37552Gg8
    public void A0X(List list) {
        A00(this, "updateItems()").clear();
        this.A04.clear();
        this.A09.clear();
        A0W(list);
    }

    @Override // X.AbstractC37552Gg8
    public void A0Y(boolean z) {
        C50526MSf c50526MSf = this.A01;
        C50526MSf c50526MSf2 = new C50526MSf(z, c50526MSf.A00, 4);
        this.A01 = c50526MSf2;
        if (!c50526MSf.equals(c50526MSf2)) {
            C11T.A03(new Runnable() { // from class: X.J3v
                @Override // java.lang.Runnable
                public final void run() {
                    C37525Gfh.this.A0N();
                }
            });
        }
    }

    @Override // X.AbstractC37552Gg8
    public boolean A0a() {
        List A00 = A00(this, "hasContent()");
        if ((A00 instanceof Collection) && A00.isEmpty()) {
            return false;
        }
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            EnumC129395t1 enumC129395t1 = ((C120985dq) it.next()).A01;
            if (enumC129395t1 != EnumC129395t1.A0M && enumC129395t1 != EnumC129395t1.A08) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC39459Hbl
    public List A0e(java.util.Set set) {
        List A00 = A00(this, "getItemsOfTypes()");
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A00) {
            if (set.contains(((C120985dq) obj).A01)) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // X.InterfaceC31077DlK
    public void CNF(C120985dq c120985dq) {
        A05(c120985dq, null, C38243Grm.A00, new AnonymousClass019() { // from class: X.Grl
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Integer.valueOf(((C37644Ghd) obj).A08);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void ERE(C120985dq c120985dq, Integer num) {
        A03(c120985dq, this, num, new AnonymousClass019() { // from class: X.JEk
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0H;
            }
        }, 14);
    }

    @Override // X.InterfaceC31077DlK
    public void ERn(C45127Jxw c45127Jxw, C120985dq c120985dq) {
        A03(c120985dq, this, c45127Jxw, new AnonymousClass019() { // from class: X.JEl
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0A;
            }
        }, 15);
    }

    @Override // X.InterfaceC31077DlK
    public void ETD(C120985dq c120985dq, String str) {
        A05(c120985dq, str, new DHI(str, 20), new AnonymousClass019() { // from class: X.GmC
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0K;
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public final void EUA(C120985dq c120985dq, int i) {
        A05(c120985dq, Integer.valueOf(i), new C25512BQa(i, 18), new AnonymousClass019() { // from class: X.JEn
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Integer.valueOf(((C37644Ghd) obj).A07);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EUB(C120985dq c120985dq, C09530e4 c09530e4) {
        A03(c120985dq, this, c09530e4, new AnonymousClass019() { // from class: X.JEo
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0L;
            }
        }, 16);
    }

    @Override // X.InterfaceC31077DlK
    public void EUw(C120985dq c120985dq, int i) {
        A02(c120985dq, this, i, 19);
    }

    @Override // X.InterfaceC31077DlK
    public void EUx(C120985dq c120985dq, int i) {
        A02(c120985dq, this, i, 20);
    }

    @Override // X.InterfaceC31077DlK
    public final void EUy(C120985dq c120985dq, int i) {
        A02(c120985dq, this, i, 21);
    }

    @Override // X.InterfaceC31077DlK
    public void EUz(C120985dq c120985dq, int i) {
        A02(c120985dq, this, i, 22);
    }

    @Override // X.InterfaceC31077DlK
    public void EV0(C120985dq c120985dq, int i) {
        A02(c120985dq, this, i, 23);
    }

    @Override // X.InterfaceC31077DlK
    public void EV1(C120985dq c120985dq, int i) {
        A02(c120985dq, this, i, 24);
    }

    @Override // X.InterfaceC31077DlK
    public void EWO(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 31), new AnonymousClass019() { // from class: X.JEq
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0P);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EWQ(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 32), new AnonymousClass019() { // from class: X.JEr
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0Q);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EWb(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 35), new AnonymousClass019() { // from class: X.JEt
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0T);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EWe(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 38), new AnonymousClass019() { // from class: X.GmB
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0X);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EWf(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 39), new AnonymousClass019() { // from class: X.Gif
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0Y);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EWj(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 40), new AnonymousClass019() { // from class: X.Gil
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0Z);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public final void EWw(C120985dq c120985dq, int i) {
        A02(c120985dq, this, i, 25);
    }

    @Override // X.InterfaceC31077DlK
    public void EWy(C120985dq c120985dq, Integer num) {
        A03(c120985dq, this, num, new AnonymousClass019() { // from class: X.Glb
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return ((C37644Ghd) obj).A0I;
            }
        }, 17);
    }

    @Override // X.InterfaceC31077DlK
    public void Ee5(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 42), new AnonymousClass019() { // from class: X.JF0
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0a);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void Ee6(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 43), new AnonymousClass019() { // from class: X.JF1
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0b);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void Ee7(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 44), new AnonymousClass019() { // from class: X.JF2
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0c);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void Ee9(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 46), new AnonymousClass019() { // from class: X.JF4
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0e);
            }
        });
    }

    @Override // X.InterfaceC31077DlK
    public void EeB(C120985dq c120985dq, boolean z) {
        A05(c120985dq, Boolean.valueOf(z), new C25310BIf(z, 47), new AnonymousClass019() { // from class: X.JF5
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj) {
                return Boolean.valueOf(((C37644Ghd) obj).A0f);
            }
        });
    }

    public static List A00(C37525Gfh c37525Gfh, String str) {
        A07(str, AbstractC06930Yk.A0E());
        return c37525Gfh.A03;
    }

    private final void A01(int i) {
        int A0B = A0B();
        while (i < A0B) {
            A06((C120985dq) this.A03.get(i), new C25512BQa(i, 26));
            i++;
        }
    }

    private final void A05(C120985dq c120985dq, Object obj, InterfaceC16660sJ interfaceC16660sJ, InterfaceC016606k interfaceC016606k) {
        C37644Ghd C09 = C09(c120985dq);
        if (!C14360o3.A0K(obj, interfaceC016606k.get(C09))) {
            this.A09.put(c120985dq, interfaceC16660sJ.invoke(C09));
            if (this.A0A.contains(interfaceC016606k)) {
                A0Q(c120985dq, A0C(c120985dq));
            }
        }
    }

    private final void A06(C120985dq c120985dq, InterfaceC16660sJ interfaceC16660sJ) {
        boolean A0G = c120985dq.A0G();
        C37644Ghd C09 = C09(c120985dq);
        if (A0G) {
            interfaceC16660sJ.invoke(C09);
            Iterator it = C0A(c120985dq).iterator();
            while (it.hasNext()) {
                interfaceC16660sJ.invoke(it.next());
            }
            return;
        }
        interfaceC16660sJ.invoke(C09);
    }

    public static final void A07(String str, Map map) {
        if (!C11T.A08()) {
            AbstractC12120kG.A0J("CLIPS_ADAPTER_DATA_SOURCE_UPDATE_FROM_BG_THREAD", new Throwable(), AbstractC06930Yk.A04(AbstractC16850sd.A0M(new C09530e4("operation", str)), map), 817895045);
        }
    }

    @Override // X.AbstractC37552Gg8
    public C120985dq A0F(int i) {
        A07("getItem()", AbstractC06930Yk.A06(new C09530e4("pos", String.valueOf(i)), new C09530e4("size", String.valueOf(A0B()))));
        return (C120985dq) this.A03.get(i);
    }

    @Override // X.AbstractC37552Gg8
    public C120985dq A0G(int i) {
        A07("getItemOrNull()", AbstractC06930Yk.A06(new C09530e4("pos", String.valueOf(i)), new C09530e4("size", String.valueOf(A0B()))));
        return (C120985dq) AbstractC001800i.A0O(this.A03, i);
    }

    @Override // X.AbstractC37552Gg8
    public List A0K(int i, int i2) {
        A07("removeItems()", AbstractC25232BEp.A1F("size", String.valueOf(A0B()), AbstractC166987dD.A1L("startIndex", String.valueOf(i)), AbstractC166987dD.A1L("endIndex", String.valueOf(i2))));
        ArrayList A1E = AbstractC166987dD.A1E();
        if (i <= i2) {
            while (true) {
                if (i2 >= 0) {
                    List list = this.A03;
                    if (i2 < list.size()) {
                        this.A04.remove(A0F(i2).A0C());
                        A1E.add(list.remove(i2));
                        A01(i2);
                    }
                }
                if (i2 == i) {
                    break;
                }
                i2--;
            }
        }
        A0N();
        return A1E;
    }

    @Override // X.AbstractC37552Gg8
    public void A0M() {
        super.A0M();
        C25671My A00 = AbstractC25651Mw.A00(this.A08);
        A00.A02(this.A07, C57452kK.class);
        A00.A02(this.A06, C3MC.class);
    }

    @Override // X.AbstractC37552Gg8
    public void A0P(int i, List list) {
        A07("insertItems()", AbstractC25233BEq.A0p("size", String.valueOf(A0B()), AbstractC166987dD.A1L("pos", String.valueOf(i))));
        Iterator it = new AnonymousClass093(list).iterator();
        while (it.hasNext()) {
            C120985dq c120985dq = (C120985dq) it.next();
            this.A04.add(c120985dq.A0C());
            this.A03.add(i, c120985dq);
        }
        A01(i);
        A0N();
    }
}
