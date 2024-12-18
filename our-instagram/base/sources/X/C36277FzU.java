package X;

import java.util.HashSet;

/* renamed from: X.FzU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36277FzU implements InterfaceC13000lm {
    public final FPM A00;
    public final java.util.Set A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C36277FzU(FPM fpm) {
        java.util.Set stringSet;
        this.A00 = fpm;
        HashSet A1H = AbstractC166987dD.A1H();
        this.A01 = A1H;
        synchronized (fpm) {
            stringSet = fpm.A00.getStringSet("thread_blocks_warned_on", null);
        }
        if (stringSet != null) {
            A1H.addAll(stringSet);
        }
    }
}
