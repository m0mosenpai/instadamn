package X;

import com.google.common.collect.HashBiMap;
import java.util.Iterator;

/* renamed from: X.TSr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64757TSr implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ TZS A04;

    public C64757TSr(final TZS this$0) {
        this.A04 = this$0;
        HashBiMap hashBiMap = this$0.A00;
        this.A01 = hashBiMap.A00;
        this.A02 = -1;
        this.A00 = hashBiMap.A01;
        this.A03 = hashBiMap.A02;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A04.A00.A01 == this.A00) {
            if (this.A01 != -2 && this.A03 > 0) {
                return true;
            }
            return false;
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final void remove() {
        HashBiMap hashBiMap = this.A04.A00;
        if (hashBiMap.A01 == this.A00) {
            AbstractC58321PtD.A1T(MSY.A1S(this.A02, -1));
            int i = this.A02;
            HashBiMap.A07(hashBiMap, i, C1Jk.A02(hashBiMap.A0B[i]), C1Jk.A02(hashBiMap.A0C[i]));
            if (this.A01 == hashBiMap.A02) {
                this.A01 = this.A02;
            }
            this.A02 = -1;
            this.A00 = hashBiMap.A01;
            return;
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object rqj;
        Object[] objArr;
        if (hasNext()) {
            TZS tzs = this.A04;
            int i = this.A01;
            if (tzs instanceof RR2) {
                objArr = ((RR2) tzs).A00.A0C;
            } else if (tzs instanceof RR1) {
                objArr = ((RR1) tzs).A00.A0B;
            } else {
                if (tzs instanceof C60763RQz) {
                    rqj = new RQK(tzs.A00, i);
                } else {
                    rqj = new RQJ(((RR0) tzs).A00, i);
                }
                this.A02 = i;
                this.A01 = tzs.A00.A09[i];
                this.A03--;
                return rqj;
            }
            rqj = objArr[i];
            this.A02 = i;
            this.A01 = tzs.A00.A09[i];
            this.A03--;
            return rqj;
        }
        throw AbstractC58318PtA.A13();
    }
}
