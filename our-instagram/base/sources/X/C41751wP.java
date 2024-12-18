package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41751wP {
    public final HashMap A05 = new HashMap();
    public final HashMap A04 = new HashMap();
    public HashMap A01 = new HashMap();
    public List A02 = new ArrayList();
    public HashMap A00 = new HashMap();
    public List A03 = new ArrayList();

    public static synchronized ArrayList A00(C41751wP c41751wP, String str, List list) {
        ArrayList A01;
        synchronized (c41751wP) {
            A01 = A01(list);
            HashMap hashMap = c41751wP.A04;
            if (hashMap.containsKey(str)) {
                A01.removeAll((List) hashMap.get(str));
            }
        }
        return A01;
    }

    public final synchronized long A02(String str) {
        long j;
        HashMap hashMap = this.A05;
        if (hashMap.containsKey(str)) {
            j = ((Long) hashMap.get(str)).longValue();
        } else {
            j = 0;
        }
        return j;
    }

    public final synchronized boolean A03(String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        int indexOf = str2.indexOf(95);
        if (indexOf != -1) {
            str2 = str2.substring(0, indexOf);
        }
        HashMap hashMap = this.A04;
        z = false;
        if (hashMap.containsKey(str)) {
            z2 = ((List) hashMap.get(str)).contains(str2);
        } else {
            z2 = false;
        }
        String str3 = str;
        int indexOf2 = str.indexOf(58);
        if (indexOf2 != -1) {
            str3 = str.substring(indexOf2 + 1, str.length());
        }
        if (hashMap.containsKey(str3)) {
            if (indexOf2 != -1) {
                str = str.substring(indexOf2 + 1, str.length());
            }
            z3 = ((List) hashMap.get(str)).contains(str2);
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            z = true;
        }
        return z;
    }

    public static ArrayList A01(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int indexOf = str.indexOf(95);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}
