package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

/* renamed from: X.HCc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38929HCc extends AbstractC59962oe implements InterfaceC60442pS, C51D, InterfaceC60122ou, InterfaceC154856xa, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "AudioPageFragment";
    public long A00;
    public View A01;
    public EnumC39652Hih A02;
    public C8JW A03;
    public N8L A04;
    public C44466JlY A05;
    public AudioPageMetadata A06;
    public C153756vk A07;
    public C189478aR A08;
    public C31349DqE A09;
    public AudioType A0A;
    public MusicAssetModel A0B;
    public InterfaceC43497JJj A0C;
    public EnumC39549HdL A0D;
    public C38580Gxj A0E;
    public C38321GtG A0F;
    public C38378GuF A0G;
    public C42276Io0 A0H;
    public C42278Io2 A0I;
    public C38335GtV A0J;
    public C56043OuF A0K;
    public Gt8 A0L;
    public C41697IdQ A0M;
    public C153766vl A0N;
    public Long A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public C25671My A0d;
    public ImageUrl A0e;
    public AnonymousClass308 A0f;
    public C1M1 A0g;
    public Boolean A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public boolean A0l;
    public boolean A0m;
    public final int A0n = 30000;
    public final InterfaceC41501vz A0p = C37816GkW.A00(this, 46);
    public final InterfaceC09390do A0o = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC153556vQ
    public final void D1P() {
    }

    @Override // X.InterfaceC153566vR
    public final void D51(View view) {
    }

    @Override // X.InterfaceC153546vP
    public final void D52(View view) {
    }

    @Override // X.InterfaceC153536vO
    public final /* synthetic */ void D55(User user) {
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        String str;
        InterfaceC43530JKq Ao5;
        String str2;
        C14360o3.A0B(c120985dq, 0);
        UserSession A0r = AbstractC166987dD.A0r(this.A0o);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String str3 = this.A0T;
            C153756vk c153756vk = this.A07;
            ClipChainType clipChainType = null;
            if (c153756vk == null) {
                str2 = "pivotPageSessionProvider";
            } else {
                AbstractC37670Gi3.A0Y(this, A0r, c38321qM, c153756vk, str3, i);
                C38335GtV c38335GtV = this.A0J;
                if (c38335GtV == null) {
                    str2 = "audioPageViewModel";
                } else {
                    String str4 = this.A0P;
                    if (str4 == null) {
                        str2 = "assetId";
                    } else {
                        AudioType audioType = this.A0A;
                        if (audioType == null) {
                            audioType = AudioType.A04;
                        }
                        String id = c120985dq.getId();
                        C38321qM c38321qM2 = c120985dq.A02;
                        if (c38321qM2 != null && (Ao5 = c38321qM2.A0C.Ao5()) != null) {
                            clipChainType = Ao5.AoC();
                        }
                        C38959HDl c38959HDl = (C38959HDl) c38335GtV.A04.A02();
                        if (c38959HDl != null) {
                            str = c38959HDl.A09;
                        } else {
                            str = null;
                        }
                        AbstractC166987dD.A1Z(new C50117MBd(c38335GtV, audioType, clipChainType, id, str, str4, null, 3), AbstractC141776au.A00(c38335GtV));
                        return;
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
    }

    @Override // X.InterfaceC153586vT
    public final /* synthetic */ void Dzr() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        OriginalAudioSubtype originalAudioSubtype;
        C84023om c84023om;
        InterfaceC84013ol interfaceC84013ol;
        int i;
        ViewOnClickListenerC38053Gog viewOnClickListenerC38053Gog;
        C14360o3.A0B(interfaceC56362iU, 0);
        boolean z = false;
        if (this.A08 != null && this.A0c) {
            interfaceC56362iU.EkF(false);
            this.A0c = false;
            return;
        }
        Context requireContext = requireContext();
        interfaceC56362iU.setTitle(requireContext.getString(2131953315));
        if (this.A08 != null) {
            interfaceC56362iU.EkF(true);
        } else {
            interfaceC56362iU.EkS(true);
        }
        C38580Gxj c38580Gxj = this.A0E;
        if (c38580Gxj == null) {
            return;
        }
        InterfaceC09390do interfaceC09390do = this.A0o;
        C50674MYs c50674MYs = new C50674MYs(requireContext, AbstractC166987dD.A0r(interfaceC09390do));
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        boolean A06 = C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36324557057044717L);
        String str = c38580Gxj.A03;
        InterfaceC88553xD interfaceC88553xD = null;
        if (str != null) {
            boolean A0K = C14360o3.A0K(C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do)).getId(), str);
            if (!A0K && c38580Gxj.A06 != null) {
                i = 2131972401;
                viewOnClickListenerC38053Gog = new ViewOnClickListenerC38053Gog(c38580Gxj, this, 53);
            } else {
                if (c38580Gxj.A05 != null && c38580Gxj.A08) {
                    c50674MYs.A03(new ViewOnClickListenerC38053Gog(c38580Gxj, this, 54), 2131972346);
                }
                if (A0K) {
                    InterfaceC88553xD interfaceC88553xD2 = c38580Gxj.A01;
                    if (interfaceC88553xD2 != null) {
                        originalAudioSubtype = interfaceC88553xD2.Ae4();
                    } else {
                        originalAudioSubtype = null;
                    }
                    if (originalAudioSubtype == OriginalAudioSubtype.A04 && (c84023om = c38580Gxj.A00) != null && (interfaceC84013ol = c84023om.A00) != null) {
                        i = 2131967996;
                        if (interfaceC84013ol.getShouldAllowRestore()) {
                            viewOnClickListenerC38053Gog = new ViewOnClickListenerC38053Gog(c38580Gxj, this, 55);
                        }
                    }
                }
            }
            c50674MYs.A03(viewOnClickListenerC38053Gog, i);
        }
        c50674MYs.A03(new ViewOnClickListenerC38053Gog(c38580Gxj, this, 56), 2131971761);
        if (C36A.A0A(AbstractC166987dD.A0r(interfaceC09390do)) && this.A0B != null) {
            ViewOnClickListenerC42035Ik4.A02(c50674MYs, this, 57, 2131973334);
        }
        if (AbstractC54241NyM.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            c50674MYs.A03(new ViewOnClickListenerC38053Gog(c38580Gxj, this, 57), 2131971200);
        }
        if (!c50674MYs.A09.isEmpty()) {
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A06 = R.drawable.instagram_more_vertical_pano_outline_24;
            A0B.A05 = 2131966337;
            A0B.A0G = ViewOnClickListenerC38053Gog.A02(c50674MYs, this, 58);
            this.A01 = interfaceC56362iU.AA9(new C3LY(A0B));
        }
        C42276Io0 c42276Io0 = this.A0H;
        if (c42276Io0 != null) {
            C38335GtV c38335GtV = this.A0J;
            if (c38335GtV != null) {
                C2GT c2gt = c38335GtV.A05;
                C38646Gyn c38646Gyn = (C38646Gyn) c2gt.A02();
                if (c38646Gyn != null) {
                    interfaceC88553xD = c38646Gyn.A02;
                }
                C38646Gyn c38646Gyn2 = (C38646Gyn) c2gt.A02();
                if ((c38646Gyn2 == null || !c38646Gyn2.A07) && interfaceC88553xD != null && interfaceC88553xD.CfD()) {
                    OriginalAudioSubtype Ae4 = interfaceC88553xD.Ae4();
                    if (AbstractC76643c9.A0B(Ae4, c42276Io0.A0R) || Ae4 == OriginalAudioSubtype.A05 || Ae4 == OriginalAudioSubtype.A04) {
                        C3LO A0B2 = AbstractC31171DnF.A0B();
                        A0B2.A06 = R.drawable.ufi_save_icon;
                        A0B2.A05 = 2131972702;
                        A0B2.A0G = ViewOnClickListenerC42035Ik4.A00(this, 58);
                        View A8u = interfaceC56362iU.A8u(new C3LY(A0B2));
                        C38335GtV c38335GtV2 = this.A0J;
                        if (c38335GtV2 != null) {
                            C38646Gyn c38646Gyn3 = (C38646Gyn) c38335GtV2.A05.A02();
                            if (c38646Gyn3 != null && c38646Gyn3.A04) {
                                z = true;
                            }
                            A8u.setSelected(z);
                        }
                    }
                }
                if (A06) {
                    C3LO A0B3 = AbstractC31171DnF.A0B();
                    A0B3.A06 = R.drawable.instagram_arrow_up_right_pano_outline_24;
                    A0B3.A05 = 2131975731;
                    A0B3.A0G = ViewOnClickListenerC42035Ik4.A00(this, 59);
                    View A8u2 = interfaceC56362iU.A8u(new C3LY(A0B3));
                    C42276Io0 c42276Io02 = this.A0H;
                    if (c42276Io02 != null) {
                        c42276Io02.A01(A8u2);
                        if (c38580Gxj.A01 == null || C4AC.A0C(AbstractC166987dD.A0r(interfaceC09390do))) {
                            return;
                        }
                        c50674MYs.A03(new ViewOnClickListenerC38053Gog(c38580Gxj, this, 59), 2131973644);
                        return;
                    }
                } else {
                    if (c38580Gxj.A01 == null || C4AC.A0C(AbstractC166987dD.A0r(interfaceC09390do))) {
                        return;
                    }
                    C3LO A0B4 = AbstractC31171DnF.A0B();
                    A0B4.A06 = R.drawable.instagram_direct_pano_outline_24;
                    A0B4.A05 = 2131973644;
                    A0B4.A0G = new ViewOnClickListenerC38053Gog(c38580Gxj, this, 60);
                    interfaceC56362iU.A8u(new C3LY(A0B4));
                    return;
                }
            }
            C14360o3.A0F("audioPageViewModel");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("audioPageMetadataController");
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "audio_page";
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
    public final void onActivityResult(int i, int i2, Intent intent) {
        Context requireContext;
        int i3;
        String str;
        super.onActivityResult(i, i2, intent);
        AudioPageMetadata audioPageMetadata = this.A06;
        if (audioPageMetadata == null) {
            str = "audioPageMetadata";
        } else {
            if (AbstractC167007dF.A1W(audioPageMetadata.A0C)) {
                if (i != 1361) {
                    return;
                }
            } else {
                if (i == 9587) {
                    if (i2 != 9683) {
                        return;
                    }
                    C35221FgE.A01(requireContext(), AbstractC166987dD.A0r(this.A0o));
                    return;
                }
                if (i == 9689) {
                    if (i2 != 9689) {
                        return;
                    }
                    requireActivity().setResult(9689);
                    AbstractC25227BEk.A1B(this);
                    return;
                }
                if (i == 1355) {
                    if (i2 != 1357) {
                        if (i2 != 1359) {
                            return;
                        }
                        requireContext = requireContext();
                        i3 = 2131972279;
                    } else {
                        requireContext = requireContext();
                        i3 = 2131973336;
                    }
                    C9GR.A07(requireContext, i3);
                    return;
                }
                if (i != 1361) {
                    return;
                }
            }
            C189478aR c189478aR = this.A08;
            if (c189478aR != null) {
                c189478aR.A08();
            } else {
                C3DN A0m = AbstractC25230BEn.A0m(this);
                if (A0m != null) {
                    AbstractC167007dF.A16(F86.A00(A0m));
                }
            }
            InterfaceC43497JJj interfaceC43497JJj = this.A0C;
            if (interfaceC43497JJj == null) {
                str = "saveSongToStreamingAppViewModel";
            } else {
                FragmentActivity requireActivity = requireActivity();
                C38334GtU c38334GtU = (C38334GtU) interfaceC43497JJj;
                KZ8 kz8 = (KZ8) c38334GtU.A04.getValue();
                UserSession userSession = c38334GtU.A03;
                InterfaceC58027PoD interfaceC58027PoD = c38334GtU.A02;
                C14360o3.A0B(interfaceC58027PoD, 4);
                AbstractC166987dD.A1Z(new JTH((Activity) requireActivity, intent, kz8, interfaceC58027PoD, userSession, (InterfaceC23621Ds) null, i2), ((C4A7) kz8).A01);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Parcelable parcelable = requireArguments().getParcelable("args_audio_model");
        if (parcelable != null) {
            AudioPageMetadata audioPageMetadata = (AudioPageMetadata) parcelable;
            C57012jc A0U = AbstractC31177DnL.A0U(view, R.id.restricted_banner);
            C25671My c25671My = this.A0d;
            if (c25671My == null) {
                str = "igEventBus";
            } else {
                c25671My.A01(this.A0p, C42252Inc.class);
                C38335GtV c38335GtV = this.A0J;
                str = "audioPageViewModel";
                if (c38335GtV != null) {
                    c38335GtV.A07.A06(getViewLifecycleOwner(), new C42079Ikm(audioPageMetadata, A0U, this));
                    C38335GtV c38335GtV2 = this.A0J;
                    if (c38335GtV2 != null) {
                        c38335GtV2.A05.A06(getViewLifecycleOwner(), new C38065Got(audioPageMetadata, this, 0));
                        C38335GtV c38335GtV3 = this.A0J;
                        if (c38335GtV3 != null) {
                            c38335GtV3.A04.A06(getViewLifecycleOwner(), new C38065Got(audioPageMetadata, this, 1));
                            C38335GtV c38335GtV4 = this.A0J;
                            if (c38335GtV4 != null) {
                                c38335GtV4.A06.A06(getViewLifecycleOwner(), new C38065Got(audioPageMetadata, this, 2));
                                C38321GtG c38321GtG = this.A0F;
                                if (c38321GtG == null) {
                                    str = "audioPageAudioFiltersViewModel";
                                } else {
                                    c38321GtG.A00.A06(getViewLifecycleOwner(), new C42078Ikl(this, 5));
                                    C38335GtV c38335GtV5 = this.A0J;
                                    if (c38335GtV5 != null) {
                                        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new C57154PYy(this, null, 44), c38335GtV5.A0I));
                                        C38335GtV c38335GtV6 = this.A0J;
                                        if (c38335GtV6 != null) {
                                            AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new C57154PYy(this, null, 45), c38335GtV6.A0J));
                                            C44466JlY c44466JlY = this.A05;
                                            if (c44466JlY == null) {
                                                str = "renameOriginalAudioViewModel";
                                            } else {
                                                c44466JlY.A00.A06(getViewLifecycleOwner(), new C42078Ikl(this, 6));
                                                FragmentActivity requireActivity = requireActivity();
                                                AudioPageMetadata audioPageMetadata2 = this.A06;
                                                if (audioPageMetadata2 == null) {
                                                    str = "audioPageMetadata";
                                                } else {
                                                    if (audioPageMetadata2.A0C != null && (requireActivity instanceof IgFragmentActivity)) {
                                                        ((IgFragmentActivity) requireActivity).registerOnActivityResultListener(new C37766Gjh(this, 5));
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(C38929HCc c38929HCc) {
        BaseFragmentActivity baseFragmentActivity;
        if (c38929HCc.A08 != null) {
            C56352iT.A0t.A04(c38929HCc).A0T();
            return;
        }
        Activity rootActivity = c38929HCc.getRootActivity();
        if (!(rootActivity instanceof BaseFragmentActivity) || (baseFragmentActivity = (BaseFragmentActivity) rootActivity) == null) {
            return;
        }
        baseFragmentActivity.A0Z();
    }

    public static final void A01(C38929HCc c38929HCc, boolean z) {
        View view = c38929HCc.mView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.requireViewById(R.id.metadata_bar).getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC43591JPw.A00(181));
            ((C1343765g) layoutParams).A00 = z ? 1 : 0;
        }
    }

    public final UserSession A02() {
        return AbstractC166987dD.A0r(this.A0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    @Override // X.InterfaceC154856xa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D4p() {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38929HCc.D4p():void");
    }

    @Override // X.InterfaceC154856xa
    public final void D4q() {
        N8L n8l = this.A04;
        if (n8l == null) {
            C14360o3.A0F("clipsAudioPagePerfLogger");
            throw C00O.createAndThrow();
        }
        n8l.D4q();
    }

    @Override // X.InterfaceC154856xa
    public final void D4r() {
        N8L n8l = this.A04;
        if (n8l == null) {
            C14360o3.A0F("clipsAudioPagePerfLogger");
            throw C00O.createAndThrow();
        }
        n8l.D4r();
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0o);
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
    public final boolean isScrolledToTop() {
        View view = this.mView;
        if (view == null) {
            return true;
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.title);
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(A0S, 0);
        Rect A0U = AbstractC166987dD.A0U();
        A0S.getGlobalVisibleRect(A0U);
        float f = A0U.top;
        RectF rectF2 = new RectF();
        AbstractC13880nE.A0M(rectF2, A0S);
        if (f >= rectF2.top) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        C38321qM c38321qM;
        AnonymousClass308 anonymousClass308;
        AbstractC167027dH.A12(c120985dq, view, motionEvent);
        if (this.A03 != C8JW.A0Z && (c38321qM = c120985dq.A02) != null && AbstractC25226BEj.A14(c38321qM) != null && c120985dq.A01 != EnumC129395t1.A0H && (anonymousClass308 = this.A0f) != null) {
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                anonymousClass308.DuC(motionEvent, view, c38321qM2, i);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03ef, code lost:
    
        if (r52.A03 == X.C8JW.A0Z) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x032d, code lost:
    
        if (X.C18U.A06(r5, r4, 36320347989418379L) == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.N8L, X.JQS, X.6xZ] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r53) {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38929HCc.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1180115522);
        C14360o3.A0B(layoutInflater, 0);
        InterfaceC09390do interfaceC09390do = this.A0o;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        boolean A06 = C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36323792552734320L);
        int i = R.layout.layout_clips_pivot_page_fragment;
        if (A06) {
            i = R.layout.layout_audio_page_fragment;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        InterfaceC19610xo ARD = AbstractC37802GkH.A00(MusicPageTabType.A04, AbstractC166987dD.A0r(interfaceC09390do)).A02.ARD();
        ARD.E7G("LAST_OPENED_AUDIO_PAGE_TIMESTAMP_KEY", System.currentTimeMillis());
        ARD.apply();
        C0f9.A09(97662576, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(604368412);
        super.onDestroyView();
        C25671My c25671My = this.A0d;
        if (c25671My == null) {
            C14360o3.A0F("igEventBus");
            throw C00O.createAndThrow();
        }
        c25671My.A02(this.A0p, C42252Inc.class);
        C0f9.A09(-1868997875, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1455082904);
        super.onResume();
        if (this.A0Z) {
            C38335GtV c38335GtV = this.A0J;
            if (c38335GtV == null) {
                C14360o3.A0F("audioPageViewModel");
                throw C00O.createAndThrow();
            }
            AbstractC166997dE.A1Y(c38335GtV.A0P, true);
            Object value = c38335GtV.A0C.A09.getValue();
            if (value != null) {
                ((AbstractC153666vb) value).A01();
                this.A0Z = false;
            } else {
                throw AbstractC166987dD.A14("Called fetch without initializing fetcher");
            }
        }
        C0f9.A09(-2001751804, A02);
    }
}
