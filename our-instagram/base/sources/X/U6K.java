package X;

/* loaded from: classes11.dex */
public final class U6K implements Runnable {
    public final /* synthetic */ C66213U4j A00;
    public final /* synthetic */ C66206U4c A01;

    public U6K(C66213U4j c66213U4j, C66206U4c c66206U4c) {
        this.A00 = c66213U4j;
        this.A01 = c66206U4c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66213U4j c66213U4j = this.A00;
        c66213U4j.post(new RunnableC71399WtN(c66213U4j, this.A01));
    }
}
