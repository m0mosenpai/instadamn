package X;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TI8 implements Serializable {
    public final Class A00;
    public final AnonymousClass165[] A01;
    public final Enum[] A02;

    public static TI8 A00(C45T c45t, Class cls) {
        Class cls2 = cls;
        Iterator it = C914045z.A00;
        if (cls.getSuperclass() != Enum.class) {
            cls2 = cls.getSuperclass();
        }
        Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
        if (enumArr != null) {
            C44W A00 = c45t.A00();
            int length = enumArr.length;
            String[] strArr = new String[length];
            A00.A0k(cls2, enumArr, strArr);
            AnonymousClass165[] anonymousClass165Arr = new AnonymousClass165[length];
            for (int i = 0; i < length; i++) {
                Enum r0 = enumArr[i];
                String str = strArr[i];
                if (str == null) {
                    str = r0.name();
                }
                anonymousClass165Arr[r0.ordinal()] = new AnonymousClass164(str);
            }
            return new TI8(cls, anonymousClass165Arr);
        }
        throw AbstractC167007dF.A0c("Cannot determine enum constants for Class ", cls.getName());
    }

    public TI8(Class cls, AnonymousClass165[] anonymousClass165Arr) {
        this.A00 = cls;
        this.A02 = (Enum[]) cls.getEnumConstants();
        this.A01 = anonymousClass165Arr;
    }
}
