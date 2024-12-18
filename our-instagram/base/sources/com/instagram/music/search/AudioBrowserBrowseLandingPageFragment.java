package com.instagram.music.search;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25230BEn;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31178DnM;
import X.AbstractC43593JPy;
import X.AbstractC44094JeJ;
import X.AbstractC54062NvM;
import X.AbstractC54912fq;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C06090Tz;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C22M;
import X.C24Q;
import X.C24U;
import X.C25531Mh;
import X.C27961Xa;
import X.C448124l;
import X.C51341Mm2;
import X.C54691ODr;
import X.C54922fr;
import X.C55175Ode;
import X.C677733r;
import X.C8BN;
import X.EnumC1810381f;
import X.EnumC193318hB;
import X.EnumC50631MWs;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC50521MRz;
import X.InterfaceC57964PnA;
import X.InterfaceC58054Pof;
import X.InterfaceC58055Pog;
import X.InterfaceC71183He;
import X.KD2;
import X.L5P;
import X.MSW;
import X.MSX;
import X.MSY;
import X.MSZ;
import X.MYT;
import X.P72;
import X.P7A;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicBrowserCategoryModel;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AudioBrowserBrowseLandingPageFragment extends AbstractC59962oe implements InterfaceC58055Pog, InterfaceC71183He, InterfaceC50521MRz, InterfaceC58054Pof {
    public int A00;
    public C8BN A01;
    public EnumC50631MWs A02;
    public ImmutableList A03;
    public ImmutableList A04;
    public MusicProduct A05;
    public C55175Ode A06;
    public MusicAttributionConfig A07;
    public C677733r A08;
    public C54691ODr A09;
    public InterfaceC57964PnA A0A;
    public MusicOverlaySearchTab A0B;
    public EnumC1810381f A0C;
    public String A0D;
    public String A0E;
    public Map A0F;
    public boolean A0G;
    public final InterfaceC09390do A0H = AbstractC60492pY.A02(this);
    public FixedTabBar tabBar;
    public TabLayout tabLayout;
    public AbstractC44094JeJ tabbedFragmentController;
    public ViewPager viewPager;

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ void Dru(Object obj) {
        String str;
        C14360o3.A0B(obj, 0);
        if (obj.equals(MusicOverlaySearchTab.A04)) {
            if (this.A06 == null) {
                str = "musicLogger";
            } else {
                UserSession A0r = AbstractC166987dD.A0r(this.A0H);
                String str2 = this.A0D;
                if (str2 == null) {
                    str = "browseSessionFullId";
                } else {
                    C14360o3.A0B(A0r, 0);
                    C448124l A0S = MSW.A0S(A0r);
                    C25531Mh A0G = MSW.A0G(A0S);
                    if (AbstractC25226BEj.A1Z(A0G)) {
                        A0G.A0q("AUDIO_BROWSER_BROWSE_TAB");
                        C448124l.A00(A0G, A0S);
                        MSY.A19(A0G, A0S);
                        C22M c22m = A0S.A04;
                        A0G.A0b(c22m.A09);
                        A0G.A0W(2);
                        A0G.A0R("browse_session_id", str2);
                        AbstractC167007dF.A13(A0G);
                        A0G.A0V(MSZ.A05(c22m));
                        A0G.A0Q("capture_format_index", AbstractC167007dF.A0d());
                        A0G.A0c(c22m.A0A);
                        AbstractC167017dG.A1D(A0G);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (obj.equals(MusicOverlaySearchTab.A09) || obj.equals(MusicOverlaySearchTab.A0A)) {
            AbstractC43593JPy.A0T(this.A0H).A0u(EnumC193318hB.A08);
        }
        Fragment A03 = A02().A03(obj);
        A03.setUserVisibleHint(true);
        int size = A02().A00.size();
        for (int i = 0; i < size; i++) {
            Fragment item = A02().getItem(i);
            C14360o3.A07(item);
            if (item != A03) {
                item.setUserVisibleHint(false);
            }
        }
        ViewPager viewPager = this.viewPager;
        if (viewPager != null) {
            viewPager.requestFocus();
        } else {
            str = "viewPager";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "audio_browser_browse_landing_page";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (X.C18U.A06(r6, r5, r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36322581373790567L) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.AudioBrowserBrowseLandingPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final boolean A00() {
        if (this.tabbedFragmentController != null && A02().A00.size() > 0) {
            return true;
        }
        return false;
    }

    private final boolean A01() {
        MusicProduct musicProduct = this.A05;
        if (musicProduct != null) {
            if (musicProduct != MusicProduct.A04) {
                AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0H);
                MusicProduct musicProduct2 = this.A05;
                if (musicProduct2 != null) {
                    C14360o3.A0B(A0o, 0);
                    if (musicProduct2 == MusicProduct.A0G && C18U.A06(C06090Tz.A05, A0o, 36322581373790567L)) {
                        return true;
                    }
                    return false;
                }
            } else {
                return true;
            }
        }
        C14360o3.A0F("musicProduct");
        throw C00O.createAndThrow();
    }

    public final AbstractC44094JeJ A02() {
        AbstractC44094JeJ abstractC44094JeJ = this.tabbedFragmentController;
        if (abstractC44094JeJ != null) {
            return abstractC44094JeJ;
        }
        C14360o3.A0F("tabbedFragmentController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        String str;
        String str2;
        Fragment fragment;
        MusicOverlaySearchTab musicOverlaySearchTab = (MusicOverlaySearchTab) obj;
        C14360o3.A0B(musicOverlaySearchTab, 0);
        MusicBrowseCategory musicBrowseCategory = musicOverlaySearchTab.A01;
        if ("gallery".equals(musicBrowseCategory.A00())) {
            InterfaceC09390do interfaceC09390do = this.A0H;
            if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36314463883758149L)) {
                UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
                Fragment kd2 = new KD2();
                kd2.setArguments(AbstractC31178DnM.A05(A0K));
                fragment = kd2;
                return fragment;
            }
        }
        UserSession A0r = AbstractC166987dD.A0r(this.A0H);
        MusicAttributionConfig musicAttributionConfig = this.A07;
        MusicProduct musicProduct = this.A05;
        if (musicProduct == null) {
            str2 = "musicProduct";
        } else {
            ImmutableList immutableList = this.A04;
            if (immutableList == null) {
                str2 = "audioTrackTypesToExclude";
            } else {
                String str3 = this.A0D;
                if (str3 == null) {
                    str2 = "browseSessionFullId";
                } else {
                    EnumC1810381f enumC1810381f = this.A0C;
                    if (enumC1810381f == null) {
                        str2 = "captureState";
                    } else {
                        EnumC50631MWs enumC50631MWs = this.A02;
                        if (enumC50631MWs == null) {
                            str2 = "surfaceType";
                        } else {
                            C8BN c8bn = this.A01;
                            ImmutableList immutableList2 = this.A03;
                            int i = this.A00;
                            String str4 = this.A0E;
                            boolean z = this.A0G;
                            Map map = this.A0F;
                            if (C14360o3.A0K(musicBrowseCategory.A00(), "trending")) {
                                str = "full_list";
                            } else {
                                str = "preview";
                            }
                            MYT A00 = AbstractC54062NvM.A00(c8bn, enumC50631MWs, immutableList, immutableList2, musicProduct, A0r, musicAttributionConfig, musicBrowseCategory, musicOverlaySearchTab, enumC1810381f, str3, str4, str, map, i, true, z);
                            InterfaceC57964PnA interfaceC57964PnA = this.A0A;
                            if (interfaceC57964PnA == null) {
                                str2 = "trackSelectionDelegate";
                            } else {
                                A00.A05 = interfaceC57964PnA;
                                C677733r c677733r = this.A08;
                                if (c677733r != null) {
                                    A00.A03 = c677733r;
                                    fragment = A00;
                                    return fragment;
                                }
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        String string;
        MusicOverlaySearchTab musicOverlaySearchTab = (MusicOverlaySearchTab) obj;
        C14360o3.A0B(musicOverlaySearchTab, 0);
        MusicBrowserCategoryModel musicBrowserCategoryModel = musicOverlaySearchTab.A02;
        if (musicBrowserCategoryModel != null) {
            string = musicBrowserCategoryModel.A01;
        } else {
            string = getString(musicOverlaySearchTab.A00);
        }
        String format = String.format(Locale.getDefault(), getString(2131967985), string);
        C14360o3.A07(format);
        return new L5P(null, null, null, string, format, -1, R.color.asset_picker_tab_colors, R.color.design_dark_default_color_on_background, -1, -1, R.color.fds_transparent, -1, -1, -1, -1, -1);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0H);
    }

    @Override // X.InterfaceC71183He
    public final void DI9(Fragment fragment) {
        if (A00()) {
            A02().A02().setUserVisibleHint(false);
        }
    }

    @Override // X.InterfaceC71183He
    public final void DID(Fragment fragment) {
        if (A00()) {
            A02().A02().setUserVisibleHint(true);
        }
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToBottom() {
        if (A00()) {
            InterfaceC08430c6 A02 = A02().A02();
            if (A02 instanceof InterfaceC58055Pog) {
                return ((InterfaceC58055Pog) A02).isScrolledToBottom();
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToTop() {
        if (A00()) {
            InterfaceC08430c6 A02 = A02().A02();
            if (A02 instanceof InterfaceC58055Pog) {
                return ((InterfaceC58055Pog) A02).isScrolledToTop();
            }
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        C8BN c8bn;
        ImmutableList immutableList;
        int A02 = C0f9.A02(2106184280);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0G = bundle2.getBoolean("shouldUseLightMode", false);
            this.A0F = (Map) bundle2.getSerializable("visualFeatures");
            Serializable serializable = bundle2.getSerializable("music_product");
            if (serializable != null) {
                this.A05 = (MusicProduct) serializable;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("audio_type_to_exclude");
                if (parcelableArrayList != null) {
                    builder.addAll(parcelableArrayList);
                    this.A04 = builder.build();
                    this.A0D = AbstractC31173DnH.A0k(bundle2, "browse_session_full_id");
                    Serializable serializable2 = bundle2.getSerializable("capture_state");
                    if (serializable2 != null) {
                        this.A0C = (EnumC1810381f) serializable2;
                        Serializable serializable3 = bundle2.getSerializable("camera_surface_type");
                        if (serializable3 != null) {
                            this.A02 = (EnumC50631MWs) serializable3;
                            Serializable serializable4 = bundle2.getSerializable("camera_music_browser_entry_point");
                            if (serializable4 instanceof C8BN) {
                                c8bn = (C8BN) serializable4;
                            } else {
                                c8bn = null;
                            }
                            this.A01 = c8bn;
                            Serializable serializable5 = bundle2.getSerializable("camera_already_attached_tracks");
                            if (serializable5 instanceof ImmutableList) {
                                immutableList = (ImmutableList) serializable5;
                            } else {
                                immutableList = null;
                            }
                            this.A03 = immutableList;
                            this.A07 = (MusicAttributionConfig) bundle2.getParcelable("MusicOverlayBrowseResultsFragment.music_attribution_config");
                            this.A00 = bundle2.getInt("list_bottom_padding_px");
                            this.A0E = bundle2.getString("media_id");
                            if (bundle2.containsKey("defaultFocusedTab")) {
                                this.A0B = (MusicOverlaySearchTab) bundle2.getParcelable("defaultFocusedTab");
                            }
                            addFragmentVisibilityListener(this);
                            C54691ODr c54691ODr = this.A09;
                            if (c54691ODr != null) {
                                C27961Xa A00 = AbstractC54912fq.A00();
                                UserSession userSession = c54691ODr.A04;
                                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A14;
                                C54922fr A0S = AbstractC31175DnJ.A0S();
                                P72.A00(A0S, c54691ODr, 6);
                                A0S.A08 = P7A.A00;
                                c54691ODr.A00 = AbstractC31175DnJ.A0T(this, userSession, A0S, A00, quickPromotionSlot);
                            }
                            this.A06 = new C55175Ode();
                            C24U A0V = MSZ.A0V(this.A0H);
                            MusicProduct musicProduct = this.A05;
                            if (musicProduct == null) {
                                C14360o3.A0F("musicProduct");
                                throw C00O.createAndThrow();
                            }
                            String str = musicProduct.A00;
                            C14360o3.A0B(str, 0);
                            long j = A0V.A02;
                            C24Q c24q = A0V.A0E;
                            if (j == 17641988) {
                                long A03 = c24q.A03(17641988, A0V.A0B);
                                A0V.A02 = A03;
                                c24q.A09(A03, "music_browser_entry_point", "unknown");
                            } else {
                                MSX.A1K(c24q, "music_browser_search_overlay_fragment_music_product : ", str, j);
                            }
                            C0f9.A09(803880679, A02);
                            return;
                        }
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = -2072552052;
                    } else {
                        A14 = AbstractC166987dD.A14("Required value was null.");
                        i = -1505153241;
                    }
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -569739723;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -11857277;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -359099330;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-648035775);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A0G) {
            layoutInflater = AbstractC43593JPy.A0C(requireContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_overlay_search_landing_page, viewGroup, false);
        C0f9.A09(1471296986, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C51341Mm2 c51341Mm2;
        int A02 = C0f9.A02(-853748717);
        super.onDestroy();
        C54691ODr c54691ODr = this.A09;
        if (c54691ODr != null) {
            if (c54691ODr.A02 != null && (c51341Mm2 = c54691ODr.A01) != null) {
                IgImageView igImageView = c51341Mm2.A05;
                if (igImageView != null) {
                    igImageView.setVisibility(8);
                }
                TextView textView = c51341Mm2.A04;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = c51341Mm2.A02;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = c51341Mm2.A03;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                ImageView imageView = c51341Mm2.A01;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            c54691ODr.A01 = null;
            c54691ODr.A02 = null;
            c54691ODr.A00 = null;
        }
        C0f9.A09(606696231, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-658073385);
        super.onDestroyView();
        AudioBrowserBrowseLandingPageFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(1219639095, A02);
    }

    @Override // X.InterfaceC58054Pof
    public final /* bridge */ /* synthetic */ InterfaceC58054Pof EZK(C677733r c677733r) {
        this.A08 = c677733r;
        return this;
    }

    @Override // X.InterfaceC58054Pof
    public final /* bridge */ /* synthetic */ InterfaceC58054Pof Eg5(InterfaceC57964PnA interfaceC57964PnA) {
        this.A0A = interfaceC57964PnA;
        return this;
    }
}
