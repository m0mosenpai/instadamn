package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.47i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C915247i {
    public boolean A01;
    public final C47Z A02;
    public volatile boolean A05;
    public final java.util.Set A04 = new LinkedHashSet();
    public final Object A03 = new Object();
    public C915347j A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.Set] */
    public final void A00() {
        ?? r3 = this.A03;
        synchronized (r3) {
            if (!this.A01) {
            }
        }
        r3 = this.A04;
        synchronized (r3) {
            Iterator it = new ArrayList((Collection) r3).iterator();
            while (it.hasNext()) {
                ((InterfaceC65982ya) it.next()).Dbp(this.A02);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.47j] */
    public C915247i(C47Z c47z) {
        this.A02 = c47z;
    }
}
