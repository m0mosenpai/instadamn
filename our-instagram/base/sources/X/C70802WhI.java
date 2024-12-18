package X;

import java.util.HashSet;

/* renamed from: X.WhI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70802WhI implements InterfaceC13000lm {
    public final java.util.Set A00 = new HashSet();

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
