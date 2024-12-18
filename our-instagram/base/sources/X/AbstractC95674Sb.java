package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.4Sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC95674Sb {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "stories";
            case 2:
                return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            case 3:
                return "live";
            case 4:
                return "live_replay";
            case 5:
                return MSV.A00(504);
            case 6:
                return "direct_audio";
            case 7:
                return "music";
            case 8:
                return "local";
            case 9:
                return "cowatch_local";
            default:
                return "feed";
        }
    }
}
