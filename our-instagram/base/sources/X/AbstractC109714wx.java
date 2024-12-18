package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;

/* renamed from: X.4wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109714wx {
    public static final LiveUserPaySupportTier A00(String str) {
        LiveUserPaySupportTier liveUserPaySupportTier = (LiveUserPaySupportTier) LiveUserPaySupportTier.A01.get(str);
        if (liveUserPaySupportTier == null) {
            return LiveUserPaySupportTier.A06;
        }
        return liveUserPaySupportTier;
    }
}
