package X;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.Obb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55117Obb {
    public static final C55117Obb A00 = new Object();

    public static final Object A00(AbstractC12990ll abstractC12990ll, ExecutorService executorService, InterfaceC16820sZ interfaceC16820sZ) {
        long A01 = C18U.A01(C06090Tz.A05, abstractC12990ll, 36605770041398613L);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (A01 <= 0) {
            return interfaceC16820sZ.invoke();
        }
        Future submit = executorService.submit(new PUG(interfaceC16820sZ, 2));
        try {
            return submit.get(A01, timeUnit);
        } catch (TimeoutException e) {
            submit.cancel(true);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(android.net.Uri uri, AbstractC12990ll abstractC12990ll, boolean z) {
        C09540e5 c09540e5;
        boolean A06 = C18U.A06(C06090Tz.A05, abstractC12990ll, 36320983644120103L);
        if (z && A06) {
            try {
                File A002 = AbstractC53645Nnq.A00(uri);
                if (A002.length() == 0) {
                    A002.getPath();
                    c09540e5 = A002;
                } else {
                    File file = new File(A002.getParent(), AnonymousClass001.A0R(A002.getName(), ".gz"));
                    FileInputStream fileInputStream = new FileInputStream(A002);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(MSW.A0x(file));
                        try {
                            AbstractC54919OQu.A00(fileInputStream, gZIPOutputStream);
                            gZIPOutputStream.close();
                            fileInputStream.close();
                            file.length();
                            file.getName();
                            boolean renameTo = file.renameTo(A002);
                            c09540e5 = A002;
                            if (!renameTo) {
                                throw MSW.A0y(AnonymousClass001.A0u("Failed to rename ", file.getPath(), " to ", A002.getPath()));
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C20I.A00(fileInputStream, th);
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                c09540e5 = MSW.A1D(th3);
            }
            Throwable A003 = C09550e6.A00(c09540e5);
            if (A003 != null) {
                C0K8.A0G("BugReporterFileUtil", AbstractC167017dG.A0n(uri, "Failed to gzip attachment ", AbstractC166987dD.A1C()), A003);
            }
        }
    }
}
