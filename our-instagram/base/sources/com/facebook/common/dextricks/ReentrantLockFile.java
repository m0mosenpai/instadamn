package com.facebook.common.dextricks;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public final class ReentrantLockFile implements Closeable {
    public static final int ACQUIRE_SHARED = 1;
    public static final boolean LOCK_DEBUG = false;
    public static final ReentrantLockFile sListHead = new ReentrantLockFile();
    public final File lockFileName;
    public FileChannel mChannel;
    public int mLockFlags;
    public final Lock mLockHandle;
    public boolean mLockInProgress;
    public Thread mLockOwner;
    public int mLockShareCount;
    public ReentrantLockFile mNext;
    public ReentrantLockFile mPrev;
    public int mReferenceCount;
    public FileLock mTheLock;

    /* loaded from: classes.dex */
    public final class Lock implements Closeable {
        public Lock() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLockFile.this.release();
        }

        public ReentrantLockFile getReentrantLockFile() {
            return ReentrantLockFile.this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r10.mLockOwner == java.lang.Thread.currentThread()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0021, code lost:
    
        if (r1 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.facebook.common.dextricks.ReentrantLockFile.Lock tryAcquire(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.nio.channels.FileChannel r4 = r10.mChannel     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L62
            r0 = r11 & 1
            r1 = 0
            r9 = 0
            if (r0 == 0) goto Lc
            r9 = 1
        Lc:
            boolean r0 = r10.mLockInProgress     // Catch: java.lang.Throwable -> L70
            r3 = 0
            if (r0 != 0) goto L60
            int r2 = r10.mLockShareCount     // Catch: java.lang.Throwable -> L70
            if (r2 <= 0) goto L32
            int r0 = r10.mLockFlags     // Catch: java.lang.Throwable -> L70
            r0 = r0 & 1
            if (r0 == 0) goto L1c
            r1 = 1
        L1c:
            if (r9 == 0) goto L21
            if (r1 != 0) goto L2b
            goto L23
        L21:
            if (r1 != 0) goto L60
        L23:
            java.lang.Thread r1 = r10.mLockOwner     // Catch: java.lang.Throwable -> L70
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L70
            if (r1 != r0) goto L60
        L2b:
            int r0 = r2 + 1
            r10.mLockShareCount = r0     // Catch: java.lang.Throwable -> L70
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r10.mLockHandle     // Catch: java.lang.Throwable -> L70
            goto L47
        L32:
            r5 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.nio.channels.FileLock r0 = r4.tryLock(r5, r7, r9)     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L70
            if (r0 == 0) goto L60
            r10.addrefLocked()     // Catch: java.lang.Throwable -> L70
            r10.claimLock(r11, r0)     // Catch: java.lang.Throwable -> L70
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r10.mLockHandle     // Catch: java.lang.Throwable -> L70
        L47:
            monitor-exit(r10)
            return r0
        L49:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L6a
            java.lang.String r0 = ": EAGAIN ("
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L60
            java.lang.String r0 = ": errno 11 ("
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6a
        L60:
            monitor-exit(r10)
            return r3
        L62:
            java.lang.String r1 = "cannot acquire closed lock"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L70
            goto L6f
        L6a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L70
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L70
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.tryAcquire(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }

    private void addrefLocked() {
        if (this.mChannel != null) {
            this.mReferenceCount++;
            return;
        }
        throw new IllegalStateException("cannot add reference to dead lock");
    }

    private void claimLock(int i, FileLock fileLock) {
        if ((i & 1) == 0) {
            this.mLockOwner = Thread.currentThread();
        }
        this.mTheLock = fileLock;
        this.mLockFlags = i;
        this.mLockShareCount = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0020, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0021, code lost:
    
        r1 = new java.io.RandomAccessFile(r4, "rw");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        r0 = r1.getChannel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        r1 = new com.facebook.common.dextricks.ReentrantLockFile(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0032, code lost:
    
        r1.mPrev = r3;
        r1.mNext = r3.mNext;
        r3.mNext = r1;
        r1.mNext.mPrev = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0040, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        com.facebook.common.dextricks.Fs.safeClose(r2);
        com.facebook.common.dextricks.Fs.safeClose(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0042, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0043, code lost:
    
        r0 = null;
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.facebook.common.dextricks.ReentrantLockFile open(java.io.File r6) {
        /*
            java.lang.Class<com.facebook.common.dextricks.ReentrantLockFile> r5 = com.facebook.common.dextricks.ReentrantLockFile.class
            monitor-enter(r5)
            java.io.File r4 = r6.getAbsoluteFile()     // Catch: java.lang.Throwable -> L4f
            com.facebook.common.dextricks.ReentrantLockFile r1 = com.facebook.common.dextricks.ReentrantLockFile.sListHead     // Catch: java.lang.Throwable -> L4f
        L9:
            com.facebook.common.dextricks.ReentrantLockFile r1 = r1.mNext     // Catch: java.lang.Throwable -> L4f
            com.facebook.common.dextricks.ReentrantLockFile r3 = com.facebook.common.dextricks.ReentrantLockFile.sListHead     // Catch: java.lang.Throwable -> L4f
            if (r1 == r3) goto L20
            java.io.File r0 = r1.lockFileName     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L9
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L4f
            r1.addrefLocked()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            goto L3e
        L1d:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            goto L4e
        L20:
            r2 = 0
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L46
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L46
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L42
            com.facebook.common.dextricks.ReentrantLockFile r1 = new com.facebook.common.dextricks.ReentrantLockFile     // Catch: java.lang.Throwable -> L40
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L40
            r1.mPrev = r3     // Catch: java.lang.Throwable -> L46
            com.facebook.common.dextricks.ReentrantLockFile r0 = r3.mNext     // Catch: java.lang.Throwable -> L46
            r1.mNext = r0     // Catch: java.lang.Throwable -> L46
            r3.mNext = r1     // Catch: java.lang.Throwable -> L46
            com.facebook.common.dextricks.ReentrantLockFile r0 = r1.mNext     // Catch: java.lang.Throwable -> L46
            r0.mPrev = r1     // Catch: java.lang.Throwable -> L46
        L3e:
            monitor-exit(r5)
            return r1
        L40:
            r3 = move-exception
            goto L48
        L42:
            r3 = move-exception
            r0 = r2
            r2 = r1
            goto L48
        L46:
            r3 = move-exception
            r0 = r2
        L48:
            com.facebook.common.dextricks.Fs.safeClose(r2)     // Catch: java.lang.Throwable -> L4f
            com.facebook.common.dextricks.Fs.safeClose(r0)     // Catch: java.lang.Throwable -> L4f
        L4e:
            throw r3     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.open(java.io.File):com.facebook.common.dextricks.ReentrantLockFile");
    }

    public Lock acquireInterruptubly(int i) {
        boolean z = false;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z2 = true;
        }
        assertMonitorLockNotHeld();
        try {
            synchronized (this) {
                boolean z3 = false;
                while (tryAcquire(i) == null) {
                    try {
                        if (this.mLockInProgress || this.mLockShareCount != 0) {
                            if (!z3) {
                                addrefLocked();
                                z3 = true;
                            }
                            wait();
                        } else {
                            if (!z3) {
                                addrefLocked();
                            }
                            this.mLockInProgress = true;
                            try {
                                try {
                                    try {
                                        FileLock lock = this.mChannel.lock(0L, Long.MAX_VALUE, z2);
                                        if (lock == null) {
                                            synchronized (this) {
                                                try {
                                                    this.mLockInProgress = false;
                                                    notifyAll();
                                                } finally {
                                                }
                                            }
                                            close();
                                        }
                                        try {
                                            synchronized (this) {
                                                try {
                                                    claimLock(i, lock);
                                                    this.mLockInProgress = false;
                                                    notifyAll();
                                                    return this.mLockHandle;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    z = true;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        throw th;
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    close();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                synchronized (this) {
                                    try {
                                        this.mLockInProgress = false;
                                        notifyAll();
                                        close();
                                        throw th4;
                                    } finally {
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        while (true) {
                            break;
                        }
                    }
                }
                Lock lock2 = this.mLockHandle;
                if (z3) {
                    close();
                }
                return lock2;
            }
        } catch (Throwable th6) {
            th = th6;
            if (!z) {
                throw th;
            }
        }
    }

    public void donateLock(Thread thread) {
        boolean z = false;
        if (this.mLockOwner == Thread.currentThread()) {
            z = true;
        }
        Mlog.assertThat(z, "caller must own lock exclusively", new Object[0]);
        this.mLockOwner = thread;
    }

    public Thread getExclusiveOwner() {
        return this.mLockOwner;
    }

    public void stealLock() {
        boolean z = false;
        if (this.mLockOwner != null) {
            z = true;
        }
        Mlog.assertThat(z, "cannot steal unowned lock", new Object[0]);
        this.mLockOwner = Thread.currentThread();
    }

    public ReentrantLockFile(File file, FileChannel fileChannel) {
        this.lockFileName = file;
        this.mChannel = fileChannel;
        this.mReferenceCount = 1;
        this.mLockHandle = new Lock();
    }

    private void assertMonitorLockNotHeld() {
        Mlog.assertThat(!Thread.holdsLock(this), "lock order violation", new Object[0]);
    }

    public Lock acquire(int i) {
        try {
            return acquireInterruptubly(i);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        assertMonitorLockNotHeld();
        synchronized (this) {
            if (this.mChannel != null) {
                int i = this.mReferenceCount;
                if (i > 1) {
                    this.mReferenceCount = i - 1;
                } else {
                    synchronized (ReentrantLockFile.class) {
                        synchronized (this) {
                            int i2 = this.mReferenceCount - 1;
                            this.mReferenceCount = i2;
                            if (i2 == 0) {
                                ReentrantLockFile reentrantLockFile = this.mPrev;
                                reentrantLockFile.mNext = this.mNext;
                                this.mNext.mPrev = reentrantLockFile;
                                this.mPrev = null;
                                this.mNext = null;
                                Fs.safeClose(this.mChannel);
                                this.mChannel = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r5.mLockOwner == java.lang.Thread.currentThread()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void release() {
        /*
            r5 = this;
            r5.assertMonitorLockNotHeld()
            monitor-enter(r5)
            int r0 = r5.mLockShareCount     // Catch: java.lang.Throwable -> L53
            r4 = 1
            r3 = 0
            r2 = 0
            if (r0 <= 0) goto Lc
            r2 = 1
        Lc:
            java.lang.String r1 = "lock release balance"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L53
            com.facebook.common.dextricks.Mlog.assertThat(r2, r1, r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r5.mLockFlags     // Catch: java.lang.Throwable -> L53
            r0 = r0 & 1
            if (r0 != 0) goto L23
            java.lang.Thread r1 = r5.mLockOwner     // Catch: java.lang.Throwable -> L53
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L53
            r2 = 0
            if (r1 != r0) goto L24
        L23:
            r2 = 1
        L24:
            java.lang.String r1 = "lock thread affinity"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L53
            com.facebook.common.dextricks.Mlog.assertThat(r2, r1, r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r5.mLockShareCount     // Catch: java.lang.Throwable -> L53
            int r0 = r0 - r4
            r5.mLockShareCount = r0     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L41
            java.nio.channels.FileLock r0 = r5.mTheLock     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L53
            r0.release()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L53
            r0 = 0
            goto L43
        L3a:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L53
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L53
            throw r0     // Catch: java.lang.Throwable -> L53
        L41:
            r4 = 0
            goto L4c
        L43:
            r5.mLockOwner = r0     // Catch: java.lang.Throwable -> L53
            r5.mTheLock = r0     // Catch: java.lang.Throwable -> L53
            r5.mLockFlags = r3     // Catch: java.lang.Throwable -> L53
            r5.notifyAll()     // Catch: java.lang.Throwable -> L53
        L4c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L52
            r5.close()
        L52:
            return
        L53:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.release():void");
    }

    public ReentrantLockFile() {
        this.lockFileName = null;
        this.mLockHandle = null;
        this.mNext = this;
        this.mPrev = this;
    }
}
