package com.google.common.collect;

import X.AbstractC103614ld;
import X.AbstractC63123SdR;
import X.AnonymousClass001;
import X.C18C;
import X.C1Jk;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableList A00;

    /* loaded from: classes10.dex */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public Object readResolve() {
            return ImmutableSet.A04(this.elements);
        }

        public SerializedForm(Object[] elements) {
            this.elements = elements;
        }
    }

    public static ImmutableSet A00(Object e1, Object e2) {
        return A05(new Object[]{e1, e2}, 2);
    }

    public static ImmutableSet A01(Object e1, Object e2, Object e3) {
        return A05(new Object[]{e1, e2, e3}, 3);
    }

    public static ImmutableSet A02(Object e1, Object e2, Object e3, Object e4, Object e5, Object e6, Object... others) {
        int length = others.length;
        int i = length + 6;
        Object[] objArr = new Object[i];
        objArr[0] = e1;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(others, 0, objArr, 6, length);
        return A05(objArr, i);
    }

    public static ImmutableSet A04(Object[] elements) {
        int length = elements.length;
        if (length != 0) {
            if (length != 1) {
                return A05((Object[]) elements.clone(), length);
            }
            return new SingletonImmutableSet(elements[0]);
        }
        return RegularImmutableSet.A03;
    }

    public static ImmutableSet A05(Object[] n, int elements) {
        Object obj;
        Object[] objArr = n;
        if (elements != 0) {
            if (elements != 1) {
                int chooseTableSize = chooseTableSize(elements);
                Object[] objArr2 = new Object[chooseTableSize];
                int i = chooseTableSize - 1;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < elements; i4++) {
                    Object obj2 = objArr[i4];
                    if (obj2 != null) {
                        int hashCode = obj2.hashCode();
                        int A01 = C1Jk.A01(hashCode);
                        while (true) {
                            int i5 = A01 & i;
                            Object obj3 = objArr2[i5];
                            if (obj3 == null) {
                                objArr[i3] = obj2;
                                objArr2[i5] = obj2;
                                i2 += hashCode;
                                i3++;
                                break;
                            }
                            if (!obj3.equals(obj2)) {
                                A01++;
                            }
                        }
                    } else {
                        throw new NullPointerException(AnonymousClass001.A0O("at index ", i4));
                    }
                }
                Arrays.fill(objArr, i3, elements, (Object) null);
                if (i3 == 1) {
                    obj = objArr[0];
                } else {
                    if (chooseTableSize(i3) < chooseTableSize / 2) {
                        return A05(objArr, i3);
                    }
                    int length = objArr.length;
                    if (i3 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i3);
                    }
                    return new RegularImmutableSet(objArr, objArr2, i2, i, i3);
                }
            } else {
                obj = n[0];
            }
            obj.getClass();
            return new SingletonImmutableSet(obj);
        }
        return RegularImmutableSet.A03;
    }

    public static int chooseTableSize(int setSize) {
        int i;
        int max = Math.max(setSize, 2);
        boolean z = true;
        if (max < 751619276) {
            i = Integer.highestOneBit(max - 1) << 1;
            while (i * 0.7d < max) {
                i <<= 1;
            }
        } else {
            i = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
            if (max >= 1073741824) {
                z = false;
            }
            C18C.A0G(z, "collection too large");
        }
        return i;
    }

    public boolean A0D() {
        return false;
    }

    public static ImmutableSet A03(Collection elements) {
        if ((elements instanceof ImmutableSet) && !(elements instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) elements;
            if (!immutableSet.A0B()) {
                return immutableSet;
            }
        }
        Object[] array = elements.toArray();
        return A05(array, array.length);
    }

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList asList() {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            ImmutableList A0C = A0C();
            this.A00 = A0C;
            return A0C;
        }
        return immutableList;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof ImmutableSet) && A0D() && ((ImmutableSet) object).A0D() && hashCode() != object.hashCode()) {
            return false;
        }
        return AbstractC103614ld.A05(object, this);
    }

    public ImmutableList A0C() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC103614ld.A00(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
