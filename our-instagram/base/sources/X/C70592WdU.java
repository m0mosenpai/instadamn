package X;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.WdU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70592WdU implements InterfaceC43681zz {
    public final Map A00 = new ConcurrentHashMap();

    @Override // X.InterfaceC43681zz
    public final void E70(C40R c40r, String str) {
        C14360o3.A0B(str, 0);
        this.A00.put(str, c40r);
    }

    @Override // X.InterfaceC43681zz
    public final void EEk(String str) {
        C14360o3.A0B(str, 0);
        this.A00.remove(str);
    }

    @Override // X.InterfaceC43681zz
    public final C40R AXH(String str) {
        return (C40R) this.A00.get(str);
    }

    @Override // X.InterfaceC43681zz
    public final Collection values() {
        return this.A00.values();
    }
}
