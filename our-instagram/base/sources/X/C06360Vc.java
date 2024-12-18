package X;

import android.os.HandlerThread;
import android.os.StrictMode;
import android.util.SparseArray;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.0Vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06360Vc {
    public static final ThreadLocal A09 = new ThreadLocal() { // from class: X.0Vb
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ Object initialValue() {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream("/dev/urandom");
                    try {
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        fileInputStream.read(allocate.array());
                        Random random = new Random(allocate.getLong());
                        fileInputStream.close();
                        return random;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Cannot read from /dev/urandom", e);
                }
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    };
    public static volatile C06360Vc A0A;
    public HandlerC06380Ve A00;
    public final SparseArray A01;
    public final MmapBufferManager A02;
    public final File A03;
    public final AtomicReference A05;
    public final C20020yW A07;
    public final InterfaceC06430Vk A08;
    public final AtomicReferenceArray A06 = new AtomicReferenceArray(4);
    public final AtomicInteger A04 = new AtomicInteger(0);

    public C06360Vc(SparseArray sparseArray, InterfaceC06330Uz interfaceC06330Uz, C20020yW c20020yW, InterfaceC06430Vk interfaceC06430Vk, MmapBufferManager mmapBufferManager, File file) {
        this.A01 = sparseArray;
        this.A05 = new AtomicReference(interfaceC06330Uz);
        this.A02 = mmapBufferManager;
        this.A03 = file;
        this.A08 = interfaceC06430Vk;
        this.A07 = c20020yW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C06360Vc r5, com.facebook.profilo.ipc.TraceContext r6) {
        /*
            r4 = 0
        L1:
            r0 = 4
            r3 = 1
            if (r4 >= r0) goto L27
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.A06
            r1 = 0
        L8:
            boolean r0 = r2.compareAndSet(r4, r6, r1)
            if (r0 != 0) goto L17
            java.lang.Object r0 = r2.get(r4)
            if (r0 == r6) goto L8
            int r4 = r4 + 1
            goto L1
        L17:
            java.util.concurrent.atomic.AtomicInteger r2 = r5.A04
            int r1 = r2.get()
            int r0 = r3 << r4
            r0 = r0 ^ r1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L17
            return
        L27:
            java.lang.String r1 = "Profilo/TraceControl"
            java.lang.String r0 = "Could not reset Trace Context to null"
            android.util.Log.w(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06360Vc.A03(X.0Vc, com.facebook.profilo.ipc.TraceContext):void");
    }

    public final boolean A08(long j, int i) {
        return A04(this, null, i, 1, 0, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.0VQ] */
    /* JADX WARN: Type inference failed for: r0v77, types: [X.0VN] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, X.0VO] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [X.0VS] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, X.0VS] */
    /* JADX WARN: Type inference failed for: r3v22, types: [com.facebook.profilo.ipc.TraceContext, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [X.0Ve, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.0VY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.0VQ[]] */
    public final boolean A09(long j, int i, int i2) {
        int A01;
        int A00;
        long abs;
        TraceConfigExtras A02;
        String A0g;
        int A002;
        boolean z;
        ?? r9;
        ArrayList arrayList;
        int A003;
        ?? r12;
        ArrayList arrayList2;
        int length;
        int A004;
        ?? r0;
        int length2;
        long id;
        int i3;
        String[] strArr = null;
        boolean z2 = false;
        AtomicInteger atomicInteger = this.A04;
        int i4 = atomicInteger.get();
        int i5 = i2 & 2;
        int i6 = 7;
        if (i5 != 0) {
            i6 = 8;
        }
        int i7 = i4 | i6;
        int i8 = (1 << 4) - 1;
        if (((i7 ^ (-1)) & (i7 + 1) & i8) != 0) {
            AbstractC06400Vg abstractC06400Vg = (AbstractC06400Vg) this.A01.get(i);
            if (abstractC06400Vg != null) {
                if (A01(this, null, i, j) == null) {
                    InterfaceC06330Uz interfaceC06330Uz = (InterfaceC06330Uz) this.A05.get();
                    boolean A03 = abstractC06400Vg.A03();
                    if (!A03) {
                        A00 = abstractC06400Vg.A00(j, null);
                        A01 = -1;
                    } else if (interfaceC06330Uz != null && (A01 = abstractC06400Vg.A01(interfaceC06330Uz, null, j)) >= 0) {
                        A00 = ProvidersRegistry.A00.A00(Arrays.asList(interfaceC06330Uz.getTraceConfigProviders(A01)));
                    }
                    if (A00 != 0) {
                        if (interfaceC06330Uz == null) {
                            throw new IllegalArgumentException("No config available");
                        }
                        do {
                            abs = Math.abs(((Random) A09.get()).nextLong());
                        } while (abs <= 0);
                        String A005 = AbstractC05180Po.A00(abs);
                        android.util.Log.w("Profilo/TraceControl", AnonymousClass001.A0R("START PROFILO_TRACEID: ", A005));
                        if (A03) {
                            A02 = new TraceConfigExtras(interfaceC06330Uz, A01);
                        } else {
                            A02 = abstractC06400Vg.A02(null, j);
                        }
                        int A006 = A02.A00("trace_config.buffers", 1);
                        int optSystemConfigParamInt = interfaceC06330Uz.optSystemConfigParamInt("system_config.buffer_size", 5000);
                        boolean A022 = A02.A02("trace_config.mmap_buffer", false);
                        int[] A032 = A02.A03("trace_config.buffer_sizes");
                        Buffer[] bufferArr = new Buffer[A006];
                        for (int i9 = 0; i9 < A006; i9++) {
                            MmapBufferManager mmapBufferManager = this.A02;
                            if (A032 != null && i9 < A032.length) {
                                i3 = A032[i9];
                            } else {
                                i3 = optSystemConfigParamInt;
                            }
                            bufferArr[i9] = mmapBufferManager.allocateBuffer(i3, A022);
                        }
                        Buffer buffer = bufferArr[0];
                        File file = new File(this.A03, A005.replace("+", "_p_").replace("/", "_s_"));
                        final ?? obj = new Object();
                        obj.A06 = abs;
                        obj.A0D = A005;
                        obj.A07 = interfaceC06330Uz;
                        obj.A01 = i;
                        obj.A0C = abstractC06400Vg;
                        obj.A0B = null;
                        obj.A05 = j;
                        obj.A02 = A00;
                        obj.A03 = i2;
                        obj.A00 = 0;
                        obj.A04 = A01;
                        obj.A08 = A02;
                        obj.A09 = buffer;
                        obj.A0F = bufferArr;
                        obj.A0A = file;
                        obj.A0E = "main";
                        if (A006 == 0 || buffer == null) {
                            A0g = AnonymousClass001.A0g("No buffer was allocated for trace ", A005, ", failing startTrace");
                            android.util.Log.e("Profilo/TraceControl", A0g);
                            return z2;
                        }
                        while (true) {
                            int i10 = atomicInteger.get();
                            int i11 = 7;
                            if (i5 != 0) {
                                i11 = 8;
                            }
                            int i12 = i10 | i11;
                            int i13 = (i12 ^ (-1)) & (i12 + 1) & i8;
                            if (i13 == 0) {
                                break;
                            }
                            if (atomicInteger.compareAndSet(i10, i10 | i13)) {
                                AtomicReferenceArray atomicReferenceArray = this.A06;
                                int i14 = -1;
                                while (i13 != 0) {
                                    i14++;
                                    i13 >>= 1;
                                }
                                while (!atomicReferenceArray.compareAndSet(i14, null, obj)) {
                                    if (atomicReferenceArray.get(i14) != null) {
                                        throw new RuntimeException("ORDERING VIOLATION - ACQUIRED SLOT BUT SLOT NOT EMPTY");
                                    }
                                }
                                for (Buffer buffer2 : obj.A0F) {
                                    int i15 = obj.A02;
                                    long j2 = obj.A05;
                                    long j3 = obj.A06;
                                    InterfaceC06330Uz interfaceC06330Uz2 = obj.A07;
                                    if (interfaceC06330Uz2 == null) {
                                        id = 0;
                                    } else {
                                        id = interfaceC06330Uz2.getID();
                                    }
                                    buffer2.updateHeader(i15, j2, j3, id);
                                }
                                if ((obj.A03 & 3) != 0) {
                                    A002 = Integer.MAX_VALUE;
                                } else {
                                    A002 = obj.A08.A00("trace_config.trace_timeout_ms", 30000);
                                }
                                synchronized (this) {
                                    A02(this);
                                    if (A00(this, obj.A06) != null) {
                                        final ?? r5 = this.A00;
                                        synchronized (r5) {
                                            C0VZ c0vz = r5.A00;
                                            synchronized (c0vz) {
                                                try {
                                                    ?? obj2 = new Object();
                                                    try {
                                                        int[] A033 = obj.A08.A03("trace_config.duration_condition");
                                                        if (A033 != null && (length2 = A033.length) > 0) {
                                                            r12 = new Object();
                                                            r12.A00 = -1L;
                                                            if (length2 % 2 == 0) {
                                                                int i16 = length2 / 2;
                                                                int[] iArr = new int[i16];
                                                                r12.A01 = iArr;
                                                                int[] iArr2 = new int[i16];
                                                                r12.A02 = iArr2;
                                                                int i17 = 0;
                                                                for (int i18 = 0; i18 < i16; i18++) {
                                                                    int i19 = i17 + 1;
                                                                    iArr[i18] = A033[i17];
                                                                    i17 = i19 + 1;
                                                                    int i20 = A033[i19];
                                                                    iArr2[i18] = i20;
                                                                    if (iArr[i18] < 0 || i20 < 0) {
                                                                        throw new IllegalArgumentException("Int conditions should be > 0");
                                                                    }
                                                                }
                                                            } else {
                                                                throw new IllegalArgumentException("Int conditions should come in pairs");
                                                            }
                                                        } else {
                                                            r12 = 0;
                                                        }
                                                        obj2.A01 = r12;
                                                        TraceConfigExtras traceConfigExtras = obj.A08;
                                                        InterfaceC06330Uz interfaceC06330Uz3 = traceConfigExtras.A01;
                                                        if (interfaceC06330Uz3 != null) {
                                                            strArr = interfaceC06330Uz3.optTraceConfigParamStringList(traceConfigExtras.A00, "trace_config.string_list_condition");
                                                        } else {
                                                            TreeMap treeMap = traceConfigExtras.A05;
                                                            if (treeMap != null && (arrayList2 = (ArrayList) treeMap.get("trace_config.string_list_condition")) != null) {
                                                                strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                                                            }
                                                        }
                                                        C0VO c0vo = null;
                                                        c0vo = null;
                                                        c0vo = null;
                                                        c0vo = null;
                                                        if (strArr != null && (length = strArr.length) > 0 && strArr[0].equals("annotation") && (A004 = obj.A08.A00("trace_config.fallback_sampling_rate_for_string_list_condition", 0)) != 1) {
                                                            ?? obj3 = new Object();
                                                            if (length >= 3) {
                                                                if (A004 >= 0) {
                                                                    String str = strArr[1];
                                                                    if (str.equals("any")) {
                                                                        r0 = new Object();
                                                                    } else if (str.equals("all")) {
                                                                        r0 = new Object();
                                                                    } else {
                                                                        throw new IllegalArgumentException(AnonymousClass001.A0g("'", str, "' is not a valid operation"));
                                                                    }
                                                                    obj3.A01 = r0;
                                                                    int i21 = length - 2;
                                                                    String[] strArr2 = new String[i21];
                                                                    obj3.A03 = strArr2;
                                                                    for (int i22 = 0; i22 < i21; i22++) {
                                                                        strArr2[i22] = strArr[i22 + 2];
                                                                    }
                                                                    obj3.A02 = new HashSet();
                                                                    obj3.A00 = A004;
                                                                    c0vo = obj3;
                                                                } else {
                                                                    throw new IllegalArgumentException(AnonymousClass001.A0O("Fallback sampling rate < 0: ", A004));
                                                                }
                                                            } else {
                                                                throw new IllegalArgumentException("Annotation conditions should have at least 3 elements");
                                                            }
                                                        }
                                                        obj2.A00 = c0vo;
                                                    } catch (IllegalArgumentException unused) {
                                                        obj2.A02 = true;
                                                    }
                                                    if (obj2.A01 != null || obj2.A00 != null) {
                                                        obj2.A03 = true;
                                                    }
                                                    if (obj2.A02) {
                                                        z = false;
                                                    } else {
                                                        if (obj2.A03) {
                                                            c0vz.A00.put(obj.A06, obj2);
                                                        }
                                                        z = true;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            if (z) {
                                                try {
                                                    C0W6 c0w6 = new C0W6(new NativeTraceWriterCallbacks() { // from class: X.0yT
                                                        @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
                                                        public final void onTraceWriteAbort(long j4, int i23) {
                                                            HandlerC06380Ve.this.A02.DuU(obj, i23);
                                                        }

                                                        @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
                                                        public final void onTraceWriteEnd(long j4) {
                                                            HandlerC06380Ve.this.A02.DuV(obj);
                                                        }

                                                        @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
                                                        public final void onTraceWriteException(long j4, Throwable th2) {
                                                            HandlerC06380Ve.this.A02.DuW(obj, th2);
                                                        }

                                                        @Override // com.facebook.profilo.writer.NativeTraceWriterCallbacks
                                                        public final void onTraceWriteStart(long j4, int i23) {
                                                            HandlerC06380Ve.this.A02.DuX(obj);
                                                        }
                                                    }, obj.A0A.getCanonicalPath(), obj.A0E, obj.A0F, obj.A06);
                                                    obj.A0G = c0w6;
                                                    int i23 = obj.A03;
                                                    if ((i23 & 2) == 0) {
                                                        NativeTraceWriter nativeTraceWriter = c0w6.A01;
                                                        Buffer buffer3 = obj.A09;
                                                        long j4 = obj.A06;
                                                        if ((i23 & 3) != 0) {
                                                            A003 = Integer.MAX_VALUE;
                                                        } else {
                                                            A003 = obj.A08.A00("trace_config.trace_timeout_ms", 30000);
                                                        }
                                                        BufferLogger.writeAndWakeupTraceWriter(nativeTraceWriter, buffer3, j4, 39, A003, obj.A03, obj.A06);
                                                    }
                                                    r5.A03.add(Long.valueOf(obj.A06));
                                                    C20020yW c20020yW = r5.A01;
                                                    if (c20020yW != null) {
                                                        synchronized (TraceEvents.class) {
                                                            try {
                                                                C0VT c0vt = ProvidersRegistry.A00;
                                                                ArrayList arrayList3 = c0vt.A01;
                                                                int A007 = c0vt.A00(arrayList3);
                                                                if (A007 != TraceEvents.sLastNameRefreshProvidersState) {
                                                                    TraceEvents.sLastNameRefreshProvidersState = A007;
                                                                    synchronized (arrayList3) {
                                                                        arrayList = new ArrayList(arrayList3);
                                                                    }
                                                                    int size = arrayList.size();
                                                                    int[] iArr3 = new int[size];
                                                                    String[] strArr3 = new String[size];
                                                                    int i24 = 0;
                                                                    Iterator it = arrayList.iterator();
                                                                    while (it.hasNext()) {
                                                                        String str2 = (String) it.next();
                                                                        strArr3[i24] = str2;
                                                                        iArr3[i24] = c0vt.A01(str2);
                                                                        i24++;
                                                                    }
                                                                    TraceEvents.nativeRefreshProviderNames(iArr3, strArr3);
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                        }
                                                        int i25 = obj.A02;
                                                        synchronized (TraceEvents.class) {
                                                            TraceEvents.sProviders = TraceEvents.nativeEnableProviders(i25);
                                                        }
                                                        synchronized (c20020yW) {
                                                            try {
                                                                r9 = c20020yW.A05;
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                        }
                                                        synchronized (c20020yW.A07) {
                                                            try {
                                                                for (?? r02 : r9) {
                                                                    r02.A05(obj, c20020yW);
                                                                }
                                                            } catch (Throwable th4) {
                                                                throw th4;
                                                            }
                                                        }
                                                    }
                                                    r5.sendMessage(r5.obtainMessage(1, obj));
                                                    r5.sendMessageDelayed(r5.obtainMessage(0, obj), A002);
                                                } catch (IOException e) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Could not get canonical path of trace directory ");
                                                    sb.append(obj.A0A);
                                                    throw new IllegalArgumentException(sb.toString(), e);
                                                }
                                            }
                                        }
                                    }
                                    z2 = true;
                                }
                                if (!z2) {
                                    A0g = AnonymousClass001.A0q("Failed to start trace ", obj.A0D, " due to malformed config for context ", obj.A05);
                                }
                            }
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0O("Unregistered controller for id = ", i));
            }
        }
        return z2;
    }

    public static TraceContext A00(C06360Vc c06360Vc, long j) {
        if (c06360Vc.A04.get() != 0) {
            int i = 0;
            do {
                TraceContext traceContext = (TraceContext) c06360Vc.A06.get(i);
                if (traceContext != null && traceContext.A06 == j) {
                    return traceContext;
                }
                i++;
            } while (i < 4);
        }
        return null;
    }

    public static TraceContext A01(C06360Vc c06360Vc, Object obj, int i, long j) {
        Object obj2;
        if (c06360Vc.A04.get() != 0) {
            int i2 = 0;
            do {
                TraceContext traceContext = (TraceContext) c06360Vc.A06.get(i2);
                if (traceContext != null && (traceContext.A01 & i) != 0 && (obj2 = traceContext.A0C) != null && ((AbstractC06400Vg) obj2).A04(traceContext.A05, traceContext.A0B, obj, j)) {
                    return traceContext;
                }
                i2++;
            } while (i2 < 4);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.0Vf, java.lang.Object] */
    public static void A02(C06360Vc c06360Vc) {
        C06390Vf c06390Vf;
        HandlerThread handlerThread;
        if (c06360Vc.A00 == null) {
            C20020yW c20020yW = c06360Vc.A07;
            synchronized (C06390Vf.class) {
                C06390Vf c06390Vf2 = C06390Vf.A01;
                c06390Vf = c06390Vf2;
                if (c06390Vf2 == null) {
                    ?? obj = new Object();
                    C06390Vf.A01 = obj;
                    c06390Vf = obj;
                }
            }
            synchronized (c06390Vf) {
                if (c06390Vf.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    AbstractC09770fa.A00(handlerThread2);
                    c06390Vf.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = c06390Vf.A00;
            }
            c06360Vc.A00 = new HandlerC06380Ve(handlerThread.getLooper(), c20020yW, c06360Vc.A08);
        }
    }

    public static boolean A04(C06360Vc c06360Vc, Object obj, int i, int i2, int i3, long j) {
        TraceContext A01 = A01(c06360Vc, obj, i, j);
        if (A01 == null) {
            return false;
        }
        A03(c06360Vc, A01);
        android.util.Log.w("Profilo/TraceControl", AnonymousClass001.A0R("STOP PROFILO_TRACEID: ", AbstractC05180Po.A00(A01.A06)));
        synchronized (c06360Vc) {
            A02(c06360Vc);
            if (i2 != 0) {
                BufferLogger.writeStandardEntry(A01.A09, 6, 61, 0L, 0, 0, 0, A01.A06);
                c06360Vc.A00.A02(A01);
            } else {
                BufferLogger.writeStandardEntry(A01.A09, 6, 37, 0L, 0, 0, 0, A01.A06);
                c06360Vc.A00.A01(new TraceContext(A01, i3));
            }
        }
        return true;
    }

    public final String A05(int i) {
        if (this.A04.get() != 0) {
            int i2 = 0;
            do {
                TraceContext traceContext = (TraceContext) this.A06.get(i2);
                if (traceContext != null && (traceContext.A0C instanceof C0VR) && ((int) traceContext.A05) == i) {
                    return traceContext.A0D;
                }
                i2++;
            } while (i2 < 4);
        }
        return null;
    }

    public final List A06() {
        if (this.A04.get() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        do {
            TraceContext traceContext = (TraceContext) this.A06.get(i);
            if (traceContext != null) {
                arrayList.add(new TraceContext(traceContext));
            }
            i++;
        } while (i < 4);
        return arrayList;
    }

    public final void A07(long j, int i) {
        TraceContext A00 = A00(this, j);
        if (A00 != null && A00.A06 == j) {
            A03(this, A00);
            synchronized (this) {
                A02(this);
                this.A00.A01(new TraceContext(A00, i));
            }
        }
    }
}
