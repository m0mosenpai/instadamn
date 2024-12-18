package X;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0DM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DM {
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, X.0BH] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final synchronized C0QO A00(Context context) {
        C0QI A00;
        FileInputStream fileInputStream;
        C0QO c0qo;
        try {
            if (!C0QO.A0I) {
                int availableProcessors = Runtime.getRuntime().availableProcessors() + 1 + 1;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(100, new Object()), new ThreadFactory() { // from class: X.0DQ
                    public final AtomicInteger A00 = new AtomicInteger(0);

                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(final Runnable runnable) {
                        String valueOf;
                        int andIncrement = this.A00.getAndIncrement();
                        if (andIncrement == 0) {
                            valueOf = "Monitor";
                        } else {
                            valueOf = String.valueOf(andIncrement);
                        }
                        return new Thread(new Runnable() { // from class: X.0DP
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i;
                                int i2 = C0QO.A0H;
                                if (i2 != 1) {
                                    i = 10;
                                    if (i2 != 2) {
                                        i = 0;
                                    }
                                } else {
                                    i = 19;
                                }
                                try {
                                    Process.setThreadPriority(i);
                                } catch (IllegalArgumentException | SecurityException unused) {
                                }
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            }
                        }, AnonymousClass001.A0R("AppInit", valueOf));
                    }
                }, new Object());
                C0E2 c0e2 = C0E2.A01;
                if (C0E2.A02 != null) {
                    A00 = C0E2.A02;
                } else {
                    synchronized (C0E2.class) {
                        try {
                            if (C0E2.A02 != null) {
                                A00 = C0E2.A02;
                            } else {
                                File fileStreamPath = context.getFileStreamPath("startup_experiments");
                                if (fileStreamPath != null && fileStreamPath.exists()) {
                                    if (fileStreamPath.length() > 2147483647L) {
                                        C0E2.A00(c0e2, "File too large: %d %s", Long.valueOf(fileStreamPath.length()), "startup_experiments");
                                    } else {
                                        int length = (int) fileStreamPath.length();
                                        try {
                                            fileInputStream = new FileInputStream(fileStreamPath);
                                        } catch (Exception e) {
                                            String message = e.getMessage();
                                            C14360o3.A0A(message);
                                            Object[] objArr = {message, "startup_experiments"};
                                            synchronized (c0e2) {
                                                Object[] copyOf = Arrays.copyOf(objArr, 2);
                                                String format = String.format("Cannot read file: %s %s", Arrays.copyOf(copyOf, copyOf.length));
                                                C14360o3.A07(format);
                                                android.util.Log.e("FbColdStartExperimentsLoader", format, e);
                                                if (C0E2.A00 == null) {
                                                    C0E2.A00 = format;
                                                }
                                            }
                                        }
                                        try {
                                            byte[] bArr = new byte[length];
                                            int min = Math.min(length, length);
                                            int i = 0;
                                            while (true) {
                                                if (i >= min) {
                                                    break;
                                                }
                                                int read = fileInputStream.read(bArr, i, min - i);
                                                if (read >= 0) {
                                                    i += read;
                                                } else if (read == -1 && i == 0) {
                                                    i = -1;
                                                }
                                            }
                                            if (i > 0) {
                                                A00 = C0E3.A01(ByteBuffer.wrap(bArr, 0, i));
                                                fileInputStream.close();
                                                if (A00 != null) {
                                                    C0E2.A02 = A00;
                                                }
                                            }
                                            C0E2.A00(c0e2, "Unable to slurp file: %d %s", Integer.valueOf(i), "startup_experiments");
                                            fileInputStream.close();
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                C20I.A00(fileInputStream, th);
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                                A00 = C0E3.A00();
                                C0E2.A02 = A00;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                C0QO.A0H = A00.A05;
                c0qo = new C0QO(new Object(), threadPoolExecutor);
                C0QO.A0K = c0qo;
                C0QO.A0I = true;
                synchronized (C0DL.class) {
                    try {
                        if (!C0DL.A01) {
                            C0DL.A00();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return c0qo;
    }
}
