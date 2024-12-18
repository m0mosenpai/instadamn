package com.facebook.common.dextricks.stats;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class ClassLoadingStats {
    public static final AtomicReference A00 = new AtomicReference();

    /* loaded from: classes.dex */
    public final class SnapshotStats {
        public final int A00;
        public final int A01;
        public final int A02;
        public final int A03;
        public final int A04;

        public final String toString() {
            return String.format("[ Class Load Attempts: %d, Class Loads Failed: %d, Dex Queries: %d, Locator-assisted Class Loads: %d, Incorrect DFA Guesses: %d ]", Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A04), Integer.valueOf(this.A03));
        }

        public SnapshotStats(int i, int i2, int i3, int i4, int i5) {
            this.A00 = i;
            this.A01 = i2;
            this.A02 = i3;
            this.A04 = i4;
            this.A03 = i5;
        }
    }

    public abstract void decrementDexFileQueries();

    public abstract int getClassLoadsAttempted();

    public abstract int getClassLoadsFailed();

    public abstract int getDexFileQueries();

    public abstract int getIncorrectDfaGuesses();

    public abstract int getLocatorAssistedClassLoads();

    public abstract void incrementClassLoadsAttempted();

    public abstract void incrementClassLoadsFailed();

    public abstract void incrementDexFileQueries(int i);

    public abstract void incrementIncorrectDfaGuesses();
}
