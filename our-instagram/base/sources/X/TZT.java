package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TZT extends AbstractSet {
    public final /* synthetic */ TZK A00;

    public TZT(TZK tzk) {
        this.A00 = tzk;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        TZK tzk = this.A00;
        Map A02 = tzk.A02();
        if (A02 != null) {
            return A02.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int A00 = TZK.A00(tzk, entry.getKey());
            if (A00 != -1) {
                Object[] objArr = tzk.A05;
                objArr.getClass();
                if (AbstractC62214S2j.A00(objArr[A00], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        TZK tzk = this.A00;
        Map A02 = tzk.A02();
        if (A02 != null) {
            return AbstractC166997dE.A15(A02);
        }
        return new C60700RNc(tzk);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        TZK tzk = this.A00;
        Map A02 = tzk.A02();
        if (A02 != null) {
            return A02.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (tzk.A02 != null) {
                int i = (1 << (tzk.A00 & 31)) - 1;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = tzk.A02;
                obj2.getClass();
                int[] iArr = tzk.A03;
                iArr.getClass();
                Object[] objArr = tzk.A04;
                objArr.getClass();
                Object[] objArr2 = tzk.A05;
                objArr2.getClass();
                int A05 = AbstractC58321PtD.A05(AbstractC167017dG.A0M(key));
                int i2 = A05 & i;
                int A00 = AbstractC63070Sbr.A00(obj2, i2);
                if (A00 != 0) {
                    int i3 = i ^ (-1);
                    int i4 = A05 & i3;
                    int i5 = -1;
                    while (true) {
                        int i6 = A00 - 1;
                        int i7 = iArr[i6];
                        if ((i7 & i3) == i4 && AbstractC62214S2j.A00(key, objArr[i6]) && AbstractC62214S2j.A00(value, objArr2[i6])) {
                            int i8 = i7 & i;
                            if (i5 == -1) {
                                AbstractC63070Sbr.A02(obj2, i2, i8);
                            } else {
                                iArr[i5] = (i8 & i) | (iArr[i5] & i3);
                            }
                            if (i6 != -1) {
                                tzk.A03(i6, i);
                                tzk.A01--;
                                tzk.A00 += 32;
                                return true;
                            }
                        } else {
                            A00 = i7 & i;
                            if (A00 == 0) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
