package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class KDU extends AbstractC59962oe implements C51E, C51D {
    public static final String __redex_internal_original_name = "EffectMiniGalleryFragment";
    public int A00;
    public ViewPager A01;
    public TabLayout A02;
    public C44445JlC A03;
    public C87T A04;
    public String A05;
    public C3DN A07;
    public List A06 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        return 200;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_camera_mini_gallery";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewPager viewPager = (ViewPager) AbstractC166997dE.A0R(view, R.id.camera_effect_category_view_pager);
        this.A01 = viewPager;
        viewPager.setAdapter(this.A03);
        viewPager.A0J(new C48113LRn(this, 1));
        TabLayout tabLayout = (TabLayout) AbstractC166997dE.A0R(view, R.id.tab_layout);
        this.A02 = tabLayout;
        tabLayout.setTabMode(0);
        tabLayout.setupWithViewPager(viewPager);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(int r7, int r8, java.lang.String r9, int r10) {
        /*
            r6 = this;
            com.google.android.material.tabs.TabLayout r0 = r6.A02
            if (r0 == 0) goto L3c
            X.6wf r5 = r0.A07(r7)
            if (r5 == 0) goto L3c
            android.content.Context r0 = r6.requireContext()
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r8)
            if (r4 == 0) goto L3c
            android.content.Context r3 = r6.requireContext()
            X.87T r0 = r6.A04
            r2 = 1
            if (r0 == 0) goto L56
            boolean r0 = r0.A09
            if (r0 != r2) goto L56
        L21:
            if (r7 != r10) goto L3d
            if (r2 == 0) goto L4a
            r0 = 2131099706(0x7f06003a, float:1.7811773E38)
        L28:
            X.AbstractC25231BEo.A0x(r3, r4, r0)
            r5.A02(r4)
            java.lang.String r0 = ""
            r5.A04(r0)
            r5.A06 = r9
            X.6wg r0 = r5.A04
            if (r0 == 0) goto L3c
            r0.A04()
        L3c:
            return
        L3d:
            android.content.Context r1 = r6.getContext()
            r0 = 2130970309(0x7f0406c5, float:1.7549324E38)
            if (r2 == 0) goto L51
            r0 = 2130970185(0x7f040649, float:1.7549073E38)
            goto L51
        L4a:
            android.content.Context r1 = r6.getContext()
            r0 = 2130970276(0x7f0406a4, float:1.7549258E38)
        L51:
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            goto L28
        L56:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDU.A00(int, int, java.lang.String, int):void");
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
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
    public final boolean isScrolledToBottom() {
        InterfaceC08430c6 interfaceC08430c6;
        C44445JlC c44445JlC = this.A03;
        if (c44445JlC != null && (interfaceC08430c6 = (Fragment) c44445JlC.A02.get(c44445JlC.A00)) != null) {
            return ((InterfaceC50489MQr) interfaceC08430c6).isScrolledToBottom();
        }
        return false;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        InterfaceC08430c6 interfaceC08430c6;
        C44445JlC c44445JlC = this.A03;
        if (c44445JlC != null && (interfaceC08430c6 = (Fragment) c44445JlC.A02.get(c44445JlC.A00)) != null) {
            return ((InterfaceC50489MQr) interfaceC08430c6).isScrolledToTop();
        }
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        C87T c87t = this.A04;
        if (c87t != null) {
            c87t.A06();
        }
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C3DN c3dn = this.A07;
        if (c3dn != null) {
            int A08 = c3dn.A08() - i;
            C87T c87t = this.A04;
            if (c87t != null) {
                c87t.A0N.Egh(Integer.valueOf(A08));
            }
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A01(KDU kdu, int i) {
        String str;
        Context context = kdu.getContext();
        if (context != null) {
            str = C02G.A01(context).getString(2131973002);
        } else {
            str = null;
        }
        kdu.A00(0, R.drawable.instagram_search_pano_outline_16, str, i);
        kdu.A00(1, R.drawable.instagram_save_pano_outline_16, null, i);
        boolean booleanValue = C6PY.A00(AbstractC31178DnM.A0M(kdu.A08)).booleanValue();
        int i2 = R.drawable.instagram_sparkles_outline_16;
        if (booleanValue) {
            i2 = R.drawable.instagram_effects_pano_outline_16;
        }
        kdu.A00(2, i2, null, i);
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
        int A02 = C0f9.A02(1705306527);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getInt("effect_discovery_entry_point_key");
        this.A05 = requireArguments.getString("surface", AnonymousClass859.A06.toString());
        setModuleNameV2("ig_camera_mini_gallery");
        C0f9.A09(1761426824, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int i;
        AbstractC10360h2 childFragmentManager;
        UserSession A0r;
        String str;
        String str2;
        Object obj;
        C9CD c9cd;
        int A02 = C0f9.A02(1819489723);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity requireActivity = requireActivity();
        try {
            this.A04 = (C87T) new C52942bb(requireActivity).A00(C87T.class);
            this.A07 = AbstractC31172DnG.A0r(requireActivity);
            childFragmentManager = getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            A0r = AbstractC166987dD.A0r(this.A08);
            str = this.A05;
            str2 = "strSurface";
        } catch (Exception e) {
            C0w9.A06(__redex_internal_original_name, "Exception retrieving MiniGalleryViewModel", e);
            AbstractC31176DnK.A12(requireContext(), C3DN.A00);
            C87T c87t = this.A04;
            boolean z = true;
            if (c87t == null || !c87t.A09) {
                z = false;
            }
            if (z) {
                inflate = JQ0.A0D(layoutInflater, this).inflate(R.layout.effect_mini_gallery_fragment_layout, viewGroup, false);
                i = 1484409582;
            } else {
                inflate = layoutInflater.inflate(R.layout.effect_mini_gallery_fragment_layout, viewGroup, false);
                i = -2142953331;
            }
        }
        if (str != null) {
            this.A03 = new C44445JlC(childFragmentManager, A0r, str);
            C87T c87t2 = this.A04;
            if (c87t2 != null) {
                String str3 = this.A05;
                if (str3 != null) {
                    c87t2.A08(str3);
                }
            }
            C87T c87t3 = this.A04;
            if (c87t3 != null) {
                int i2 = this.A00;
                if (c87t3.A06 != null) {
                    UserSession userSession = c87t3.A0E;
                    C4T6 A00 = C4T4.A00(userSession);
                    String str4 = c87t3.A06;
                    if (str4 != null) {
                        A00.Clm(AbstractC225599xe.A00(c87t3.A03), EnumC46264Kdw.MINI_GALLERY, str4, i2);
                        C87R c87r = c87t3.A0C;
                        if (!c87r.A02.get()) {
                            c87r.A01.A0C("fragment_opened", c87r.A03.get());
                        }
                        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
                        if (A0x.getInt("mini_gallery_has_opened_mini_gallery_count_v2", 0) < 3) {
                            AbstractC167017dG.A1L(A0x.ARD(), A0x, "mini_gallery_has_opened_mini_gallery_count_v2", 0);
                        }
                        c87t3.A0O.Egh(EnumC1824287h.A03);
                        c87t3.A01 = new C47903LDx(userSession);
                        c87t3.A0J.set(false);
                        List list = (List) c87t3.A02.A00.A02();
                        if (list != null && (c9cd = (C9CD) AbstractC001800i.A0O(list, 0)) != null) {
                            obj = c9cd.A00;
                        } else {
                            obj = null;
                        }
                        if (obj != c87t3.A03) {
                            c87t3.A02 = new C1824587k();
                        }
                    } else {
                        str2 = "discoverySessionId";
                    }
                } else {
                    throw AbstractC166987dD.A14("Please call MiniGallery.onOpenTapped, before launching the EffectMiniGalleryFragment");
                }
            }
            C87T c87t4 = this.A04;
            if (c87t4 != null) {
                if (c87t4.A02.A00.A02() != null && !c87t4.A0M.get()) {
                    C87R c87r2 = c87t4.A0C;
                    if (!c87r2.A02.get()) {
                        c87r2.A01.A0C("categories_already_fetched", c87r2.A03.get());
                    }
                } else {
                    InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(c87t4.A08);
                    C87R c87r3 = c87t4.A0C;
                    if (!c87r3.A02.get()) {
                        c87r3.A01.A0C("requesting_category_fetch", c87r3.A03.get());
                    }
                    c87t4.A08 = AbstractC18560vj.A03(AbstractC141776au.A00(c87t4), new C15340po(new C9D0(c87t4, A0s, 9), c87t4.A0D.A05(c87t4.A03, c87t4.A0M.get(), c87t4.A0K.get())));
                }
                C2GS c2gs = c87t4.A02.A00;
                C14360o3.A0C(c2gs, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.collections.List<com.instagram.ar.core.discovery.minigallery.models.MiniGalleryCategory>>");
                AbstractC43593JPy.A1E(getViewLifecycleOwner(), c2gs, new C50356MLi(this, 34), 8);
                C86K c86k = c87t4.A02.A04;
                C14360o3.A0C(c86k, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Int>");
                AbstractC43593JPy.A1E(getViewLifecycleOwner(), c86k, new C50356MLi(this, 35), 8);
                AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(c87t4.A04.A00), new C50356MLi(this, 36), 8);
                C86K c86k2 = c87t4.A0F;
                C14360o3.A0C(c86k2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Int>");
                AbstractC43593JPy.A1E(this, c86k2, new C50356MLi(this, 37), 8);
            }
            C87T c87t5 = this.A04;
            boolean z2 = true;
            if (c87t5 == null || !c87t5.A09) {
                z2 = false;
            }
            if (z2) {
                inflate = JQ0.A0D(layoutInflater, this).inflate(R.layout.effect_mini_gallery_fragment_layout, viewGroup, false);
                i = 1036100932;
            } else {
                inflate = layoutInflater.inflate(R.layout.effect_mini_gallery_fragment_layout, viewGroup, false);
                i = -281823851;
            }
            C0f9.A09(i, A02);
            return inflate;
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
