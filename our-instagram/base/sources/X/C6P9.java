package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6P9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6P9 {
    public static final C6PB A01(Integer num, String str) {
        C207389Fr c207389Fr = new C207389Fr(str, 0);
        List singletonList = Collections.singletonList("fully-visible");
        C14360o3.A07(singletonList);
        return C6PA.A00(num, "viewLifecycle", "visibility", singletonList, AbstractC06930Yk.A0E(), c207389Fr);
    }

    public static final C6PB A02(Integer num, String str) {
        C207389Fr c207389Fr = new C207389Fr(str, 1);
        List singletonList = Collections.singletonList("partially-visible");
        C14360o3.A07(singletonList);
        return C6PA.A00(num, "viewLifecycle", "visibility", singletonList, AbstractC06930Yk.A0E(), c207389Fr);
    }

    public static final C6PB A00(Integer num) {
        C6PW c6pw = C6PW.A00;
        List singletonList = Collections.singletonList("not-visible");
        C14360o3.A07(singletonList);
        return C6PA.A00(num, "viewLifecycle", "visibility", singletonList, AbstractC06930Yk.A0E(), c6pw);
    }
}
