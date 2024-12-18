package X;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FzO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36271FzO implements InterfaceC13000lm {
    public final java.util.Set A00;

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        this.A00.clear();
    }

    public C36271FzO() {
        java.util.Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A00 = newSetFromMap;
    }
}
