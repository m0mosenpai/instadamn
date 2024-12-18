package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Lcu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48503Lcu implements InterfaceC13000lm {
    public final Map A00 = new ConcurrentHashMap();

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        this.A00.clear();
    }
}
