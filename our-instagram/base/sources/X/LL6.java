package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.ContentView;
import com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.MediaInterventions;
import com.instagram.direct.armadilloexpress.transportpayload.MediaReaction;
import com.instagram.direct.armadilloexpress.transportpayload.OriginalTransportPayload;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LL6 {
    public static final LL6 A00 = new Object();

    public static final boolean A03(UserSession userSession, AddMessagePayload addMessagePayload, Long l, int i) {
        if (i != 1 && i != 2 && l == null) {
            if (C18U.A06(C06090Tz.A05, userSession, 2342165521866238223L)) {
                AddMessageContent addMessageContent = addMessagePayload.content_;
                if (addMessageContent == null) {
                    addMessageContent = AddMessageContent.DEFAULT_INSTANCE;
                }
                Media A0L = addMessageContent.A0L();
                if (A0L.mediaCase_ != 4 || A0L.A0M().A0L() == EnumC46313Kej.RAVEN_VIEW_MODEL_PERMANENT) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static final Long A01(AddMessageMetadata addMessageMetadata) {
        EphemeralityParams ephemeralityParams = addMessageMetadata.ephemeralityParams_;
        if (ephemeralityParams == null) {
            ephemeralityParams = EphemeralityParams.DEFAULT_INSTANCE;
        }
        long j = ephemeralityParams.ephemeralDurationSec_;
        Long valueOf = Long.valueOf(j);
        if (j <= 0) {
            return null;
        }
        return valueOf;
    }

    public static final String A02(SupplementMessagePayload supplementMessagePayload, String str, String str2, String str3) {
        String str4;
        if ((supplementMessagePayload.bitField0_ & 2) != 0 && (str4 = supplementMessagePayload.uniquingKeyForSupplementalData_) != null) {
            str2 = str4;
        }
        if (str3 != null && !AbstractC001900j.A0a(str2, ":", false)) {
            str2 = AnonymousClass001.A0T(str2, str3, ':');
        }
        return AnonymousClass001.A0T(str, str2, ':');
    }

    public final String A04(UserSession userSession, SupplementMessagePayload supplementMessagePayload, long j) {
        String valueOf;
        String str;
        MediaInterventions mediaInterventions;
        Long l;
        OriginalTransportPayload originalTransportPayload;
        MediaReaction mediaReaction;
        SupplementMessageContent supplementMessageContent = supplementMessagePayload.content_;
        if (supplementMessageContent == null) {
            supplementMessageContent = SupplementMessageContent.DEFAULT_INSTANCE;
        }
        C14360o3.A07(supplementMessageContent);
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = null;
        switch (supplementMessageContent.A0M().intValue()) {
            case 0:
                valueOf = String.valueOf(j);
                str = "reaction";
                break;
            case 1:
            case 4:
                ContentView A0L = supplementMessageContent.A0L();
                C14360o3.A07(A0L);
                User A0k = AbstractC31174DnI.A0k(userSession, userSession.userId);
                if (A0k != null) {
                    l = A0k.BTC();
                } else {
                    l = null;
                }
                if (supplementMessageContent.supplementMessageContentCase_ == 5) {
                    originalTransportPayload = (OriginalTransportPayload) supplementMessageContent.supplementMessageContent_;
                } else {
                    originalTransportPayload = OriginalTransportPayload.DEFAULT_INSTANCE;
                }
                if ((originalTransportPayload.bitField0_ & 1) != 0 && (l == null || j != l.longValue())) {
                    return AbstractC167017dG.A0n(l, "content_view_seen:", AbstractC166987dD.A1C());
                }
                if (A0L.seen_) {
                    return A02(supplementMessagePayload, "content_view_seen", String.valueOf(j), null);
                }
                if (A0L.screenshotted_) {
                    return A02(supplementMessagePayload, "content_view_screenshotted", String.valueOf(j), null);
                }
                if (!A0L.replayed_) {
                    return null;
                }
                return A02(supplementMessagePayload, "content_view_replayed", String.valueOf(j), null);
            case 2:
                return A02(supplementMessagePayload, "edit", String.valueOf(j), String.valueOf(currentTimeMillis));
            case 3:
                if (supplementMessageContent.supplementMessageContentCase_ == 4) {
                    mediaReaction = (MediaReaction) supplementMessageContent.supplementMessageContent_;
                } else {
                    mediaReaction = MediaReaction.DEFAULT_INSTANCE;
                }
                str2 = mediaReaction.mediaId_;
                C14360o3.A07(str2);
                valueOf = String.valueOf(j);
                str = "media_reaction";
                break;
            case 5:
                if (supplementMessageContent.supplementMessageContentCase_ == 6) {
                    mediaInterventions = (MediaInterventions) supplementMessageContent.supplementMessageContent_;
                } else {
                    mediaInterventions = MediaInterventions.DEFAULT_INSTANCE;
                }
                valueOf = mediaInterventions.mediaId_;
                C14360o3.A07(valueOf);
                str = "media_interventions";
                break;
            default:
                C0K8.A0C("ArmadilloExpressBackupGeneratorForProtoBufferTransport", "Supplemental message of this type is not supported yet.");
                return null;
        }
        return A02(supplementMessagePayload, str, valueOf, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.wamsys.wce.EncryptedBackupsAttachment A00(com.instagram.direct.armadilloexpress.transportpayload.Media r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LL6.A00(com.instagram.direct.armadilloexpress.transportpayload.Media, boolean):com.facebook.wamsys.wce.EncryptedBackupsAttachment");
    }
}
