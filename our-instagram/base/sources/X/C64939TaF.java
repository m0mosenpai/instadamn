package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TaF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64939TaF extends AnonymousClass041 {
    public final C5VS A00;

    @Override // X.AnonymousClass041
    public final int A00() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        Map.Entry entry;
        if ((obj instanceof Map.Entry) && (entry = (Map.Entry) obj) != null) {
            C5VS c5vs = this.A00;
            V v = c5vs.get(entry.getKey());
            Object value = entry.getValue();
            if (v != 0) {
                return v.equals(value);
            }
            if (value == null && c5vs.containsKey(entry.getKey())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new TTF(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        Map.Entry entry;
        if ((obj instanceof Map.Entry) && (entry = (Map.Entry) obj) != null) {
            return this.A00.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }

    public C64939TaF(C5VS c5vs) {
        this.A00 = c5vs;
    }

    @Override // X.AnonymousClass041, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    public C64939TaF() {
    }
}
