package X;

import com.facebook.tigon.tigonhuc.HucClient;

/* renamed from: X.9xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225789xx {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 2:
                return 40;
            case 3:
                return HucClient.BODY_UPLOAD_TIMEOUT_SECONDS;
            case 4:
                return 3440;
            default:
                return 200;
        }
    }
}
