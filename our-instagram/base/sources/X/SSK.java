package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public abstract class SSK {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final AbstractC64527TId A00(THW thw, InputStream inputStream) {
        boolean equals;
        RM0 A01;
        boolean z;
        boolean z2;
        long j;
        try {
            SEV A05 = thw.A05();
            if (A05 != null) {
                try {
                    byte b = A05.A01;
                    byte b2 = A05.A00;
                    int i = 0;
                    if (b2 != Byte.MIN_VALUE) {
                        if (b2 != -96) {
                            if (b2 != -64) {
                                if (b2 != -32) {
                                    if (b2 != 0 && b2 != 32) {
                                        if (b2 != 64) {
                                            if (b2 == 96) {
                                                THW.A02(thw, (byte) 96);
                                                String A0m = AbstractC58318PtA.A0m(StandardCharsets.UTF_8, THW.A04(thw));
                                                A01(b, A0m.length());
                                                return new RMN(A0m);
                                            }
                                            throw new IOException(AnonymousClass001.A0O("Unidentifiable major type: ", (b2 >> 5) & 7));
                                        }
                                        THW.A02(thw, (byte) 64);
                                        byte[] A04 = THW.A04(thw);
                                        int length = A04.length;
                                        A01(b, length);
                                        return new RMM(AbstractC64537TIt.A01(A04, length));
                                    }
                                    thw.A05();
                                    byte b3 = thw.A00.A00;
                                    if (b3 == 0) {
                                        z2 = true;
                                    } else if (b3 == 32) {
                                        z2 = false;
                                    } else {
                                        throw AbstractC58319PtB.A0l("expected major type 0 or 1 but found %s", new Object[]{Integer.valueOf((b3 >> 5) & 7)});
                                    }
                                    long A00 = THW.A00(thw);
                                    if (A00 >= 0) {
                                        if (!z2) {
                                            A00 = (-1) ^ A00;
                                        }
                                        if (A00 > 0) {
                                            j = A00;
                                        } else {
                                            j = (-1) ^ A00;
                                        }
                                        A01(b, j);
                                        return new RMQ(A00);
                                    }
                                    throw AbstractC166987dD.A1D(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
                                }
                                THW.A02(thw, (byte) -32);
                                if (thw.A00.A01 <= 24) {
                                    int A002 = (int) THW.A00(thw);
                                    if (A002 == 20) {
                                        z = false;
                                    } else if (A002 == 21) {
                                        z = true;
                                    } else {
                                        throw AbstractC58319PtB.A0l("expected FALSE or TRUE", new Object[0]);
                                    }
                                    return new RML(z);
                                }
                                throw AbstractC166987dD.A14("expected simple value");
                            }
                            throw new IOException("Tags are currently unsupported");
                        }
                        THW.A02(thw, (byte) -96);
                        THW.A01(thw);
                        long A003 = THW.A00(thw);
                        if (A003 >= 0 && A003 <= 4611686018427387903L) {
                            if (A003 > 0) {
                                thw.A01.A00.push(Long.valueOf(A003 + A003));
                            }
                            if (A003 <= 1000) {
                                A01(b, A003);
                                int i2 = (int) A003;
                                SEU[] seuArr = new SEU[i2];
                                AbstractC64527TId abstractC64527TId = null;
                                int i3 = 0;
                                while (i3 < A003) {
                                    AbstractC64527TId A004 = A00(thw, inputStream);
                                    if (abstractC64527TId == null || A004.compareTo(abstractC64527TId) > 0) {
                                        seuArr[i3] = new SEU(A004, A00(thw, inputStream));
                                        i3++;
                                        abstractC64527TId = A004;
                                    } else {
                                        throw new IOException(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", abstractC64527TId.toString(), A004.toString()));
                                    }
                                }
                                TreeMap treeMap = new TreeMap();
                                while (i < i2) {
                                    SEU seu = seuArr[i];
                                    if (!treeMap.containsKey(seu.A00)) {
                                        treeMap.put(seu.A00, seu.A01);
                                        i++;
                                    } else {
                                        throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                    }
                                }
                                final Comparator comparator = RM0.A03;
                                Comparator comparator2 = treeMap.comparator();
                                int i4 = 1;
                                if (comparator2 == null) {
                                    equals = true;
                                } else {
                                    equals = comparator.equals(comparator2);
                                }
                                ?? entrySet = treeMap.entrySet();
                                Map.Entry[] entryArr = AbstractC64771TTf.A01;
                                if (!(entrySet instanceof Collection)) {
                                    Iterator it = entrySet.iterator();
                                    entrySet = AbstractC166987dD.A1E();
                                    it.getClass();
                                    while (it.hasNext()) {
                                        AbstractC58318PtA.A1W(entrySet, it);
                                    }
                                }
                                Map.Entry[] entryArr2 = (Map.Entry[]) entrySet.toArray(entryArr);
                                int length2 = entryArr2.length;
                                if (length2 != 0) {
                                    int i5 = 0;
                                    if (length2 != 1) {
                                        Object[] objArr = new Object[length2];
                                        Object[] objArr2 = new Object[length2];
                                        if (!equals) {
                                            Arrays.sort(entryArr2, 0, length2, new Comparator() { // from class: X.TSF
                                                @Override // java.util.Comparator
                                                public final int compare(Object obj, Object obj2) {
                                                    Map.Entry entry = (Map.Entry) obj;
                                                    Map.Entry entry2 = (Map.Entry) obj2;
                                                    entry.getClass();
                                                    entry2.getClass();
                                                    return comparator.compare(entry.getKey(), entry2.getKey());
                                                }
                                            });
                                            Map.Entry entry = entryArr2[0];
                                            entry.getClass();
                                            Object key = entry.getKey();
                                            objArr[0] = key;
                                            Object value = entry.getValue();
                                            objArr2[0] = value;
                                            S2X.A00(objArr[0], value);
                                            do {
                                                Map.Entry entry2 = entryArr2[i4 - 1];
                                                entry2.getClass();
                                                Map.Entry entry3 = entryArr2[i4];
                                                entry3.getClass();
                                                Object key2 = entry3.getKey();
                                                Object value2 = entry3.getValue();
                                                S2X.A00(key2, value2);
                                                objArr[i4] = key2;
                                                objArr2[i4] = value2;
                                                if (comparator.compare(key, key2) != 0) {
                                                    i4++;
                                                    key = key2;
                                                } else {
                                                    throw AbstractC58319PtB.A0i("Multiple entries with same key: ", String.valueOf(entry2), " and ", String.valueOf(entry3));
                                                }
                                            } while (i4 < length2);
                                        } else {
                                            do {
                                                Map.Entry entry4 = entryArr2[i5];
                                                entry4.getClass();
                                                Object key3 = entry4.getKey();
                                                Object value3 = entry4.getValue();
                                                S2X.A00(key3, value3);
                                                objArr[i5] = key3;
                                                objArr2[i5] = value3;
                                                i5++;
                                            } while (i5 < length2);
                                        }
                                        RM4 rm4 = RM4.A03;
                                        RMC rmc = RLz.A00;
                                        A01 = new RM0(new RLy(objArr2, length2), null, new RM4(new RLy(objArr, length2), comparator));
                                    } else {
                                        Map.Entry entry5 = entryArr2[0];
                                        entry5.getClass();
                                        Object key4 = entry5.getKey();
                                        Object value4 = entry5.getValue();
                                        RM4 rm42 = RM4.A03;
                                        RMC rmc2 = RLz.A00;
                                        Object[] objArr3 = {key4};
                                        if (objArr3[0] != null) {
                                            RM4 rm43 = new RM4(new RLy(objArr3, 1), comparator);
                                            Object[] objArr4 = {value4};
                                            if (objArr4[0] != null) {
                                                A01 = new RM0(new RLy(objArr4, 1), null, rm43);
                                            } else {
                                                throw AbstractC58322PtE.A0k(0);
                                            }
                                        } else {
                                            throw AbstractC58322PtE.A0k(0);
                                        }
                                    }
                                } else {
                                    A01 = RM0.A01(comparator);
                                }
                                return new RMP(A01);
                            }
                            throw new IOException("Parser being asked to read a large CBOR map");
                        }
                        throw AbstractC166987dD.A1D("the maximum supported map length is 4611686018427387903L");
                    }
                    THW.A02(thw, Byte.MIN_VALUE);
                    THW.A01(thw);
                    long A005 = THW.A00(thw);
                    if (A005 >= 0) {
                        if (A005 > 0) {
                            thw.A01.A00.push(Long.valueOf(A005));
                        }
                        if (A005 <= 1000) {
                            A01(b, A005);
                            AbstractC64527TId[] abstractC64527TIdArr = new AbstractC64527TId[(int) A005];
                            while (i < A005) {
                                abstractC64527TIdArr[i] = A00(thw, inputStream);
                                i++;
                            }
                            return new RMO(RLz.A00(abstractC64527TIdArr));
                        }
                        throw new IOException("Parser being asked to read a large CBOR array");
                    }
                    throw AbstractC166987dD.A1D(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
                } catch (IOException | RuntimeException e) {
                    throw new IOException("Error in decoding CborValue from bytes", e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e2) {
            throw new IOException("Error in decoding CborValue from bytes", e2);
        }
    }

    public static final void A01(byte b, long j) {
        switch (b) {
            case 24:
                if (j >= 24) {
                    return;
                } else {
                    throw new IOException(AnonymousClass001.A0e("Integer value ", " after add info could have been represented in 0 additional bytes, but used 1", j));
                }
            case 25:
                if (j >= 256) {
                    return;
                } else {
                    throw new IOException(AnonymousClass001.A0e("Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2", j));
                }
            case 26:
                if (j >= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) {
                    return;
                } else {
                    throw new IOException(AnonymousClass001.A0e("Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4", j));
                }
            case 27:
                if (j >= 4294967296L) {
                    return;
                } else {
                    throw new IOException(AnonymousClass001.A0e("Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8", j));
                }
            default:
                return;
        }
    }
}
