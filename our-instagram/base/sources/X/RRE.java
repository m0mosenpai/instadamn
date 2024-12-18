package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class RRE extends ImmutableMap.Builder {
    public final Comparator A00;
    public transient Object[] A01;
    public transient Object[] A02;

    public RRE(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.A00 = comparator;
        this.A01 = new Object[4];
        this.A02 = new Object[4];
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    /* renamed from: A00, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ImmutableSortedMap buildOrThrow() {
        RegularImmutableSortedSet regularImmutableSortedSet;
        ImmutableList of;
        int i = this.size;
        if (i != 0) {
            if (i != 1) {
                Object[] copyOf = Arrays.copyOf(this.A01, i);
                Comparator comparator = this.A00;
                Arrays.sort(copyOf, comparator);
                Object[] objArr = new Object[this.size];
                for (int i2 = 0; i2 < this.size; i2++) {
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (comparator.compare(copyOf[i3], copyOf[i2]) == 0) {
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("keys required to be distinct but compared as equal: ");
                            A1C.append(copyOf[i3]);
                            A1C.append(" and ");
                            throw AbstractC43594JPz.A0n(copyOf[i2], A1C);
                        }
                    }
                    Object obj = this.A01[i2];
                    obj.getClass();
                    int binarySearch = Arrays.binarySearch(copyOf, obj, comparator);
                    Object obj2 = this.A02[i2];
                    obj2.getClass();
                    objArr[binarySearch] = obj2;
                }
                ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.A03;
                RegularImmutableSortedSet regularImmutableSortedSet2 = RegularImmutableSortedSet.A00;
                regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.asImmutableList(copyOf), comparator);
                of = ImmutableList.asImmutableList(objArr);
            } else {
                Comparator comparator2 = this.A00;
                Object obj3 = this.A01[0];
                obj3.getClass();
                Object obj4 = this.A02[0];
                obj4.getClass();
                ImmutableSortedMap immutableSortedMap2 = ImmutableSortedMap.A03;
                RegularImmutableSortedSet regularImmutableSortedSet3 = RegularImmutableSortedSet.A00;
                regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.of(obj3), comparator2);
                of = ImmutableList.of(obj4);
            }
            return new ImmutableSortedMap(of, null, regularImmutableSortedSet);
        }
        return ImmutableSortedMap.A01(this.A00);
    }

    @Override // com.google.common.collect.ImmutableMap.Builder
    public final /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object key, Object value) {
        int i = this.size + 1;
        int length = this.A01.length;
        if (i > length) {
            int A00 = AbstractC24851Je.A00(length, i);
            this.A01 = Arrays.copyOf(this.A01, A00);
            this.A02 = Arrays.copyOf(this.A02, A00);
        }
        AbstractC24841Jd.A01(key, value);
        Object[] objArr = this.A01;
        int i2 = this.size;
        objArr[i2] = key;
        this.A02[i2] = value;
        this.size = i2 + 1;
        return this;
    }
}
