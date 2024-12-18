package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.0pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15410pw {
    public static final C15420px A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0px] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    static {
        ?? r1 = 0;
        try {
            r1 = (C15420px) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r1 == 0) {
            r1 = new Object();
        }
        A00 = r1;
    }

    public static C0YW A00(Class cls) {
        return new C0YW(Collections.emptyList(), new C0YZ(cls), false);
    }

    public static C0YW A01(Class cls, C18210v6 c18210v6) {
        return new C0YW(Collections.singletonList(c18210v6), new C0YZ(cls), false);
    }

    public static C0YW A02(C18210v6 c18210v6, C18210v6 c18210v62) {
        return new C0YW(Arrays.asList(c18210v6, c18210v62), new C0YZ(Map.class), false);
    }
}
