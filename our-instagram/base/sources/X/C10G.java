package X;

import android.util.SparseIntArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.10G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10G extends C0VQ implements C0Xc {
    public QuickPerformanceLogger A00;
    public final ThreadLocal A01;
    public final CopyOnWriteArrayList A02;
    public volatile SparseIntArray A03;
    public static final int A04 = ProvidersRegistry.A00.A02("qpl");
    public static final int[] A06 = {8136209};
    public static final C10G A05 = new C10G();

    public C10G() {
        super(null);
        this.A03 = new SparseIntArray(4);
        this.A02 = new CopyOnWriteArrayList();
        this.A01 = new ThreadLocal();
    }

    @Override // X.C0VQ
    public final boolean A06() {
        return true;
    }

    @Override // X.C0Xc
    public final C0Xa getListenerFlags() {
        return null;
    }

    @Override // X.C0Xc
    public final String getName() {
        return "profilo_event_provider";
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        int[] iArr;
        C06360Vc c06360Vc = C06360Vc.A0A;
        if (c06360Vc != null) {
            AbstractC19070wo abstractC19070wo = (AbstractC19070wo) ((AbstractC06400Vg) c06360Vc.A01.get(C0g6.A01));
            if (abstractC19070wo != null) {
                C0VG[] c0vgArr = ((C0VH) abstractC19070wo.A06((InterfaceC06330Uz) c06360Vc.A05.get())).A01;
                int length = c0vgArr.length;
                int[] iArr2 = new int[length];
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    iArr2[i2] = c0vgArr[i].A01;
                    i++;
                    i2++;
                }
                if (length != 0) {
                    SparseIntArray sparseIntArray = this.A03;
                    int size = sparseIntArray.size();
                    iArr = null;
                    if (sparseIntArray.get(-1) <= 0) {
                        int i3 = 0;
                        int length2 = iArr2.length;
                        int i4 = length2 + size;
                        if (i4 != 0) {
                            iArr = new int[i4];
                            int i5 = 0;
                            int i6 = 0;
                            while (i5 < length2) {
                                iArr[i6] = iArr2[i5];
                                i5++;
                                i6++;
                            }
                            while (i3 < size) {
                                iArr[i6] = sparseIntArray.keyAt(i3);
                                i3++;
                                i6++;
                            }
                        }
                        return new C06650Xb(iArr, null);
                    }
                    iArr = C0Xc.A00;
                    return new C06650Xb(iArr, null);
                }
            }
            SparseIntArray sparseIntArray2 = this.A03;
            int size2 = sparseIntArray2.size();
            if (size2 != 0) {
                if (sparseIntArray2.get(-1) <= 0) {
                    int i7 = 0;
                    iArr = new int[size2];
                    int i8 = 0;
                    while (i7 < size2) {
                        iArr[i8] = sparseIntArray2.keyAt(i7);
                        i7++;
                        i8++;
                    }
                    return new C06650Xb(iArr, null);
                }
                iArr = C0Xc.A00;
                return new C06650Xb(iArr, null);
            }
        }
        return C06650Xb.A03;
    }

    @Override // X.C0VQ
    public final int getSupportedProviders() {
        return A04;
    }

    @Override // X.C0VQ
    public final int getTracingProviders() {
        return A04 & TraceEvents.sProviders;
    }

    @Override // X.C0Xc
    public final void onMarkEvent(C0XX c0xx) {
        int i;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C0WT c0wt = (C0WT) it.next();
            if (C0WT.A01(c0wt, c0xx.getMarkerId())) {
                MultiBufferLogger multiBufferLogger = c0wt.A01;
                multiBufferLogger.writeStandardEntry(7, 51, 0L, 0, c0xx.getMarkerId(), 0, ((c0xx.B2k() << 60) & (-1152921504606846976L)) | ((c0xx.CCe() << 16) & 281474976645120L));
                int writeStandardEntry = multiBufferLogger.writeStandardEntry(7, 59, 0L, 0, c0xx.getMarkerId(), 0, (c0xx.CCe() << 16) & 281474976645120L);
                multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), c0xx.C3l());
                List B3f = c0xx.B3f();
                int size = B3f.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    String str = (String) B3f.get(i2);
                    i2 = i3 + 1;
                    String str2 = (String) B3f.get(i3);
                    int writeBytesEntry = multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, str);
                    if (str2 == null) {
                        str2 = "null";
                    }
                    int length = str2.length();
                    if (length > 512) {
                        int i4 = 0;
                        do {
                            i = i4 + 512;
                            writeBytesEntry = multiBufferLogger.writeBytesEntry(1, 57, writeBytesEntry, str2.substring(i4, Math.min(length, i)));
                            i4 = i;
                        } while (i < length);
                    } else {
                        multiBufferLogger.writeBytesEntry(1, 57, writeBytesEntry, str2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0Vd, java.lang.Object] */
    @Override // X.C0Xc
    public final void onMarkerAnnotate(C0XX c0xx) {
        int length;
        int length2;
        int i;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C0WT c0wt = (C0WT) it.next();
            String BLJ = c0xx.BLJ();
            String BLK = c0xx.BLK();
            if (BLJ != null && BLK != null && (length = BLJ.length()) != 0 && (length2 = BLK.length()) != 0 && C0WT.A01(c0wt, c0xx.getMarkerId()) && !BLJ.equals("loom_id")) {
                if (length > 512) {
                    BLJ = AnonymousClass001.A0R(BLJ.substring(0, 509), "...");
                }
                long BLm = c0xx.BLm();
                MultiBufferLogger multiBufferLogger = c0wt.A01;
                int writeBytesEntry = multiBufferLogger.writeBytesEntry(1, 56, multiBufferLogger.writeStandardEntry(5, 59, BLm, 0, c0xx.getMarkerId(), 0, 281474976710656L | ((c0xx.CCe() << 16) & 281474976645120L) | c0xx.BLD()), BLJ);
                if (length2 > 512) {
                    int i2 = 0;
                    do {
                        i = i2 + 512;
                        writeBytesEntry = multiBufferLogger.writeBytesEntry(1, 57, writeBytesEntry, BLK.substring(i2, Math.min(length2, i)));
                        i2 = i;
                    } while (i < length2);
                } else {
                    multiBufferLogger.writeBytesEntry(1, 57, writeBytesEntry, BLK);
                }
                C06360Vc c06360Vc = C06360Vc.A0A;
                if (c06360Vc != null && C0WT.A02(c0wt, c0xx)) {
                    String A0g = AnonymousClass001.A0g(BLJ, ":", BLK);
                    TraceContext A01 = C06360Vc.A01(c06360Vc, null, C0g6.A01 | C0g9.A01, (c0xx.BIb() << 32) | c0xx.getMarkerId());
                    if (A01 != null) {
                        synchronized (c06360Vc) {
                            C06360Vc.A02(c06360Vc);
                            HandlerC06380Ve handlerC06380Ve = c06360Vc.A00;
                            synchronized (handlerC06380Ve) {
                                ?? obj = new Object();
                                obj.A00 = A01;
                                obj.A01 = A0g;
                                handlerC06380Ve.sendMessage(handlerC06380Ve.obtainMessage(7, obj));
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // X.C0Xc
    public final void onMarkerDrop(C0XX c0xx) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C0WT c0wt = (C0WT) it.next();
            int markerId = c0xx.getMarkerId();
            int BIb = c0xx.BIb();
            if (C0WT.A01(c0wt, c0xx.getMarkerId())) {
                long CCe = (c0xx.CCe() << 16) & 281474976645120L;
                if (!c0xx.CfK()) {
                    CCe |= 281474976710656L;
                }
                c0wt.A01.writeStandardEntry(4, 48, c0xx.BLm(), 0, markerId, 0, CCe);
            }
            C06360Vc c06360Vc = C06360Vc.A0A;
            if (c06360Vc != null && C0WT.A02(c0wt, c0xx)) {
                C06360Vc.A04(c06360Vc, null, C0g6.A01 | C0g9.A01, 0, 2, (BIb << 32) | markerId);
            }
        }
    }

    @Override // X.C0Xc
    public final void onMarkerPoint(C0XX c0xx, String str, C0XJ c0xj, long j, long j2, boolean z, int i) {
        long CCe;
        int i2;
        int i3;
        long j3;
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C0WT c0wt = (C0WT) it.next();
            if (i <= c0wt.A00 && C0WT.A01(c0wt, c0xx.getMarkerId())) {
                int markerId = c0xx.getMarkerId();
                MultiBufferLogger multiBufferLogger = c0wt.A01;
                if (z) {
                    j3 = c0xx.BLm();
                    CCe = ((c0xx.CCe() << 16) & 281474976645120L) | ((i << 60) & (-1152921504606846976L));
                    i2 = 5;
                    i3 = 50;
                } else {
                    CCe = ((c0xx.CCe() << 16) & 281474976645120L) | ((i << 60) & (-1152921504606846976L));
                    i2 = 7;
                    i3 = 50;
                    j3 = 0;
                }
                int writeStandardEntry = multiBufferLogger.writeStandardEntry(i2, i3, j3, 0, markerId, 0, CCe);
                multiBufferLogger.writeBytesEntry(1, 83, writeStandardEntry, str);
                if (c0xj != null) {
                    multiBufferLogger.writeBytesEntry(1, 57, multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, "QPL::data"), c0xj.toString());
                }
            }
        }
    }

    @Override // X.C0Xc
    public final void onMarkerRestart(C0XX c0xx) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C0WT) it.next()).A03(c0xx);
        }
    }

    @Override // X.C0Xc
    public final void onMarkerStart(C0XX c0xx) {
        C06360Vc c06360Vc = C06360Vc.A0A;
        if (c06360Vc != null) {
            this.A01.set(Long.valueOf(System.nanoTime()));
            c06360Vc.A09((c0xx.BIb() << 32) | c0xx.getMarkerId(), C0g6.A01, 0);
        }
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C0WT) it.next()).A03(c0xx);
        }
    }

    @Override // X.C0Xc
    public final void onMarkerStop(C0XX c0xx) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C0WT c0wt = (C0WT) it.next();
            int markerId = c0xx.getMarkerId();
            int BIb = c0xx.BIb();
            if (C0WT.A01(c0wt, c0xx.getMarkerId())) {
                long CCe = ((c0xx.CCe() << 16) & 281474976645120L) | c0xx.BLD();
                if (!c0xx.CfK()) {
                    CCe |= 281474976710656L;
                }
                C0WT.A00(c0wt, c0xx, CCe);
                c0wt.A01.writeStandardEntry(4, 47, c0xx.BLm(), 0, markerId, 0, CCe);
            }
            C06360Vc c06360Vc = C06360Vc.A0A;
            if (c06360Vc != null) {
                long j = (BIb << 32) | markerId;
                if (C0WT.A02(c0wt, c0xx)) {
                    int i = C0g6.A01 | C0g9.A01;
                    int Azm = c0xx.Azm();
                    TraceContext A01 = C06360Vc.A01(c06360Vc, null, i, j);
                    if (A01 != null) {
                        synchronized (c06360Vc) {
                            C06360Vc.A02(c06360Vc);
                            HandlerC06380Ve handlerC06380Ve = c06360Vc.A00;
                            synchronized (handlerC06380Ve) {
                                handlerC06380Ve.sendMessage(handlerC06380Ve.obtainMessage(5, Azm, 0, A01));
                            }
                        }
                    }
                }
                TraceContext A012 = C06360Vc.A01(c06360Vc, null, C0g6.A01 | C0g9.A01, j);
                if (A012 != null) {
                    C06360Vc.A03(c06360Vc, A012);
                    android.util.Log.w("Profilo/TraceControl", AnonymousClass001.A0R("STOP PROFILO_TRACEID: ", AbstractC05180Po.A00(A012.A06)));
                    synchronized (c06360Vc) {
                        C06360Vc.A02(c06360Vc);
                        HandlerC06380Ve handlerC06380Ve2 = c06360Vc.A00;
                        synchronized (handlerC06380Ve2) {
                            handlerC06380Ve2.sendMessage(handlerC06380Ve2.obtainMessage(6, A012));
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // X.C0Xc
    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    @Override // X.C0VQ
    public final void disable() {
        C0f9.A0A(-561358212, C0f9.A03(-1883740770));
    }

    @Override // X.C0VQ
    public final void enable() {
        C0f9.A0A(1942287159, C0f9.A03(800229478));
    }

    @Override // X.C0VQ
    public final void onTraceEnded(TraceContext traceContext, C20020yW c20020yW) {
        int A03 = C0f9.A03(-1387458835);
        int[] A032 = traceContext.A08.A03("provider.qpl.buffers");
        if (A032 == null) {
            A032 = new int[]{0};
        }
        SparseIntArray clone = this.A03.clone();
        int i = 0;
        while (true) {
            int length = A032.length;
            if (i >= length) {
                break;
            }
            int i2 = A032[i];
            TraceConfigExtras traceConfigExtras = traceContext.A08;
            String str = "provider.qpl.event_whitelist";
            if (length > 1) {
                str = AnonymousClass001.A0G("provider.qpl.event_whitelist", '.', i2);
            }
            int[] A033 = traceConfigExtras.A03(str);
            if (A033 == null) {
                A033 = new int[]{-1};
            } else if (i == 0) {
                int length2 = A033.length;
                int[] iArr = A06;
                int[] iArr2 = new int[length2 + 1];
                System.arraycopy(A033, 0, iArr2, 0, length2);
                System.arraycopy(iArr, 0, iArr2, length2, 1);
            }
            for (int i3 : A033) {
                int i4 = clone.get(i3);
                if (i4 == 1) {
                    clone.delete(i3);
                } else if (i4 > 1) {
                    clone.put(i3, i4 - 1);
                }
            }
            String A0G = AnonymousClass001.A0G(traceContext.A0D, '-', i2);
            CopyOnWriteArrayList copyOnWriteArrayList = this.A02;
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0WT c0wt = (C0WT) it.next();
                    if (c0wt.A02.equals(A0G)) {
                        copyOnWriteArrayList.remove(c0wt);
                        break;
                    }
                }
            }
            i++;
        }
        this.A03 = clone;
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
        C0f9.A0A(734793714, A03);
    }

    @Override // X.C0VQ
    public final void onTraceStarted(TraceContext traceContext, C20020yW c20020yW) {
        int A03 = C0f9.A03(-1845284512);
        int[] A032 = traceContext.A08.A03("provider.qpl.buffers");
        if (A032 == null) {
            A032 = new int[]{0};
        }
        SparseIntArray clone = this.A03.clone();
        int i = 0;
        while (true) {
            int length = A032.length;
            if (i >= length) {
                break;
            }
            int i2 = A032[i];
            Buffer buffer = traceContext.A0F[i2];
            TraceConfigExtras traceConfigExtras = traceContext.A08;
            String str = "provider.qpl.event_whitelist";
            if (length > 1) {
                str = AnonymousClass001.A0G("provider.qpl.event_whitelist", '.', i2);
            }
            int[] A033 = traceConfigExtras.A03(str);
            if (A033 == null) {
                A033 = new int[]{-1};
            } else if (i == 0) {
                int length2 = A033.length;
                int[] iArr = A06;
                int[] iArr2 = new int[length2 + 1];
                System.arraycopy(A033, 0, iArr2, 0, length2);
                System.arraycopy(iArr, 0, iArr2, length2, 1);
                A033 = iArr2;
            }
            Arrays.sort(A033);
            for (int i3 : A033) {
                clone.put(i3, clone.get(i3) + 1);
            }
            TraceConfigExtras traceConfigExtras2 = traceContext.A08;
            String str2 = "provider.qpl.point_max_level";
            if (length > 1) {
                str2 = AnonymousClass001.A0G("provider.qpl.point_max_level", '.', i2);
            }
            int A00 = traceConfigExtras2.A00(str2, 9);
            MultiBufferLogger multiBufferLogger = new MultiBufferLogger();
            multiBufferLogger.addBuffer(buffer);
            this.A02.add(new C0WT(multiBufferLogger, AnonymousClass001.A0G(traceContext.A0D, '-', i2), A033, A00, traceContext.A05));
            i++;
        }
        ThreadLocal threadLocal = this.A01;
        Number number = (Number) threadLocal.get();
        if (number != null) {
            BufferLogger.writeStandardEntry(traceContext.A09, 4, 42, number.longValue(), 0, 0, 0, 0L);
            threadLocal.remove();
        }
        this.A03 = clone;
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
        C0f9.A0A(186457599, A03);
    }
}
