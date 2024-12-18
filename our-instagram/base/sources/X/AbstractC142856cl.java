package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC142856cl {
    public static final C5Fn A00;
    public static final C5Fn A01;

    public static final C5Fn A00(Looper looper) {
        AbstractC150996r0 abstractC150996r0 = AbstractC143086d8.A00;
        if (looper != null) {
            AbstractC150996r0 abstractC150996r02 = AbstractC150996r0.$redex_init_class;
            return new C5Fn(new C151026r3(new Handler(looper), true));
        }
        throw new NullPointerException("looper == null");
    }

    static {
        ExecutorC14110nb executorC14110nb = new ExecutorC14110nb(-20);
        AbstractC150996r0 abstractC150996r0 = AbstractC142866cm.A00;
        A00 = new C5Fn(new C151016r2(executorC14110nb));
        AbstractC150996r0 abstractC150996r02 = AbstractC143086d8.A00;
        if (abstractC150996r02 != null) {
            A01 = new C5Fn(abstractC150996r02);
            return;
        }
        throw new NullPointerException("scheduler == null");
    }
}
