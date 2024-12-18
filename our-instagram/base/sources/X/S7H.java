package X;

import java.io.PrintStream;

/* loaded from: classes10.dex */
public abstract class S7H {
    public static final AbstractC61586RqA A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.RqA] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    static {
        ?? r0;
        Integer num;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(printStream);
            }
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = RMU.class.getName();
            StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(name) + 133);
            A0q.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            A0q.append(name);
            printStream2.println(AbstractC166997dE.A0x("will be used. The error is: ", A0q));
            th.printStackTrace(printStream2);
            r0 = new Object();
        }
        if (num != null && num.intValue() >= 19) {
            r0 = new Object();
            A00 = r0;
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            r0 = new RMW();
        } else {
            r0 = new Object();
        }
        A00 = r0;
    }
}
