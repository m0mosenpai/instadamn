package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Lct, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48502Lct implements InterfaceC13000lm {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
