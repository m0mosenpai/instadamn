package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.95C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C95C extends C95D {
    public final InterfaceC19630xq A00;

    public final int A01() {
        String A00 = AbstractC111324zv.A00(641);
        try {
            int i = this.A00.getInt(AbstractC111324zv.A00(2502), 0);
            if (i < 0) {
                C0K8.A0E(A00, "OverflowError - Fetching negative timestamp values");
                return 0;
            }
            return i;
        } catch (ClassCastException e) {
            C0K8.A0K(A00, "ClassCastException while trying to get last lookup timestamp", e);
            return 0;
        }
    }

    public C95C(UserSession userSession) {
        this.A00 = C1AT.A01(userSession).A03(C1AV.A2Y);
    }
}
