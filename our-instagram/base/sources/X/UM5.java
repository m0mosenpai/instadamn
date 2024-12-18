package X;

import java.util.NoSuchElementException;

/* loaded from: classes11.dex */
public abstract class UM5 extends AbstractC71660WyC {
    public Integer A00 = C05F.A01;
    public Object A01;

    public Object A00() {
        Long l;
        Long l2;
        UM4 um4 = (UM4) this;
        C69692Vtm c69692Vtm = um4.A04;
        if (!c69692Vtm.A01() && !um4.A05.A01()) {
            ((UM5) um4).A00 = C05F.A0C;
            return null;
        }
        Object obj = null;
        if (c69692Vtm.A01()) {
            X96 x96 = um4.A02;
            if (!c69692Vtm.A01) {
                c69692Vtm.A00 = c69692Vtm.A02.next();
                c69692Vtm.A01 = true;
            }
            l = x96.AUE(c69692Vtm.A00);
            Object obj2 = um4.A00;
            if (obj2 != null) {
                boolean A1O = AbstractC167007dF.A1O(um4.A06.compare(l, obj2));
                StringBuilder sb = new StringBuilder("Left iterator keys must be strictly ascending. (");
                sb.append(um4.A00);
                String A0n = AbstractC167017dG.A0n(l, " ", sb);
                if (!A1O) {
                    throw new IllegalStateException(String.valueOf(A0n));
                }
            }
        } else {
            l = null;
        }
        C69692Vtm c69692Vtm2 = um4.A05;
        if (c69692Vtm2.A01()) {
            X96 x962 = um4.A03;
            if (!c69692Vtm2.A01) {
                c69692Vtm2.A00 = c69692Vtm2.A02.next();
                c69692Vtm2.A01 = true;
            }
            l2 = x962.AUE(c69692Vtm2.A00);
            Object obj3 = um4.A01;
            if (obj3 != null) {
                boolean A1O2 = AbstractC167007dF.A1O(um4.A06.compare(l2, obj3));
                StringBuilder sb2 = new StringBuilder("Right iterator keys must be strictly ascending. (");
                sb2.append(um4.A01);
                String A0n2 = AbstractC167017dG.A0n(l2, " ", sb2);
                if (!A1O2) {
                    throw new IllegalStateException(String.valueOf(A0n2));
                }
            }
        } else {
            l2 = null;
        }
        if (c69692Vtm.A01() || !c69692Vtm2.A01()) {
            if (c69692Vtm.A01() && !c69692Vtm2.A01()) {
                return new C68896Vdt(c69692Vtm.A00(), null);
            }
            int compare = um4.A06.compare(l, l2);
            if (compare > 0) {
                um4.A01 = l2;
            } else {
                if (compare < 0) {
                    um4.A00 = l;
                    return new C68896Vdt(c69692Vtm.A00(), null);
                }
                um4.A01 = l2;
                um4.A00 = l;
                obj = c69692Vtm.A00();
            }
        }
        return new C68896Vdt(obj, c69692Vtm2.A00());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Integer num = this.A00;
        Integer num2 = C05F.A0N;
        if (num != num2) {
            int intValue = num.intValue();
            if (intValue == 2) {
                return false;
            }
            if (intValue == 0) {
                return true;
            }
            this.A00 = num2;
            this.A01 = A00();
            if (this.A00 != C05F.A0C) {
                this.A00 = C05F.A00;
                return true;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.A00 = C05F.A01;
            return this.A01;
        }
        throw new NoSuchElementException();
    }
}
