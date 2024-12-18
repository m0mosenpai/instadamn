package X;

/* renamed from: X.4kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC103044kf {
    public static final Object A01(EnumC103014kc enumC103014kc, C103054kg c103054kg, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c103054kg, 0);
        ThreadLocal threadLocal = AbstractC103024kd.A01;
        Object obj = threadLocal.get();
        ThreadLocal threadLocal2 = AbstractC103024kd.A02;
        Object obj2 = threadLocal2.get();
        threadLocal.set(c103054kg);
        threadLocal2.set(enumC103014kc);
        C140136Vr c140136Vr = null;
        try {
            EnumC103014kc enumC103014kc2 = EnumC103014kc.A05;
            if (enumC103014kc == enumC103014kc2) {
                Object obj3 = C103054kg.A00()[1];
                if (obj3 == null) {
                    obj3 = null;
                }
                C140136Vr c140136Vr2 = (C140136Vr) obj3;
                try {
                    C103054kg.A00()[1] = null;
                    c140136Vr = c140136Vr2;
                } catch (Throwable th) {
                    th = th;
                    c140136Vr = c140136Vr2;
                    if (enumC103014kc == EnumC103014kc.A05) {
                        C103054kg.A00()[1] = c140136Vr;
                    }
                    threadLocal.set(obj);
                    threadLocal2.set(obj2);
                    throw th;
                }
            }
            Object invoke = interfaceC16820sZ.invoke();
            if (enumC103014kc == enumC103014kc2) {
                C103054kg.A00()[1] = c140136Vr;
            }
            threadLocal.set(obj);
            threadLocal2.set(obj2);
            return invoke;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final C103054kg A00() {
        return (C103054kg) AbstractC103024kd.A01.get();
    }
}
