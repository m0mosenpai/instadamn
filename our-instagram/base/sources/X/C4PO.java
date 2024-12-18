package X;

import java.lang.reflect.Method;

/* renamed from: X.4PO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PO {
    public static Method A02;
    public final InterfaceC95004Pj A00;
    public final InterfaceC95004Pj A01;

    static {
        try {
            A02 = Class.forName("org.slf4j.LoggerFactory").getDeclaredMethod("getLogger", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public C4PO(InterfaceC95004Pj interfaceC95004Pj, InterfaceC95004Pj interfaceC95004Pj2) {
        this.A00 = interfaceC95004Pj;
        this.A01 = interfaceC95004Pj2;
    }
}
