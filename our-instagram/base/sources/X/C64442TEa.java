package X;

/* renamed from: X.TEa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64442TEa implements InterfaceC65289ThM {
    public static final C63133Sde A01;
    public final RaB A00;

    static {
        C63133Sde c63133Sde = C63133Sde.A02;
        if (c63133Sde == null) {
            synchronized (C63133Sde.class) {
                c63133Sde = C63133Sde.A02;
                if (c63133Sde == null) {
                    Class cls = S7m.A00;
                    if (cls != null) {
                        try {
                            c63133Sde = (C63133Sde) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        if (c63133Sde != null) {
                            C63133Sde.A02 = c63133Sde;
                        }
                    }
                    c63133Sde = C63133Sde.A01;
                    C63133Sde.A02 = c63133Sde;
                }
            }
        }
        A01 = c63133Sde;
    }

    public C64442TEa(RaB raB) {
        this.A00 = raB;
    }

    public C64442TEa() {
    }
}
