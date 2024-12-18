package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;

/* renamed from: X.265, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass265 implements AnonymousClass266 {
    @Override // X.AnonymousClass266
    public final boolean Bv4() {
        return true;
    }

    @Override // X.AnonymousClass266
    public final void FEr(UserSession userSession, File file) {
        Object c09540e5;
        BufferedWriter bufferedWriter;
        C14360o3.A0B(file, 1);
        synchronized (LFZ.A01) {
            EvictingQueue evictingQueue = LFZ.A00;
            evictingQueue.size();
            try {
                Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), C15W.A05);
                if (outputStreamWriter instanceof BufferedWriter) {
                    bufferedWriter = (BufferedWriter) outputStreamWriter;
                } else {
                    bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
                }
                try {
                    Iterator<E> it = evictingQueue.iterator();
                    while (it.hasNext()) {
                        bufferedWriter.write((String) it.next());
                        bufferedWriter.newLine();
                    }
                    c09540e5 = C0eB.A00;
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                c09540e5 = new C09540e5(th);
            }
            Throwable A00 = C09550e6.A00(c09540e5);
            if (A00 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("err writing file: ");
                sb.append(file);
                C0K8.A0F("FlytrapVideoLogCache", sb.toString(), A00);
            }
        }
    }

    @Override // X.AnonymousClass266
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.AnonymousClass266
    public final String getTag() {
        return "VideoPlayerLogProvider";
    }

    @Override // X.AnonymousClass266
    public final String getFilenamePrefix() {
        return "videoplayerlog";
    }
}
