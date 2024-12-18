package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.FAw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34302FAw {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            case 2:
                return "instagram";
            case 3:
                return "messenger";
            case 4:
                return "snapchat";
            case 5:
                return "user_email";
            case 6:
                return "user_sms";
            case 7:
                return "user_system_sheet";
            case 8:
                return "whatsapp";
            default:
                return "copy_link";
        }
    }
}
