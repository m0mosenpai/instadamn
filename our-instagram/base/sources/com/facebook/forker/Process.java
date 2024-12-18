package com.facebook.forker;

import X.AnonymousClass001;
import X.C09170dP;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class Process extends java.lang.Process implements Closeable {
    public static final int FD_STREAM_INPUT = 0;
    public static final int FD_STREAM_OUTPUT = 1;
    public static final int IGNORE_FD = -1;
    public static final int SD_BLACK_HOLE = -3;
    public static final int SD_INHERIT = -2;
    public static final int SD_PIPE = -4;
    public static final int SD_STDOUT = -5;
    public static final int SIGCONT = 18;
    public static final int SIGKILL = 9;
    public static final int SIGSTOP = 19;
    public static final int SIGTERM = 15;
    public static final int SIGTSTP = 20;
    public static final int STATUS_EXITED = 4;
    public static final int STATUS_RUNNING = 1;
    public static final int STATUS_STOPPED = 2;
    public static final int STDERR = 2;
    public static final int STDIN = 0;
    public static final int STDOUT = 1;
    public static final String TAG = "fb-Process";
    public static final int WAIT_RESULT_RUNNING = -2147483646;
    public static final int WAIT_RESULT_STOPPED = -2147483647;
    public static final int WAIT_RESULT_TIMEOUT = Integer.MIN_VALUE;
    public InputStream mChildStderr;
    public OutputStream mChildStdin;
    public InputStream mChildStdout;
    public int mExitStatus;
    public int mPid;
    public int mProcessStatus;
    public WaiterThread mWaiterThread = new WaiterThread();

    /* loaded from: classes.dex */
    public final class WaiterThread extends Thread {
        public WaiterThread() {
            super("PidWaiter:Ready");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.this.nativeWait();
        }
    }

    private native void nativeKill(int i);

    private native int nativeLaunch(String str, String[] strArr, byte[] bArr, int[] iArr, int[] iArr2);

    public static native void nativeUnixClose(int i);

    public static native int nativeUnixCreateTmpFile(String str);

    public static native int nativeUnixOpen(String str);

    public static native int[] nativeUnixPipe(int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeWait();

    public synchronized int exitValueEx() {
        if (this.mProcessStatus == 4) {
        } else {
            throw new IllegalThreadStateException(AnonymousClass001.A0O("Process has not yet terminated: ", this.mPid));
        }
        return this.mExitStatus;
    }

    public synchronized int waitFor(int i, int i2) {
        int i3;
        while (true) {
            int i4 = this.mProcessStatus;
            if ((i4 & i2) == 0) {
                if (i4 != 4) {
                    if (i == 0) {
                        break;
                    }
                    if (i > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        wait(i);
                        long max = Math.max(0L, System.currentTimeMillis() - currentTimeMillis);
                        if (i < max) {
                            i = 0;
                        } else {
                            i -= (int) max;
                        }
                    } else {
                        wait();
                    }
                } else if (i != 0) {
                    throw new RuntimeException(AnonymousClass001.A0O("process entered unexpected state ", 4));
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 4) {
                        i3 = this.mExitStatus;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    i3 = WAIT_RESULT_STOPPED;
                }
            } else {
                i3 = WAIT_RESULT_RUNNING;
            }
        }
        i3 = Integer.MIN_VALUE;
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Process(java.lang.String r18, java.lang.String[] r19, byte[] r20, int[] r21, int[] r22, java.io.File r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.<init>(java.lang.String, java.lang.String[], byte[], int[], int[], java.io.File):void");
    }

    public static String describeStatus(int i) {
        StringBuilder sb;
        if (i < 0) {
            sb = new StringBuilder();
            sb.append("killed by signal ");
            i = -i;
        } else if (i > 0) {
            sb = new StringBuilder();
            sb.append("exited with status ");
        } else {
            return "exited successfully";
        }
        sb.append(i);
        return sb.toString();
    }

    public static String fdMagicName(int i) {
        return AnonymousClass001.A0p("/proc/", "/task/", "/fd/", android.os.Process.myPid(), android.os.Process.myTid(), i);
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void unixClose(int[] iArr) {
        if (iArr != null) {
            for (int i : iArr) {
                unixClose(i);
            }
        }
    }

    @Override // java.lang.Process
    public void destroy() {
        nativeKill(9);
        boolean z = false;
        while (true) {
            try {
                this.mWaiterThread.join();
                break;
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
        }
        synchronized (this) {
            safeClose(this.mChildStdin);
            safeClose(this.mChildStdout);
            safeClose(this.mChildStderr);
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.lang.Process
    public InputStream getErrorStream() {
        return this.mChildStderr;
    }

    @Override // java.lang.Process
    public InputStream getInputStream() {
        return this.mChildStdout;
    }

    @Override // java.lang.Process
    public OutputStream getOutputStream() {
        return this.mChildStdin;
    }

    public int getPid() {
        return this.mPid;
    }

    public int waitForUninterruptibly(int i, int i2) {
        long j = 0;
        boolean z = false;
        int i3 = Integer.MIN_VALUE;
        do {
            if (i > 0) {
                j = System.currentTimeMillis();
            }
            try {
                i3 = waitFor(i, i2);
                if (i3 != Integer.MIN_VALUE) {
                    break;
                }
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
            if (i > 0) {
                long max = Math.max(0L, System.currentTimeMillis() - j);
                if (i < max) {
                    break;
                }
                i -= (int) max;
            }
        } while (i != 0);
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i3;
    }

    static {
        C09170dP.A0C("forker");
    }

    public static Object openFdStream(int i, int i2) {
        String fdMagicName = fdMagicName(i);
        try {
            if (i2 == 0) {
                return new FileInputStream(fdMagicName);
            }
            return new FileOutputStream(fdMagicName);
        } catch (FileNotFoundException unused) {
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(i);
            if (i2 == 0) {
                return new ParcelFileDescriptor.AutoCloseInputStream(fromFd);
            }
            return new ParcelFileDescriptor.AutoCloseOutputStream(fromFd);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        destroy();
    }

    @Override // java.lang.Process
    public int exitValue() {
        int exitValueEx = exitValueEx();
        if (exitValueEx < 0) {
            return (-exitValueEx) + 128;
        }
        return exitValueEx;
    }

    public void kill(int i) {
        nativeKill(i);
    }

    public static void unixClose(int i) {
        if (i != -1) {
            nativeUnixClose(i);
        }
    }

    @Override // java.lang.Process
    public synchronized int waitFor() {
        while (this.mProcessStatus != 4) {
            wait();
        }
        return exitValue();
    }

    public int waitForUninterruptibly() {
        int waitFor;
        boolean z = false;
        while (true) {
            try {
                waitFor = waitFor();
                break;
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return waitFor;
    }
}
