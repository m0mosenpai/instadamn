package X;

/* loaded from: classes7.dex */
public final class J4L implements Runnable {
    public final /* synthetic */ C3KL A00;
    public final /* synthetic */ String A01;

    public J4L(C3KL c3kl, String str) {
        this.A00 = c3kl;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3KL c3kl = this.A00;
        if (c3kl.A06) {
            c3kl.A02 = this.A01;
        }
    }
}
