package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import java.util.HashSet;
import java.util.Random;

/* renamed from: X.0Ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC06380Ve extends Handler {
    public final C0VZ A00;
    public final C20020yW A01;
    public final InterfaceC06430Vk A02;
    public final HashSet A03;
    public final Random A04;

    public final synchronized void A01(TraceContext traceContext) {
        HashSet hashSet = this.A03;
        if (hashSet.contains(Long.valueOf(traceContext.A06))) {
            sendMessage(obtainMessage(3, traceContext));
            hashSet.remove(Long.valueOf(traceContext.A06));
        }
    }

    public final synchronized void A02(TraceContext traceContext) {
        HashSet hashSet = this.A03;
        if (hashSet.contains(Long.valueOf(traceContext.A06))) {
            sendMessage(obtainMessage(2, traceContext));
            hashSet.remove(Long.valueOf(traceContext.A06));
        }
    }

    public static void A00(TraceContext traceContext) {
        BufferLogger.writeStandardEntry(traceContext.A09, 6, 98, 0L, 0, traceContext.A08.A00("trace_config.logger_priority", 5), 0, traceContext.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0148, code lost:
    
        if (r14 == 0) goto L100;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r20) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC06380Ve.handleMessage(android.os.Message):void");
    }

    public HandlerC06380Ve(Looper looper, C20020yW c20020yW, InterfaceC06430Vk interfaceC06430Vk) {
        super(looper);
        this.A01 = c20020yW;
        this.A02 = interfaceC06430Vk;
        this.A03 = new HashSet();
        this.A00 = new C0VZ();
        this.A04 = new Random();
    }
}
