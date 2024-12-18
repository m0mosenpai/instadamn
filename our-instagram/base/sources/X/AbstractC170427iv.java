package X;

import java.util.Map;

/* renamed from: X.7iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170427iv {
    public static final C2XU A00(C2XU c2xu) {
        C2XU c2xu2 = new C2XU();
        if (c2xu != null) {
            Map map = c2xu.A00;
            C14360o3.A07(map);
            synchronized (map) {
                c2xu2.A00.putAll(map);
            }
        }
        return c2xu2;
    }
}
