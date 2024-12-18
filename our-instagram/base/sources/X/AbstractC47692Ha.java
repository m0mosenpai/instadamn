package X;

/* renamed from: X.2Ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC47692Ha {
    public static final InterfaceC47612Gm A00;
    public static final InterfaceC47612Gm A01;
    public static final InterfaceC47612Gm A02;
    public static final boolean A03;

    static {
        boolean z;
        InterfaceC47612Gm interfaceC47612Gm;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        A03 = z;
        if (z) {
            A00 = C47702Hb.A01;
            A02 = C47722Hd.A01;
            interfaceC47612Gm = C47742Hf.A01;
        } else {
            interfaceC47612Gm = null;
        }
        A01 = interfaceC47612Gm;
    }
}
