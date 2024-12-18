package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Ta7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64931Ta7 extends AbstractC17040sw implements Collection, InterfaceC15590qF {
    public final C6LT A00;

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.size();
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new TTA(this.A00);
    }

    public C64931Ta7(C6LT c6lt) {
        this.A00 = c6lt;
    }
}
