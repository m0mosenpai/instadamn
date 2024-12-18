package X;

import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.Kko, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46671Kko {
    public static final PushChannelType A00(String str) {
        for (PushChannelType pushChannelType : PushChannelType.values()) {
            if (C14360o3.A0K(pushChannelType.name(), str)) {
                return pushChannelType;
            }
        }
        return null;
    }
}
