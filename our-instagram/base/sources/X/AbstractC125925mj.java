package X;

import java.util.List;

/* renamed from: X.5mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125925mj {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            List list = c6fw.A00;
            String str = (String) list.get(0);
            Object obj = list.get(1);
            Object obj2 = list.get(2);
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.Number");
            int intValue = ((Number) obj2).intValue();
            if (str != null) {
                List list2 = c6fq.A0D;
                Integer num = C05F.A00;
                if (intValue == 0) {
                    AnonymousClass634.A02(c6fg).A0E(new C6DY(str, obj));
                    return null;
                }
                if (list2 != null) {
                    if (intValue <= list2.size()) {
                        AnonymousClass634.A02(c6fg).A0E(new C6DY(C66208U4e.A00(num, str, list2, intValue), obj));
                    } else {
                        throw new IllegalArgumentException("Depth supplied should never exceed the size of the key path.");
                    }
                } else {
                    throw new IllegalArgumentException("Keypath must be set on environment if trying to WriteLocalState on a depth larger than 0.");
                }
            }
            return null;
        }
        throw new IllegalStateException("Called WriteLocalState when not attached to a tree");
    }
}
