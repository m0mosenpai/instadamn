package X;

import java.util.Iterator;

/* renamed from: X.TSb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64742TSb implements Iterator {
    public final Iterator A00;
    public final /* synthetic */ TZ6 A01;

    public C64742TSb(TZ6 tz6) {
        InterfaceC65685Ts7 interfaceC65685Ts7;
        this.A01 = tz6;
        interfaceC65685Ts7 = tz6.A00;
        this.A00 = interfaceC65685Ts7.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC43592JPx.A11();
    }
}
