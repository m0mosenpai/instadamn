package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.9x0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225379x0 {
    public static Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "Merlot";
                    break;
                case 2:
                    str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    break;
                default:
                    str2 = "Facebook View";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C05F.A0C;
    }
}
