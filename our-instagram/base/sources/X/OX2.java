package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes9.dex */
public abstract class OX2 {
    public final InterfaceC58310Pt2 A03() {
        InterfaceC58310Pt2 interfaceC58310Pt2;
        if (this instanceof NJK) {
            interfaceC58310Pt2 = ((NJK) this).A06;
        } else {
            interfaceC58310Pt2 = ((NJL) this).A00;
        }
        if (interfaceC58310Pt2 != null) {
            return interfaceC58310Pt2;
        }
        C14360o3.A0F("publishScreenDelegate");
        throw C00O.createAndThrow();
    }

    public final AbstractC53643Nno A04() {
        AbstractC53643Nno abstractC53643Nno;
        if (this instanceof NJK) {
            abstractC53643Nno = ((NJK) this).A08;
        } else {
            abstractC53643Nno = ((NJL) this).A02;
        }
        if (abstractC53643Nno != null) {
            return abstractC53643Nno;
        }
        C14360o3.A0F("rowItemFactory");
        throw C00O.createAndThrow();
    }

    public final AbstractC50867Mdy A05() {
        AbstractC50867Mdy abstractC50867Mdy;
        if (this instanceof NJK) {
            abstractC50867Mdy = ((NJK) this).A09;
        } else {
            abstractC50867Mdy = ((NJL) this).A03;
        }
        if (abstractC50867Mdy != null) {
            return abstractC50867Mdy;
        }
        C14360o3.A0F("publishScreenViewModel");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.Object, X.O2i] */
    public final void A06() {
        PendingRecipient pendingRecipient;
        String str;
        String str2;
        if (this instanceof NJK) {
            NJK njk = (NJK) this;
            AbstractC59962oe abstractC59962oe = njk.A0G;
            Object requireContext = abstractC59962oe.requireContext();
            C14360o3.A0C(requireContext, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
            AnonymousClass840 Ak4 = ((InterfaceC189608af) requireContext).Ak4();
            C14360o3.A0B(Ak4, 0);
            njk.A00 = Ak4;
            njk.A01 = Ak4.A00();
            C1XJ c1xj = C1XJ.A00;
            UserSession userSession = njk.A0I;
            C52253NAt A0X = c1xj.A0X(userSession);
            njk.A0D = A0X;
            A0X.A01 = C6WI.A01().A0D;
            abstractC59962oe.registerLifecycleListener(A0X);
            if (C55183Odo.A00(njk.A07(), true) <= 3) {
                str2 = "base_64_img";
            } else {
                str2 = "upload_id";
            }
            njk.A0B = new ODM(userSession, str2, C55183Odo.A00(njk.A07(), true));
            C50991Mfy c50991Mfy = (C50991Mfy) MSW.A0F(new C52276NBr(userSession, C05F.A00), abstractC59962oe.requireActivity()).A00(C50991Mfy.class);
            C14360o3.A0B(c50991Mfy, 0);
            njk.A05 = c50991Mfy;
            C44547Jmr c44547Jmr = (C44547Jmr) MSW.A0F(new NCS(userSession, new KZH(), true), abstractC59962oe.requireActivity()).A00(C44547Jmr.class);
            FragmentActivity requireActivity = abstractC59962oe.requireActivity();
            Application A0L = AbstractC25231BEo.A0L(abstractC59962oe);
            AnonymousClass841 A07 = njk.A07();
            C52458NJc c52458NJc = new C52458NJc(abstractC59962oe.requireActivity(), userSession, njk.A07());
            InterfaceC09390do interfaceC09390do = njk.A0N;
            P0H p0h = (P0H) interfaceC09390do.getValue();
            InterfaceC11380iw interfaceC11380iw = njk.A0H;
            String str3 = njk.A0M;
            C22P c22p = njk.A0F;
            FragmentActivity requireActivity2 = abstractC59962oe.requireActivity();
            FragmentActivity requireActivity3 = abstractC59962oe.requireActivity();
            C50991Mfy c50991Mfy2 = njk.A05;
            if (c50991Mfy2 != null) {
                AbstractC50867Mdy abstractC50867Mdy = (AbstractC50867Mdy) MSW.A0F(new C52328NDr(A0L, requireActivity3, requireActivity2, c22p, interfaceC11380iw, userSession, A07, c44547Jmr, c52458NJc, p0h, c50991Mfy2, str3), requireActivity).A00(NJQ.class);
                C14360o3.A0B(abstractC50867Mdy, 0);
                njk.A09 = abstractC50867Mdy;
                AbstractC50867Mdy A05 = njk.A05();
                C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                njk.A03 = ((NJQ) A05).A03;
                C52458NJc A08 = njk.A08();
                A08.A03.EDa(new PMQ(A08));
                C56330Ozr c56330Ozr = new C56330Ozr(njk);
                AnonymousClass840 anonymousClass840 = njk.A00;
                if (anonymousClass840 != null) {
                    C52458NJc A082 = njk.A08();
                    AbstractC50867Mdy A052 = njk.A05();
                    C14360o3.A0C(A052, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                    njk.A02 = new C47705L4m(abstractC59962oe, userSession, anonymousClass840, c56330Ozr, A082, MSW.A1E(A052, 22));
                    C1XJ c1xj2 = C1XJ.A00;
                    Context requireContext2 = abstractC59962oe.requireContext();
                    AnonymousClass840 anonymousClass8402 = njk.A00;
                    if (anonymousClass8402 != null) {
                        C08790ch A00 = AbstractC018607g.A00(abstractC59962oe);
                        Context requireContext3 = abstractC59962oe.requireContext();
                        C50699MZu c50699MZu = njk.A0J;
                        njk.A0C = c1xj2.A09(requireContext2, A00, userSession, anonymousClass8402, new OJZ(requireContext3, userSession, njk.A07(), c50699MZu, C57525Pfz.A00(njk, 13), C57525Pfz.A00(njk, 14), new C57744PjX(njk, 47)));
                        njk.A04 = new C55904Ort(abstractC59962oe, userSession, njk.A07(), njk.A08(), njk.A09(), str3);
                        AbstractC50867Mdy A053 = njk.A05();
                        C14360o3.A0C(A053, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                        NJQ njq = (NJQ) A053;
                        C50991Mfy c50991Mfy3 = njk.A05;
                        if (c50991Mfy3 != null) {
                            InterfaceC58168PqY interfaceC58168PqY = njk.A07;
                            C14360o3.A0C(interfaceC58168PqY, "null cannot be cast to non-null type com.instagram.creation.publishscreen.fragment.feed.FeedShareSheetQPManager");
                            njk.A06 = new P0G(c22p, abstractC59962oe, userSession, njk, (P0J) interfaceC58168PqY, njq, c50991Mfy3, new Object());
                            njk.A0A = new C56725PFt(njk, 1);
                            InterfaceC58310Pt2 A03 = njk.A03();
                            AbstractC50867Mdy A054 = njk.A05();
                            C14360o3.A0C(A054, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                            NJQ njq2 = (NJQ) A054;
                            P0H p0h2 = (P0H) interfaceC09390do.getValue();
                            OWR owr = njk.A0K;
                            AnonymousClass841 A072 = njk.A07();
                            AnonymousClass840 anonymousClass8403 = njk.A00;
                            if (anonymousClass8403 != null) {
                                C47705L4m c47705L4m = njk.A02;
                                if (c47705L4m != null) {
                                    C55099ObA A09 = njk.A09();
                                    C52253NAt c52253NAt = njk.A0D;
                                    if (c52253NAt != null) {
                                        C55904Ort c55904Ort = njk.A04;
                                        if (c55904Ort != null) {
                                            ODM odm = njk.A0B;
                                            if (odm != null) {
                                                boolean z = njk.A0E.getBoolean("IS_FACEBOOK_SHARING_DISABLED");
                                                njk.A08 = new NJP(abstractC59962oe, interfaceC11380iw, userSession, anonymousClass8403, A072, c44547Jmr, c47705L4m, c55904Ort, njq2, A03, p0h2, new C54970OTc(abstractC59962oe.requireActivity(), userSession), owr, njk.A0L, odm, A09, c52253NAt, str3, z);
                                                AbstractC50867Mdy A055 = njk.A05();
                                                C14360o3.A0C(A055, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
                                                ((NJQ) A055).A0F(new PMT(njk));
                                                return;
                                            }
                                            str = "shopNetPerfLogger";
                                        } else {
                                            str = "tagProductsRowNavigator";
                                        }
                                    } else {
                                        str = "tagProductsTooltipController";
                                    }
                                } else {
                                    str = "addMusicRowViewController";
                                }
                            }
                        }
                    }
                }
                str = "cameraSession";
            }
            str = "clipsAudienceControlViewModel";
        } else {
            NJL njl = (NJL) this;
            if (njl.A09 == null) {
                boolean z2 = njl.A05.getBoolean("ClipsConstants.ARG_CLIPS_IS_FROM_DIRECT_TO_SHARE", false);
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("ARG_CLIPS_SHARE_SHEET_DRAFT_INFO_SESSION_ID is null; shareSheetMode = ");
                A1C.append(njl.A0R.getValue());
                A1C.append(", isClipsFromDraft = ");
                A1C.append(z2);
                A1C.append(", isPostEntryPoint = ");
                A1C.append(njl.A0b);
                C0w9.A03(N6J.__redex_internal_original_name, A1C.toString());
            }
            AbstractC59962oe abstractC59962oe2 = njl.A06;
            FragmentActivity requireActivity4 = abstractC59962oe2.requireActivity();
            Application A0L2 = AbstractC25231BEo.A0L(abstractC59962oe2);
            CallerContext callerContext = NJL.A0c;
            ClipsSharingDraftViewModel clipsSharingDraftViewModel = (ClipsSharingDraftViewModel) njl.A0S.getValue();
            C50997Mg4 c50997Mg4 = (C50997Mg4) njl.A0X.getValue();
            InterfaceC09390do interfaceC09390do2 = njl.A0O;
            C51022MgU c51022MgU = (C51022MgU) interfaceC09390do2.getValue();
            C50899MeU c50899MeU = (C50899MeU) njl.A0W.getValue();
            C44466JlY c44466JlY = (C44466JlY) njl.A0P.getValue();
            InterfaceC09390do interfaceC09390do3 = njl.A0D;
            C50991Mfy A0X2 = MSW.A0X(interfaceC09390do3);
            InterfaceC09390do interfaceC09390do4 = njl.A0G;
            C50994Mg1 c50994Mg1 = (C50994Mg1) interfaceC09390do4.getValue();
            InterfaceC09390do interfaceC09390do5 = njl.A0M;
            C50880MeB c50880MeB = (C50880MeB) interfaceC09390do5.getValue();
            InterfaceC09390do interfaceC09390do6 = njl.A0Q;
            C44475Jlh c44475Jlh = (C44475Jlh) interfaceC09390do6.getValue();
            UserSession userSession2 = njl.A08;
            C8B7 A002 = AbstractC173047nI.A00(userSession2);
            A002.A00(N6J.__redex_internal_original_name);
            FragmentActivity requireActivity5 = abstractC59962oe2.requireActivity();
            OVl oVl = (OVl) njl.A0E.getValue();
            C54818OKt c54818OKt = (C54818OKt) njl.A0H.getValue();
            InterfaceC09390do interfaceC09390do7 = njl.A0N;
            P0I p0i = (P0I) interfaceC09390do7.getValue();
            InterfaceC11380iw interfaceC11380iw2 = njl.A07;
            Bundle bundle = njl.A05;
            String string = bundle.getString("ClipsConstants.ARG_LINKED_HIGHLIGHT_ID");
            String string2 = bundle.getString("ClipsConstants.ARG_HIGHLIGHT_MEDIA_IDS");
            String str4 = njl.A0A;
            boolean z3 = njl.A0b;
            boolean z4 = njl.A0Y;
            boolean z5 = njl.A0Z;
            boolean z6 = njl.A0a;
            boolean z7 = bundle.getBoolean("ClipsConstants.ARG_CLIPS_COLLABORATORS_OVERWRITE");
            boolean z8 = bundle.getBoolean("ClipsConstants.ARGS_REMOVED_CLIPS_COLLABORATORS_FROM_CHAT");
            boolean z9 = bundle.getBoolean("ClipsConstants.ARGS_SHOW_COLLAB_EDUCATION_FLOW_PUBLISH_SCREEN", false);
            Parcelable parcelable = bundle.getParcelable("ClipsConstants.ARG_CLIPS_TARGET_GROUP_PROFILE");
            if (parcelable instanceof PendingRecipient) {
                pendingRecipient = (PendingRecipient) parcelable;
            } else {
                pendingRecipient = null;
            }
            NJR njr = (NJR) MSW.A0F(new C52331NDu(A0L2, requireActivity5, callerContext, c44475Jlh, c44466JlY, c50880MeB, interfaceC11380iw2, userSession2, clipsSharingDraftViewModel, A0X2, oVl, c54818OKt, c50994Mg1, p0i, c51022MgU, c50899MeU, c50997Mg4, A002, pendingRecipient, string, string2, str4, z3, z4, z5, z6, z7, z8, z9, bundle.getBoolean("ClipsConstants.ARGS_HAS_STORIES_TEMPLATE")), requireActivity4).A00(NJR.class);
            C14360o3.A0B(njr, 0);
            njl.A04 = njr;
            njl.A03 = njr;
            FragmentActivity requireActivity6 = abstractC59962oe2.requireActivity();
            NJR njr2 = njl.A04;
            if (njr2 != null) {
                C44475Jlh c44475Jlh2 = (C44475Jlh) interfaceC09390do6.getValue();
                C50991Mfy A0X3 = MSW.A0X(interfaceC09390do3);
                InterfaceC09390do interfaceC09390do8 = njl.A0K;
                njl.A00 = new P0F(requireActivity6, c44475Jlh2, interfaceC11380iw2, userSession2, (O7X) njl.A0I.getValue(), A0X3, (C54970OTc) interfaceC09390do8.getValue(), njr2, (C54816OKr) njl.A0T.getValue());
                NJR njr3 = njl.A04;
                if (njr3 != null) {
                    C50991Mfy A0X4 = MSW.A0X(interfaceC09390do3);
                    C50985Mfs c50985Mfs = (C50985Mfs) njl.A0B.getValue();
                    C51022MgU c51022MgU2 = (C51022MgU) interfaceC09390do2.getValue();
                    C50880MeB c50880MeB2 = (C50880MeB) interfaceC09390do5.getValue();
                    C50994Mg1 c50994Mg12 = (C50994Mg1) interfaceC09390do4.getValue();
                    njl.A02 = new NJO((C50965MfY) njl.A0V.getValue(), abstractC59962oe2, (C44475Jlh) interfaceC09390do6.getValue(), c50880MeB2, (C25862BcH) njl.A0U.getValue(), c50985Mfs, interfaceC11380iw2, userSession2, A0X4, njl.A03(), (P0I) interfaceC09390do7.getValue(), (P0K) njl.A0J.getValue(), (C54970OTc) interfaceC09390do8.getValue(), c50994Mg12, njr3, c51022MgU2);
                    return;
                }
            }
            str = "clipsPublishScreenViewModel";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static NJQ A01(OX2 ox2) {
        AbstractC50867Mdy A05 = ox2.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.creation.publishscreen.viewmodel.FeedPublishScreenViewModel");
        return (NJQ) A05;
    }

    public static C47Z A02(NJK njk) {
        return njk.A08().A04();
    }
}
