package X;

/* loaded from: classes10.dex */
public final class STX {
    public static volatile boolean A00;

    public static final synchronized void A00() {
        synchronized (STX.class) {
            if (!A00) {
                C09170dP.A0C("react_devsupportjni");
                A00 = true;
            }
        }
    }
}
