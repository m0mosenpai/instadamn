package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.83h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1815483h {
    public int A00;
    public ACRType A01;
    public UserSession A02;
    public GalleryGridFormat A03;
    public C1815783k A04;
    public C1816683y A05;
    public AbstractC172157lk A06;
    public C1815883l A07;
    public C38321qM A08;
    public User A0A;
    public Integer A0C;
    public Integer A0D;
    public String A0E;
    public String A0G;
    public boolean A0H;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public SuperlativeStickerClientModel A0W;
    public final InterfaceC1816483t A0X;
    public final C1810981l A0Y;
    public final C1815983m A0Z;
    public final C1815683j A0a;
    public final C1816583x A0b;
    public final C1816183p A0d;
    public final C1816083n A0e;
    public final ClipsCelebrationReshareViewModel A0f;
    public final C83o A0g;
    public final C5JK A0h;
    public final C1816283r A0i;
    public final PendingRecipient A0j;
    public final C1816383s A0k;
    public final Boolean A0l;
    public final String A0m;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final MusicAttributionConfig A0u;
    public final List A0n = new ArrayList();
    public final List A0o = new ArrayList();
    public final List A0p = new ArrayList();
    public final C1815583i A0c = new C1815583i();
    public Integer A0B = C05F.A00;
    public String A0F = UUID.randomUUID().toString();
    public boolean A0O = false;
    public boolean A0I = false;
    public PromptStickerModel A09 = null;

    public C1815483h(InterfaceC1816483t interfaceC1816483t, UserSession userSession, C1810981l c1810981l, C1815983m c1815983m, C1815783k c1815783k, C1815683j c1815683j, C1816583x c1816583x, C1816183p c1816183p, C1816083n c1816083n, C1816683y c1816683y, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, C83o c83o, C5JK c5jk, SuperlativeStickerClientModel superlativeStickerClientModel, C1816283r c1816283r, C1815883l c1815883l, MusicAttributionConfig musicAttributionConfig, PendingRecipient pendingRecipient, C1816383s c1816383s, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0Y = c1810981l;
        this.A0a = c1815683j;
        this.A04 = c1815783k;
        this.A07 = c1815883l;
        this.A0Z = c1815983m;
        this.A0e = c1816083n;
        this.A0g = c83o;
        this.A0d = c1816183p;
        this.A0f = clipsCelebrationReshareViewModel;
        this.A0i = c1816283r;
        this.A0k = c1816383s;
        this.A0h = c5jk;
        this.A0m = str;
        this.A0t = z;
        this.A0s = z2;
        this.A0j = pendingRecipient;
        this.A0X = interfaceC1816483t;
        this.A0l = Boolean.valueOf(z3);
        this.A0u = musicAttributionConfig;
        this.A0q = z4;
        this.A0r = z5;
        this.A0W = superlativeStickerClientModel;
        this.A0b = c1816583x;
        this.A0P = z6;
        this.A0Q = z7;
        this.A0R = z8;
        this.A05 = c1816683y;
        this.A02 = userSession;
    }

    public static void A00(C1815483h c1815483h) {
        int i = c1815483h.A00;
        List list = c1815483h.A0n;
        if (i >= list.size()) {
            AbstractC12120kG.A01("CaptureSession.invalid_activeCapturedMediaIndex", AnonymousClass001.A02(c1815483h.A00, list.size(), "Assign to Camera Experiences Oncall. mActiveCapturedMediaIndex: ", ". mCapturedMedias.size: "));
            c1815483h.A00 = list.size() - 1;
        }
    }

    public final C81M A02() {
        int i = this.A00;
        List list = this.A0p;
        if (i < list.size()) {
            return (C81M) list.get(this.A00);
        }
        return null;
    }

    public final String A05() {
        String str;
        String str2;
        if (this.A0E == null) {
            C1810981l c1810981l = this.A0Y;
            if (c1810981l != null) {
                str = AbstractC226029yL.A00((C55U) c1810981l.A08.A00, (java.util.Set) c1810981l.A09.A00);
            } else {
                str = "null";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("compositionId is null, source: ");
            Integer num = this.A0D;
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str2 = "GALLERY";
                        break;
                    case 2:
                        str2 = "THIRD_PARTY";
                        break;
                    case 3:
                        str2 = "ARCHIVE_REEL_SHARE";
                        break;
                    case 4:
                        str2 = "POLL_RESULT_SHARE";
                        break;
                    case 5:
                        str2 = "REEL_MENTION_RESHARE";
                        break;
                    case 6:
                        str2 = "FEED_POST_RESHARE";
                        break;
                    case 7:
                        str2 = "REELS_CLIPS_RESHARE";
                        break;
                    case 8:
                        str2 = "REEL_IGTV_RESHARE";
                        break;
                    case 9:
                        str2 = "VISUAL_REPLY_REMIX";
                        break;
                    case 10:
                        str2 = "QUESTION_RESPONSE_RESHARE";
                        break;
                    case 11:
                        str2 = "ARCHIVE_ON_THIS_DAY_SHARE";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str2 = "ACTIVITY_FEED_ON_THIS_DAY_SHARE";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str2 = "COUNTDOWN_RESHARE";
                        break;
                    case 14:
                        str2 = AbstractC111324zv.A00(3479);
                        break;
                    case Process.SIGTERM /* 15 */:
                        str2 = "PRODUCT_RESHARE";
                        break;
                    case 16:
                        str2 = "SMB_SUPPORT_RESHARE";
                        break;
                    case 17:
                        str2 = "VIDEOCALL_SCREEN_CAPTURE_SHARE";
                        break;
                    case 18:
                        str2 = "REEL_SHOUTOUT_SHARE";
                        break;
                    case Process.SIGSTOP /* 19 */:
                        str2 = "GUIDE_SHARE";
                        break;
                    case 20:
                        str2 = "VOTING_SHARE";
                        break;
                    case 21:
                        str2 = "INFO_CENTER_SHARE";
                        break;
                    case 22:
                        str2 = "INFO_CENTER_FACT_SHARE";
                        break;
                    case 23:
                        str2 = "STANDALONE_FUNDRAISER_SHARE";
                        break;
                    case 24:
                        str2 = "GROUP_PROFILE_SHARE";
                        break;
                    case 25:
                        str2 = "REMIX_REPLY_SHARE";
                        break;
                    case 26:
                        str2 = "UNKNOWN";
                        break;
                    default:
                        str2 = "CAMERA";
                        break;
                }
            } else {
                str2 = "null";
            }
            sb.append(str2);
            sb.append(", camera state: ");
            sb.append(str);
            sb.append(", mActiveCapturedMediaIndex: ");
            sb.append(this.A00);
            sb.append(", capturedMedias.size(): ");
            sb.append(this.A0n.size());
            AbstractC12120kG.A01("CaptureSession.getCompositionId", sb.toString());
        }
        String str3 = this.A0E;
        if (str3 == null) {
            str3 = UUID.randomUUID().toString();
            this.A0E = str3;
        }
        str3.getClass();
        return str3;
    }

    public final void A06(int i) {
        List list = this.A0n;
        if (i < list.size()) {
            list.remove(i);
        }
        List list2 = this.A0p;
        if (i < list2.size()) {
            list2.remove(i);
        }
        int i2 = this.A00;
        if (i < i2 || i2 >= list.size()) {
            this.A00--;
        }
        A00(this);
    }

    public final boolean A07() {
        int i = this.A00;
        if (i >= 0 && i < this.A0n.size()) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        int intValue;
        Integer num = this.A0D;
        if ((num != null && ((intValue = num.intValue()) == 6 || intValue == 24)) || (this.A06 instanceof C197448oF)) {
            return false;
        }
        C81M A02 = A02();
        if (A02 == null) {
            return true;
        }
        C88Z c88z = A02.A06;
        if (c88z == C88Z.A0f || c88z == C88Z.A0b) {
            return false;
        }
        return true;
    }

    public final EnumC198268pb A01() {
        if (!A07()) {
            return EnumC198268pb.A05;
        }
        return ((C198308pf) this.A0n.get(this.A00)).A05;
    }

    public final C183978Ee A03() {
        if (!A07()) {
            return null;
        }
        return ((C198308pf) this.A0n.get(this.A00)).A02;
    }

    public final C195868lW A04() {
        if (!A07()) {
            return null;
        }
        return ((C198308pf) this.A0n.get(this.A00)).A03;
    }
}
