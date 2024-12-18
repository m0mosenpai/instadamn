package X;

import com.facebook.msys.mci.Execution;

/* loaded from: classes12.dex */
public abstract class XkB {
    public static boolean A00;

    public static void A00() {
        if (!A00) {
            Execution.initialize();
            C09170dP.A0C("jniperflogger");
            C09170dP.A0C("rschatdtransportsenderapisjni");
            A00 = true;
        }
    }
}
