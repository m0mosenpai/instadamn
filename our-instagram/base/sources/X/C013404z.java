package X;

import java.util.Iterator;

/* renamed from: X.04z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C013404z extends C0UG {
    public final Iterable A00;

    @Override // X.C0UG
    public final Object A00(InterfaceC71543Iw interfaceC71543Iw, InterfaceC23621Ds interfaceC23621Ds) {
        C14830ox c14830ox = new C14830ox(interfaceC71543Iw);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C0U9 c0u9 = new C0U9(null, (InterfaceC19390xP) it.next(), c14830ox);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c0u9, interfaceC71543Iw);
        }
        return C0eB.A00;
    }

    @Override // X.C0UG
    public final InterfaceC24751Is A02(C19L c19l) {
        return AbstractC71523Is.A03(this.A02, new C0UH(null, this), c19l, super.A00);
    }

    @Override // X.C0UG
    public final C0UG A04(Integer num, C12W c12w, int i) {
        return new C013404z(num, this.A00, c12w, i);
    }

    public C013404z(Integer num, Iterable iterable, C12W c12w, int i) {
        super(num, c12w, i);
        this.A00 = iterable;
    }
}
