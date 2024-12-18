package X;

import java.util.List;

/* renamed from: X.3HL, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3HL {
    public static final void A00(Integer num, List list, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                i /= 2;
            }
            for (int i2 = 0; i2 < i; i2++) {
                list.add(interfaceC16820sZ.invoke());
            }
        }
    }
}
