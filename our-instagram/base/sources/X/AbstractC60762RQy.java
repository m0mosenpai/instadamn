package X;

/* renamed from: X.RQy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60762RQy<E> extends AbstractC451325t<E> implements java.util.Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        java.util.Set set;
        if (this instanceof RQw) {
            set = ((RQw) this).A00.A00;
        } else {
            set = ((RQx) this).A00;
        }
        return set.hashCode();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object object) {
        java.util.Set set;
        if (object != this) {
            if (this instanceof RQw) {
                set = ((RQw) this).A00.A00;
            } else {
                set = ((RQx) this).A00;
            }
            if (!set.equals(object)) {
                return false;
            }
        }
        return true;
    }
}
