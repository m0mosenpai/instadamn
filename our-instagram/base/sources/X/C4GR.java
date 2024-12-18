package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.4GR, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4GR {
    public static final String A00(int i) {
        if (i == 47) {
            return "IGD_GROUP";
        }
        if (i == 1012) {
            return "IG_AI_BOT_ONE_TO_ONE";
        }
        if (i == 1014) {
            return "IG_USER_GENERATED_AI_BOT_ONE_TO_ONE";
        }
        if (i == 61) {
            return "IG_CREATOR_SUBSCRIBER_GROUP_THREAD";
        }
        if (i == 62) {
            return "IG_DISCOVERABLE_CHAT_THREAD";
        }
        switch (i) {
            case 1:
                return "ADMIN_MODEL_V2_THREAD";
            case 2:
                return "FB_GROUP_CHAT";
            case 3:
                return "MARKETPLACE_THREAD";
            case 4:
                return "SCHOOL_CHAT";
            case 5:
                return "DEPRECATED_WORK_SYNCED_CHAT";
            case 6:
                return "ADMIN_NOT_SUPPORTED_THREAD";
            case 7:
                return "BELL_SYNCED_CHAT";
            case 8:
                return "GAMES_APP_THREAD";
            case 9:
                return "VAULT_CHAT";
            case 10:
                return "VERSE_CHAT";
            case 11:
                return "GENERIC_COMMERCE_THREAD";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "USER_JOB_THREAD";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "COWORKER_GROUP_THREAD";
            case 14:
                return "APPROVAL_ENFORCED_CHATROOM_THREAD";
            case Process.SIGTERM /* 15 */:
                return "PARENTAL_APPROVED_SHEPHERD_MANAGED_THREAD";
            case 16:
                return "CAMPUS_GROUP_THREAD";
            case 17:
                return "LOCAL_COMMUNITIES_THREAD";
            case 18:
                return "CHAT_FOR_ROOM_THREAD";
            case Process.SIGSTOP /* 19 */:
                return "GAMING_PLAY_SQUAD";
            case 20:
                return "CHAT_FOR_GROUP_ADMIN_TO_MEMBER_THREAD";
            case 21:
                return "EITM_BACKED_IG_1TO1_THREAD";
            default:
                switch (i) {
                    case 23:
                        return "LEARNING_SPACE";
                    case 24:
                        return "E2EE_GROUP_THREAD_METADATA";
                    case 25:
                        return "IGD_BC_PARTNERSHIP";
                    case 26:
                        return "E2EE_1TO1_THREAD_METADATA";
                    case 27:
                        return "JOBS_CAREER_GROUP_THREAD";
                    case 28:
                        return "IG_CREATOR_SUBSCRIBER_GROUP_THREAD";
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        return "IG_CREATOR_SUBSCRIBER_BROADCAST_CHAT";
                    case 30:
                        return "BUSINESS_SUPPORT_THREAD";
                    case 31:
                        return "TAGGED_PII_DATA";
                    case 32:
                        return "IG_DISCOVERABLE_CHAT_THREAD";
                    case 33:
                        return "SUPPORT_MESSAGING_THREAD";
                    case 34:
                        return "DISCOVERABLE_PUBLIC_CHAT";
                    default:
                        switch (i) {
                            case 1001:
                                return "ONE_TO_ONE";
                            case 1002:
                                return "PARENT_APPROVED_ONE_TO_ONE";
                            case 1003:
                                return "IG_ONLY_ONE_TO_ONE";
                            case 1004:
                                return "INTEROP_ONE_TO_ONE";
                            case 1005:
                                return "WHATSAPP_ONE_TO_ONE";
                            default:
                                return "THREAD_TYPE_NOT_IMPLEMENTED_IN_LOGGER";
                        }
                }
        }
    }

    public static final boolean A01(int i) {
        return i == 32 || i == 62;
    }

    public static final boolean A02(int i) {
        return i == 28 || i == 61;
    }

    public static final boolean A03(int i) {
        return i == 62 || i == 61 || i == 29;
    }

    public static final boolean A04(int i) {
        return i == 25 || i == 32 || i == 28 || i == 29 || i == 61 || i == 62;
    }

    public static final boolean A05(int i) {
        return i == 24 || i == 26;
    }

    public static final boolean A06(int i) {
        return i == 47 || i == 1003;
    }

    public static final boolean A07(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1012 || intValue == 1014) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A08(Integer num) {
        if (num != null && num.intValue() == 1013) {
            return true;
        }
        return false;
    }
}
