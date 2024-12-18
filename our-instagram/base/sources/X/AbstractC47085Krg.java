package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Krg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47085Krg {
    public static final C45107Jxb A00(C48532Kv c48532Kv) {
        String A03 = c48532Kv.A03("USER_SESSION_KEY");
        if (A03 != null) {
            String A032 = c48532Kv.A03("PENDING_MEDIA_KEY");
            if (A032 != null) {
                String A033 = c48532Kv.A03("PENDING_MEDIA_TYPE_KEY");
                if (A033 == null) {
                    A033 = "UNINITIALIZED";
                }
                EnumC40111tc valueOf = EnumC40111tc.valueOf(A033);
                String A034 = c48532Kv.A03("PENDING_SHARE_TYPE_KEY");
                if (A034 != null) {
                    ShareType valueOf2 = ShareType.valueOf(A034);
                    C22P A01 = C4JI.A01(c48532Kv.A03("CAMERA_ENTRY_POINT_KEY"));
                    String A035 = c48532Kv.A03("SOURCE_KEY");
                    if (A035 != null) {
                        return new C45107Jxb(A01, valueOf, valueOf2, A03, A032, A035, c48532Kv.A02("RUN_COUNT_KEY", -1));
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
