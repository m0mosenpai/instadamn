package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.view.View;
import android.widget.CompoundButton;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.text.ExpandableTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import go.Seq;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class FpQ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FpQ(InterfaceC37224GaZ interfaceC37224GaZ, DirectShareTarget directShareTarget, int i) {
        this.A00 = i;
        if (50 - i != 0) {
            this.A01 = interfaceC37224GaZ;
            this.A02 = directShareTarget;
        } else {
            this.A01 = directShareTarget;
            this.A02 = interfaceC37224GaZ;
        }
    }

    public static void A00(Context context, Bundle bundle, FpQ fpQ, String str) {
        C6XJ.A06(context, bundle, ModalActivity.class, str);
        ((C189478aR) fpQ.A01).A0L(null);
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new FpQ(i, obj, obj2), view);
    }

    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object, X.Etf] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05;
        int i;
        String str2;
        InterfaceC83733oI interfaceC83733oI;
        boolean z;
        C0Zx c0Zx;
        String str3;
        EnumC72433Xdd enumC72433Xdd;
        AbstractC59962oe abstractC59962oe;
        C6XJ A0L;
        Object A00;
        String str4;
        IllegalStateException A14;
        int i2;
        int i3;
        String str5;
        String str6;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(493274669);
                ((InterfaceC16660sJ) this.A01).invoke(this.A02);
                i = -176805355;
                C0f9.A0C(i, A05);
                return;
            case 1:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                Activity activity = (Activity) this.A02;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("bottom_sheet_content_fragment", AbstractC111324zv.A00(859));
                AbstractC25228BEl.A1G(activity, A0b, directShareSheetFragment.A0H, TransparentModalActivity.class, "bottom_sheet");
                return;
            case 2:
                A05 = C0f9.A05(-82184726);
                ((G2V) ((GWZ) this.A01)).A01.A0B.DAR((DirectShareTarget) this.A02);
                i = -685400708;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(216438099);
                AbstractC167007dF.A17(AbstractC166987dD.A0w((C23031Ai) this.A01), "bc_qr_code_sharing_has_seen_new_badge_in_thread_details");
                C32284EJv c32284EJv = (C32284EJv) this.A02;
                String str7 = c32284EJv.A00;
                if (str7 != null) {
                    InterfaceC09390do interfaceC09390do = c32284EJv.A0G;
                    User A02 = AnonymousClass189.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02((String) AbstractC31469DsD.A00(c32284EJv.A07));
                    if (A02 != null) {
                        String username = A02.getUsername();
                        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(username);
                        if (c32284EJv.A02) {
                            AbstractC147806l5.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0M(C05F.A0N, AbstractC1345466e.A07(C32284EJv.A00(c32284EJv)), C32284EJv.A02(c32284EJv), AbstractC31180DnO.A00(c32284EJv), C32284EJv.A08(c32284EJv));
                        }
                        if (A02.isVerified()) {
                            C85963sQ.A04(c32284EJv.requireContext(), A0H, AbstractC001900j.A08(A0H, username, 0, false) + AbstractC167007dF.A0A(username));
                        }
                        if (C32284EJv.A08(c32284EJv)) {
                            str2 = "cq";
                        } else {
                            str2 = "fq";
                        }
                        String A022 = AbstractC35186Ffe.A02(str7, AbstractC166987dD.A1J(new Pair("s", str2)));
                        boolean A06 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36319377333165439L);
                        FragmentActivity requireActivity = c32284EJv.requireActivity();
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        ImageUrl imageUrl = (ImageUrl) AbstractC31469DsD.A00(c32284EJv.A08);
                        String string = c32284EJv.getString(2131971182);
                        new LLI(requireActivity, c32284EJv, A0r, imageUrl, new C47356Kw5(c32284EJv), new C36747GHq(c32284EJv), (String) AbstractC31469DsD.A00(c32284EJv.A09), A0H, A022, null, string, false, A06).A05();
                    }
                }
                i = -1645883987;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-1153210889);
                C32346EMs.A00((C32346EMs) this.A02, (Integer) this.A01, C05F.A00);
                i = -425213837;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(217583169);
                C32346EMs.A00((C32346EMs) this.A02, (Integer) this.A01, C05F.A0N);
                i = 106453578;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(36608270);
                C32346EMs.A00((C32346EMs) this.A02, (Integer) this.A01, C05F.A0C);
                i = 1652254450;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-1391634694);
                C32346EMs.A00((C32346EMs) this.A02, (Integer) this.A01, C05F.A01);
                i = 1407241467;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(1411996240);
                C32346EMs.A00((C32346EMs) this.A02, (Integer) this.A01, C05F.A0C);
                i = -1112746762;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(783753442);
                View view2 = (View) this.A01;
                C14360o3.A0A(view2);
                AbstractC31181DnP.A0W(view2, (InterfaceC148366m6) this.A02);
                i = -1914839691;
                C0f9.A0C(i, A05);
                return;
            case 10:
                int A052 = C0f9.A05(141300369);
                C34417FFh c34417FFh = ((FNR) this.A02).A00;
                if (c34417FFh == null) {
                    str = "onInstantReplyClickListener";
                    break;
                } else {
                    C105954q9 c105954q9 = (C105954q9) this.A01;
                    String str8 = c105954q9.A05;
                    C14360o3.A07(str8);
                    String str9 = c105954q9.A03;
                    EMW emw = c34417FFh.A00;
                    FPX fpx = emw.A01;
                    if (fpx != null) {
                        EMW emw2 = fpx.A01;
                        Context context = emw2.getContext();
                        C14360o3.A0C(context, MSV.A00(11));
                        FragmentActivity activity2 = emw2.getActivity();
                        AbstractC31171DnF.A1O(activity2);
                        FOL fol = fpx.A00;
                        if (!C35244Fgd.A03(activity2, context, fol.A03, fol.A04, null, fol.A01, false)) {
                            C7IR c7ir = fol.A06;
                            GKK.A00(c7ir.A00(null, null, null, null, null, null, null, str8, str9, null, "business_persistent_menu", null, false), c7ir.A00, c7ir, 4);
                        }
                        C189478aR c189478aR = fol.A00;
                        if (c189478aR == null) {
                            str = "bottomSheet";
                            break;
                        } else {
                            c189478aR.A0L(null);
                        }
                    }
                    FPX fpx2 = emw.A01;
                    if (fpx2 != null) {
                        fpx2.A00("postback");
                    }
                    C0f9.A0C(-1837305410, A052);
                    return;
                }
            case 11:
                A05 = C0f9.A05(-2132764369);
                C34640FNx c34640FNx = (C34640FNx) this.A02;
                AbstractC31177DnL.A0u(c34640FNx.A01, c34640FNx.A05, C2Fb.A1W, ((C9CJ) this.A01).A01);
                C34418FFi c34418FFi = c34640FNx.A00;
                if (c34418FFi == null) {
                    C14360o3.A0F("onUrlButtonItemClickListener");
                    throw C00O.createAndThrow();
                }
                FPX fpx3 = c34418FFi.A00.A01;
                if (fpx3 != null) {
                    fpx3.A00("url");
                }
                i = 841348344;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(-1980814734);
                C32314ELd c32314ELd = (C32314ELd) this.A02;
                boolean A0L2 = C32314ELd.A0L(c32314ELd);
                InterfaceC09390do interfaceC09390do2 = c32314ELd.A17;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                if (A0L2) {
                    String A002 = AbstractC111324zv.A00(438);
                    C14360o3.A0B(A0r2, 0);
                    SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig(AbstractC31171DnF.A0R(A002));
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    A0b2.putParcelable(MSV.A00(2), simpleWebViewConfig);
                    AbstractC31173DnH.A1C(A0b2, A0r2);
                    AbstractC59962oe abstractC59962oe2 = new AbstractC59962oe();
                    abstractC59962oe2.setArguments(A0b2);
                    C189478aR A0x = AbstractC25228BEl.A0x(c32314ELd.getActivity(), C3DN.A00);
                    C189448aO A0y = AbstractC25225BEi.A0y(AbstractC166987dD.A0r(interfaceC09390do2));
                    A0y.A0T = new C49615Lw8(abstractC59962oe2, 1);
                    if (A0x != null) {
                        A0x.A0H(abstractC59962oe2, A0y, true, true, true, false);
                    }
                } else {
                    AbstractC34910FZw.A00(c32314ELd.requireActivity(), A0r2, AbstractC111324zv.A00(438));
                }
                i = -1702488382;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-759444087);
                C33205Eks c33205Eks = new C33205Eks();
                C32314ELd c32314ELd2 = (C32314ELd) this.A02;
                E70 e70 = c32314ELd2.A0Z;
                if (e70 != null) {
                    interfaceC83733oI = e70.A0L;
                } else {
                    interfaceC83733oI = null;
                }
                Bundle A0b3 = AbstractC166987dD.A0b();
                A0b3.putString("bot_id", AbstractC31171DnF.A0g(this.A01));
                if (interfaceC83733oI != null) {
                    AbstractC35077Fco.A02(A0b3, interfaceC83733oI, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
                }
                AbstractC31174DnI.A1M(AbstractC31173DnH.A0O(null, c33205Eks, AbstractC31173DnH.A0J(A0b3, c33205Eks, c32314ELd2), AbstractC166987dD.A0r(c32314ELd2.A17)), C32314ELd.__redex_internal_original_name);
                i = 1566362401;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(298464604);
                C32314ELd.A05(EnumC33502Erb.AI_AUTO_REPLIES, (C32314ELd) this.A02);
                ((View.OnClickListener) ((C37669Gi2) this.A01).A01).onClick(view);
                i = -2124724225;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(1593118133);
                E70 e702 = (E70) this.A01;
                if (!e702.A0j) {
                    C32314ELd c32314ELd3 = (C32314ELd) this.A02;
                    if (!e702.A0E(AbstractC166987dD.A0r(c32314ELd3.A17).userId)) {
                        C193328hC A0c = AbstractC31176DnK.A0c(c32314ELd3);
                        A0c.A0A(2131963322);
                        A0c.A09(2131963321);
                        A0c.A0S(null, EnumC193348hE.A04, 2131968948);
                        AbstractC166987dD.A1W(A0c);
                        i = 1216604628;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C32314ELd c32314ELd4 = (C32314ELd) this.A02;
                InterfaceC09390do interfaceC09390do3 = c32314ELd4.A17;
                AbstractC35058FcV.A00(c32314ELd4.requireActivity(), c32314ELd4, AbstractC166987dD.A0r(interfaceC09390do3), C35252Fgl.A01(AbstractC166987dD.A0r(interfaceC09390do3), e702));
                i = 1216604628;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(-101161426);
                Bundle A0b4 = AbstractC166987dD.A0b();
                InterfaceC83733oI interfaceC83733oI2 = ((E70) this.A01).A0L;
                C32314ELd c32314ELd5 = (C32314ELd) this.A02;
                Capabilities capabilities = c32314ELd5.A03;
                if (capabilities == null) {
                    str = "threadCapabilities";
                    break;
                } else {
                    AbstractC35077Fco.A01(A0b4, capabilities, interfaceC83733oI2);
                    ENB enb = new ENB();
                    AbstractC31177DnL.A16(enb, AbstractC31173DnH.A0J(A0b4, enb, c32314ELd5), AbstractC166987dD.A0r(c32314ELd5.A17));
                    EnumC33518Err enumC33518Err = EnumC33518Err.A07;
                    InterfaceC09390do interfaceC09390do4 = c32314ELd5.A18;
                    if (AbstractC31171DnF.A1b(((FKW) interfaceC09390do4.getValue()).A02)) {
                        FKW fkw = (FKW) interfaceC09390do4.getValue();
                        InterfaceC83733oI interfaceC83733oI3 = c32314ELd5.A0c;
                        if (interfaceC83733oI3 == null) {
                            str = "threadId";
                            break;
                        } else {
                            boolean z2 = c32314ELd5.A0k;
                            E70 e703 = c32314ELd5.A0Z;
                            if (e703 != null) {
                                z = E70.A04(e703);
                            } else {
                                z = false;
                            }
                            Integer num = c32314ELd5.A0e;
                            C14360o3.A0B(num, 3);
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fkw.A01, "direct_thread_details_impression");
                            if (A0f.isSampled()) {
                                String A07 = AbstractC1345466e.A07(interfaceC83733oI3);
                                if (A07 != null) {
                                    c0Zx = new C0Zx();
                                    c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A07);
                                    if (z2) {
                                        if (z) {
                                            enumC72433Xdd = EnumC72433Xdd.A03;
                                        } else {
                                            enumC72433Xdd = EnumC72433Xdd.A04;
                                        }
                                    } else if (z) {
                                        enumC72433Xdd = EnumC72433Xdd.A05;
                                    } else {
                                        enumC72433Xdd = EnumC72433Xdd.A06;
                                    }
                                    c0Zx.A01(enumC72433Xdd, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                } else {
                                    c0Zx = null;
                                }
                                if (1 - num.intValue() != 0) {
                                    str3 = "swipe";
                                } else {
                                    str3 = "tap";
                                }
                                AbstractC31171DnF.A1G(A0f, str3);
                                A0f.AAk("setting_type", AbstractC166987dD.A1J(enumC33518Err));
                                AbstractC31175DnJ.A1A(A0f, z2);
                                AbstractC31171DnF.A1C(A0f, "tap");
                                A0f.AAQ(c0Zx, "thread");
                                A0f.Cht();
                            }
                        }
                    }
                    C32314ELd.A05(EnumC33502Erb.NICKNAMES, c32314ELd5);
                    i = -1787706002;
                    C0f9.A0C(i, A05);
                    return;
                }
            case 17:
                A05 = C0f9.A05(585345850);
                C32314ELd.A0I((C32314ELd) this.A02, (C32107E9f) this.A01);
                i = 1084120135;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(1221343521);
                C32314ELd.A0G((C32314ELd) this.A02, (C32107E9f) this.A01);
                i = 1401424106;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(1856734348);
                C32314ELd.A0H((C32314ELd) this.A02, (C32107E9f) this.A01);
                i = 357088014;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(-1006271537);
                String A0c2 = AbstractC31171DnF.A0c(((E70) this.A01).A0L);
                C14360o3.A0B(A0c2, 0);
                EOB eob = new EOB();
                Bundle A0b5 = AbstractC166987dD.A0b();
                A0b5.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0c2);
                eob.setArguments(A0b5);
                C32328ELw c32328ELw = (C32328ELw) this.A02;
                C140966Yy A0c3 = AbstractC25231BEo.A0c(c32328ELw.requireActivity(), c32328ELw.A0I);
                A0c3.A0D(eob);
                AbstractC31174DnI.A1M(A0c3, C32328ELw.__redex_internal_original_name);
                i = -1468404379;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(1219656347);
                C32328ELw c32328ELw2 = (C32328ELw) this.A02;
                C62862tP A03 = C62862tP.A03((Fragment) this.A01, AbstractC166987dD.A0o(c32328ELw2.A0I), null);
                HashMap A1G = AbstractC166987dD.A1G();
                HashMap A1G2 = AbstractC166987dD.A1G();
                new BitSet(0);
                FTe.A00(null, "com.bloks.www.igd.bc.fbm.bc.creation.upsell.async", A1G, A1G2).A00(c32328ELw2.getActivity(), A03);
                i = 599575823;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(-1518676389);
                ENA ena = (ENA) this.A02;
                AbstractC35172FfP.A01(ena.requireContext(), ena.requireActivity(), ena, AbstractC166987dD.A0r(ena.A0L), (C32056E6i) this.A01, C05F.A0N);
                i = -309022789;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(757731490);
                AbstractC34775FTy.A01((UserSession) this.A02, (Context) this.A01, false);
                i = -1510127824;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(1048389003);
                ((C31975E3d) this.A01).A00.animate().alpha(0.2f).withEndAction(new GLN((C31634Dv0) this.A02));
                i = -331592908;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(-1802492523);
                ((InterfaceC132405yL) this.A01).D9q((DirectShareTarget) this.A02);
                i = 204410302;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A05 = C0f9.A05(264220701);
                ((InterfaceC132405yL) this.A01).DAs((DirectShareTarget) this.A02);
                i = -1636230806;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(76767020);
                ((C32632EYg) this.A02).A00.invoke(this.A01);
                i = -87830461;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(-452981888);
                ((C32632EYg) this.A02).A00.invoke(this.A01);
                i = -2105816283;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(-175148541);
                C31622Duo c31622Duo = ((C31635Dv1) this.A02).A00;
                String str10 = ((C31461Ds5) this.A01).A01;
                C14360o3.A0B(str10, 0);
                if (str10.equals("suggested_accounts_to_follow")) {
                    Bundle A0b6 = AbstractC166987dD.A0b();
                    A0b6.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "direct_suggestions_unit");
                    JR2 jr2 = c31622Duo.A00;
                    UserSession A0p = jr2.A0p();
                    abstractC59962oe = jr2.A1L;
                    A0L = AbstractC31171DnF.A0L(abstractC59962oe.requireActivity(), A0b6, A0p, ModalActivity.class, "account_discovery");
                } else {
                    if (str10.equals(AbstractC43591JPw.A00(1237))) {
                        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A04;
                        JR2 jr22 = c31622Duo.A00;
                        FollowListData A003 = AbstractC31565Dtq.A00(enumC31556Dtg, jr22.A0p().userId, null, false);
                        User A023 = AnonymousClass189.A00(jr22.A0p()).A02(jr22.A0p().userId);
                        if (A023 != null) {
                            UserSession A0p2 = jr22.A0p();
                            Bundle ANO = AbstractC31412DrH.A01().ANO(jr22.A0p(), A023, A003, null, null, false);
                            abstractC59962oe = jr22.A1L;
                            A0L = AbstractC31171DnF.A0L(abstractC59962oe.requireActivity(), ANO, A0p2, ModalActivity.class, "unified_follow_list");
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    i = -1556257506;
                    C0f9.A0C(i, A05);
                    return;
                }
                AbstractC31172DnG.A1M(abstractC59962oe, A0L);
                i = -1556257506;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(17557289);
                C31636Dv2 c31636Dv2 = (C31636Dv2) this.A02;
                C31623Dup c31623Dup = c31636Dv2.A02;
                C31462Ds6 c31462Ds6 = (C31462Ds6) this.A01;
                JR2 jr23 = c31623Dup.A00;
                C43626JRj A0q = jr23.A0q();
                A0q.A0E.A0M.remove(c31462Ds6);
                C43626JRj.A03(A0q);
                C1GJ.A03(FY5.A01(jr23.A0p(), c31462Ds6.A01.getId(), c31462Ds6.A02, null));
                C63702ur A01 = c31636Dv2.A01();
                if (A01 != null) {
                    A01.A07(new C6PH(C31636Dv2.A00(c31462Ds6, c31636Dv2.A00.getModuleName())));
                }
                i = 1118715618;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A05 = C0f9.A05(-1302184208);
                C35245Fge c35245Fge = (C35245Fge) this.A02;
                C34921Fa7.A00(c35245Fge.A03, "message_setting_icebreaker_click");
                A00(c35245Fge.A00, AbstractC166987dD.A0b(), this, AbstractC111324zv.A00(878));
                i = -1674642006;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A05 = C0f9.A05(1745795816);
                C35245Fge c35245Fge2 = (C35245Fge) this.A02;
                C34921Fa7.A00(c35245Fge2.A03, "message_setting_message_control_click");
                A00(c35245Fge2.A00, AbstractC166987dD.A0b(), this, "direct_message_options");
                i = 131368146;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A05 = C0f9.A05(590213053);
                C35245Fge c35245Fge3 = (C35245Fge) this.A02;
                C34921Fa7.A00(c35245Fge3.A03, "message_settings_response_suggestions_click");
                A00(c35245Fge3.A00, AbstractC166987dD.A0b(), this, AbstractC111324zv.A00(4291));
                i = -798841445;
                C0f9.A0C(i, A05);
                return;
            case 34:
                A05 = C0f9.A05(-57353697);
                C35245Fge c35245Fge4 = (C35245Fge) this.A02;
                C34921Fa7.A00(c35245Fge4.A03, "message_setting_saved_replies_click");
                A00(c35245Fge4.A00, AbstractC166987dD.A0b(), this, AbstractC111324zv.A00(4288));
                i = 1278184261;
                C0f9.A0C(i, A05);
                return;
            case 35:
                A05 = C0f9.A05(-1950088252);
                C35245Fge c35245Fge5 = (C35245Fge) this.A02;
                C34921Fa7.A00(c35245Fge5.A03, "message_setting_welcome_message_click");
                A00(c35245Fge5.A00, AbstractC166987dD.A0b(), this, AbstractC111324zv.A00(390));
                i = -1698183076;
                C0f9.A0C(i, A05);
                return;
            case 36:
                A05 = C0f9.A05(1266051869);
                C31993E3v c31993E3v = (C31993E3v) this.A02;
                ExpandableTextView expandableTextView = c31993E3v.A08;
                boolean z3 = expandableTextView.A03;
                C36010Fv8 c36010Fv8 = c31993E3v.A09.A00;
                if (z3) {
                    c36010Fv8.A0F.A0B(C05F.A0B, 8, c36010Fv8.A02());
                    expandableTextView.A03 = false;
                    c31993E3v.A03 = true;
                    A00 = ((EY2) this.A01).A02;
                } else {
                    c36010Fv8.A0F.A05(8);
                    c31993E3v.A03 = false;
                    int width = c31993E3v.itemView.getWidth();
                    String str11 = ((EY2) this.A01).A02;
                    if (str11 == null) {
                        str11 = "";
                    }
                    A00 = expandableTextView.A00(str11, AbstractC166997dE.A0p(AbstractC31172DnG.A05(c31993E3v), 2131966564), width);
                }
                AbstractC31171DnF.A15(expandableTextView, A00);
                i = -1884114307;
                C0f9.A0C(i, A05);
                return;
            case 37:
                A05 = C0f9.A05(-1804393087);
                C48757LhP c48757LhP = (C48757LhP) this.A02;
                User user = ((C45216Jzw) this.A01).A02;
                C28261Yl.A00.A00(c48757LhP.A00, null, c48757LhP.A04, user, new C36765GIo(c48757LhP, 1), c48757LhP.A03.getModuleName(), null, user.getUsername());
                i = -13576181;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(-1806009868);
                ((CompoundButton) this.A01).setChecked(!r3.isChecked());
                ((C33611EtN) this.A02).A00.onClick(view);
                i = 223221320;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A05 = C0f9.A05(634793720);
                C31990E3s c31990E3s = (C31990E3s) this.A02;
                IgImageView igImageView = c31990E3s.A06;
                igImageView.setImageResource(R.drawable.instagram_circle_check_pano_filled_24);
                Context context2 = c31990E3s.A00;
                AbstractC31177DnL.A0p(context2, igImageView, AbstractC53242c7.A08(context2));
                EMG emg = ((FGB) this.A01).A00;
                UserSession A0r3 = AbstractC166987dD.A0r(emg.A0M);
                String string2 = emg.requireContext().getString(2131972813);
                String str12 = emg.A0E;
                InterfaceC09390do interfaceC09390do5 = emg.A0G;
                AbstractC35217FgA.A03(CollectionPrivacyModeEnum.A06, EV0.A00(emg, 13), A0r3, string2, str12, AbstractC31172DnG.A0f(interfaceC09390do5).A05, AbstractC166987dD.A1J(AbstractC31172DnG.A0f(interfaceC09390do5).A05), false);
                EMG.A02(emg);
                i = 1623984473;
                C0f9.A0C(i, A05);
                return;
            case 40:
                A05 = C0f9.A05(-797014536);
                C140966Yy A0r4 = AbstractC25225BEi.A0r((FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                A0r4.A0D(new C32365ENo());
                A0r4.A04();
                i = -1114042254;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A05 = C0f9.A05(-1570721550);
                EKZ ekz = (EKZ) this.A02;
                Medium medium = (Medium) this.A01;
                if (ekz.A07 == null) {
                    boolean z4 = false;
                    DirectAggregatedMediaViewerController directAggregatedMediaViewerController = new DirectAggregatedMediaViewerController(ekz.requireActivity(), AbstractC166987dD.A0r(ekz.A0N), null, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, z4, z4);
                    ekz.A07 = directAggregatedMediaViewerController;
                    ekz.registerLifecycleListener(directAggregatedMediaViewerController);
                }
                IgImageView igImageView2 = ekz.A06;
                if (igImageView2 != null) {
                    FIW fiw = new FIW(new C36343G1v(igImageView2, 2));
                    DirectAggregatedMediaViewerController directAggregatedMediaViewerController2 = ekz.A07;
                    if (directAggregatedMediaViewerController2 != null) {
                        Context requireContext = ekz.requireContext();
                        InterfaceC09390do interfaceC09390do6 = ekz.A0N;
                        List A1J = AbstractC166987dD.A1J(C76S.A00(requireContext, AbstractC166987dD.A0r(interfaceC09390do6)).A02(medium, false));
                        DirectThreadKey directThreadKey = ekz.A09;
                        if (directThreadKey == null) {
                            str = "threadKey";
                            break;
                        } else {
                            E6B e6b = new E6B(AbstractC31174DnI.A0A(igImageView2), igImageView2.getRotation());
                            String str13 = fiw.A01;
                            Resources A0N = AbstractC166997dE.A0N(ekz);
                            boolean A012 = C7HD.A01(AbstractC166987dD.A0r(interfaceC09390do6));
                            int i4 = R.dimen.abc_button_padding_horizontal_material;
                            if (A012) {
                                i4 = R.dimen.abc_select_dialog_padding_start_material;
                            }
                            directAggregatedMediaViewerController2.A0k(new MediaViewerReplyBarEligibilityCheckerImpl(false, false, false), null, null, null, e6b, null, directThreadKey, C05F.A0C, C05F.A01, str13, A1J, null, null, null, A0N.getDimensionPixelSize(i4), 0, false, false, true, false, false);
                        }
                    }
                    i = 1361450410;
                    C0f9.A0C(i, A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = C0f9.A05(1578294074);
                Bundle A0b7 = AbstractC166987dD.A0b();
                EOK eok = (EOK) this.A02;
                String str14 = eok.A0A;
                if (str14 == null) {
                    str4 = "collectionId";
                } else {
                    A0b7.putString("collection_id", str14);
                    String str15 = eok.A0C;
                    if (str15 == null) {
                        str4 = "threadId";
                    } else {
                        A0b7.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str15);
                        A0b7.putString("card_gallery_collection_title", ((C45284K2m) this.A01).A02);
                        A0b7.putInt("direct_channel_audience_type", eok.A00);
                        DirectThreadKey directThreadKey2 = eok.A08;
                        if (directThreadKey2 != null) {
                            A0b7.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_V2_ID", directThreadKey2.A01);
                            String str16 = eok.A0D;
                            if (str16 == null) {
                                str4 = "userType";
                            } else {
                                A0b7.putString("channel_user_type", str16);
                                A0b7.putString("card_gallery_entry_point", "channel_daily_prompt_responses");
                                DirectThreadKey directThreadKey3 = eok.A08;
                                if (directThreadKey3 != null) {
                                    AbstractC43826JZo.A01(A0b7, directThreadKey3, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
                                    C6XJ A0Z = AbstractC31173DnH.A0Z(eok.getActivity(), A0b7, AbstractC166987dD.A0o(eok.A0I), ModalActivity.class, AbstractC111324zv.A00(876));
                                    A0Z.A00 = 1;
                                    A0Z.A0H = false;
                                    A0Z.A0C(eok.getActivity());
                                    i = -1425631641;
                                    C0f9.A0C(i, A05);
                                    return;
                                }
                            }
                        }
                        C14360o3.A0F("threadKey");
                        throw C00O.createAndThrow();
                    }
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
            case 43:
                A05 = C0f9.A05(1518791894);
                C31831Dyp c31831Dyp = (C31831Dyp) this.A02;
                if (c31831Dyp != null) {
                    c31831Dyp.A07.Egh(new E9D((User) this.A01));
                }
                i = -1836390435;
                C0f9.A0C(i, A05);
                return;
            case 44:
                A05 = C0f9.A05(2082058227);
                C31831Dyp c31831Dyp2 = (C31831Dyp) this.A02;
                if (c31831Dyp2 != null) {
                    c31831Dyp2.A07.Egh(new E9D((User) this.A01));
                }
                i = 1711121460;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A05 = C0f9.A05(261739464);
                C31831Dyp c31831Dyp3 = (C31831Dyp) this.A01;
                if (c31831Dyp3 != null) {
                    c31831Dyp3.A07.Egh(new E9E(((C36211FyP) this.A02).A06));
                }
                i = -1904589486;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(-767513133);
                C36211FyP c36211FyP = (C36211FyP) this.A02;
                if (c36211FyP.A09) {
                    view.performHapticFeedback(3);
                    C31831Dyp c31831Dyp4 = (C31831Dyp) this.A01;
                    if (c31831Dyp4 != null) {
                        c31831Dyp4.A00(c36211FyP.A06, c36211FyP.A0D);
                    }
                }
                i = -455798461;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = C0f9.A05(950413400);
                G1e g1e = ((G5E) this.A02).A05;
                G5F g5f = (G5F) this.A01;
                String str17 = g5f.A02;
                String str18 = g5f.A03;
                if (str17 != null) {
                    UserSession userSession = g1e.A03;
                    KDS A004 = AbstractC46899Kog.A00(userSession, g1e.A06, null, g1e.A07, -2, 0, g1e.A01, 0, true, false);
                    C189478aR A005 = AbstractC31177DnL.A0X(userSession, true).A00();
                    A004.A01 = new C36437G5m(g1e, A005, str18, str17);
                    A005.A02(g1e.A02, A004);
                }
                i = -866234763;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A05 = C0f9.A05(938212353);
                C44Q c44q = ((C36195Fy9) this.A01).A00;
                EXS exs = (EXS) this.A02;
                int A032 = AbstractC31177DnL.A03(c44q.BYF());
                Integer C7h = c44q.C7h();
                if (C7h != null) {
                    if (C4GR.A01(C7h.intValue()) && A032 >= 250) {
                        exs.A01.DIb(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
                    } else {
                        Integer C7h2 = c44q.C7h();
                        if (C7h2 != null && C7h2.intValue() == 29) {
                            C44O Ast = c44q.Ast();
                            if (Ast != null) {
                                i3 = Ast.AdZ();
                            } else {
                                A14 = AbstractC166987dD.A14("Required value was null.");
                                i2 = 1036202252;
                            }
                        } else {
                            i3 = 0;
                        }
                        InterfaceC37172GZj interfaceC37172GZj = exs.A01;
                        String C7K = c44q.C7K();
                        String title = c44q.getTitle();
                        SimpleImageUrl A0t = AbstractC25225BEi.A0t(c44q.BAX());
                        Integer C7h3 = c44q.C7h();
                        if (C7h3 != null) {
                            interfaceC37172GZj.Dsr(A0t, C7K, title, A032, C7h3.intValue(), i3);
                        } else {
                            A14 = AbstractC166987dD.A14("Required value was null.");
                            i2 = 1642064704;
                        }
                    }
                    i = -921102742;
                    C0f9.A0C(i, A05);
                    return;
                }
                A14 = AbstractC166987dD.A14("Required value was null.");
                i2 = 1306711903;
                C0f9.A0C(i2, A05);
                throw A14;
            case 49:
                A05 = C0f9.A05(-903457784);
                i = 797189202;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A01;
                InterfaceC37224GaZ interfaceC37224GaZ = (InterfaceC37224GaZ) this.A02;
                if (!directShareTarget.A0I()) {
                    return;
                }
                interfaceC37224GaZ.DdK(directShareTarget);
                return;
            case 51:
                ((InterfaceC37224GaZ) this.A01).DAR((DirectShareTarget) this.A02);
                return;
            case 52:
                A05 = C0f9.A05(-1888443014);
                ((InterfaceC37214GaP) this.A01).Dy7((C32107E9f) this.A02);
                i = 1113765618;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A05 = C0f9.A05(-1480749063);
                ((InterfaceC37214GaP) this.A01).DT0((C32107E9f) this.A02);
                i = -515864386;
                C0f9.A0C(i, A05);
                return;
            case 54:
                A05 = C0f9.A05(-2083080981);
                ((InterfaceC37214GaP) this.A01).Dev((C32107E9f) this.A02);
                i = 275421781;
                C0f9.A0C(i, A05);
                return;
            case 55:
                A05 = C0f9.A05(-1323123052);
                ((InterfaceC37214GaP) this.A01).Djm((C32107E9f) this.A02);
                i = 1158738085;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A05 = C0f9.A05(-1387952199);
                ((InterfaceC37214GaP) this.A01).Dy2((C32107E9f) this.A02);
                i = 2142836954;
                C0f9.A0C(i, A05);
                return;
            case 57:
                A05 = C0f9.A05(200401997);
                ((InterfaceC37214GaP) this.A01).CxJ((C32107E9f) this.A02);
                i = -1427513930;
                C0f9.A0C(i, A05);
                return;
            case 58:
                A05 = C0f9.A05(672651480);
                C34426FFq c34426FFq = (C34426FFq) this.A02;
                SavedCollection savedCollection = (SavedCollection) this.A01;
                C1XH A006 = FB6.A00();
                C32243EIc c32243EIc = c34426FFq.A00;
                A006.A02(c32243EIc.requireActivity(), c32243EIc, AbstractC166987dD.A0r(c32243EIc.A04), savedCollection);
                i = -1078020248;
                C0f9.A0C(i, A05);
                return;
            case 59:
                A05 = C0f9.A05(-1943993683);
                E3W e3w = (E3W) this.A02;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                e3w.A05.invoke(this.A01);
                i = -576415564;
                C0f9.A0C(i, A05);
                return;
            case 60:
                A05 = C0f9.A05(565174566);
                C32353ENa c32353ENa = (C32353ENa) this.A02;
                if (AbstractC34275F9v.A00(c32353ENa) != null) {
                    C35031Fc4.A00.A00(AbstractC166987dD.A0o(c32353ENa.A0S), null, c32353ENa.A04.A01);
                }
                ((InterfaceC37264GbH) this.A01).CnE(1);
                i = 175752169;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A05 = C0f9.A05(-797889916);
                C69531Vqv c69531Vqv = (C69531Vqv) this.A01;
                MediaMapPin mediaMapPin = (MediaMapPin) this.A02;
                LocationDetailFragment locationDetailFragment = c69531Vqv.A00;
                AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), mediaMapPin, "instagram_map_location_detail_tap_direct_share");
                MediaMapFragment mediaMapFragment = (MediaMapFragment) locationDetailFragment.requireParentFragment();
                C67858Uzp c67858Uzp = new C67858Uzp();
                ?? obj = new Object();
                obj.A00 = mediaMapFragment;
                obj.A01 = c67858Uzp;
                C1ON A007 = AbstractC34304FAy.A00(mediaMapFragment.A02, C05F.A0Y, mediaMapPin.getId(), AbstractC111324zv.A00(4329));
                A007.A00 = new C32540EUq(9, mediaMapFragment, mediaMapPin, (Object) obj);
                mediaMapFragment.schedule(A007);
                i = 1004544362;
                C0f9.A0C(i, A05);
                return;
            case 62:
                A05 = C0f9.A05(-1116478736);
                WUY wuy = (WUY) this.A01;
                MediaMapFragment mediaMapFragment2 = wuy.A02;
                FragmentActivity requireActivity2 = mediaMapFragment2.requireActivity();
                AbstractC10360h2 parentFragmentManager = mediaMapFragment2.getParentFragmentManager();
                Venue venue = (Venue) this.A02;
                C08790ch A008 = AbstractC018607g.A00(mediaMapFragment2);
                UserSession userSession2 = wuy.A00;
                String name = venue.A00.getName();
                String A009 = AbstractC111324zv.A00(2692);
                boolean booleanValue = AbstractC166997dE.A0c(C06090Tz.A05, userSession2, 36314837549779812L).booleanValue();
                AbstractC31510Dsu.A0B(requireActivity2, parentFragmentManager, A008, new C35874Fso(requireActivity2, mediaMapFragment2, userSession2, venue, name, 1, booleanValue), mediaMapFragment2, userSession2, AbstractC31172DnG.A0s(booleanValue), null, null, venue.A05(), A009, "qr_code");
                i = 1579868440;
                C0f9.A0C(i, A05);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A05 = C0f9.A05(-1603012763);
                EL5 el5 = (EL5) this.A02;
                FanClubConsiderationViewModel A0010 = EL5.A00(el5);
                Number number = (Number) ((JV1) this.A01).A04;
                FragmentActivity requireActivity3 = el5.requireActivity();
                C14360o3.A0B(number, 0);
                int intValue = number.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        UserSession userSession3 = A0010.A03;
                        boolean A062 = C18U.A06(C06090Tz.A05, userSession3, 36321576349607542L);
                        C50674MYs c50674MYs = new C50674MYs(requireActivity3, userSession3);
                        c50674MYs.A03(new FpQ(69, A0010, requireActivity3), 2131962139);
                        if (A062) {
                            c50674MYs.A03(new FpQ(70, A0010, requireActivity3), 2131962136);
                        }
                        C31727DwY.A00(requireActivity3, c50674MYs);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    C140966Yy A0r5 = AbstractC25225BEi.A0r(requireActivity3, A0010.A03);
                    A0r5.A0D(FVI.A00().A02("PROFILE"));
                    A0r5.A04();
                }
                i = 993825830;
                C0f9.A0C(i, A05);
                return;
            case 64:
                A05 = C0f9.A05(-767691801);
                EL5 el52 = (EL5) this.A02;
                C99694dm c99694dm = (C99694dm) el52.A0N.getValue();
                String A0e = AbstractC31175DnJ.A0e(el52.A0K);
                InterfaceC09390do interfaceC09390do7 = el52.A0M;
                String A0e2 = AbstractC31175DnJ.A0e(interfaceC09390do7);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_customized_benefits_subscription_management_customize_button_tap");
                AbstractC31171DnF.A1I(A0f2, "creator_management_consideration");
                AbstractC31178DnM.A17(A0f2, A0e);
                AbstractC31180DnO.A1I(A0f2, A0e2);
                FVI.A01().A06(el52.requireActivity(), AbstractC166987dD.A0r(el52.A0O), AbstractC31175DnJ.A0e(interfaceC09390do7), AbstractC166987dD.A1F((Collection) this.A01));
                i = -1569491641;
                C0f9.A0C(i, A05);
                return;
            case 65:
                A05 = C0f9.A05(-595219203);
                EL5 el53 = (EL5) this.A02;
                FanClubConsiderationViewModel A0011 = EL5.A00(el53);
                FragmentActivity requireActivity4 = el53.requireActivity();
                C32907Edo c32907Edo = (C32907Edo) ((AbstractC33548EsM) this.A01);
                String str19 = c32907Edo.A07;
                boolean z5 = c32907Edo.A0I;
                C14360o3.A0B(str19, 1);
                if (z5) {
                    if (C18U.A06(C06090Tz.A05, A0011.A03, 36321018003858478L)) {
                        FanClubConsiderationViewModel.A0B(A0011, str19);
                        i = -223914728;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                UserSession userSession4 = A0011.A03;
                Bundle A0b8 = AbstractC166987dD.A0b();
                A0b8.putString("creator_user_id", AbstractC25231BEo.A0t((User) A0011.A0E.getValue()));
                if (A0011.A00 == C05F.A00) {
                    str5 = "fan_management";
                } else {
                    str5 = "fan_onboarding";
                }
                A0b8.putString("origin", str5);
                AbstractC31177DnL.A0o(requireActivity4, A0b8, userSession4, AbstractC111324zv.A00(4424));
                i = -223914728;
                C0f9.A0C(i, A05);
                return;
            case 66:
                A05 = C0f9.A05(-1503501090);
                EL5 el54 = (EL5) this.A02;
                C99694dm c99694dm2 = (C99694dm) el54.A0N.getValue();
                String A0e3 = AbstractC31175DnJ.A0e(el54.A0K);
                String A0e4 = AbstractC31175DnJ.A0e(el54.A0M);
                InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(c99694dm2.A00, "ig_fan_club_consideration_screen_exclusive_story_ring_tapped");
                AbstractC31171DnF.A1I(A0f3, AbstractC111324zv.A00(211));
                A0f3.AAP("origin", A0e4);
                AbstractC31178DnM.A17(A0f3, A0e3);
                A0f3.Cht();
                FragmentActivity requireActivity5 = el54.requireActivity();
                UserSession A0r6 = AbstractC166987dD.A0r(el54.A0O);
                User user2 = (User) EL5.A00(el54).A0E.getValue();
                if (user2 == null) {
                    i = 406292841;
                } else {
                    AbstractC35068Fcf.A02(requireActivity5, el54, A0r6, user2, new C50171MDy(22, this.A01, el54), true);
                    i = -861449303;
                }
                C0f9.A0C(i, A05);
                return;
            case 67:
                A05 = C0f9.A05(1295385215);
                EL5 el55 = (EL5) this.A02;
                FanClubConsiderationViewModel A0012 = EL5.A00(el55);
                FragmentActivity requireActivity6 = el55.requireActivity();
                C32907Edo c32907Edo2 = (C32907Edo) this.A01;
                A0012.A0E(requireActivity6, c32907Edo2.A07, c32907Edo2.A08, c32907Edo2.A0A, c32907Edo2.A0B, c32907Edo2.A0I);
                i = 1873664502;
                C0f9.A0C(i, A05);
                return;
            case 68:
                A05 = C0f9.A05(598493914);
                C32647EYv c32647EYv = (C32647EYv) this.A02;
                UserSession userSession5 = c32647EYv.A03;
                C99694dm A0013 = AbstractC99684dl.A00(userSession5);
                String str20 = c32647EYv.A05;
                String str21 = c32647EYv.A06;
                String str22 = ((C32094E8s) this.A01).A02;
                A0013.A0A(str20, str21, str22);
                C09530e4 A1L = AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE", "Static");
                C09530e4 A1L2 = AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_FEED_TITLE", c32647EYv.A00.getString(2131969870));
                User user3 = (User) c32647EYv.A04.A0E.getValue();
                if (user3 != null) {
                    str6 = user3.getUsername();
                } else {
                    str6 = null;
                }
                AbstractC31177DnL.A0o(c32647EYv.A01, AbstractC61636Rr0.A00(A1L, A1L2, AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE", str6), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION", str22), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST", AbstractC166987dD.A1J(str22)), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_MODULE_NAME", AbstractC111324zv.A00(2357)), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", c32647EYv.A02.getModuleName()), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", false)), userSession5, "contextual_feed");
                i = -131585837;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A05 = C0f9.A05(2119733711);
                FanClubConsiderationViewModel fanClubConsiderationViewModel = (FanClubConsiderationViewModel) this.A02;
                FVI.A01().A02((FragmentActivity) this.A01, fanClubConsiderationViewModel.A03);
                C99694dm c99694dm3 = fanClubConsiderationViewModel.A04;
                long parseLong = Long.parseLong(fanClubConsiderationViewModel.A0A);
                InterfaceC02590Ai A0f4 = AbstractC166987dD.A0f(c99694dm3.A00, "ig_digital_fan_club_share_as_story_sticker_click");
                AbstractC31178DnM.A1C(A0f4, "creator_management_consideration", parseLong);
                A0f4.Cht();
                i = 1138547679;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(1508358040);
                User user4 = (User) ((FanClubConsiderationViewModel) this.A02).A0E.getValue();
                if (user4 != null) {
                    String username2 = user4.getUsername();
                    Context context3 = (Context) this.A01;
                    AbstractC13900nG.A00(context3, AbstractC166997dE.A0z("https://ig.me/u/%s?extra=subscribe", AbstractC166997dE.A1b(username2, 1)));
                    AbstractC34301FAv.A00(context3, view, null, false);
                } else {
                    C9GR.A07((Context) this.A01, 2131965226);
                }
                i = 754639199;
                C0f9.A0C(i, A05);
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public FpQ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public FpQ(C36211FyP c36211FyP, C31831Dyp c31831Dyp, int i) {
        this.A00 = i;
        if (45 - i != 0) {
            this.A02 = c36211FyP;
            this.A01 = c31831Dyp;
        } else {
            this.A01 = c31831Dyp;
            this.A02 = c36211FyP;
        }
    }
}
