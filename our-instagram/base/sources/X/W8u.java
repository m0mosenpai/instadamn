package X;

/* loaded from: classes11.dex */
public final class W8u {
    public boolean A00;
    public final /* synthetic */ C71187WpZ A01;

    public W8u(C71187WpZ c71187WpZ) {
        this.A01 = c71187WpZ;
    }

    public static void A00(W8u w8u, Exception exc) {
        if (!w8u.A00) {
            w8u.A00 = true;
            C68874VdW c68874VdW = w8u.A01.A0A;
            synchronized (c68874VdW) {
                if (!c68874VdW.A01) {
                    c68874VdW.A01 = true;
                    c68874VdW.A00 = exc;
                    c68874VdW.notifyAll();
                }
            }
        }
    }

    public W8u() {
    }
}
