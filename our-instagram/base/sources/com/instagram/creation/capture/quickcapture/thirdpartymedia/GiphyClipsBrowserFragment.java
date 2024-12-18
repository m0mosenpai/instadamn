package com.instagram.creation.capture.quickcapture.thirdpartymedia;

import X.A91;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC193598he;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.AbstractC31172DnG;
import X.AbstractC31179DnN;
import X.AbstractC43593JPy;
import X.AbstractC47838LBb;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC66552zX;
import X.B5y;
import X.C00O;
import X.C05F;
import X.C0YZ;
import X.C0f9;
import X.C14360o3;
import X.C184108Ez;
import X.C195638l4;
import X.C1XM;
import X.C22C;
import X.C25531Mh;
import X.C44220JgP;
import X.C44549Jmt;
import X.C44564Jnl;
import X.C448124l;
import X.C45056Jwl;
import X.C47712L4t;
import X.C51D;
import X.C52942bb;
import X.C57256Pbe;
import X.C88U;
import X.C8ZT;
import X.EnumC27385C6o;
import X.EnumC50631MWs;
import X.InterfaceC09390do;
import X.InterfaceC56392iX;
import X.InterfaceC60072op;
import X.JQ0;
import X.JWd;
import X.JnH;
import X.KGU;
import X.M0B;
import X.M5D;
import X.MSV;
import X.MWT;
import X.PZJ;
import X.ViewOnTouchListenerC48075LQa;
import X.ViewOnTouchListenerC48084LQj;
import X.ViewOnTouchListenerC48086LQl;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class GiphyClipsBrowserFragment extends AbstractC59962oe implements InterfaceC60072op, C51D, C88U {
    public EnumC50631MWs A00;
    public C44564Jnl A01;
    public GiphyClipsBrowserCategoriesViewController A02;
    public C44549Jmt A03;
    public ViewOnTouchListenerC48086LQl A04;
    public Integer A05;
    public Integer A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final String A0A;
    public TextView errorTextView;
    public RecyclerView giphyClipsRecyclerView;
    public SearchEditText searchEditText;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C14360o3.A0B(str, 1);
        C44549Jmt c44549Jmt = this.A03;
        if (c44549Jmt == null) {
            C14360o3.A0F("giphyBrowserViewModel");
            throw C00O.createAndThrow();
        }
        c44549Jmt.A07.Egh(new JWd(C05F.A0C, str));
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 1);
        boolean A1N = AbstractC167007dF.A1N(charSequence.length());
        C44549Jmt c44549Jmt = this.A03;
        if (A1N) {
            if (c44549Jmt != null) {
                Integer num = c44549Jmt.A00;
                C14360o3.A0B(num, 0);
                String A01 = AbstractC47838LBb.A01(num);
                c44549Jmt.A07.Egh(new JWd(C05F.A01, A01));
                C44549Jmt.A00(c44549Jmt, num);
                c44549Jmt.A00 = num;
                return;
            }
        } else if (c44549Jmt != null) {
            String obj = charSequence.toString();
            Integer num2 = C05F.A0C;
            C14360o3.A0B(obj, 0);
            c44549Jmt.A07.Egh(new JWd(num2, obj));
            return;
        }
        C14360o3.A0F("giphyBrowserViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        this.A04 = new ViewOnTouchListenerC48086LQl(requireActivity(), viewGroup, AbstractC166987dD.A0r(this.A09), new C57256Pbe(37, view, this));
        int A09 = AbstractC167007dF.A09(getContext(), R.attr.assetSearchTextColor);
        SearchEditText searchEditText = (SearchEditText) view.requireViewById(R.id.row_search_edit_text);
        this.searchEditText = searchEditText;
        if (searchEditText != null) {
            searchEditText.setHint(2131973014);
        }
        SearchEditText searchEditText2 = this.searchEditText;
        if (searchEditText2 != null) {
            searchEditText2.A0C = this;
        }
        if (searchEditText2 != null) {
            searchEditText2.setAllowTextSelection(true);
        }
        SearchEditText searchEditText3 = this.searchEditText;
        if (searchEditText3 != null) {
            searchEditText3.setCompoundDrawableTintList(ColorStateList.valueOf(A09));
        }
        SearchEditText searchEditText4 = this.searchEditText;
        if (searchEditText4 != null) {
            ViewOnTouchListenerC48084LQj.A01(searchEditText4, 10, this);
        }
        this.errorTextView = AbstractC166997dE.A0T(view, R.id.giphy_clips_error_text);
        C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout");
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) view;
        touchInterceptorFrameLayout.COs(new ViewOnTouchListenerC48075LQa(3, this, touchInterceptorFrameLayout));
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.giphy_clips_recyclerview);
        this.giphyClipsRecyclerView = A0G;
        if (A0G != null) {
            A0G.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        }
        RecyclerView recyclerView = this.giphyClipsRecyclerView;
        if (recyclerView != null) {
            C44564Jnl c44564Jnl = this.A01;
            if (c44564Jnl == null) {
                str = "giphyClipsBrowserAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView.setAdapter(c44564Jnl);
        }
        RecyclerView recyclerView2 = this.giphyClipsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.A10(new C195638l4(AbstractC167017dG.A06(viewGroup.getContext()), false));
        }
        RecyclerView recyclerView3 = this.giphyClipsRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
        RecyclerView recyclerView4 = this.giphyClipsRecyclerView;
        if (recyclerView4 != null) {
            C44220JgP.A00(recyclerView4, this, 7);
        }
        C44549Jmt c44549Jmt = this.A03;
        if (c44549Jmt == null) {
            str = "giphyBrowserViewModel";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        JQ0.A11(this, new PZJ(this, null, 48), c44549Jmt.A09);
    }

    public static final void A00(C44564Jnl c44564Jnl, GiphyClipsBrowserFragment giphyClipsBrowserFragment, List list) {
        boolean z;
        Handler handler;
        Runnable m0b;
        RecyclerView recyclerView = giphyClipsBrowserFragment.giphyClipsRecyclerView;
        if (recyclerView != null) {
            z = recyclerView.A1D();
        } else {
            z = false;
        }
        B5y b5y = new B5y(giphyClipsBrowserFragment, 23);
        C14360o3.A0B(list, 0);
        List list2 = c44564Jnl.A00;
        c44564Jnl.A00 = list;
        if (z) {
            handler = (Handler) c44564Jnl.A02.getValue();
            m0b = new M5D(c44564Jnl, list2, b5y);
        } else {
            AbstractC66552zX.A00(new JnH(list2, list)).A03(c44564Jnl);
            handler = (Handler) c44564Jnl.A02.getValue();
            m0b = new M0B(b5y);
        }
        handler.post(m0b);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0A;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public GiphyClipsBrowserFragment() {
        C0YZ A1D = AbstractC25225BEi.A1D(C184108Ez.class);
        this.A07 = AbstractC25225BEi.A0a(new B5y(this, 25), new B5y(this, 26), new C57256Pbe(38, null, this), A1D);
        this.A08 = C1XM.A00(new B5y(this, 24));
        this.A09 = AbstractC60492pY.A02(this);
        this.A0A = "giphy_clips_browser_fragment";
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CreationLayoutConfig creationLayoutConfig;
        Serializable serializable;
        EnumC50631MWs enumC50631MWs;
        int A02 = C0f9.A02(-1460999724);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Integer num = null;
        if (bundle2 != null && (creationLayoutConfig = (CreationLayoutConfig) bundle2.getParcelable(MSV.A00(679))) != null) {
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                serializable = bundle3.getSerializable("ARG_SURFACE");
            } else {
                serializable = null;
            }
            if (serializable instanceof EnumC50631MWs) {
                enumC50631MWs = (EnumC50631MWs) serializable;
            } else {
                enumC50631MWs = null;
            }
            this.A00 = enumC50631MWs;
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null && bundle4.containsKey("ARG_REPLACE_AT_INDEX")) {
                Bundle bundle5 = this.mArguments;
                if (bundle5 != null) {
                    num = AbstractC31179DnN.A0X(bundle5, "ARG_REPLACE_AT_INDEX");
                }
                this.A06 = num;
            }
            InterfaceC09390do interfaceC09390do = this.A09;
            Object value = interfaceC09390do.getValue();
            Object value2 = this.A07.getValue();
            EnumC50631MWs enumC50631MWs2 = this.A00;
            AbstractC25230BEn.A15(1, value, value2);
            C44549Jmt c44549Jmt = (C44549Jmt) new C52942bb(new KGU(1, value2, enumC50631MWs2, value), this).A00(C44549Jmt.class);
            this.A03 = c44549Jmt;
            if (c44549Jmt == null) {
                C14360o3.A0F("giphyBrowserViewModel");
                throw C00O.createAndThrow();
            }
            GiphyClipsBrowserCategoriesViewController giphyClipsBrowserCategoriesViewController = new GiphyClipsBrowserCategoriesViewController(this, c44549Jmt);
            this.A02 = giphyClipsBrowserCategoriesViewController;
            registerLifecycleListener(giphyClipsBrowserCategoriesViewController);
            this.A01 = new C44564Jnl(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), this, ((NineSixteenLayoutConfigImpl) creationLayoutConfig).A06);
            AbstractC25231BEo.A1H(this, AbstractC25229BEm.A0a(this), 12);
            C0f9.A09(-1599330410, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-1505442068, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(352304321);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.giphy_clips_browser_fragment_layout, viewGroup, false);
        C0f9.A09(-165169173, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        List<C45056Jwl> list;
        int A02 = C0f9.A02(263716616);
        super.onDestroy();
        C44549Jmt c44549Jmt = this.A03;
        Integer num = null;
        if (c44549Jmt != null) {
            if (c44549Jmt.A01) {
                AbstractC193598he abstractC193598he = (AbstractC193598he) c44549Jmt.A08.getValue();
                if (abstractC193598he instanceof C8ZT) {
                    list = (List) abstractC193598he.A00();
                    if (list != null) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (C45056Jwl c45056Jwl : list) {
                            if (c45056Jwl.A04 == C05F.A0C) {
                                Integer num2 = C05F.A00;
                                String str = c45056Jwl.A05;
                                String str2 = c45056Jwl.A07;
                                String str3 = c45056Jwl.A06;
                                int i = c45056Jwl.A00;
                                C47712L4t c47712L4t = c45056Jwl.A01;
                                C47712L4t c47712L4t2 = c45056Jwl.A02;
                                A91 a91 = c45056Jwl.A03;
                                C14360o3.A0B(str, 0);
                                AbstractC25234BEr.A1P(str2, str3, c47712L4t);
                                AbstractC167017dG.A1T(c47712L4t2, a91);
                                A1E.add(new C45056Jwl(c47712L4t, c47712L4t2, a91, num2, str, str2, str3, i));
                            } else {
                                A1E.add(c45056Jwl);
                            }
                        }
                        list = A1E;
                    }
                } else {
                    list = null;
                }
                C44549Jmt c44549Jmt2 = this.A03;
                if (c44549Jmt2 != null) {
                    Integer num3 = (Integer) ((JWd) c44549Jmt2.A09.getValue()).A00;
                    C184108Ez c184108Ez = (C184108Ez) this.A07.getValue();
                    C44549Jmt c44549Jmt3 = this.A03;
                    if (c44549Jmt3 != null) {
                        String str4 = ((JWd) c44549Jmt3.A09.getValue()).A01;
                        Integer num4 = this.A05;
                        if (num3 != C05F.A0C) {
                            C44549Jmt c44549Jmt4 = this.A03;
                            if (c44549Jmt4 != null) {
                                num = c44549Jmt4.A00;
                            }
                        }
                        c184108Ez.A00 = new MWT(num4, num3, num, str4, list);
                    }
                }
            } else {
                C22C A0T = AbstractC43593JPy.A0T(this.A09);
                EnumC50631MWs enumC50631MWs = this.A00;
                if (enumC50631MWs != null) {
                    C448124l c448124l = A0T.A09;
                    C25531Mh A08 = C25531Mh.A08(c448124l.A01);
                    if (AbstractC25226BEj.A1Z(A08)) {
                        A08.A0s("IG_CAMERA_ENTITY_TAP");
                        A08.A0R("composition_str_id", JQ0.A0O(enumC50631MWs, A08, c448124l, "THIRD_PARTY_CLIP_HUB_CANCEL").A0M);
                        AbstractC167017dG.A1D(A08);
                    }
                    ((C184108Ez) this.A07.getValue()).A00 = null;
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A09(1980325317, A02);
                    throw A0g;
                }
            }
            C0f9.A09(-1646816195, A02);
            return;
        }
        C14360o3.A0F("giphyBrowserViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(338015204);
        super.onDestroyView();
        GiphyClipsBrowserFragmentLifecycleUtil.cleanupReferences(this);
        ViewOnTouchListenerC48086LQl viewOnTouchListenerC48086LQl = this.A04;
        if (viewOnTouchListenerC48086LQl == null) {
            C14360o3.A0F("peekController");
            throw C00O.createAndThrow();
        }
        viewOnTouchListenerC48086LQl.A07 = true;
        viewOnTouchListenerC48086LQl.A0J.A0A("end_peek");
        C0f9.A09(-1618494842, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1830051560);
        super.onPause();
        ViewOnTouchListenerC48086LQl viewOnTouchListenerC48086LQl = this.A04;
        if (viewOnTouchListenerC48086LQl == null) {
            C14360o3.A0F("peekController");
            throw C00O.createAndThrow();
        }
        viewOnTouchListenerC48086LQl.A00();
        C0f9.A09(954279422, A02);
    }
}
