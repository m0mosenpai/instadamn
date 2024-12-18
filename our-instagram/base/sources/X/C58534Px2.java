package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Px2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58534Px2 {
    public static final C58534Px2 A01 = new C58534Px2(true);
    public static volatile C58534Px2 A02;
    public final Map A00;

    public static C58534Px2 A00() {
        C58534Px2 c58534Px2;
        C58534Px2 c58534Px22 = A02;
        if (c58534Px22 == null) {
            synchronized (C58534Px2.class) {
                c58534Px2 = A02;
                if (c58534Px2 == null) {
                    Class cls = AbstractC62334S7e.A00;
                    if (cls != null) {
                        try {
                            c58534Px2 = (C58534Px2) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        if (c58534Px2 != null) {
                            A02 = c58534Px2;
                        }
                    }
                    c58534Px2 = A01;
                    A02 = c58534Px2;
                }
            }
            return c58534Px2;
        }
        return c58534Px22;
    }

    public C58534Px2(boolean empty) {
        this.A00 = Collections.emptyMap();
    }

    public C58534Px2() {
        this.A00 = AbstractC166987dD.A1G();
    }
}
