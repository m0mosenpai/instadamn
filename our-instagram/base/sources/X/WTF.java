package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class WTF implements InterfaceC94694Nw {
    @Override // X.InterfaceC94694Nw
    public final void F9Z(C02N c02n) {
    }

    @Override // X.InterfaceC94694Nw
    public final void EDM(Context context, final C02N c02n, Executor executor) {
        executor.execute(new Runnable() { // from class: X.WqL
            @Override // java.lang.Runnable
            public final void run() {
                C02N c02n2 = C02N.this;
                C14360o3.A0B(c02n2, 0);
                c02n2.accept(new C4PX(C16930sl.A00));
            }
        });
    }
}
