package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.PwR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58498PwR implements Runnable {
    public final /* synthetic */ C56I A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ List A02;

    public RunnableC58498PwR(C56I c56i, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = list;
        this.A00 = c56i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (Object obj : this.A02) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A01;
            shortcutInfoCompatSaverImpl.A04.remove(obj);
            Future future = (Future) shortcutInfoCompatSaverImpl.A03.remove(obj);
            if (future != null) {
                future.cancel(false);
            }
        }
        this.A01.A01(this.A00);
    }
}
