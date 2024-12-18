package X;

import ca.psiphon.PsiphonTunnel;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes11.dex */
public final class U7I extends C14160ng {
    public final /* synthetic */ U7H A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7I(U7H u7h, Callable callable) {
        super(callable, 43, 3, false, true);
        this.A00 = u7h;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            Object obj = get();
            U7H u7h = this.A00;
            U7K u7k = U7H.A04;
            if (!u7h.A02.get()) {
                AbstractC58318PtA.A1F(U7H.A04, new U7J(u7h, obj), 1);
            }
        } catch (InterruptedException e) {
            android.util.Log.w(AbstractC111324zv.A00(PsiphonTunnel.VPN_INTERFACE_MTU), e);
        } catch (CancellationException unused) {
            U7H u7h2 = this.A00;
            U7K u7k2 = U7H.A04;
            if (!u7h2.A02.get()) {
                AbstractC58318PtA.A1F(U7H.A04, new U7J(u7h2, null), 1);
            }
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing doInBackground()", th);
        }
    }
}
