package X;

/* renamed from: X.U5f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66235U5f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    public static final Object A00(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, String str) {
        C6FG c6fg = 0;
        if (interfaceC103384lE == null) {
            return null;
        }
        try {
            c6fg = C6FY.A00(c6fq, C6FW.A01, interfaceC103384lE);
            return c6fg;
        } catch (C1338562t e) {
            AbstractC25241Le.A00(c6fg, "BloksComponentQueryManager", AnonymousClass001.A0g("Exception when evaluating ", str, " for async component query."), e);
            return c6fg;
        }
    }
}
