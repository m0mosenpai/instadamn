package X;

/* renamed from: X.1EJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EJ {
    public static C1EI A00;

    public static synchronized void A00() {
        synchronized (C1EJ.class) {
            C1EI c1ei = A00;
            if (c1ei != null) {
                c1ei.A00 = true;
            } else {
                throw new RuntimeException("MCPExperimentSharedPreferences is not initialized.");
            }
        }
    }

    public static synchronized void A01(C1EI c1ei) {
        synchronized (C1EJ.class) {
            if (A00 == null) {
                A00 = c1ei;
            }
        }
    }
}
