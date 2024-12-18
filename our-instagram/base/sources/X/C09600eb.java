package X;

import android.content.Context;
import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09600eb extends AbstractC19980yS {
    public Context A00;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r3.isEmpty() == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(com.facebook.profilo.mmapbuf.core.Buffer r15) {
        /*
            r14 = this;
            android.content.Context r1 = r14.A00     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L79
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto Ld
            return
        Ld:
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L5b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Iterator r5 = r0.iterator()
        L1c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r4 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r1 = r4.uid
            int r0 = android.os.Process.myUid()
            if (r1 != r0) goto L1c
            java.lang.String r3 = r4.processName
            java.lang.String r2 = "("
            int r1 = r4.pid
            java.lang.String r0 = "),"
            java.lang.String r0 = X.AnonymousClass001.A06(r1, r3, r2, r0)
            r6.append(r0)
            goto L1c
        L40:
            int r0 = r6.length()
            if (r0 == 0) goto L4f
            int r0 = r6.length()
            int r0 = r0 + (-1)
            r6.deleteCharAt(r0)
        L4f:
            java.lang.String r3 = r6.toString()
            if (r3 == 0) goto L5b
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L5d
        L5b:
            java.lang.String r3 = "PROCESS_METADATA_PROVIDER_FAILED_TO_GET_PROCESS_LIST"
        L5d:
            r5 = 6
            r6 = 76
            r7 = 0
            r9 = 0
            r4 = r15
            r10 = r9
            r11 = r9
            r12 = r7
            int r2 = com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r4, r5, r6, r7, r9, r10, r11, r12)
            r1 = 56
            java.lang.String r0 = "processes"
            int r1 = com.facebook.profilo.logger.BufferLogger.writeBytesEntry(r15, r9, r1, r2, r0)
            r0 = 57
            com.facebook.profilo.logger.BufferLogger.writeBytesEntry(r15, r9, r0, r1, r3)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09600eb.A00(com.facebook.profilo.mmapbuf.core.Buffer):void");
    }

    @Override // X.AbstractC19980yS
    public final void A07(TraceContext traceContext, C20020yW c20020yW) {
        A00(traceContext.A09);
    }

    @Override // X.AbstractC19980yS
    public final void logOnTraceEnd(TraceContext traceContext, C20020yW c20020yW) {
        A00(traceContext.A09);
    }
}
