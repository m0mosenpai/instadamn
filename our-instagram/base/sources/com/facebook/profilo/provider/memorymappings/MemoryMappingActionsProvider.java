package com.facebook.profilo.provider.memorymappings;

import X.C0Gj;
import X.C0VQ;
import X.C0f9;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: classes.dex */
public final class MemoryMappingActionsProvider extends C0VQ {
    public static final int PROVIDER_MAPPINGS = ProvidersRegistry.A00.A02("memory_mapping_actions");
    public boolean isProfiling;

    public static native void nativeStartProfiling(MultiBufferLogger multiBufferLogger, int i, int i2, String str, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, String str2);

    public static native void nativeStopProfiling();

    @Override // X.C0VQ
    public int getSupportedProviders() {
        return PROVIDER_MAPPINGS;
    }

    @Override // X.C0VQ
    public int getTracingProviders() {
        if (this.isProfiling) {
            int i = PROVIDER_MAPPINGS;
            if ((TraceEvents.sProviders & i) != 0) {
                return i;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.C0VQ
    public void disable() {
        int A03 = C0f9.A03(2132660497);
        nativeStopProfiling();
        this.isProfiling = false;
        synchronized (C0Gj.class) {
            C0Gj.A05 = false;
            C0Gj.A00();
        }
        C0f9.A0A(-930113607, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r5 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r13 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r5.A08.A02("provider.memory_mapping_actions.use_lock_free_queue_async_unwinder", true) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        r16 = r5.A08.A00("provider.memory_mapping_actions.async_unwinder_thread_priority", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r8 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r5 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r5 = r5.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r5.getFilePath() == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r10 = r5.generateMemoryMappingFilePath();
        r17 = r5.generateLocalSymbolsFilePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        monitor-enter(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        X.C0Gj.A08 = true;
        X.C0Gj.A05 = true;
        X.C0Gj.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        monitor-exit(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        nativeStartProfiling(A02(), r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        r18.isProfiling = true;
        r0 = 596278585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        r5 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        monitor-enter(X.C0Gj.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        r0 = X.C0Gj.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if (r0 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        r1 = r0.A00.markEventBuilder(21375349, "mappings_provider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if (r1.isSampled() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        if (r5 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        r1.annotate("error_message", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        r1.report();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        X.C0Gj.A08 = false;
        X.C0Gj.A05 = false;
        X.C0Gj.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
    
        r0 = 849709483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0062, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0044, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0045, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006f, code lost:
    
        r13 = r5.A08.A00("provider.memory_mapping_actions.async_unwinder_queue_size", 256);
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r5.A08.A02("provider.memory_mapping_actions.share_async_unwinder_thread", false) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0020, code lost:
    
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r5.A08.A02("provider.memory_mapping_actions.detail_fd", true) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r5.A08.A02("provider.memory_mapping_actions.log_unmapping", true) == false) goto L14;
     */
    @Override // X.C0VQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.memorymappings.MemoryMappingActionsProvider.enable():void");
    }
}
