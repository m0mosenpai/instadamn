package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.YHy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73528YHy implements Runnable {
    public final /* synthetic */ YNN A00;
    public final /* synthetic */ Y6Z A01;
    public final /* synthetic */ C72862XpO A02;

    public RunnableC73528YHy(YNN ynn, Y6Z y6z, C72862XpO c72862XpO) {
        this.A02 = c72862XpO;
        this.A00 = ynn;
        this.A01 = y6z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Y6Z y6z = (Y6Z) this.A00.Eq4(this.A01);
            if (y6z == null) {
                this.A02.A02(null);
            } else {
                y6z.A02(new C48116LRq(this, 0), Y6Z.A0A);
            }
        } catch (CancellationException unused) {
            this.A02.A00();
        } catch (Exception e) {
            this.A02.A01(e);
        }
    }
}
