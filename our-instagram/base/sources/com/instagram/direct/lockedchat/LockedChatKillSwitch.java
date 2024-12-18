package com.instagram.direct.lockedchat;

import X.C06090Tz;
import X.C08730cb;
import X.C14360o3;
import X.C18U;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class LockedChatKillSwitch {
    public static final LockedChatKillSwitch INSTANCE = new Object();

    public static final boolean isLockedChatEnabled(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(userSession, 0);
        if (!C08730cb.A00(userSession).A00().A2I()) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            boolean A06 = C18U.A06(c06090Tz, userSession, 36320867680003027L);
            C14360o3.A0A(Boolean.valueOf(A06));
            if (A06) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isLockedChatSocialChannelEnabled(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(userSession, 0);
        if (isLockedChatEnabled(userSession, z)) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            boolean A06 = C18U.A06(c06090Tz, userSession, 36320867680461781L);
            C14360o3.A0A(Boolean.valueOf(A06));
            if (A06) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean isLockedChatEnabled$default(UserSession userSession, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return isLockedChatEnabled(userSession, z);
    }

    public static /* synthetic */ boolean isLockedChatSocialChannelEnabled$default(UserSession userSession, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return isLockedChatSocialChannelEnabled(userSession, z);
    }
}
