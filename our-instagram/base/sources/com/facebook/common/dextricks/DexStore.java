package com.facebook.common.dextricks;

import X.AbstractC05790Sg;
import X.AbstractC09790fc;
import X.AnonymousClass001;
import X.C03600Hy;
import X.C0Hi;
import X.C0JY;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.JsonWriter;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.OptimizationConfiguration;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class DexStore {
    public static final String CONFIG_FILENAME = "config";
    public static final String CONFIG_TMP_FILENAME = "config.tmp";
    public static final long CS_DEX0OPT = 16;
    public static final long CS_STATE_MASK = 15;
    public static final byte CS_STATE_SHIFT = 4;
    public static final int DAYS_TO_MS_FACTOR = 86400000;
    public static final byte DEFAULT_MULTIDEX_COMPILATION_STRATEGY = 0;
    public static final byte DEFAULT_PGO_COMPILER_FILTER = 0;
    public static final String DEPS_FILENAME = "deps";
    public static final int DS_ASYNC = 4;
    public static final int DS_DO_NOT_OPTIMIZE = 1;
    public static final int DS_FORCE_SYNC = 8;
    public static final int DS_ISOLATED_SPLIT = 64;
    public static final int DS_LOAD_SECONDARY = 16;
    public static final int DS_NO_RETRY = 2;
    public static final int DS_UNPACK_ONLY = 32;
    public static final int LA_LOAD_EXISTING = 0;
    public static final int LA_REGEN_ALL = 2;
    public static final int LA_REGEN_MISSING = 1;
    public static final String MDEX_LOCK_FILENAME = "mdex_lock";
    public static final String MDEX_STATUS_FILENAME = "mdex_status2";
    public static final long MDEX_STATUS_XOR = -374168170706063353L;
    public static final int MS_IN_NS = 1000000;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_COLDSTART_DEX = 2;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_DEX = 1;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_FIRST_COLDSTART_DEX = 0;
    public static final long NO_TIMESTAMP = 0;
    public static final String ODEX_LOCK_FILENAME = "odex_lock";
    public static final String OPTIMIZATION_HISTORY_LOG_FILENAME = "optimization_history_log";
    public static final String OPTIMIZATION_LOG_FILENAME = "optimization_log";
    public static final byte PGO_COMPILER_FILTER_EVERYTHING_PROFILE = 2;
    public static final byte PGO_COMPILER_FILTER_SPACE_PROFILE = 1;
    public static final byte PGO_COMPILER_FILTER_SPEED_PROFILE = 0;
    public static final byte PGO_COMPILER_FILTER_VERIFY_PROFILE = 3;
    public static final String REGEN_STAMP_FILENAME = "regen_stamp";
    public static final byte STATE_ART_TURBO = 7;
    public static final byte STATE_ART_XDEX = 8;
    public static final byte STATE_BAD_GEN = 5;
    public static final byte STATE_FALLBACK = 2;
    public static final byte STATE_INVALID = 0;
    public static final byte STATE_NOOP = 9;
    public static final byte STATE_REGEN_FORCED = 6;
    public static final byte STATE_RESERVED1 = 10;
    public static final byte STATE_TURBO = 4;
    public static final byte STATE_TX_FAILED = 1;
    public static final byte STATE_XDEX = 3;
    public static final String TMPDIR_LOCK_SUFFIX = ".tmpdir_lock";
    public static final String TMPDIR_SUFFIX = ".tmpdir";
    public static boolean logDexAddPageFaults;
    public static long majPageFaultsDelta;
    public static long pageInBytesDelta;
    public static boolean sAttemptedCrossDexHookInstallation;
    public static long sCachedLastAppUpdateTime;
    public static Throwable sCrossDexHookInstallationError;
    public static DexStoreClock sDexStoreClock = new Object();
    public static DexStoreTestHooks sDexStoreTestHooks;
    public static DexStore sListHead;
    public static boolean sLoadedCompressedOreo;
    public static ClassLoaderConfiguration sMergedDexConfig;
    public final ArrayList auxiliaryDexes;
    public String id;
    public final File mApk;
    public OptimizationHistoryLog mCachedOptimizationHistoryLog;
    public DexIteratorFactory mDexIteratorFactory;
    public DexErrorRecoveryInfo mLastDeri;
    public ArrayList mLoadedDexFiles;
    public DexManifest mLoadedManifest;
    public final ReentrantLockFile mLockFile;
    public DexManifest mManifest;
    public ResProvider mResProvider;
    public final ArrayList primaryDexes;
    public final File root;
    public String mMegaZipPath = null;
    public boolean mUseBgDexOpt = false;
    public boolean mUseEagerDexOpt = false;
    public final List mParentStores = new ArrayList();
    public final List mChildStores = new ArrayList();
    public boolean mDisableVerifier = false;
    public boolean mIsArtMainStore = false;
    public final DexStore next = sListHead;

    /* loaded from: classes.dex */
    public final class Config {
        public static final byte ART_FILTER_BALANCED = 4;
        public static final byte ART_FILTER_DEFAULT = 0;
        public static final byte ART_FILTER_EVERYTHING = 6;
        public static final byte ART_FILTER_INTERPRET_ONLY = 2;
        public static final byte ART_FILTER_SPACE = 3;
        public static final byte ART_FILTER_SPEED = 5;
        public static final byte ART_FILTER_TIME = 7;
        public static final byte ART_FILTER_VERIFY_NONE = 1;
        public static final byte DALVIK_OPT_ALL = 3;
        public static final byte DALVIK_OPT_DEFAULT = 0;
        public static final byte DALVIK_OPT_FULL = 4;
        public static final byte DALVIK_OPT_NONE = 1;
        public static final byte DALVIK_OPT_VERIFIED = 2;
        public static final byte DALVIK_REGISTER_MAPS_DEFAULT = 0;
        public static final byte DALVIK_REGISTER_MAPS_NO = 1;
        public static final byte DALVIK_REGISTER_MAPS_YES = 2;
        public static final byte DALVIK_VERIFY_ALL = 3;
        public static final byte DALVIK_VERIFY_DEFAULT = 0;
        public static final byte DALVIK_VERIFY_NONE = 1;
        public static final byte DALVIK_VERIFY_REMOTE = 2;
        public static final int FLAGS_CONTROL_UNPACK = 31;
        public static final byte MODE_DEFAULT = 0;
        public static final byte MODE_FORCE_FALLBACK = 1;
        public static final byte MODE_FORCE_TURBO = 2;
        public static final byte MODE_FORCE_XDEX = 3;
        public static final byte SYNC_CONTROL_ASYNC = 1;
        public static final byte SYNC_CONTROL_DEFAULT = 0;
        public static final byte SYNC_CONTROL_SYNC = 2;
        public static final byte VERSION = 9;
        public final byte artFilter;
        public final int artHugeMethodMax;
        public final int artLargeMethodMax;
        public final int artSmallMethodMax;
        public final int artTinyMethodMax;
        public final int artTruncatedDexSize;
        public final byte dalvikOptimize;
        public final byte dalvikRegisterMaps;
        public final byte dalvikVerify;
        public final boolean enableArtVerifyNone;
        public final boolean enableDex2OatQuickening;
        public final boolean enableMixedMode;
        public final boolean enableMixedModeClassPath;
        public final boolean enableMixedModePgo;
        public final boolean enableQuickening;
        public final int henosisFlags;
        public final int legacyFlags;
        public final long minTimeBetweenPgoCompilationMs;
        public final byte mode;
        public final byte multidexCompilationStrategy;
        public final byte pgoCompilerFilter;
        public final byte sync;
        public final boolean tryPeriodicPgoCompilation;

        /* loaded from: classes.dex */
        public final class Builder {
            public byte mArtFilter;
            public int mArtHugeMethodMax;
            public int mArtLargeMethodMax;
            public int mArtSmallMethodMax;
            public int mArtTinyMethodMax;
            public int mArtTruncatedDexSize;
            public byte mDalvikOptimize;
            public byte mDalvikRegisterMaps;
            public byte mDalvikVerify;
            public boolean mDoPeriodicPgoCompilation;
            public boolean mEnableArtVerifyNone;
            public boolean mEnableDex2OatQuickening;
            public boolean mEnableMixedMode;
            public boolean mEnableMixedModeClassPath;
            public boolean mEnableMixedModePgo;
            public boolean mEnableQuickening;
            public int mHenosisFlags;
            public int mLegacyFlags;
            public long mMinTimeBetweenPgoCompilationMs;
            public byte mMode;
            public byte mMultidexCompilationStrategy;
            public byte mPgoCompilerFilter;
            public byte mSync;

            public Config build() {
                return new Config(this.mMode, this.mSync, this.mDalvikVerify, this.mDalvikOptimize, this.mDalvikRegisterMaps, this.mArtFilter, this.mArtHugeMethodMax, this.mArtLargeMethodMax, this.mArtSmallMethodMax, this.mArtTinyMethodMax, this.mArtTruncatedDexSize, this.mEnableArtVerifyNone, this.mEnableDex2OatQuickening, this.mEnableQuickening, this.mEnableMixedMode, this.mEnableMixedModeClassPath, this.mEnableMixedModePgo, this.mPgoCompilerFilter, this.mDoPeriodicPgoCompilation, this.mMinTimeBetweenPgoCompilationMs, this.mMultidexCompilationStrategy, this.mLegacyFlags, this.mHenosisFlags);
            }

            public Builder setArtFilter(byte b) {
                this.mArtFilter = b;
                return this;
            }

            public Builder setArtHugeMethodMax(int i) {
                this.mArtHugeMethodMax = i;
                return this;
            }

            public Builder setArtLargeMethodMax(int i) {
                this.mArtLargeMethodMax = i;
                return this;
            }

            public Builder setArtSmallMethodMax(int i) {
                this.mArtSmallMethodMax = i;
                return this;
            }

            public Builder setArtTinyMethodMax(int i) {
                this.mArtTinyMethodMax = i;
                return this;
            }

            public Builder setArtTruncatedDexSize(int i) {
                this.mArtTruncatedDexSize = i;
                return this;
            }

            public Builder setDalvikOptimize(byte b) {
                this.mDalvikOptimize = b;
                return this;
            }

            public Builder setDalvikRegisterMaps(byte b) {
                this.mDalvikRegisterMaps = b;
                return this;
            }

            public Builder setDalvikVerify(byte b) {
                this.mDalvikVerify = b;
                return this;
            }

            public Builder setDoPeriodicPgoCompilation(boolean z) {
                this.mDoPeriodicPgoCompilation = z;
                return this;
            }

            public Builder setEnableArtVerifyNone(boolean z) {
                this.mEnableArtVerifyNone = z;
                return this;
            }

            public Builder setEnableDex2OatQuickening(boolean z) {
                this.mEnableDex2OatQuickening = z;
                return this;
            }

            public Builder setEnableMixedMode(boolean z) {
                this.mEnableMixedMode = z;
                return this;
            }

            public Builder setEnableMixedModeClassPath(boolean z) {
                this.mEnableMixedModeClassPath = z;
                return this;
            }

            public Builder setEnableMixedModePgo(boolean z) {
                this.mEnableMixedModePgo = z;
                return this;
            }

            public Builder setEnableQuickening(boolean z) {
                this.mEnableQuickening = z;
                return this;
            }

            public Builder setHenosisFlags(int i) {
                this.mHenosisFlags = i;
                return this;
            }

            public Builder setLegacyFlags(int i) {
                this.mLegacyFlags = i;
                return this;
            }

            public Builder setMinTimeBetweenPgoCompilationMs(long j) {
                this.mMinTimeBetweenPgoCompilationMs = j;
                return this;
            }

            public Builder setMode(byte b) {
                this.mMode = b;
                return this;
            }

            public Builder setMultidexCompilationStrategy(byte b) {
                this.mMultidexCompilationStrategy = b;
                return this;
            }

            public Builder setPgoCompilerFilter(byte b) {
                this.mPgoCompilerFilter = b;
                return this;
            }

            public Builder setSync(byte b) {
                this.mSync = b;
                return this;
            }

            public Builder(Config config) {
                this.mMode = (byte) 0;
                this.mSync = (byte) 0;
                this.mDalvikVerify = (byte) 0;
                this.mDalvikOptimize = (byte) 0;
                this.mDalvikRegisterMaps = (byte) 0;
                this.mArtFilter = (byte) 0;
                this.mArtHugeMethodMax = -1;
                this.mArtLargeMethodMax = -1;
                this.mArtSmallMethodMax = -1;
                this.mArtTinyMethodMax = -1;
                this.mArtTruncatedDexSize = -1;
                this.mEnableArtVerifyNone = false;
                this.mEnableDex2OatQuickening = false;
                this.mEnableQuickening = false;
                this.mEnableMixedMode = false;
                this.mEnableMixedModeClassPath = false;
                this.mEnableMixedModePgo = false;
                this.mPgoCompilerFilter = (byte) 0;
                this.mDoPeriodicPgoCompilation = false;
                this.mMinTimeBetweenPgoCompilationMs = 0L;
                this.mMultidexCompilationStrategy = (byte) 0;
                this.mLegacyFlags = 0;
                this.mHenosisFlags = 0;
                this.mMode = config.mode;
                this.mSync = config.sync;
                this.mDalvikVerify = config.dalvikVerify;
                this.mDalvikOptimize = config.dalvikOptimize;
                this.mDalvikRegisterMaps = config.dalvikRegisterMaps;
                this.mArtFilter = config.artFilter;
                this.mArtHugeMethodMax = config.artHugeMethodMax;
                this.mArtLargeMethodMax = config.artLargeMethodMax;
                this.mArtSmallMethodMax = config.artSmallMethodMax;
                this.mArtTinyMethodMax = config.artTinyMethodMax;
                this.mArtTruncatedDexSize = config.artTruncatedDexSize;
                this.mEnableArtVerifyNone = config.enableArtVerifyNone;
                this.mEnableDex2OatQuickening = config.enableDex2OatQuickening;
                this.mEnableQuickening = config.enableQuickening;
                this.mEnableMixedMode = config.enableMixedMode;
                this.mEnableMixedModeClassPath = config.enableMixedModeClassPath;
                this.mEnableMixedModePgo = config.enableMixedModePgo;
                this.mPgoCompilerFilter = config.pgoCompilerFilter;
                this.mDoPeriodicPgoCompilation = config.tryPeriodicPgoCompilation;
                this.mMinTimeBetweenPgoCompilationMs = config.minTimeBetweenPgoCompilationMs;
                this.mMultidexCompilationStrategy = config.multidexCompilationStrategy;
                this.mLegacyFlags = config.legacyFlags;
                this.mHenosisFlags = config.henosisFlags;
            }

            public Builder setMinTimeBetweenPgoCompilationDays(double d) {
                this.mMinTimeBetweenPgoCompilationMs = convertDaysToMs(d);
                return this;
            }

            private long convertDaysToMs(double d) {
                return Math.round(d * 8.64E7d);
            }

            public Builder() {
                this.mMode = (byte) 0;
                this.mSync = (byte) 0;
                this.mDalvikVerify = (byte) 0;
                this.mDalvikOptimize = (byte) 0;
                this.mDalvikRegisterMaps = (byte) 0;
                this.mArtFilter = (byte) 0;
                this.mArtHugeMethodMax = -1;
                this.mArtLargeMethodMax = -1;
                this.mArtSmallMethodMax = -1;
                this.mArtTinyMethodMax = -1;
                this.mArtTruncatedDexSize = -1;
                this.mEnableArtVerifyNone = false;
                this.mEnableDex2OatQuickening = false;
                this.mEnableQuickening = false;
                this.mEnableMixedMode = false;
                this.mEnableMixedModeClassPath = false;
                this.mEnableMixedModePgo = false;
                this.mPgoCompilerFilter = (byte) 0;
                this.mDoPeriodicPgoCompilation = false;
                this.mMinTimeBetweenPgoCompilationMs = 0L;
                this.mMultidexCompilationStrategy = (byte) 0;
                this.mLegacyFlags = 0;
                this.mHenosisFlags = 0;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj != null && getClass() == obj.getClass()) {
                    Config config = (Config) obj;
                    if (this.mode != config.mode || this.sync != config.sync || this.dalvikVerify != config.dalvikVerify || this.dalvikOptimize != config.dalvikOptimize || this.dalvikRegisterMaps != config.dalvikRegisterMaps || this.artFilter != config.artFilter || this.artHugeMethodMax != config.artHugeMethodMax || this.artLargeMethodMax != config.artLargeMethodMax || this.artSmallMethodMax != config.artSmallMethodMax || this.artTinyMethodMax != config.artTinyMethodMax || this.artTruncatedDexSize != config.artTruncatedDexSize || this.enableArtVerifyNone != config.enableArtVerifyNone || this.enableDex2OatQuickening != config.enableDex2OatQuickening || this.enableQuickening != config.enableQuickening || this.enableMixedMode != config.enableMixedMode || this.enableMixedModeClassPath != config.enableMixedModeClassPath || this.enableMixedModePgo != config.enableMixedModePgo || this.pgoCompilerFilter != config.pgoCompilerFilter || this.multidexCompilationStrategy != config.multidexCompilationStrategy || this.tryPeriodicPgoCompilation != config.tryPeriodicPgoCompilation || this.minTimeBetweenPgoCompilationMs != config.minTimeBetweenPgoCompilationMs || this.legacyFlags != config.legacyFlags || this.henosisFlags != config.henosisFlags) {
                    }
                }
                return false;
            }
            return true;
        }

        public static File getConfigFileName(File file) {
            return new File(file, DexStore.CONFIG_FILENAME);
        }

        public static Config readFromRoot(File file) {
            return read(new File(file, DexStore.CONFIG_FILENAME));
        }

        public boolean equalsForBootstrapPurposes(Config config) {
            if (config != null && config.mode == this.mode && config.sync == this.sync && config.artFilter == this.artFilter && config.enableArtVerifyNone == this.enableArtVerifyNone && config.enableDex2OatQuickening == this.enableDex2OatQuickening && config.enableMixedMode == this.enableMixedMode && config.enableMixedModeClassPath == this.enableMixedModeClassPath && config.enableMixedModePgo == this.enableMixedModePgo && config.pgoCompilerFilter == this.pgoCompilerFilter && config.multidexCompilationStrategy == this.multidexCompilationStrategy && config.tryPeriodicPgoCompilation == this.tryPeriodicPgoCompilation && config.legacyFlags == this.legacyFlags && config.henosisFlags == this.henosisFlags) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((((((((((((10571 + this.mode) * 31) + this.sync) * 31) + this.dalvikVerify) * 31) + this.dalvikOptimize) * 31) + this.dalvikRegisterMaps) * 31) + this.artFilter) * 31) + this.artHugeMethodMax) * 31) + this.artLargeMethodMax) * 31) + this.artSmallMethodMax) * 31) + this.artTinyMethodMax) * 31) + this.artTruncatedDexSize) * 31) + (this.enableArtVerifyNone ? 1 : 0)) * 31) + (this.enableDex2OatQuickening ? 1 : 0)) * 31) + (this.enableQuickening ? 1 : 0)) * 31) + (this.enableMixedMode ? 1 : 0)) * 31) + (this.enableMixedModeClassPath ? 1 : 0)) * 31) + (this.enableMixedModePgo ? 1 : 0)) * 31) + this.pgoCompilerFilter) * 31) + this.multidexCompilationStrategy) * 31) + (this.tryPeriodicPgoCompilation ? 1 : 0)) * 31) + ((int) this.minTimeBetweenPgoCompilationMs)) * 31) + this.legacyFlags) * 31) + this.henosisFlags;
        }

        public boolean isDefault() {
            return equals(new Builder().build());
        }

        public Config(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, byte b7, boolean z7, long j, byte b8, int i6, int i7) {
            this.mode = b;
            this.sync = b2;
            this.dalvikVerify = b3;
            this.dalvikOptimize = b4;
            this.dalvikRegisterMaps = b5;
            this.artFilter = b6;
            this.artHugeMethodMax = i;
            this.artLargeMethodMax = i2;
            this.artSmallMethodMax = i3;
            this.artTinyMethodMax = i4;
            this.artTruncatedDexSize = i5;
            this.enableArtVerifyNone = z;
            this.enableDex2OatQuickening = z2;
            this.enableQuickening = z3;
            this.enableMixedMode = z4;
            this.enableMixedModeClassPath = z5;
            this.enableMixedModePgo = z6;
            this.pgoCompilerFilter = b7;
            this.tryPeriodicPgoCompilation = z7;
            this.minTimeBetweenPgoCompilationMs = j;
            this.multidexCompilationStrategy = b8;
            this.legacyFlags = i6;
            this.henosisFlags = i7;
        }

        public static Config read(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                if (randomAccessFile.readByte() == 9) {
                    Config config = new Config(randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readByte(), randomAccessFile.readBoolean(), randomAccessFile.readLong(), randomAccessFile.readByte(), randomAccessFile.readInt(), randomAccessFile.readInt());
                    randomAccessFile.close();
                    return config;
                }
                throw new UnsupportedOperationException("unexpected version");
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }

        public byte[] readDepBlock() {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeByte(this.mode);
                obtain.writeByte(this.sync);
                obtain.writeByte(this.dalvikVerify);
                obtain.writeByte(this.dalvikOptimize);
                obtain.writeByte(this.dalvikRegisterMaps);
                obtain.writeByte(this.artFilter);
                obtain.writeInt(this.artHugeMethodMax);
                obtain.writeInt(this.artLargeMethodMax);
                obtain.writeInt(this.artSmallMethodMax);
                obtain.writeInt(this.artTinyMethodMax);
                int i = 0;
                obtain.writeBooleanArray(new boolean[]{this.enableArtVerifyNone, this.enableDex2OatQuickening, this.enableQuickening, this.enableMixedMode, this.enableMixedModeClassPath, this.enableMixedModePgo});
                obtain.writeByte(this.pgoCompilerFilter);
                if (this.tryPeriodicPgoCompilation) {
                    i = 1;
                }
                obtain.writeByte((byte) i);
                obtain.writeLong(this.minTimeBetweenPgoCompilationMs);
                obtain.writeByte(this.multidexCompilationStrategy);
                obtain.writeInt(this.legacyFlags);
                obtain.writeInt(this.henosisFlags);
                return obtain.marshall();
            } finally {
                obtain.recycle();
            }
        }

        public void writeAndSync(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.writeByte(9);
                randomAccessFile.writeByte(this.mode);
                randomAccessFile.writeByte(this.sync);
                randomAccessFile.writeByte(this.dalvikVerify);
                randomAccessFile.writeByte(this.dalvikOptimize);
                randomAccessFile.writeByte(this.dalvikRegisterMaps);
                randomAccessFile.writeByte(this.artFilter);
                randomAccessFile.writeInt(this.artHugeMethodMax);
                randomAccessFile.writeInt(this.artLargeMethodMax);
                randomAccessFile.writeInt(this.artSmallMethodMax);
                randomAccessFile.writeInt(this.artTinyMethodMax);
                randomAccessFile.writeInt(this.artTruncatedDexSize);
                randomAccessFile.writeBoolean(this.enableArtVerifyNone);
                randomAccessFile.writeBoolean(this.enableDex2OatQuickening);
                randomAccessFile.writeBoolean(this.enableQuickening);
                randomAccessFile.writeBoolean(this.enableMixedMode);
                randomAccessFile.writeBoolean(this.enableMixedModeClassPath);
                randomAccessFile.writeBoolean(this.enableMixedModePgo);
                randomAccessFile.writeByte(this.pgoCompilerFilter);
                randomAccessFile.writeBoolean(this.tryPeriodicPgoCompilation);
                randomAccessFile.writeLong(this.minTimeBetweenPgoCompilationMs);
                randomAccessFile.writeByte(this.multidexCompilationStrategy);
                randomAccessFile.writeInt(this.legacyFlags);
                randomAccessFile.writeInt(this.henosisFlags);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface DexStoreClock {
        long now();
    }

    /* loaded from: classes.dex */
    public interface DexStoreTestHooks {
        void onSecondaryDexesUnpackedForRecompilation();
    }

    /* loaded from: classes.dex */
    public interface ExternalProcessProgressListener {
        void onCheckpoint();

        void onComplete(int i);
    }

    /* loaded from: classes.dex */
    public final class FinishRegenerationThread extends Thread {
        public final ReentrantLockFile.Lock mHeldLock;
        public final long mNewStatus;
        public final OdexScheme mOdexScheme;

        public FinishRegenerationThread(OdexScheme odexScheme, ReentrantLockFile.Lock lock, long j) {
            super(AnonymousClass001.A0R("TxFlush-", DexStore.this.root.getName()));
            this.mHeldLock = lock;
            this.mNewStatus = j;
            this.mOdexScheme = odexScheme;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Mlog.safeFmt("running syncer thread", new Object[0]);
                try {
                    for (String str : this.mOdexScheme.expectedFiles) {
                        File file = new File(DexStore.this.root, str);
                        if (file.exists()) {
                            DalvikInternals.fsyncNamed(file.getCanonicalPath(), -1);
                        }
                    }
                    DexStore.this.writeStatusLocked(this.mNewStatus);
                    this.mHeldLock.close();
                    Mlog.safeFmt("finished syncer thread: initial regeneration of dex store %s complete", DexStore.this.root);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                this.mHeldLock.close();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class OptimizationHistoryLog {
        public static long NO_TIME_DELTA = -1;
        public static final int SUCCESS = 2;
        public final File file;
        public final long lastFileModifiedTime;
        public final long lastOptedAppUpgradeTimestamp;
        public final long lastSuccessfulOptimizationTimestampMs;
        public final long optStatus;
        public final long schemeStatus;

        public boolean isLogFileAsFromRoot(File file) {
            if (file == null) {
                if (this.file != null) {
                    return false;
                }
                return true;
            }
            return new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME).equals(this.file);
        }

        public boolean isNotDefault() {
            if (this.file == null) {
                return false;
            }
            return true;
        }

        public boolean isOutOfDate() {
            if (DexStore.lastModifiedTime(this.file) == this.lastFileModifiedTime) {
                return false;
            }
            return true;
        }

        public boolean lastCompilationSessionWasASuccess() {
            if ((this.optStatus & 2) == 0) {
                return false;
            }
            return true;
        }

        public long timeDeltaFromLastCompilationSessionMs() {
            if (this.lastSuccessfulOptimizationTimestampMs != 0) {
                long now = DexStore.sDexStoreClock.now();
                long j = this.lastSuccessfulOptimizationTimestampMs;
                if (j <= now) {
                    return now - j;
                }
            }
            return NO_TIME_DELTA;
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append("[ Opt History Log: ");
            sb.append("Default: ");
            boolean z = false;
            if (this.file != null) {
                z = true;
            }
            sb.append(!z);
            sb.append(", ");
            sb.append("Last Compile time: ");
            sb.append(this.lastSuccessfulOptimizationTimestampMs);
            sb.append(" ms, ");
            sb.append("Delta: ");
            sb.append(timeDeltaFromLastCompilationSessionMs());
            sb.append(" ms, ");
            sb.append("Opt Status: ");
            sb.append(this.optStatus);
            sb.append(" (");
            if (lastCompilationSessionWasASuccess()) {
                str = "success";
            } else {
                str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            sb.append(str);
            sb.append("), ");
            sb.append("Scheme Status: ");
            sb.append(this.schemeStatus);
            sb.append(", ");
            sb.append("Last app update time: ");
            sb.append(this.lastOptedAppUpgradeTimestamp);
            sb.append(" ms, ");
            sb.append("File: ");
            File file = this.file;
            if (file != null) {
                str2 = file.getAbsolutePath();
            } else {
                str2 = "None";
            }
            sb.append(str2);
            sb.append(']');
            return sb.toString();
        }

        public OptimizationHistoryLog(long j, long j2, long j3, long j4, long j5, File file) {
            this.lastSuccessfulOptimizationTimestampMs = j;
            this.optStatus = j2;
            this.schemeStatus = j3;
            this.lastOptedAppUpgradeTimestamp = j4;
            this.lastFileModifiedTime = j5;
            this.file = file;
        }

        public static boolean canUseHistoryLogForThisApp(Context context, OptimizationHistoryLog optimizationHistoryLog) {
            long appUpgradeTimestamp = DexStore.getAppUpgradeTimestamp(context);
            if (appUpgradeTimestamp == 0) {
                Mlog.w("Found not app version", new Object[0]);
            } else {
                Mlog.w("Comparing new %d to old %s", Long.valueOf(appUpgradeTimestamp), Long.valueOf(optimizationHistoryLog.lastOptedAppUpgradeTimestamp));
                if (appUpgradeTimestamp == optimizationHistoryLog.lastOptedAppUpgradeTimestamp) {
                    return true;
                }
            }
            return false;
        }

        public static void clearHistoryLog(File file) {
            new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME).delete();
        }

        public static File getDefaultFile(File file) {
            return new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME);
        }

        public static OptimizationHistoryLog read(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                OptimizationHistoryLog optimizationHistoryLog = new OptimizationHistoryLog(DexStore.sanityCheckTimestamp(randomAccessFile.readLong()), randomAccessFile.readLong(), randomAccessFile.readLong(), randomAccessFile.readLong(), DexStore.lastModifiedTime(file), file);
                Mlog.safeFmt("Read opt history log %s", optimizationHistoryLog);
                randomAccessFile.close();
                return optimizationHistoryLog;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }

        public static OptimizationHistoryLog readOrMakeDefault(Context context, File file) {
            try {
                OptimizationHistoryLog read = read(file);
                if (!canUseHistoryLogForThisApp(context, read)) {
                    Mlog.safeFmt("Could not use previous history log since it was for a different version or corrupted. optHistoryLog: %s", read);
                    return new OptimizationHistoryLog();
                }
                return read;
            } catch (IOException unused) {
                return new OptimizationHistoryLog();
            }
        }

        public static OptimizationHistoryLog readOrMakeDefaultFromRoot(Context context, File file) {
            return readOrMakeDefault(context, new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME));
        }

        public static void writeNewStatus(Context context, File file, boolean z, long j) {
            long j2;
            String str;
            File file2 = new File(file, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME);
            if (z) {
                j2 = 2;
            } else {
                j2 = 0;
            }
            long now = DexStore.sDexStoreClock.now();
            long appUpgradeTimestamp = DexStore.getAppUpgradeTimestamp(context);
            if (z) {
                str = "success";
            } else {
                str = "error";
            }
            Mlog.safeFmt("Writing optimization history log %s [opt status: %d scheme status: %d] (app last update time %d) at %d ms for %s", str, Long.valueOf(j2), Long.valueOf(j), Long.valueOf(appUpgradeTimestamp), Long.valueOf(now), file2.getAbsolutePath());
            OptimizationHistoryLog optimizationHistoryLog = new OptimizationHistoryLog(now, j2, j, appUpgradeTimestamp, 0L, file2);
            optimizationHistoryLog.writeToDisk(file2);
            Mlog.safeFmt("Wrote optimization history log %s", optimizationHistoryLog);
        }

        public void writeToDisk(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.writeLong(this.lastSuccessfulOptimizationTimestampMs);
                randomAccessFile.writeLong(this.optStatus);
                randomAccessFile.writeLong(this.schemeStatus);
                randomAccessFile.writeLong(this.lastOptedAppUpgradeTimestamp);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }

        public OptimizationHistoryLog() {
            this(0L, 0L, 0L, 0L, 0L, null);
        }
    }

    /* loaded from: classes.dex */
    public final class OptimizationLog {
        public static final int COMPLETE = 1;
        public static final int COUNTER_AWAKE_MS = 0;
        public static final int COUNTER_AWAKE_RUN_MS = 3;
        public static final int COUNTER_AWAKE_YIELD_MS = 2;
        public static final int COUNTER_REAL_TIME_MS = 1;
        public static final int NR_COUNTERS = 4;
        public static final int SUCCESS = 2;
        public int flags = 0;
        public int nrOptimizationsAttempted = 0;
        public int nrOptimizationsFailed = 0;
        public long[] counters = new long[4];
        public long[] lastAttemptCounters = new long[4];
        public String lastFailureExceptionJson = "";
        public boolean isNotDefault = false;

        public static String getCounterName(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return "COUNTER_AWAKE_RUN_MS";
                        }
                        throw new AssertionError(AnonymousClass001.A0O("unknown counter ", i));
                    }
                    return "COUNTER_AWAKE_YIELD_MS";
                }
                return "COUNTER_AWAKE_REAL_TIME_MS";
            }
            return "COUNTER_AWAKE_MS";
        }

        public boolean isNotDefault() {
            return this.isNotDefault;
        }

        public static File getDefaultFile(File file) {
            return new File(file, DexStore.OPTIMIZATION_LOG_FILENAME);
        }

        public static OptimizationLog read(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                OptimizationLog optimizationLog = new OptimizationLog();
                optimizationLog.flags = randomAccessFile.readInt();
                optimizationLog.nrOptimizationsAttempted = randomAccessFile.readInt();
                optimizationLog.nrOptimizationsFailed = randomAccessFile.readInt();
                int i = 0;
                do {
                    optimizationLog.counters[i] = randomAccessFile.readLong();
                    optimizationLog.lastAttemptCounters[i] = randomAccessFile.readLong();
                    i++;
                } while (i < 4);
                optimizationLog.lastFailureExceptionJson = randomAccessFile.readUTF();
                optimizationLog.isNotDefault = true;
                randomAccessFile.close();
                return optimizationLog;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }

        public static OptimizationLog readFromRoot(File file) {
            return read(new File(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }

        public static OptimizationLog readOrMakeDefault(File file) {
            try {
                return read(file);
            } catch (FileNotFoundException unused) {
                return new OptimizationLog();
            }
        }

        public static OptimizationLog readOrMakeDefaultFromRoot(File file) {
            return readOrMakeDefault(new File(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }

        public void write(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.writeInt(this.flags);
                randomAccessFile.writeInt(this.nrOptimizationsAttempted);
                randomAccessFile.writeInt(this.nrOptimizationsFailed);
                int i = 0;
                do {
                    randomAccessFile.writeLong(this.counters[i]);
                    randomAccessFile.writeLong(this.lastAttemptCounters[i]);
                    i++;
                } while (i < 4);
                randomAccessFile.writeUTF(this.lastFailureExceptionJson);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }

        public void writeFromRoot(File file) {
            write(new File(file, DexStore.OPTIMIZATION_LOG_FILENAME));
        }
    }

    /* loaded from: classes.dex */
    public final class OptimizationSession implements Closeable {
        public static final int PHASE_RUNNING = 0;
        public static final int PHASE_YIELDING = 1;
        public long accumulatedRunNs;
        public long accumulatedYieldNs;
        public final OptimizationConfiguration config;
        public final OptimizationConfiguration.Provider configProvider;
        public final Config dexStoreConfig;
        public final boolean inForeground;
        public final Context mContext;
        public final ReentrantLockFile mOptLockFile;
        public final FileInputStream mRegenStampFile;
        public final int optimizationAttemptNumber;
        public final long startRealtimeMs;
        public final long startUptimeMs;

        /* loaded from: classes.dex */
        public final class Job implements Closeable {
            public static final int PHASE_COMMITTING = 2;
            public static final int PHASE_DONE = 3;
            public static final int PHASE_OPTIMIZING = 1;
            public static final int PHASE_PREPARING = 0;
            public final long initialStatus;
            public ReentrantLockFile.Lock mCommitLock;
            public ReentrantLockFile.Lock mOptLock;
            public int mPhase;

            public Job() {
                try {
                    this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                    long readStatusLocked = DexStore.this.readStatusLocked();
                    this.initialStatus = readStatusLocked;
                    checkBadStatus(readStatusLocked);
                } catch (Throwable th) {
                    close();
                    throw th;
                }
            }

            private void checkBadStatus(long j) {
                byte b = (byte) (15 & j);
                if (b != 0 && b != 1 && b != 5 && b < 10) {
                    OptimizationSession.this.checkShouldStop();
                    return;
                }
                throw new InterruptedException(String.format("bad status %x for dex store %s starting tx", Long.valueOf(j), DexStore.this.root));
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLockFile.Lock lock = this.mCommitLock;
                if (lock != null) {
                    lock.close();
                    this.mCommitLock = null;
                }
                ReentrantLockFile.Lock lock2 = this.mOptLock;
                if (lock2 != null) {
                    lock2.close();
                    this.mOptLock = null;
                }
            }

            public void finishCommit(long j) {
                boolean z = false;
                if (this.mPhase == 2) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase", new Object[0]);
                DexStore.this.writeStatusLocked(j);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 3;
            }

            public long startCommitting(long j) {
                int i = this.mPhase;
                boolean z = false;
                if (i == 1) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase: %s", Integer.valueOf(i));
                this.mOptLock.close();
                this.mOptLock = null;
                this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                long readStatusLocked = DexStore.this.readStatusLocked();
                checkBadStatus(readStatusLocked);
                long j2 = j | readStatusLocked;
                DexStore.this.writeStatusLocked(1 | (j2 << 4));
                this.mPhase = 2;
                return j2;
            }

            public void startOptimizing() {
                boolean z = false;
                if (this.mPhase == 0) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase", new Object[0]);
                this.mOptLock = OptimizationSession.this.mOptLockFile.acquireInterruptubly(1);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 1;
            }

            public long startCommitting() {
                return startCommitting(0L);
            }
        }

        private byte determineOptimizationFailureState(byte b) {
            if (b == 8) {
                return (byte) 7;
            }
            return b == 3 ? (byte) 4 : (byte) 5;
        }

        public void copeWithOptimizationFailure(Throwable th) {
            try {
                ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
                try {
                    checkShouldStop();
                    copeWithOptimizationFailureImpl(th);
                    if (acquire != null) {
                        acquire.close();
                    }
                } finally {
                }
            } catch (Throwable th2) {
                Mlog.w(th2, "recording optimization failure itself failed", new Object[0]);
            }
        }

        public OptimizationSession(Context context, OptimizationConfiguration.Provider provider, boolean z) {
            ReentrantLockFile reentrantLockFile;
            FileInputStream fileInputStream;
            this.mContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            int i = readOrMakeDefaultFromRoot.nrOptimizationsAttempted;
            int i2 = i >= 1 ? 1 + i : 1;
            readOrMakeDefaultFromRoot.nrOptimizationsAttempted = i2;
            this.optimizationAttemptNumber = i2;
            writeCurrentStateWithCurrentStatusFromRoot(readOrMakeDefaultFromRoot, false);
            this.dexStoreConfig = DexStore.this.readConfig();
            this.inForeground = z;
            this.startUptimeMs = SystemClock.uptimeMillis();
            this.startRealtimeMs = SystemClock.elapsedRealtime();
            FileInputStream fileInputStream2 = null;
            try {
                this.configProvider = provider;
                this.config = provider.baseline;
                fileInputStream = new FileInputStream(DexStore.this.getRegenFile());
                try {
                    reentrantLockFile = ReentrantLockFile.open(new File(DexStore.this.root, DexStore.ODEX_LOCK_FILENAME));
                } catch (Throwable th) {
                    th = th;
                    reentrantLockFile = null;
                }
            } catch (Throwable th2) {
                th = th2;
                reentrantLockFile = null;
            }
            try {
                this.mRegenStampFile = fileInputStream;
                try {
                    this.mOptLockFile = reentrantLockFile;
                } catch (Throwable th3) {
                    th = th3;
                    Fs.safeClose(fileInputStream2);
                    Fs.safeClose(reentrantLockFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream2 = fileInputStream;
                Fs.safeClose(fileInputStream2);
                Fs.safeClose(reentrantLockFile);
                throw th;
            }
        }

        private int incrementOptimizationAttempts(OptimizationLog optimizationLog) {
            int i = optimizationLog.nrOptimizationsAttempted;
            if (i < 1) {
                return 1;
            }
            return 1 + i;
        }

        private int resumeProcess(Process process) {
            process.kill(18);
            return process.waitFor(-1, 5);
        }

        private boolean shouldWriteOptimizationHistoryLog(OptimizationLog optimizationLog) {
            if ((optimizationLog.flags & 1) != 0) {
                return true;
            }
            return false;
        }

        private int stopProcess(Process process) {
            process.kill(20);
            return process.waitFor(-1, 6);
        }

        private void updateOptimizationLogCounters(OptimizationLog optimizationLog) {
            long[] jArr = optimizationLog.lastAttemptCounters;
            int i = 0;
            jArr[0] = SystemClock.uptimeMillis() - this.startUptimeMs;
            jArr[1] = SystemClock.elapsedRealtime() - this.startRealtimeMs;
            jArr[3] = this.accumulatedRunNs / 1000000;
            jArr[2] = this.accumulatedYieldNs / 1000000;
            do {
                long[] jArr2 = optimizationLog.counters;
                jArr2[i] = jArr2[i] + jArr[i];
                i++;
            } while (i < 4);
        }

        public void checkShouldStop() {
            if (DalvikInternals.getOpenFileLinkCount(Fd.fileno(this.mRegenStampFile.getFD())) != 0) {
            } else {
                throw new InterruptedException("obsolete optimization: regeneration pending");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Fs.safeClose(this.mOptLockFile);
            Fs.safeClose(this.mRegenStampFile);
        }

        public void copeWithOptimizationFailureImpl(Throwable th) {
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            Mlog.w(th, "optimization failed (%s failures already)", Integer.valueOf(readOrMakeDefaultFromRoot.nrOptimizationsFailed));
            long readStatusLocked = DexStore.this.readStatusLocked();
            byte b = (byte) (15 & readStatusLocked);
            updateOptimizationLogCounters(readOrMakeDefaultFromRoot);
            readOrMakeDefaultFromRoot.nrOptimizationsFailed++;
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                C0JY.A01(jsonWriter, th);
                jsonWriter.close();
                readOrMakeDefaultFromRoot.lastFailureExceptionJson = stringWriter.toString();
                int i = readOrMakeDefaultFromRoot.nrOptimizationsFailed;
                int i2 = this.config.maximumOptimizationAttempts;
                if (i >= i2) {
                    Mlog.w("too many optimization failures (threshold is %s): will not keep trying", Integer.valueOf(i2));
                    readStatusLocked = determineOptimizationFailureState(b);
                    readOrMakeDefaultFromRoot.flags |= 1;
                }
                writeCurrentStateFromRoot(readOrMakeDefaultFromRoot, readStatusLocked);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public OptimizationHistoryLog getOptimizationHistoryLog() {
            DexStore dexStore = DexStore.this;
            return dexStore.getCurrentOptHistoryLogFromRoot(this.mContext, dexStore.root);
        }

        public int maxOptimizationAttempts() {
            return this.config.maximumOptimizationAttempts;
        }

        public void noteOptimizationSuccess() {
            ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
            try {
                if (!this.inForeground) {
                    checkShouldStop();
                }
                OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
                readOrMakeDefaultFromRoot.flags |= 3;
                updateOptimizationLogCounters(readOrMakeDefaultFromRoot);
                writeCurrentStateWithCurrentStatusFromRoot(readOrMakeDefaultFromRoot);
                if (acquire != null) {
                    acquire.close();
                }
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }

        private void writeCurrentStateFromRoot(OptimizationLog optimizationLog, long j) {
            writeCurrentStateFromRoot(optimizationLog, j, shouldWriteOptimizationHistoryLog(optimizationLog));
        }

        private void writeCurrentStateWithCurrentStatusFromRoot(OptimizationLog optimizationLog) {
            writeCurrentStateWithCurrentStatusFromRoot(optimizationLog, shouldWriteOptimizationHistoryLog(optimizationLog));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r9 != Integer.MIN_VALUE) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int waitForAndManageProcess(com.facebook.forker.Process r22, com.facebook.common.dextricks.DexStore.ExternalProcessProgressListener r23) {
            /*
                r21 = this;
                long r19 = java.lang.System.nanoTime()
                r17 = 1000000(0xf4240, double:4.940656E-318)
                long r15 = r19 / r17
                r13 = r15
                r12 = 0
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r19
            Lf:
                r6 = r21
                com.facebook.common.dextricks.OptimizationConfiguration$Provider r0 = r6.configProvider
                com.facebook.common.dextricks.OptimizationConfiguration r4 = r0.getInstantaneous()
                long r10 = r15 - r13
                r5 = r22
                if (r12 != 0) goto L86
                long r0 = r6.accumulatedRunNs
                long r2 = r19 - r7
                long r0 = r0 + r2
                r6.accumulatedRunNs = r0
                int r0 = r4.optTimeSliceMs
                long r2 = (long) r0
                int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r0 < 0) goto L48
                int r0 = r4.yieldTimeSliceMs
                if (r0 <= 0) goto L43
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r0 = "beginning yield"
                com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
                int r9 = r6.stopProcess(r5)
                r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
                if (r9 != r0) goto L42
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
            L42:
                r12 = 1
            L43:
                r13 = r15
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r9 != r0) goto L59
            L48:
                int r1 = r4.processPollMs
                long r2 = r2 - r10
                long r7 = (long) r1
                int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r0 >= 0) goto L51
                int r1 = (int) r2
            L51:
                if (r1 >= 0) goto L54
                r1 = 0
            L54:
                r0 = 4
                int r9 = r5.waitFor(r1, r0)
            L59:
                r6.checkShouldStop()
                long r1 = java.lang.System.nanoTime()
                long r15 = r1 / r17
                r3 = r23
                if (r23 == 0) goto L69
                r3.onCheckpoint()
            L69:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r9 == r0) goto L81
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                java.lang.Object[] r1 = new java.lang.Object[]{r0}
                java.lang.String r0 = "process exited with status %s"
                com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
                if (r23 == 0) goto L80
                r3.onComplete(r9)
            L80:
                return r9
            L81:
                r7 = r19
                r19 = r1
                goto Lf
            L86:
                long r2 = r6.accumulatedYieldNs
                long r0 = r19 - r7
                long r2 = r2 + r0
                r6.accumulatedYieldNs = r2
                int r0 = r4.yieldTimeSliceMs
                long r2 = (long) r0
                int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r0 < 0) goto L48
                int r0 = r4.optTimeSliceMs
                if (r0 <= 0) goto L43
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r0 = "ending yield"
                com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
                int r9 = r6.resumeProcess(r5)
                r0 = -2147483646(0xffffffff80000002, float:-2.8E-45)
                if (r9 != r0) goto Lac
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
            Lac:
                r12 = 0
                goto L43
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationSession.waitForAndManageProcess(com.facebook.forker.Process, com.facebook.common.dextricks.DexStore$ExternalProcessProgressListener):int");
        }

        private void writeCurrentStateFromRoot(OptimizationLog optimizationLog, long j, boolean z) {
            DexStore.this.writeTxFailedStatusLocked(j);
            boolean z2 = false;
            if ((optimizationLog.flags & 2) != 0) {
                z2 = true;
            }
            optimizationLog.writeFromRoot(DexStore.this.root);
            if (z) {
                OptimizationHistoryLog.writeNewStatus(this.mContext, DexStore.this.root, z2, j);
            }
            DexStore.this.writeStatusLocked(j);
        }

        private void writeCurrentStateWithCurrentStatusFromRoot(OptimizationLog optimizationLog, boolean z) {
            writeCurrentStateFromRoot(optimizationLog, DexStore.this.readStatusLocked(), z);
        }
    }

    /* loaded from: classes.dex */
    public class PreviewSdkHelper {
        public static boolean isPreviewSdk() {
            if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class ProgressListener {
        public void onProgress(int i, int i2, boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public final class TmpDir implements Closeable {
        public File directory;
        public ReentrantLockFile.Lock mTmpDirLock;

        public TmpDir(ReentrantLockFile.Lock lock, File file) {
            this.mTmpDirLock = lock;
            this.directory = file;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.mTmpDirLock != null) {
                ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
                try {
                    ReentrantLockFile.Lock lock = this.mTmpDirLock;
                    File file = ReentrantLockFile.this.lockFileName;
                    lock.close();
                    this.mTmpDirLock = null;
                    Fs.deleteRecursiveNoThrow(file);
                    Fs.deleteRecursiveNoThrow(this.directory);
                    this.directory = null;
                    if (acquire != null) {
                        acquire.close();
                    }
                } catch (Throwable th) {
                    if (acquire != null) {
                        try {
                            acquire.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
        }
    }

    private void deleteFiles(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null) {
                Mlog.safeFmt("deleting existing file %s/%s", this.root, strArr[i]);
                Fs.deleteRecursive(new File(this.root, strArr[i]));
            }
        }
    }

    private int findInArray(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static long getBaseApkIdentifier(File file) {
        return getApkIdentifier(file, false);
    }

    private synchronized DexStore[] getParents() {
        List list;
        DexManifest loadManifest = loadManifest();
        if (this.mParentStores.isEmpty() && !DexStoreUtils.MAIN_DEX_STORE_ID.equals(loadManifest.id)) {
            for (String str : loadManifest.requires) {
                if (!DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
                    DexStore dexStoreListHead = dexStoreListHead();
                    while (true) {
                        if (dexStoreListHead != null) {
                            String str2 = dexStoreListHead.id;
                            if (str2 != null && str2.equals(str)) {
                                this.mParentStores.add(dexStoreListHead);
                                dexStoreListHead.addChild(this);
                                break;
                            }
                            dexStoreListHead = dexStoreListHead.next;
                        } else {
                            Mlog.safeFmt(AnonymousClass001.A0u("unable to find required store ", str, " of store ", loadManifest.id), new Object[0]);
                            break;
                        }
                    }
                }
            }
        }
        list = this.mParentStores;
        return (DexStore[]) list.toArray(new DexStore[list.size()]);
    }

    public static boolean isDoppelDexBuild() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:21:0x001b, B:24:0x0021, B:26:0x0029, B:28:0x0035, B:8:0x0051, B:10:0x005d, B:11:0x008a, B:12:0x00a3, B:14:0x006e, B:16:0x0074, B:17:0x0077, B:32:0x0042), top: B:20:0x001b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:21:0x001b, B:24:0x0021, B:26:0x0029, B:28:0x0035, B:8:0x0051, B:10:0x005d, B:11:0x008a, B:12:0x00a3, B:14:0x006e, B:16:0x0074, B:17:0x0077, B:32:0x0042), top: B:20:0x001b, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] readCurrentDepBlock() {
        /*
            r8 = this;
            r7 = 0
            r5 = 1
            r6 = 0
            java.io.File r0 = r8.mApk     // Catch: java.lang.Exception -> La
            java.io.File r6 = determineOdexCacheName(r0)     // Catch: java.lang.Exception -> La
            goto L15
        La:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "error reading odex cache file %s"
            com.facebook.common.dextricks.Mlog.w(r2, r0, r1)
        L15:
            android.os.Parcel r2 = android.os.Parcel.obtain()
            if (r6 == 0) goto L4c
            boolean r0 = r6.exists()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L4c
            com.facebook.common.dextricks.DexStore[] r4 = r8.getParents()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La4
            int r3 = r4.length     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La4
            r1 = 0
        L27:
            if (r1 >= r3) goto L35
            r0 = r4[r1]     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La4
            byte[] r0 = r0.readCurrentDepBlock()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La4
            r2.writeByteArray(r0)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La4
            int r1 = r1 + 1
            goto L27
        L35:
            java.lang.String r0 = r6.getPath()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La4
            byte[] r0 = com.facebook.common.dextricks.DalvikInternals.readOdexDepBlock(r0)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La4
            r2.writeByteArray(r0)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> La4
            goto L4e
        L41:
            r0 = move-exception
            java.lang.String r1 = "could not read odex dep block: using modtime: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> La4
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch: java.lang.Throwable -> La4
        L4c:
            r0 = 0
            goto L4f
        L4e:
            r0 = 1
        L4f:
            if (r0 != 0) goto L6e
            java.io.File r0 = r8.mApk     // Catch: java.lang.Throwable -> La4
            long r3 = getApkIdentifier(r0, r5)     // Catch: java.lang.Throwable -> La4
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.io.File r0 = r8.mApk     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> La4
            r2.writeString(r0)     // Catch: java.lang.Throwable -> La4
            r2.writeLong(r3)     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> La4
            r2.writeString(r0)     // Catch: java.lang.Throwable -> La4
        L6e:
            boolean r0 = com.facebook.endtoend.EndToEnd.A04()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L77
            r2.writeByte(r7)     // Catch: java.lang.Throwable -> La4
        L77:
            com.facebook.common.dextricks.DexStore$Config r0 = r8.readConfig()     // Catch: java.lang.Throwable -> La4
            byte[] r0 = r0.readDepBlock()     // Catch: java.lang.Throwable -> La4
            r2.writeByteArray(r0)     // Catch: java.lang.Throwable -> La4
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> La4
            r2.recycle()
            return r0
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "unable to get identifier of "
            r1.append(r0)     // Catch: java.lang.Throwable -> La4
            java.io.File r0 = r8.mApk     // Catch: java.lang.Throwable -> La4
            r1.append(r0)     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La4
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> La4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> La4
        La4:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.readCurrentDepBlock():byte[]");
    }

    public static void setClock(DexStoreClock dexStoreClock) {
        Mlog.safeFmt("Setting dexstore clock override", new Object[0]);
        sDexStoreClock = dexStoreClock;
    }

    public static void setDexStoreTestHooks(DexStoreTestHooks dexStoreTestHooks) {
        Mlog.safeFmt("Setting dexstore test hooks", new Object[0]);
        sDexStoreTestHooks = dexStoreTestHooks;
    }

    private void setDifference(String[] strArr, String[] strArr2) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str2 = strArr2[i2];
                    if (str2 != null && str.equals(str2)) {
                        strArr[i] = null;
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeTxFailedStatusLocked(long j) {
        writeStatusLocked((j << 4) | 1);
    }

    public synchronized boolean isLoaded() {
        boolean z;
        z = false;
        if (this.mLoadedManifest != null) {
            z = true;
        }
        return z;
    }

    public boolean isReoptimization(Context context) {
        try {
            OptimizationHistoryLog currentOptHistoryLogFromRoot = getCurrentOptHistoryLogFromRoot(context, this.root);
            if (readConfig().tryPeriodicPgoCompilation) {
                return currentOptHistoryLogFromRoot.lastCompilationSessionWasASuccess();
            }
            return false;
        } catch (IOException e) {
            Mlog.e(e, "failed to check if reoptimization. Failing back to not a reoptimization.", new Object[0]);
            return false;
        }
    }

    public synchronized DexErrorRecoveryInfo loadAll(int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) {
        DexErrorRecoveryInfo loadAllImpl;
        int i2;
        AbstractC09790fc.A01(AnonymousClass001.A0g("DexStore.loadAll[", getIdForTracing(this.root), "]"), -1978926528);
        try {
            try {
                loadAllImpl = loadAllImpl(i, lightweightQuickPerformanceLogger, context);
                i2 = 1014126979;
            } catch (RecoverableDexException e) {
                try {
                    loadAllImpl = loadAllImpl(i | 2, lightweightQuickPerformanceLogger, context);
                    loadAllImpl.regenRetryCause = e;
                    i2 = -1618922394;
                } catch (RecoverableDexException e2) {
                    throw new AssertionError(e2);
                }
            }
            AbstractC09790fc.A00(i2);
            loadAllImpl.loadAllTime = sDexStoreClock.now();
        } catch (Throwable th) {
            AbstractC09790fc.A00(1430984941);
            throw th;
        }
        return loadAllImpl;
    }

    public long reportStatus() {
        Mlog.safeFmt("DexStore::reportStatus()", new Object[0]);
        long j = 0;
        try {
            ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
            try {
                j = readStatusLocked();
                if (acquire != null) {
                    acquire.close();
                    return j;
                }
            } finally {
            }
        } catch (Throwable th) {
            Mlog.safeFmt("DexStore::reportStatus caught Throwable ", th);
        }
        return j;
    }

    /* loaded from: classes.dex */
    public class NormalDexStoreClock implements DexStoreClock {
        @Override // com.facebook.common.dextricks.DexStore.DexStoreClock
        public long now() {
            return System.currentTimeMillis();
        }

        public /* synthetic */ NormalDexStoreClock(AnonymousClass1 anonymousClass1) {
        }

        public NormalDexStoreClock() {
        }
    }

    private byte adjustDesiredStateForConfig(byte b, Config config) {
        Object[] objArr;
        String str;
        Object[] objArr2;
        String str2;
        byte b2 = config.mode;
        if (b2 != 0) {
            if (b2 == 1) {
                Mlog.safeFmt("using fallback mode due to request in config file", new Object[0]);
                return (byte) 2;
            }
            if (b2 == 2) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4 && b != 7) {
                            if (b != 8) {
                                if (b != 9) {
                                    objArr = new Object[]{Byte.valueOf(b)};
                                    str = "ignoring configured turbo mode: state not whitelisted: %s";
                                    Mlog.w(str, objArr);
                                    return b;
                                }
                                objArr2 = new Object[0];
                                str2 = "ignoring configured turbo mode: no dex loading to do";
                            } else {
                                Mlog.safeFmt("using ART turbo as requested in config file", new Object[0]);
                                return (byte) 7;
                            }
                        } else {
                            objArr2 = new Object[0];
                            str2 = "config file wants turbo mode: already using it";
                        }
                    } else {
                        Mlog.safeFmt("using Dalvik turbo as requested in config file", new Object[0]);
                        return (byte) 4;
                    }
                } else {
                    objArr2 = new Object[0];
                    str2 = "ignoring configured turbo mode: already forced to fallback mode";
                }
                Mlog.safeFmt(str2, objArr2);
                return b;
            }
            if (b2 == 3) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            if (b != 7) {
                                if (b != 8) {
                                    if (b != 9) {
                                        objArr = new Object[]{Byte.valueOf(b)};
                                        str = "ignoring configured xdex mode: state not whitelisted: %s";
                                    } else {
                                        objArr2 = new Object[0];
                                        str2 = "ignoring configured xdex mode: no dex loading to do";
                                    }
                                }
                            } else {
                                Mlog.safeFmt("using ART xdex as requested in config file", new Object[0]);
                                return (byte) 8;
                            }
                        } else {
                            Mlog.safeFmt("using Dalvik xdex as requested in config", new Object[0]);
                            return (byte) 3;
                        }
                    }
                    objArr2 = new Object[0];
                    str2 = "config file wants xdex mode: already using it";
                } else {
                    objArr2 = new Object[0];
                    str2 = "ignoring configured xdex mode: already forced to fallback";
                }
                Mlog.safeFmt(str2, objArr2);
                return b;
            }
            objArr = new Object[]{Byte.valueOf(b2)};
            str = "ignoring unknown configured dex mode %s";
            Mlog.w(str, objArr);
            return b;
        }
        return b;
    }

    private void appendDexHashForMegaZip(Context context, StringBuilder sb, DexManifest dexManifest) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(OdexSchemeOreo.getPrimaryDexIdentifierString(context).getBytes());
            int i = 0;
            while (true) {
                DexManifest.Dex[] dexArr = dexManifest.dexes;
                if (i < dexArr.length) {
                    messageDigest.update(dexArr[i].hash.getBytes());
                    i++;
                } else {
                    messageDigest.update(readCurrentDepBlock());
                    sb.append(DexStoreUtils.toHex(messageDigest.digest()));
                    return;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void assertLockHeld() {
        boolean z = false;
        if (this.mLockFile.mLockOwner == Thread.currentThread()) {
            z = true;
        }
        Mlog.assertThat(z, "lock req", new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0di, java.lang.Object] */
    public static boolean checkAndClearGk(Context context, String str) {
        try {
            ?? obj = new Object();
            obj.A00 = context;
            boolean z = true;
            if (AbstractC05790Sg.A00(obj, str, 0) != 1) {
                z = false;
            }
            ?? obj2 = new Object();
            obj2.A00 = context;
            AbstractC05790Sg.A03(obj2, str, 0);
            return z;
        } catch (Throwable th) {
            ?? obj3 = new Object();
            obj3.A00 = context;
            AbstractC05790Sg.A03(obj3, str, 0);
            throw th;
        }
    }

    private boolean checkAnyOptimizerRunningCurrently() {
        File file = new File(this.root, ODEX_LOCK_FILENAME);
        boolean z = false;
        try {
            if (file.exists()) {
                ReentrantLockFile open = ReentrantLockFile.open(file);
                try {
                    ReentrantLockFile.Lock tryAcquire = open.tryAcquire(0);
                    if (tryAcquire == null) {
                        z = true;
                    } else {
                        Fs.safeClose(tryAcquire);
                    }
                    open.close();
                    return z;
                } finally {
                }
            }
        } catch (IOException unused) {
        }
        return false;
    }

    private int checkDirty(OdexScheme odexScheme, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        int checkDirty = checkDirty(odexScheme, strArr, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Fs.deleteRecursive((File) it.next());
        }
        return checkDirty;
    }

    private byte determineDesiredState(byte b, DexManifest dexManifest, boolean z) {
        Object[] objArr;
        String str;
        if (dexManifest.dexes.length == 0) {
            Mlog.safeFmt("no secondary dexes listed: using noop configuration", new Object[0]);
            return (byte) 9;
        }
        if (b == 5) {
            objArr = new Object[0];
            str = "recovering from bad class gen: using fallback";
        } else if ("Amazon".equals(Build.BRAND) && !C0Hi.A00) {
            objArr = new Object[0];
            str = "avoiding optimizations on non-standard VM";
        } else {
            if (C0Hi.A00) {
                if (!z && dexManifest.canLoadCanaryClass()) {
                    return (byte) 9;
                }
                return (byte) 8;
            }
            return (byte) 3;
        }
        Mlog.safeFmt(str, objArr);
        return (byte) 2;
    }

    public static File determineOdexCacheName(File file) {
        if (C0Hi.A00) {
            return null;
        }
        String path = file.getPath();
        if (path.endsWith(".apk")) {
            File file2 = new File(AnonymousClass001.A0R(path.substring(0, path.length() - 4), DexManifest.ODEX_EXT));
            if (file2.exists()) {
                return file2;
            }
        }
        return Fs.dexOptGenerateCacheFileName(Fs.findSystemDalvikCache(), file, "classes.dex");
    }

    public static synchronized DexStore dexStoreListHead() {
        DexStore dexStore;
        synchronized (DexStore.class) {
            dexStore = sListHead;
        }
        return dexStore;
    }

    public static synchronized DexStore findOpened(String str) {
        DexStore dexStoreListHead;
        synchronized (DexStore.class) {
            dexStoreListHead = dexStoreListHead();
            while (true) {
                if (dexStoreListHead != null) {
                    String str2 = dexStoreListHead.id;
                    if (str2 != null) {
                        if (str2.equals(str)) {
                            break;
                        }
                        dexStoreListHead = dexStoreListHead.next;
                    } else {
                        if (str == null) {
                            break;
                        }
                        dexStoreListHead = dexStoreListHead.next;
                    }
                } else {
                    dexStoreListHead = null;
                    break;
                }
            }
        }
        return dexStoreListHead;
    }

    public static long getAppUpgradeTimestamp(Context context) {
        long j = sCachedLastAppUpdateTime;
        if (j == 0) {
            long genAppUpgradeTimestamp = genAppUpgradeTimestamp(context);
            sCachedLastAppUpdateTime = genAppUpgradeTimestamp;
            return genAppUpgradeTimestamp;
        }
        return j;
    }

    public static DexStoreClock getClock(Class cls) {
        DexStoreClock dexStoreClock = sDexStoreClock;
        if (dexStoreClock == null) {
            return null;
        }
        return dexStoreClock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OptimizationHistoryLog getCurrentOptHistoryLogFromRoot(Context context, File file) {
        OptimizationHistoryLog optimizationHistoryLog = this.mCachedOptimizationHistoryLog;
        if (optimizationHistoryLog == null || !optimizationHistoryLog.isLogFileAsFromRoot(file) || this.mCachedOptimizationHistoryLog.isOutOfDate()) {
            OptimizationHistoryLog optimizationHistoryLog2 = this.mCachedOptimizationHistoryLog;
            OptimizationHistoryLog readOrMakeDefaultFromRoot = OptimizationHistoryLog.readOrMakeDefaultFromRoot(context, file);
            this.mCachedOptimizationHistoryLog = readOrMakeDefaultFromRoot;
            Mlog.safeFmt("Reading new history log for (same root: %s out of date: %s) root: %s \n old: %s \n new: %s", Boolean.valueOf(readOrMakeDefaultFromRoot.isLogFileAsFromRoot(file)), Boolean.valueOf(this.mCachedOptimizationHistoryLog.isOutOfDate()), file.getAbsolutePath(), optimizationHistoryLog2, this.mCachedOptimizationHistoryLog);
        }
        return this.mCachedOptimizationHistoryLog;
    }

    public static DexStoreTestHooks getDexStoreTestHooks() {
        return sDexStoreTestHooks;
    }

    private String getMegaZipName(Context context, DexManifest dexManifest) {
        StringBuilder sb = new StringBuilder(46);
        sb.append("z-");
        appendDexHashForMegaZip(context, sb, dexManifest);
        sb.append(".zip");
        return sb.toString();
    }

    public static File getOatFileFromDexHash(File file, String str) {
        if (str == null) {
            return null;
        }
        return new File(file, AnonymousClass001.A0g("prog-", str, ".oat"));
    }

    public static String getStatusDescription(long j) {
        String str;
        int i = (int) (j & 15);
        switch (i) {
            case 0:
                str = "STATE_INVALID";
                break;
            case 1:
                str = "STATE_TX_FAILED";
                break;
            case 2:
                str = "STATE_FALLBACK";
                break;
            case 3:
                str = "STATE_XDEX";
                break;
            case 4:
                str = "STATE_TURBO";
                break;
            case 5:
                str = "STATE_BAD_GEN";
                break;
            case 6:
                str = "STATE_REGEN_FORCED";
                break;
            case 7:
                str = "STATE_ART_TURBO";
                break;
            case 8:
                str = "STATE_ART_XDEX";
                break;
            case 9:
                str = "STATE_NOOP";
                break;
            default:
                str = AnonymousClass001.A0O("BAD STATE ", i);
                break;
        }
        return AnonymousClass001.A0B(str);
    }

    public static synchronized void installCrossDexHooks() {
        synchronized (DexStore.class) {
            if (sAttemptedCrossDexHookInstallation) {
                Throwable th = sCrossDexHookInstallationError;
                if (th != null) {
                    throw Fs.runtimeExFrom(th);
                }
            } else {
                sAttemptedCrossDexHookInstallation = true;
                try {
                    DalvikInternals.fixDvmForCrossDexHack();
                    Mlog.safeFmt("cross-dex hook installation succeeded", new Object[0]);
                } catch (Throwable th2) {
                    sCrossDexHookInstallationError = th2;
                }
            }
        }
    }

    public static long lastModifiedTime(File file) {
        if (file != null && file.exists()) {
            return file.lastModified();
        }
        return 0L;
    }

    private String[] listAndPruneRootFiles(Context context) {
        ArrayList arrayList = new ArrayList();
        String[] listRootFilesForPruningLocked = listRootFilesForPruningLocked(context, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Fs.deleteRecursive((File) it.next());
        }
        return listRootFilesForPruningLocked;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a4, code lost:
    
        if (r15 == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: all -> 0x0225, TryCatch #1 {all -> 0x0225, blocks: (B:3:0x000c, B:6:0x0036, B:8:0x003a, B:10:0x0042, B:12:0x0048, B:16:0x0050, B:20:0x0058, B:25:0x0063, B:27:0x006b, B:29:0x0072, B:30:0x007d, B:32:0x0083, B:34:0x008b, B:36:0x0092, B:38:0x009c, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bd, B:48:0x00c6, B:50:0x00cf, B:52:0x00d8, B:55:0x00eb, B:56:0x00e1, B:59:0x00ee, B:61:0x0102, B:63:0x010d, B:64:0x0110, B:66:0x011b, B:67:0x0126, B:73:0x0161, B:75:0x0168, B:77:0x016f, B:78:0x017d, B:80:0x0180, B:82:0x018f, B:85:0x019f, B:86:0x0197, B:90:0x01b1, B:93:0x01b9, B:96:0x01c7, B:120:0x01f1, B:101:0x01f4, B:102:0x01fb, B:107:0x01a8, B:113:0x013b, B:115:0x0150, B:117:0x0157, B:119:0x01d8, B:69:0x012b, B:71:0x0130), top: B:2:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: all -> 0x0225, TryCatch #1 {all -> 0x0225, blocks: (B:3:0x000c, B:6:0x0036, B:8:0x003a, B:10:0x0042, B:12:0x0048, B:16:0x0050, B:20:0x0058, B:25:0x0063, B:27:0x006b, B:29:0x0072, B:30:0x007d, B:32:0x0083, B:34:0x008b, B:36:0x0092, B:38:0x009c, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bd, B:48:0x00c6, B:50:0x00cf, B:52:0x00d8, B:55:0x00eb, B:56:0x00e1, B:59:0x00ee, B:61:0x0102, B:63:0x010d, B:64:0x0110, B:66:0x011b, B:67:0x0126, B:73:0x0161, B:75:0x0168, B:77:0x016f, B:78:0x017d, B:80:0x0180, B:82:0x018f, B:85:0x019f, B:86:0x0197, B:90:0x01b1, B:93:0x01b9, B:96:0x01c7, B:120:0x01f1, B:101:0x01f4, B:102:0x01fb, B:107:0x01a8, B:113:0x013b, B:115:0x0150, B:117:0x0157, B:119:0x01d8, B:69:0x012b, B:71:0x0130), top: B:2:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b A[Catch: all -> 0x0225, TryCatch #1 {all -> 0x0225, blocks: (B:3:0x000c, B:6:0x0036, B:8:0x003a, B:10:0x0042, B:12:0x0048, B:16:0x0050, B:20:0x0058, B:25:0x0063, B:27:0x006b, B:29:0x0072, B:30:0x007d, B:32:0x0083, B:34:0x008b, B:36:0x0092, B:38:0x009c, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bd, B:48:0x00c6, B:50:0x00cf, B:52:0x00d8, B:55:0x00eb, B:56:0x00e1, B:59:0x00ee, B:61:0x0102, B:63:0x010d, B:64:0x0110, B:66:0x011b, B:67:0x0126, B:73:0x0161, B:75:0x0168, B:77:0x016f, B:78:0x017d, B:80:0x0180, B:82:0x018f, B:85:0x019f, B:86:0x0197, B:90:0x01b1, B:93:0x01b9, B:96:0x01c7, B:120:0x01f1, B:101:0x01f4, B:102:0x01fb, B:107:0x01a8, B:113:0x013b, B:115:0x0150, B:117:0x0157, B:119:0x01d8, B:69:0x012b, B:71:0x0130), top: B:2:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130 A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #0 {all -> 0x0134, blocks: (B:69:0x012b, B:71:0x0130), top: B:68:0x012b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[Catch: all -> 0x0225, TRY_LEAVE, TryCatch #1 {all -> 0x0225, blocks: (B:3:0x000c, B:6:0x0036, B:8:0x003a, B:10:0x0042, B:12:0x0048, B:16:0x0050, B:20:0x0058, B:25:0x0063, B:27:0x006b, B:29:0x0072, B:30:0x007d, B:32:0x0083, B:34:0x008b, B:36:0x0092, B:38:0x009c, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bd, B:48:0x00c6, B:50:0x00cf, B:52:0x00d8, B:55:0x00eb, B:56:0x00e1, B:59:0x00ee, B:61:0x0102, B:63:0x010d, B:64:0x0110, B:66:0x011b, B:67:0x0126, B:73:0x0161, B:75:0x0168, B:77:0x016f, B:78:0x017d, B:80:0x0180, B:82:0x018f, B:85:0x019f, B:86:0x0197, B:90:0x01b1, B:93:0x01b9, B:96:0x01c7, B:120:0x01f1, B:101:0x01f4, B:102:0x01fb, B:107:0x01a8, B:113:0x013b, B:115:0x0150, B:117:0x0157, B:119:0x01d8, B:69:0x012b, B:71:0x0130), top: B:2:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllCompressedOreoImpl(com.facebook.common.dextricks.DexErrorRecoveryInfo r24, com.facebook.common.dextricks.DexManifest r25, int r26, com.facebook.quicklog.LightweightQuickPerformanceLogger r27, android.content.Context r28) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllCompressedOreoImpl(com.facebook.common.dextricks.DexErrorRecoveryInfo, com.facebook.common.dextricks.DexManifest, int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:9|(4:12|(2:14|15)(1:17)|16|10)|18|19|(15:(1:21)(3:209|210|(3:212|(1:155)|156))|(1:24)(2:206|(36:208|28|(1:30)(1:(1:201)(1:202))|31|(2:33|(2:35|36))(1:(29:190|(2:195|196)|192|(1:194)|68|69|70|(8:72|(2:74|(1:(1:77))(1:78))|79|(1:(2:82|(2:84|85)(1:86))(1:87))|88|(2:107|108)|90|(7:91|(1:93)|94|95|96|(1:98)(1:100)|99))|112|(2:114|(1:116))|(1:(22:119|120|121|123|124|125|(1:128)|129|130|131|132|133|134|(1:136)|137|(1:139)|140|(6:142|(1:144)|145|(1:147)|148|(1:150))(1:157)|151|(1:153)|(0)|156)(4:174|(1:176)(2:182|(1:184)(2:185|181))|177|(3:179|180|181)))|186|125|(1:128)|129|130|131|132|133|134|(0)|137|(0)|140|(0)(0)|151|(0)|(0)|156))|37|(1:39)|40|(4:42|43|44|45)|60|(3:62|63|64)|68|69|70|(0)|112|(0)|(0)|186|125|(0)|129|130|131|132|133|134|(0)|137|(0)|140|(0)(0)|151|(0)|(0)|156))|131|132|133|134|(0)|137|(0)|140|(0)(0)|151|(0)|(0)|156)|22|25|(1:27)(2:203|(1:205))|28|(0)(0)|31|(0)(0)|37|(0)|40|(0)|60|(0)|68|69|70|(0)|112|(0)|(0)|186|125|(0)|129|130) */
    /* JADX WARN: Can't wrap try/catch for region: R(44:9|(4:12|(2:14|15)(1:17)|16|10)|18|19|(1:21)(3:209|210|(3:212|(1:155)|156))|22|(1:24)(2:206|(36:208|28|(1:30)(1:(1:201)(1:202))|31|(2:33|(2:35|36))(1:(29:190|(2:195|196)|192|(1:194)|68|69|70|(8:72|(2:74|(1:(1:77))(1:78))|79|(1:(2:82|(2:84|85)(1:86))(1:87))|88|(2:107|108)|90|(7:91|(1:93)|94|95|96|(1:98)(1:100)|99))|112|(2:114|(1:116))|(1:(22:119|120|121|123|124|125|(1:128)|129|130|131|132|133|134|(1:136)|137|(1:139)|140|(6:142|(1:144)|145|(1:147)|148|(1:150))(1:157)|151|(1:153)|(0)|156)(4:174|(1:176)(2:182|(1:184)(2:185|181))|177|(3:179|180|181)))|186|125|(1:128)|129|130|131|132|133|134|(0)|137|(0)|140|(0)(0)|151|(0)|(0)|156))|37|(1:39)|40|(4:42|43|44|45)|60|(3:62|63|64)|68|69|70|(0)|112|(0)|(0)|186|125|(0)|129|130|131|132|133|134|(0)|137|(0)|140|(0)(0)|151|(0)|(0)|156))|25|(1:27)(2:203|(1:205))|28|(0)(0)|31|(0)(0)|37|(0)|40|(0)|60|(0)|68|69|70|(0)|112|(0)|(0)|186|125|(0)|129|130|131|132|133|134|(0)|137|(0)|140|(0)(0)|151|(0)|(0)|156) */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03b7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03b8, code lost:
    
        com.facebook.common.dextricks.Mlog.e(r10, "Failure while checking oat file provenance.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01cd, code lost:
    
        com.facebook.common.dextricks.Mlog.safeFmt("no config file for repository %s found: using all-default configuration", r29.root);
        r0 = new com.facebook.common.dextricks.DexStore.Config.Builder().build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c7 A[Catch: all -> 0x0464, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cf A[Catch: all -> 0x0464, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f2 A[Catch: all -> 0x0464, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0449 A[Catch: all -> 0x0464, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x042a A[Catch: all -> 0x0464, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111 A[Catch: all -> 0x0464, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014e A[Catch: all -> 0x0464, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184 A[Catch: all -> 0x0464, TRY_LEAVE, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e6 A[Catch: all -> 0x0464, TryCatch #1 {all -> 0x0464, blocks: (B:22:0x0087, B:24:0x0095, B:27:0x00c8, B:28:0x00e0, B:31:0x00fc, B:33:0x0111, B:35:0x0117, B:37:0x0145, B:39:0x014e, B:40:0x0162, B:42:0x0184, B:45:0x018f, B:54:0x0318, B:53:0x0315, B:63:0x01a0, B:69:0x01be, B:72:0x01e6, B:77:0x01f8, B:78:0x0202, B:79:0x020b, B:85:0x022e, B:86:0x0216, B:87:0x0223, B:88:0x023b, B:108:0x0242, B:90:0x0252, B:94:0x0266, B:96:0x027b, B:98:0x0293, B:99:0x02c3, B:100:0x029c, B:104:0x02af, B:111:0x0247, B:112:0x02c4, B:116:0x02cd, B:119:0x02dd, B:125:0x0388, B:128:0x038f, B:134:0x03bf, B:136:0x03c7, B:137:0x03c9, B:139:0x03cf, B:140:0x03d1, B:142:0x03f2, B:144:0x03fc, B:145:0x0408, B:147:0x040e, B:148:0x0410, B:150:0x0420, B:151:0x0432, B:153:0x0449, B:157:0x042a, B:167:0x03b8, B:172:0x0307, B:174:0x0319, B:176:0x033f, B:177:0x0347, B:180:0x0362, B:181:0x0384, B:182:0x034c, B:184:0x0350, B:185:0x035c, B:188:0x01cd, B:67:0x01af, B:196:0x0127, B:192:0x013a, B:194:0x0142, B:199:0x012c, B:205:0x00d6, B:208:0x00a9, B:210:0x0067, B:212:0x006f, B:121:0x02f6, B:44:0x0188, B:130:0x039b, B:133:0x03a9, B:162:0x03b6, B:165:0x03b3, B:49:0x0194), top: B:209:0x0067, inners: #0, #2, #3, #4, #8, #9, #10, #11, #12 }] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, com.facebook.common.dextricks.DexErrorRecoveryInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllImpl(int r30, com.facebook.quicklog.LightweightQuickPerformanceLogger r31, android.content.Context r32) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllImpl(int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:
    
        if (com.facebook.common.dextricks.DexStore.sMergedDexConfig.mDexFiles.size() != r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:15:0x005b, B:17:0x0061, B:19:0x0072, B:21:0x0078, B:23:0x007c, B:24:0x0088, B:26:0x00c9, B:27:0x00cc, B:35:0x008c, B:37:0x009b, B:38:0x00a3, B:40:0x00a7, B:42:0x00b8, B:43:0x00bf), top: B:14:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.0di, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadDexFiles(com.facebook.common.dextricks.DexErrorRecoveryInfo r8, boolean r9, com.facebook.common.dextricks.OdexScheme r10, com.facebook.common.dextricks.DexManifest r11, android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadDexFiles(com.facebook.common.dextricks.DexErrorRecoveryInfo, boolean, com.facebook.common.dextricks.OdexScheme, com.facebook.common.dextricks.DexManifest, android.content.Context, int):void");
    }

    public static void mergeConfiguration(ClassLoaderConfiguration classLoaderConfiguration) {
        sMergedDexConfig.configFlags |= classLoaderConfiguration.configFlags;
        Iterator it = classLoaderConfiguration.mDexFiles.iterator();
        while (it.hasNext()) {
            sMergedDexConfig.addDex((DexFile) it.next());
        }
        classLoaderConfiguration.mDexFiles.clear();
    }

    public static long nowTimestamp() {
        return sDexStoreClock.now();
    }

    public static DexStore open(File file, File file2, ResProvider resProvider) {
        return open(file, file2, resProvider, new ArrayList(), new ArrayList());
    }

    private byte[] readSavedDepBlock() {
        String str;
        Object[] objArr;
        File file = new File(this.root, DEPS_FILENAME);
        if (!file.exists()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile.length();
                if (length > 16777216) {
                    str = "saved dep block file is way too big (%s bytes): considering invalid";
                    objArr = new Object[]{Long.valueOf(length)};
                } else {
                    byte[] bArr = new byte[(int) length];
                    int read = randomAccessFile.read(bArr);
                    if (read < length) {
                        str = "short read of dep block %s: wanted %s bytes; got %s: considering invalid";
                        objArr = new Object[]{file, Long.valueOf(length), Integer.valueOf(read)};
                    } else {
                        Mlog.safeFmt("read saved dep file %s (%s bytes)", file, Long.valueOf(length));
                        return bArr;
                    }
                }
                Mlog.safeFmt(str, objArr);
                return null;
            } finally {
                Fs.safeClose(randomAccessFile);
            }
        } catch (FileNotFoundException e) {
            Mlog.w(e, "unable to open deps file %s", file);
            return null;
        }
    }

    public static long sanityCheckTimestamp(long j) {
        if (j > sDexStoreClock.now()) {
            return 0L;
        }
        return j;
    }

    private OdexScheme schemeForState(Context context, DexManifest dexManifest, long j, int i) {
        if ((i & 64) != 0) {
            return new OdexSchemeIsolatedSplit(this.mApk, context);
        }
        return schemeForState(context, dexManifest, j);
    }

    private void setCompressedOreoDexErrorRecoveryInfo(DexErrorRecoveryInfo dexErrorRecoveryInfo, OdexSchemeOreo odexSchemeOreo, int i) {
        File file = odexSchemeOreo.mZipFile;
        int markLoadResult = odexSchemeOreo.markLoadResult(i, this.mUseEagerDexOpt);
        dexErrorRecoveryInfo.loadResult = markLoadResult;
        dexErrorRecoveryInfo.odexSize = OreoFileUtils.getOdex(file).length();
        dexErrorRecoveryInfo.odexLastModified = OreoFileUtils.getOdex(file).lastModified();
        dexErrorRecoveryInfo.odexSchemeName = "OdexSchemeOreo";
        boolean z = true;
        if ((markLoadResult & 1) == 0) {
            z = false;
        }
        dexErrorRecoveryInfo.dexoptDuringColdStart = z;
        dexErrorRecoveryInfo.dex2oatCmdLine = OreoFileUtils.getMegazipOdexKeyValue(file, "dex2oat-cmdline");
        dexErrorRecoveryInfo.vdexSize = OreoFileUtils.getVdex(file).length();
        dexErrorRecoveryInfo.vdexLastModified = OreoFileUtils.getVdex(file).lastModified();
    }

    private void setUsingAppImageForMainDexStore(final Context context, final File file) {
        Runnable runnable;
        String str = this.id;
        if (str != null && DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
            if (file != null) {
                runnable = new Runnable() { // from class: com.facebook.common.dextricks.DexStore.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DexErrorRecoveryInfoAsync.setMainDexStoreLoadInformation(OreoFileUtils.collectAsyncInfoWithSecondary(context, file));
                    }
                };
            } else {
                runnable = new Runnable() { // from class: com.facebook.common.dextricks.DexStore.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DexErrorRecoveryInfoAsync.setMainDexStoreLoadInformation(OreoFileUtils.collectBaseAsyncInfo(context));
                    }
                };
            }
            new Thread(runnable).start();
        }
    }

    private boolean shouldLoadCompressedOreoImpl(Context context, DexManifest dexManifest) {
        if (sLoadedCompressedOreo) {
            return true;
        }
        context.getApplicationInfo();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0di, java.lang.Object] */
    private boolean shouldUnpackForCloudPgo(Context context, OdexSchemeOreo odexSchemeOreo) {
        if (!C03600Hy.A06 || !DexStoreUtils.MAIN_DEX_STORE_ID.equals(this.id) || OreoFileUtils.alreadyUnpackedForCloudPgo(odexSchemeOreo.mZipFile)) {
            return false;
        }
        ?? obj = new Object();
        obj.A00 = context;
        if (AbstractC05790Sg.A00(obj, Experiments.HENOSIS_IN_CLOUD_PGO_QE, 0) == 1) {
            return true;
        }
        return false;
    }

    public void addChild(DexStore dexStore) {
        if (!this.mChildStores.contains(dexStore)) {
            this.mChildStores.add(dexStore);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (attemptedOptimizationSinceRegeneration() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r8.isDefault() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean atomicReplaceConfig(com.facebook.common.dextricks.DexStore.Config r8) {
        /*
            r7 = this;
            java.lang.String r2 = "Replacing config is default: %s nn: s"
            r4 = 0
            if (r8 == 0) goto Lc
            boolean r1 = r8.isDefault()
            r0 = 1
            if (r1 != 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            if (r8 == 0) goto L15
            r0 = 1
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            com.facebook.common.dextricks.Mlog.safeFmt(r2, r0)
            com.facebook.common.dextricks.ReentrantLockFile r0 = r7.mLockFile
            com.facebook.common.dextricks.ReentrantLockFile$Lock r6 = r0.acquire(r4)
            java.io.File r1 = r7.root     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "config"
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L99
            r5.<init>(r1, r0)     // Catch: java.lang.Throwable -> L99
            com.facebook.common.dextricks.DexStore$Config r1 = r7.readConfig()     // Catch: java.lang.Throwable -> L99
            boolean r3 = r8.equals(r1)     // Catch: java.lang.Throwable -> L99
            boolean r0 = r7.attemptedOptimizationSinceRegeneration()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L3e
            goto L43
        L3e:
            boolean r1 = r8.equalsForBootstrapPurposes(r1)     // Catch: java.lang.Throwable -> L99
            goto L44
        L43:
            r1 = r3
        L44:
            if (r1 == 0) goto L4f
            if (r3 != 0) goto L4f
            boolean r0 = r7.checkDeps()     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L51
            r1 = 0
        L4f:
            r4 = r1
            goto L57
        L51:
            boolean r0 = r7.attemptedOptimizationSinceRegeneration()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L4f
        L57:
            boolean r0 = r8.isDefault()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L61
            com.facebook.common.dextricks.Fs.deleteRecursive(r5)     // Catch: java.lang.Throwable -> L99
            goto L70
        L61:
            java.io.File r2 = r7.root     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = "config.tmp"
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L99
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L99
            r8.writeAndSync(r0)     // Catch: java.lang.Throwable -> L99
            com.facebook.common.dextricks.Fs.renameOrThrow(r0, r5)     // Catch: java.lang.Throwable -> L99
        L70:
            if (r4 != 0) goto L8c
            java.io.File r0 = r7.root     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L99
            r0 = -1
            com.facebook.common.dextricks.DalvikInternals.fsyncNamed(r1, r0)     // Catch: java.lang.Throwable -> L99
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L99
            java.io.File r0 = r7.getRegenFile()     // Catch: java.lang.Throwable -> L89
            r0.delete()     // Catch: java.lang.Throwable -> L89
            r7.touchRegenStamp()     // Catch: java.lang.Throwable -> L89
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L89
            goto L91
        L89:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L99
        L8c:
            if (r3 != 0) goto L91
            r7.saveDeps()     // Catch: java.lang.Throwable -> L99
        L91:
            r0 = r4 ^ 1
            if (r6 == 0) goto L98
            r6.close()
        L98:
            return r0
        L99:
            r1 = move-exception
            if (r6 == 0) goto La4
            r6.close()     // Catch: java.lang.Throwable -> La0
            throw r1
        La0:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)
        La4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.atomicReplaceConfig(com.facebook.common.dextricks.DexStore$Config):boolean");
    }

    public boolean attemptedOptimizationSinceRegeneration() {
        return new File(this.root, OPTIMIZATION_LOG_FILENAME).exists();
    }

    public String findDexHashForCanaryClass(String str) {
        DexManifest dexManifest = this.mLoadedManifest;
        if (dexManifest == null) {
            return null;
        }
        for (DexManifest.Dex dex : dexManifest.dexes) {
            if (dex.canaryClass.equals(str)) {
                return dex.hash;
            }
        }
        return null;
    }

    public void forceRegenerateOnNextLoad() {
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            writeStatusLocked(6L);
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public List getAllOatFiles(File file) {
        DexManifest.Dex[] dexArr = this.mLoadedManifest.dexes;
        ArrayList arrayList = new ArrayList(dexArr.length);
        for (DexManifest.Dex dex : dexArr) {
            File oatFileFromDexHash = getOatFileFromDexHash(file, dex.hash);
            if (oatFileFromDexHash != null && oatFileFromDexHash.exists()) {
                arrayList.add(oatFileFromDexHash);
            }
        }
        return arrayList;
    }

    public OptimizationLog getAndClearCompletedOptimizationLog() {
        File file = new File(this.root, OPTIMIZATION_LOG_FILENAME);
        if (file.exists()) {
            ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
            try {
                OptimizationLog readOrMakeDefault = OptimizationLog.readOrMakeDefault(file);
                if ((readOrMakeDefault.flags & 1) == 0) {
                    if (acquire != null) {
                        acquire.close();
                        return null;
                    }
                } else {
                    file.delete();
                    if (acquire != null) {
                        acquire.close();
                    }
                    return readOrMakeDefault;
                }
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
        return null;
    }

    public long getApkLastModified() {
        return this.mApk.lastModified();
    }

    public File[] getDependencyOdexFiles() {
        ArrayList arrayList = new ArrayList();
        File file = this.mApk;
        arrayList.add(file);
        arrayList.add(determineOdexCacheName(file));
        for (DexStore dexStore : getParents()) {
            for (File file2 : dexStore.getDependencyOdexFiles()) {
                arrayList.add(file2);
            }
        }
        File[] fileArr = new File[arrayList.size()];
        arrayList.toArray(fileArr);
        return fileArr;
    }

    public Map getDiagnostics(Context context) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long reportStatus = reportStatus();
        OptimizationHistoryLog currentOptHistoryLogFromRoot = getCurrentOptHistoryLogFromRoot(context, this.root);
        Config readConfig = readConfig();
        OdexScheme schemeForState = schemeForState(context, loadManifest(), reportStatus);
        linkedHashMap.put("loadNotOptimized", Boolean.toString(schemeForState.loadNotOptimized(reportStatus)));
        linkedHashMap.put("needOptimization", schemeForState.needOptimization(reportStatus, readConfig, currentOptHistoryLogFromRoot).name());
        linkedHashMap.put("scheme", getStatusDescription(reportStatus));
        linkedHashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, Long.toHexString(reportStatus));
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            long now = sDexStoreClock.now();
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(this.root);
            if (readOrMakeDefaultFromRoot.isNotDefault) {
                linkedHashMap.put("optlog.flags", Integer.toString(readOrMakeDefaultFromRoot.flags));
                linkedHashMap.put("optlog.nrOptimizationsAttempted", Integer.toString(readOrMakeDefaultFromRoot.nrOptimizationsAttempted));
                linkedHashMap.put("optlog.nrOptimizationsFailed", Integer.toString(readOrMakeDefaultFromRoot.nrOptimizationsFailed));
                linkedHashMap.put("optlog.lastFailureExceptionJson", readOrMakeDefaultFromRoot.lastFailureExceptionJson);
            }
            linkedHashMap.put("config.enablePgoCompile", Boolean.toString(readConfig.tryPeriodicPgoCompilation));
            if (readConfig.tryPeriodicPgoCompilation) {
                linkedHashMap.put("config.minPgoDuration", Long.toString(readConfig.minTimeBetweenPgoCompilationMs));
                if (currentOptHistoryLogFromRoot != null) {
                    boolean z = false;
                    if (currentOptHistoryLogFromRoot.file != null) {
                        z = true;
                    }
                    if (z) {
                        str = printRelativeTime(now, currentOptHistoryLogFromRoot.lastSuccessfulOptimizationTimestampMs + readConfig.minTimeBetweenPgoCompilationMs);
                        linkedHashMap.put("config.timeleft", str);
                    }
                }
                str = "<no info>";
                linkedHashMap.put("config.timeleft", str);
            }
            if (currentOptHistoryLogFromRoot != null) {
                boolean z2 = false;
                if (currentOptHistoryLogFromRoot.file != null) {
                    z2 = true;
                }
                if (z2) {
                    linkedHashMap.put("opthistlog.lastSuccess", Boolean.toString(currentOptHistoryLogFromRoot.lastCompilationSessionWasASuccess()));
                    linkedHashMap.put("opthistlog.lastCompilationTimestamp", printRelativeTime(now, currentOptHistoryLogFromRoot.lastSuccessfulOptimizationTimestampMs));
                }
            }
            if (acquire != null) {
                acquire.close();
            }
            return linkedHashMap;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public List getLoadedDexFiles() {
        return this.mLoadedDexFiles;
    }

    public DexManifest getLoadedManifest() {
        return this.mLoadedManifest;
    }

    public String getMegaZipPath() {
        return this.mMegaZipPath;
    }

    public long getNextRecommendedOptimizationAttemptTime(OptimizationConfiguration optimizationConfiguration) {
        long lastModified = new File(this.root, OPTIMIZATION_LOG_FILENAME).lastModified();
        if (lastModified > sDexStoreClock.now()) {
            Mlog.w("ignoring optimization log file from the future", new Object[0]);
        } else if (lastModified > 0) {
            return optimizationConfiguration.timeBetweenOptimizationAttemptsMs + lastModified;
        }
        return 0L;
    }

    public String getOdexCachePath() {
        if (determineOdexCacheName(this.mApk) != null) {
            return determineOdexCacheName(this.mApk).getAbsolutePath();
        }
        return null;
    }

    public File getRegenFile() {
        return new File(this.root, REGEN_STAMP_FILENAME);
    }

    public ResProvider getResProvider() {
        return this.mResProvider;
    }

    public boolean hasChildren() {
        return this.mChildStores.isEmpty();
    }

    public boolean isArtMainStore() {
        return this.mIsArtMainStore;
    }

    public DexManifest loadManifest() {
        DexManifest loadManifestFrom;
        AbstractC09790fc.A01("DexStore.loadManifest", -1473556854);
        if (this.mManifest == null) {
            synchronized (this) {
                if (this.mManifest == null) {
                    if (this.mIsArtMainStore) {
                        loadManifestFrom = new DexManifest();
                    } else {
                        loadManifestFrom = DexManifest.loadManifestFrom(this.mResProvider, DexStoreUtils.SECONDARY_DEX_MANIFEST, true);
                    }
                    this.id = loadManifestFrom.id;
                    this.mManifest = loadManifestFrom;
                }
            }
        }
        AbstractC09790fc.A00(-235082202);
        return this.mManifest;
    }

    public TmpDir makeTemporaryDirectory(String str) {
        File file;
        File file2;
        ReentrantLockFile reentrantLockFile;
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            file = File.createTempFile(str, TMPDIR_LOCK_SUFFIX, this.root);
        } catch (Throwable th) {
            th = th;
            file = null;
            file2 = null;
        }
        try {
            file2 = new File(this.root, AnonymousClass001.A0R(Fs.stripLastExtension(file.getName()), TMPDIR_SUFFIX));
            Fs.mkdirOrThrow(file2);
            try {
                reentrantLockFile = ReentrantLockFile.open(file);
                try {
                    ReentrantLockFile.Lock tryAcquire = reentrantLockFile.tryAcquire(1);
                    if (tryAcquire != null) {
                        TmpDir tmpDir = new TmpDir(tryAcquire, file2);
                        Mlog.safeFmt("created tmpdir %s (lock file %s)", tmpDir.directory, reentrantLockFile.lockFileName);
                        if (acquire != null) {
                            acquire.close();
                        }
                        return tmpDir;
                    }
                    throw new RuntimeException("should have been able to acquire tmpdir lock");
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Fs.safeClose((Closeable) null);
                        Fs.safeClose(reentrantLockFile);
                        Fs.deleteRecursiveNoThrow(file);
                        Fs.deleteRecursiveNoThrow(file2);
                        throw th;
                    } catch (Throwable th3) {
                        if (acquire != null) {
                            try {
                                acquire.close();
                                throw th3;
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                throw th3;
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                reentrantLockFile = null;
            }
        } catch (Throwable th6) {
            th = th6;
            file2 = null;
            reentrantLockFile = null;
            Fs.safeClose((Closeable) null);
            Fs.safeClose(reentrantLockFile);
            Fs.deleteRecursiveNoThrow(file);
            Fs.deleteRecursiveNoThrow(file2);
            throw th;
        }
    }

    public void optimize(Context context, OptimizationConfiguration.Provider provider) {
        DexManifest dexManifest = this.mLoadedManifest;
        if (dexManifest == null) {
            dexManifest = loadManifest();
        }
        Mlog.safeFmt("[opt] loaded manifets", new Object[0]);
        ReentrantLockFile.Lock acquireInterruptubly = this.mLockFile.acquireInterruptubly(0);
        Mlog.safeFmt("[opt] locked dex store %s", this.root);
        try {
            try {
                OdexScheme schemeForState = schemeForState(context, dexManifest, readStatusLocked());
                Mlog.safeFmt("[opt] found scheme %s", schemeForState);
                if (checkDeps()) {
                    OptimizationSession optimizationSession = new OptimizationSession(context, provider, false);
                    try {
                        Mlog.safeFmt("[opt] opened optimization session", new Object[0]);
                        acquireInterruptubly.close();
                        try {
                            schemeForState.optimize(context, this, optimizationSession);
                            optimizationSession.noteOptimizationSuccess();
                            Mlog.safeFmt("[opt] finished optimization session", new Object[0]);
                            optimizationSession.close();
                            return;
                        } catch (Throwable th) {
                            optimizationSession.copeWithOptimizationFailure(th);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            optimizationSession.close();
                            throw th2;
                        } catch (Throwable th3) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            throw th2;
                        }
                    }
                }
                throw new InterruptedException("attempt to optimize stale repository");
            } catch (Throwable th4) {
                if (acquireInterruptubly != null) {
                    acquireInterruptubly.close();
                }
                throw th4;
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th5) {
            Mlog.w("[opt] optimization failed!", th5);
            throw th5;
        }
    }

    public Config readConfig() {
        Config build;
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            File file = new File(this.root, CONFIG_FILENAME);
            try {
                build = Config.read(file);
            } catch (FileNotFoundException unused) {
                build = new Config.Builder().build();
            } catch (UnsupportedOperationException unused2) {
                Mlog.safeFmt("unsupported dex store config file %s: ignoring and deleting", new Object[0]);
                Fs.deleteRecursive(file);
                build = new Config.Builder().build();
            } catch (Exception e) {
                Mlog.w(e, "error reading dex store config file %s: deleting and proceeding", new Object[0]);
                Fs.deleteRecursive(file);
                build = new Config.Builder().build();
            }
            if (acquire != null) {
                acquire.close();
            }
            return build;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void setResProvider(ResProvider resProvider) {
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
    }

    public boolean useBgDexOpt() {
        return this.mUseBgDexOpt;
    }

    public boolean useEagerDexOpt() {
        return this.mUseEagerDexOpt;
    }

    public DexStore(File file, File file2, ResProvider resProvider, ArrayList arrayList, ArrayList arrayList2) {
        this.mApk = file2;
        this.root = file;
        Fs.mkdirOrThrow(file);
        this.mLockFile = ReentrantLockFile.open(new File(file, MDEX_LOCK_FILENAME));
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
        this.primaryDexes = arrayList;
        this.auxiliaryDexes = arrayList2;
    }

    private boolean checkDeps() {
        byte[] readCurrentDepBlock = readCurrentDepBlock();
        byte[] readSavedDepBlock = readSavedDepBlock();
        if (readSavedDepBlock != null && Arrays.equals(readCurrentDepBlock, readSavedDepBlock)) {
            return true;
        }
        return false;
    }

    public static long genAppUpgradeTimestamp(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Mlog.w(e, "Cannot get our app last update time", new Object[0]);
            return 0L;
        }
    }

    public static long getApkIdentifier(File file, boolean z) {
        int A01 = BuildConstants.A01();
        if (A01 > 1) {
            Mlog.w("Build id used for apk identification", new Object[0]);
            return A01;
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                ZipEntry entry = zipFile.getEntry("classes.dex");
                if (entry != null) {
                    Mlog.w("CRC used for apk identification", new Object[0]);
                    long crc = entry.getCrc();
                    zipFile.close();
                    return crc;
                }
                zipFile.close();
                if (z) {
                    long lastModified = file.lastModified();
                    if (lastModified > 0) {
                        return lastModified;
                    }
                }
                throw new RuntimeException(AnonymousClass001.A0R("No usable identifier for apk ", file.getPath()));
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getIdForTracing(File file) {
        String path = file.getPath();
        int length = path.length();
        if (length > 64) {
            int i = 0;
            if (path.startsWith("/data/data/")) {
                i = path.indexOf(47, 11) + 1;
                if (length <= i + 64) {
                    return path.substring(i);
                }
            }
            return path.substring(i, i + 64);
        }
        return path;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0di, java.lang.Object] */
    private void installArtHacks(Context context, DexErrorRecoveryInfo dexErrorRecoveryInfo) {
        int i = 256;
        if (!context.getPackageName().equals("com.facebook.katana")) {
            i = 0;
        }
        boolean checkAndClearGk = checkAndClearGk(context, Experiments.DISABLE_DEX_VERIFIER);
        this.mDisableVerifier = checkAndClearGk;
        if (checkAndClearGk) {
            i |= 4;
        }
        if (checkAndClearGk(context, Experiments.DISABLE_DEX_COLLISION_CHECK)) {
            i |= 32;
        }
        if (!sLoadedCompressedOreo) {
            if (checkAndClearGk(context, Experiments.DISABLE_DEX_ISUPTODATE_CHECK)) {
                i |= 64;
            }
            ?? obj = new Object();
            obj.A00 = context;
            if (AbstractC05790Sg.A00(obj, Experiments.DISABLE_MONITOR_VISITLOCKS, 0) == 1) {
                i |= 128;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        int installArtHacks = DalvikInternals.installArtHacks(i, i2);
        if (i2 <= 31) {
            if ((i & 4) != 0 && (installArtHacks & 4) == 0) {
                DexTricksErrorReporter.reportSampledSoftError("dex_tricks::art_disable_verifier::failed_install", DalvikInternals.getLastInstallFailures(), null);
            }
            if ((i & 256) != 0 && (installArtHacks & 256) == 0) {
                DexTricksErrorReporter.reportSampledSoftError("dex_tricks::pc_line_num::failed_install", DalvikInternals.getLastInstallFailures(), null);
            }
        }
        DalvikInternals.setEnabledThreadArtHacks(i);
        dexErrorRecoveryInfo.hacksDesired = i;
        dexErrorRecoveryInfo.hacksInstalled = installArtHacks;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r0 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String[] listRootFilesForPruningLocked(android.content.Context r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.listRootFilesForPruningLocked(android.content.Context, java.util.List):java.lang.String[]");
    }

    private void optimizeInForegroundLocked(Context context, DexManifest dexManifest, long j) {
        assertLockHeld();
        OdexScheme schemeForState = schemeForState(context, dexManifest, j);
        OptimizationConfiguration build = new OptimizationConfiguration.Builder().build();
        OptimizationConfiguration.Provider provider = new OptimizationConfiguration.Provider(build);
        if (sDexStoreClock.now() < getNextRecommendedOptimizationAttemptTime(build)) {
            Mlog.safeFmt("... actually, not optimizing in foreground, since we failed optimization too recently", new Object[0]);
            return;
        }
        try {
            OptimizationSession optimizationSession = new OptimizationSession(context, provider, true);
            try {
                try {
                    schemeForState.optimize(context, this, optimizationSession);
                    optimizationSession.noteOptimizationSuccess();
                    optimizationSession.close();
                } catch (Throwable th) {
                    try {
                        optimizationSession.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                optimizationSession.copeWithOptimizationFailure(th3);
                throw th3;
            }
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        } catch (Throwable th4) {
            Mlog.w(th4, "foreground optimization failed; proceeding", new Object[0]);
        }
    }

    public static String printRelativeTime(long j, long j2) {
        return String.format("%d (%d ms ago)", Long.valueOf(j2), Long.valueOf(j - j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long readStatusLocked() {
        assertLockHeld();
        File file = new File(this.root, MDEX_STATUS_FILENAME);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16];
                if (fileInputStream.read(bArr, 0, 16) < 16) {
                    Mlog.safeFmt("status file %s too short: treating as zero", file);
                } else {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    long j = wrap.getLong();
                    long j2 = wrap.getLong();
                    Long valueOf = Long.valueOf(j);
                    Long valueOf2 = Long.valueOf(j2);
                    Mlog.safeFmt("read status:%x check:%x str:%s", valueOf, valueOf2, getStatusDescription(j));
                    long j3 = MDEX_STATUS_XOR ^ j;
                    if (j3 != j2) {
                        Mlog.e("check mismatch: status:%x expected-check:%x actual-check:%x", valueOf, Long.valueOf(j3), valueOf2);
                    } else {
                        return j;
                    }
                }
                Fs.deleteRecursiveNoThrow(file);
                return 0L;
            } finally {
                Fs.safeClose(fileInputStream);
            }
        } catch (FileNotFoundException unused) {
            Mlog.safeFmt("status file %s not found: treating as zero", file);
            return 0L;
        }
    }

    private void runCompiler(DexManifest dexManifest, OdexScheme odexScheme, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) {
        OdexScheme.Compiler makeCompiler = odexScheme.makeCompiler(this, i);
        try {
            InputDexIterator openDexIterator = this.mDexIteratorFactory.openDexIterator(this.id, dexManifest, lightweightQuickPerformanceLogger, context);
            while (openDexIterator.hasNext()) {
                try {
                    InputDex next = openDexIterator.next();
                    try {
                        Mlog.safeFmt("compiling %d/%d %s", Integer.valueOf(openDexIterator.mDexPos), Integer.valueOf(openDexIterator.mDexes.length), next);
                        makeCompiler.compile(next);
                        next.close();
                    } finally {
                    }
                } finally {
                }
            }
            makeCompiler.performFinishActions();
            openDexIterator.close();
            makeCompiler.close();
        } catch (Throwable th) {
            if (makeCompiler != null) {
                try {
                    makeCompiler.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    private void saveDeps() {
        byte[] readCurrentDepBlock = readCurrentDepBlock();
        File file = new File(this.root, DEPS_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.write(readCurrentDepBlock);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.close();
            Mlog.safeFmt("saved deps file %s", file);
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    private void touchRegenStamp() {
        File regenFile = getRegenFile();
        regenFile.createNewFile();
        if (regenFile.setLastModified(sDexStoreClock.now())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("could not set modtime of ");
        sb.append(regenFile);
        throw new IOException(sb.toString());
    }

    public File findOatFileForCanaryClass(File file, String str) {
        return getOatFileFromDexHash(file, findDexHashForCanaryClass(str));
    }

    public String[] getParentNames() {
        return loadManifest().requires;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0di, java.lang.Object] */
    public void markArtMainStore(Context context) {
        ?? obj = new Object();
        obj.A00 = context;
        if (AbstractC05790Sg.A00(obj, Experiments.SKIP_MANIFEST, 0) == 1) {
            Mlog.w("Marking ArtMainStore true!", new Object[0]);
            this.mIsArtMainStore = true;
        }
    }

    public void writeStatusLocked(long j) {
        assertLockHeld();
        if (((byte) (15 & j)) != 1) {
            DalvikInternals.fsyncNamed(this.root.getAbsolutePath(), -1);
        }
        File file = new File(this.root, MDEX_STATUS_FILENAME);
        long j2 = MDEX_STATUS_XOR ^ j;
        Mlog.safeFmt("writing status:%x check:%x str:%s", Long.valueOf(j), Long.valueOf(j2), getStatusDescription(j));
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(j);
        wrap.putLong(j2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr, 0, 16);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class OptimizationCanceledException extends InterruptedException {
        public OptimizationCanceledException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public final class RecoverableDexException extends Exception {
        public RecoverableDexException(Throwable th) {
            super(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r1 == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int checkDirty(com.facebook.common.dextricks.OdexScheme r9, java.lang.String[] r10, java.util.List r11) {
        /*
            r8 = this;
            java.lang.String[] r2 = r9.expectedFiles
            int r0 = r9.flags
            r0 = r0 & 2
            r5 = 0
            if (r0 == 0) goto La
            r5 = 2
        La:
            java.lang.Object r6 = r10.clone()
            java.lang.String[] r6 = (java.lang.String[]) r6
            r8.setDifference(r6, r2)
            r4 = 0
            r7 = 0
        L15:
            int r0 = r6.length
            r3 = 1
            if (r4 >= r0) goto L53
            r0 = r6[r4]
            if (r0 == 0) goto L45
            boolean r0 = com.facebook.common.dextricks.DexStoreUtils.isIgnoreDirtyFileName(r0)
            if (r0 != 0) goto L45
            r3 = r6[r4]
            java.io.File r1 = r8.root
            java.lang.String r0 = r9.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r0}
            java.lang.String r0 = "deleting unknown file %s in dex store %s with schema %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.io.File r3 = r8.root
            r1 = r6[r4]
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r1)
            r11.add(r0)
            r7 = 1
        L42:
            int r4 = r4 + 1
            goto L15
        L45:
            r1 = r6[r4]
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Ignoring potentially excessive file %s in root: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            goto L42
        L53:
            if (r7 == 0) goto L68
            int r0 = r9.flags
            r0 = r0 & 1
            if (r0 == 0) goto L68
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "dex store %s had excess files and is non-incremental: regenerating"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r5 = 2
        L68:
            boolean r0 = r8.checkDeps()
            if (r0 != 0) goto L7c
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "dex store %s dependencies have changed: regenerating all"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r5 = 2
        L7b:
            return r5
        L7c:
            if (r5 >= r3) goto L7b
            com.facebook.common.dextricks.ExpectedFileInfo[] r4 = r9.expectedFileInfos
            java.lang.Object r3 = r2.clone()
            java.lang.String[] r3 = (java.lang.String[]) r3
            r8.setDifference(r3, r10)
            r2 = 0
        L8a:
            int r0 = r3.length
            if (r2 >= r0) goto L7b
            r0 = r4[r2]
            if (r0 == 0) goto L96
            boolean r1 = r0.mIsOptional
            r0 = 1
            if (r1 != 0) goto L97
        L96:
            r0 = 0
        L97:
            r1 = r3[r2]
            if (r1 == 0) goto Laa
            if (r0 != 0) goto Laa
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "missing file %s in dex store %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            r5 = 1
        Laa:
            int r2 = r2 + 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.checkDirty(com.facebook.common.dextricks.OdexScheme, java.lang.String[], java.util.List):int");
    }

    public static synchronized DexStore findOpened(File file) {
        DexStore dexStoreListHead;
        synchronized (DexStore.class) {
            File absoluteFile = file.getAbsoluteFile();
            dexStoreListHead = dexStoreListHead();
            while (true) {
                if (dexStoreListHead != null) {
                    if (dexStoreListHead.root.equals(absoluteFile)) {
                        break;
                    }
                    dexStoreListHead = dexStoreListHead.next;
                } else {
                    dexStoreListHead = null;
                    break;
                }
            }
        }
        return dexStoreListHead;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        r4 = new com.facebook.common.dextricks.DexStore(r5, r6, r7, r8, r9);
        com.facebook.common.dextricks.DexStore.sListHead = r4;
        r0 = -125056790;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.facebook.common.dextricks.DexStore open(java.io.File r5, java.io.File r6, com.facebook.common.dextricks.ResProvider r7, java.util.ArrayList r8, java.util.ArrayList r9) {
        /*
            java.lang.Class<com.facebook.common.dextricks.DexStore> r3 = com.facebook.common.dextricks.DexStore.class
            monitor-enter(r3)
            java.lang.String r2 = "DexStore.open["
            java.lang.String r1 = getIdForTracing(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "]"
            java.lang.String r1 = X.AnonymousClass001.A0g(r2, r1, r0)     // Catch: java.lang.Throwable -> L46
            r0 = 1483972656(0x5873a030, float:1.0714773E15)
            X.AbstractC09790fc.A01(r1, r0)     // Catch: java.lang.Throwable -> L46
            java.io.File r5 = r5.getAbsoluteFile()     // Catch: java.lang.Throwable -> L3e
            com.facebook.common.dextricks.DexStore r4 = dexStoreListHead()     // Catch: java.lang.Throwable -> L3e
        L1d:
            if (r4 == 0) goto L2f
            java.io.File r0 = r4.root     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L28
            goto L2b
        L28:
            com.facebook.common.dextricks.DexStore r4 = r4.next     // Catch: java.lang.Throwable -> L3e
            goto L1d
        L2b:
            r0 = -974165148(0xffffffffc5ef6b64, float:-7661.424)
            goto L39
        L2f:
            com.facebook.common.dextricks.DexStore r4 = new com.facebook.common.dextricks.DexStore     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3e
            com.facebook.common.dextricks.DexStore.sListHead = r4     // Catch: java.lang.Throwable -> L3e
            r0 = -125056790(0xfffffffff88bc8ea, float:-2.2681384E34)
        L39:
            X.AbstractC09790fc.A00(r0)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            return r4
        L3e:
            r1 = move-exception
            r0 = -320691276(0xffffffffece2a3b4, float:-2.1919224E27)
            X.AbstractC09790fc.A00(r0)     // Catch: java.lang.Throwable -> L46
            throw r1     // Catch: java.lang.Throwable -> L46
        L46:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.open(java.io.File, java.io.File, com.facebook.common.dextricks.ResProvider, java.util.ArrayList, java.util.ArrayList):com.facebook.common.dextricks.DexStore");
    }

    private OdexScheme schemeForState(Context context, DexManifest dexManifest, long j) {
        if (dexManifest.isArtMainStore) {
            Mlog.w("This is the main store for art builds, using noop scheme", new Object[0]);
        } else {
            DexManifest.Dex[] dexArr = dexManifest.dexes;
            byte b = (byte) (15 & j);
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        if (b != 7) {
                            if (b != 8) {
                                if (b != 9) {
                                    return new OdexSchemeInvalid(j);
                                }
                            } else {
                                return new OdexSchemeArtXdex(context, dexArr, this.mResProvider, j);
                            }
                        } else {
                            return new OdexSchemeArtTurbo(dexArr);
                        }
                    } else {
                        return new OdexSchemeTurbo(dexArr);
                    }
                } else {
                    return new OdexSchemeXdex(dexArr);
                }
            } else {
                return new OdexSchemeBoring(dexArr);
            }
        }
        return new OdexSchemeNoop();
    }
}
