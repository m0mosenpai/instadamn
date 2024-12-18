package X;

import com.google.common.collect.CompactHashMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.49f, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C49f implements Iterator {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final /* synthetic */ CompactHashMap A03;

    public Object A00(int entry) {
        return new C918049g(((C49e) this).A00, entry);
    }

    public C49f(final CompactHashMap this$0) {
        this.A03 = this$0;
        this.A01 = this$0.A00;
        this.A00 = this$0.A04();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        CompactHashMap compactHashMap = this.A03;
        if (compactHashMap.A00 == this.A01) {
            if (hasNext()) {
                int i = this.A00;
                this.A02 = i;
                Object A00 = A00(i);
                this.A00 = compactHashMap.A05(this.A00);
                return A00;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        CompactHashMap compactHashMap = this.A03;
        if (compactHashMap.A00 == this.A01) {
            boolean z = false;
            if (this.A02 >= 0) {
                z = true;
            }
            C18C.A0H(z, AbstractC58317Pt9.A00(316));
            this.A01 += 32;
            int i = this.A02;
            Object[] objArr = compactHashMap.keys;
            objArr.getClass();
            compactHashMap.remove(objArr[i]);
            this.A00 = compactHashMap.A06(this.A00, this.A02);
            this.A02 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
