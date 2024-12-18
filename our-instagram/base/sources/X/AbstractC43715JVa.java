package X;

import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.JVa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43715JVa {
    public static final PushChannelType A00(Integer num) {
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 != 0) {
            if (A03 == 1) {
                return PushChannelType.A0A;
            }
            throw B4Z.A00();
        }
        return PushChannelType.A08;
    }
}
