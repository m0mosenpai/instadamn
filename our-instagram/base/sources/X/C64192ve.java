package X;

import java.util.List;

/* renamed from: X.2ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64192ve implements InterfaceC62702t9 {
    @Override // X.InterfaceC62702t9
    public final String BKe(C59062n7 c59062n7) {
        C14360o3.A0B(c59062n7, 0);
        List list = ((C38626GyT) c59062n7.A03).A03.A0B;
        Object obj = c59062n7.A04;
        C14360o3.A06(obj);
        String id = ((IL5) list.get(((Number) obj).intValue())).A00().getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
