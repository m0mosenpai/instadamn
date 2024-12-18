package X;

import java.util.List;

/* renamed from: X.CBo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27493CBo {
    public static final List A00(C6FW c6fw) {
        String str;
        int min;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        List list = (List) A01;
        int A0D = AbstractC25230BEn.A0D(c6fw.A02(), AbstractC111324zv.A00(38));
        Number number = (Number) c6fw.A00.get(2);
        if (A0D >= 0 && A0D < list.size()) {
            if (number == null) {
                min = list.size();
            } else if (number.intValue() < 0) {
                str = "argument length cannot be negative";
            } else {
                min = Math.min(number.intValue() + A0D, list.size());
            }
            return list.subList(A0D, min);
        }
        str = "argument offset is out of bounds";
        AbstractC25241Le.A02("bk.action.array.Slice", str);
        return null;
    }
}
