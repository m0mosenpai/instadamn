package X;

/* loaded from: classes6.dex */
public final class GP0 implements Runnable {
    public final /* synthetic */ C31714DwJ A00;
    public final /* synthetic */ C32272EJh A01;

    public GP0(C31714DwJ c31714DwJ, C32272EJh c32272EJh) {
        this.A00 = c31714DwJ;
        this.A01 = c32272EJh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9GR.A0E(this.A01.requireContext(), "request_error");
    }
}
