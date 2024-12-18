package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3WL, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3WL {
    public static final long A00 = TimeUnit.SECONDS.toMillis(10);

    public static final InterfaceC224217b A00(InterfaceC224217b interfaceC224217b) {
        C14360o3.A0B(interfaceC224217b, 0);
        C14360o3.A0B(C13920nI.A00, 1);
        Long B39 = interfaceC224217b.B39();
        if (B39 != null && System.currentTimeMillis() > B39.longValue() - A00) {
            InterfaceC224217b interfaceC224217b2 = (InterfaceC224217b) interfaceC224217b.B4F();
            if (interfaceC224217b2 == null) {
                C0w9.A03("ExpirableUtil_nullFallback", "content is expired but fallback is null");
            } else {
                return interfaceC224217b2;
            }
        }
        return interfaceC224217b;
    }
}
