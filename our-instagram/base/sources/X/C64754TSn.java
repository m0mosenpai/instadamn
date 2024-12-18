package X;

import com.google.common.collect.CompactHashSet;
import java.util.Iterator;

/* renamed from: X.TSn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64754TSn implements Iterator {
    public int A00;
    public int A01;
    public int A02 = -1;
    public final /* synthetic */ CompactHashSet A03;

    public C64754TSn(final CompactHashSet this$0) {
        this.A03 = this$0;
        this.A01 = this$0.A00;
        this.A00 = this$0.A02();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return MSY.A1R(this.A00);
    }

    @Override // java.util.Iterator
    public final Object next() {
        CompactHashSet compactHashSet = this.A03;
        if (compactHashSet.A00 == this.A01) {
            if (hasNext()) {
                int i = this.A00;
                this.A02 = i;
                Object[] objArr = compactHashSet.elements;
                objArr.getClass();
                Object obj = objArr[i];
                this.A00 = compactHashSet.A03(this.A00);
                return obj;
            }
            throw AbstractC58318PtA.A13();
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final void remove() {
        CompactHashSet compactHashSet = this.A03;
        if (compactHashSet.A00 == this.A01) {
            AbstractC58321PtD.A1T(MSY.A1R(this.A02));
            this.A01 += 32;
            int i = this.A02;
            Object[] objArr = compactHashSet.elements;
            objArr.getClass();
            compactHashSet.remove(objArr[i]);
            this.A00 = compactHashSet.A04(this.A00, this.A02);
            this.A02 = -1;
            return;
        }
        throw AbstractC58318PtA.A0z();
    }
}
