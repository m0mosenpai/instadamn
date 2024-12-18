package X;

/* renamed from: X.49W, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C49W {
    public static Object A02(int buckets) {
        if (buckets >= 2 && buckets <= 1073741824 && Integer.highestOneBit(buckets) == buckets) {
            if (buckets <= 256) {
                return new byte[buckets];
            }
            if (buckets <= 65536) {
                return new short[buckets];
            }
            return new int[buckets];
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O(AbstractC58317Pt9.A00(866), buckets));
    }

    public static int A00(Object table, int index) {
        if (table instanceof byte[]) {
            return ((byte[]) table)[index] & 255;
        }
        if (table instanceof short[]) {
            return ((short[]) table)[index] & 65535;
        }
        return ((int[]) table)[index];
    }

    public static void A03(Object table, int index, int entry) {
        if (table instanceof byte[]) {
            ((byte[]) table)[index] = (byte) entry;
        } else if (table instanceof short[]) {
            ((short[]) table)[index] = (short) entry;
        } else {
            ((int[]) table)[index] = entry;
        }
    }

    public static int A01(Object key, Object value, Object mask, int[] table, Object[] entries, Object[] keys, int values) {
        int i;
        int i2;
        int A02 = C1Jk.A02(key);
        int i3 = A02 & values;
        int A00 = A00(mask, i3);
        if (A00 != 0) {
            int i4 = values ^ (-1);
            int i5 = A02 & i4;
            int i6 = -1;
            while (true) {
                i = A00 - 1;
                i2 = table[i];
                if ((i2 & i4) != i5 || !AbstractC50102Ry.A00(key, entries[i]) || (keys != null && !AbstractC50102Ry.A00(value, keys[i]))) {
                    A00 = i2 & values;
                    if (A00 == 0) {
                        break;
                    }
                    i6 = i;
                }
            }
            int i7 = i2 & values;
            if (i6 == -1) {
                A03(mask, i3, i7);
                return i;
            }
            table[i6] = (table[i6] & i4) | (i7 & values);
            return i;
        }
        return -1;
    }
}
