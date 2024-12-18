package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class RM1 extends RM5 {
    public final transient Object A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // X.AbstractC64897TYx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.equals(obj);
    }

    @Override // X.RM5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, X.RMA] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        Object obj = this.A00;
        ?? obj2 = new Object();
        obj2.A00 = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AnonymousClass001.A0g("[", this.A00.toString(), "]");
    }

    public RM1(Object obj) {
        this.A00 = obj;
    }
}
