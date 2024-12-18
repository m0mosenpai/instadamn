package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.List;

/* loaded from: classes11.dex */
public final class V0V extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC60132ov, InterfaceC50521MRz {
    public static final String __redex_internal_original_name = "CompositeSerpTabbedFragment";
    public int A01;
    public View A04;
    public ViewOnTouchListenerC60632pm A05;
    public C23031Ai A06;
    public C66151U1s A07;
    public C70110W4h A08;
    public C43812JYz A09;
    public C66152U1t A0A;
    public V8L A0B;
    public U28 A0C;
    public AbstractC44094JeJ A0D;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public U1Z A0U;
    public AnimatedHintsTextLayout A0V;
    public boolean A0X;
    public final InterfaceC09390do A0a = AbstractC09440dt.A01(new X2z(this, 5));
    public final List A0Y = AbstractC16960so.A1N(VEN.A06, VEN.A0A, VEN.A07, VEN.A08);
    public int A02 = -1;
    public int A00 = 3;
    public boolean A0W = true;
    public String A0E = "0";
    public long A03 = 750;
    public final InterfaceC09390do A0Z = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ void Dru(Object obj) {
        C14360o3.A0B(obj, 0);
        int indexOf = this.A0Y.indexOf(obj);
        if (this.A0Q) {
            indexOf = (r1.size() - 1) - indexOf;
        }
        if (indexOf != -1) {
            if (this.A02 != -1) {
                C55782hJ A00 = C55772hI.A00((AbstractC12990ll) this.A0Z.getValue());
                AbstractC44094JeJ abstractC44094JeJ = this.A0D;
                if (abstractC44094JeJ == null) {
                    C14360o3.A0F("tabbedFragmentController");
                    throw C00O.createAndThrow();
                }
                Fragment item = abstractC44094JeJ.getItem(this.A02);
                C14360o3.A0C(item, AbstractC43591JPw.A00(0));
                A00.A07(getActivity(), (AbstractC59962oe) item);
                this.A02 = -1;
            }
            this.A01 = indexOf;
            A00();
            C55772hI.A00((AbstractC12990ll) this.A0Z.getValue()).A0B(A00());
            this.A02 = indexOf;
            if (A03().A02.isPlaying()) {
                A03().A00();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0V.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "serp";
    }

    /* JADX WARN: Type inference failed for: r19v0, types: [X.KsD, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        AbstractC44094JeJ c46080Kac;
        int i;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager viewPager = (ViewPager) AbstractC166987dD.A0c(view, R.id.tabbed_pager);
        View requireViewById = view.requireViewById(R.id.view_switcher_container);
        this.A04 = requireViewById;
        C14360o3.A07(requireViewById);
        boolean z = false;
        if (!CcV()) {
            viewPager.setPadding(0, AbstractC43594JPz.A06(requireContext()), 0, 0);
        } else {
            AbstractC13880nE.A0d(requireViewById, C3HB.A00(requireContext()));
        }
        if (this.A0X) {
            View A0U = AbstractC167017dG.A0U(view, R.id.layout_serp_bottom_searchbar);
            C14360o3.A0C(A0U, "null cannot be cast to non-null type com.instagram.ui.widget.edittext.AnimatedHintsTextLayout");
            this.A0V = (AnimatedHintsTextLayout) A0U;
        }
        viewPager.setOffscreenPageLimit(0);
        FixedTabBar fixedTabBar = (FixedTabBar) AbstractC166997dE.A0S(view, R.id.fixed_tabbar_view);
        InterfaceC09390do interfaceC09390do = this.A0Z;
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, A0k, 36318617117333863L);
        if (!A06 && this.A0Y.size() >= 6) {
            AbstractC12990ll A0k2 = AbstractC25230BEn.A0k(interfaceC09390do, 0);
            if (C18U.A06(c06090Tz, A0k2, 36318965009488692L) || C18U.A06(c06090Tz, A0k2, 36318071656552316L)) {
                z = true;
            }
        }
        this.A0R = z;
        if (z) {
            fixedTabBar.setVisibility(8);
            AbstractC10360h2 childFragmentManager = getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            TabLayout tabLayout = (TabLayout) AbstractC166987dD.A0c(view, R.id.scrollable_tab_layout);
            list = this.A0Y;
            c46080Kac = new C46079Kab(childFragmentManager, viewPager, tabLayout, this, new Object(), list);
        } else {
            if (A06 || C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36312256270894106L)) {
                fixedTabBar.A08 = true;
            }
            AbstractC10360h2 childFragmentManager2 = getChildFragmentManager();
            C14360o3.A07(childFragmentManager2);
            list = this.A0Y;
            c46080Kac = new C46080Kac(childFragmentManager2, viewPager, fixedTabBar, this, list, true, false);
        }
        this.A0D = c46080Kac;
        if (this.A0W) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                i = bundle2.getInt("composite_starting_tab_index");
            } else {
                i = 0;
            }
        } else {
            i = this.A01;
        }
        AbstractC44094JeJ abstractC44094JeJ = this.A0D;
        if (abstractC44094JeJ == null) {
            str = "tabbedFragmentController";
        } else {
            abstractC44094JeJ.setMode(i);
            if (list.contains(VEN.A04)) {
                C23031Ai c23031Ai = this.A06;
                if (c23031Ai == null) {
                    str = "userPreferences";
                } else if (c23031Ai.A01.getInt("audio_global_search_tab_nux_count", 0) < 2 && C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36312256270697496L)) {
                    view.postDelayed(new RunnableC71377Wsm(this), 500L);
                }
            }
            C34H.A00(C05F.A08);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final AbstractC67878V0j A00() {
        AbstractC44094JeJ abstractC44094JeJ = this.A0D;
        if (abstractC44094JeJ == null) {
            C14360o3.A0F("tabbedFragmentController");
            throw C00O.createAndThrow();
        }
        Fragment A02 = abstractC44094JeJ.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.search.surface.fragment.CompositeSerpTabbedFragment.SerpChildFragment");
        return (AbstractC67878V0j) A02;
    }

    public final ViewOnTouchListenerC60632pm A01() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A05;
        if (viewOnTouchListenerC60632pm != null) {
            return viewOnTouchListenerC60632pm;
        }
        C14360o3.A0F("scrollableNavigationHelper");
        throw C00O.createAndThrow();
    }

    public final C66151U1s A02() {
        C66151U1s c66151U1s = this.A07;
        if (c66151U1s != null) {
            return c66151U1s;
        }
        C14360o3.A0F("searchNavigationController");
        throw C00O.createAndThrow();
    }

    public final C43812JYz A03() {
        C43812JYz c43812JYz = this.A09;
        if (c43812JYz != null) {
            return c43812JYz;
        }
        C14360o3.A0F("trackPreviewController");
        throw C00O.createAndThrow();
    }

    public final String A04() {
        String str = this.A0K;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("searchSessionId");
        throw C00O.createAndThrow();
    }

    public final String A05() {
        String str = this.A0L;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("serpSessionId");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        Bundle bundle;
        Fragment vaj;
        VEN ven = (VEN) obj;
        C14360o3.A0B(ven, 0);
        U04.A00();
        switch (ven.ordinal()) {
            case 0:
                bundle = this.mArguments;
                this.A0Z.getValue();
                vaj = new VAJ();
                break;
            case 1:
                bundle = this.mArguments;
                this.A0Z.getValue();
                vaj = new VAI();
                break;
            case 2:
                bundle = this.mArguments;
                this.A0Z.getValue();
                vaj = new VAF();
                break;
            case 3:
                bundle = this.mArguments;
                this.A0Z.getValue();
                vaj = new VAL();
                break;
            case 4:
                bundle = this.mArguments;
                this.A0Z.getValue();
                vaj = new VAG();
                break;
            case 5:
                bundle = this.mArguments;
                this.A0Z.getValue();
                vaj = new VAH();
                break;
            case 6:
                bundle = this.mArguments;
                this.A0Z.getValue();
                vaj = new VAK();
                break;
            default:
                throw new RuntimeException();
        }
        vaj.setArguments(bundle);
        return vaj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (r1 < 7) goto L8;
     */
    @Override // X.InterfaceC50521MRz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.L5P ANJ(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r20
            X.VEN r1 = (X.VEN) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r3 = 0
            r16 = -1
            int r8 = r1.A01
            int r11 = r1.A00
            r2 = r19
            android.content.Context r1 = r2.getContext()
            r0 = 2130970312(0x7f0406c8, float:1.754933E38)
            int r9 = X.AbstractC53242c7.A0H(r1, r0)
            boolean r0 = r2.A0R
            if (r0 == 0) goto L39
            android.content.res.Resources r0 = X.AbstractC166997dE.A0N(r2)
            java.lang.String r1 = r0.getString(r8)
            java.util.regex.Pattern r0 = X.AbstractC13670mt.A00
            if (r1 == 0) goto L36
            int r1 = r1.length()
            r0 = 7
            r16 = 2131165200(0x7f070010, float:1.794461E38)
            if (r1 >= r0) goto L39
        L36:
            r16 = 2131165293(0x7f07006d, float:1.79448E38)
        L39:
            r10 = -1
            X.L5P r2 = new X.L5P
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r17 = r10
            r18 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0V.ANJ(java.lang.Object):X.L5P");
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(this.A0Z), 36317534786098523L);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0Z.getValue();
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        return A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ae, code lost:
    
        if (X.C18U.A06(r3, r9, 36318041591584614L) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e4, code lost:
    
        if (2 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x024f, code lost:
    
        if (X.C18U.A06(r3, r4, 36317534786557281L) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0320  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0V.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2091742400);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_composite_search, false);
        C0f9.A09(-280735131, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(-521044431);
        if (this.A02 != -1) {
            C55782hJ A00 = C55772hI.A00((AbstractC12990ll) this.A0Z.getValue());
            AbstractC44094JeJ abstractC44094JeJ = this.A0D;
            if (abstractC44094JeJ == null) {
                str = "tabbedFragmentController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            Fragment item = abstractC44094JeJ.getItem(this.A02);
            C14360o3.A0C(item, AbstractC43591JPw.A00(0));
            A00.A07(getActivity(), (AbstractC59962oe) item);
            this.A02 = -1;
        }
        U1Z u1z = this.A0U;
        if (u1z == null) {
            str = "metaSearchViewpointHelper";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        u1z.A00();
        super.onDestroy();
        C0f9.A09(815470436, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-506960923);
        this.A04 = null;
        super.onDestroyView();
        C0f9.A09(1830839544, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(364574091);
        super.onResume();
        if (!this.A0W) {
            A00();
        } else {
            C55772hI.A00((AbstractC12990ll) this.A0Z.getValue()).A0B(A00());
            AbstractC44094JeJ abstractC44094JeJ = this.A0D;
            if (abstractC44094JeJ == null) {
                C14360o3.A0F("tabbedFragmentController");
                throw C00O.createAndThrow();
            }
            Object A05 = abstractC44094JeJ.A05();
            C14360o3.A0B(A05, 0);
            int indexOf = this.A0Y.indexOf(A05);
            if (this.A0Q) {
                indexOf = (r2.size() - 1) - indexOf;
            }
            this.A02 = indexOf;
        }
        this.A0W = false;
        C0f9.A09(-1083273544, A02);
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (!z && A03().A02.isPlaying()) {
            A03().A00();
        }
    }
}
