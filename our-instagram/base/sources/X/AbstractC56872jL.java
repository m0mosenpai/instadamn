package X;

import android.os.Build;

/* renamed from: X.2jL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56872jL {
    public static final InterfaceC09390do A00;
    public static final InterfaceC09390do A01;
    public static final InterfaceC09390do A02;
    public static final InterfaceC09390do A03;

    static {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        A03 = AbstractC09440dt.A00(enumC09460dv, C56882jM.A00);
        A00 = AbstractC09440dt.A00(enumC09460dv, C56892jN.A00);
        A01 = AbstractC09440dt.A00(enumC09460dv, C56902jO.A00);
        A02 = AbstractC09440dt.A00(enumC09460dv, C56912jP.A00);
    }

    public static final InterfaceC80893jJ A00() {
        InterfaceC80893jJ interfaceC80893jJ;
        if (Build.VERSION.SDK_INT >= 34 && ((Boolean) A03.getValue()).booleanValue()) {
            interfaceC80893jJ = C56156OwN.A00;
        } else {
            interfaceC80893jJ = C80873jH.A00;
        }
        return interfaceC80893jJ;
    }
}
