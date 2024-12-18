package X;

import androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
import java.util.Iterator;

/* renamed from: X.0l1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12570l1 implements Iterator, C0s1 {
    public int A00 = -1;
    public final Iterator A01;
    public final /* synthetic */ C18570vk A02;

    public C12570l1(C18570vk c18570vk) {
        this.A02 = c18570vk;
        this.A01 = AbstractC224917l.A0D(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this, c18570vk, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.A01.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.A00;
        if (i != -1) {
            this.A02.A06(i);
            this.A00 = -1;
        }
    }
}
