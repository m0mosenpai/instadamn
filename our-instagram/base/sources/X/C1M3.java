package X;

import java.util.UUID;

/* renamed from: X.1M3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M3 {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1M0, java.lang.Object] */
    public final C1M0 A01(String str) {
        if (str != null) {
            ?? obj = new Object();
            obj.A00 = str;
            return obj;
        }
        return A00();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1M0, java.lang.Object] */
    public static final C1M0 A00() {
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        ?? obj2 = new Object();
        obj2.A00 = obj;
        return obj2;
    }
}
