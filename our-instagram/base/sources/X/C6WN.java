package X;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6WN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WN implements InterfaceC13000lm {
    public final java.util.Set A00 = new HashSet();
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.set(false);
    }
}
