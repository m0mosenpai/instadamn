package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;

/* renamed from: X.PwE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58487PwE implements Runnable {
    public final /* synthetic */ C56I A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ Runnable A02;

    public RunnableC58487PwE(C56I c56i, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, Runnable runnable) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = c56i;
        this.A02 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56I c56i = this.A00;
        if (!c56i.isCancelled()) {
            try {
                this.A02.run();
                c56i.A06(null);
            } catch (Exception e) {
                c56i.A07(e);
            }
        }
    }
}
