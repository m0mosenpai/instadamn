package X;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NQI extends AbstractC50663MYg implements InterfaceC58054Pof {
    public static final String __redex_internal_original_name = "MusicOverlaySearchV2Fragment";
    public C677733r A00;
    public C54426O3g A01;
    public P64 A02;
    public InterfaceC57964PnA A03;
    public MusicSearchQueryViewModel A04;
    public EnumC1810381f A05;
    public int A06;
    public P65 A07;
    public Map A08;
    public boolean A09;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "music_search";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        P65 p65 = this.A07;
        if (p65 != null) {
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), p65.A02.A06, C57745PjY.A00(p65, 44), 61);
        }
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A04;
        if (musicSearchQueryViewModel != null) {
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), musicSearchQueryViewModel.A06, C57745PjY.A00(this, 39), 60);
            MusicSearchQueryViewModel musicSearchQueryViewModel2 = this.A04;
            if (musicSearchQueryViewModel2 != null) {
                AbstractC31174DnI.A1E(getViewLifecycleOwner(), musicSearchQueryViewModel2.A05, C57745PjY.A00(this, 40), 60);
                MusicSearchQueryViewModel musicSearchQueryViewModel3 = this.A04;
                if (musicSearchQueryViewModel3 != null) {
                    AbstractC31174DnI.A1E(getViewLifecycleOwner(), musicSearchQueryViewModel3.A04, C57745PjY.A00(this, 41), 60);
                    MusicSearchQueryViewModel musicSearchQueryViewModel4 = this.A04;
                    if (musicSearchQueryViewModel4 != null) {
                        AbstractC31174DnI.A1E(getViewLifecycleOwner(), musicSearchQueryViewModel4.A03, C57745PjY.A00(this, 42), 60);
                        MusicSearchQueryViewModel musicSearchQueryViewModel5 = this.A04;
                        if (musicSearchQueryViewModel5 != null) {
                            AbstractC31174DnI.A1E(getViewLifecycleOwner(), musicSearchQueryViewModel5.A02, C57745PjY.A00(this, 43), 60);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("musicSearchQueryViewModel");
        throw C00O.createAndThrow();
    }

    public static final void A00(NQI nqi, boolean z) {
        String A0g;
        C54426O3g c54426O3g;
        C54426O3g c54426O3g2 = nqi.A01;
        if (c54426O3g2 != null) {
            P64 p64 = nqi.A02;
            String str = null;
            if (p64 == null) {
                C14360o3.A0F("musicSearchResultsView");
                throw C00O.createAndThrow();
            }
            if (z && (A0g = AbstractC167007dF.A0g(c54426O3g2.A00.A0J.A04)) != null && A0g.length() != 0 && (c54426O3g = nqi.A01) != null) {
                str = AbstractC167007dF.A0g(c54426O3g.A00.A0J.A04);
            }
            C50979Mfm c50979Mfm = p64.A02.A0F;
            if (!C14360o3.A0K(c50979Mfm.A03, str)) {
                c50979Mfm.A03 = str;
                c50979Mfm.A00();
            }
        }
    }

    public static final boolean A01(NQI nqi, String str, boolean z, boolean z2) {
        MusicSearchQueryViewModel musicSearchQueryViewModel = nqi.A04;
        if (musicSearchQueryViewModel == null) {
            C14360o3.A0F("musicSearchQueryViewModel");
            throw C00O.createAndThrow();
        }
        OKv oKv = new OKv(str, nqi.A06, z, true, z2);
        if (AbstractC54064NvO.A00(oKv)) {
            O8G o8g = musicSearchQueryViewModel.A0G.A03.A01;
            Object A02 = o8g.A01.A02(oKv);
            if (A02 != null) {
                o8g.A00.A0A(new Pair(oKv, A02));
            }
        }
        O8G o8g2 = musicSearchQueryViewModel.A0H.A01.A01;
        Object A022 = o8g2.A01.A02(oKv);
        if (A022 != null) {
            o8g2.A00.A0A(new Pair(oKv, A022));
        }
        return musicSearchQueryViewModel.A0F.A01(oKv);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToBottom() {
        P64 p64 = this.A02;
        if (p64 == null) {
            C14360o3.A0F("musicSearchResultsView");
            throw C00O.createAndThrow();
        }
        return p64.A02.A0A();
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToTop() {
        P64 p64 = this.A02;
        if (p64 == null) {
            C14360o3.A0F("musicSearchResultsView");
            throw C00O.createAndThrow();
        }
        return p64.A02.A0B();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int i2;
        C8BN c8bn;
        ImmutableList immutableList;
        int A02 = C0f9.A02(129024650);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        setModuleNameV2("music_search");
        C60842q8 A0a = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 49), new C57245PbT(this, 7), C57531Pg5.A00(null, this, 30), AbstractC25225BEi.A1D(ClipsCreationViewModel.class));
        C60842q8 A0a2 = AbstractC25225BEi.A0a(new C57245PbT(this, 1), new C29900DGo(27, AbstractC25225BEi.A0a(new C57245PbT(this, 0), new C57245PbT(this, 6), C57531Pg5.A00(null, this, 31), AbstractC25225BEi.A1D(C87D.class)), this, A0a), C57531Pg5.A00(null, this, 32), AbstractC25225BEi.A1D(C50858Mdp.class));
        C60842q8 A0a3 = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 47), new C57245PbT(this, 8), C57531Pg5.A00(null, this, 28), AbstractC25225BEi.A1D(C50669MYn.class));
        Serializable serializable = requireArguments.getSerializable("music_product");
        if (serializable != null) {
            MusicProduct musicProduct = (MusicProduct) serializable;
            C57531Pg5 A00 = C57531Pg5.A00(musicProduct, this, 34);
            InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57245PbT(new C57245PbT(this, 2), 3));
            C60842q8 A0a4 = AbstractC25225BEi.A0a(new C57245PbT(A002, 4), A00, C57531Pg5.A00(null, A002, 33), AbstractC25225BEi.A1D(C50979Mfm.class));
            C60842q8 A0a5 = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 48), new C57245PbT(this, 5), C57531Pg5.A00(null, this, 29), AbstractC25225BEi.A1D(C50664MYh.class));
            Serializable serializable2 = requireArguments.getSerializable("capture_state");
            C14360o3.A0C(serializable2, "null cannot be cast to non-null type instagram.core.camera.CaptureState");
            this.A05 = (EnumC1810381f) serializable2;
            String A0k = AbstractC31173DnH.A0k(requireArguments, "browse_session_full_id");
            String A0k2 = AbstractC31173DnH.A0k(requireArguments, "browse_session_single_id");
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(AbstractC153636vY.A02(requireArguments, AudioTrackType.class, "audio_type_to_exclude"));
            ImmutableList A0K = AbstractC31172DnG.A0K(builder);
            InterfaceC09390do interfaceC09390do = this.A0A;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            AbstractC167007dF.A1K(A0r, musicProduct);
            if (musicProduct != MusicProduct.A06 ? !C36A.A00(musicProduct, A0r) : C18U.A06(C06090Tz.A05, A0r, 36322581372873049L)) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            this.A06 = i2;
            this.A09 = requireArguments.getBoolean("should_use_light_mode", false);
            this.A08 = (Map) requireArguments.getSerializable("visual_features");
            MusicSearchQueryViewModel musicSearchQueryViewModel = (MusicSearchQueryViewModel) new C52320NDj(this, musicProduct, AbstractC166987dD.A0r(interfaceC09390do), new C54428O3i(this), new C54429O3j(this), A0k, A0k2).create(MusicSearchQueryViewModel.class);
            this.A04 = musicSearchQueryViewModel;
            if (musicSearchQueryViewModel == null) {
                C14360o3.A0F("musicSearchQueryViewModel");
                throw C00O.createAndThrow();
            }
            this.A07 = new P65(musicSearchQueryViewModel);
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            InterfaceC57964PnA interfaceC57964PnA = this.A03;
            C677733r c677733r = this.A00;
            C50664MYh c50664MYh = (C50664MYh) A0a5.getValue();
            int i3 = requireArguments.getInt("list_bottom_padding_px");
            Serializable serializable3 = requireArguments.getSerializable("capture_state");
            C14360o3.A0C(serializable3, "null cannot be cast to non-null type instagram.core.camera.CaptureState");
            EnumC1810381f enumC1810381f = (EnumC1810381f) serializable3;
            Serializable serializable4 = requireArguments.getSerializable("camera_surface_type");
            C14360o3.A0C(serializable4, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraSurfaceTypes");
            EnumC50631MWs enumC50631MWs = (EnumC50631MWs) serializable4;
            Serializable serializable5 = requireArguments.getSerializable("camera_music_browser_entry_point");
            if (serializable5 instanceof C8BN) {
                c8bn = (C8BN) serializable5;
            } else {
                c8bn = null;
            }
            Serializable serializable6 = requireArguments.getSerializable("camera_already_attached_tracks");
            if (serializable6 instanceof ImmutableList) {
                immutableList = (ImmutableList) serializable6;
            } else {
                immutableList = null;
            }
            P65 p65 = this.A07;
            if (p65 != null) {
                P63 p63 = new P63(this);
                C50858Mdp c50858Mdp = (C50858Mdp) A0a2.getValue();
                C50669MYn c50669MYn = (C50669MYn) A0a3.getValue();
                C50979Mfm c50979Mfm = (C50979Mfm) A0a4.getValue();
                C8BN c8bn2 = c8bn;
                ImmutableList immutableList2 = immutableList;
                P64 p64 = new P64(c8bn2, enumC50631MWs, A0K, immutableList2, musicProduct, this, A0r2, c50858Mdp, (ClipsCreationViewModel) A0a.getValue(), c677733r, p63, interfaceC57964PnA, p65, c50664MYh, c50979Mfm, c50669MYn, enumC1810381f, A0k, A0k2, this.A08, i3, this.A09);
                this.A02 = p64;
                P65 p652 = this.A07;
                if (p652 != null) {
                    p652.A00 = p64;
                }
                C0f9.A09(-1214886627, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1142602684;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1676148321;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(49889566);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A09) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_overlay_results, viewGroup, false);
        C0f9.A09(2024388062, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1176228912);
        super.onDestroy();
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A04;
        if (musicSearchQueryViewModel == null) {
            C14360o3.A0F("musicSearchQueryViewModel");
            throw C00O.createAndThrow();
        }
        musicSearchQueryViewModel.A0J.A00 = null;
        C54814OKp c54814OKp = musicSearchQueryViewModel.A0F;
        c54814OKp.A01.A00();
        c54814OKp.A02.A00();
        C0f9.A09(1236982431, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r1 == false) goto L9;
     */
    @Override // X.AbstractC59962oe, X.AbstractC59972of
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSetUserVisibleHint(boolean r4, boolean r5) {
        /*
            r3 = this;
            super.onSetUserVisibleHint(r4, r5)
            X.O3g r0 = r3.A01
            if (r0 == 0) goto L18
            X.P65 r0 = r3.A07
            if (r0 == 0) goto L18
            if (r4 == 0) goto L14
            boolean r1 = r0.isLoading()
            r0 = 1
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            A00(r3, r0)
        L18:
            com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r2 = r3.A04
            if (r2 == 0) goto L27
            if (r4 == 0) goto L27
            X.6aw r1 = X.AbstractC141776au.A00(r2)
            r0 = 44
            X.PZF.A02(r2, r1, r0)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQI.onSetUserVisibleHint(boolean, boolean):void");
    }

    @Override // X.InterfaceC58054Pof
    public final /* bridge */ /* synthetic */ InterfaceC58054Pof EZK(C677733r c677733r) {
        this.A00 = c677733r;
        return this;
    }

    @Override // X.InterfaceC58054Pof
    public final /* bridge */ /* synthetic */ InterfaceC58054Pof Eg5(InterfaceC57964PnA interfaceC57964PnA) {
        this.A03 = interfaceC57964PnA;
        return this;
    }
}
