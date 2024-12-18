package X;

/* renamed from: X.0dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09440dt {
    /* JADX WARN: Type inference failed for: r1v5, types: [X.11p, java.lang.Object] */
    public static final InterfaceC09390do A00(EnumC09460dv enumC09460dv, InterfaceC16820sZ interfaceC16820sZ) {
        InterfaceC09390do interfaceC09390do;
        C14360o3.A0B(enumC09460dv, 0);
        C14360o3.A0B(interfaceC16820sZ, 1);
        int ordinal = enumC09460dv.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? obj = new Object();
                    obj.A01 = interfaceC16820sZ;
                    obj.A00 = C09580e9.A00;
                    interfaceC09390do = obj;
                } else {
                    throw new B4Z();
                }
            } else {
                interfaceC09390do = new C1EZ(interfaceC16820sZ);
            }
        } else {
            interfaceC09390do = new C17050sx(interfaceC16820sZ);
        }
        return interfaceC09390do;
    }

    public static final C17050sx A01(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        return new C17050sx(interfaceC16820sZ);
    }
}
