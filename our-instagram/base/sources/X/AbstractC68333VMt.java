package X;

import java.util.EnumMap;

/* renamed from: X.VMt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68333VMt {
    public static final VDI A00(VDI vdi, Integer num) {
        EnumMap enumMap;
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue != 1) {
                enumMap = VDI.A02;
            } else {
                enumMap = VDI.A01;
            }
        } else {
            enumMap = VDI.A00;
        }
        return (VDI) enumMap.get(vdi);
    }
}
