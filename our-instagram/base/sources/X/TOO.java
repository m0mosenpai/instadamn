package X;

/* loaded from: classes10.dex */
public final class TOO implements Runnable {
    public final /* synthetic */ Q8J A00;
    public final /* synthetic */ C63406Sjd A01;

    public TOO(Q8J q8j, C63406Sjd c63406Sjd) {
        this.A00 = q8j;
        this.A01 = c63406Sjd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC63144Sdq abstractC63144Sdq = this.A00.A02;
        C63406Sjd c63406Sjd = this.A01;
        Q8J q8j = abstractC63144Sdq.A03;
        if (q8j.A02() != c63406Sjd) {
            q8j.A0B(c63406Sjd);
        }
    }
}
