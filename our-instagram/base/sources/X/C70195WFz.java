package X;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.WFz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70195WFz {
    public List A00;
    public final long A01;
    public final long A02;
    public final C70195WFz A03;
    public final C69666Vt7 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final String[] A0A;
    public final HashMap A0B;
    public final HashMap A0C;

    public static void A02(C70195WFz c70195WFz, String str, Map map, long j, boolean z) {
        int size;
        boolean z2;
        String str2 = str;
        HashMap hashMap = c70195WFz.A0C;
        hashMap.clear();
        HashMap hashMap2 = c70195WFz.A0B;
        hashMap2.clear();
        String str3 = c70195WFz.A07;
        if (!"metadata".equals(str3)) {
            String str4 = c70195WFz.A06;
            if (!"".equals(str4)) {
                str2 = str4;
            }
            if (c70195WFz.A09 && z) {
                SpannableStringBuilder A00 = A00(str2, map);
                String str5 = c70195WFz.A08;
                str5.getClass();
                A00.append((CharSequence) str5);
                return;
            }
            if ("br".equals(str3) && z) {
                A00(str2, map).append('\n');
                return;
            }
            if (!c70195WFz.A06(j)) {
                return;
            }
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                Object key = entry.getKey();
                CharSequence charSequence = ((C69660Vt1) entry.getValue()).A0E;
                charSequence.getClass();
                AbstractC166997dE.A1U(key, hashMap, charSequence.length());
            }
            boolean equals = "p".equals(str3);
            int i = 0;
            while (true) {
                List list = c70195WFz.A00;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                if (i >= size) {
                    break;
                }
                C70195WFz A05 = c70195WFz.A05(i);
                if (!z) {
                    z2 = false;
                    if (!equals) {
                        A02(A05, str2, map, j, z2);
                        i++;
                    }
                }
                z2 = true;
                A02(A05, str2, map, j, z2);
                i++;
            }
            if (equals) {
                SpannableStringBuilder A002 = A00(str2, map);
                int length = A002.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    } else if (A002.charAt(length) != ' ') {
                        if (A002.charAt(length) != '\n') {
                            A002.append('\n');
                        }
                    }
                }
            }
            Iterator A152 = AbstractC166997dE.A15(map);
            while (A152.hasNext()) {
                Map.Entry entry2 = (Map.Entry) A152.next();
                Object key2 = entry2.getKey();
                CharSequence charSequence2 = ((C69660Vt1) entry2.getValue()).A0E;
                charSequence2.getClass();
                AbstractC166997dE.A1U(key2, hashMap2, charSequence2.length());
            }
        }
    }

    public static void A01(C70195WFz c70195WFz, String str, List list, long j) {
        int size;
        String str2;
        String str3 = c70195WFz.A06;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (c70195WFz.A06(j) && "div".equals(c70195WFz.A07) && (str2 = c70195WFz.A05) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        int i = 0;
        while (true) {
            List list2 = c70195WFz.A00;
            if (list2 == null) {
                size = 0;
            } else {
                size = list2.size();
            }
            if (i >= size) {
                return;
            }
            A01(c70195WFz.A05(i), str, list, j);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b3, code lost:
    
        if (r14 == (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        if (r13 == 1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C70195WFz r22, java.lang.String r23, java.util.Map r24, java.util.Map r25, java.util.Map r26, long r27) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70195WFz.A03(X.WFz, java.lang.String, java.util.Map, java.util.Map, java.util.Map, long):void");
    }

    public static void A04(C70195WFz c70195WFz, TreeSet treeSet, boolean z) {
        boolean z2;
        String str = c70195WFz.A07;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && c70195WFz.A05 != null)) {
            long j = c70195WFz.A02;
            if (j != -9223372036854775807L) {
                AbstractC166997dE.A1X(treeSet, j);
            }
            long j2 = c70195WFz.A01;
            if (j2 != -9223372036854775807L) {
                AbstractC166997dE.A1X(treeSet, j2);
            }
        }
        if (c70195WFz.A00 != null) {
            for (int i = 0; i < c70195WFz.A00.size(); i++) {
                C70195WFz c70195WFz2 = (C70195WFz) c70195WFz.A00.get(i);
                if (!z) {
                    z2 = false;
                    if (!equals) {
                        A04(c70195WFz2, treeSet, z2);
                    }
                }
                z2 = true;
                A04(c70195WFz2, treeSet, z2);
            }
        }
    }

    public final C70195WFz A05(int i) {
        List list = this.A00;
        if (list != null) {
            return (C70195WFz) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean A06(long j) {
        long j2 = this.A02;
        if (j2 != -9223372036854775807L || this.A01 != -9223372036854775807L) {
            if (j2 > j || this.A01 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L || j >= this.A01) {
                    if (j2 <= j && j < this.A01) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public C70195WFz(C70195WFz c70195WFz, C69666Vt7 c69666Vt7, String str, String str2, String str3, String str4, String[] strArr, long j, long j2) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = c69666Vt7;
        this.A0A = strArr;
        this.A09 = AbstractC167007dF.A1W(str2);
        this.A02 = j;
        this.A01 = j2;
        str3.getClass();
        this.A06 = str3;
        this.A03 = c70195WFz;
        this.A0C = new HashMap();
        this.A0B = new HashMap();
    }

    public static SpannableStringBuilder A00(String str, Map map) {
        if (!map.containsKey(str)) {
            C69660Vt1 c69660Vt1 = new C69660Vt1();
            c69660Vt1.A0E = new SpannableStringBuilder();
            map.put(str, c69660Vt1);
        }
        CharSequence charSequence = ((C69660Vt1) map.get(str)).A0E;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }
}
