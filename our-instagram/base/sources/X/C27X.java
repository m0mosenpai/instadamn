package X;

import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Iterator;

/* renamed from: X.27X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27X implements AnonymousClass266 {
    @Override // X.AnonymousClass266
    public final boolean Bv4() {
        return true;
    }

    @Override // X.AnonymousClass266
    public final void FEr(UserSession userSession, File file) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(file, 1);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            N0B n0b = N0B.A00;
            try {
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(fileOutputStream));
                try {
                    Object obj = n0b.A02;
                    synchronized (obj) {
                    }
                    synchronized (obj) {
                        EvictingQueue evictingQueue = n0b.A00;
                        if (evictingQueue == null) {
                            evictingQueue = new EvictingQueue(1000);
                            n0b.A00 = evictingQueue;
                        }
                        Iterator<E> it = evictingQueue.iterator();
                        while (it.hasNext()) {
                            printWriter.println((String) it.next());
                        }
                    }
                    printWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    printWriter.close();
                    throw th;
                }
            } catch (Throwable th2) {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C20I.A00(fileOutputStream, th3);
                throw th4;
            }
        }
    }

    @Override // X.AnonymousClass266
    public final String getFilenameSuffix() {
        return "";
    }

    @Override // X.AnonymousClass266
    public final String getTag() {
        return "RtcBugReporterFileProvider";
    }

    @Override // X.AnonymousClass266
    public final String getFilenamePrefix() {
        return "rtc_app_log.txt";
    }
}
