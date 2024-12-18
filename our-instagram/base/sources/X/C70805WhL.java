package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.WhL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70805WhL implements InterfaceC13000lm {
    public final InterfaceC200458to A00;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        ((C200448tn) this.A00).A00.clear();
    }

    public C70805WhL() {
        C200148tJ c200148tJ = new C200148tJ();
        c200148tJ.A02(30L, TimeUnit.MINUTES);
        c200148tJ.A01(20L);
        this.A00 = c200148tJ.A00();
    }
}
