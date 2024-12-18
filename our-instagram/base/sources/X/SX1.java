package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class SX1 {
    public Throwable A00;
    public final int A01;
    public final int A02;
    public final long A03 = System.nanoTime();
    public final String A04;
    public final int A05;

    public static Throwable A00(SX1 sx1) {
        Throwable th = sx1.A00;
        if (th == null) {
            RuntimeException A18 = AbstractC166987dD.A18(AnonymousClass001.A07(sx1.A05, "Binder description: ", sx1.A04, " code: "));
            sx1.A00 = A18;
            StackTraceElement[] stackTrace = A18.getStackTrace();
            int i = 0;
            while (true) {
                int length = stackTrace.length;
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().equals("android.os.BinderProxy") && stackTraceElement.getMethodName().equals("transact")) {
                    if (i != 0) {
                        sx1.A00.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, length));
                    }
                } else {
                    i++;
                }
            }
            return sx1.A00;
        }
        return th;
    }

    public SX1(int i, String str, int i2, int i3) {
        this.A02 = i;
        this.A04 = str;
        this.A05 = i2;
        this.A01 = i3;
    }
}
