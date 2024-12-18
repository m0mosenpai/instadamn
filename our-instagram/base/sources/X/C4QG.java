package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.4QG, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4QG {
    public static final boolean A00(C0JM c0jm, C4QF c4qf, long j) {
        C14360o3.A0B(c4qf, 0);
        C14360o3.A0B(c0jm, 1);
        long A00 = c4qf.A00("last_warm_up_ts", -1L);
        if (j > 0 && A00 != -1 && c0jm.now() - A00 <= j * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
            return false;
        }
        return true;
    }
}
