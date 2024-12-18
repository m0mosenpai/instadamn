package X;

/* loaded from: classes7.dex */
public final class J5N implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewOnKeyListenerC677333n A02;

    public J5N(ViewOnKeyListenerC677333n viewOnKeyListenerC677333n, int i, int i2) {
        this.A02 = viewOnKeyListenerC677333n;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        ViewOnKeyListenerC677333n viewOnKeyListenerC677333n = this.A02;
        C38321qM A00 = ViewOnKeyListenerC677333n.A00(viewOnKeyListenerC677333n);
        if (this.A00 == 24) {
            if (!viewOnKeyListenerC677333n.A08.isPlaying() && A00 != null) {
                C4TE c4te = (C4TE) viewOnKeyListenerC677333n.A09.get(A00);
                if (c4te != null) {
                    f = c4te.A00;
                } else {
                    f = 0.0f;
                }
                if (ViewOnKeyListenerC677333n.A07(viewOnKeyListenerC677333n, f) && !AbstractC76643c9.A0H(viewOnKeyListenerC677333n.A06, A00)) {
                    ViewOnKeyListenerC677333n.A05(A00, viewOnKeyListenerC677333n);
                    return;
                }
                return;
            }
            return;
        }
        if (this.A01 != 0 || A00 == null) {
            return;
        }
        ViewOnKeyListenerC677333n.A04(A00, viewOnKeyListenerC677333n);
    }
}
