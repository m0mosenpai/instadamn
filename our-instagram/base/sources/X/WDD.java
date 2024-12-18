package X;

import android.util.ArrayMap;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class WDD {
    public final QuickPerformanceLogger A00;
    public final C18240vB A03;
    public volatile boolean A04;
    public final Map A02 = new HashMap();
    public final Map A01 = new HashMap();

    public final void A02(VDI vdi, String str, String str2, String str3, long j) {
        C14360o3.A0B(str2, 1);
        A03(new RunnableC71620WxS(this, vdi, str, str2, str3, j));
    }

    public static final void A00(WDD wdd, int i, long j, short s) {
        ArrayMap arrayMap;
        if (wdd.A04 && i != -1) {
            Map map = wdd.A02;
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                Map map2 = wdd.A01;
                if (map2.get(valueOf) != null && (arrayMap = (ArrayMap) map2.get(valueOf)) != null && (!arrayMap.isEmpty())) {
                    JSONObject jSONObject = new JSONObject();
                    ArrayMap arrayMap2 = (ArrayMap) map2.get(valueOf);
                    if (arrayMap2 != null) {
                        for (Map.Entry entry : arrayMap2.entrySet()) {
                            try {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                C14360o3.A07(value);
                                jSONObject.put(str, ((Number) value).intValue());
                            } catch (ArrayIndexOutOfBoundsException unused) {
                            }
                        }
                    }
                    QuickPerformanceLogger quickPerformanceLogger = wdd.A00;
                    ArrayMap arrayMap3 = new ArrayMap();
                    arrayMap3.put("PREFETCH_CALL_COUNT", jSONObject.toString());
                    AbstractC63056Sbd.A02(arrayMap3, quickPerformanceLogger, i);
                }
                wdd.A00.markerEnd(1906462, i, s, j, TimeUnit.MILLISECONDS);
                map.remove(valueOf);
                ArrayMap arrayMap4 = (ArrayMap) map2.get(valueOf);
                if (arrayMap4 != null) {
                    arrayMap4.clear();
                }
                map2.remove(valueOf);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r1.contains(r0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r1.contains(r0) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r1 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.WDD r13, X.VDI r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18) {
        /*
            boolean r0 = r13.A04
            if (r0 == 0) goto L2a
            if (r15 == 0) goto L2a
            r0 = r16
            int r8 = X.AbstractC63056Sbd.A00(r15, r0)
            r0 = -1
            if (r8 == r0) goto L2a
            java.util.Map r5 = r13.A02
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r5.get(r4)
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r5.get(r4)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r1 = 1
            if (r0 == 0) goto L2b
            boolean r0 = r0.contains(r14)
            if (r0 != r1) goto L2b
        L2a:
            return
        L2b:
            java.lang.Object r1 = r5.get(r4)
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 == 0) goto L5e
            X.VDI r0 = X.VDI.A08
            if (r0 != r14) goto L3e
            boolean r0 = r1.contains(r0)
            r3 = 1
            if (r0 != 0) goto L3f
        L3e:
            r3 = 0
        L3f:
            X.VDI r0 = X.VDI.A09
            if (r0 != r14) goto L4a
            boolean r0 = r1.contains(r0)
            r2 = 1
            if (r0 != 0) goto L4b
        L4a:
            r2 = 0
        L4b:
            X.VDI r0 = X.VDI.A0A
            if (r0 != r14) goto L56
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L57
        L56:
            r0 = 0
        L57:
            if (r3 != 0) goto L2a
            if (r2 != 0) goto L2a
            if (r0 == 0) goto L5e
            return
        L5e:
            com.facebook.quicklog.QuickPerformanceLogger r6 = r13.A00
            r7 = 1906462(0x1d171e, float:2.671522E-39)
            java.lang.String r9 = r14.name()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r10 = r17
            r11 = r18
            r6.markerPoint(r7, r8, r9, r10, r11, r13)
            java.lang.Object r0 = r5.get(r4)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L2a
            r0.add(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDD.A01(X.WDD, X.VDI, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public final void A03(Runnable runnable) {
        if (this.A04) {
            this.A03.ATO(new V61(runnable));
        }
    }

    public WDD(QuickPerformanceLogger quickPerformanceLogger, C18240vB c18240vB) {
        this.A00 = quickPerformanceLogger;
        this.A03 = c18240vB;
    }
}
