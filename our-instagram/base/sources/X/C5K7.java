package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5K7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5K7 implements C5K8, InterfaceC13000lm {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public final List A01 = new ArrayList();

    @Override // X.C5K8
    public final void EPB(EnumC222416a enumC222416a, String str) {
        C14360o3.A0B(str, 0);
        if (enumC222416a != null && enumC222416a != EnumC222416a.A08) {
            this.A00.put(str, enumC222416a);
            Iterator it = this.A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("getAuthorIds");
            }
        }
        this.A01.clear();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
