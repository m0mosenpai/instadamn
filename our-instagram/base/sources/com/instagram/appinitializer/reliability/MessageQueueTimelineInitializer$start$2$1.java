package com.instagram.appinitializer.reliability;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C006802i;
import X.C0L6;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.os.Process;
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer$start$2$1", f = "MessageQueueTimelineInitializer.kt", i = {0, 0, 0, 0, 0, 0}, l = {183}, m = "invokeSuspend", n = {"$this$launch", "wasCancelled", "$this$invokeSuspend_u24lambda_u247", "messageQueue", "instance", "startElapsedCpuTimeMs"}, s = {"L$0", "L$1", "L$4", "L$5", "I$0", "J$0"})
/* loaded from: classes8.dex */
public final class MessageQueueTimelineInitializer$start$2$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public long A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ MessageQueueTimelineInitializer A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageQueueTimelineInitializer$start$2$1(MessageQueueTimelineInitializer messageQueueTimelineInitializer, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A09 = messageQueueTimelineInitializer;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        MessageQueueTimelineInitializer$start$2$1 messageQueueTimelineInitializer$start$2$1 = new MessageQueueTimelineInitializer$start$2$1(this.A09, interfaceC23621Ds);
        messageQueueTimelineInitializer$start$2$1.A08 = obj;
        return messageQueueTimelineInitializer$start$2$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x017f A[Catch: all -> 0x020d, TRY_ENTER, TryCatch #3 {, blocks: (B:9:0x017f, B:11:0x018b, B:12:0x018f, B:14:0x019c, B:15:0x01a0, B:106:0x01cf, B:108:0x01db, B:109:0x01df, B:111:0x01ec, B:112:0x01f0, B:6:0x0023, B:24:0x005b, B:25:0x008e, B:81:0x0156, B:82:0x0157, B:92:0x01c3, B:93:0x01c4, B:100:0x01c6, B:101:0x01c9), top: B:2:0x0009, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.0oO] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0178 -> B:7:0x017b). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appinitializer.reliability.MessageQueueTimelineInitializer$start$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static void A00(C006802i c006802i, int i, long j) {
        c006802i.markerAnnotate(694559645, i, "end_endpoint", C0L6.A00());
        c006802i.markerAnnotate(694559645, i, "end_is_foreground", C0L6.A07());
        c006802i.markerAnnotate(694559645, i, "elapsed_cpu_time_delta_ms", Process.getElapsedCpuTime() - j);
        c006802i.markerAnnotate(694559645, i, "end_uptime_ms", SystemClock.uptimeMillis());
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageQueueTimelineInitializer$start$2$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
