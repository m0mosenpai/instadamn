package X;

import java.util.NoSuchElementException;

/* renamed from: X.9eT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC214299eT extends C1LC {
    public Object A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1W(this.A00);
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC200438tm BWu;
        InterfaceC200438tm interfaceC200438tm;
        Object obj = this.A00;
        if (obj != null) {
            if (this instanceof C214289eS) {
                BWu = ((InterfaceC200438tm) obj).BWv();
                interfaceC200438tm = ((C214289eS) this).A00.A00;
            } else {
                BWu = ((InterfaceC200438tm) obj).BWu();
                interfaceC200438tm = ((C214279eR) this).A00.A00;
            }
            if (BWu == interfaceC200438tm) {
                BWu = null;
            }
            this.A00 = BWu;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
