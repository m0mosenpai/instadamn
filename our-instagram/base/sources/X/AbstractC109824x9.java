package X;

import com.instagram.api.schemas.IGLiveBadgeSettings;

/* renamed from: X.4x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109824x9 {
    public static final IGLiveBadgeSettings A00(String str) {
        IGLiveBadgeSettings iGLiveBadgeSettings = (IGLiveBadgeSettings) IGLiveBadgeSettings.A01.get(str);
        if (iGLiveBadgeSettings == null) {
            return IGLiveBadgeSettings.A06;
        }
        return iGLiveBadgeSettings;
    }
}
