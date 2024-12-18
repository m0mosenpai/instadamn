package X;

import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import java.io.IOException;

/* renamed from: X.MVp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50604MVp {
    public static final ShareMediaLoggingInfo A00(String str) {
        ShareMediaLoggingInfo shareMediaLoggingInfo = null;
        if (str != null) {
            try {
                shareMediaLoggingInfo = OOS.parseFromJson(C16V.A00(str));
                return shareMediaLoggingInfo;
            } catch (IOException e) {
                AbstractC12120kG.A06("ShareMediaLoggingInfoConverter", "Failed to deserialize ShareMediaLoggingInfo from Clips draft.", e);
            }
        }
        return shareMediaLoggingInfo;
    }
}
