package X;

import com.facebook.common.dextricks.DexOptimization;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0X6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0X6 {
    public static volatile C0X6 A06;
    public File A00;
    public InterfaceC08830cm A01;
    public C07220Zv[] A02;
    public boolean A03;
    public final Lock A05 = new ReentrantLock(true);
    public final Map A04 = new LinkedHashMap();

    public static C0X6 A00() {
        if (A06 == null) {
            synchronized (C0X6.class) {
                if (A06 == null) {
                    A06 = new C0X6();
                }
            }
        }
        return A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0216, code lost:
    
        if (r11 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0218, code lost:
    
        r1 = r1.toArray(new X.C07260a0[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x021e, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023e, code lost:
    
        r2 = r15.iterator();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0247, code lost:
    
        if (r2.hasNext() == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0249, code lost:
    
        r1 = r1 + ((X.C07260a0[]) r2.next()).length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0252, code lost:
    
        r7 = new X.C07260a0[r1];
        r6 = r15.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025d, code lost:
    
        if (r6.hasNext() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x025f, code lost:
    
        r4 = (X.C07260a0[]) r6.next();
        r3 = r4.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0267, code lost:
    
        if (r2 >= r3) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0269, code lost:
    
        r7[r5] = r4[r2];
        r2 = r2 + 1;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0273, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C07260a0[] A01(X.C07190Zs r27, java.io.File r28) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X6.A01(X.0Zs, java.io.File):X.0a0[]");
    }

    public final void A02(C07220Zv... c07220ZvArr) {
        double d;
        int i;
        String str;
        short s;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        RunnableC16080r6 A0O;
        Lock lock = this.A05;
        lock.lock();
        try {
            Map map = this.A04;
            if (!map.isEmpty()) {
                if (!this.A03) {
                    C006802i c006802i = (C006802i) map.values().iterator().next();
                    for (C07220Zv c07220Zv : c07220ZvArr) {
                        File file = c07220Zv.A00;
                        Integer num = c07220Zv.A01;
                        boolean z = c07220Zv.A03;
                        String str2 = c07220Zv.A02;
                        if (!new File(file, "qpl_processed").exists()) {
                            c006802i.markerStart(27794854);
                            C07190Zs c07190Zs = new C07190Zs();
                            c07190Zs.A0C = true;
                            for (C07260a0 c07260a0 : A01(c07190Zs, file)) {
                                int intValue = num.intValue();
                                if (intValue != 0) {
                                    i = 1;
                                } else {
                                    i = -1;
                                }
                                int i2 = c07260a0.A05;
                                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                if (c006802i.A0c) {
                                    c006802i.A0K.add(Long.valueOf(C0XD.A00(i2, 0)));
                                }
                                if (c006802i.A0b) {
                                    String A05 = C006802i.A05(i2, 0, c006802i.A0f, c006802i.A0d, c006802i.A0e);
                                    if (A05 != null && ((int) c006802i.A0l.BqB(i2)) != 0 && (A0O = c006802i.A0O(c006802i.A0M(), A05, null, timeUnit, i2, 0, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, i, 0L, false)) != null) {
                                        C0XD c0xd = c006802i.A0A;
                                        c0xd.A0A(null, c006802i.A0M(), A0O, "join_id", A05);
                                        c0xd.A0A(null, c006802i.A0M(), A0O, CacheBehaviorLogger.SOURCE, DexOptimization.OPT_KEY_CLIENT);
                                        c006802i.A0I.put(String.valueOf(C0XD.A00(i2, 0)), A05);
                                    }
                                } else if (((int) c006802i.A0l.BqB(i2)) != 0) {
                                    c006802i.A0O(c006802i.A0M(), null, null, timeUnit, i2, 0, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, i, 0L, false);
                                }
                                if (!z) {
                                    str = AppStateModule.APP_STATE_BACKGROUND;
                                } else {
                                    str = "foreground";
                                }
                                c006802i.A0h(i2, "qpl_cr_foreground_status", str);
                                if (str2 != null) {
                                    c006802i.A0h(i2, "exit_type", str2);
                                }
                                List list7 = c07260a0.A02;
                                if (list7 != null && Collections.unmodifiableList(list7) != null && (list4 = c07260a0.A03) != null && Collections.unmodifiableList(list4) != null) {
                                    List list8 = c07260a0.A02;
                                    if (list8 != null) {
                                        list5 = Collections.unmodifiableList(list8);
                                    } else {
                                        list5 = null;
                                    }
                                    Iterator it = list5.iterator();
                                    List list9 = c07260a0.A03;
                                    if (list9 != null) {
                                        list6 = Collections.unmodifiableList(list9);
                                    } else {
                                        list6 = null;
                                    }
                                    Iterator it2 = list6.iterator();
                                    while (it.hasNext() && it2.hasNext()) {
                                        c006802i.A0h(i2, (String) it.next(), (String) it2.next());
                                    }
                                }
                                List list10 = c07260a0.A00;
                                if (list10 != null && Collections.unmodifiableList(list10) != null && (list = c07260a0.A01) != null && Collections.unmodifiableList(list) != null) {
                                    List list11 = c07260a0.A00;
                                    if (list11 != null) {
                                        list2 = Collections.unmodifiableList(list11);
                                    } else {
                                        list2 = null;
                                    }
                                    Iterator it3 = list2.iterator();
                                    List list12 = c07260a0.A01;
                                    if (list12 != null) {
                                        list3 = Collections.unmodifiableList(list12);
                                    } else {
                                        list3 = null;
                                    }
                                    Iterator it4 = list3.iterator();
                                    while (it3.hasNext() && it4.hasNext()) {
                                        String str3 = (String) it3.next();
                                        int intValue2 = ((Integer) it4.next()).intValue();
                                        if (C006802i.A0K(c006802i, str3)) {
                                            c006802i.A0A.A0B(null, C0XP.A07, str3, i2, 0, intValue2);
                                        }
                                    }
                                }
                                if (intValue != 0) {
                                    s = 722;
                                } else {
                                    s = 2001;
                                }
                                c006802i.A0i(c006802i.A0M(), null, timeUnit, i2, 0, 112, 0L, s);
                            }
                            int i3 = c07190Zs.A02 + c07190Zs.A03;
                            c006802i.markerAnnotate(27794854, "storage_version", c07190Zs.A08);
                            c006802i.markerAnnotate(27794854, "records_count", c07190Zs.A05);
                            c006802i.markerAnnotate(27794854, "markers_count", c07190Zs.A04);
                            c006802i.markerAnnotate(27794854, "active_markers_count", c07190Zs.A03);
                            c006802i.markerAnnotate(27794854, "unique_markers_count", c07190Zs.A06);
                            int i4 = c07190Zs.A02;
                            if (i4 >= 0) {
                                c006802i.markerAnnotate(27794854, "lost_active_markers_count", i4);
                                if (i3 == 0) {
                                    d = 0.0d;
                                } else {
                                    d = c07190Zs.A02 / i3;
                                }
                                c006802i.markerAnnotate(27794854, "events_loss_ratio", d);
                            }
                            int i5 = c07190Zs.A09;
                            if (i5 > 0) {
                                c006802i.markerAnnotate(27794854, "time_window_sec", i5);
                            }
                            String str4 = c07190Zs.A0A;
                            if (str4 != null) {
                                c006802i.markerAnnotate(27794854, "error", str4);
                            }
                            int i6 = c07190Zs.A07;
                            if (i6 > 0) {
                                double d2 = i6;
                                c006802i.markerAnnotate(27794854, "annotations_loss_ratio", (d2 - c07190Zs.A01) / d2);
                            }
                            int i7 = 0;
                            while (true) {
                                int[] iArr = c07190Zs.A0F;
                                if (i7 >= 3) {
                                    break;
                                }
                                int i8 = iArr[i7];
                                int i9 = c07190Zs.A0G[i7];
                                if (i8 != 0) {
                                    c006802i.markerStart(27802751);
                                    c006802i.markerAnnotate(27802751, "storage_version", c07190Zs.A08);
                                    c006802i.markerAnnotate(27802751, "markerId", i8);
                                    c006802i.markerAnnotate(27802751, "count", i9);
                                    c006802i.markerEnd(27802751, (short) 2);
                                }
                                i7++;
                            }
                            Iterator it5 = c07190Zs.A0B.iterator();
                            while (it5.hasNext()) {
                                C07200Zt c07200Zt = (C07200Zt) it5.next();
                                int i10 = c07200Zt.A01;
                                if (i10 != 0) {
                                    c006802i.markerStart(27799771);
                                    c006802i.markerAnnotate(27799771, "markerId", i10);
                                    c006802i.markerAnnotate(27799771, "storage_version", c07190Zs.A00);
                                    c006802i.markerAnnotate(27799771, "markers_count", c07200Zt.A03);
                                    c006802i.markerAnnotate(27799771, "active_markers_count", c07200Zt.A02);
                                    c006802i.markerAnnotate(27799771, "lost_active_markers_count", c07200Zt.A00);
                                    c006802i.markerAnnotate(27799771, "max_concurrent_markers_count", c07200Zt.A04);
                                    c006802i.markerEnd(27799771, (short) 2);
                                }
                            }
                            c006802i.markerEnd(27794854, (short) 2);
                            try {
                                new File(file, "qpl_processed").createNewFile();
                            } catch (IOException unused) {
                            }
                        }
                    }
                    this.A03 = true;
                }
            } else {
                this.A02 = c07220ZvArr;
            }
        } finally {
            lock.unlock();
        }
    }
}
