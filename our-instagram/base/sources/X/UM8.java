package X;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class UM8 extends AbstractC71663WyF implements Iterator {
    public final /* synthetic */ C71665WyH A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UM8(C71665WyH c71665WyH) {
        super(c71665WyH);
        this.A00 = c71665WyH;
    }

    @Override // java.util.Iterator
    public final Object next() {
        A01();
        return getValue();
    }
}
