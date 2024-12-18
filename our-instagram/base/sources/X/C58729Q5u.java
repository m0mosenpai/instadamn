package X;

import java.util.Iterator;

/* renamed from: X.Q5u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C58729Q5u extends AbstractC128345r3 implements Iterator, C0s1 {
    public int A00;
    public boolean A01;
    public Object A02;
    public final C5VS A03;

    public C58729Q5u(C5VS c5vs, AbstractC128315r0[] abstractC128315r0Arr) {
        super(c5vs.A01, abstractC128315r0Arr);
        this.A03 = c5vs;
        this.A00 = c5vs.A00;
    }

    public static final void A00(C58729Q5u c58729Q5u, C57O c57o, Object obj, int i, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            AbstractC128315r0[] abstractC128315r0Arr = ((AbstractC128345r3) c58729Q5u).A02;
            AbstractC128315r0 abstractC128315r0 = abstractC128315r0Arr[i2];
            Object[] objArr = c57o.A02;
            int length = objArr.length;
            int i4 = 0;
            abstractC128315r0.A02 = objArr;
            abstractC128315r0.A00 = length;
            while (true) {
                abstractC128315r0.A01 = i4;
                if (C14360o3.A0K(abstractC128315r0.A02[i4], obj)) {
                    break;
                }
                abstractC128315r0 = abstractC128315r0Arr[i2];
                i4 = abstractC128315r0.A01 + 2;
            }
        } else {
            int i5 = 1 << ((i >> i3) & 31);
            int i6 = c57o.A00;
            if ((i5 & i6) != 0) {
                int A0A = c57o.A0A(i5);
                AbstractC128315r0 abstractC128315r02 = ((AbstractC128345r3) c58729Q5u).A02[i2];
                Object[] objArr2 = c57o.A02;
                int bitCount = Integer.bitCount(i6) * 2;
                abstractC128315r02.A02 = objArr2;
                abstractC128315r02.A00 = bitCount;
                abstractC128315r02.A01 = A0A;
            } else {
                int A0B = c57o.A0B(i5);
                C57O A0D = c57o.A0D(A0B);
                AbstractC128315r0 abstractC128315r03 = ((AbstractC128345r3) c58729Q5u).A02[i2];
                Object[] objArr3 = c57o.A02;
                int bitCount2 = Integer.bitCount(c57o.A00) * 2;
                abstractC128315r03.A02 = objArr3;
                abstractC128315r03.A00 = bitCount2;
                abstractC128315r03.A01 = A0B;
                A00(c58729Q5u, A0D, obj, i, i2 + 1);
                return;
            }
        }
        ((AbstractC128345r3) c58729Q5u).A00 = i2;
    }

    @Override // X.AbstractC128345r3, java.util.Iterator
    public final Object next() {
        if (this.A03.A00 == this.A00) {
            this.A02 = A02();
            this.A01 = true;
            return super.next();
        }
        throw AbstractC58318PtA.A0z();
    }

    @Override // X.AbstractC128345r3, java.util.Iterator
    public final void remove() {
        C5VS c5vs;
        if (this.A01) {
            if (hasNext()) {
                Object A02 = A02();
                c5vs = this.A03;
                C15500q5.A04(c5vs).remove(this.A02);
                A00(this, c5vs.A01, A02, AbstractC25235BEs.A06(A02), 0);
            } else {
                c5vs = this.A03;
                C15500q5.A04(c5vs).remove(this.A02);
            }
            this.A02 = null;
            this.A01 = false;
            this.A00 = c5vs.A00;
            return;
        }
        throw AbstractC58318PtA.A0Z();
    }
}
