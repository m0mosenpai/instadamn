package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.Nx4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54168Nx4 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "NOT_CREATED";
            case 2:
                return "EFFECT_NOT_GENERATED";
            case 3:
                return "QUERY_ERROR";
            case 4:
                return "DOWNLOADING";
            case 5:
                return MessageAvailabilityResponseId$Companion.AVAILABLE;
            default:
                return "UNSET";
        }
    }
}
