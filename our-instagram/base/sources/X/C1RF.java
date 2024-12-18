package X;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.1RF, reason: invalid class name */
/* loaded from: classes.dex */
public class C1RF extends C1RG {
    public int A00;
    public Object[] hashTable;

    public C1RF() {
        this.A02 = new Object[4];
        super.A00 = 0;
    }

    @Override // X.AbstractC24851Je
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public ImmutableSet build() {
        ImmutableSet A05;
        int i = super.A00;
        if (i != 0) {
            if (i != 1) {
                if (this.hashTable != null && ImmutableSet.chooseTableSize(i) == this.hashTable.length) {
                    int i2 = super.A00;
                    Object[] objArr = this.A02;
                    int length = objArr.length;
                    if (i2 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i2);
                    }
                    int i3 = this.A00;
                    A05 = new RegularImmutableSet(objArr, this.hashTable, i3, r6.length - 1, super.A00);
                } else {
                    A05 = ImmutableSet.A05(this.A02, super.A00);
                    super.A00 = A05.size();
                }
                this.A01 = true;
                this.hashTable = null;
                return A05;
            }
            Object obj = this.A02[0];
            obj.getClass();
            return new SingletonImmutableSet(obj);
        }
        return RegularImmutableSet.A03;
    }

    public final void A07(Object... elements) {
        if (this.hashTable != null) {
            for (Object obj : elements) {
                A04(obj);
            }
            return;
        }
        int length = elements.length;
        C1LH.A00(elements, length);
        C1RG.A01(this, super.A00 + length);
        System.arraycopy(elements, 0, this.A02, super.A00, length);
        super.A00 += length;
    }

    public C1RF A04(Object element) {
        element.getClass();
        if (this.hashTable != null) {
            int chooseTableSize = ImmutableSet.chooseTableSize(super.A00);
            int length = this.hashTable.length;
            if (chooseTableSize <= length) {
                int i = length - 1;
                int hashCode = element.hashCode();
                int A01 = C1Jk.A01(hashCode);
                while (true) {
                    int i2 = A01 & i;
                    Object[] objArr = this.hashTable;
                    Object obj = objArr[i2];
                    if (obj == null) {
                        objArr[i2] = element;
                        this.A00 += hashCode;
                        break;
                    }
                    if (obj.equals(element)) {
                        break;
                    }
                    A01 = i2 + 1;
                }
                C1RG.A01(this, super.A00 + 1);
                Object[] objArr2 = this.A02;
                int i3 = super.A00;
                super.A00 = i3 + 1;
                objArr2[i3] = element;
                return this;
            }
        }
        this.hashTable = null;
        C1RG.A01(this, super.A00 + 1);
        Object[] objArr22 = this.A02;
        int i32 = super.A00;
        super.A00 = i32 + 1;
        objArr22[i32] = element;
        return this;
    }

    public final void A06(Iterable elements) {
        elements.getClass();
        if (this.hashTable != null) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                A04(it.next());
            }
            return;
        }
        A03(elements);
    }

    @Override // X.AbstractC24851Je
    public /* bridge */ /* synthetic */ AbstractC24851Je add(Object element) {
        A04(element);
        return this;
    }
}
