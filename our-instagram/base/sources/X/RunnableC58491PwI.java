package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.PwI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58491PwI implements Runnable {
    public final /* synthetic */ C56I A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ ListenableFuture A02;

    public RunnableC58491PwI(C56I c56i, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ListenableFuture listenableFuture) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = listenableFuture;
        this.A00 = c56i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A02.get();
            this.A00.A06(null);
        } catch (Exception e) {
            this.A00.A07(e);
        }
    }
}
