package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.KYe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46016KYe extends C1I2 implements InterfaceC60152ox, MOP, InterfaceC37294Gbv {
    public long A00;
    public C3FQ A01;
    public String A02;
    public boolean A03;
    public final View A04;
    public final UserSession A05;
    public final C3I9 A06;
    public final C13400mQ A07;
    public final C8O6 A08;
    public final KEH A09;
    public final C44421JkH A0A;
    public final MOQ A0B;
    public final A5A A0C;
    public final C47759L7f A0D;
    public final C21C A0E;
    public final C65974TxR A0F;
    public final InterfaceC169497hP A0G;
    public final InterfaceC09390do A0H;
    public final Context A0I;
    public final View A0J;
    public final InterfaceC08830cm A0K;

    public C46016KYe(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3I9 c3i9, C55U c55u, C1810981l c1810981l, InterfaceC150196pR interfaceC150196pR, C8O6 c8o6, MOQ moq, A5A a5a, InterfaceC08830cm interfaceC08830cm, InterfaceC16660sJ interfaceC16660sJ) {
        ViewGroup viewGroup;
        InterfaceC172617mW interfaceC172617mW;
        AbstractC167017dG.A1S(c8o6, a5a);
        C14360o3.A0B(interfaceC08830cm, 9);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A0I = A0L;
        this.A05 = userSession;
        this.A0K = interfaceC08830cm;
        this.A08 = c8o6;
        this.A0C = a5a;
        this.A06 = c3i9;
        this.A09 = new KEH(A0L, interfaceC11380iw, userSession, c1810981l, interfaceC150196pR, moq, interfaceC16660sJ, true, AbstractC167007dF.A1X(c55u, C208509Kk.A00));
        this.A0A = new C44421JkH(userSession, this);
        this.A0B = moq;
        this.A0D = new C47759L7f(userSession, this, interfaceC08830cm);
        C169487hO c169487hO = new C169487hO();
        this.A0G = c169487hO;
        this.A0F = AbstractC65980TxZ.A01(userSession, null, null, this, c169487hO, C05F.A0C, false);
        this.A0E = C21B.A00(userSession);
        this.A04 = AbstractC166987dD.A0c(view, R.id.assets_search_results);
        this.A0J = AbstractC166987dD.A0c(view, R.id.loading_spinner);
        this.A00 = -1L;
        this.A0H = AbstractC09440dt.A01(new C50151MDe(userSession, 1));
        this.A07 = new C13400mQ(AbstractC167007dF.A0J(), new JX1(this, 4), 1000L);
        View A0U = AbstractC167017dG.A0U(view, R.id.assets_search_results_list);
        if ((A0U instanceof ViewGroup) && (viewGroup = (ViewGroup) A0U) != null) {
            C3FQ A00 = C3FN.A00(viewGroup);
            A00 = A00 == null ? null : A00;
            this.A01 = A00;
            ViewParent CFj = A00 != null ? A00.CFj() : null;
            if ((CFj instanceof InterfaceC172617mW) && (interfaceC172617mW = (InterfaceC172617mW) CFj) != null) {
                interfaceC172617mW.setBottomFadingEnabled(false);
            }
            if (A00 != null) {
                A00.EPJ(this.A09);
            }
            C3FQ c3fq = this.A01;
            if (c3fq != null) {
                c3fq.AI0();
            }
            C3FQ c3fq2 = this.A01;
            if (c3fq2 != null) {
                c3fq2.AAJ(this);
            }
        }
    }

    public final void A01(String str, boolean z) {
        EnumC46201Kcd[] enumC46201KcdArr;
        String str2;
        KEH keh;
        ArrayList arrayList;
        C14360o3.A0B(str, 0);
        if ((!this.A03 || C14360o3.A0K(this.A02, str)) && !this.A0E.A00.getBoolean("KEY_AVATAR_GLOBAL_SEARCH_FORCE_NETWORK_REQUEST", false)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            int i2 = length;
            if (!z2) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(str, i2);
            if (!z2) {
                if (!A19) {
                    z2 = true;
                } else {
                    i++;
                }
            } else if (!A19) {
                break;
            } else {
                length--;
            }
        }
        String A0g = AbstractC31177DnL.A0g(str, length, i);
        this.A02 = A0g;
        if (A0g != null && A0g.length() == 0) {
            this.A09.A03();
        } else if (this.A00 == -1) {
            this.A00 = System.currentTimeMillis();
        }
        A00(this, true);
        int intValue = this.A0B.Acu().intValue();
        if (intValue != 6) {
            if (intValue != 4) {
                if (intValue != 7) {
                    if (intValue != 5) {
                        if (intValue != 2) {
                            return;
                        }
                    } else {
                        String str3 = this.A02;
                        if (str3 != null && str3.length() > 0) {
                            this.A0A.filter(str3);
                        }
                        str2 = this.A02;
                        if (str2 == null) {
                            return;
                        }
                        InterfaceC19630xq interfaceC19630xq = this.A0E.A00;
                        if (interfaceC19630xq.getBoolean("KEY_AVATAR_GLOBAL_SEARCH_FORCE_NETWORK_REQUEST", false)) {
                            AbstractC31177DnL.A1N(interfaceC19630xq, "KEY_AVATAR_GLOBAL_SEARCH_FORCE_NETWORK_REQUEST", false);
                            this.A0G.clear();
                        }
                        InterfaceC169497hP interfaceC169497hP = this.A0G;
                        Integer num = interfaceC169497hP.BjP(str2).A01;
                        List list = interfaceC169497hP.BjP(str2).A06;
                        boolean z3 = true;
                        if (num == C05F.A0C && list != null) {
                            if (str2.length() != 0) {
                                z3 = false;
                            }
                            ArrayList A1E = AbstractC166987dD.A1E();
                            ArrayList A1E2 = AbstractC166987dD.A1E();
                            for (Object obj : list) {
                                if (obj instanceof KNF) {
                                    A1E2.add(obj);
                                } else if (obj instanceof KNE) {
                                    A1E.add(obj);
                                }
                            }
                            KEH keh2 = this.A09;
                            C14360o3.A0B(A1E2, 0);
                            keh2.A01 = !z3;
                            keh2.A02 = z3;
                            ArrayList arrayList2 = keh2.A0C;
                            arrayList2.clear();
                            ArrayList arrayList3 = keh2.A09;
                            arrayList3.clear();
                            arrayList2.addAll(A1E2);
                            arrayList3.addAll(A1E);
                            KEH.A01(keh2);
                            A00(this, false);
                            if (z3 || !AbstractC167007dF.A1Z(this.A0H)) {
                                return;
                            }
                            this.A07.A01(str2);
                            return;
                        }
                        this.A07.A00();
                        keh = this.A09;
                        keh.A0C.clear();
                        arrayList = keh.A09;
                        arrayList.clear();
                        KEH.A01(keh);
                        A00(this, true);
                        this.A0F.A06(str2);
                        return;
                    }
                } else {
                    String str4 = this.A02;
                    if (str4 != null && str4.length() > 0) {
                        this.A0A.filter(str4);
                    }
                    enumC46201KcdArr = new EnumC46201Kcd[]{EnumC46201Kcd.EMOJI, EnumC46201Kcd.STICKERS};
                }
            } else {
                String str5 = this.A02;
                if (str5 != null && str5.length() > 0) {
                    this.A0A.filter(str5);
                }
            }
            str2 = this.A02;
            if (str2 == null) {
                return;
            }
            InterfaceC169497hP interfaceC169497hP2 = this.A0G;
            Integer num2 = interfaceC169497hP2.BjP(str2).A01;
            List list2 = interfaceC169497hP2.BjP(str2).A06;
            boolean z4 = true;
            if (num2 == C05F.A0C && list2 != null) {
                A00(this, false);
                if (str2.length() != 0) {
                    z4 = false;
                }
                KEH keh3 = this.A09;
                ArrayList A1E3 = AbstractC166987dD.A1E();
                for (Object obj2 : list2) {
                    if (obj2 instanceof KNF) {
                        A1E3.add(obj2);
                    }
                }
                keh3.A01 = !z4;
                keh3.A02 = z4;
                ArrayList arrayList4 = keh3.A0C;
                arrayList4.clear();
                arrayList4.addAll(A1E3);
                KEH.A01(keh3);
                return;
            }
            keh = this.A09;
            arrayList = keh.A0C;
            arrayList.clear();
            KEH.A01(keh);
            A00(this, true);
            this.A0F.A06(str2);
            return;
        }
        enumC46201KcdArr = new EnumC46201Kcd[]{EnumC46201Kcd.EMOJI, EnumC46201Kcd.STICKERS, EnumC46201Kcd.GIPHY_GIFS};
        List A1Q = AbstractC16960so.A1Q(enumC46201KcdArr);
        String str6 = this.A02;
        if (str6 == null) {
            return;
        }
        C47759L7f c47759L7f = this.A0D;
        if (z) {
            int length2 = str6.length() - 1;
            int i3 = 0;
            boolean z5 = false;
            while (i3 <= length2) {
                int i4 = length2;
                if (!z5) {
                    i4 = i3;
                }
                boolean A192 = AbstractC167027dH.A19(str6, i4);
                if (!z5) {
                    if (!A192) {
                        z5 = true;
                    } else {
                        i3++;
                    }
                } else if (!A192) {
                    break;
                } else {
                    length2--;
                }
            }
            c47759L7f.A00(new LGU(AbstractC31177DnL.A0g(str6, length2, i3), A1Q));
            return;
        }
        if (c47759L7f.A00 == LGU.A03) {
            return;
        }
        C13400mQ c13400mQ = c47759L7f.A01;
        int length3 = str6.length() - 1;
        int i5 = 0;
        boolean z6 = false;
        while (i5 <= length3) {
            int i6 = length3;
            if (!z6) {
                i6 = i5;
            }
            boolean A193 = AbstractC167027dH.A19(str6, i6);
            if (!z6) {
                if (!A193) {
                    z6 = true;
                } else {
                    i5++;
                }
            } else if (!A193) {
                break;
            } else {
                length3--;
            }
        }
        c13400mQ.A01(new LGU(AbstractC31177DnL.A0g(str6, length3, i5), c47759L7f.A00.A02));
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        EnumC143276dS enumC143276dS;
        ArrayList A12 = AbstractC166997dE.A12(str, 0);
        A12.add(EnumC46201Kcd.GIPHY_STICKERS);
        if (this.A0B.Acu() == C05F.A0j) {
            A12.add(EnumC46201Kcd.AVATAR_STICKERS);
        }
        if (AbstractC167007dF.A1Z(this.A0H)) {
            A12.add(EnumC46201Kcd.GIPHY_GIFS);
        }
        UserSession userSession = this.A05;
        C149736oQ c149736oQ = EnumC143276dS.A01;
        EnumC143286dT enumC143286dT = EnumC143286dT.A0F;
        if (C18U.A06(C06090Tz.A05, userSession, 36316353669566750L)) {
            enumC143276dS = EnumC143276dS.A0P;
        } else {
            enumC143276dS = EnumC143276dS.A0Y;
        }
        String A00 = c149736oQ.A00(enumC143276dS, enumC143286dT, userSession, false);
        Object obj = this.A0K.get();
        JSONArray jSONArray = new JSONArray();
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            jSONArray.put(((EnumC46201Kcd) it.next()).A00);
        }
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        JQ0.A1F(A0N, jSONArray, str);
        A0N.A9s("request_surface", obj.toString());
        A0N.A0S(K8R.class, C47877LCx.class);
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("result_size", 4);
            if (A00 != null) {
                A0S.A0S("sticker_pack_id", A00);
            }
            return AbstractC31172DnG.A0T(A0N, "avatar_sticker_search", AbstractC167017dG.A0l(A0S, stringWriter));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        C14360o3.A0B(str, 0);
        if (C14360o3.A0K(this.A02, str)) {
            C9GR.A0D(this.A0I, "sticker_search_request_failed");
        }
        if (AbstractC167007dF.A1Z(this.A0H)) {
            A00(this, false);
            this.A00 = -1L;
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        A00(this, true);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.MOP
    public final void Dh9(String str, List list) {
        C14360o3.A0B(str, 0);
        if (C14360o3.A0K(this.A02, str)) {
            KEH keh = this.A09;
            if (list == null) {
                list = AbstractC166987dD.A1E();
            }
            keh.A05(list);
        }
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    public static final void A00(C46016KYe c46016KYe, boolean z) {
        KEH keh;
        ViewGroup CFj;
        ViewGroup CFj2;
        Integer Acu = c46016KYe.A0B.Acu();
        int i = 8;
        if (Acu == C05F.A0Y || (Acu == C05F.A0u && AbstractC13670mt.A0G(c46016KYe.A02, ""))) {
            c46016KYe.A0J.setVisibility(8);
            C3FQ c3fq = c46016KYe.A01;
            if (c3fq != null && (CFj = c3fq.CFj()) != null) {
                CFj.setVisibility(0);
            }
            keh = c46016KYe.A09;
        } else {
            c46016KYe.A0J.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            C3FQ c3fq2 = c46016KYe.A01;
            if (c3fq2 != null && (CFj2 = c3fq2.CFj()) != null) {
                if (!z) {
                    i = 0;
                }
                CFj2.setVisibility(i);
            }
            keh = c46016KYe.A09;
            if (!AbstractC167007dF.A1Z(c46016KYe.A0H)) {
                z = false;
            }
        }
        if (keh.A00 != z) {
            keh.A00 = z;
            KEH.A01(keh);
        }
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        this.A0J.setTranslationY(i / (-2.0f));
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
        if (!AbstractC167007dF.A1Z(this.A0H)) {
            A00(this, false);
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        KEH keh;
        K8R k8r = (K8R) interfaceC40821up;
        AbstractC167007dF.A1K(str, k8r);
        if (C14360o3.A0K(this.A02, str)) {
            boolean z = true;
            if (str.length() != 0) {
                z = false;
                if (AbstractC167007dF.A1Z(this.A0H)) {
                    this.A09.A04(str, this.A00);
                    this.A00 = -1L;
                }
            }
            InterfaceC09390do interfaceC09390do = this.A0H;
            boolean A1Z = AbstractC167007dF.A1Z(interfaceC09390do);
            List A12 = AbstractC43594JPz.A12(k8r.A01.A05);
            if (A1Z) {
                C14360o3.A07(A12);
                List A122 = AbstractC43594JPz.A12(k8r.A01.A04);
                C14360o3.A07(A122);
                A12 = AbstractC001800i.A0S(A122, A12);
            } else {
                C14360o3.A07(A12);
            }
            Collection collection = (Collection) AbstractC47040Kqx.A00(A12).first;
            if (this.A0B.Acu() == C05F.A0j) {
                ArrayList A1E = AbstractC166987dD.A1E();
                for (C148276lx c148276lx : k8r.A01.A00()) {
                    C148286ly c148286ly = (C148286ly) AbstractC001800i.A0J(c148276lx.A0O);
                    if (c148286ly != null) {
                        c148286ly.A0c = "STORIES_GLOBAL_SEARCH_STICKER_TRAY";
                    }
                    A1E.add(new C148306m0(c148276lx));
                }
                keh = this.A09;
                C14360o3.A0A(collection);
                C14360o3.A0B(collection, 0);
                keh.A01 = !z;
                keh.A02 = z;
                ArrayList arrayList = keh.A0C;
                arrayList.clear();
                ArrayList arrayList2 = keh.A09;
                arrayList2.clear();
                arrayList.addAll(collection);
                arrayList2.addAll(A1E);
            } else {
                keh = this.A09;
                C14360o3.A0A(collection);
                C14360o3.A0B(collection, 0);
                keh.A01 = !z;
                keh.A02 = z;
                ArrayList arrayList3 = keh.A0C;
                arrayList3.clear();
                arrayList3.addAll(collection);
            }
            KEH.A01(keh);
            if (AbstractC167007dF.A1Z(interfaceC09390do)) {
                A00(this, false);
            }
        }
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        C0f9.A0A(1557279606, C0f9.A03(758208822));
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A0N = AbstractC167017dG.A0N(c3fq, 2082421959);
        if (i == 1) {
            AbstractC13880nE.A0O(c3fq.CFj());
        }
        C0f9.A0A(1853446955, A0N);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
