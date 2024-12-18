package X;

import java.util.Comparator;

/* renamed from: X.4H2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4H2 implements Comparator {
    public static final C4H2 A00 = new C4H2();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C83403nh c83403nh = (C83403nh) obj;
        C83403nh c83403nh2 = (C83403nh) obj2;
        String A0g = c83403nh.A0g();
        String A0g2 = c83403nh2.A0g();
        String str = "(null msg id)";
        if (A0g == null) {
            String A0h = c83403nh.A0h();
            if (A0h == null) {
                A0h = "(null msg id)";
            }
            C0w9.A03("direct_message_missing_client_context", AnonymousClass001.A0R(A0h, " has null client context"));
        }
        if (A0g2 == null) {
            String A0h2 = c83403nh2.A0h();
            if (A0h2 != null) {
                str = A0h2;
            }
            C0w9.A03("direct_message_missing_client_context", AnonymousClass001.A0R(str, " has null client context"));
        }
        if (A0g != null) {
            if (A0g2 != null) {
                return A0g.compareTo(A0g2);
            }
            return 1;
        }
        if (A0g2 != null) {
            return -1;
        }
        return 0;
    }
}
