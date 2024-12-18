package X;

import java.util.concurrent.Callable;

/* renamed from: X.TOi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64651TOi implements Runnable {
    public final /* synthetic */ C5KS A00;
    public final /* synthetic */ Callable A01;

    public RunnableC64651TOi(C5KS c5ks, Callable callable) {
        this.A00 = c5ks;
        this.A01 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.A0D(this.A01.call());
        } catch (Exception e) {
            this.A00.A0C(e);
        } catch (Throwable th) {
            this.A00.A0C(AbstractC58318PtA.A0f(th));
        }
    }
}
