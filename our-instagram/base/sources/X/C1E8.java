package X;

/* renamed from: X.1E8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1E8 {
    public static final C20730zt A01 = new C20730zt("NO_THREAD_ELEMENTS");
    public static final InterfaceC16620sF A00 = C1E9.A00;
    public static final InterfaceC16620sF A02 = C1EA.A00;
    public static final InterfaceC16620sF A03 = C1EB.A00;

    public static final Object A00(Object obj, C12W c12w) {
        if (obj == null) {
            obj = c12w.fold(0, A00);
            C14360o3.A0A(obj);
        }
        if (obj == 0) {
            return A01;
        }
        if (obj instanceof Integer) {
            return c12w.fold(new C4HU(c12w, ((Number) obj).intValue()), A03);
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        C4HS c4hs = (C4HS) ((C1EC) obj);
        ThreadLocal threadLocal = c4hs.A01;
        Object obj2 = threadLocal.get();
        threadLocal.set(c4hs.A00);
        return obj2;
    }

    public static final void A01(Object obj, C12W c12w) {
        if (obj != A01) {
            if (obj instanceof C4HU) {
                C4HU c4hu = (C4HU) obj;
                C1EC[] c1ecArr = c4hu.A03;
                int length = c1ecArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    C1EC c1ec = c1ecArr[length];
                    C14360o3.A0A(c1ec);
                    ((C4HS) c1ec).A01.set(c4hu.A02[length]);
                    if (i >= 0) {
                        length = i;
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = c12w.fold(null, A02);
                C14360o3.A0C(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((C4HS) ((C1EC) fold)).A01.set(obj);
            }
        }
    }
}
