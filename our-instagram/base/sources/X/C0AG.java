package X;

import android.app.Activity;
import android.app.Service;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0AG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AG {
    public static C0AG A09;
    public int A00;
    public WeakReference A03;
    public final Object A05 = new Object();
    public boolean A04 = false;
    public final Object A06 = new Object();
    public final WeakHashMap A08 = new WeakHashMap();
    public final List A07 = new ArrayList();
    public C02F A02 = null;
    public C03J A01 = null;

    public final synchronized int A02() {
        return ((WeakHashMap) this.A07.get(5)).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:12:0x0050, B:14:0x0055, B:16:0x005b, B:18:0x0065, B:21:0x006b, B:27:0x0079, B:29:0x007f, B:30:0x008d, B:31:0x008f, B:33:0x0099, B:34:0x00aa, B:38:0x00c5, B:39:0x00c9, B:40:0x00dc, B:44:0x00cc, B:49:0x0088, B:54:0x001e, B:56:0x0024, B:58:0x002a, B:59:0x002d, B:61:0x0041, B:63:0x0047), top: B:8:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0AF, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A03(java.lang.Integer r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0AG.A03(java.lang.Integer, java.lang.Object):void");
    }

    private Object A00(Integer num, Integer num2, Object obj) {
        List list = this.A07;
        int intValue = num.intValue();
        AbstractMap abstractMap = (AbstractMap) list.get(intValue);
        Object obj2 = null;
        if (abstractMap.size() > 1) {
            for (Map.Entry entry : abstractMap.entrySet()) {
                if (entry.getKey() != obj) {
                    return entry.getKey();
                }
            }
            return null;
        }
        int intValue2 = num2.intValue();
        int i = intValue + 1;
        if (intValue2 == i) {
            return null;
        }
        while (i < intValue2) {
            Iterator it = ((AbstractMap) list.get(i)).entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    if (entry2.getKey() != obj) {
                        obj2 = entry2.getKey();
                        if (obj2 != null) {
                            return obj2;
                        }
                    }
                }
            }
            i++;
        }
        return obj2;
    }

    public static String A01(Object obj) {
        if (!(obj instanceof Activity) && !(obj instanceof Service)) {
            return obj.toString();
        }
        return obj.getClass().getSimpleName();
    }

    public C0AG() {
        for (Integer num : C05F.A00(12)) {
            this.A07.add(num.intValue(), new WeakHashMap());
        }
    }
}
