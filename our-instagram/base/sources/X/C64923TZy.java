package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.TZy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64923TZy extends FutureTask {
    public C63338Shs A00;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (!isCancelled()) {
                try {
                    C63338Shs.A00((C62958SZa) get(), this.A00);
                } catch (InterruptedException | ExecutionException e) {
                    C63338Shs.A00(new C62958SZa(e), this.A00);
                }
            }
        } finally {
            this.A00 = null;
        }
    }
}
