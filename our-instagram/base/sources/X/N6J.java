package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class N6J extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC58144Pq9, InterfaceC58038PoO, CallerContextable {
    public static final String __redex_internal_original_name = "ClipsPublishScreenFragment";
    public AnonymousClass857 A00;
    public C9JS A01;
    public C8JY A02;
    public C55071OaR A03;
    public NJL A04;
    public C44448JlG A05;
    public OFX A06;
    public C50966MfZ A07;
    public DirectCameraViewModel A08;
    public PromptStickerModel A09;
    public C6WQ A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC56362iU A0I;
    public C8Y5 A0J;
    public String A0K;
    public ArrayList A0L;
    public boolean A0M;
    public final TextWatcher A0N;
    public final java.util.Set A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;
    public final InterfaceC41501vz A0V;
    public final InterfaceC41501vz A0W;
    public final InterfaceC41501vz A0X;
    public final InterfaceC41501vz A0Y;
    public final InterfaceC41501vz A0Z;
    public final InterfaceC41501vz A0a;
    public final InterfaceC41501vz A0b;
    public final InterfaceC41501vz A0c;
    public final NAp A0d;
    public final InterfaceC60152ox A0e;
    public final C3I9 A0f;
    public final InterfaceC11380iw A0O = new C55898Orm(this);
    public final String A0g = AbstractC167017dG.A0j();

    private final int A00() {
        int[] iArr = new int[2];
        OFX ofx = this.A06;
        if (ofx != null) {
            ofx.A0A.getLocationOnScreen(iArr);
            int i = iArr[1];
            int[] iArr2 = new int[2];
            OFX ofx2 = this.A06;
            if (ofx2 != null) {
                ofx2.A03.getLocationOnScreen(iArr2);
                int i2 = iArr2[1];
                OFX ofx3 = this.A06;
                if (ofx3 != null) {
                    return (i + ofx3.A03.getScrollY()) - i2;
                }
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    public static final void A0B(C1117351z c1117351z, N6J n6j, String str) {
        C101394gx c101394gx;
        if (c1117351z != null) {
            c101394gx = c1117351z.A01;
        } else {
            c101394gx = null;
        }
        C52465NJj c52465NJj = A06(n6j).A0J;
        c52465NJj.A07(C51754Mtd.A0E(c52465NJj.A04(), c101394gx, null, null, -2097153));
        CommentPrompt commentPrompt = c1117351z != null ? c1117351z.A00 : null;
        C52465NJj c52465NJj2 = A06(n6j).A0J;
        c52465NJj2.A07(C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, c52465NJj2.A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262141, false, false, false, false, AbstractC167007dF.A1W(commentPrompt), false, false, false, false, false, false, false, false));
        if (str != null) {
            C52465NJj c52465NJj3 = A06(n6j).A0J;
            c52465NJj3.A07(C51754Mtd.A0F(c52465NJj3.A04(), str));
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A0I = interfaceC56362iU;
        interfaceC56362iU.EkS(true);
        int i = 2131973859;
        if (A0R(this)) {
            i = 2131969316;
        }
        interfaceC56362iU.Efu(i);
        if (A02(this) == EnumC53133Nem.A03) {
            interfaceC56362iU.AAF(new KLF(this, 4), 2131961561);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0572, code lost:
    
        r16 = "dependencyProvider";
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0489, code lost:
    
        if ((r13.A01() instanceof X.InterfaceC2056098k) != true) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x022a, code lost:
    
        if (X.AbstractC50595MVg.A00(X.AbstractC166987dD.A0r(r2)) == false) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.8YD, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r39, android.os.Bundle r40) {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ClipsSharingDraftViewModel A01(N6J n6j) {
        NJL njl = n6j.A04;
        if (njl == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        return (ClipsSharingDraftViewModel) njl.A0S.getValue();
    }

    public static final EnumC53133Nem A02(N6J n6j) {
        NJL njl = n6j.A04;
        if (njl == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        return (EnumC53133Nem) njl.A0R.getValue();
    }

    public static final InterfaceC58310Pt2 A03(N6J n6j) {
        NJL njl = n6j.A04;
        if (njl == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        return njl.A03();
    }

    public static final C54818OKt A04(N6J n6j) {
        NJL njl = n6j.A04;
        if (njl == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        return (C54818OKt) njl.A0H.getValue();
    }

    public static final C50994Mg1 A05(N6J n6j) {
        NJL njl = n6j.A04;
        if (njl == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        return (C50994Mg1) njl.A0G.getValue();
    }

    public static final NJR A06(N6J n6j) {
        String str;
        NJL njl = n6j.A04;
        if (njl == null) {
            str = "dependencyProvider";
        } else {
            NJR njr = njl.A04;
            if (njr != null) {
                return njr;
            }
            str = "clipsPublishScreenViewModel";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final String A07(N6J n6j) {
        OFX ofx = n6j.A06;
        if (ofx == null) {
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A0g(ofx.A0A);
    }

    public static final String A08(N6J n6j) {
        NJL njl = n6j.A04;
        if (njl == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        return AbstractC25225BEi.A15(njl.A0F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cb, code lost:
    
        if (r0 != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0C(X.C128175qm r25, X.N6J r26, java.lang.String r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.A0C(X.5qm, X.N6J, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A0D(C128175qm c128175qm, N6J n6j, String str, String str2, boolean z) {
        String str3;
        C47Z c47z;
        EnumC53371NjM enumC53371NjM;
        String str4;
        C38709H2v c38709H2v;
        Integer num;
        InterfaceC09390do interfaceC09390do = n6j.A0U;
        if (AbstractC63302u8.A00(AbstractC166987dD.A0r(interfaceC09390do)).A03(UserMonetizationProductType.A0E)) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("deal_id", c128175qm.A0X);
            C47Z A04 = NJR.A04(n6j);
            if (A04 != null && (c38709H2v = A04.A0v) != null && (num = c38709H2v.A00) != null) {
                str4 = num.toString();
            } else {
                str4 = null;
            }
            A1G.put("scheduled_publish_time", str4);
            AbstractC54040Nuq.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(C05F.A0N, A06(n6j).A0O.A02, null, A1G.toString());
        }
        C47Z A042 = NJR.A04(n6j);
        if (A042 == null) {
            AbstractC12120kG.A07(__redex_internal_original_name, "pendingMedia is null in onShareButtonClicked", null);
            return;
        }
        if (A042.A0q != null) {
            NJL njl = n6j.A04;
            if (njl == null) {
                str3 = "dependencyProvider";
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            C54816OKr c54816OKr = (C54816OKr) njl.A0T.getValue();
            if (c54816OKr != null) {
                if (z) {
                    enumC53371NjM = EnumC53371NjM.FEED;
                } else {
                    enumC53371NjM = EnumC53371NjM.CLIPS;
                }
                c54816OKr.A00(enumC53371NjM, null);
            }
        }
        if (A042.A0v != null) {
            C22P c22p = ((C22F) MSX.A0K(n6j)).A04.A09;
            C14360o3.A07(c22p);
            new OXR(AbstractC53855Nrj.A00(c22p), n6j.A0O, AbstractC166987dD.A0r(interfaceC09390do)).A05(C05F.A01);
        }
        NKM nkm = A06(n6j).A0i;
        NJR A06 = A06(n6j);
        nkm.A0B(A06.A0B.A06(PublishScreenCategoryType.A06, A06.A01));
        String str5 = c128175qm.A0g;
        if (str5 != null && !str5.equals(n6j.getString(2131955765))) {
            A042.A1V.A02 = str5;
        }
        if (A042.A0i == C22P.A37) {
            A042.A0K = 108;
        }
        Activity rootActivity = n6j.getRootActivity();
        if (rootActivity == null) {
            return;
        }
        if (n6j.A0A == null) {
            n6j.A0A = AbstractC31174DnI.A0i(rootActivity);
        }
        str3 = "clipsShareSheetViewModel";
        if (A04(n6j) != null) {
            C50966MfZ c50966MfZ = n6j.A07;
            if (c50966MfZ != null) {
                AbstractC55107ObO.A02((MediaCroppingCoordinates) c50966MfZ.A01.A00("PROFILE_CROP_COORDINATES_KEY"), c128175qm, A042, z, false);
                AbstractC55107ObO.A03(AbstractC166987dD.A0r(interfaceC09390do), c128175qm, A042, str);
                C54818OKt A043 = A04(n6j);
                if (A043 != null && (c47z = A043.A00) != null) {
                    c47z.A2Z = str;
                    c47z.A5P = z;
                    c47z.A5g = false;
                    c47z.A5S = false;
                    A043.A00();
                    C47Z A01 = AbstractC189168Zk.A01(A043.A02, c47z);
                    if (A01.A1G == EnumC40111tc.A0A) {
                        A043.A03.A0B(A01);
                    }
                    A043.A03.A09(A01);
                }
                C23031Ai A00 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do));
                if (AbstractC167017dG.A1b(A00, A00.A0F, C23031Ai.A8c, 131)) {
                    A0H(n6j);
                }
                A0C(c128175qm, n6j, str, str2, z);
                return;
            }
        } else {
            String A0x = AbstractC43593JPy.A0x();
            C14360o3.A0B(A0x, 0);
            A042.A3t = A0x;
            A042.A0b(EnumC915447k.A07);
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C50966MfZ c50966MfZ2 = n6j.A07;
            if (c50966MfZ2 != null) {
                AbstractC55107ObO.A01(rootActivity, (MediaCroppingCoordinates) c50966MfZ2.A01.A00("PROFILE_CROP_COORDINATES_KEY"), A0r, c128175qm, new C56315Ozc(c128175qm, n6j, str, str2, z), n6j, A042, str, z, false);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public static final void A0E(N6J n6j) {
        C55071OaR c55071OaR;
        if (n6j.getContext() != null) {
            String str = "viewHolder";
            if (n6j.A03 == null) {
                Context requireContext = n6j.requireContext();
                UserSession A0r = AbstractC166987dD.A0r(n6j.A0U);
                OFX ofx = n6j.A06;
                if (ofx != null) {
                    n6j.A03 = new C55071OaR(requireContext, A0r, ofx.A07, C57522Pfw.A00(n6j, 49), C57525Pfz.A00(n6j, 0), C57525Pfz.A00(n6j, 1));
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C44448JlG c44448JlG = n6j.A05;
            if (c44448JlG == null) {
                str = "clipsPublishScreenCaptionSuggestionViewModel";
            } else {
                C09530e4 c09530e4 = (C09530e4) c44448JlG.A01.getValue();
                if (c09530e4 != null) {
                    if (C14360o3.A0K(c09530e4.A00, A08(n6j))) {
                        Object obj = c09530e4.A01;
                        if (MSX.A1X(obj)) {
                            String str2 = (String) AbstractC001800i.A0J((List) obj);
                            if (str2 != null && (c55071OaR = n6j.A03) != null) {
                                O2P o2p = new O2P(n6j);
                                OFX ofx2 = n6j.A06;
                                if (ofx2 != null) {
                                    ArrayList A00 = AbstractC85443rZ.A00(AbstractC167007dF.A0g(ofx2.A0A));
                                    if (!c55071OaR.A02) {
                                        List list = c55071OaR.A01;
                                        if (list != null && !list.isEmpty()) {
                                            C55071OaR.A01(c55071OaR, o2p, A00);
                                            return;
                                        }
                                        C40701ud c40701ud = c55071OaR.A05;
                                        C2JM A0b = AbstractC25225BEi.A0b();
                                        C2JM A0b2 = AbstractC25225BEi.A0b();
                                        boolean A1X = AbstractC43594JPz.A1X(A0b, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c55071OaR.A03.userId);
                                        A0b.A04("personalizedHashtagSurface", "clips_creation_composer");
                                        A0b.A04("personalizedHashtagType", "recommended");
                                        A0b.A04("opaque_token", str2);
                                        c40701ud.A06(new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1X), "IGContentBasedHashtagSuggestionsQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C67010Uev.class, false, null, 0, null, "xdt_users__info", AbstractC166987dD.A1E()), new Tx4(4, o2p, c55071OaR, A00));
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    C55071OaR c55071OaR2 = n6j.A03;
                    if (c55071OaR2 != null && c55071OaR2.A02) {
                        A0I(n6j);
                        return;
                    }
                    return;
                }
                C55071OaR c55071OaR3 = n6j.A03;
                if (c55071OaR3 != null) {
                    c55071OaR3.A02();
                    return;
                }
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A0H(N6J n6j) {
        int A09;
        C8r2 c8r2;
        C187028Qv c187028Qv;
        LinkedHashMap linkedHashMap;
        MusicAssetModel musicAssetModel;
        C47Z A04 = NJR.A04(n6j);
        if (A04 != null) {
            Context requireContext = n6j.requireContext();
            UserSession A0r = AbstractC166987dD.A0r(n6j.A0U);
            C128175qm A00 = ClipsSharingDraftViewModel.A00(n6j);
            C14360o3.A0B(A0r, 1);
            C47Z A002 = AbstractC209399Nx.A00(A04, "pending_media_save_copy");
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            C47v c47v = A04.A1V;
            C14360o3.A0B(c47v, 0);
            boolean z = true;
            A04.A1V.A00(C5JI.A0A);
            AudioOverlayTrack audioOverlayTrack = A00.A0N;
            if (audioOverlayTrack != null) {
                int i = audioOverlayTrack.A02;
                int i2 = 30000;
                if (C18U.A06(C06090Tz.A05, A0r, 36317947102566106L)) {
                    i2 = 60000;
                }
                if (i <= i2) {
                    z = false;
                }
            }
            MusicOverlayStickerModel A05 = AbstractC101614hW.A05(A04.A4b);
            int A0A = AbstractC13880nE.A0A(requireContext);
            ClipInfo clipInfo = A04.A1N;
            InterfaceC09390do interfaceC09390do = ClipInfo.A0Q;
            if (!C14360o3.A0K(clipInfo, interfaceC09390do.getValue())) {
                A09 = (int) (A0A / A04.A1N.A00);
            } else {
                A09 = AbstractC13880nE.A09(requireContext);
            }
            int A08 = AbstractC50522MSa.A08(A0r, A04, A04.A1N, interfaceC09390do);
            String username = AbstractC166997dE.A0Y(A0r).getUsername();
            if (!AbstractC13670mt.A0B(username)) {
                if (A05 != null && AbstractC166997dE.A1Z(A05.A0E, false)) {
                    musicAssetModel = MusicAssetModel.A03(A05);
                } else {
                    musicAssetModel = null;
                }
                AbstractC50522MSa.A0x(A37.A00(requireContext, musicAssetModel, username, A0A, A09, A08, z, false), A1I);
            }
            C203248yh c203248yh = A00.A0C;
            if (c203248yh != null && (c8r2 = c203248yh.A01) != null && (c187028Qv = c8r2.A05) != null && (linkedHashMap = c187028Qv.A09) != null) {
                A1I.putAll(linkedHashMap);
            }
            if (z) {
                A002.A1V = new C47v(0.0f, 31);
            }
            boolean A06 = C18U.A06(C06090Tz.A05, A0r, 36319102448507839L);
            AAW aaw = new AAW(requireContext, A0r, null, null, null, c47v, A002, A1I, z, false, true);
            if (A06) {
                ALk.A01(aaw, null);
            } else {
                C1GJ.A03(ALk.A00(aaw, null));
            }
        }
    }

    public static final void A0J(N6J n6j) {
        AbstractC166987dD.A1T(C18950wb.A01, "clips_draft_null_showing_error_dialog", 817899173);
        C193328hC A0O = AbstractC31175DnJ.A0O(n6j);
        A0O.A09(2131974297);
        A0O.A0F(DialogInterfaceOnClickListenerC55319Ogh.A00(n6j, 42));
        A0O.A0s(false);
        AbstractC166987dD.A1W(A0O);
    }

    public static final void A0K(N6J n6j, C211849aB c211849aB) {
        Integer num = c211849aB.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        C200108tF.A01.A0C(AbstractC166987dD.A0r(n6j.A0U), "reels", false, true);
                        return;
                    }
                    return;
                } else {
                    C200108tF c200108tF = C200108tF.A01;
                    InterfaceC09390do interfaceC09390do = n6j.A0U;
                    c200108tF.A0C(AbstractC166987dD.A0r(interfaceC09390do), "reels", false, true);
                    C200108tF.A02(AbstractC166987dD.A0r(interfaceC09390do), true);
                    return;
                }
            }
            C200108tF.A01.A0C(AbstractC166987dD.A0r(n6j.A0U), "reels", true, true);
        }
    }

    public static final void A0L(N6J n6j, String str) {
        String str2;
        C110204xp c110204xp;
        C22P c22p;
        String str3;
        EnumC189548aZ enumC189548aZ;
        if (!ClipsSharingDraftViewModel.A02(n6j)) {
            A0J(n6j);
            return;
        }
        C128175qm A00 = ClipsSharingDraftViewModel.A00(n6j);
        C447724h c447724h = MSX.A0K(n6j).A0J;
        List list = A00.A0v;
        c447724h.A06(A00.A0H, str, list.size());
        InterfaceC09390do interfaceC09390do = n6j.A0U;
        C183348Bh A002 = AbstractC183338Bg.A00(AbstractC166987dD.A0r(interfaceC09390do));
        int size = list.size();
        boolean z = true;
        boolean A1W = AbstractC167007dF.A1W(A00.A0N);
        C9JS c9js = A00.A0E;
        if (c9js == null) {
            z = false;
        }
        AHF A01 = A002.A0J.A01("drafts", 838605197);
        A01.A05(AbstractC111324zv.A00(5006), size);
        Map map = A01.A04;
        map.put("has_audio_track", String.valueOf(A1W));
        map.put("is_remix", String.valueOf(z));
        A002.A02 = A01.A01();
        if (c9js == null) {
            n6j.A0S();
            str2 = A00.A0V;
        } else {
            str2 = null;
        }
        int[] iArr = null;
        if (ClipsSharingDraftViewModel.A02(n6j)) {
            c110204xp = ClipsSharingDraftViewModel.A00(n6j).A08;
        } else {
            c110204xp = null;
        }
        if (!ClipsSharingDraftViewModel.A02(n6j)) {
            c22p = C22P.A0z;
        } else if (c110204xp != null) {
            c22p = C22P.A10;
        } else {
            String str4 = ClipsSharingDraftViewModel.A00(n6j).A0W;
            if (str4 != null) {
                C22P valueOf = C22P.valueOf(str4);
                if (AbstractC199378re.A00(valueOf) || valueOf == C22P.A2d) {
                    String str5 = ClipsSharingDraftViewModel.A00(n6j).A0W;
                    if (str5 == null || (c22p = C22P.valueOf(str5)) == null) {
                        c22p = C22P.A0z;
                    }
                }
            }
            c22p = C22P.A0z;
        }
        n6j.A0S();
        C110204xp c110204xp2 = null;
        java.util.Set A0n = AbstractC37304Gc5.A0n(c22p);
        C9JS c9js2 = ClipsSharingDraftViewModel.A00(n6j).A0E;
        if (c9js2 != null) {
            str3 = c9js2.A09;
        } else {
            str3 = null;
        }
        C9JS c9js3 = ClipsSharingDraftViewModel.A00(n6j).A0E;
        if (c9js3 != null) {
            enumC189548aZ = c9js3.A06;
        } else {
            enumC189548aZ = null;
        }
        String str6 = ClipsSharingDraftViewModel.A00(n6j).A0T;
        PendingRecipient pendingRecipient = A06(n6j).A0j;
        C5JK c5jk = ClipsSharingDraftViewModel.A00(n6j).A0H;
        C14360o3.A0B(c5jk, 0);
        if (c110204xp != null) {
            c110204xp2 = c110204xp;
            C110204xp c110204xp3 = ClipsSharingDraftViewModel.A00(n6j).A08;
            if (c110204xp3 != null) {
                str3 = Long.valueOf(c110204xp3.A00).toString();
            } else {
                str3 = null;
            }
        }
        C6XJ A02 = C6XJ.A02(n6j.requireActivity(), ALh.A03(c22p, null, c110204xp2, c5jk, enumC189548aZ, null, pendingRecipient, str6, str2, null, null, null, str3, null, null, A0n, true, false), AbstractC166987dD.A0r(interfaceC09390do), ModalActivity.class, "clips_camera");
        if (C18U.A06(C06090Tz.A05, MSX.A0H(n6j, 0), 36321507630655002L)) {
            iArr = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
        }
        A02.A0J = iArr;
        A02.A0D(n6j, 9686);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x017b, code lost:
    
        if (X.C1LE.A0C(X.AbstractC166987dD.A0r(r3)) == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0M(X.N6J r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.A0M(X.N6J, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x023a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0268, code lost:
    
        if (r0.A08.A01() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0282, code lost:
    
        if (r1 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0291, code lost:
    
        if (r10.A1i.A01 == 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x029e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36329552104014228L) == false) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0N(X.N6J r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.A0N(X.N6J, java.lang.String, java.lang.String):void");
    }

    public static final void A0O(N6J n6j, String str, String str2, String str3, List list, boolean z) {
        EnumC31515Dsz enumC31515Dsz;
        C82G c82g;
        String str4;
        String str5;
        String str6;
        C47Z A04 = NJR.A04(n6j);
        if (A04 != null && n6j.getContext() != null && ClipsSharingDraftViewModel.A02(n6j)) {
            C128175qm A00 = ClipsSharingDraftViewModel.A00(n6j);
            List list2 = A00.A0r;
            boolean z2 = false;
            if (list2 != null && AbstractC166987dD.A1b(list2)) {
                C9RL A002 = C9OT.A00(AbstractC166987dD.A0r(n6j.A0U));
                A002.A01.addAll(list2);
                A002.A00 = true;
            }
            InterfaceC09390do interfaceC09390do = n6j.A0U;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            NJL njl = n6j.A04;
            if (njl == null) {
                str5 = "dependencyProvider";
            } else {
                ClipsFanClubMetadata A003 = F19.A00(A0r, A04, njl.A0Y, njl.A0Z);
                if (A003 != null) {
                    enumC31515Dsz = A003.A00;
                } else {
                    enumC31515Dsz = null;
                }
                if (enumC31515Dsz == EnumC31515Dsz.A06) {
                    C128175qm A004 = ClipsSharingDraftViewModel.A00(n6j);
                    if (A04.A1V.A00(C5JI.A04) != null || A004.A0N != null) {
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                        C57525Pfz A005 = C57525Pfz.A00(n6j, 3);
                        C14360o3.A0B(A0r2, 1);
                        C193328hC A0O = AbstractC31175DnJ.A0O(n6j);
                        A0O.A0A(2131961975);
                        A0O.A0a(new DialogInterfaceOnClickListenerC35455FkC(13, n6j, A0r2), AbstractC25227BEk.A0v(n6j, 2131961973), AbstractC25227BEk.A0v(n6j, 2131976507));
                        DialogInterfaceOnClickListenerC55321Ogj.A01(A0O, n6j, A005, 28, 2131961974);
                        A0O.A0t(false);
                        AbstractC166987dD.A1W(A0O);
                        C99694dm A006 = AbstractC99684dl.A00(A0r2);
                        String A007 = AbstractC111324zv.A00(515);
                        String str7 = A0r2.userId;
                        C14360o3.A0B(str7, 0);
                        long A03 = AbstractC167027dH.A03(str7);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A006.A00, "ig_fan_club_exclusive_reel_music_attempted");
                        A0f.A9K("creator_igid", Long.valueOf(A03));
                        AbstractC31171DnF.A1I(A0f, A007);
                        A0f.Cht();
                        return;
                    }
                }
                C23031Ai A008 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do));
                if (A04.A1F == EnumC76383bi.A07) {
                    z2 = true;
                }
                boolean A1U = AbstractC167007dF.A1U(A008);
                if (list != null && !list.isEmpty() && A008.A01.getInt("clips_funded_content_confirmation_dialog_view_count", A1U ? 1 : 0) < 3 && !z2 && ((str6 = A00.A0X) == null || str6.length() == 0)) {
                    Context requireContext = n6j.requireContext();
                    C23031Ai A009 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do));
                    DialogInterfaceOnClickListenerC55277Ofs dialogInterfaceOnClickListenerC55277Ofs = new DialogInterfaceOnClickListenerC55277Ofs(str2, n6j, 3);
                    DialogInterfaceOnClickListenerC55289OgA dialogInterfaceOnClickListenerC55289OgA = new DialogInterfaceOnClickListenerC55289OgA(A00, n6j, str, str3, A1U ? 1 : 0, z);
                    C14360o3.A0B(A009, 1);
                    AbstractC50522MSa.A1T(A009.A01, "clips_funded_content_confirmation_dialog_view_count", A1U ? 1 : 0);
                    C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                    A0I.A0A(2131955382);
                    A0I.A09(2131955380);
                    A0I.A0J(dialogInterfaceOnClickListenerC55277Ofs, 2131955381);
                    AbstractC31176DnK.A16(dialogInterfaceOnClickListenerC55289OgA, A0I, 2131955403);
                    return;
                }
                if (A04.A12 == null && !A04.A5i) {
                    AnonymousClass857 anonymousClass857 = n6j.A00;
                    if (anonymousClass857 == null) {
                        str5 = "brandedContentTaggingUpsellController";
                    } else {
                        UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                        Context requireContext2 = n6j.requireContext();
                        if (str == null) {
                            str4 = "";
                        } else {
                            str4 = str;
                        }
                        List list3 = A04.A4C;
                        if (list3 == null) {
                            list3 = AbstractC166987dD.A1E();
                        }
                        if (anonymousClass857.A04(requireContext2, new DialogInterfaceOnClickListenerC55277Ofs(str, n6j, 4), new DialogInterfaceOnClickListenerC55289OgA(A00, n6j, str, str3, 1, z), A0r3, str4, "reel", list3)) {
                            return;
                        }
                    }
                }
                PGB pgb = new PGB(A00, n6j, str, str3, z);
                if (A0R(n6j)) {
                    c82g = C82G.A0T;
                } else {
                    c82g = C82G.A0O;
                }
                if (!n6j.A0Q(c82g, pgb)) {
                    AbstractC226999zv.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(n6j.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), C05F.A0C);
                    A0D(A00, n6j, str, str3, z);
                    return;
                }
                return;
            }
            C14360o3.A0F(str5);
            throw C00O.createAndThrow();
        }
    }

    private final boolean A0Q(C82G c82g, InterfaceC57990Pna interfaceC57990Pna) {
        String str;
        OMW omw;
        Object obj;
        AbstractC53470Nkx abstractC53470Nkx = (AbstractC53470Nkx) A06(this).A0h.A01.getValue();
        C47Z A04 = NJR.A04(this);
        if (A04 != null && (abstractC53470Nkx instanceof C52486NKe)) {
            C51674Ms5 c51674Ms5 = (C51674Ms5) A06(this).A0i.A08.getValue();
            UserSession A0r = AbstractC166987dD.A0r(this.A0U);
            C52486NKe c52486NKe = (C52486NKe) abstractC53470Nkx;
            C51760Mtj c51760Mtj = (C51760Mtj) A06(this).A0i.A06.getValue();
            Integer num = c51674Ms5.A02;
            Integer num2 = C05F.A00;
            boolean A1X = AbstractC167007dF.A1X(num, num2);
            boolean A1X2 = AbstractC167007dF.A1X(num, C05F.A0Y);
            MYO A02 = C55183Odo.A02(A04);
            String str2 = this.A0g;
            C14360o3.A0B(A0r, 1);
            AbstractC25233BEq.A0y(2, c52486NKe, A02, str2);
            C201848wH c201848wH = c52486NKe.A00;
            Object obj2 = null;
            if (c201848wH != null) {
                str = c201848wH.getOptionalStringField(6, "client_session_id");
            } else {
                str = null;
            }
            if ((!C200108tF.A03(null, A0r) || (c51760Mtj != null && c51760Mtj.A00 != null)) && ((!C173057nJ.A00.A00(A0r, true) || (c51760Mtj != null && c51760Mtj.A01 != null)) && str != null && (omw = (OMW) c52486NKe.A02.get(c82g.toString())) != null)) {
                Boolean valueOf = Boolean.valueOf(c51674Ms5.A04);
                Boolean valueOf2 = Boolean.valueOf(c51674Ms5.A05);
                if (c51760Mtj != null) {
                    obj = c51760Mtj.A00;
                } else {
                    obj = null;
                }
                Boolean valueOf3 = Boolean.valueOf(obj instanceof C52740NVi);
                if (c51760Mtj != null) {
                    obj2 = c51760Mtj.A01;
                }
                if (AbstractC200098tE.A02(c82g, new C206319Bo(valueOf, valueOf2, valueOf3, Boolean.valueOf(obj2 instanceof C52740NVi), Boolean.valueOf(A1X), Boolean.valueOf(A1X2), (Boolean) null, 192), A0r, null, omw, str)) {
                    C35038FcB A00 = FXY.A00(A0r);
                    A00.A02(getActivity(), num2, getModuleName(), omw.A03());
                    A00.A01(this);
                    C55011OVw c55011OVw = new C55011OVw(c82g, omw.A01(), A02, str2, getModuleName(), null, null, A00.A00);
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        C54804OJy c54804OJy = new C54804OJy(activity, c55011OVw.A01, A0r);
                        c54804OJy.A06 = c55011OVw;
                        c54804OJy.A05 = null;
                        c54804OJy.A01 = this;
                        c54804OJy.A05 = interfaceC57990Pna;
                        AbstractC54219Nxx.A00(A0r, c201848wH, c54804OJy);
                        omw.A05(c54804OJy.A00());
                        A2M.A00(c82g, A0r, new CXPNoticeStateRepository(A0r, num2), omw);
                    }
                    A06(this).A0h.A08();
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0R(N6J n6j) {
        NJL njl = n6j.A04;
        if (njl == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        return njl.A0b;
    }

    public final UserSession A0S() {
        return AbstractC166987dD.A0r(this.A0U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r1 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0T(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.A0T(java.lang.String):void");
    }

    @Override // X.InterfaceC58038PoO
    public final void APl() {
        C6WQ c6wq;
        C6WQ c6wq2 = this.A0A;
        if (c6wq2 != null && c6wq2.isShowing() && (c6wq = this.A0A) != null) {
            c6wq.dismiss();
        }
    }

    @Override // X.InterfaceC58144Pq9
    public final void DhQ() {
        String str;
        OFX ofx = this.A06;
        if (ofx != null) {
            AbstractC13880nE.A0O(ofx.A0A);
            this.A0C = AbstractC166997dE.A0o();
            OFX ofx2 = this.A06;
            if (ofx2 != null) {
                String A0g = AbstractC167007dF.A0g(ofx2.A0A);
                InterfaceC09390do interfaceC09390do = this.A0U;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36325046683316900L)) {
                    MSX.A0K(this).A1e(C81W.A08, this.A0C);
                    C28198Cbv c28198Cbv = C28198Cbv.A00;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    FragmentActivity requireActivity = requireActivity();
                    C47Z A04 = NJR.A04(this);
                    if (A04 == null || (str = A04.A2X) == null) {
                        str = "";
                    }
                    c28198Cbv.A00(requireActivity, A0r, C05F.A0Y, str, A0g, null, "", C57525Pfz.A00(this, 2), new C30481DbQ(this, 17), false, false);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58038PoO
    public final void Elv() {
        C6WQ c6wq = this.A0A;
        if (c6wq != null) {
            if (c6wq.isShowing()) {
                C0w9.A03(__redex_internal_original_name, "Attempting to show progress dialog when already showing.");
            }
            C6WQ c6wq2 = this.A0A;
            if (c6wq2 != null) {
                AbstractC31176DnK.A13(requireContext(), c6wq2);
            }
            C6WQ c6wq3 = this.A0A;
            if (c6wq3 != null) {
                C0fJ.A00(c6wq3);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0U);
    }

    public N6J() {
        C0YZ A1D = AbstractC25225BEi.A1D(C31795DyF.class);
        this.A0Q = AbstractC25225BEi.A0a(C57525Pfz.A00(this, 7), C57525Pfz.A00(this, 8), MSW.A1G(this, null, 23), A1D);
        this.A0C = "";
        this.A0P = AbstractC166987dD.A1H();
        this.A0S = AbstractC09440dt.A01(C57525Pfz.A00(this, 4));
        this.A0T = AbstractC09440dt.A01(C57355PdF.A00);
        this.A0d = new NAp(this, 1);
        this.A0Z = C56035Ou7.A00(this, 38);
        this.A0V = C56035Ou7.A00(this, 34);
        this.A0c = C56035Ou7.A00(this, 41);
        this.A0b = C56035Ou7.A00(this, 40);
        this.A0W = C56035Ou7.A00(this, 35);
        this.A0B = "";
        this.A0N = new C55346Oi6(this, 7);
        this.A0R = AbstractC25225BEi.A0a(C57525Pfz.A00(this, 9), C57522Pfw.A00(this, 48), MSW.A1G(this, null, 24), AbstractC25225BEi.A1D(C50874Me5.class));
        this.A0f = C3I7.A01(this, false, true);
        this.A0e = new C56177Owk(this, 3);
        this.A0X = C56035Ou7.A00(this, 36);
        this.A0U = AbstractC60492pY.A02(this);
        this.A0Y = C56035Ou7.A00(this, 37);
        this.A0a = C56035Ou7.A00(this, 39);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A09() {
        /*
            r7 = this;
            X.47Z r2 = X.NJR.A04(r7)
            if (r2 == 0) goto La4
            X.0do r5 = r7.A0U
            com.instagram.common.session.UserSession r6 = X.AbstractC166987dD.A0r(r5)
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r5)
            X.NJL r0 = r7.A04
            if (r0 != 0) goto L1e
            java.lang.String r2 = "dependencyProvider"
        L16:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1e:
            boolean r1 = r0.A0Y
            boolean r0 = r0.A0Z
            com.instagram.clips.model.metadata.ClipsFanClubMetadata r1 = X.F19.A00(r3, r2, r1, r0)
            r4 = 1
            X.C14360o3.A0B(r6, r4)
            r2.A11 = r1
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r6)
            X.17P r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r3 = r0.B4O()
            if (r3 == 0) goto La7
            if (r1 == 0) goto La5
            X.Dsz r1 = r1.A00
        L3c:
            X.Dsz r0 = X.EnumC31515Dsz.A06
            if (r1 != r0) goto La7
            X.3bi r1 = X.EnumC76383bi.A07
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r2.A1F = r1
            java.lang.String r0 = r3.getFanClubId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L50:
            r2.A2q = r0
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r5)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            boolean r0 = X.C55220Oej.A05(r0)
            X.C14360o3.A0B(r1, r4)
            if (r0 != 0) goto L7c
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r1)
            boolean r0 = X.C55220Oej.A08(r0)
            if (r0 == 0) goto L7c
            java.lang.Boolean r0 = X.AbstractC54310NzU.A00(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7c
            r2.A6E = r4
            X.AbstractC37670Gi3.A0g(r7, r1, r4, r4)
        L7c:
            X.OFX r0 = r7.A06
            java.lang.String r2 = "viewHolder"
            if (r0 == 0) goto L16
            X.OF9 r0 = r0.A08
            com.instagram.igds.components.button.IgdsButton r1 = r0.A06
            r0 = 0
            r1.setVisibility(r0)
            X.OFX r0 = r7.A06
            if (r0 == 0) goto L16
            android.view.View r3 = r0.A00
            X.OF9 r0 = r0.A08
            com.instagram.igds.components.button.IgdsButton r2 = r0.A07
            com.instagram.igds.components.button.IgdsButton r1 = r0.A06
            X.AbstractC167017dG.A1R(r2, r1)
            r0 = 8
            r3.setVisibility(r0)
            r2.setEnabled(r4)
            r1.setEnabled(r4)
        La4:
            return
        La5:
            r1 = 0
            goto L3c
        La7:
            r0 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.A09():void");
    }

    public static final void A0A(Intent intent, N6J n6j, int i) {
        C54818OKt A04;
        FragmentActivity activity = n6j.getActivity();
        if (activity != null) {
            activity.setResult(i, intent);
            activity.finish();
        }
        if (i == 0 && (A04 = A04(n6j)) != null) {
            A04.A01(AbstractC167007dF.A1X(A02(n6j), EnumC53133Nem.A03));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0F(X.N6J r9) {
        /*
            X.47Z r1 = X.NJR.A04(r9)
            if (r1 == 0) goto L35
            X.NJR r0 = A06(r9)
            X.NK1 r4 = r0.A0U
            java.lang.String r3 = r1.A3t
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.Mtd r0 = r4.A04()
            java.util.List r0 = r0.A0W
            if (r0 == 0) goto L35
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        L22:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            X.AbstractC50522MSa.A1Z(r2, r1)
            goto L22
        L2c:
            com.instagram.common.session.UserSession r0 = r4.A01
            X.8Px r0 = X.AbstractC186788Pv.A00(r0)
            r0.A01(r3, r2)
        L35:
            X.47Z r3 = X.NJR.A04(r9)
            X.0do r4 = r9.A0U
            com.instagram.common.session.UserSession r5 = X.AbstractC166987dD.A0r(r4)
            r7 = 1
            X.C14360o3.A0B(r5, r7)
            X.1Ai r2 = X.AbstractC23021Ah.A00(r5)
            if (r3 == 0) goto L52
            X.H2v r0 = r3.A0v
            if (r0 == 0) goto L52
            java.lang.Integer r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L53
        L52:
            r0 = 0
        L53:
            r2.A1J(r0)
            if (r3 == 0) goto L77
            X.22P r1 = r3.A0i
            X.22P r0 = X.C22P.A43
            if (r1 != r0) goto L77
            X.1Ai r1 = X.AbstractC23021Ah.A00(r5)
            X.0ry r0 = r1.A6h
            X.0YR[] r3 = X.C23031Ai.A8c
            r2 = 192(0xc0, float:2.69E-43)
            boolean r0 = X.AbstractC167017dG.A1b(r1, r0, r3, r2)
            if (r0 != 0) goto L77
            X.1Ai r1 = X.AbstractC23021Ah.A00(r5)
            X.0ry r0 = r1.A6h
            X.AbstractC167007dF.A1L(r1, r0, r3, r2, r7)
        L77:
            X.47Z r8 = X.NJR.A04(r9)
            com.instagram.common.session.UserSession r6 = X.AbstractC166987dD.A0r(r4)
            X.0iw r5 = r9.A0O
            java.lang.String r4 = r9.A0g
            X.AbstractC25233BEq.A0v(r7, r6, r5, r4)
            if (r8 == 0) goto Led
            java.lang.String r3 = r8.A3t
            X.GzR r1 = r8.A0q
            r7 = 2
            X.C14360o3.A0B(r3, r7)
            boolean r0 = X.AbstractC199308rX.A03(r6)
            if (r0 == 0) goto Lb5
            if (r1 == 0) goto Lb0
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Lb0
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        La6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb2
            X.MSZ.A1S(r2, r1)
            goto La6
        Lb0:
            X.0sl r2 = X.C16930sl.A00
        Lb2:
            X.AbstractC55216Oef.A09(r5, r6, r4, r3, r2)
        Lb5:
            java.util.ArrayList r0 = r8.A43
            java.util.List r0 = X.AbstractC55225Oes.A07(r0)
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto Led
            boolean r0 = X.Ny2.A00(r6)
            if (r0 == 0) goto Led
            java.lang.String r3 = r8.A3t
            X.GzR r0 = r8.A0q
            X.C14360o3.A0B(r3, r7)
            if (r0 == 0) goto Le8
            java.lang.Object r0 = r0.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Le8
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        Lde:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lea
            X.MSZ.A1S(r2, r1)
            goto Lde
        Le8:
            X.0sl r2 = X.C16930sl.A00
        Lea:
            X.AbstractC55216Oef.A09(r5, r6, r4, r3, r2)
        Led:
            java.lang.String r0 = r9.getModuleName()
            r9.A0T(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.A0F(X.N6J):void");
    }

    public static final void A0G(N6J n6j) {
        C82G c82g;
        Handler A0J;
        Runnable runnableC36884GNf;
        Object value = A06(n6j).A0h.A01.getValue();
        C47Z A04 = NJR.A04(n6j);
        if (A04 != null) {
            if (value instanceof C52489NKh) {
                A0J = AbstractC167007dF.A0J();
                runnableC36884GNf = new RunnableC36883GNe(n6j, A04);
            } else if (value instanceof C52487NKf) {
                A0J = AbstractC167007dF.A0J();
                runnableC36884GNf = new RunnableC36884GNf(n6j, A04);
            } else {
                if (!(value instanceof C52486NKe)) {
                    return;
                }
                if (A0R(n6j)) {
                    c82g = C82G.A0S;
                } else {
                    c82g = C82G.A0N;
                }
                n6j.A0Q(c82g, null);
                return;
            }
            A0J.post(runnableC36884GNf);
        }
    }

    public static final void A0I(N6J n6j) {
        if (n6j.getContext() != null) {
            C55071OaR c55071OaR = n6j.A03;
            if (c55071OaR != null) {
                c55071OaR.A01 = null;
                c55071OaR.A06.clear();
            }
            OFX ofx = n6j.A06;
            if (ofx != null) {
                ofx.A07.A00.setVisibility(8);
                OFX ofx2 = n6j.A06;
                if (ofx2 != null) {
                    ofx2.A08.A00.setVisibility(0);
                    C9GR.A0B(n6j.getActivity(), "clips_publish_screen_caption_suggestions_fetch_failed");
                    return;
                }
            }
            C14360o3.A0F("viewHolder");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0P(X.N6J r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.A0P(X.N6J, boolean):void");
    }

    @Override // X.InterfaceC58144Pq9
    public final void D6H() {
        C65782Tu0 c65782Tu0;
        MSX.A0K(this).A1C(EnumC53380NjV.A09, C81X.A0f);
        InterfaceC09390do interfaceC09390do = this.A0U;
        AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do));
        if (A06(this).A0J.A04().A08 != null) {
            c65782Tu0 = new C65782Tu0(2131953911, 2131961909);
        } else {
            c65782Tu0 = null;
        }
        if (c65782Tu0 != null) {
            A03(this).ElY(c65782Tu0, null);
            return;
        }
        C140966Yy A0P = AbstractC31173DnH.A0P(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
        AnonymousClass548.A00().A00();
        A0P.A0B(null, AbstractC34044F0x.A00(ClipsSharingDraftViewModel.A00(this).A0O, A07(this), false));
        A0P.A04();
    }

    @Override // X.InterfaceC58144Pq9
    public final void D6K() {
        C22C A0K = MSX.A0K(this);
        A0K.A0F.A0V(null, C81X.A0g, "IG_CAMERA_CLIPS_SHARE_SHEET_ENTITY_TAP", true);
        C140966Yy A0P = AbstractC31173DnH.A0P(requireActivity(), AbstractC166987dD.A0r(this.A0U));
        AnonymousClass548.A00().A00();
        String A07 = A07(this);
        boolean z = ClipsSharingDraftViewModel.A00(this).A0x;
        C32266EJb c32266EJb = new C32266EJb();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("args_comment_prompt_text", A07);
        A0b.putBoolean("args_should_show_customized_action_bar", false);
        A0b.putBoolean("args_should_show_delete_prompt_button", z);
        AbstractC31175DnJ.A0t(A0b, c32266EJb, A0P);
    }

    @Override // X.InterfaceC58144Pq9
    public final void DKB() {
        MSX.A0K(this).A1Y(C81X.A18);
        OFX ofx = this.A06;
        if (ofx != null) {
            ofx.A0A.append("#");
            OFX ofx2 = this.A06;
            if (ofx2 != null) {
                ofx2.A0A.requestFocus();
                OFX ofx3 = this.A06;
                if (ofx3 != null) {
                    AbstractC13880nE.A0R(ofx3.A0A);
                    return;
                }
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (A0R(this)) {
            return "panavideo_share_sheet";
        }
        return "clips_share_sheet";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(1599214888);
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) activity).registerOnActivityResultListener(this.A0d);
        }
        C0f9.A09(1660973464, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            if (i == 9686) {
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(this.A0U), 36323311516396696L)) {
                    A0A(intent, this, i2);
                    return;
                }
                return;
            }
            return;
        }
        A03(this).onActivityResult(i, i2, intent);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        MSX.A0K(this).A1R(EnumC50631MWs.A0L, "SHARE_SHEET_CANCEL_BUTTON_TAP");
        ClipsSharingDraftViewModel A01 = A01(this);
        C9JS c9js = this.A01;
        if (A01.A07() && A01.A03().A0E == null && c9js != null) {
            AbstractC166987dD.A1Z(new PZO(c9js, A01, null, 6, false), AbstractC141776au.A00(A01));
        }
        boolean A1X = AbstractC167007dF.A1X(A02(this), EnumC53133Nem.A03);
        DialogInterfaceOnClickListenerC55319Ogh A00 = DialogInterfaceOnClickListenerC55319Ogh.A00(this, 41);
        InterfaceC09390do interfaceC09390do = this.A0U;
        O7Z A002 = AbstractC53937NtA.A00(AbstractC166987dD.A0r(interfaceC09390do));
        A002.A01.flowEndCancel(A002.A00, CancelReason.USER_CANCELLED);
        C8JY c8jy = this.A02;
        if (c8jy == null) {
            C14360o3.A0F("autoCreatedReelFlowsPerfLogger");
            throw C00O.createAndThrow();
        }
        c8jy.A02.flowMarkPoint(c8jy.A01, "REELS_SHARE_SHEET_BACK_BUTTON_TAPPED");
        if (A1X) {
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, A0r, 36328139059641558L)) {
                if (C18U.A06(c06090Tz, MSX.A0H(this, 0), 36321507630196243L)) {
                    AbstractC55109ObQ.A01(requireContext(), new ViewOnClickListenerC55462OkH(this, 53), new ViewOnClickListenerC55462OkH(this, 54), null, AbstractC166987dD.A0r(interfaceC09390do), C05F.A0C, A1X, false).A05(requireActivity());
                    return true;
                }
                Context requireContext = requireContext();
                UserSession A0H = MSX.A0H(this, 1);
                C193328hC A0I = AbstractC31171DnF.A0I(requireContext);
                A0I.A0A(2131973857);
                A0I.A09(2131973856);
                A0I.A0L(DialogInterfaceOnClickListenerC55321Ogj.A00(A00, A0H, 29), 2131973854);
                A0I.A0s(true);
                A0I.A0t(true);
                DialogInterfaceOnCancelListenerC55251OfP.A00(A0I, A0H, 3);
                A0I.A0H(DialogInterfaceOnClickListenerC55319Ogh.A00(A0H, 61), 2131973855);
                AbstractC166987dD.A1W(A0I);
                return true;
            }
        }
        A0A(null, this, 0);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(603349463);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0U;
        C183348Bh.A00(AbstractC183338Bg.A00(AbstractC166987dD.A0r(interfaceC09390do))).A04("launch_clips_share_sheet_end");
        C183348Bh.A00(AbstractC183338Bg.A00(AbstractC166987dD.A0r(interfaceC09390do))).A04("share_sheet_creation_start");
        Bundle requireArguments = requireArguments();
        this.A04 = new NJL(requireArguments, this, this.A0O, AbstractC166987dD.A0r(interfaceC09390do), this.A0g);
        this.A0L = requireArguments.getParcelableArrayList("ClipsConstants.ARGS_ALL_CLIPS_MEDIA_RECEIVERS_FROM_CHAT");
        this.A0K = requireArguments.getString("ClipsConstants.ARGS_SOURCE_CHAT_THREAD_NAME");
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 0);
        if (A0r.A00(C8ZN.class) == null) {
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            Object obj = new Object();
            C14360o3.A0B(A0r2, 0);
            A0r2.A04(C8ZN.class, obj);
        }
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(32);
        }
        this.A07 = (C50966MfZ) AbstractC31175DnJ.A0A(this).A00(C50966MfZ.class);
        this.A09 = (PromptStickerModel) requireArguments.getParcelable("ClipsConstants.ARGS_PROMPT_STICKER_MODEL");
        this.A05 = (C44448JlG) MSW.A0F(new C52277NBs(AbstractC25231BEo.A0L(this), AbstractC166987dD.A0r(interfaceC09390do)), requireActivity()).A00(C44448JlG.class);
        AbstractC31180DnO.A1F(requireActivity(), ((C50882MeD) AbstractC31175DnJ.A0A(this).A00(C50882MeD.class)).A00, new C57744PjX(this, 40), 68);
        setModuleNameV2(getModuleName());
        A01(this).A02.A06(requireActivity(), new C151846sU(new C44145JfA(this, 2)));
        this.A08 = (DirectCameraViewModel) requireArguments.getParcelable("ClipsConstants.ARG_DIRECT_CAMERA_VIEW_MODEL");
        this.A0F = requireArguments.getBoolean("ClipsConstants.ARGS_IS_POLL_STICKER_ADDED", false);
        this.A00 = new AnonymousClass857(requireActivity());
        this.A0J = new C8Y5(this, C8Y4.A04, AbstractC166987dD.A0r(interfaceC09390do));
        NJL njl = this.A04;
        if (njl == null) {
            str = "dependencyProvider";
        } else {
            njl.A01.EDN();
            this.A02 = C8JX.A00(AbstractC166987dD.A0r(interfaceC09390do));
            O7Z A00 = AbstractC53937NtA.A00(AbstractC166987dD.A0r(interfaceC09390do));
            C1QT c1qt = A00.A01;
            long flowStartForMarker = c1qt.flowStartForMarker(658054533, "post_reel", false);
            A00.A00 = flowStartForMarker;
            c1qt.flowAnnotate(flowStartForMarker, "share_sheet_type", "reels");
            MY1.A01(requireActivity(), A01(this).A03, this, 10);
            MY1.A01(requireActivity(), A01(this).A01, this, 11);
            C25671My A002 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
            A002.A01(this.A0Y, C56021Ots.class);
            A002.A01(this.A0a, C56023Otu.class);
            A002.A01(this.A0Z, C56003Ota.class);
            A002.A01(this.A0V, C56002OtZ.class);
            A002.A01(this.A0b, C8PB.class);
            A002.A01(this.A0c, C55982OtF.class);
            A002.A01(this.A0W, C211849aB.class);
            if (C18U.A06(C06090Tz.A05, MSX.A0H(this, 0), 36317332922766422L)) {
                AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01(this.A0X, C55983OtG.class);
            }
            NJL njl2 = this.A04;
            str = "dependencyProvider";
            if (njl2 != null) {
                njl2.A06();
                if (AbstractC50595MVg.A00(AbstractC166987dD.A0r(interfaceC09390do)) && requireArguments.getBoolean("ClipsConstants.ARGS_IS_POLL_STICKER_ADDED", false)) {
                    A0B(null, this, null);
                }
                if (C151866sW.A06(AbstractC166987dD.A0r(interfaceC09390do))) {
                    NJL njl3 = this.A04;
                    if (njl3 != null) {
                        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(njl3.A0Q);
                        AbstractC166987dD.A1Z(new MCC(A0Z, null, 43), AbstractC141776au.A00(A0Z));
                    }
                }
                C0f9.A09(-816906485, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(752553072);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_sharesheet_fragment, viewGroup, false);
        C0f9.A09(-1826904647, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        C31200Dnj c31200Dnj;
        C55071OaR c55071OaR;
        EnumC53358Nj9 enumC53358Nj9;
        String str2;
        C52484NKc c52484NKc;
        int A02 = C0f9.A02(-954439166);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A0U;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC11380iw interfaceC11380iw = this.A0O;
        C47Z A04 = NJR.A04(this);
        if (A04 == null || (str = A04.A2X) == null) {
            str = "";
        }
        C51674Ms5 A03 = OX6.A03(A06(this).A0i);
        Object value = A06(this).A0i.A03.A03.getValue();
        if ((value instanceof C52484NKc) && (c52484NKc = (C52484NKc) value) != null) {
            c31200Dnj = c52484NKc.A00;
        } else {
            c31200Dnj = null;
        }
        boolean A1R = AbstractC167007dF.A1R(0, A0r, interfaceC11380iw);
        int A07 = AbstractC25230BEn.A07(2, str, A03);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, A0r), "ig_reels_share_sheet_share_to_facebook_row_state");
        if (A0f.isSampled()) {
            A0f.A8R(AbstractC53936Nt9.A00(A03), "xpost_type");
            AbstractC166987dD.A1S(A0f, str);
            EnumC222416a A0I = AbstractC166997dE.A0Y(A0r).A0I();
            if (A0I != null) {
                int ordinal = A0I.ordinal();
                if (ordinal != A1R) {
                    if (ordinal != A07) {
                        if (ordinal == 2) {
                            enumC53358Nj9 = EnumC53358Nj9.PROFESSIONAL;
                        }
                    } else {
                        enumC53358Nj9 = EnumC53358Nj9.CREATOR;
                    }
                } else {
                    enumC53358Nj9 = EnumC53358Nj9.PERSONAL;
                }
                A0f.A8R(enumC53358Nj9, "user_type");
                A0f.AAP("surface", interfaceC11380iw.getModuleName());
                EnumC53359NjA enumC53359NjA = EnumC53359NjA.REELS_CCP_IS_ENABLED;
                C06090Tz c06090Tz = C06090Tz.A06;
                A0f.A9M("launcher_values", AbstractC167017dG.A0u(EnumC53359NjA.SERVICE_CACHE, Boolean.valueOf(A1R), AbstractC166987dD.A1L(enumC53359NjA, AbstractC166997dE.A0c(c06090Tz, A0r, 36314554078071485L)), AbstractC166987dD.A1L(EnumC53359NjA.REELS_CONTENT_ELIGIBILITY_PLATFORMIZATION, AbstractC166997dE.A0c(c06090Tz, A0r, 36316598482702875L)), AbstractC166987dD.A1L(EnumC53359NjA.REELS_XAR_IS_ENABLED, AbstractC166997dE.A0c(c06090Tz, A0r, 36313110969190178L))));
                A0f.A9M("client_user_state_values", AbstractC06930Yk.A06(AbstractC166987dD.A1L(EnumC53364NjF.CCP_LAST_CHANGE, String.valueOf(C200108tF.A00(A0r))), AbstractC166987dD.A1L(EnumC53364NjF.FBLINKED, String.valueOf(MSZ.A1X(C196068lw.A00(A0r), "ClipsShareToFacebookLoggerUtil"))), AbstractC166987dD.A1L(EnumC53364NjF.USER_AUTO_CCP_SETTINGS, String.valueOf(C200108tF.A06(A0r))), AbstractC166987dD.A1L(EnumC53364NjF.USER_AUTO_XAR_SETTINGS, String.valueOf(AbstractC46542Bs.A00(A0r).A0C())), AbstractC166987dD.A1L(EnumC53364NjF.XAR_LAST_CHANGE, String.valueOf(AbstractC31175DnJ.A03(AbstractC46542Bs.A00(A0r).A04, "PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS")))));
                str2 = null;
                if (AbstractC53936Nt9.A00(A03) != EnumC53357Nj8.CCP && c31200Dnj != null) {
                    str2 = c31200Dnj.A00;
                }
                A0f.AAP("hide_reason", str2);
                A0f.Cht();
            }
            enumC53358Nj9 = EnumC53358Nj9.UNKNOWN;
            A0f.A8R(enumC53358Nj9, "user_type");
            A0f.AAP("surface", interfaceC11380iw.getModuleName());
            EnumC53359NjA enumC53359NjA2 = EnumC53359NjA.REELS_CCP_IS_ENABLED;
            C06090Tz c06090Tz2 = C06090Tz.A06;
            A0f.A9M("launcher_values", AbstractC167017dG.A0u(EnumC53359NjA.SERVICE_CACHE, Boolean.valueOf(A1R), AbstractC166987dD.A1L(enumC53359NjA2, AbstractC166997dE.A0c(c06090Tz2, A0r, 36314554078071485L)), AbstractC166987dD.A1L(EnumC53359NjA.REELS_CONTENT_ELIGIBILITY_PLATFORMIZATION, AbstractC166997dE.A0c(c06090Tz2, A0r, 36316598482702875L)), AbstractC166987dD.A1L(EnumC53359NjA.REELS_XAR_IS_ENABLED, AbstractC166997dE.A0c(c06090Tz2, A0r, 36313110969190178L))));
            A0f.A9M("client_user_state_values", AbstractC06930Yk.A06(AbstractC166987dD.A1L(EnumC53364NjF.CCP_LAST_CHANGE, String.valueOf(C200108tF.A00(A0r))), AbstractC166987dD.A1L(EnumC53364NjF.FBLINKED, String.valueOf(MSZ.A1X(C196068lw.A00(A0r), "ClipsShareToFacebookLoggerUtil"))), AbstractC166987dD.A1L(EnumC53364NjF.USER_AUTO_CCP_SETTINGS, String.valueOf(C200108tF.A06(A0r))), AbstractC166987dD.A1L(EnumC53364NjF.USER_AUTO_XAR_SETTINGS, String.valueOf(AbstractC46542Bs.A00(A0r).A0C())), AbstractC166987dD.A1L(EnumC53364NjF.XAR_LAST_CHANGE, String.valueOf(AbstractC31175DnJ.A03(AbstractC46542Bs.A00(A0r).A04, "PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS")))));
            str2 = null;
            if (AbstractC53936Nt9.A00(A03) != EnumC53357Nj8.CCP) {
                str2 = c31200Dnj.A00;
            }
            A0f.AAP("hide_reason", str2);
            A0f.Cht();
        }
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
        A00.A02(this.A0Y, C56021Ots.class);
        A00.A02(this.A0a, C56023Otu.class);
        A00.A02(this.A0Z, C56003Ota.class);
        A00.A02(this.A0V, C56002OtZ.class);
        A00.A02(this.A0b, C8PB.class);
        A00.A02(this.A0c, C55982OtF.class);
        A00.A02(this.A0W, C211849aB.class);
        if (C18U.A06(C06090Tz.A05, MSX.A0H(this, 0), 36317332922766422L)) {
            AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(this.A0X, C55983OtG.class);
        }
        if (A02(this) == EnumC53133Nem.A03) {
            MSX.A0K(this).A0W();
            AnonymousClass229.A02(AbstractC166987dD.A0r(interfaceC09390do));
        }
        NJL njl = this.A04;
        if (njl == null) {
            MSW.A1K();
            throw C00O.createAndThrow();
        }
        njl.A01.F9a();
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) activity).unregisterOnActivityResultListener(this.A0d);
        }
        A06(this).A0L.A00 = null;
        this.A01 = null;
        this.A0L = null;
        this.A09 = null;
        this.A0A = null;
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        if (C18U.A06(AbstractC166997dE.A0U(A0r2), A0r2, 36323453251169553L) && (c55071OaR = this.A03) != null) {
            c55071OaR.A01 = null;
            c55071OaR.A06.clear();
        }
        C0f9.A09(174232574, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r3), r3, 36323453251366164L) != false) goto L17;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            r6 = this;
            r0 = 173771604(0xa5b8b54, float:1.0570671E-32)
            int r5 = X.C0f9.A02(r0)
            super.onDestroyView()
            X.6WQ r0 = r6.A0A
            r1 = 1
            if (r0 == 0) goto L1c
            boolean r0 = r0.isShowing()
            if (r0 != r1) goto L1c
            X.6WQ r0 = r6.A0A
            if (r0 == 0) goto L1c
            r0.dismiss()
        L1c:
            X.NJL r0 = r6.A04
            if (r0 != 0) goto L28
            X.MSW.A1K()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L28:
            X.PqY r1 = r0.A01
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.A0F
            r1.F9U(r0)
            X.0do r4 = r6.A0U
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r4)
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36323453251169553(0x810bfd000d2d11, double:3.0344363266214426E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L57
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r4)
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36323453251366164(0x810bfd00102d14, double:3.03443632674578E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L61
        L57:
            X.3I9 r1 = r6.A0f
            r1.onStop()
            X.2ox r0 = r6.A0e
            r1.EFx(r0)
        L61:
            X.NJR r4 = A06(r6)
            X.NKN r1 = r4.A0L
            r0 = 0
            r1.A00 = r0
            com.instagram.common.session.UserSession r3 = r4.A07
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318033005320028(0x81070f0039175c, double:3.031008541320625E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L82
            X.NKO r0 = r4.A0S
            X.Ou9 r0 = r0.A00
            if (r0 == 0) goto L82
            r0.A01()
        L82:
            r0 = -1500530762(0xffffffffa68fb7b6, float:-9.972413E-16)
            X.C0f9.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6J.onDestroyView():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C55208OeM c55208OeM;
        int A02 = C0f9.A02(-1738646815);
        NJR A06 = A06(this);
        boolean z = this.A0G;
        if (A06.A0N.A03.A07() && !z) {
            NK9 nk9 = A06.A0I;
            nk9.A08(MSW.A15(nk9.A06));
        }
        TextureViewSurfaceTextureListenerC55357OiJ textureViewSurfaceTextureListenerC55357OiJ = A06.A0L.A00;
        if (textureViewSurfaceTextureListenerC55357OiJ != null && (c55208OeM = textureViewSurfaceTextureListenerC55357OiJ.A00) != null) {
            c55208OeM.A05();
        }
        super.onPause();
        C0f9.A09(-164160902, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C55208OeM c55208OeM;
        int A02 = C0f9.A02(685960980);
        TextureViewSurfaceTextureListenerC55357OiJ textureViewSurfaceTextureListenerC55357OiJ = A06(this).A0L.A00;
        if (textureViewSurfaceTextureListenerC55357OiJ != null && (c55208OeM = textureViewSurfaceTextureListenerC55357OiJ.A00) != null) {
            c55208OeM.A06();
        }
        super.onResume();
        C0f9.A09(1556544403, A02);
    }
}
