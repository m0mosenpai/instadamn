package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.search.MusicOverlayResultsListController;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NQJ extends AbstractC50663MYg implements InterfaceC58197Pr3, InterfaceC58054Pof {
    public static final String __redex_internal_original_name = "MusicOverlaySearchResultsFragment";
    public C677733r A00;
    public OEW A01;
    public P64 A02;
    public InterfaceC57964PnA A03;
    public C50668MYm A04;
    public EnumC1810381f A05;
    public int A06;
    public ImmutableList A07;
    public MusicProduct A08;
    public C50858Mdp A09;
    public C54814OKp A0A;
    public String A0B;
    public String A0C;
    public Map A0D;
    public boolean A0E;
    public final InterfaceC09390do A0F = AbstractC60492pY.A02(this);

    public static final boolean A01(NQJ nqj, String str, boolean z, boolean z2) {
        OKv oKv = new OKv(str, nqj.A06, z, false, z2);
        C54814OKp c54814OKp = nqj.A0A;
        String str2 = "searchQueryLimiter";
        if (c54814OKp != null) {
            if (c54814OKp.A00(oKv)) {
                return false;
            }
            P64 p64 = nqj.A02;
            if (p64 == null) {
                str2 = "musicSearchResultsView";
            } else {
                String str3 = oKv.A01;
                C14360o3.A0B(str3, 0);
                MusicOverlayResultsListController musicOverlayResultsListController = p64.A02;
                musicOverlayResultsListController.A0E.A03(false);
                musicOverlayResultsListController.A0F.A04 = str3;
                p64.A00 = false;
                C54814OKp c54814OKp2 = nqj.A0A;
                if (c54814OKp2 != null) {
                    c54814OKp2.A01(oKv);
                    return true;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58197Pr3
    public final void DVK(String str, Object obj, int i) {
        C14360o3.A0B(str, 2);
        C24U A0V = MSZ.A0V(this.A0F);
        C14360o3.A0B(String.valueOf(obj), 0);
        C24Q c24q = A0V.A0E;
        c24q.A07(str, "", 17639880, c24q.A00.generateFlowId(17639880, i));
    }

    @Override // X.InterfaceC58197Pr3
    public final void Dg2(Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final void DgI(Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean EjZ() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "music_overlay_search_results";
    }

    public static final OKv A00(NQJ nqj) {
        C54814OKp c54814OKp = nqj.A0A;
        if (c54814OKp == null) {
            C14360o3.A0F("searchQueryLimiter");
            throw C00O.createAndThrow();
        }
        Object obj = c54814OKp.A01.A01;
        C14360o3.A0A(obj);
        return (OKv) obj;
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean CLl() {
        P64 p64 = this.A02;
        if (p64 == null) {
            C14360o3.A0F("musicSearchResultsView");
            throw C00O.createAndThrow();
        }
        C50979Mfm c50979Mfm = p64.A02.A0F;
        if (c50979Mfm.A09.size() <= 0 && c50979Mfm.A08.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58197Pr3
    public final void DVL(int i, Object obj, boolean z) {
        C24U A0V = MSZ.A0V(this.A0F);
        C14360o3.A0B(String.valueOf(obj), 0);
        C24Q c24q = A0V.A0E;
        long generateFlowId = c24q.A00.generateFlowId(17639880, i);
        if (z) {
            c24q.A07("No network response in time, using http cache", "", 17639880, generateFlowId);
        } else {
            c24q.A02(17639880, generateFlowId);
        }
    }

    @Override // X.InterfaceC58197Pr3
    public final void Dfr(AbstractC115105If abstractC115105If, int i) {
        P64 p64 = this.A02;
        if (p64 == null) {
            C14360o3.A0F("musicSearchResultsView");
            throw C00O.createAndThrow();
        }
        MusicOverlayResultsListController musicOverlayResultsListController = p64.A02;
        C9GR.A0B(musicOverlayResultsListController.A09.getContext(), "RequestFail");
        musicOverlayResultsListController.A0C.notifyDataSetChanged();
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean EjU() {
        P64 p64 = this.A02;
        if (p64 == null) {
            C14360o3.A0F("musicSearchResultsView");
            throw C00O.createAndThrow();
        }
        return p64.A00;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
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

    @Override // X.InterfaceC58197Pr3
    public final C1ON ANK(InterfaceC25601Mq interfaceC25601Mq, Integer num, Long l, Object obj, String str) {
        String str2;
        String str3;
        OKv A00 = A00(this);
        InterfaceC09390do interfaceC09390do = this.A0F;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        String str4 = A00.A01;
        boolean z = A00.A03;
        boolean z2 = A00.A04;
        MusicProduct musicProduct = this.A08;
        if (musicProduct == null) {
            str3 = "musicProduct";
        } else {
            String str5 = this.A0B;
            if (str5 == null) {
                str3 = "browseSessionFullId";
            } else {
                String str6 = MSZ.A0V(interfaceC09390do).A07;
                AbstractC167017dG.A1N(A0o, str4);
                C25621Ms A0c = AbstractC167017dG.A0c(A0o);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, A0o, 36329534924145030L)) {
                    str2 = "music/search/";
                } else {
                    str2 = "music/search_v2/";
                }
                A0c.A0E = str2;
                String A002 = AbstractC65993Txo.A00(musicProduct);
                if (A002 == null) {
                    A002 = "";
                }
                MSX.A1J(A0c, A002, str5);
                A0c.A9s("q", str4);
                A0c.A9s("search_session_id", str6);
                A0c.A0I("from_typeahead", z);
                A0c.A0Q(interfaceC25601Mq);
                if (C18U.A06(c06090Tz, A0o, 36329534924210567L)) {
                    A0c.A0I("from_search", z2);
                }
                if (str != null) {
                    A0c.A9s("cursor", str);
                }
                String A0R = AnonymousClass001.A0R("music/search/", str4);
                Integer num2 = C05F.A0Y;
                if (str == null) {
                    A0c.A07 = num2;
                    A0c.A0A = A0R;
                    ((AbstractC23721Ec) A0c).A01 = 86400000L;
                    ((AbstractC23721Ec) A0c).A00 = 4000L;
                }
                C1ON A0N = A0c.A0N();
                A0N.A01 = new C55911Os3(this, str4, A0N.hashCode());
                return A0N;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58197Pr3
    public final Object BoC() {
        return A00(this).A01;
    }

    @Override // X.InterfaceC58197Pr3
    public final void DgT(InterfaceC57963Pn9 interfaceC57963Pn9, Object obj, int i, boolean z, boolean z2) {
        C38071Gp0 EqR = interfaceC57963Pn9.EqR();
        InterfaceC09390do interfaceC09390do = this.A0F;
        MSZ.A0V(interfaceC09390do).A0G(String.valueOf(obj), z2, EqR.A05.size());
        if (C14360o3.A0K(A00(this).A01, obj)) {
            MSZ.A0V(interfaceC09390do).A0F(String.valueOf(obj), EqR.CR4());
            P64 p64 = this.A02;
            if (p64 == null) {
                C14360o3.A0F("musicSearchResultsView");
                throw C00O.createAndThrow();
            }
            p64.A02(EqR, A00(this), z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        C8BN c8bn;
        ImmutableList immutableList;
        int A02 = C0f9.A02(-417676350);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("music_product");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.api.schemas.MusicProduct");
        this.A08 = (MusicProduct) serializable;
        Serializable serializable2 = requireArguments.getSerializable("capture_state");
        C14360o3.A0C(serializable2, "null cannot be cast to non-null type instagram.core.camera.CaptureState");
        this.A05 = (EnumC1810381f) serializable2;
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = this.A0F;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) AbstractC50522MSa.A0K(this, requireActivity, AbstractC166987dD.A0r(interfaceC09390do));
        C87D c87d = (C87D) MSW.A0F(AbstractC50522MSa.A0V(this, interfaceC09390do), requireActivity()).A00(C87D.class);
        this.A09 = (C50858Mdp) MSW.A0F(new ND1(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), c87d, clipsCreationViewModel.A0S), requireActivity()).A00(C50858Mdp.class);
        C60842q8 A0a = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 43), C57528Pg2.A00(this, 46), C57531Pg5.A00(null, this, 26), AbstractC25225BEi.A1D(C50669MYn.class));
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        MusicProduct musicProduct = this.A08;
        if (musicProduct != null) {
            C50979Mfm c50979Mfm = (C50979Mfm) MSW.A0F(new NC2(musicProduct, A0r), this).A00(C50979Mfm.class);
            C60842q8 A0a2 = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 44), C57528Pg2.A00(this, 45), C57531Pg5.A00(null, this, 27), AbstractC25225BEi.A1D(C50664MYh.class));
            this.A0B = AbstractC31173DnH.A0k(requireArguments, "browse_session_full_id");
            this.A0C = AbstractC31173DnH.A0k(requireArguments, "browse_session_single_id");
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(AbstractC153636vY.A02(requireArguments, AudioTrackType.class, "audio_type_to_exclude"));
            this.A07 = builder.build();
            this.A04 = new C50668MYm(this, AbstractC166987dD.A0r(interfaceC09390do), null, this, true);
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            MusicProduct musicProduct2 = this.A08;
            if (musicProduct2 != null) {
                C14360o3.A0B(A0r2, 0);
                if (musicProduct2 != MusicProduct.A06 ? !C36A.A00(musicProduct2, A0r2) : C18U.A06(C06090Tz.A05, A0r2, 36322581372873049L)) {
                    i = 3;
                } else {
                    i = 0;
                }
                this.A06 = i;
                MusicProduct musicProduct3 = this.A08;
                if (musicProduct3 != null) {
                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                    String str = this.A0B;
                    if (str != null) {
                        String str2 = this.A0C;
                        String str3 = "browseSessionSingleId";
                        if (str2 != null) {
                            this.A01 = new OEW(musicProduct3, this, A0r3, this, str, str2, this.A06);
                            this.A0E = requireArguments.getBoolean("should_use_light_mode", false);
                            this.A0D = (Map) requireArguments.getSerializable("visual_features");
                            UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                            InterfaceC57964PnA interfaceC57964PnA = this.A03;
                            C677733r c677733r = this.A00;
                            C50664MYh c50664MYh = (C50664MYh) A0a2.getValue();
                            MusicProduct musicProduct4 = this.A08;
                            if (musicProduct4 != null) {
                                ImmutableList immutableList2 = this.A07;
                                if (immutableList2 == null) {
                                    str3 = "audioTrackTypesToExclude";
                                } else {
                                    String str4 = this.A0B;
                                    if (str4 != null) {
                                        String str5 = this.A0C;
                                        if (str5 != null) {
                                            int i2 = requireArguments.getInt("list_bottom_padding_px");
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
                                            C50668MYm c50668MYm = this.A04;
                                            if (c50668MYm == null) {
                                                str3 = "entityFeedResultsLoader";
                                            } else {
                                                P62 p62 = new P62(this);
                                                C50858Mdp c50858Mdp = this.A09;
                                                if (c50858Mdp == null) {
                                                    str3 = "clipsAudioMixEditorViewModel";
                                                } else {
                                                    ImmutableList immutableList3 = immutableList;
                                                    C8BN c8bn2 = c8bn;
                                                    this.A02 = new P64(c8bn2, enumC50631MWs, immutableList2, immutableList3, musicProduct4, this, A0r4, c50858Mdp, clipsCreationViewModel, c677733r, p62, interfaceC57964PnA, c50668MYm, c50664MYh, c50979Mfm, (C50669MYn) A0a.getValue(), enumC1810381f, str4, str5, this.A0D, i2, this.A0E);
                                                    P68 p68 = new P68(this);
                                                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                                                    C06090Tz c06090Tz = C06090Tz.A05;
                                                    this.A0A = new C54814OKp(p68, AbstractC166997dE.A0i(c06090Tz, A0o, 36611009900714232L), AbstractC166997dE.A0i(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36611009900779769L), C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36329534924276104L));
                                                    C0f9.A09(749718465, A02);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C14360o3.A0F(str3);
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F("browseSessionFullId");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F("musicProduct");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2120721179);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A0E) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_overlay_results, viewGroup, false);
        C0f9.A09(-12638255, A02);
        return inflate;
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
