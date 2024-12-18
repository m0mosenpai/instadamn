package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0JK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JK {
    public static C0JK A07;
    public static final long A08 = TimeUnit.MINUTES.toMillis(2);
    public long A00;
    public volatile File A04;
    public volatile File A05;
    public volatile StatFs A03 = null;
    public volatile StatFs A02 = null;
    public volatile boolean A06 = false;
    public final Lock A01 = new ReentrantLock();

    public static StatFs A00(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return new StatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                Class cls = Error.class;
                if (!cls.isInstance(th)) {
                    cls = RuntimeException.class;
                    if (!cls.isInstance(th)) {
                        throw new RuntimeException(th);
                    }
                }
                throw ((Throwable) cls.cast(th));
            }
        }
        return null;
    }

    public static synchronized C0JK A01() {
        C0JK c0jk;
        synchronized (C0JK.class) {
            c0jk = A07;
            if (c0jk == null) {
                c0jk = new C0JK();
                A07 = c0jk;
            }
        }
        return c0jk;
    }

    private void A02() {
        this.A03 = A00(this.A03, this.A05);
        this.A02 = A00(this.A02, this.A04);
        this.A00 = SystemClock.uptimeMillis();
    }

    public static void A03(C0JK c0jk) {
        if (!c0jk.A06) {
            Lock lock = c0jk.A01;
            lock.lock();
            try {
                if (!c0jk.A06) {
                    c0jk.A05 = Environment.getDataDirectory();
                    c0jk.A04 = Environment.getExternalStorageDirectory();
                    c0jk.A02();
                    c0jk.A06 = true;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void A04(C0JK c0jk) {
        Lock lock = c0jk.A01;
        if (lock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - c0jk.A00 > A08) {
                    c0jk.A02();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public final void A07() {
        Lock lock = this.A01;
        if (lock.tryLock()) {
            try {
                A03(this);
                A02();
            } finally {
                lock.unlock();
            }
        }
    }

    public final long A05() {
        A03(this);
        A04(this);
        StatFs statFs = this.A03;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public final long A06() {
        A03(this);
        A04(this);
        StatFs statFs = this.A03;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getFreeBlocksLong();
        }
        return -1L;
    }

    public final boolean A08() {
        if (A05() <= 1048576000) {
            return false;
        }
        return true;
    }

    public final boolean A09() {
        if (A05() >= OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE) {
            return false;
        }
        return true;
    }

    public final boolean A0A() {
        if (A05() >= 104857600) {
            return false;
        }
        return true;
    }
}
