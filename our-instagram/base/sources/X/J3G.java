package X;

/* loaded from: classes7.dex */
public final class J3G implements Runnable {
    public final /* synthetic */ HD4 A00;

    public J3G(HD4 hd4) {
        this.A00 = hd4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HD4 hd4 = this.A00;
        if (hd4.isResumed()) {
            HEL hel = hd4.A08;
            if (hel == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            hel.A02 = false;
        }
    }
}
