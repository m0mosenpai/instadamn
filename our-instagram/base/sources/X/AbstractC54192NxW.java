package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;

/* renamed from: X.NxW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54192NxW {
    public static final DirectMessageInteropReachabilityOptions A00(String str) {
        for (DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions : DirectMessageInteropReachabilityOptions.values()) {
            if (C14360o3.A0K(directMessageInteropReachabilityOptions.A03, str)) {
                return directMessageInteropReachabilityOptions;
            }
        }
        return null;
    }
}
