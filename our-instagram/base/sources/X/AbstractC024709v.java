package X;

import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: X.09v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC024709v<E> extends AbstractCollection<E> implements Collection<E>, C0YV {
    public abstract int A00();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return A00();
    }
}
