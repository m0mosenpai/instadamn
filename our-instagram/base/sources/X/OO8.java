package X;

import android.os.Bundle;

/* loaded from: classes9.dex */
public abstract class OO8 {
    public static final InterfaceC58266PsA A00(Bundle bundle, AbstractC12990ll abstractC12990ll) {
        Object obj;
        C14360o3.A0B(abstractC12990ll, 1);
        if (bundle != null) {
            long j = bundle.getLong("bug_reporter_user_flow_logger_v2_flow_id_extra", 0L);
            if (Long.valueOf(j) != null && j != 0) {
                obj = new C55869OrJ(abstractC12990ll, j);
                return (InterfaceC58266PsA) obj;
            }
        }
        obj = new Object();
        return (InterfaceC58266PsA) obj;
    }

    public static final InterfaceC58266PsA A01(AbstractC12990ll abstractC12990ll) {
        Object obj;
        if (C18U.A06(AbstractC166997dE.A0U(abstractC12990ll), abstractC12990ll, 36324295064105038L)) {
            obj = new C55869OrJ(abstractC12990ll, 0L);
        } else {
            obj = new Object();
        }
        return (InterfaceC58266PsA) obj;
    }
}
