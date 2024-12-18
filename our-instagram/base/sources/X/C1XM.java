package X;

import android.os.Looper;

/* renamed from: X.1XM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1XM {
    public static final Thread A00;

    public static final InterfaceC09390do A00(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        return AbstractC09440dt.A00(EnumC09460dv.A02, new C9E0(interfaceC16820sZ, 2));
    }

    static {
        Thread thread = Looper.getMainLooper().getThread();
        C14360o3.A07(thread);
        A00 = thread;
    }
}
