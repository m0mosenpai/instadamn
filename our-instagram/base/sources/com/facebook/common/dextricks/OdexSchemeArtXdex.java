package com.facebook.common.dextricks;

import X.AbstractC03330Dw;
import X.AnonymousClass001;
import X.C03600Hy;
import X.C09170dP;
import X.C0H1;
import X.C0JJ;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.facebook.common.dextricks.Dex2oatLogcatParser;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.DexUnpacker;
import com.facebook.common.dextricks.ExpectedFileInfo;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.Prio;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class OdexSchemeArtXdex extends OdexSchemeArtTurbo {
    public static final boolean APPLY_MIRANDA_HACK = true;
    public static final String DEX_MANIFEST_RESOURCE_PATH = "dex_manifest.txt";
    public static final String ENV_LD_PRELOAD = "LD_PRELOAD";
    public static final long MIN_DISK_FREE_FOR_MIXED_MODE = 419430400;
    public static final String MISSING_PGO_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_MissingPGO";
    public static final String MIXED_MODE_DATA_RESOURCE_PATH = "mixed_mode.txt";
    public static final String REGENERATE_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_REGEN";
    public static final long STATE_DEX2OAT_CLASSPATH_SET = 2048;
    public static final long STATE_DEX2OAT_QUICKENING_NEEDED = 64;
    public static final long STATE_DEX2OAT_QUICK_ATTEMPTED = 512;
    public static final long STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED = 32768;
    public static final long STATE_DO_PERIODIC_PGO_COMP_FINISHED = 65536;
    public static final long STATE_DO_PERIODIC_PGO_COMP_NEEDED = 16384;
    public static final long STATE_MASK = 20720;
    public static final long STATE_MIXED_ATTEMPTED = 1024;
    public static final long STATE_MIXED_NEEDED = 128;
    public static final long STATE_OATMEAL_QUICKENING_NEEDED = 32;
    public static final long STATE_OATMEAL_QUICK_ATTEMPTED = 256;
    public static final long STATE_OPT_COMPLETED = 16;
    public static final long STATE_PGO_ATTEMPTED = 8192;
    public static final long STATE_PGO_NEEDED = 4096;
    public static final String TMP_DEX_MANIFEST_FILE = "art_dex_manifest";
    public static final String TMP_MIXED_MODE_DATA_FILE = "art_mixed_mode_data_input";
    public final DexUnpacker mDexUnpacker;
    public final DexManifest.Dex[] mDexes;
    public final boolean mIsLoadable;
    public final C03600Hy mPGOProfileUtil;
    public final ResProvider mResProvider;

    /* loaded from: classes.dex */
    public class CriticalCannotTruncateDexesSection implements Closeable {
        public final boolean mHasMarked;
        public final File mRoot;

        public CriticalCannotTruncateDexesSection(OdexSchemeArtXdex odexSchemeArtXdex, File file) {
            this(file, true);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.mHasMarked) {
                OdexSchemeArtXdex.clearCannotTruncateDexesFlag(this.mRoot);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        
            if (com.facebook.common.dextricks.OdexSchemeArtXdex.markCannotTruncateDexesFlag(r4) == false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CriticalCannotTruncateDexesSection(java.io.File r4, boolean r5) {
            /*
                r2 = this;
                com.facebook.common.dextricks.OdexSchemeArtXdex.this = r3
                r2.<init>()
                r2.mRoot = r4
                if (r5 == 0) goto L10
                boolean r1 = com.facebook.common.dextricks.OdexSchemeArtXdex.markCannotTruncateDexesFlag(r4)
                r0 = 1
                if (r1 != 0) goto L11
            L10:
                r0 = 0
            L11:
                r2.mHasMarked = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.CriticalCannotTruncateDexesSection.<init>(com.facebook.common.dextricks.OdexSchemeArtXdex, java.io.File, boolean):void");
        }
    }

    /* loaded from: classes.dex */
    public class Dex2OatProgressListener implements DexStore.ExternalProcessProgressListener {
        public static final long CHECKPOINT_PERIOD = TimeUnit.MINUTES.toMillis(5);
        public static final String EVENT_NAME = "OptsvcEvent";
        public final Context mAppContext;
        public final int mAttemptNumber;
        public Integer mExitStatus;
        public final String mJobName;
        public long mLastCheckpointMs;
        public final long mStartTimeMs;

        private void convertDex2OatStatInfoToEventMap(Map map, Dex2oatLogcatParser.Dex2OatStatInfo dex2OatStatInfo) {
            String replace = dex2OatStatInfo.statType.replace(' ', '_');
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_TOTAL_CASES, Integer.valueOf(dex2OatStatInfo.totalCases));
            addDex2OatStatToEventMap(map, replace, "success", Integer.valueOf(dex2OatStatInfo.success));
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, Integer.valueOf(dex2OatStatInfo.failure));
            addDex2OatStatToEventMap(map, replace, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_PERCENT, Double.valueOf(dex2OatStatInfo.percent));
        }

        private String normalizeDex2OatStatType(String str) {
            return str.replace(' ', '_');
        }

        public void logEvent(String str, Dex2oatLogcatParser dex2oatLogcatParser) {
            Set emptySet;
            if (this.mExitStatus == null) {
                Mlog.w("Bad call to logEvent, exit status not set", new Object[0]);
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.mStartTimeMs;
            HashMap hashMap = new HashMap();
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, this.mJobName);
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "finish");
            hashMap.put("duration", Long.valueOf(uptimeMillis));
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_EXIT_CODE, this.mExitStatus);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_DETAIL_MSG, str);
            }
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(this.mAttemptNumber));
            if (dex2oatLogcatParser != null) {
                emptySet = dex2oatLogcatParser.mDex2OatStatInfos;
            } else {
                emptySet = Collections.emptySet();
            }
            Iterator it = emptySet.iterator();
            while (it.hasNext()) {
                convertDex2OatStatInfoToEventMap(hashMap, (Dex2oatLogcatParser.Dex2OatStatInfo) it.next());
            }
            OptSvcAnalyticsStore.logEvent(this.mAppContext, EVENT_NAME, hashMap);
        }

        public Dex2OatProgressListener(Context context, String str, int i) {
            Context applicationContext = context.getApplicationContext();
            this.mAppContext = applicationContext != null ? applicationContext : context;
            this.mJobName = str;
            this.mAttemptNumber = i;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.mStartTimeMs = uptimeMillis;
            this.mLastCheckpointMs = uptimeMillis;
        }

        private void addDex2OatStatToEventMap(Map map, String str, String str2, Object obj) {
            String makeKeyNameFromDex2OatStatInfo = makeKeyNameFromDex2OatStatInfo(str, str2);
            Mlog.safeFmt("Adding dex2oat stat key %s with %s", makeKeyNameFromDex2OatStatInfo, obj);
            map.put(makeKeyNameFromDex2OatStatInfo, obj);
        }

        private String makeKeyNameFromDex2OatStatInfo(String str, String str2) {
            return AnonymousClass001.A0u("dex2oat_stat_", str, "_", str2);
        }

        @Override // com.facebook.common.dextricks.DexStore.ExternalProcessProgressListener
        public void onCheckpoint() {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.mLastCheckpointMs >= CHECKPOINT_PERIOD) {
                this.mLastCheckpointMs = uptimeMillis;
                long j = uptimeMillis - this.mStartTimeMs;
                HashMap hashMap = new HashMap();
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, this.mJobName);
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "checkpoint");
                hashMap.put("duration", Long.valueOf(j));
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(this.mAttemptNumber));
                OptSvcAnalyticsStore.logEvent(this.mAppContext, EVENT_NAME, hashMap);
            }
        }

        @Override // com.facebook.common.dextricks.DexStore.ExternalProcessProgressListener
        public void onComplete(int i) {
            this.mExitStatus = Integer.valueOf(i);
        }
    }

    /* loaded from: classes.dex */
    public interface DexSelector {
        boolean select(DexManifest.Dex dex);
    }

    /* loaded from: classes.dex */
    public class ManifestEntry {
        public final boolean background;
        public final String canary;
        public final boolean coldstart;
        public final boolean extended;
        public final int ordinal;
        public final boolean primary;
        public final boolean scroll;

        public static ManifestEntry fromCSV(String str) {
            String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            int length = split.length;
            if (length < 1) {
                return null;
            }
            String convertClassToDotForm = OdexSchemeArtXdex.convertClassToDotForm(split[0]);
            int i = -1;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 = 1; i2 < length; i2++) {
                String[] split2 = split[i2].split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                if (split2.length != 2) {
                    return null;
                }
                if (split2[0].equals("primary")) {
                    z = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z = true;
                    }
                } else if (split2[0].equals("extended")) {
                    z3 = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z3 = true;
                    }
                } else if (split2[0].equals("scroll")) {
                    z4 = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z4 = true;
                    }
                } else if (split2[0].equals("coldstart")) {
                    z2 = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z2 = true;
                    }
                } else if (split2[0].equals(AppStateModule.APP_STATE_BACKGROUND)) {
                    z5 = false;
                    if (Integer.valueOf(split2[1]).intValue() == 1) {
                        z5 = true;
                    }
                } else if (split2[0].equals("ordinal")) {
                    i = Integer.valueOf(split2[1]).intValue();
                }
            }
            return new ManifestEntry(convertClassToDotForm, i, z, z2, z3, z4, z5);
        }

        public ManifestEntry(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.canary = str;
            this.ordinal = i;
            this.primary = z;
            this.coldstart = z2;
            this.extended = z3;
            this.scroll = z4;
            this.background = z5;
        }
    }

    public static boolean anyOptimizationDone(long j) {
        return (j & STATE_MASK) != 0;
    }

    public static Dex2OatHookInfo getMirandaFixLibHook() {
        return null;
    }

    private List getMixedModeDexInfos(List list, DexStore.TmpDir tmpDir, boolean z, byte b, DexManifest.Dex[] dexArr) {
        File extractResourceFile = extractResourceFile(DEX_MANIFEST_RESOURCE_PATH, tmpDir.directory, TMP_DEX_MANIFEST_FILE);
        Object[] objArr = new Object[0];
        if (extractResourceFile == null) {
            Mlog.safeFmt("[opt][mixed_mode] Getting mixed mode dex infos in legacy mode", objArr);
            return getMixedModeDexInfosLegacy(list, tmpDir, z, dexArr);
        }
        Mlog.safeFmt("[opt][mixed_mode] Getting mixed mode dex infos in manifest mode", objArr);
        return getMixedModeDexInfosManifest(extractResourceFile, list, tmpDir, z, dexSelectorForMultidexCompilationStrategy(extractResourceFile, b), dexArr);
    }

    public static int getOdexFlags() {
        return 1;
    }

    private long initialDexOptimizations(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, File file, List list) {
        Mlog.safeFmt("[opt] first dex2oat run", new Object[0]);
        optimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, config.enableArtVerifyNone, false, false, false, (byte) 0, (byte) 0, false, file, list);
        return 16L;
    }

    public static boolean markedToTryPgoProfileRecompilation(long j) {
        return (j & STATE_DO_PERIODIC_PGO_COMP_NEEDED) != 0;
    }

    public static boolean mixedNeeded(long j) {
        return (j & 128) != 0;
    }

    public static boolean optimizationCompleted(long j) {
        return (j & 16) != 0;
    }

    private boolean optimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, byte b, byte b2, boolean z5) {
        return optimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, z, z2, z3, z4, b, b2, z5, null, null);
    }

    @Override // com.facebook.common.dextricks.OdexSchemeArtTurbo, com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeArtXdex";
    }

    /* loaded from: classes.dex */
    public final class Dex2OatHookInfo {
        public final String envFlag;
        public final String libName;

        public Dex2OatHookInfo(String str, String str2) {
            this.libName = str;
            this.envFlag = str2;
        }
    }

    /* loaded from: classes.dex */
    public class Renamer {
        public final DexStore.TmpDir mTmpDir;
        public ArrayList mSourceFiles = new ArrayList();
        public ArrayList mDestFiles = new ArrayList();

        public void renameOrThrow() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.mSourceFiles;
                if (i < arrayList.size()) {
                    File file = (File) arrayList.get(i);
                    File file2 = (File) this.mDestFiles.get(i);
                    Mlog.safeFmt("Renaming %s to %s", file, file2);
                    Fs.renameOrThrow(file, file2);
                    i++;
                } else {
                    return;
                }
            }
        }

        public void reset() {
            Mlog.safeFmt("Resetting Renamer", new Object[0]);
            this.mSourceFiles.clear();
            this.mDestFiles.clear();
        }

        public Renamer(DexStore.TmpDir tmpDir) {
            this.mTmpDir = tmpDir;
        }

        public void addFile(File file, File file2) {
            Mlog.safeFmt("Queueing Rename of src %s to dest %s", file.getAbsolutePath(), file2.getAbsolutePath());
            this.mSourceFiles.add(file);
            this.mDestFiles.add(file2);
        }
    }

    public static void addOldPgoDex2OatParams(ProcessBuilder processBuilder) {
    }

    public static boolean anyCompilationNeeded(DexStore.Config config) {
        if (!config.enableMixedMode && !config.enableMixedModePgo && !config.tryPeriodicPgoCompilation) {
            return false;
        }
        return true;
    }

    public static List convertCopiedDexInfoToExpectedDexInfo(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ExpectedFileInfo((DexUnpacker.CopiedDexInfo) it.next()));
        }
        return arrayList;
    }

    public static String getBootClassPathValue(DexStore dexStore, boolean z) {
        String str = System.getenv("BOOTCLASSPATH");
        if (z) {
            StringBuilder sb = new StringBuilder(str);
            File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
            for (int i = 0; i < dependencyOdexFiles.length; i += 2) {
                if (sb.length() > 0) {
                    sb.append(":");
                }
                sb.append(dependencyOdexFiles[i].getAbsoluteFile());
            }
            return sb.toString();
        }
        return str;
    }

    public static File getCannotTruncateDexFlagFile(File file) {
        return DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
    }

    public static boolean getCannotTruncateDexesFlag(File file) {
        return DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg").exists();
    }

    public static String getClassPathValue(DexStore dexStore, File file, List list) {
        StringBuilder sb = new StringBuilder();
        File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
        for (int i = 0; i < dependencyOdexFiles.length; i += 2) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(dependencyOdexFiles[i].getAbsoluteFile());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = ((ExpectedFileInfo) it.next()).getFile(file);
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(file2.getAbsolutePath());
        }
        return sb.toString();
    }

    public static long getCompilationStatusFlags(DexStore.Config config) {
        long j;
        if (config.enableMixedMode) {
            j = 128;
        } else {
            j = 0;
        }
        if (config.tryPeriodicPgoCompilation) {
            j |= STATE_DO_PERIODIC_PGO_COMP_NEEDED;
        }
        if (config.enableMixedModePgo) {
            return j | STATE_PGO_NEEDED;
        }
        return j;
    }

    private Dex2OatHookInfo getDex2OatLibHooks(Context context, DexStore.OptimizationSession optimizationSession) {
        Object[] objArr;
        String str;
        if (AbstractC03330Dw.A00.booleanValue()) {
            objArr = new Object[0];
            str = "Not installing Dex2OatLibHooks on 64 bit device";
        } else {
            objArr = new Object[0];
            if (!optimizationSession.config.installDex2OatHooks) {
                str = "Not installing Dex2OatLibHooks";
            } else {
                Mlog.safeFmt("Going to try installing Dex2OatLibHooks", objArr);
                return new Dex2OatHookInfo("dex2oathooks", "FB_ENABLE_DEX2OAT_HOOKS");
            }
        }
        Mlog.safeFmt(str, objArr);
        return null;
    }

    private List getDexInfos(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, List list, boolean z, boolean z2, byte b, File file, DexManifest.Dex[] dexArr, AtomicReference atomicReference) {
        List list2 = list;
        Mlog.safeFmt("[opt] dex2oat - get dex infos for mm: %s pgo comp: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        try {
            if (areDexesTruncated(dexStore, file, dexArr)) {
                Mlog.safeFmt("Dexes appear truncated. Re-unpacking secondary dexes", new Object[0]);
                if (file == dexStore.root) {
                    if (list != null) {
                        Mlog.safeFmt("Ignoring given expected dex file infos since dexes are truncated", new Object[0]);
                    }
                    list2 = getNewInitialOptimizedSecondaryDexes(context, dexStore, optimizationSession, config, tmpDir, renamer, atomicReference);
                } else {
                    throw new IllegalStateException("Can only copy temp secondary dexes from the root");
                }
            }
            if (z2) {
                ExpectedFileInfo.setCompTypeToPgoIfUnknown(list2);
            }
            if (z) {
                return getMixedModeDexInfos(list2, tmpDir, z2, b, dexArr);
            }
            return list2;
        } catch (IOException e) {
            Mlog.w(e, "Could not get dex infos due to IO error. Bailing...", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List getMixedModeDexInfosLegacy(java.util.List r7, com.facebook.common.dextricks.DexStore.TmpDir r8, boolean r9, com.facebook.common.dextricks.DexManifest.Dex[] r10) {
        /*
            r6 = this;
            java.io.File r2 = r8.directory
            java.lang.String r1 = "mixed_mode.txt"
            java.lang.String r0 = "art_mixed_mode_data_input"
            java.io.File r3 = r6.extractResourceFile(r1, r2, r0)
            r2 = 0
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            if (r3 != 0) goto L17
            java.lang.String r0 = "[opt][mixed_mode] no mixed mode data file found"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            return r2
        L17:
            java.lang.String r0 = "[opt][mixed_mode] found mixed mode data file"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.io.IOException -> L50
            r0.<init>(r3)     // Catch: java.io.IOException -> L50
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> L50
            r3.<init>(r0)     // Catch: java.io.IOException -> L50
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r0.trim()     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L39
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L41
            goto L39
        L37:
            r1 = move-exception
            goto L47
        L39:
            java.lang.String r1 = "[opt][mixed_mode] mixed mode data missing in mixed mode data file"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L45
            com.facebook.common.dextricks.Mlog.w(r1, r0)     // Catch: java.lang.Throwable -> L45
            r4 = r2
        L41:
            r3.close()     // Catch: java.io.IOException -> L53
            goto L5b
        L45:
            r1 = move-exception
            r4 = r2
        L47:
            r3.close()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.io.IOException -> L53
        L4f:
            throw r1     // Catch: java.io.IOException -> L53
        L50:
            r3 = move-exception
            r4 = r2
            goto L54
        L53:
            r3 = move-exception
        L54:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "[opt][mixed_mode] problem reading mixed mode data file"
            com.facebook.common.dextricks.Mlog.w(r3, r0, r1)
        L5b:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "[opt][mixed_mode] mixed mode canary is %s"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            if (r4 == 0) goto L7f
            if (r9 == 0) goto L7b
            java.lang.String r0 = r7.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "[opt][mixed_mode] mixed mode must also take into account pgo compilation: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            com.facebook.common.dextricks.ExpectedFileInfo$CompilationType r0 = com.facebook.common.dextricks.ExpectedFileInfo.CompilationType.PGO
            java.util.List r2 = com.facebook.common.dextricks.ExpectedFileInfo.setCompTypeIfUnknown(r7, r0)
        L7b:
            java.util.List r2 = makeMixedModeFileList(r10, r4, r2)
        L7f:
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "[opt][mixed_mode] mixed mode dex names: %s"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.getMixedModeDexInfosLegacy(java.util.List, com.facebook.common.dextricks.DexStore$TmpDir, boolean, com.facebook.common.dextricks.DexManifest$Dex[]):java.util.List");
    }

    private List getMixedModeDexInfosManifest(File file, List list, DexStore.TmpDir tmpDir, boolean z, DexSelector dexSelector, DexManifest.Dex[] dexArr) {
        List list2;
        if (z) {
            Mlog.safeFmt("[opt][mixed_mode] mixed mode must also take into account pgo compilation: %s", list.toString());
            list2 = ExpectedFileInfo.setCompTypeIfUnknown(list, ExpectedFileInfo.CompilationType.PGO);
        } else {
            list2 = null;
        }
        return makeMixedModeFileList(dexArr, dexSelector, list2);
    }

    private List getNewSecondaryDexes(File file, File file2) {
        return convertCopiedDexInfoToExpectedDexInfo(this.mDexUnpacker.copySecondaryDexes(file, file2));
    }

    public static void initAllDex2OatHooks(ProcessBuilder processBuilder, Dex2OatHookInfo... dex2OatHookInfoArr) {
        int length;
        boolean z;
        if (dex2OatHookInfoArr != null && (length = dex2OatHookInfoArr.length) != 0) {
            StringBuilder sb = new StringBuilder();
            String str = System.getenv(ENV_LD_PRELOAD);
            if (str != null) {
                sb.append(str);
                z = true;
            } else {
                z = false;
            }
            int i = 0;
            boolean z2 = false;
            do {
                Dex2OatHookInfo dex2OatHookInfo = dex2OatHookInfoArr[i];
                if (dex2OatHookInfo != null) {
                    Mlog.safeFmt("Installing hook for %s", dex2OatHookInfo.libName);
                    File A01 = C09170dP.A01(dex2OatHookInfo.libName);
                    if (z) {
                        sb.append(File.pathSeparatorChar);
                    }
                    sb.append(A01.getAbsolutePath());
                    if (dex2OatHookInfo.envFlag != null) {
                        processBuilder.setenv(dex2OatHookInfo.envFlag, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    }
                    z = true;
                    z2 = true;
                }
                i++;
            } while (i < length);
            if (z2) {
                Mlog.safeFmt("Setting %s to %s", ENV_LD_PRELOAD, sb.toString());
                processBuilder.setenv(ENV_LD_PRELOAD, sb.toString());
                processBuilder.setenv("LD_LIBRARY_PATH", C09170dP.A02());
            }
        }
    }

    public static List makeMixedModeFileList(DexManifest.Dex[] dexArr, DexSelector dexSelector, List list) {
        int length;
        if (list != null && (length = dexArr.length) != list.size()) {
            throw new IllegalStateException(String.format("Dexes array [size: %d] needs to be the same size as replaceDexNames array [size: %d]", Integer.valueOf(length), Integer.valueOf(list.size())));
        }
        int length2 = dexArr.length;
        ArrayList arrayList = new ArrayList(length2);
        for (int i = 0; i < length2; i++) {
            DexManifest.Dex dex = dexArr[i];
            if (dex != null && dexSelector.select(dex)) {
                Mlog.safeFmt("[mixed_mode] selected dex = { %s, %s, %s }", dex.canaryClass, dex.hash, dex.assetName);
                ExpectedFileInfo expectedFileInfo = new ExpectedFileInfo(dex, ExpectedFileInfo.CompilationType.ALL);
                if (list != null) {
                    if (i < list.size()) {
                        list.set(i, expectedFileInfo);
                    }
                } else {
                    arrayList.add(expectedFileInfo);
                }
            }
        }
        if (list != null) {
            return list;
        }
        return arrayList;
    }

    private boolean needsTruncation(File file, int i) {
        if (i >= 0 && !dexAppearsTruncated(file, i)) {
            return true;
        }
        return false;
    }

    public static String oatNameFromDexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        return AnonymousClass001.A0R(str, DexManifest.ODEX_EXT);
    }

    public static String oatNameFromExpectedFileInfo(ExpectedFileInfo expectedFileInfo) {
        String str;
        DexManifest.Dex dex = expectedFileInfo.dex;
        if (dex != null) {
            str = dex.makeDexName();
        } else {
            str = expectedFileInfo.rawFile;
        }
        return oatNameFromDexName(str);
    }

    public static boolean pgoProfileRecompilationNeeded(DexStore.OptimizationHistoryLog optimizationHistoryLog, long j) {
        if (optimizationCompleted(optimizationHistoryLog.schemeStatus) && markedToTryPgoProfileRecompilation(j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    private void setCompilerFilter(DexStore.Config config, ProcessBuilder processBuilder) {
        String str;
        String str2;
        byte b = config.artFilter;
        if (b != 0) {
            switch (b) {
                case 1:
                    str = "verify-none";
                    str2 = AnonymousClass001.A0R("--compiler-filter=", str);
                    break;
                case 2:
                    str = "interpret-only";
                    str2 = AnonymousClass001.A0R("--compiler-filter=", str);
                    break;
                case 3:
                    str = "space";
                    str2 = AnonymousClass001.A0R("--compiler-filter=", str);
                    break;
                case 4:
                    str = "balanced";
                    str2 = AnonymousClass001.A0R("--compiler-filter=", str);
                    break;
                case 5:
                    str = Location.SPEED;
                    str2 = AnonymousClass001.A0R("--compiler-filter=", str);
                    break;
                case 6:
                    str = "everything";
                    str2 = AnonymousClass001.A0R("--compiler-filter=", str);
                    break;
                case 7:
                    str = "time";
                    str2 = AnonymousClass001.A0R("--compiler-filter=", str);
                    break;
                default:
                    Mlog.w("ignoring unknown configured ART filter %s", Byte.valueOf(b));
                    break;
            }
            processBuilder.addArgument(str2);
        }
        str = SystemProperties.get("dalvik.vm.dex2oat-filter");
        if (!str.isEmpty()) {
            Mlog.safeFmt("Setting dex2oatFilter to system prop: %s", str);
            str2 = AnonymousClass001.A0R("--compiler-filter=", str);
            processBuilder.addArgument(str2);
        } else {
            Mlog.safeFmt("[opt] no compile-filter set or pgo data, compiling with verify-none", new Object[0]);
            str2 = "--compiler-filter=verify-none";
            processBuilder.addArgument(str2);
        }
    }

    public static boolean shouldUseMixedModeDex2Oat(Context context, boolean z) {
        if (!z) {
            return true;
        }
        return !C0JJ.A00(C03600Hy.A00(context).A02).A15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void startOptimizerProcess(ProcessBuilder processBuilder, Context context, String str, DexStore.OptimizationSession optimizationSession, Dex2oatLogcatParser dex2oatLogcatParser, DexStore.TmpDir tmpDir) {
        Process process;
        RandomAccessFile openUnlinkedTemporaryFile;
        String str2;
        Dex2OatProgressListener dex2OatProgressListener = new Dex2OatProgressListener(context, str, optimizationSession.optimizationAttemptNumber);
        Process process2 = null;
        try {
            openUnlinkedTemporaryFile = Fs.openUnlinkedTemporaryFile(tmpDir.directory);
        } catch (Throwable th) {
            th = th;
            process = null;
        }
        try {
            int fileno = Fd.fileno(openUnlinkedTemporaryFile.getFD());
            int[] iArr = processBuilder.mStreamDispositions;
            iArr[1] = fileno;
            iArr[2] = -5;
            Mlog.safeFmt("starting job %s", str);
            Prio.With with = new Prio.With();
            try {
                process2 = processBuilder.create();
                with.close();
                int i = process2.mPid;
                int waitForAndManageProcess = optimizationSession.waitForAndManageProcess(process2, dex2OatProgressListener);
                if (dex2oatLogcatParser != null) {
                    Mlog.safeFmt("Success getting logcat dex2oat data: %s in %d ms", Boolean.valueOf(dex2oatLogcatParser.readAndParseProcess(i, 10000)), Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis()));
                }
                try {
                    str2 = Fs.readProgramOutputFile(openUnlinkedTemporaryFile);
                } catch (IOException unused) {
                    str2 = null;
                }
                Integer valueOf = Integer.valueOf(waitForAndManageProcess);
                Mlog.safeFmt("Got result from dex2oat [exit status: %d]: %s", valueOf, str2);
                Fs.safeClose(openUnlinkedTemporaryFile);
                process2.destroy();
                dex2OatProgressListener.logEvent(str2, dex2oatLogcatParser);
                Mlog.safeFmt("%s exited with status %s", str, valueOf);
                if (waitForAndManageProcess == 0) {
                } else {
                    throw new RuntimeException(String.format("%s failed: %s: %s", str, Process.describeStatus(waitForAndManageProcess), str2));
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            process = process2;
            process2 = openUnlinkedTemporaryFile;
            Fs.safeClose(process2);
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    private void truncateWithBackup(File file, File file2, int i) {
        if (i >= 0) {
            Fs.renameOrThrow(file, file2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    C0H1.A00(fileInputStream, fileOutputStream, i);
                    fileInputStream.close();
                    fileOutputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    throw th;
                } finally {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                }
            }
        }
    }

    public static String vdexNameFromOdexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        return AnonymousClass001.A0R(str, ".vdex");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0128 A[Catch: IOException -> 0x01a5, TRY_LEAVE, TryCatch #0 {IOException -> 0x01a5, blocks: (B:23:0x0118, B:25:0x0128, B:31:0x0157, B:33:0x017e, B:27:0x012b), top: B:22:0x0118, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017e A[Catch: IOException -> 0x01a5, TRY_LEAVE, TryCatch #0 {IOException -> 0x01a5, blocks: (B:23:0x0118, B:25:0x0128, B:31:0x0157, B:33:0x017e, B:27:0x012b), top: B:22:0x0118, inners: #1 }] */
    @Override // com.facebook.common.dextricks.OdexSchemeArtTurbo, com.facebook.common.dextricks.OdexScheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void configureClassLoader(java.io.File r28, com.facebook.common.dextricks.ClassLoaderConfiguration r29) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.configureClassLoader(java.io.File, com.facebook.common.dextricks.ClassLoaderConfiguration):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0046, code lost:
    
        if ((r16 & 128) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004c, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004e, code lost:
    
        r6 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0056, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_PGO_NEEDED) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_PGO_ATTEMPTED) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        r6 = r6 | com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r6 = r6 | 8192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006e, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_PGO_ATTEMPTED) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0070, code lost:
    
        r6 = r6 | com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO_ATTEMPTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0079, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_DEX2OAT_CLASSPATH_SET) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007b, code lost:
    
        r6 = r6 | com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0083, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008f, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0095, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0097, code lost:
    
        r6 = 131072 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009f, code lost:
    
        if ((r16 & com.facebook.common.dextricks.OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a4, code lost:
    
        return r6 | com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return r6;
     */
    @Override // com.facebook.common.dextricks.OdexScheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int loadInformationalStatus(java.io.File r15, long r16) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.loadInformationalStatus(java.io.File, long):int");
    }

    public OdexSchemeArtXdex(Context context, DexManifest.Dex[] dexArr, ResProvider resProvider, long j) {
        super(1, OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j)));
        this.mDexes = dexArr;
        this.mResProvider = resProvider;
        this.mIsLoadable = (j & STATE_MASK) != 0;
        this.mPGOProfileUtil = C03600Hy.A00(context);
        this.mDexUnpacker = new DexUnpacker(context, resProvider);
    }

    public static /* synthetic */ Context access$100(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    private boolean areDexesTruncated(DexStore dexStore, File file, DexManifest.Dex[] dexArr) {
        int i = dexStore.readConfig().artTruncatedDexSize;
        if (i > 0) {
            for (DexManifest.Dex dex : dexArr) {
                if (!dexAppearsTruncated(dex, file, i)) {
                    Mlog.w("Dex %s is not truncated", dex.assetName);
                }
            }
            Mlog.safeFmt("All dexes appear truncated", new Object[0]);
            return true;
        }
        return false;
    }

    private void checkTmpOatFileLength(File file) {
        if (file.exists() && file.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(file);
            sb.append(" is an impossibly short oat file");
            throw new RuntimeException(sb.toString());
        }
    }

    public static void clearCannotTruncateDexesFlag(File file) {
        Mlog.safeFmt("Clearing flag to not truncate dex files at root: %s", file.getAbsolutePath());
        File makeIgnoreDirtyCheckFile = DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
        if (!makeIgnoreDirtyCheckFile.exists()) {
            Mlog.w("Dex truncation file does not exist. This is likely an error", new Object[0]);
        }
        if (!makeIgnoreDirtyCheckFile.delete() && makeIgnoreDirtyCheckFile.exists()) {
            Mlog.w("Was not able to delete cannot truncate dexes file", new Object[0]);
        }
    }

    public static String convertClassToDotForm(String str) {
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    public static boolean dexAppearsTruncated(File file, int i) {
        if (file.length() > i) {
            return false;
        }
        return true;
    }

    private File extractResourceFile(String str, File file, String str2) {
        try {
            File createTempFile = File.createTempFile(str2, "txt", file);
            createTempFile.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                InputStream open = this.mResProvider.open(str);
                try {
                    C0H1.A01(open, fileOutputStream, Integer.MAX_VALUE);
                    if (open != null) {
                        open.close();
                    }
                    fileOutputStream.close();
                    return createTempFile;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            Mlog.e(AnonymousClass001.A0R("[opt][res] io exception ", e.toString()), new Object[0]);
            return null;
        }
    }

    public static boolean forceUseOriginalMixedModePGOProfile(Context context) {
        return C03600Hy.A00(context).A08();
    }

    public static Context getAppContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    private String getArtImageLocation() {
        String artImageLocation = DalvikInternals.getArtImageLocation();
        if (artImageLocation != null && !"".equals(artImageLocation)) {
            return artImageLocation;
        }
        return AnonymousClass001.A0g("/data/dalvik-cache/", OdexSchemeArtTurbo.getArch(), "/system@framework@boot.art");
    }

    private List getNewInitialOptimizedSecondaryDexes(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, AtomicReference atomicReference) {
        File makeTmpSubDirectory = makeTmpSubDirectory(tmpDir, "tmp-unpack-dexes");
        List newSecondaryDexes = getNewSecondaryDexes(makeTmpSubDirectory, dexStore.root);
        atomicReference.set(makeTmpSubDirectory);
        if (newSecondaryDexes == null) {
            return null;
        }
        Mlog.safeFmt("Starting to do initial optimizations for temp secondary dexes", new Object[0]);
        DexStore.DexStoreTestHooks dexStoreTestHooks = DexStore.sDexStoreTestHooks;
        if (dexStoreTestHooks != null) {
            dexStoreTestHooks.onSecondaryDexesUnpackedForRecompilation();
        }
        Mlog.safeFmt("Optimizing temp secondary dexes got result status: %d", Long.valueOf(initialDexOptimizations(context, dexStore, optimizationSession, config, tmpDir, renamer, makeTmpSubDirectory, newSecondaryDexes)));
        renamer.renameOrThrow();
        renamer.reset();
        return newSecondaryDexes;
    }

    private String getOatVersion() {
        StringBuilder sb;
        String str;
        String oatFormatVersion = DalvikInternals.getOatFormatVersion();
        if (oatFormatVersion != null && !oatFormatVersion.isEmpty()) {
            return oatFormatVersion;
        }
        int i = Build.VERSION.SDK_INT;
        if (i != 10000) {
            sb = new StringBuilder();
            str = "unknown api version: VERSION.SDK_INT = ";
        } else {
            sb = new StringBuilder();
            str = "oatmeal should be used on Dalvik. VERSION.SDK_INT = ";
        }
        sb.append(str);
        sb.append(i);
        Mlog.e(sb.toString(), new Object[0]);
        return "039";
    }

    private int getTruncatedSize(DexStore dexStore) {
        return dexStore.readConfig().artTruncatedDexSize;
    }

    public static boolean initialMixedNeeded(long j) {
        if (!optimizationCompleted(j) && mixedNeeded(j)) {
            return true;
        }
        return false;
    }

    public static List makeExpectedFileInfoList(DexManifest.Dex[] dexArr, long j) {
        boolean anyOptimizationDone = anyOptimizationDone(j);
        List makeExpectedFileInfoList = OdexSchemeArtTurbo.makeExpectedFileInfoList(dexArr, null);
        Mlog.safeFmt("makeExpectedFile: are oat around: %s expected files: %s", Boolean.valueOf(anyOptimizationDone), makeExpectedFileInfoList.toString());
        if (anyOptimizationDone) {
            makeExpectedFileInfoList.add(new ExpectedFileInfo(OdexSchemeArtTurbo.OREO_ODEX_DIR));
        }
        Mlog.safeFmt("makeExpectedFile: RETURN expected files: %s", makeExpectedFileInfoList.toString());
        return makeExpectedFileInfoList;
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, long j) {
        return OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j));
    }

    public static File makeTmpSubDirectory(DexStore.TmpDir tmpDir, String str) {
        File file = new File(tmpDir.directory, AnonymousClass001.A0g(str, "-", UUID.randomUUID().toString().replace("-", "")));
        Fs.mkdirOrThrow(file);
        return file;
    }

    public static boolean markCannotTruncateDexesFlag(File file) {
        Mlog.safeFmt("Marking cannot truncate dex files at root: %s", file.getAbsolutePath());
        File makeIgnoreDirtyCheckFile = DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
        if (makeIgnoreDirtyCheckFile.exists()) {
            Mlog.w("Dex truncation file already exists. This is likely an error", new Object[0]);
        }
        try {
            boolean createNewFile = makeIgnoreDirtyCheckFile.createNewFile();
            if (!createNewFile) {
                Mlog.w("Was not successful creating cannot truncate dexes file", new Object[0]);
            }
            return createNewFile;
        } catch (IOException e) {
            Mlog.w(e, "Was not able to create cannot truncate dexes file", new Object[0]);
            return false;
        }
    }

    public static String readProgramOutputFileSafely(RandomAccessFile randomAccessFile) {
        try {
            return Fs.readProgramOutputFile(randomAccessFile);
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean shouldTruncateDexesNow(File file, File file2, long j, int i) {
        if (!needsTruncation(file2, i) || !optimizationCompleted(j)) {
            return false;
        }
        return !getCannotTruncateDexesFlag(file);
    }

    public DexSelector dexSelectorForMultidexCompilationStrategy(File file, final byte b) {
        final AtomicInteger atomicInteger = new AtomicInteger(Integer.MAX_VALUE);
        final HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String trim = readLine.trim();
                    ManifestEntry fromCSV = ManifestEntry.fromCSV(trim);
                    if (fromCSV == null) {
                        Mlog.safeFmt(AnonymousClass001.A0R("[opt][mixed_mode] could not parse manifest entry for : ", trim), new Object[0]);
                    } else {
                        Mlog.safeFmt(AnonymousClass001.A0u("[opt][mixed_mode] read manifest entry for ", fromCSV.canary, " : ", trim), new Object[0]);
                        hashMap.put(fromCSV.canary, fromCSV);
                        if (fromCSV.coldstart) {
                            atomicInteger.set(Math.min(atomicInteger.get(), fromCSV.ordinal));
                        }
                    }
                } finally {
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            Mlog.w(e, "[opt][mixed_mode] problem reading manifest file", new Object[0]);
        }
        return new DexSelector() { // from class: com.facebook.common.dextricks.OdexSchemeArtXdex.2
            @Override // com.facebook.common.dextricks.OdexSchemeArtXdex.DexSelector
            public boolean select(DexManifest.Dex dex) {
                Object[] objArr;
                String str;
                ManifestEntry manifestEntry = (ManifestEntry) hashMap.get(dex.canaryClass);
                boolean z = false;
                if (manifestEntry == null) {
                    objArr = new Object[]{dex.canaryClass};
                    str = "[opt][mixed_mode] could not find manifest entry for canary class %s";
                } else {
                    byte b2 = b;
                    if (b2 != 1) {
                        z = manifestEntry.coldstart;
                        if (b2 != 2) {
                            if (!z || manifestEntry.ordinal != atomicInteger.get()) {
                                z = false;
                            }
                        }
                        objArr = new Object[]{dex.canaryClass, Integer.valueOf(manifestEntry.ordinal), Boolean.valueOf(manifestEntry.coldstart), Byte.valueOf(b), Boolean.valueOf(z)};
                        str = "[opt][mixed_mode] considering canary class=%s ordinal=%d coldstart=%s using strategy=%d => selected=%s";
                    }
                    z = true;
                    objArr = new Object[]{dex.canaryClass, Integer.valueOf(manifestEntry.ordinal), Boolean.valueOf(manifestEntry.coldstart), Byte.valueOf(b), Boolean.valueOf(z)};
                    str = "[opt][mixed_mode] considering canary class=%s ordinal=%d coldstart=%s using strategy=%d => selected=%s";
                }
                Mlog.w(str, objArr);
                return z;
            }
        };
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public boolean loadNotOptimized(long j) {
        return !anyOptimizationDone(j);
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        boolean optimizationCompleted = optimizationCompleted(j);
        Mlog.safeFmt("NeedOptimization: opt complete: %s last scheme: %s pgo: %s opt history: %s", Boolean.valueOf(optimizationCompleted), Boolean.valueOf(optimizationCompleted(optimizationHistoryLog.schemeStatus)), Boolean.valueOf(config.tryPeriodicPgoCompilation), optimizationHistoryLog);
        if (config.tryPeriodicPgoCompilation && optimizationHistoryLog.lastCompilationSessionWasASuccess()) {
            if (!optimizationCompleted(optimizationHistoryLog.schemeStatus)) {
                return OdexScheme.NeedOptimizationState.NEED_OPTIMIZATION;
            }
            long timeDeltaFromLastCompilationSessionMs = optimizationHistoryLog.timeDeltaFromLastCompilationSessionMs();
            Mlog.safeFmt("NeedOptimization: timeDelta %d ms min interval: %d ms", Long.valueOf(timeDeltaFromLastCompilationSessionMs), Long.valueOf(config.minTimeBetweenPgoCompilationMs));
            if (timeDeltaFromLastCompilationSessionMs != DexStore.OptimizationHistoryLog.NO_TIME_DELTA && timeDeltaFromLastCompilationSessionMs >= config.minTimeBetweenPgoCompilationMs) {
                Mlog.safeFmt("NeedOptimization: Time to run additional pgo optimizations", new Object[0]);
                return OdexScheme.NeedOptimizationState.NEED_REOPTIMIZATION;
            }
            return OdexScheme.NeedOptimizationState.NO_OPTIMIZATION_NEEDED;
        }
        return OdexScheme.NeedOptimizationState.shouldOptimize(!optimizationCompleted);
    }

    public static boolean isOatFileStillValid(File file, long j, long j2) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0305, code lost:
    
        if (r8.isEmpty() != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0028, code lost:
    
        if (r6 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r57 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean innerOptimizeDex2Oat(android.content.Context r45, com.facebook.common.dextricks.DexStore r46, com.facebook.common.dextricks.OdexSchemeArtXdex.Renamer r47, com.facebook.common.dextricks.DexStore.OptimizationSession r48, com.facebook.common.dextricks.DexStore.Config r49, com.facebook.common.dextricks.DexStore.TmpDir r50, boolean r51, boolean r52, boolean r53, boolean r54, byte r55, byte r56, boolean r57, java.io.File r58, java.util.List r59) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.innerOptimizeDex2Oat(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.OdexSchemeArtXdex$Renamer, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$Config, com.facebook.common.dextricks.DexStore$TmpDir, boolean, boolean, boolean, boolean, byte, byte, boolean, java.io.File, java.util.List):boolean");
    }

    public static boolean dexAppearsTruncated(DexManifest.Dex dex, File file, int i) {
        String makeDexName = dex.makeDexName();
        File file2 = new File(file, makeDexName);
        if (!file2.exists()) {
            Mlog.w("Dex [asset: %s] %s seems not to exist", dex.assetName, makeDexName);
        }
        return dexAppearsTruncated(file2, i);
    }

    public static List makeMixedModeFileList(DexManifest.Dex[] dexArr, String str, List list) {
        final String convertClassToDotForm = convertClassToDotForm(str);
        return makeMixedModeFileList(dexArr, new DexSelector() { // from class: com.facebook.common.dextricks.OdexSchemeArtXdex.1
            @Override // com.facebook.common.dextricks.OdexSchemeArtXdex.DexSelector
            public boolean select(DexManifest.Dex dex) {
                Mlog.w("[mixed_mode] comparing %s and %s", dex.canaryClass, convertClassToDotForm);
                return dex.canaryClass.equals(convertClassToDotForm);
            }
        }, list);
    }

    private boolean optimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, byte b, byte b2, boolean z5, File file, List list) {
        File file2 = file;
        if (file == null) {
            file2 = dexStore.root;
        }
        CriticalCannotTruncateDexesSection criticalCannotTruncateDexesSection = new CriticalCannotTruncateDexesSection(this, file2, z5);
        try {
            boolean innerOptimizeDex2Oat = innerOptimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, z, z2, z3, z4, b, b2, z5, file2, list);
            criticalCannotTruncateDexesSection.close();
            return innerOptimizeDex2Oat;
        } catch (Throwable th) {
            try {
                criticalCannotTruncateDexesSection.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}
