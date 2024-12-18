package X;

import java.util.Comparator;

/* renamed from: X.4H3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4H3 implements Comparator {
    public static final C4H3 A00 = new C4H3();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String A0h = ((C83403nh) obj).A0h();
        String A0h2 = ((C83403nh) obj2).A0h();
        if (A0h == null || A0h2 == null) {
            C0w9.A03("direct_message_missing_msg_id", "One or more messages missing msg_id when comparing two DirectMessages");
            if (A0h != null) {
                if (A0h2 == null) {
                    return 1;
                }
            } else {
                if (A0h2 != null) {
                    return -1;
                }
                return 0;
            }
        }
        return C93404Gt.A01.compare(A0h, A0h2);
    }
}
