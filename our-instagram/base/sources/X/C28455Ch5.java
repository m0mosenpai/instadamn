package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Ch5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28455Ch5 {
    public final UserSession A00;
    public final Map A01 = AbstractC166987dD.A1I();

    public static final C51755Mte A00(C44920JuY c44920JuY, C28455Ch5 c28455Ch5, C38321qM c38321qM) {
        ExtendedImageUrl extendedImageUrl;
        int ordinal = ((EnumC46252KdU) c44920JuY.A04(TraceFieldType.ContentType, EnumC46252KdU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)).ordinal();
        String str = null;
        if (ordinal != 2 && ordinal != 4) {
            return new C51755Mte((List) null, (DefaultConstructorMarker) null, 1, 12);
        }
        User A14 = AbstractC25226BEj.A14(c38321qM);
        if (A14 != null) {
            extendedImageUrl = new ExtendedImageUrl(A14.Bhu());
        } else {
            extendedImageUrl = null;
        }
        User A142 = AbstractC25226BEj.A14(c38321qM);
        if (A142 != null) {
            str = A142.getUsername();
        }
        return new C51755Mte(AbstractC166987dD.A1J(AbstractC47996LLi.A07(extendedImageUrl, c38321qM.A1q(AbstractC25225BEi.A0F(c28455Ch5.A00)), str, null, c44920JuY.A05("target_url"))), 12);
    }

    public static final C25975BeP A01(EnumC46252KdU enumC46252KdU, String str, String str2, String str3) {
        CTY c25966BeG;
        String str4;
        String A1I = AbstractC25226BEj.A1I(AbstractC167007dF.A0m(str, "_", 0), 0);
        switch (enumC46252KdU.ordinal()) {
            case 1:
                c25966BeG = new C25968BeI();
                c25966BeG.A00("note_igid", A1I);
                str4 = "XMSGIgReceiverFetchXmaNoteFetchParams";
                break;
            case 2:
            case 11:
            default:
                c25966BeG = new C25972BeM();
                c25966BeG.A00("story_igid", A1I);
                c25966BeG.A00("reel_id", str2);
                str4 = "XMSGIgReceiverFetchXmaStoryFetchParams";
                break;
            case 3:
                c25966BeG = new C25969BeJ();
                c25966BeG.A00("igid", A1I);
                str4 = "XMSGIgReceiverFetchXmaProfileFetchParams";
                break;
            case 4:
                c25966BeG = new C25963BeC();
                c25966BeG.A00("media_igid", A1I);
                str4 = "XMSGIgReceiverFetchXmaClipFetchParams";
                break;
            case 5:
                c25966BeG = new BeE();
                c25966BeG.A00("media_igid", A1I);
                c25966BeG.A00("carousel_share_child_media_igid", str3);
                str4 = "XMSGIgReceiverFetchXmaFeedFetchParams";
                break;
            case 6:
                c25966BeG = new C25965BeF();
                c25966BeG.A00("live_igid", A1I);
                str4 = "XMSGIgReceiverFetchXmaLiveFetchParams";
                break;
            case 7:
                c25966BeG = new C25964BeD();
                c25966BeG.A00("comment_fbid", A1I);
                str4 = "XMSGIgReceiverFetchXmaCommentFetchParams";
                break;
            case 8:
                c25966BeG = new C25966BeG();
                c25966BeG.A00("location_igid", str);
                str4 = "XMSGIgReceiverFetchXmaLocationShareFetchParams";
                break;
            case 9:
                c25966BeG = new C25970BeK();
                c25966BeG.A00("audio_igid", A1I);
                str4 = "XMSGIgReceiverFetchXmaReelsAudioFetchParams";
                break;
            case 10:
                c25966BeG = new C25967BeH();
                c25966BeG.A00("media_note_igid", A1I);
                str4 = "XMSGIgReceiverFetchXmaMediaNoteFetchParams";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c25966BeG = new C25971BeL();
                c25966BeG.A00("media_igid", A1I);
                str4 = "XMSGIgReceiverFetchXmaSocialContextFetchParams";
                break;
        }
        return new C25975BeP(c25966BeG, str4);
    }

    public static void A03(EnumC46252KdU enumC46252KdU, C28455Ch5 c28455Ch5, Class cls, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE) {
        List A1N;
        C47628L1n c47628L1n = new C47628L1n(cls, interfaceC16620sF, interfaceC16610sE);
        Map map = c28455Ch5.A01;
        if (map.containsKey(enumC46252KdU) && (A1N = (List) map.get(enumC46252KdU)) != null) {
            if (!A1N.contains(c47628L1n)) {
                A1N.add(c47628L1n);
            } else {
                return;
            }
        } else {
            A1N = AbstractC16960so.A1N(c47628L1n);
        }
        map.put(enumC46252KdU, A1N);
    }

    public C28455Ch5(UserSession userSession) {
        this.A00 = userSession;
        A03(EnumC46252KdU.PROFILE, this, User.class, new C30495Dbe(this, 23), C30676Dea.A00);
        EnumC46252KdU enumC46252KdU = EnumC46252KdU.STORY;
        A03(enumC46252KdU, this, C38321qM.class, new C30495Dbe(this, 28), C30715DfD.A00(this, 37));
        A03(EnumC46252KdU.STORY_HIGHLIGHT, this, C38321qM.class, new C30495Dbe(this, 27), C30715DfD.A00(this, 36));
        A03(enumC46252KdU, this, C45001Jvr.class, new C30495Dbe(this, 26), C30715DfD.A00(this, 35));
        EnumC46252KdU enumC46252KdU2 = EnumC46252KdU.NOTE;
        A03(enumC46252KdU2, this, C47813L9v.class, new C30495Dbe(this, 18), C30715DfD.A00(this, 29));
        A03(enumC46252KdU2, this, L4V.class, new C30495Dbe(this, 19), C30715DfD.A00(this, 30));
        A03(enumC46252KdU2, this, C47709L4q.class, new C30495Dbe(this, 20), C30715DfD.A00(this, 31));
        A03(enumC46252KdU2, this, CSD.class, new C30495Dbe(this, 21), C30715DfD.A00(this, 32));
        A03(enumC46252KdU2, this, C44993Jvj.class, new C30495Dbe(this, 22), C30715DfD.A00(this, 28));
        A03(EnumC46252KdU.MEDIA_NOTE, this, C47813L9v.class, new C30495Dbe(this, 13), C30715DfD.A00(this, 23));
        A03(EnumC46252KdU.CLIP, this, C38321qM.class, new C30495Dbe(this, 11), C30715DfD.A00(this, 21));
        EnumC46252KdU enumC46252KdU3 = EnumC46252KdU.FEED;
        A03(enumC46252KdU3, this, C30061cM.class, new C30495Dbe(this, 14), C30715DfD.A00(this, 24));
        A03(EnumC46252KdU.LIVE, this, C47551KzL.class, new C30495Dbe(this, 16), C30715DfD.A00(this, 26));
        A03(enumC46252KdU3, this, C30221cd.class, new C30495Dbe(this, 15), C30715DfD.A00(this, 25));
        A03(EnumC46252KdU.COMMENT, this, L3X.class, new C30495Dbe(this, 12), C30715DfD.A00(this, 22));
        A03(EnumC46252KdU.REELS_AUDIO, this, C30401cv.class, new C30495Dbe(this, 24), C30715DfD.A00(this, 33));
        A03(EnumC46252KdU.SOCIAL_CONTEXT, this, C25983BeX.class, new C30495Dbe(this, 25), C30715DfD.A00(this, 34));
        A03(EnumC46252KdU.LOCATION_SHARE, this, C30441cz.class, new C30495Dbe(this, 17), C30715DfD.A00(this, 27));
    }

    public static final String A02(EnumC46252KdU enumC46252KdU, Object obj) {
        C2EY c2ey;
        switch (enumC46252KdU.ordinal()) {
            case 2:
            case 11:
                c2ey = C2EY.A22;
                break;
            case 3:
                c2ey = C2EY.A1y;
                break;
            case 4:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c2ey = C2EY.A1r;
                break;
            case 5:
                c2ey = C2EY.A1x;
                break;
            case 6:
                c2ey = C2EY.A1v;
                break;
            case 7:
            case 8:
            default:
                c2ey = C2EY.A1O;
                break;
            case 9:
                c2ey = C2EY.A1U;
                break;
        }
        return C47842LBj.A00().A01(c2ey, obj);
    }
}
