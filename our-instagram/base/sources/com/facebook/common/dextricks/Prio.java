package com.facebook.common.dextricks;

import android.os.Process;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class Prio {
    public final int cpuPriority;
    public final int ioPriority;

    /* loaded from: classes.dex */
    public final class With implements Closeable {
        public final int savedIoPriority = Integer.MIN_VALUE;
        public final int savedCpuPriority = Integer.MIN_VALUE;

        public With() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            int i = this.savedIoPriority;
            if (i != Integer.MIN_VALUE) {
                DalvikInternals.ioprio_set(1, 0, i);
            }
            if (this.savedCpuPriority != Integer.MIN_VALUE) {
                Process.setThreadPriority(Process.myTid(), this.savedCpuPriority);
            }
        }
    }

    public static Prio lowest() {
        return new Prio(DalvikInternals.IOPRIO_BACKGROUND, 19);
    }

    public static Prio unchanged() {
        return new Prio(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public Prio ioOnly() {
        return new Prio(this.ioPriority, Integer.MIN_VALUE);
    }

    public boolean isDefault() {
        if (this.ioPriority < 0 && this.cpuPriority < 0) {
            return true;
        }
        return false;
    }

    public With with() {
        return new With();
    }

    public Prio(int i, int i2) {
        this.ioPriority = i;
        this.cpuPriority = i2;
    }
}
