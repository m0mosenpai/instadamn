package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONObject;

/* renamed from: X.4Si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95744Si {
    public BlockingDeque A00 = new LinkedBlockingDeque();
    public final String A01;

    public static String A02(List list, int i, boolean z) {
        Integer num;
        long j;
        if (!list.isEmpty() && 0 < list.size() && i > 0 && i <= list.size()) {
            HashMap hashMap = new HashMap();
            XNT xnt = (XNT) list.get(0);
            hashMap.put("f0", Arrays.asList(Long.toString(xnt.A03), Long.toString(xnt.A01), Long.toString(xnt.A02)));
            hashMap.put("version", 1);
            if (i > 1) {
                int i2 = i;
                while (true) {
                    i2--;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    ((XNT) list.get(i2)).A03 -= ((XNT) list.get(i3)).A03;
                    ((XNT) list.get(i2)).A01 -= ((XNT) list.get(i3)).A01;
                    ((XNT) list.get(i2)).A02 -= ((XNT) list.get(i3)).A02;
                    XNT xnt2 = (XNT) list.get(i2);
                    long j2 = 0;
                    if (((XNT) list.get(i3)).A00 == -1) {
                        j = 0;
                    } else {
                        j = ((XNT) list.get(i2)).A00 - ((XNT) list.get(i3)).A00;
                    }
                    xnt2.A00 = j;
                    XNT xnt3 = (XNT) list.get(i2);
                    if (((XNT) list.get(i3)).A04 != -1) {
                        j2 = ((XNT) list.get(i2)).A04 - ((XNT) list.get(i3)).A04;
                    }
                    xnt3.A04 = j2 * 100;
                    ((XNT) list.get(i2)).A02 -= ((XNT) list.get(i2)).A01;
                }
                HashMap hashMap2 = new HashMap();
                int i4 = 1;
                int i5 = 1;
                do {
                    long j3 = ((XNT) list.get(i5)).A03;
                    long j4 = ((XNT) list.get(i5)).A01;
                    Long valueOf = Long.valueOf(j3);
                    int i6 = 1;
                    if (hashMap2.containsKey(valueOf)) {
                        num = Integer.valueOf(((Number) hashMap2.get(valueOf)).intValue() + 1);
                    } else {
                        num = 1;
                    }
                    hashMap2.put(valueOf, num);
                    Long valueOf2 = Long.valueOf(j4);
                    if (hashMap2.containsKey(valueOf2)) {
                        i6 = ((Number) hashMap2.get(valueOf2)).intValue() + 1;
                    }
                    hashMap2.put(valueOf2, Integer.valueOf(i6));
                    i5++;
                } while (i5 < i);
                long j5 = 3333;
                int i7 = 0;
                for (Map.Entry entry : hashMap2.entrySet()) {
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (i7 < intValue) {
                        j5 = ((Number) entry.getKey()).longValue();
                        i7 = intValue;
                    }
                }
                do {
                    ((XNT) list.get(i4)).A03 -= j5;
                    ((XNT) list.get(i4)).A01 -= j5;
                    i4++;
                } while (i4 < i);
                hashMap.put("baseDelta", Long.valueOf(j5));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i8 = 1;
                boolean z2 = false;
                boolean z3 = false;
                do {
                    arrayList.add(Long.valueOf(((XNT) list.get(i8)).A03));
                    arrayList.add(Long.valueOf(((XNT) list.get(i8)).A01));
                    arrayList.add(Long.valueOf(((XNT) list.get(i8)).A02));
                    arrayList2.add(Long.valueOf(((XNT) list.get(i8)).A00));
                    if (((XNT) list.get(i8)).A00 != 0) {
                        z2 = true;
                    }
                    if (z) {
                        arrayList3.add(Long.valueOf(((XNT) list.get(i8)).A04));
                        if (((XNT) list.get(i8)).A04 != 0) {
                            z3 = true;
                        }
                    }
                    i8++;
                } while (i8 < i);
                hashMap.put("fn", A01(arrayList));
                hashMap.put("fAudio", A01(arrayList2));
                hashMap.put("isSoundOn", Boolean.valueOf(z2));
                if (z) {
                    hashMap.put("fViewable50", A01(arrayList3));
                    hashMap.put("isViewable50", Boolean.valueOf(z3));
                }
            }
            String obj = new JSONObject(hashMap).toString();
            if (obj.length() > 900000) {
                return "{\"err\":\"SIZE_EXCEED_MAX_CAP\"}";
            }
            return obj;
        }
        return null;
    }

    public static String A00(List list) {
        if (list == null) {
            return null;
        }
        return A02(list, list.size(), false);
    }

    public static String A01(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            long j = (longValue >> 63) ^ (longValue << 1);
            while (j >= 128) {
                char c = (char) (128 | (127 & j));
                j >>= 7;
                sb.append(c);
            }
            sb.append((char) j);
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int length = sb2.length() % 3;
        if (length > 0) {
            while (length < 3) {
                sb4.append('=');
                sb2.append((char) 0);
                length++;
            }
        }
        for (int i = 0; i < sb2.length(); i += 3) {
            int charAt = (sb2.charAt(i) << 16) + (sb2.charAt(i + 1) << '\b') + sb2.charAt(i + 2);
            sb3.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 18) & 63));
            sb3.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 12) & 63));
            sb3.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((charAt >> 6) & 63));
            sb3.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(charAt & 63));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb3.substring(0, sb3.length() - sb4.length()));
        sb5.append((Object) sb4);
        return sb5.toString();
    }

    public final void A03(XNT xnt) {
        BlockingDeque blockingDeque = this.A00;
        XNT xnt2 = (XNT) blockingDeque.peekLast();
        if (xnt2 != null && xnt2.A03 == xnt.A03 && xnt2.A01 == xnt.A01) {
            return;
        }
        blockingDeque.add(xnt);
    }

    public C95744Si(String str) {
        this.A01 = str;
    }
}
