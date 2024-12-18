package com.facebook.profilo.provider.memory;

import X.C0Gj;
import X.C0L6;
import X.C0TA;
import X.C0TC;
import X.C0TE;
import X.C0TF;
import X.C0VQ;
import X.C0WK;
import X.C0WL;
import X.C0f9;
import X.C18120uw;
import X.C20020yW;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class MemoryAllocationProvider extends C0VQ implements C0TC, C0TE, C0WK {
    public static final int PROVIDER_MEMORY = ProvidersRegistry.A00.A02("memory_allocation");
    public C18120uw mDeallocationMonitor;
    public String mErrorMessage;
    public boolean mIsFileBackedBuffer;
    public C0WL mProviderTriggerMonitor;
    public boolean mRunning;
    public boolean mStarted;

    public static native void nativeAddPhantomReferenceLoop();

    public static native int nativeInitialize(Object obj, Object obj2, MultiBufferLogger multiBufferLogger, int i, int i2, int i3, int i4, int i5, boolean z, String str, int i6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i7, int i8, boolean z7, boolean z8, int i9, String str2, boolean z9, int i10, String str3, boolean z10);

    public static native boolean nativeIsTracingEnabled();

    public static native void nativeRegisterDeallocation(long[] jArr, int i);

    public static native void nativeResetFrameworkNamesSet();

    public static native void nativeStartProfiling();

    public static native void nativeStopAddPhantomThread();

    public static native void nativeStopProfiling();

    private void startProfiling() {
        File file;
        synchronized (this) {
            if (this.mStarted) {
                return;
            }
            this.mStarted = true;
            C18120uw c18120uw = this.mDeallocationMonitor;
            if (c18120uw != null) {
                c18120uw.A00();
            }
            nativeStartProfiling();
            if (this.mIsFileBackedBuffer && C0L6.A04 != null && (file = C0L6.A04.A09) != null) {
                try {
                    new File(file, "javamp").createNewFile();
                } catch (IOException unused) {
                }
            }
        }
    }

    private synchronized void stopTraceIfRunning() {
        if (this.mRunning) {
            nativeStopProfiling();
            C18120uw c18120uw = this.mDeallocationMonitor;
            if (c18120uw != null) {
                C0TF c0tf = c18120uw.A01;
                if (c0tf != null) {
                    c0tf.A01 = false;
                    c18120uw.A01 = null;
                }
                C0TA c0ta = c18120uw.A00;
                if (c0ta != null) {
                    c0ta.A00.A04.finishProcessor();
                    c18120uw.A00 = null;
                }
                this.mDeallocationMonitor = null;
            }
            this.mRunning = false;
            this.mStarted = false;
        }
        C0WL c0wl = this.mProviderTriggerMonitor;
        if (c0wl != null) {
            c0wl.A02();
            this.mProviderTriggerMonitor = null;
        }
        synchronized (C0Gj.class) {
            C0Gj.A04 = false;
            C0Gj.A00();
        }
    }

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDER_MEMORY;
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }

    public MemoryAllocationProvider() {
        super("profilo_memory");
        this.mRunning = false;
        this.mStarted = false;
    }

    @Override // X.C0VQ
    public void disable() {
        int A03 = C0f9.A03(-526372287);
        stopTraceIfRunning();
        C0f9.A0A(502832503, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b2, code lost:
    
        if (r5 != 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b4, code lost:
    
        if (r7 != 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02b6, code lost:
    
        startProfiling();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ba, code lost:
    
        r49.mProviderTriggerMonitor = new X.C0WL(r49, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02c2, code lost:
    
        r4 = r49.mErrorMessage;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c4, code lost:
    
        monitor-enter(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02c5, code lost:
    
        r0 = X.C0Gj.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c7, code lost:
    
        if (r0 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c9, code lost:
    
        r1 = r0.A00.markEventBuilder(21375349, "java_provider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02d9, code lost:
    
        if (r1.isSampled() == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02db, code lost:
    
        r1.annotate(com.facebook.proxygen.TraceFieldType.ErrorCode, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02e1, code lost:
    
        if (r4 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e3, code lost:
    
        r1.annotate("error_message", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e9, code lost:
    
        r1.report();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ec, code lost:
    
        X.C0Gj.A07 = false;
        X.C0Gj.A04 = false;
        X.C0Gj.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02f3, code lost:
    
        monitor-exit(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02f8, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f9, code lost:
    
        X.C0K8.A0H("MemoryAllocationProvider", "Exception while initializing java memory allocation provider.", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0300, code lost:
    
        monitor-enter(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0301, code lost:
    
        r0 = X.C0Gj.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0303, code lost:
    
        if (r0 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0305, code lost:
    
        r3 = r0.A00.markEventBuilder(21375349, "java_provider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0315, code lost:
    
        if (r3.isSampled() != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0317, code lost:
    
        r3.annotate("exception", r4.toString());
        r3.report();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0324, code lost:
    
        X.C0Gj.A07 = false;
        X.C0Gj.A04 = false;
        X.C0Gj.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0287, code lost:
    
        r49.mDeallocationMonitor = new X.C18120uw(r49, r49, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x010c, code lost:
    
        if (r6 != 3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x010e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0110, code lost:
    
        if (r0 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0112, code lost:
    
        r0 = r1.A09;
        r32 = r0.generateMemoryMappingFilePath();
        r47 = r0.generateLocalSymbolsFilePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x011d, code lost:
    
        r10 = r1.A08.A00("provider.memory_allocation.max_unwind_depth", 256);
        r7 = r1.A08.A00("provider.memory_allocation.when_to_start", 0);
        r48 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x013a, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.log_allocation_failures", false) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x013d, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00c3, code lost:
    
        r42 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c5, code lost:
    
        if (r1 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00c7, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x014b, code lost:
    
        r19 = r1.A08.A00("provider.memory_allocation.async_unwinder_thread_priority", 0);
        r15 = r1.A08.A00("provider.memory_allocation.time_auto_process_refs", 0);
        r41 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0168, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.log_mapping_status_per_frame", false) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x009e, code lost:
    
        r38 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00a9, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.use_global_weak_ref", false) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x008b, code lost:
    
        r37 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x008d, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x006d, code lost:
    
        r36 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0078, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.skip_intercepted_refs_step", false) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x005a, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x018a, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.unwind_stacks", true) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.track_deallocation", true) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.share_async_unwinder_thread", false) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r35 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.use_lock_free_queue_async_unwinder", true) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r35 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r36 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.log_async_unwider_queue_stats", false) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.use_weak_ref_to_track_deallocation", false) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        r38 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (r1 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        r19 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        r41 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        r42 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.unwind_jit_frames", true) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0140, code lost:
    
        r11 = r1.A08.A00("provider.memory_allocation.elements_to_discard_on_unwinder_overflow", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        r32 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (r1 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        r21 = r1.A08.A01("provider.memory_allocation.dynamic_sampling_config");
        r45 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        if (r1.A08.A02("provider.memory_allocation.log_async_unwinder_failure", false) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        r45 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
    
        if (r1 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
    
        r10 = 256;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
    
        r48 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        r49.mIsFileBackedBuffer = false;
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f0, code lost:
    
        if (r1 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f9, code lost:
    
        if (r1.A09.getFilePath() == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
    
        r49.mIsFileBackedBuffer = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        if (r6 != (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
    
        r47 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0104, code lost:
    
        r1 = r49.mIsFileBackedBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0108, code lost:
    
        monitor-enter(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a6, code lost:
    
        r13 = X.C04770Mv.A00;
        r3 = new java.lang.StringBuilder(com.facebook.tigon.tigonhuc.HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
        r8 = 0;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b1, code lost:
    
        if (r1 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b3, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b4, code lost:
    
        r3.append(r0);
        r3.append(',');
        r3.append(r14);
        r3.append(',');
        r3.append(r16);
        r3.append(',');
        r3.append(r18);
        r3.append(',');
        r3.append(r17);
        r3.append(',');
        r3.append(r6);
        r3.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e1, code lost:
    
        if (r31 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e4, code lost:
    
        r3.append(r0);
        r3.append(',');
        r3.append(r9);
        r3.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f1, code lost:
    
        if (r34 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f3, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f4, code lost:
    
        r3.append(r0);
        r3.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fb, code lost:
    
        if (r35 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01fd, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01fe, code lost:
    
        r3.append(r0);
        r3.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0205, code lost:
    
        if (r36 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0207, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0208, code lost:
    
        r3.append(r0);
        r3.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020f, code lost:
    
        if (r37 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0211, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0212, code lost:
    
        r3.append(r0);
        r3.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0219, code lost:
    
        if (r38 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021b, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021c, code lost:
    
        r3.append(r0);
        r3.append(',');
        r3.append(r19);
        r3.append(',');
        r3.append(r15);
        r3.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0231, code lost:
    
        if (r41 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0233, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0234, code lost:
    
        r3.append(r0);
        r3.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023b, code lost:
    
        if (r42 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x023d, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023e, code lost:
    
        r3.append(r0);
        r3.append(',');
        r3.append(r11);
        r3.append(",(");
        r3.append(r21);
        r3.append("),");
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0257, code lost:
    
        if (r45 == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0259, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025a, code lost:
    
        r3.append(r0);
        r3.append(',');
        r3.append(r10);
        r3.append(',');
        r3.append(r7);
        r3.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026c, code lost:
    
        if (r48 == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x026e, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026f, code lost:
    
        r3.append(r8);
        r13.A02(X.C0LK.A6J, X.C0M6.CRITICAL_REPORT, r3.toString());
        X.C0Gj.A07 = true;
        X.C0Gj.A04 = true;
        X.C0Gj.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0284, code lost:
    
        monitor-exit(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0285, code lost:
    
        if (r31 == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x028e, code lost:
    
        r5 = nativeInitialize(r49.mDeallocationMonitor, r49, A02(), r14, r16, r18, r17, r6, r31, r32, r9, r34, r35, r36, r37, r38, r19, r15, r41, r42, r11, r21, r45, r10, r47, r48);
     */
    @Override // X.C0VQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.memory.MemoryAllocationProvider.enable():void");
    }

    @Override // X.C0TE
    public void finishProcessor() {
        nativeStopAddPhantomThread();
    }

    @Override // X.C0VQ
    public int getTracingProviders() {
        if (nativeIsTracingEnabled()) {
            int i = PROVIDER_MEMORY;
            if ((TraceEvents.sProviders & i) != 0) {
                return i;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.C0VQ
    public void onTraceEnded(TraceContext traceContext, C20020yW c20020yW) {
        int A03 = C0f9.A03(543012337);
        stopTraceIfRunning();
        C0f9.A0A(1232010347, A03);
    }

    @Override // X.C0VQ
    public void onTraceStarted(TraceContext traceContext, C20020yW c20020yW) {
        int A03 = C0f9.A03(331605494);
        super.onTraceStarted(traceContext, c20020yW);
        synchronized (this) {
            try {
                this.mRunning = true;
                nativeResetFrameworkNamesSet();
            } catch (Throwable th) {
                C0f9.A0A(2099817828, A03);
                throw th;
            }
        }
        C0f9.A0A(1400048898, A03);
    }

    @Override // X.C0WK
    public void onTrigger() {
        startProfiling();
    }

    @Override // X.C0TE
    public void startProcessor() {
        nativeAddPhantomReferenceLoop();
    }

    @Override // X.C0TC
    public void onDeallocation(long[] jArr, String[] strArr, int i) {
        nativeRegisterDeallocation(jArr, i);
    }
}
