package X;

import java.util.Iterator;

/* renamed from: X.0si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16900si implements Iterable, InterfaceC15590qF {
    public final InterfaceC16820sZ A00;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C16890sh((Iterator) this.A00.invoke());
    }

    public C16900si(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
