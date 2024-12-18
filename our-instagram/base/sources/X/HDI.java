package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class HDI extends C38K implements InterfaceC62602sz, InterfaceC60442pS, InterfaceC60092or, AbsListView.OnScrollListener, InterfaceC60122ou, InterfaceC60132ov {
    public static final String __redex_internal_original_name = "ShortUrlFeedFragment";
    public C69613Av A00;
    public C69613Av A01;
    public C3CO A02;
    public C154796xU A03;
    public HY4 A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public ViewOnTouchListenerC60632pm A0D;
    public C57112jm A0E;
    public C65953Twy A0F;
    public C675132q A0G;
    public C31374Dqe A0H;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final Handler A0I = new Handler();
    public final InterfaceC62612t0 A0L = new C42508Irn(this, 18);
    public final C37430GeA A0M = new C37430GeA();

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return true;
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.ESp(AbstractC166987dD.A0r(this.A0K), R.layout.action_bar_title_logo, AbstractC167017dG.A0E(requireContext()), 0);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Ehq(this);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57112jm c57112jm = this.A0E;
        if (c57112jm != null) {
            InterfaceC09390do interfaceC09390do = this.A0K;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A0o, 36330668795511767L) && C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 2342173678009140182L)) {
                List A00 = C71253Hm.A00.A00(view, AbstractC166987dD.A0r(interfaceC09390do));
                C71163Hc A002 = C71163Hc.A00(this);
                InterfaceC57142jp[] interfaceC57142jpArr = (InterfaceC57142jp[]) A00.toArray(new InterfaceC57142jp[0]);
                c57112jm.A08(view, A002, (InterfaceC57142jp[]) Arrays.copyOf(interfaceC57142jpArr, interfaceC57142jpArr.length));
            }
        }
        ListView A02 = AbstractC37300Gc1.A02(this);
        C14360o3.A0C(A02, MSV.A00(16));
        ((RefreshableListView) A02).setupAndEnableRefresh(new ViewOnClickListenerC37847Gl1(this, 23));
        Context context = getContext();
        if (context != null) {
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0D;
            if (viewOnTouchListenerC60632pm == null) {
                str = "_helper";
            } else {
                C3FQ scrollingViewProxy = getScrollingViewProxy();
                HY4 hy4 = this.A04;
                if (hy4 == null) {
                    str = "adapter";
                } else {
                    viewOnTouchListenerC60632pm.A06(hy4, scrollingViewProxy, C3HB.A00(context));
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC37300Gc1.A02(this).setOnScrollListener(this);
    }

    public static final void A01(Activity activity, C38321qM c38321qM, HDI hdi, String str, String str2, String str3) {
        String str4 = str;
        if (str == null) {
            str4 = "";
        }
        InterfaceC09390do interfaceC09390do = hdi.A0K;
        boolean A02 = C2TN.A02(AbstractC166987dD.A0r(interfaceC09390do), c38321qM);
        C26025BfE c26025BfE = new C26025BfE(EnumC120785dO.DEEP_LINK, null, 0, 0, null, null, null, str4, null, "feed_short_url", str2, null, null, str3, null, null, null, null, null, null, null, c38321qM.A0s(), A02, true, false, false, false, false, false, false, c38321qM.A63(), false, false, false, false, false, false, false, false, c38321qM.A4t(), false, false, false, false, false, false, false, false);
        AnonymousClass548.A00().A00().A00(activity, null, c26025BfE, AbstractC166987dD.A0r(interfaceC09390do), null, null, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36318741671516604L), false, c38321qM.CdW());
    }

    public static final void A02(HDI hdi) {
        C69613Av c69613Av = hdi.A00;
        if (c69613Av != null) {
            c69613Av.A04();
        }
        C154796xU c154796xU = hdi.A03;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        String str = hdi.A08;
        if (str == null) {
            str = "";
        }
        c154796xU.A03(AbstractC2044893h.A04(AbstractC166987dD.A0r(hdi.A0K), str), new HL9(hdi, 6));
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A0K);
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0D;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("_helper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        HY4 hy4 = this.A04;
        if (hy4 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (AbstractC166987dD.A1b(((AbstractC65332xV) ((AbstractC65202xI) hy4).A00).A01)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C154796xU c154796xU = this.A03;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        return AbstractC37303Gc4.A1b(c154796xU);
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        if (this.mView != null) {
            AbstractC37300Gc1.A02(this).setSelection(0);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_short_url";
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C154796xU c154796xU = this.A03;
        if (c154796xU == null) {
            AbstractC37300Gc1.A0b();
            throw C00O.createAndThrow();
        }
        if (c154796xU.A03.A03 != C05F.A00 && !this.A0A) {
            return false;
        }
        return true;
    }

    public HDI() {
        J7R j7r = new J7R(this, 17);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new J7R(new J7R(this, 18), 19));
        this.A0J = AbstractC25225BEi.A0a(new J7R(A00, 20), j7r, new D8I(36, null, A00), AbstractC25225BEi.A1D(Object.class));
        this.A0K = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A02(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Float, X.36Q, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.1M1, X.1M0, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AnonymousClass341 anonymousClass341;
        ?? r5;
        C37430GeA c37430GeA;
        String str;
        int A02 = C0f9.A02(-274391664);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0K;
        C60972qL c60972qL = new C60972qL(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), this);
        C155376yQ c155376yQ = new C155376yQ(AbstractC166987dD.A0r(interfaceC09390do));
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AbstractC111324zv.A00(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD));
        if (string == null) {
            string = "";
        }
        this.A09 = string;
        C65672y3 c65672y3 = null;
        ?? obj = new Object();
        obj.A00 = string;
        String A00 = AbstractC111324zv.A00(2154);
        if (requireArguments.getString(A00) != null) {
            String string2 = requireArguments.getString(A00);
            if (string2 == null) {
                string2 = "";
            }
            anonymousClass341 = AnonymousClass341.valueOf(string2);
        } else {
            anonymousClass341 = null;
        }
        if (requireArguments.getBoolean("open_comments")) {
            this.A0B = true;
        }
        if (requireArguments.getBoolean(AbstractC111324zv.A00(5022))) {
            this.A0C = true;
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, A0o, 36319596370140725L);
        boolean A062 = C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36316740216558208L);
        String A002 = AbstractC43591JPw.A00(21);
        if (A062) {
            this.A0E = AbstractC37301Gc2.A0E();
            C62862tP A022 = C62862tP.A02(this, this, AbstractC166987dD.A0o(interfaceC09390do), this.A0E);
            C57332k8 A003 = C57332k8.A0m.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do));
            C63352uI c63352uI = new C63352uI(this, AbstractC166987dD.A0r(interfaceC09390do), this, this);
            FragmentActivity requireActivity = requireActivity();
            InterfaceC09390do interfaceC09390do2 = this.A0J;
            C61142qc c61142qc = (C61142qc) interfaceC09390do2.getValue();
            C1UC requireActivity2 = requireActivity();
            C14360o3.A0C(requireActivity2, A002);
            r5 = 0;
            C65672y3 c65672y32 = new C65672y3(requireActivity, this, (C2d4) requireActivity2, A022, c61142qc, c63352uI, c60972qL, A003, obj, null);
            FragmentActivity requireActivity3 = requireActivity();
            C61142qc c61142qc2 = (C61142qc) interfaceC09390do2.getValue();
            c37430GeA = this.A0M;
            this.A04 = AbstractC38030GoJ.A00(requireArguments, this, requireActivity3, A022, c65672y32, c61142qc2, c37430GeA, c155376yQ, c60972qL, null, anonymousClass341, null, null, null, this, null, C05F.A01, null, null, false, A06, false);
        } else {
            r5 = 0;
            if (AbstractC65512xn.A00(AbstractC166987dD.A0r(interfaceC09390do)).A07("feed_short_url") || C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36319596369813042L) || A06) {
                this.A0E = AbstractC37301Gc2.A0E();
                C62862tP A023 = C62862tP.A02(this, this, AbstractC166987dD.A0o(interfaceC09390do), this.A0E);
                C57332k8 A004 = C57332k8.A0m.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do));
                C63352uI c63352uI2 = new C63352uI(this, AbstractC166987dD.A0r(interfaceC09390do), this, this);
                FragmentActivity requireActivity4 = requireActivity();
                C61142qc c61142qc3 = (C61142qc) this.A0J.getValue();
                C1UC requireActivity5 = requireActivity();
                C14360o3.A0C(requireActivity5, A002);
                C2d4 c2d4 = (C2d4) requireActivity5;
                Integer num = C05F.A00;
                AbstractC25229BEm.A1J(c61142qc3, 3, c2d4);
                c65672y3 = new C65672y3(requireActivity4, this, c2d4, A023, null, null, c61142qc3, c63352uI2, c60972qL, A004, null, obj, null, num, null, null, null, null, null, false, false, false);
            }
            FragmentActivity requireActivity6 = requireActivity();
            C61142qc c61142qc4 = (C61142qc) this.A0J.getValue();
            C38U c38u = C38U.A00;
            c37430GeA = this.A0M;
            this.A04 = new C37432GeC(this, requireActivity6, null, c65672y3, c61142qc4, c37430GeA, c155376yQ, c60972qL, anonymousClass341, null, null, c38u, this, obj, C05F.A00, null, null, false, false, true, false, false, A06, false, false);
        }
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        ViewOnTouchListenerC60632pm A005 = AbstractC60622pl.A00(requireContext, r5, false);
        this.A0D = A005;
        HY4 hy4 = this.A04;
        if (hy4 != null) {
            C33A c33a = new C33A(this, A005, c37430GeA.A01, hy4);
            String string3 = requireArguments.getString(AbstractC111324zv.A00(2150));
            if (string3 == null) {
                string3 = "";
            }
            this.A05 = string3;
            this.A07 = requireArguments.getString(AbstractC111324zv.A00(2152));
            this.A06 = requireArguments.getString(AbstractC111324zv.A00(2151));
            String string4 = requireArguments.getString(AbstractC111324zv.A00(2153));
            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
            HY4 hy42 = this.A04;
            if (hy42 != null) {
                AnonymousClass391 anonymousClass391 = new AnonymousClass391(this, abstractC10360h2, hy42, c60972qL);
                anonymousClass391.A0C = c33a;
                anonymousClass391.A0R = obj;
                if (this.A0E != null && C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36330668795511767L) && C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 2342173678009140182L)) {
                    anonymousClass391.A04 = this.A0E;
                    anonymousClass391.A0H = r5;
                }
                AnonymousClass396 A006 = anonymousClass391.A00();
                this.A03 = AbstractC37302Gc3.A0L(requireContext(), this, AbstractC166987dD.A0r(interfaceC09390do));
                C65953Twy c65953Twy = new C65953Twy(AbstractC166987dD.A0r(interfaceC09390do), this.A0L, C05F.A01, 3);
                this.A0F = c65953Twy;
                c37430GeA.EDY(c65953Twy);
                c37430GeA.EDY(A006);
                ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0D;
                if (viewOnTouchListenerC60632pm == null) {
                    C14360o3.A0F("_helper");
                } else {
                    c37430GeA.EDY(viewOnTouchListenerC60632pm);
                    this.A0G = new C675132q(this, AbstractC166987dD.A0r(interfaceC09390do), this);
                    C3CO c3co = new C3CO(AbstractC166987dD.A0r(interfaceC09390do), new C38287GsW(this, 14), false, false);
                    this.A02 = c3co;
                    C60462pV c60462pV = new C60462pV();
                    c60462pV.A0E(c3co);
                    InterfaceC60602pj interfaceC60602pj = this.A0G;
                    if (interfaceC60602pj == null) {
                        str = "broadcastHandler";
                    } else {
                        c60462pV.A0E(interfaceC60602pj);
                        c60462pV.A0E(A006);
                        A0a(c60462pV);
                        ListAdapter listAdapter = this.A04;
                        if (listAdapter != null) {
                            A0U(listAdapter);
                            C31374Dqe A007 = AbstractC37492GfA.A00(AbstractC166987dD.A0o(interfaceC09390do));
                            this.A0H = A007;
                            str = "deeplinkPerfLogger";
                            if (A007 != null) {
                                this.A01 = A007.A00.A02("short_url_request");
                                C31374Dqe c31374Dqe = this.A0H;
                                if (c31374Dqe != null) {
                                    this.A00 = c31374Dqe.A00.A02("media_request");
                                    String string5 = requireArguments().getString(AbstractC111324zv.A00(103));
                                    if (string4 != null) {
                                        this.A08 = string4;
                                        A02(this);
                                    } else if (string5 != null) {
                                        C69613Av c69613Av = this.A01;
                                        if (c69613Av != 0) {
                                            c69613Av.A08(r5);
                                        }
                                        C1ON A008 = FC8.A00(AbstractC166987dD.A0r(interfaceC09390do), string5);
                                        A008.A00 = new EUI(this);
                                        schedule(A008);
                                    }
                                    C0f9.A09(1335004599, A02);
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str);
                }
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2080179746);
        View A03 = AbstractC37303Gc4.A03(layoutInflater, viewGroup);
        C0f9.A09(1425210695, A02);
        return A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1847839445);
        super.onPause();
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0D;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("_helper");
            throw C00O.createAndThrow();
        }
        C3FQ scrollingViewProxy = getScrollingViewProxy();
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        viewOnTouchListenerC60632pm.A09(scrollingViewProxy);
        C0f9.A09(463396191, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.3Lq] */
    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(-349190748);
        super.onResume();
        Context context = getContext();
        if (context != null) {
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0D;
            if (viewOnTouchListenerC60632pm == 0) {
                str = "_helper";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            viewOnTouchListenerC60632pm.A04(C56352iT.A0t.A03(getActivity()).A0P, new Object(), C3HB.A00(context));
        }
        C31374Dqe c31374Dqe = this.A0H;
        if (c31374Dqe == null) {
            str = "deeplinkPerfLogger";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        c31374Dqe.A01();
        C0f9.A09(-506908450, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, 1174751905);
        this.A0M.onScroll(absListView, i, i2, i3);
        C0f9.A0A(1681636380, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, 975372356);
        this.A0M.onScrollStateChanged(absListView, i);
        C0f9.A0A(214093904, A0N);
    }
}
