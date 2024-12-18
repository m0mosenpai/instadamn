package X;

import android.util.SparseArray;
import com.facebookpay.form.cell.CellParams;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class UFM extends AbstractC52922bZ {
    public W4G A00;
    public ImmutableList A01;
    public final C58252li A02 = new C58252li();
    public final C2GS A04 = new C2GS();
    public final C58252li A03 = new C58252li();

    /* JADX WARN: Multi-variable type inference failed */
    public final SparseArray A00() {
        SparseArray sparseArray = new SparseArray();
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            int size = immutableList.size();
            for (int i = 0; i < size; i++) {
                ImmutableList immutableList2 = this.A01;
                if (immutableList2 != null) {
                    SparseArray A09 = ((AbstractC129435t5) immutableList2.get(i)).A09();
                    int size2 = A09.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        AbstractC65702TsY.A10(A09, sparseArray, i2);
                    }
                }
            }
            return sparseArray;
        }
        C14360o3.A0F("cellViewModels");
        throw C00O.createAndThrow();
    }

    public final AbstractC129435t5 A01(int i) {
        ImmutableList immutableList = this.A01;
        Object obj = null;
        if (immutableList == null) {
            C14360o3.A0F("cellViewModels");
            throw C00O.createAndThrow();
        }
        Iterator<E> it = immutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AbstractC129435t5) next).A02 == i) {
                obj = next;
                break;
            }
        }
        return (AbstractC129435t5) obj;
    }

    public final void A02() {
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            Iterator<E> it = immutableList.iterator();
            boolean z = true;
            while (it.hasNext()) {
                AbstractC129435t5 abstractC129435t5 = (AbstractC129435t5) it.next();
                abstractC129435t5.A0D(z);
                if (z && !abstractC129435t5.A0F()) {
                    z = false;
                }
            }
        }
    }

    public final void A03(W4G w4g, ImmutableList immutableList) {
        C2GT c2gt;
        C2GT c2gt2;
        C2GS c2gs = this.A04;
        c2gs.A0B(immutableList);
        this.A00 = w4g;
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 != null && !immutableList2.isEmpty()) {
            ImmutableList immutableList3 = this.A01;
            if (immutableList3 == null) {
                C14360o3.A0F("cellViewModels");
                throw C00O.createAndThrow();
            }
            C1LC A0I = AbstractC43592JPx.A0I(immutableList3);
            while (A0I.hasNext()) {
                AbstractC129435t5 abstractC129435t5 = (AbstractC129435t5) A0I.next();
                C58252li c58252li = this.A02;
                if (abstractC129435t5 instanceof AbstractC129455t8) {
                    c2gt2 = ((AbstractC129455t8) abstractC129435t5).A02;
                } else {
                    c2gt2 = abstractC129435t5.A06;
                }
                c58252li.A0D(c2gt2);
                abstractC129435t5.A0G();
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        Object A02 = c2gs.A02();
        if (A02 != null) {
            C1LC A0I2 = AbstractC43592JPx.A0I((ImmutableCollection) A02);
            while (A0I2.hasNext()) {
                CellParams cellParams = (CellParams) A0I2.next();
                AbstractC129435t5 A01 = cellParams.A01();
                cellParams.A00 = A01;
                A01.A0B(this.A00);
                C58252li c58252li2 = this.A02;
                if (A01 instanceof AbstractC129455t8) {
                    c2gt = ((AbstractC129455t8) A01).A02;
                } else {
                    c2gt = A01.A06;
                }
                AbstractC58321PtD.A1D(c2gt, c58252li2, new X59(this, 23), 14);
                builder.add((Object) A01);
                AbstractC58321PtD.A1D(A01.A05, this.A03, new X59(this, 24), 14);
            }
            this.A01 = builder.build();
            MSX.A1B(this.A03, A04());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final boolean A04() {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            C14360o3.A0F("cellViewModels");
            throw C00O.createAndThrow();
        }
        C1LC A0I = AbstractC43592JPx.A0I(immutableList);
        while (A0I.hasNext()) {
            if (!((AbstractC129435t5) A0I.next()).A0F()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                ((AbstractC129435t5) it.next()).A0G();
            }
        }
    }
}
