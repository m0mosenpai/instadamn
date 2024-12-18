package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.2RD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2RD {
    public static C2RD A06;
    public long A00;
    public C2RG A01;
    public C2RG A02;
    public C2RG A03;
    public Map A04;
    public final C2RE A05;

    public static synchronized void A00(C2RG c2rg, C2RD c2rd, int i, long j) {
        synchronized (c2rd) {
            c2rg.A01 += j;
            c2rg.A00 += i;
            C2RG c2rg2 = c2rd.A01;
            c2rg2.A01 += j;
            c2rg2.A00 += i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2RG] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.2RG] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.2RG] */
    public C2RD(C2RE c2re) {
        ?? obj = new Object();
        obj.A02 = "";
        this.A01 = obj;
        String A00 = C0L6.A00();
        ?? obj2 = new Object();
        obj2.A02 = A00;
        this.A03 = obj2;
        String A002 = C0L6.A00();
        ?? obj3 = new Object();
        obj3.A02 = A002;
        this.A02 = obj3;
        HashMap hashMap = new HashMap();
        this.A04 = hashMap;
        hashMap.put(A002, obj3);
        this.A05 = c2re;
        this.A00 = 0L;
        C0L6.A02(new C0L2() { // from class: X.2RH
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.2RG] */
            @Override // X.C0L2
            public final /* synthetic */ void DDi(String str, String str2, WeakReference weakReference) {
                C2RD c2rd = C2RD.this;
                synchronized (c2rd) {
                    C2RG c2rg = c2rd.A02;
                    if (!c2rg.A02.equals(str2)) {
                        c2rd.A00++;
                        int i = c2rg.A00;
                        C2RG c2rg2 = c2rd.A03;
                        c2rg.A00 = i + c2rg2.A00;
                        c2rg.A01 += c2rg2.A01;
                        c2rg2.A02 = str2;
                        c2rg2.A01 = 0L;
                        c2rg2.A00 = 0;
                        Map map = c2rd.A04;
                        C2RG c2rg3 = (C2RG) map.get(str2);
                        if (c2rg3 == null) {
                            ?? obj4 = new Object();
                            obj4.A02 = str2;
                            c2rd.A02 = obj4;
                            map.put(str2, obj4);
                        } else {
                            c2rd.A02 = c2rg3;
                        }
                    }
                }
            }
        });
    }

    public final void A01(Bitmap bitmap) {
        final long allocationByteCount = bitmap.getAllocationByteCount() / 1024;
        final C2RG c2rg = this.A02;
        final C2RG c2rg2 = this.A03;
        final long j = this.A00;
        A00(c2rg2, this, 1, allocationByteCount);
        C2RE c2re = this.A05;
        Runnable runnable = new Runnable() { // from class: X.2qf
            @Override // java.lang.Runnable
            public final void run() {
                C2RG c2rg3;
                long j2 = j;
                C2RD c2rd = this;
                if (j2 == c2rd.A00) {
                    c2rg3 = c2rg2;
                } else {
                    c2rg3 = c2rg;
                }
                C2RD.A00(c2rg3, c2rd, -1, -allocationByteCount);
            }
        };
        synchronized (c2re) {
        }
        HashSet hashSet = c2re.A03;
        synchronized (hashSet) {
            hashSet.add(new C61192qh(bitmap, runnable, c2re.A02));
            if (!c2re.A00) {
                c2re.A04.execute(c2re.A01);
                c2re.A00 = true;
            }
        }
    }
}
