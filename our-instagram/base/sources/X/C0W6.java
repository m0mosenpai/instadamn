package X;

import android.os.Process;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.0W6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0W6 extends Thread {
    public final long A00;
    public final NativeTraceWriter A01;
    public final String A02;
    public final String A03;
    public final Buffer[] A04;
    public final C20160yn A05;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.profilo.writer.NativeTraceWriter, java.lang.Object] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                Process.setThreadPriority(5);
                this.A01.loop();
                Buffer[] bufferArr = this.A04;
                int length = bufferArr.length;
                if (length > 1) {
                    String str = this.A03;
                    StringBuilder sb = new StringBuilder(str.length() + 2);
                    int i = 1;
                    do {
                        sb.setLength(0);
                        sb.append(str);
                        sb.append('-');
                        sb.append(i);
                        Buffer buffer = bufferArr[i];
                        String str2 = this.A02;
                        String obj = sb.toString();
                        ?? obj2 = new Object();
                        obj2.mHybridData = NativeTraceWriter.initHybrid(buffer, str2, obj, null);
                        obj2.dump(this.A00);
                        i++;
                    } while (i < length);
                }
            } catch (RuntimeException e) {
                this.A05.onTraceWriteException(this.A00, e);
            }
        } finally {
            this.A05.A00();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.profilo.writer.NativeTraceWriter, java.lang.Object] */
    public C0W6(NativeTraceWriterCallbacks nativeTraceWriterCallbacks, String str, String str2, Buffer[] bufferArr, long j) {
        super("Prflo:Logger");
        this.A00 = j;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = bufferArr;
        C20160yn c20160yn = new C20160yn(nativeTraceWriterCallbacks, bufferArr.length > 1);
        this.A05 = c20160yn;
        NativeTraceWriter nativeTraceWriter = NativeTraceWriter.$redex_init_class;
        Buffer buffer = bufferArr[0];
        String A0R = AnonymousClass001.A0R(str2, "-0");
        ?? obj = new Object();
        obj.mHybridData = NativeTraceWriter.initHybrid(buffer, str, A0R, c20160yn);
        this.A01 = obj;
    }
}
