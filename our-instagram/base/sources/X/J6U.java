package X;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class J6U extends ArrayList {
    public final int A00;

    public J6U(int i) {
        this.A00 = i;
        add(AbstractC41372ISz.A00(2131962626));
        add(AbstractC41372ISz.A00(2131973066));
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof L5P)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof L5P)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof L5P)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof L5P)) {
            return false;
        }
        return super.remove(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return super.size();
    }
}
