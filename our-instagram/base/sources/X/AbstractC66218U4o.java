package X;

import java.util.List;

/* renamed from: X.U4o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66218U4o {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        Object obj = list.get(0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Number");
        int intValue = ((Number) obj2).intValue();
        if (intValue == 0) {
            return C6AM.A03(c6fq, str);
        }
        return U5D.A00.A02(c6fq, str, intValue);
    }
}
