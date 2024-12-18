package X;

import java.util.Arrays;

/* renamed from: X.3d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77183d4 {
    public static final Object A00(C76223bS c76223bS, InterfaceC16820sZ interfaceC16820sZ, final Object[] objArr) {
        C14360o3.A0B(c76223bS, 0);
        C14360o3.A0B(objArr, 1);
        C2XE c2xe = c76223bS.A05;
        String A08 = c2xe.A08();
        int i = c76223bS.A00;
        c76223bS.A00 = i + 1;
        Object obj = new Object(objArr) { // from class: X.3d5
            public final Object[] A00;

            public final boolean equals(Object obj2) {
                if ((obj2 instanceof C77193d5) && AbstractC78713fd.A02(this.A00, ((C77193d5) obj2).A00)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Arrays.hashCode(this.A00);
            }

            {
                this.A00 = objArr;
            }
        };
        Object A07 = c2xe.A07(obj, A08, i);
        if (A07 == null) {
            Object invoke = interfaceC16820sZ.invoke();
            c2xe.A0D(obj, invoke, A08, i);
            return invoke;
        }
        return A07;
    }
}
