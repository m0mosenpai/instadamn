package X;

import java.util.ArrayDeque;

/* renamed from: X.3K7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K7 extends ArrayDeque {
    public static final C3K7 A00 = new ArrayDeque();

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null) {
            return super.contains(null);
        }
        return false;
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null) {
            return super.remove(null);
        }
        return false;
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ int size() {
        return super.size();
    }
}
