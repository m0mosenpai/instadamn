package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10190gb {
    public static C10190gb A01;
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public static C10190gb A00() {
        C10190gb c10190gb = A01;
        if (c10190gb == null) {
            C10190gb c10190gb2 = new C10190gb();
            A01 = c10190gb2;
            return c10190gb2;
        }
        return c10190gb;
    }
}
