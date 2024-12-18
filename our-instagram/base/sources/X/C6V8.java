package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* renamed from: X.6V8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6V8 {
    public static final C6V8 A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable, X.3Qv] */
    public static final ListenableFuture A01(final String str, boolean z) {
        if (z) {
            C6VA c6va = new C6VA() { // from class: X.6V9
                @Override // X.C6VA
                public final ListenableFuture AFL() {
                    return C6V8.A00(str);
                }
            };
            ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(C14120nc.A00(), 260801298, 3, false, false);
            ?? obj = new Object();
            obj.A00 = new C6VB(c6va, obj);
            executorC14040nU.execute(obj);
            return obj;
        }
        return A00(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    public static final ListenableFuture A00(String str) {
        try {
            C16L A03 = AbstractC221915u.A00.A03(str);
            try {
                A03.A1J();
                C102824kJ A01 = AbstractC102744kB.A00(A03).A01();
                A03.close();
                return C2OD.A02(C1338462s.A03(null, A01, null));
            } finally {
            }
        } catch (IOException e) {
            ?? obj = new Object();
            obj.setException(e);
            return obj;
        }
    }
}
