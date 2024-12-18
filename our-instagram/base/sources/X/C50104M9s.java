package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.M9s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50104M9s<T> extends AbstractSet<Map.Entry<C6C2, T>> {
    public final /* synthetic */ C93834Jr A00;

    public C50104M9s(C93834Jr c93834Jr) {
        this.A00 = c93834Jr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C93834Jr c93834Jr = this.A00;
        return new C50041M7e(c93834Jr, AbstractC166997dE.A15(c93834Jr.A02), AbstractC166997dE.A15(c93834Jr.A01));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        C93834Jr c93834Jr = this.A00;
        return c93834Jr.A02.size() + c93834Jr.A01.size();
    }
}
