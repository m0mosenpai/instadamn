package X;

/* loaded from: classes8.dex */
public final class M1K implements Runnable {
    public final /* synthetic */ C6DL A00;

    public M1K(C6DL c6dl) {
        this.A00 = c6dl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0K8.A0C("IgMsysLogcatDumper", AnonymousClass001.A0O("Logcat process exited unexpectedly with code: ", this.A00.A01.waitFor()));
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.A00.A01.destroy();
            throw th;
        }
        this.A00.A01.destroy();
    }
}
