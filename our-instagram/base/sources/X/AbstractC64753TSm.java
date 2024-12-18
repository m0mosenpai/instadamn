package X;

import com.google.common.collect.AbstractMapBasedMultiset;
import java.util.Iterator;

/* renamed from: X.TSm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64753TSm implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ AbstractMapBasedMultiset A03;

    public AbstractC64753TSm(final AbstractMapBasedMultiset this$0) {
        this.A03 = this$0;
        C63033Sb7 c63033Sb7 = this$0.A01;
        this.A00 = c63033Sb7.A02();
        this.A02 = -1;
        this.A01 = c63033Sb7.A01;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A03.A01.A01 == this.A01) {
            return MSY.A1R(this.A00);
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMapBasedMultiset abstractMapBasedMultiset = this.A03;
        if (abstractMapBasedMultiset.A01.A01 == this.A01) {
            AbstractC58321PtD.A1T(MSY.A1S(this.A02, -1));
            abstractMapBasedMultiset.A00 -= abstractMapBasedMultiset.A01.A04(this.A02);
            C63033Sb7 c63033Sb7 = abstractMapBasedMultiset.A01;
            int i = this.A00;
            int i2 = this.A02;
            if (c63033Sb7 instanceof RS7) {
                if (i == c63033Sb7.A02) {
                    i = i2;
                }
            } else {
                i--;
            }
            this.A00 = i;
            this.A02 = -1;
            this.A01 = c63033Sb7.A01;
            return;
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        if (hasNext()) {
            int i = this.A00;
            if (this instanceof RQF) {
                C63033Sb7 c63033Sb7 = ((RQF) this).A00.A01;
                C18C.A01(i, c63033Sb7.A02);
                obj = new RS1(c63033Sb7, i);
            } else {
                C63033Sb7 c63033Sb72 = ((RQE) this).A00.A01;
                C18C.A01(i, c63033Sb72.A02);
                obj = c63033Sb72.A06[i];
            }
            int i2 = this.A00;
            this.A02 = i2;
            this.A00 = this.A03.A01.A03(i2);
            return obj;
        }
        throw AbstractC58318PtA.A13();
    }
}
