package com.facebook.profilo.provider.nativememory;

import X.C0Gj;
import X.C0L6;
import X.C0VQ;
import X.C0WK;
import X.C0WL;
import X.C0f9;
import X.C20020yW;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class NativeMemoryAllocationProvider extends C0VQ implements C0WK {
    public static final int PROVIDER_MEMORY = ProvidersRegistry.A00.A02("native_memory_allocation");
    public boolean isProfiling;
    public final Context mContext;
    public String mErrorMessage;
    public boolean mIsFileBackedBuffer;
    public C0WL mProviderTriggerMonitor;
    public boolean mReuseDispatchTable;

    public static native int nativeInitializeProfiling(Object obj, MultiBufferLogger multiBufferLogger, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, boolean z, boolean z2, int i9, boolean z3, boolean z4, boolean z5, int i10, boolean z6, int i11, String str2, boolean z7, int i12, int i13, int i14, boolean z8, String str3, boolean z9, int i15, boolean z10);

    public static native void nativeStartProfiling(boolean z);

    public static native void nativeStopProfiling();

    private synchronized void startProfiling() {
        File file;
        if (!this.isProfiling) {
            nativeStartProfiling(this.mReuseDispatchTable);
            if (this.mIsFileBackedBuffer && C0L6.A04 != null && (file = C0L6.A04.A09) != null) {
                try {
                    new File(file, "nativemp").createNewFile();
                } catch (IOException unused) {
                }
            }
            this.isProfiling = true;
        }
    }

    private synchronized void stopTraceIfRunning() {
        if (this.isProfiling) {
            nativeStopProfiling();
            this.isProfiling = false;
        }
        C0WL c0wl = this.mProviderTriggerMonitor;
        if (c0wl != null) {
            c0wl.A02();
            this.mProviderTriggerMonitor = null;
        }
        synchronized (C0Gj.class) {
            C0Gj.A06 = false;
            C0Gj.A00();
        }
    }

    @Override // X.C0VQ
    public synchronized int getTracingProviders() {
        int i;
        if (this.isProfiling) {
            i = PROVIDER_MEMORY;
            if ((TraceEvents.sProviders & i) != 0) {
            }
        }
        i = 0;
        return i;
    }

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDER_MEMORY;
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }

    public NativeMemoryAllocationProvider(Context context) {
        super("profilo_native_memory");
        this.mContext = context;
    }

    @Override // X.C0VQ
    public void disable() {
        int A03 = C0f9.A03(1026252937);
        stopTraceIfRunning();
        C0f9.A0A(-467005302, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d1, code lost:
    
        if (r49 == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d3, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02d4, code lost:
    
        r1.append(r0);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02db, code lost:
    
        if (r20 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02dd, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02de, code lost:
    
        r1.append(r0);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e5, code lost:
    
        if (r19 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e7, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e8, code lost:
    
        r1.append(r0);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ef, code lost:
    
        if (r51 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f1, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f2, code lost:
    
        r1.append(r0);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f9, code lost:
    
        if (r53 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02fb, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02fc, code lost:
    
        r1.append(r0);
        r1.append(',');
        r1.append(r8);
        r1.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0308, code lost:
    
        if (r55 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030a, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x030b, code lost:
    
        r1.append(r5);
        r10.A02(X.C0LK.A7b, X.C0M6.CRITICAL_REPORT, r1.toString());
        X.C0Gj.A09 = true;
        X.C0Gj.A06 = true;
        X.C0Gj.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0320, code lost:
    
        monitor-exit(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0321, code lost:
    
        if (r20 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0323, code lost:
    
        r49 = r49 | 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0325, code lost:
    
        if (r19 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0327, code lost:
    
        r49 = r49 | 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0329, code lost:
    
        r1 = nativeInitializeProfiling(r56, A02(), r24, r23, r22, r7, r4, r13, r11, r9, r36, r37, r38, r14, r40, r41, r42, r18, r44, r15, r21, r47, r12, r49, r50, r51, r52, r53, r8, r55);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x034f, code lost:
    
        if (r1 == 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0351, code lost:
    
        X.C0Gj.A01(r1, r56.mErrorMessage);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0358, code lost:
    
        if (r6 != 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x035a, code lost:
    
        startProfiling();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x035f, code lost:
    
        r56.mProviderTriggerMonitor = new X.C0WL(r56, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021b, code lost:
    
        r37 = false;
        r52 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00ce, code lost:
    
        r8 = r1.A08.A00("provider.native_memory_allocation.allocation_threshold_for_sync_unwinding", r0 ? 1 : 0);
        r55 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00e2, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.avoid_unwinding_if_deallocated", r0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00ac, code lost:
    
        r51 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00ae, code lost:
    
        if (r1 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00fd, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0108, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.use_no_op_allocation_registry", r0) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x010a, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x010c, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0118, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.enable_allocation_tracker", true) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x011a, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x011c, code lost:
    
        r6 = r1.A08.A00("provider.native_memory_allocation.when_to_start", r0 ? 1 : 0);
        r50 = r1.A08.A00("provider.native_memory_allocation.hash_mode", r0 ? 1 : 0);
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0138, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.reuse_dispatch_table", r0) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00e5, code lost:
    
        r12 = r1.A08.A00("provider.native_memory_allocation.unwind_on_free_chance", 0);
        r49 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00fa, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.log_memory_events", true) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x013c, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x006b, code lost:
    
        r44 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x006d, code lost:
    
        if (r1 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x006f, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0065, code lost:
    
        r42 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0067, code lost:
    
        if (r1 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0069, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0060, code lost:
    
        r41 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0062, code lost:
    
        if (r1 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0064, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0187, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.share_async_unwinder_thread", false) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01b5, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.mixed_stack", false) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r41 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.use_lock_free_queue_async_unwinder", true) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0140, code lost:
    
        r0 = false;
        r0 = false;
        r42 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014c, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.log_async_unwider_queue_stats", false) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0150, code lost:
    
        r18 = r1.A08.A00("provider.native_memory_allocation.async_unwinder_thread_priority", 0);
        r44 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0164, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.log_mapping_status_per_frame", false) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0168, code lost:
    
        r15 = r1.A08.A00("provider.native_memory_allocation.elements_to_discard_on_unwinder_overflow", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r36 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        r21 = r1.A08.A01("provider.native_memory_allocation.dynamic_sampling_config");
        r47 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.log_async_unwinder_failure", false) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r47 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r1 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        r49 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r1 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        r20 = false;
        r19 = true;
        r6 = 0;
        r50 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        r56.mReuseDispatchTable = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        r51 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.resolve_names_on_client", r0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        r53 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r1.A08.A02("provider.native_memory_allocation.enable_jit_unwinding", r0) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        r53 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        r55 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
    
        r5 = r56.mContext;
        r2 = r56.mReuseDispatchTable;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ca, code lost:
    
        monitor-enter(X.C0I7.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cb, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e0, code lost:
    
        if (X.C0I7.A00(r5, r2) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e2, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e3, code lost:
    
        monitor-exit(X.C0I7.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e4, code lost:
    
        if (r10 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e6, code lost:
    
        X.C0Gj.A01(r0 ? 1 : 0, X.AnonymousClass001.A0R("Cannot install hooks: ", com.facebook.common.mallochooks.jni.NativeAllocationHooksUtil$NativeImpl.sErrorMessage));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f1, code lost:
    
        X.C0f9.A0A(1019505328, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fa, code lost:
    
        r56.mIsFileBackedBuffer = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fc, code lost:
    
        if (r1 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fe, code lost:
    
        r1 = r1.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0204, code lost:
    
        if (r1.getFilePath() == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0206, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0207, code lost:
    
        r56.mIsFileBackedBuffer = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0209, code lost:
    
        if (r0 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        r36 = r1.generateMemoryMappingFilePath();
        r52 = r1.generateLocalSymbolsFilePath();
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0215, code lost:
    
        r2 = r56.mIsFileBackedBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0219, code lost:
    
        monitor-enter(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0220, code lost:
    
        r10 = X.C04770Mv.A00;
        r1 = new java.lang.StringBuilder(com.facebook.tigon.tigonhuc.HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
        r5 = 0;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x022d, code lost:
    
        if (r2 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022f, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0230, code lost:
    
        r1.append(r0);
        r1.append(',');
        r1.append(r24);
        r1.append(',');
        r1.append(r23);
        r1.append(',');
        r1.append(r22);
        r1.append(',');
        r1.append(r7);
        r1.append(',');
        r1.append(r4);
        r1.append(',');
        r1.append(r13);
        r1.append(',');
        r1.append(r11);
        r1.append(',');
        r1.append(r9);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x026f, code lost:
    
        if (r38 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0271, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0272, code lost:
    
        r1.append(r0);
        r1.append(',');
        r1.append(r14);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x027f, code lost:
    
        if (r40 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0281, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0282, code lost:
    
        r1.append(r0);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0289, code lost:
    
        if (r41 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x028b, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x028c, code lost:
    
        r1.append(r0);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0293, code lost:
    
        if (r42 == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0295, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0296, code lost:
    
        r1.append(r0);
        r1.append(',');
        r1.append(r18);
        r1.append(',');
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a5, code lost:
    
        if (r44 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02a7, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02a8, code lost:
    
        r1.append(r0);
        r1.append(',');
        r1.append(r15);
        r1.append(",(");
        r1.append(r21);
        r1.append("),");
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02c1, code lost:
    
        if (r47 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02c3, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c4, code lost:
    
        r1.append(r0);
        r1.append(',');
        r1.append(r12);
        r1.append(',');
        r0 = 0;
     */
    @Override // X.C0VQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.nativememory.NativeMemoryAllocationProvider.enable():void");
    }

    @Override // X.C0VQ
    public void onTraceEnded(TraceContext traceContext, C20020yW c20020yW) {
        int A03 = C0f9.A03(-78574562);
        stopTraceIfRunning();
        C0f9.A0A(-1884952386, A03);
    }

    @Override // X.C0WK
    public void onTrigger() {
        startProfiling();
    }
}
