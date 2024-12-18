package X;

/* renamed from: X.RQk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60758RQk<E> extends AbstractC451325t<E> implements InterfaceC75173Zi<E> {
    @Override // X.InterfaceC75173Zi
    public final int AL0(Object element) {
        return ((RQr) this).A03.AL0(element);
    }

    @Override // X.InterfaceC75173Zi
    public final boolean ESE(Object element, int oldCount, int newCount) {
        return ((RQr) this).A03.ESE(element, oldCount, 0);
    }

    @Override // java.util.Collection, X.InterfaceC75173Zi
    public final int hashCode() {
        return ((RQr) this).A03.hashCode();
    }

    @Override // java.util.Collection, X.InterfaceC75173Zi
    public final boolean equals(Object object) {
        if (object != this && !((RQr) this).A03.equals(object)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC75173Zi
    public final int EEe(Object element, int occurrences) {
        return ((RQr) this).A03.EEe(element, Integer.MAX_VALUE);
    }
}
