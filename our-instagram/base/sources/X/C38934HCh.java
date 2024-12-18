package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HCh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38934HCh extends AbstractC59962oe implements InterfaceC60682pr, AnonymousClass309, InterfaceC60072op, InterfaceC60092or, InterfaceC11480j6, InterfaceC60122ou, InterfaceC60132ov, C53S {
    public static final String __redex_internal_original_name = "KeywordMediaSerpFragment";
    public ViewOnTouchListenerC60632pm A00;
    public C38085GpE A01;
    public C66095TzW A02;
    public C65823Tug A03;
    public C38086GpF A04;
    public AbstractC127945qN A05;
    public JIG A06;
    public AnonymousClass308 A07;
    public Keyword A08;
    public C38107Gpa A09;
    public IME A0A;
    public II5 A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public C57112jm A0F;
    public C42429IqW A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public final J1I A0K = new J1I(this);
    public final C38U A0L = C38U.A00;
    public final C37330GcY A0O = new C37330GcY();
    public final C37835Gkp A0N = new C37835Gkp();
    public final C40961ICi A0V = new C40961ICi();
    public final InterfaceC43407JFx A0S = new C42427IqU(this);
    public final InterfaceC101554hQ A0T = new Wk9(this, 4);
    public final C40960ICh A0U = new C40960ICh(this);
    public final InterfaceC71925XAj A0P = new C42419IqM(this, 1);
    public final InterfaceC43406JFw A0R = new C42426IqT(this, 2);
    public final AbstractC42425IqS A0Q = new C68036V7h(this, 4);
    public final InterfaceC09390do A0M = AbstractC60492pY.A02(this);

    public static final void A01(C5qT c5qT, AbstractC127945qN abstractC127945qN, C38321qM c38321qM, C38934HCh c38934HCh) {
        C11520jB E6Q = c38934HCh.E6Q(c38321qM);
        IS4.A01(E6Q, abstractC127945qN);
        C19260xA A00 = E6Q.A00();
        String str = c38934HCh.A0C;
        if (str == null) {
            C14360o3.A0F("keywordSessionId");
            throw C00O.createAndThrow();
        }
        AbstractC31173DnH.A1S(AbstractC40594HzE.A00(c38934HCh, A00, c38321qM, str, c5qT.A01, c5qT.A00), AbstractC166987dD.A0o(c38934HCh.A0M));
    }

    public static final void A02(C38321qM c38321qM, Keyword keyword, C38934HCh c38934HCh, String str, String str2, String str3, List list) {
        FragmentActivity requireActivity = c38934HCh.requireActivity();
        InterfaceC09390do interfaceC09390do = c38934HCh.A0M;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C37330GcY c37330GcY = c38934HCh.A0O;
        String str4 = c38934HCh.A0I;
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        IS3.A01(requireActivity, A0r, c37330GcY, c38934HCh, c38321qM, keyword, str, str4, str2, str3, list, C18U.A06(AbstractC166997dE.A0U(A0r2), A0r2, 36317534786164060L));
    }

    @Override // X.C53S
    public final void A8Y(C19280xC c19280xC) {
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        c38321qM.A0C.Ec6(this.A0D);
        C11520jB E6P = E6P();
        User A2E = c38321qM.A2E(AbstractC166987dD.A0r(this.A0M));
        if (A2E != null) {
            AbstractC37440GeK.A00(E6P, A2E);
        }
        return E6P;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        C42429IqW c42429IqW = this.A0G;
        String str = "refinementSurfaceController";
        if (c42429IqW != null) {
            c42429IqW.configureActionBar(interfaceC56362iU);
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            if (scrollingViewProxy != null) {
                C42429IqW c42429IqW2 = this.A0G;
                if (c42429IqW2 != null) {
                    ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A00;
                    if (viewOnTouchListenerC60632pm == null) {
                        str = "scrollableNavigationHelper";
                    } else {
                        C65823Tug c65823Tug = this.A03;
                        if (c65823Tug == null) {
                            str = "grid";
                        } else {
                            c42429IqW2.AJJ(viewOnTouchListenerC60632pm, c65823Tug.A0B, scrollingViewProxy);
                        }
                    }
                }
            }
            interfaceC56362iU.EkS(true);
            interfaceC56362iU.Ehq(this);
            Keyword keyword = this.A08;
            if (keyword == null) {
                str = "surfaceKeyword";
            } else {
                interfaceC56362iU.setTitle(keyword.A04);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_keyword";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C65823Tug c65823Tug = this.A03;
        if (c65823Tug != null) {
            J1I j1i = this.A0K;
            c65823Tug.A05(view, j1i.isLoading());
            C65823Tug c65823Tug2 = this.A03;
            if (c65823Tug2 != null) {
                c65823Tug2.A06(j1i);
                C65823Tug c65823Tug3 = this.A03;
                if (c65823Tug3 != null) {
                    c65823Tug3.A0E.update();
                    return;
                }
            }
        }
        C14360o3.A0F("grid");
        throw C00O.createAndThrow();
    }

    public static final void A00(C51755Mte c51755Mte, C38934HCh c38934HCh, List list, boolean z) {
        Object obj;
        String str = "dataSource";
        if (z) {
            C38086GpF c38086GpF = c38934HCh.A04;
            if (c38086GpF != null) {
                c38086GpF.A05();
                if (c51755Mte != null) {
                    C42429IqW c42429IqW = c38934HCh.A0G;
                    if (c42429IqW == null) {
                        str = "refinementSurfaceController";
                    } else {
                        c42429IqW.A03 = c51755Mte;
                        c42429IqW.A09.A00 = c51755Mte;
                        if (((InterfaceC60062oo) c42429IqW.A07).isResumed()) {
                            AbstractC31175DnJ.A0i(c42429IqW.A06);
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C38086GpF c38086GpF2 = c38934HCh.A04;
        if (c38086GpF2 != null) {
            c38086GpF2.A07(null, list);
            C38086GpF c38086GpF3 = c38934HCh.A04;
            if (c38086GpF3 != null) {
                Iterator it = c38086GpF3.A01.A02.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (obj instanceof C127935qM) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c38934HCh.A05 = (AbstractC127945qN) obj;
                C65823Tug c65823Tug = c38934HCh.A03;
                if (c65823Tug == null) {
                    str = "grid";
                } else {
                    c65823Tug.A0E.update();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A05(C38934HCh c38934HCh, boolean z) {
        UserSession A0r = AbstractC166987dD.A0r(c38934HCh.A0M);
        if (!C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36330939378320472L)) {
            if (z) {
                c38934HCh.A0V.A00.clear();
            }
            IME ime = c38934HCh.A0A;
            String str = null;
            if (ime == null) {
                C14360o3.A0F("requestController");
                throw C00O.createAndThrow();
            }
            HLA hla = new HLA(c38934HCh, z);
            if (!z) {
                str = c38934HCh.A0D;
            }
            ime.A00(hla, str, c38934HCh.A0V.A00, z);
        }
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A00;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("scrollableNavigationHelper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        String str;
        C65823Tug c65823Tug = this.A03;
        if (c65823Tug == null) {
            str = "grid";
        } else {
            c65823Tug.A03();
            C42429IqW c42429IqW = this.A0G;
            if (c42429IqW == null) {
                str = "refinementSurfaceController";
            } else {
                c42429IqW.EMG();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        C65823Tug c65823Tug = this.A03;
        if (c65823Tug == null) {
            AbstractC37300Gc1.A0a();
            throw C00O.createAndThrow();
        }
        return c65823Tug.A06;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0M);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AnonymousClass308 anonymousClass308 = this.A07;
        if (anonymousClass308 == null) {
            C14360o3.A0F("peekMediaController");
            throw C00O.createAndThrow();
        }
        return anonymousClass308.onBackPressed();
    }

    public static final void A03(C38321qM c38321qM, Keyword keyword, C38934HCh c38934HCh, List list) {
        ArrayList arrayList;
        String A0j = AbstractC167017dG.A0j();
        if (list != null) {
            arrayList = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0g = AbstractC37302Gc3.A0g(it);
                if (A0g != null) {
                    arrayList.add(A0g);
                }
            }
        } else {
            arrayList = null;
        }
        A02(c38321qM, keyword, c38934HCh, A0j, "", null, arrayList);
    }

    public static final void A04(Keyword keyword, C38934HCh c38934HCh) {
        String str;
        FragmentActivity requireActivity = c38934HCh.requireActivity();
        InterfaceC09390do interfaceC09390do = c38934HCh.A0M;
        C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do);
        A0c.A08();
        U04.A00();
        interfaceC09390do.getValue();
        String str2 = c38934HCh.A0E;
        if (str2 == null) {
            str = "searchSessionId";
        } else {
            String str3 = c38934HCh.A0H;
            Keyword keyword2 = c38934HCh.A08;
            if (keyword2 == null) {
                str = "surfaceKeyword";
            } else {
                A0c.A0D(U29.A01(keyword, "feed_keyword", str2, str3, keyword2.A03));
                A0c.A04();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB A0B = AbstractC37300Gc1.A0B();
        C11500j9 c11500j9 = AbstractC128995sK.A03;
        Keyword keyword = this.A08;
        String str = "surfaceKeyword";
        if (keyword != null) {
            A0B.A04(c11500j9, keyword.A03);
            C11500j9 c11500j92 = AbstractC128995sK.A04;
            Keyword keyword2 = this.A08;
            if (keyword2 != null) {
                A0B.A04(c11500j92, keyword2.A04);
                A0B.A04(AbstractC128995sK.A05, "KEYWORD");
                C11500j9 c11500j93 = AbstractC37793Gk8.A02;
                String str2 = this.A0C;
                if (str2 == null) {
                    str = "keywordSessionId";
                } else {
                    A0B.A04(c11500j93, str2);
                    C11500j9 c11500j94 = AbstractC37793Gk8.A00;
                    String str3 = this.A0E;
                    if (str3 == null) {
                        str = "searchSessionId";
                    } else {
                        A0B.A04(c11500j94, str3);
                        A0B.A05(AbstractC129015sM.A01, this.A0D);
                        A0B.A05(AbstractC129015sM.A00, this.A0H);
                        return A0B;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        return E6P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v2, types: [X.2y7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        Object obj;
        int A02 = C0f9.A02(1569382489);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Keyword keyword = (Keyword) requireArguments.getParcelable(AbstractC111324zv.A00(1935));
        if (keyword != null) {
            this.A08 = keyword;
            this.A0C = AbstractC166997dE.A0n();
            Context requireContext = requireContext();
            InterfaceC09390do interfaceC09390do = this.A0M;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            String str = this.A0C;
            if (str != null) {
                this.A06 = AbstractC53972Ntj.A00(requireContext, A0r, this, str, -1L, false, true);
                this.A0E = requireArguments.getString(AbstractC111324zv.A00(1939), "");
                this.A0H = requireArguments.getString(AbstractC111324zv.A00(1940));
                this.A0J = requireArguments.getString(AbstractC111324zv.A00(1937));
                this.A0I = requireArguments.getString(AbstractC111324zv.A00(3960));
                String string = requireArguments.getString(AbstractC111324zv.A00(1936));
                interfaceC09390do.getValue();
                this.A0F = AbstractC37301Gc2.A0E();
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                Keyword keyword2 = this.A08;
                if (keyword2 != null) {
                    String str2 = this.A0C;
                    if (str2 != null) {
                        String str3 = this.A0E;
                        String str4 = "searchSessionId";
                        if (str3 != null) {
                            this.A09 = new C38107Gpa(this, A0r2, keyword2, str2, str3);
                            String str5 = this.A0C;
                            if (str5 != null) {
                                this.A01 = new C38085GpE(this, requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), null, str5);
                                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                C37498GfG c37498GfG = new C37498GfG(AbstractC166987dD.A0r(interfaceC09390do));
                                C42423IqQ c42423IqQ = C42423IqQ.A00;
                                J1I j1i = this.A0K;
                                C1571273r A0J = AbstractC37300Gc1.A0J();
                                A0J.A02 = R.drawable.instagram_search_outline_96;
                                A0J.A0D = AbstractC166997dE.A0N(this).getString(2131968576);
                                A0J.A07 = AbstractC166997dE.A0N(this).getString(2131968575);
                                C38086GpF c38086GpF = new C38086GpF(A0r3, c42423IqQ, c37498GfG, A0J, j1i, new JEZ(this, 20));
                                this.A04 = c38086GpF;
                                Iterator it = c38086GpF.A01.A02.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = it.next();
                                        if (obj instanceof C127935qM) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                this.A05 = (AbstractC127945qN) obj;
                                UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                                JIG jig = this.A06;
                                if (jig != null) {
                                    AbstractC42425IqS abstractC42425IqS = this.A0Q;
                                    InterfaceC43406JFw interfaceC43406JFw = this.A0R;
                                    C37835Gkp c37835Gkp = this.A0N;
                                    C38086GpF c38086GpF2 = this.A04;
                                    String str6 = "dataSource";
                                    if (c38086GpF2 != null) {
                                        String str7 = this.A0E;
                                        if (str7 != null) {
                                            AbstractC25234BEr.A0k(2, A0r4, abstractC42425IqS, interfaceC43406JFw, c37835Gkp);
                                            Context requireContext2 = requireContext();
                                            ?? obj2 = new Object();
                                            boolean A06 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36314528308529837L);
                                            if (A06) {
                                                C3AX c3ax = new C3AX(AbstractC166987dD.A0r(interfaceC09390do), null, "feed_keyword");
                                                C3AR c3ar = new C3AR(AbstractC166987dD.A0r(interfaceC09390do), "feed_keyword");
                                                C42411xV A00 = C42411xV.A00(AbstractC166987dD.A0r(interfaceC09390do));
                                                C14360o3.A08(C42411xV.A0F);
                                                A00.A07(c3ar, c3ax, "feed_keyword");
                                                UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do);
                                                C154796xU A0L = AbstractC37302Gc3.A0L(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do));
                                                Keyword keyword3 = this.A08;
                                                if (keyword3 != null) {
                                                    this.A0A = new IME(A0r5, A0L, keyword3, this.A0J, this.A0I, string);
                                                }
                                            }
                                            FragmentActivity requireActivity = requireActivity();
                                            C38086GpF c38086GpF3 = this.A04;
                                            if (c38086GpF3 != null) {
                                                UserSession A0r6 = AbstractC166987dD.A0r(interfaceC09390do);
                                                C66392zG A002 = AbstractC38092GpL.A00(requireContext2, this, A0r4, obj2, c37835Gkp, abstractC42425IqS, c38086GpF2, interfaceC43406JFw, jig, this, null, str7, false, false);
                                                A002.A01(new Object());
                                                UserSession A0r7 = AbstractC166987dD.A0r(interfaceC09390do);
                                                C38086GpF c38086GpF4 = this.A04;
                                                if (c38086GpF4 != null) {
                                                    C38107Gpa c38107Gpa = this.A09;
                                                    str4 = "keywordRefinementItemLogger";
                                                    if (c38107Gpa != null) {
                                                        C38247Grq c38247Grq = new C38247Grq(this, 6);
                                                        J7J j7j = new J7J(this, 1);
                                                        J7J j7j2 = new J7J(this, 2);
                                                        Keyword keyword4 = this.A08;
                                                        if (keyword4 != null) {
                                                            AbstractC38110Gpd.A00(this, A002, A0r7, c38086GpF4, interfaceC43406JFw, c38107Gpa, keyword4.A04, c38247Grq, null, j7j, j7j2);
                                                            this.A02 = new C66095TzW(requireActivity, this, A002, A0r6, c38086GpF3, null, null, null, null, j1i, A06, false);
                                                            C66101Tzc c66101Tzc = new C66101Tzc(AbstractC166987dD.A0r(interfaceC09390do));
                                                            c66101Tzc.A01(this.A0P);
                                                            C66095TzW c66095TzW = this.A02;
                                                            if (c66095TzW == null) {
                                                                str6 = "adapter";
                                                            } else {
                                                                c66101Tzc.A06 = c66095TzW;
                                                                C38086GpF c38086GpF5 = this.A04;
                                                                if (c38086GpF5 != null) {
                                                                    c66101Tzc.A08 = c38086GpF5;
                                                                    JIG jig2 = this.A06;
                                                                    if (jig2 != null) {
                                                                        c66101Tzc.A0A = jig2;
                                                                        c66101Tzc.A04 = this;
                                                                        c66101Tzc.A02(C38U.A00);
                                                                        C57112jm c57112jm = this.A0F;
                                                                        String str8 = "viewpointManager";
                                                                        if (c57112jm != null) {
                                                                            c66101Tzc.A05 = c57112jm;
                                                                            c66101Tzc.A0P = new V5X[]{new C38124Gpr(EnumC38183Gqo.A0F)};
                                                                            c66101Tzc.A0K = false;
                                                                            c66101Tzc.A09 = new C42424IqR(this);
                                                                            this.A03 = new C65823Tug(c66101Tzc);
                                                                            UserSession A0r8 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                            String str9 = this.A0C;
                                                                            if (str9 != null) {
                                                                                C41587Iaa c41587Iaa = new C41587Iaa(this, A0r8, new C42430IqX(this, 3), null, str9);
                                                                                C57112jm c57112jm2 = this.A0F;
                                                                                if (c57112jm2 != null) {
                                                                                    C38107Gpa c38107Gpa2 = this.A09;
                                                                                    if (c38107Gpa2 != null) {
                                                                                        C65823Tug c65823Tug = this.A03;
                                                                                        str8 = "grid";
                                                                                        if (c65823Tug != null) {
                                                                                            this.A0B = new II5(c57112jm2, c65823Tug.A0D, c41587Iaa, c38107Gpa2);
                                                                                            int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                                                                                            this.A00 = AbstractC60622pl.A00(requireContext(), null, false);
                                                                                            FragmentActivity requireActivity2 = requireActivity();
                                                                                            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
                                                                                            if (abstractC10360h2 != null) {
                                                                                                UserSession A0r9 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                                C65823Tug c65823Tug2 = this.A03;
                                                                                                if (c65823Tug2 != null) {
                                                                                                    AnonymousClass308 anonymousClass308 = new AnonymousClass308(requireActivity2, this, abstractC10360h2, A0r9, null, this, c65823Tug2.A0E, null, false, true, false);
                                                                                                    this.A07 = anonymousClass308;
                                                                                                    anonymousClass308.ETB(this.A0T);
                                                                                                    Context requireContext3 = requireContext();
                                                                                                    FragmentActivity requireActivity3 = requireActivity();
                                                                                                    interfaceC09390do.getValue();
                                                                                                    this.A0G = new C42429IqW(requireContext3, requireActivity3, this, this.A0S, this.A0U);
                                                                                                    if (!A06) {
                                                                                                        UserSession A0r10 = AbstractC166987dD.A0r(interfaceC09390do);
                                                                                                        C154796xU A0L2 = AbstractC37302Gc3.A0L(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do));
                                                                                                        Keyword keyword5 = this.A08;
                                                                                                        if (keyword5 != null) {
                                                                                                            this.A0A = new IME(A0r10, A0L2, keyword5, this.A0J, this.A0I, string);
                                                                                                        }
                                                                                                    }
                                                                                                    C65823Tug c65823Tug3 = this.A03;
                                                                                                    if (c65823Tug3 != null) {
                                                                                                        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A00;
                                                                                                        if (viewOnTouchListenerC60632pm == null) {
                                                                                                            str6 = "scrollableNavigationHelper";
                                                                                                        } else {
                                                                                                            c65823Tug3.A09(viewOnTouchListenerC60632pm);
                                                                                                            C60462pV c60462pV = new C60462pV();
                                                                                                            c60462pV.A0E(c37835Gkp);
                                                                                                            InterfaceC60602pj interfaceC60602pj = this.A07;
                                                                                                            if (interfaceC60602pj == null) {
                                                                                                                str6 = "peekMediaController";
                                                                                                            } else {
                                                                                                                c60462pV.A0E(interfaceC60602pj);
                                                                                                                InterfaceC60602pj interfaceC60602pj2 = this.A01;
                                                                                                                if (interfaceC60602pj2 == null) {
                                                                                                                    str6 = "clipsUnitController";
                                                                                                                } else {
                                                                                                                    c60462pV.A0E(interfaceC60602pj2);
                                                                                                                    if (this.A03 != null) {
                                                                                                                        registerLifecycleListenerSet(c60462pV);
                                                                                                                        A05(this, true);
                                                                                                                        C0f9.A09(992652553, A02);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                A14 = AbstractC166997dE.A0g();
                                                                                                i = -611197612;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        C14360o3.A0F(str8);
                                                                        throw C00O.createAndThrow();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C14360o3.A0F(str6);
                                    throw C00O.createAndThrow();
                                }
                                C14360o3.A0F("videoPlayerManager");
                                throw C00O.createAndThrow();
                            }
                        }
                        C14360o3.A0F(str4);
                        throw C00O.createAndThrow();
                    }
                }
                C14360o3.A0F("surfaceKeyword");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("keywordSessionId");
            throw C00O.createAndThrow();
        }
        A14 = AbstractC166987dD.A14("Keyword must be supplied.");
        i = -1557797844;
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(724089513);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A03 == null) {
            str = "grid";
        } else {
            View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper, false);
            C42429IqW c42429IqW = this.A0G;
            if (c42429IqW == null) {
                str = "refinementSurfaceController";
            } else {
                c42429IqW.D8R(layoutInflater, viewGroup);
                C0f9.A09(1521029545, A02);
                return A0R;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1848379316);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A0M;
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36314528308529837L)) {
            C42411xV.A00(AbstractC166987dD.A0r(interfaceC09390do)).A08("feed_keyword");
        }
        C0f9.A09(54670005, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1784954779);
        super.onDestroyView();
        C65823Tug c65823Tug = this.A03;
        if (c65823Tug == null) {
            AbstractC37300Gc1.A0a();
            throw C00O.createAndThrow();
        }
        c65823Tug.A01();
        C0f9.A09(-155073060, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        String str;
        int A02 = C0f9.A02(338866718);
        C65823Tug c65823Tug = this.A03;
        if (c65823Tug == null) {
            str = "grid";
        } else {
            c65823Tug.A0D.AGc();
            JIG jig = this.A06;
            if (jig == null) {
                str = "videoPlayerManager";
            } else {
                jig.EE9();
                super.onPause();
                C42429IqW c42429IqW = this.A0G;
                if (c42429IqW == null) {
                    str = "refinementSurfaceController";
                } else {
                    c42429IqW.onPause();
                    ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A00;
                    if (viewOnTouchListenerC60632pm == null) {
                        str = "scrollableNavigationHelper";
                    } else {
                        C3FQ scrollingViewProxy = getScrollingViewProxy();
                        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        viewOnTouchListenerC60632pm.A09(scrollingViewProxy);
                        C0f9.A09(903056350, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        View view;
        int A02 = C0f9.A02(1509303435);
        super.onResume();
        C65823Tug c65823Tug = this.A03;
        if (c65823Tug == null) {
            str = "grid";
        } else {
            c65823Tug.A0D.EJ1();
            C42429IqW c42429IqW = this.A0G;
            str = "refinementSurfaceController";
            if (c42429IqW != null) {
                c42429IqW.onResume();
                C42429IqW c42429IqW2 = this.A0G;
                if (c42429IqW2 != null) {
                    ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A00;
                    if (viewOnTouchListenerC60632pm == null) {
                        str = "scrollableNavigationHelper";
                    } else {
                        c42429IqW2.AJK(viewOnTouchListenerC60632pm, new C70906Wjz(this));
                        InterfaceC09390do interfaceC09390do = this.A0M;
                        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                        C14360o3.A0B(A0o, 0);
                        J85 j85 = J85.A00;
                        AbstractC69735VuV abstractC69735VuV = (AbstractC69735VuV) A0o.A01(HKI.class, j85);
                        String str2 = this.A0C;
                        String str3 = "keywordSessionId";
                        if (str2 != null) {
                            if (abstractC69735VuV.A00.containsKey(str2)) {
                                AbstractC69735VuV abstractC69735VuV2 = (AbstractC69735VuV) AbstractC25230BEn.A0k(interfaceC09390do, 0).A01(HKI.class, j85);
                                String str4 = this.A0C;
                                if (str4 != null) {
                                    HKJ hkj = (HKJ) ((AbstractC69385VmV) abstractC69735VuV2.A00.remove(str4));
                                    if (hkj != null) {
                                        if (hkj.A04) {
                                            IME ime = this.A0A;
                                            if (ime == null) {
                                                str3 = "requestController";
                                            } else {
                                                ime.A00 = ime.A00.A00(hkj.A00);
                                            }
                                        }
                                        List list = hkj.A06;
                                        if (AbstractC166987dD.A1b(list)) {
                                            int size = list.size();
                                            for (int i = 0; i < size; i++) {
                                                A00(null, this, (List) list.get(i), AbstractC166987dD.A1a(hkj.A05.get(i)));
                                            }
                                        }
                                        String str5 = hkj.A02;
                                        if (str5 != null && str5.length() != 0 && (view = this.mView) != null) {
                                            view.post(new RunnableC43128J4r(this, hkj));
                                        }
                                    }
                                }
                            }
                            C0f9.A09(938796669, A02);
                            return;
                        }
                        C14360o3.A0F(str3);
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
