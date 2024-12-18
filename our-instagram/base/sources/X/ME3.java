package X;

import android.content.Context;
import android.os.Bundle;
import android.os.FileObserver;
import android.util.SparseArray;
import android.webkit.URLUtil;
import androidx.fragment.app.FragmentActivity;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.ClipsSoundSyncMediaImportRepository;
import com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes8.dex */
public final class ME3 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ME3(String str, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v107, types: [X.0iw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [X.0iw, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession;
        String str;
        String str2;
        HashMap hashMap;
        InterfaceC37169GZg interfaceC37169GZg;
        String str3;
        InterfaceC16660sJ interfaceC16660sJ;
        long j;
        long j2;
        Long A0j;
        Long A0j2;
        Long A0j3;
        switch (this.A00) {
            case 0:
                ((C5yI) this.A01).DQJ(this.A02);
                return C0eB.A00;
            case 1:
            case 3:
                ((C5yI) this.A01).Djq(this.A02);
                return C0eB.A00;
            case 2:
            case 6:
            case 7:
                ((C5yI) this.A01).DMS(this.A02);
                return C0eB.A00;
            case 4:
                ((C5yI) this.A01).DKg(this.A02);
                return C0eB.A00;
            case 5:
                ((C5yI) this.A01).DwJ(this.A02);
                return C0eB.A00;
            case 8:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 17:
            case 28:
            case 33:
            case 38:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            default:
                ((InterfaceC16660sJ) this.A01).invoke(this.A02);
                return C0eB.A00;
            case 9:
            case Process.SIGTERM /* 15 */:
                str2 = "instance";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 10:
            case 16:
                return C0eB.A00;
            case 14:
                String str4 = this.A02;
                Iterable iterable = (Iterable) this.A01;
                if (str4.length() != 0) {
                    return str4;
                }
                if (iterable != null) {
                    return AbstractC25226BEj.A1H(" ", iterable, MJ9.A00);
                }
                return "";
            case 18:
                AbstractC166987dD.A11(this.A02).delete();
                ((CountDownLatch) this.A01).countDown();
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                C26421Bm4 c26421Bm4 = (C26421Bm4) this.A01;
                String str5 = this.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c26421Bm4.A00), "ig_creator_comment_quick_reply_pill_tap");
                if (A0f.isSampled()) {
                    String str6 = c26421Bm4.A03;
                    long j3 = 0;
                    if (str6 != null && (A0j3 = AbstractC166997dE.A0j(str6)) != null) {
                        j = A0j3.longValue();
                    } else {
                        j = 0;
                    }
                    AbstractC25230BEn.A1B(A0f, j);
                    String str7 = c26421Bm4.A02;
                    if (str7 != null && (A0j2 = AbstractC166997dE.A0j(str7)) != null) {
                        j2 = A0j2.longValue();
                    } else {
                        j2 = 0;
                    }
                    A0f.A9K("media_author_id", Long.valueOf(j2));
                    String str8 = c26421Bm4.A01;
                    if (str8 != null && (A0j = AbstractC166997dE.A0j(str8)) != null) {
                        j3 = A0j.longValue();
                    }
                    A0f.A9K("comment_id", Long.valueOf(j3));
                    AbstractC25232BEp.A1L(A0f, "quick_reply", str5);
                }
                return C0eB.A00;
            case 20:
                String str9 = this.A02;
                if (str9 != null && str9.length() != 0) {
                    ((C6WQ) this.A01).A00(str9);
                }
                return C0eB.A00;
            case 21:
                C26738BrJ c26738BrJ = (C26738BrJ) this.A01;
                FragmentActivity activity = c26738BrJ.getActivity();
                if (activity != null) {
                    InterfaceC09390do interfaceC09390do = c26738BrJ.A0D;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    String str10 = this.A02;
                    C14360o3.A0A(str10);
                    String A15 = AbstractC25225BEi.A15(c26738BrJ.A05);
                    Number A0t = AbstractC43592JPx.A0t(c26738BrJ.A03);
                    String A152 = AbstractC25225BEi.A15(c26738BrJ.A02);
                    InterfaceC09390do interfaceC09390do2 = c26738BrJ.A09;
                    String A153 = AbstractC25225BEi.A15(interfaceC09390do2);
                    AbstractC167017dG.A1N(A0r, str10);
                    C14360o3.A0B(A153, 5);
                    InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0r), "instagram_media_note_likers_list_impression_client");
                    Long A00 = BSo.A00(A0r, A153);
                    if (A0f2.isSampled() && A00 != null) {
                        A0f2.A9K("note_id", A00);
                        A0f2.AAP("container_module", str10);
                        A0f2.A9K("carousel_index", AbstractC25234BEr.A0X(A0f2, A0t, "inventory_source", A15));
                        AbstractC25233BEq.A17(A0f2, "carousel_media_id", A152);
                        A0f2.Cht();
                    }
                    AbstractC31177DnL.A0n(activity, AbstractC31178DnM.A06("CONTENT_NOTE_ID_ARGUMENT", interfaceC09390do2.getValue()), AbstractC166987dD.A0o(interfaceC09390do), ModalActivity.class, "note_reactions");
                }
                return C0eB.A00;
            case 22:
                AnonymousClass229.A01((UserSession) this.A01).A01.A01(this.A02);
                return C0eB.A00;
            case 23:
                C49602Pt c49602Pt = (C49602Pt) ((ClipsSoundSyncMediaImportRepository) this.A01).A0B.getValue();
                String str11 = this.A02;
                AbstractC167017dG.A1N(c49602Pt, str11);
                File file = new File(c49602Pt.A01(), str11);
                AbstractC189888b7.A00(file);
                return file;
            case 24:
                userSession = ((C54636OBl) this.A01).A00;
                return AbstractC31176DnK.A0O(userSession, this.A02);
            case 25:
                userSession = ((C54637OBm) this.A01).A00;
                return AbstractC31176DnK.A0O(userSession, this.A02);
            case 26:
                ClipsNetworkImportDraftRepository.A02((ClipsNetworkImportDraftRepository) this.A01, this.A02);
                return C0eB.A00;
            case 27:
                ((L66) this.A01).A00(this.A02);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                N6O n6o = (N6O) this.A01;
                return new C50851Mdi(n6o.requireActivity(), n6o.requireActivity(), AbstractC166987dD.A0r(n6o.A04), this.A02);
            case 30:
                String str12 = this.A02;
                if (str12 != null && (interfaceC16660sJ = (InterfaceC16660sJ) this.A01) != null) {
                    interfaceC16660sJ.invoke(str12);
                }
                return C0eB.A00;
            case 31:
                BP5.A00(new BP5((UserSession) this.A01, null), AbstractC37302Gc3.A0V(this.A02), "story_reply_learn_more_click");
                return C0eB.A00;
            case 32:
                C4A7 c4a7 = (C4A7) this.A01;
                AbstractC166987dD.A1Z(new PYc(c4a7, this.A02, null, 10), c4a7.A01);
                return C0eB.A00;
            case 34:
                EOJ eoj = (EOJ) this.A01;
                Bundle bundle = eoj.mArguments;
                String str13 = null;
                if (bundle != null) {
                    str3 = bundle.getString("surface");
                } else {
                    str3 = null;
                }
                if (C14360o3.A0K(str3, "roll_call")) {
                    new FRk(new Object(), eoj.A0D()).A03(EnumC33506Erf.GALLERY, this.A02, eoj.A0G().A00);
                }
                C81663kb B3U = AbstractC28761aE.A00(eoj.A0D()).B3U(eoj.A0G());
                if (B3U != null && !B3U.CWO() && !B3U.Ay8() && !B3U.Cc2()) {
                    UserSession A0D = eoj.A0D();
                    DirectPromptTypes directPromptTypes = DirectPromptTypes.A08;
                    Bundle bundle2 = eoj.mArguments;
                    if (bundle2 != null) {
                        str13 = bundle2.getString("collection_id");
                    }
                    Bundle A002 = FUa.A00(A0D, B3U, directPromptTypes, null, str13, eoj.A0I, false);
                    FragmentActivity activity2 = eoj.getActivity();
                    if (activity2 != null) {
                        FUa.A01(activity2, A002, eoj.A0D(), 4929);
                    }
                }
                return C0eB.A00;
            case 35:
                ((FOg) this.A01).A0D.A0A(this.A02);
                return C0eB.A00;
            case 36:
                AbstractC32707EaY abstractC32707EaY = (AbstractC32707EaY) this.A01;
                abstractC32707EaY.A0E().A0A(this.A02);
                abstractC32707EaY.A0N();
                return C0eB.A00;
            case 37:
                if (C14360o3.A0K(this.A02, "roll_call")) {
                    EOJ eoj2 = (EOJ) this.A01;
                    new FRk(new Object(), eoj2.A0D()).A02(EnumC33511Erk.REPLY, eoj2.A0E().A0B, eoj2.A0G().A00);
                }
                return C0eB.A00;
            case 39:
                L4A l4a = (L4A) this.A01;
                C3o9 Afi = ((C7U0) l4a.A05.invoke()).C7r().Afi();
                if (Afi != null) {
                    C7IT c7it = (C7IT) l4a.A04.invoke();
                    String str14 = this.A02;
                    C14360o3.A0B(str14, 1);
                    c7it.A02.Bt9().ELt(Afi, str14);
                    return true;
                }
                return null;
            case 40:
                L4A l4a2 = (L4A) this.A01;
                C3o9 Afi2 = ((C7U0) l4a2.A05.invoke()).C7r().Afi();
                if (Afi2 != null) {
                    C7IT c7it2 = (C7IT) l4a2.A04.invoke();
                    String str15 = this.A02;
                    C14360o3.A0B(str15, 1);
                    c7it2.A02.Bt9().F9o(Afi2, str15);
                    return true;
                }
                return null;
            case Seq.NULL_REFNUM /* 41 */:
                C33185EkW c33185EkW = (C33185EkW) this.A01;
                InterfaceC09390do interfaceC09390do3 = c33185EkW.A04;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do3), 36326730310563900L) && (interfaceC37169GZg = c33185EkW.A00) != null) {
                    C7TQ C78 = interfaceC37169GZg.C78();
                    InterfaceC83733oI interfaceC83733oI = c33185EkW.A01;
                    if (interfaceC83733oI == null) {
                        str2 = "threadId";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    C78.FBV(((C83693oE) interfaceC83733oI).A00, AbstractC31173DnH.A0t(interfaceC09390do3), this.A02);
                }
                return C0eB.A00;
            case 43:
                LEU leu = (LEU) this.A01;
                String str16 = this.A02;
                if (str16 != null) {
                    hashMap = AbstractC06930Yk.A02(AbstractC25229BEm.A1b(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "3", AbstractC166987dD.A1L("bot_response_id", str16)));
                } else {
                    hashMap = null;
                }
                C66237U5h c66237U5h = new C66237U5h(new C50359MLl(leu, 38));
                UserSession userSession2 = leu.A02;
                AbstractC59962oe abstractC59962oe = leu.A01;
                C62862tP A003 = C62862tP.A00(new SparseArray(), abstractC59962oe, abstractC59962oe, userSession2, null);
                C69618VsL A01 = FTe.A01("com.bloks.www.messenger.aibot.good_feedback_submit_controller");
                A01.A04 = hashMap;
                A01.A01 = c66237U5h;
                A01.A00(abstractC59962oe.requireContext(), A003);
                return C0eB.A00;
            case 44:
                LEU leu2 = (LEU) this.A01;
                HashMap A02 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "3", AbstractC166987dD.A1L("bot_response_id", this.A02)));
                HashMap A0r2 = AbstractC167017dG.A0r("on_complete", new C66237U5h(new C50359MLl(leu2, 37)));
                C35205Ffx c35205Ffx = new C35205Ffx();
                c35205Ffx.A03 = U6H.A09;
                c35205Ffx.A02 = U6G.A05;
                C65981Txa A03 = c35205Ffx.A03();
                C66277U6x A022 = C66277U6x.A02("com.bloks.www.messenger.aibot.feedback_controller", A02, A0r2);
                Context context = leu2.A00;
                IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(leu2.A02).A00;
                igBloksScreenConfig.A0C = A03;
                A022.A06(context, igBloksScreenConfig);
                return C0eB.A00;
            case 45:
                String str17 = this.A02;
                if (str17 != null) {
                    return str17;
                }
                return URLUtil.guessFileName(((JW0) this.A01).A01.getUrl(), null, null);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C42201xA A012 = AbstractC42021ws.A01(EnumC46168Kc6.A06);
                String str18 = this.A02;
                PlatformStorageProvider.initialize(AbstractC12290kX.A00);
                UserSession A0O = AbstractC43593JPy.A0O(this.A01);
                C135816Cj A004 = AnonymousClass615.A00((C1334860s) A0O.A01(C1334860s.class, new MHH(A0O, 29)), A0O, str18, 1, 2);
                FileObserver fileObserver = A004.A00;
                if (fileObserver != null) {
                    fileObserver.startWatching();
                }
                return new LG5(new ACD(A004.A01), A012, A0O, A004);
            case 47:
                String str19 = this.A02;
                if (str19 != null) {
                    EOK eok = (EOK) this.A01;
                    String str20 = eok.A0A;
                    if (str20 == null) {
                        str2 = "collectionId";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    EOK.A03(eok, VG2.A0S, str19, str20);
                }
                return C0eB.A00;
            case 48:
                EOK eok2 = (EOK) this.A01;
                String str21 = this.A02;
                if (str21 != null) {
                    C31831Dyp c31831Dyp = (C31831Dyp) eok2.A0K.getValue();
                    C05A c05a = c31831Dyp.A07;
                    Iterable iterable2 = (Iterable) c31831Dyp.A03.A0A.getValue();
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : iterable2) {
                        AbstractC43593JPy.A1R(((C32050E6c) obj).A05, str21, obj, A1E);
                    }
                    C32050E6c c32050E6c = (C32050E6c) AbstractC001800i.A0J(A1E);
                    if (c32050E6c != null && (str = c32050E6c.A06) != null) {
                        c05a.Egh(new E9G("Prompt response", str));
                    }
                }
                return C0eB.A00;
            case 49:
                AbstractC44190Jft abstractC44190Jft = (AbstractC44190Jft) this.A01;
                abstractC44190Jft.A01.flowEndCancel(abstractC44190Jft.A00, this.A02);
                abstractC44190Jft.A00 = 0L;
                return C0eB.A00;
        }
    }
}
