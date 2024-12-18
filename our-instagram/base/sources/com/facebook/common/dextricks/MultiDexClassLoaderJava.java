package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.profilo.logger.api.ProfiloClassLoadTracer;
import com.facebook.profilo.logger.api.ProfiloLogger;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class MultiDexClassLoaderJava extends MultiDexClassLoader {
    public static final byte API_FALLBACK = 3;
    public static final byte API_NEW_WORKS = 1;
    public static final byte API_OLD_WORKS = 2;
    public static final byte API_UNTESTED = 0;
    public static byte sApiDetectionState;
    public static String sEncodedLongtailUnrenamedTypes;
    public final DexFile[] mAuxiliaryDexes;
    public final ClassLoadingStats mClassLoadingStats;
    public int mDexLoadFailurePosition;
    public final DexFile[] mPrimaryDexes;
    public LoadApi loadApi = new LoadApi();
    public Pair[] mDexFiles = new Pair[0];
    public final AtomicInteger mLastLoadedDexIndex = new AtomicInteger(1);
    public final String[] mDexLoadFailureHistory = new String[4];

    /* loaded from: classes.dex */
    public class LoadApi {
        public Class loadInnerNewApiClass(String str, Pair[] pairArr, int i) {
            Class cls = null;
            int i2 = 1;
            try {
                MultiDexClassLoaderJava multiDexClassLoaderJava = MultiDexClassLoaderJava.this;
                ClassLoader classLoader = multiDexClassLoaderJava.mPutativeLoader;
                Pair pair = pairArr[0];
                if (pair != null) {
                    if (!((Boolean) pair.second).booleanValue() || MultiDexClassLoaderJava.mayBeRedexRenamedOrStoreCanary(str)) {
                        DexFile dexFile = (DexFile) pair.first;
                        cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, classLoader);
                        MultiDexClassLoaderJava.this.observeDexFileLoad(dexFile, cls);
                    }
                } else {
                    multiDexClassLoaderJava.onNoDexInThePromotedFrontDexSpot();
                }
                int min = Math.min(i, pairArr.length);
                int i3 = 1;
                while (cls == null && i3 < min) {
                    try {
                        Pair pair2 = pairArr[i3];
                        if (!((Boolean) pair2.second).booleanValue() || MultiDexClassLoaderJava.mayBeRedexRenamedOrStoreCanary(str)) {
                            DexFile dexFile2 = (DexFile) pair2.first;
                            cls = DexFileLoadNew.loadClassBinaryName(dexFile2, str, classLoader);
                            if (cls != null && i3 > 1) {
                                MultiDexClassLoaderJava.this.promoteDexFile(dexFile2, i3);
                            }
                            MultiDexClassLoaderJava.this.observeDexFileLoad(dexFile2, cls);
                        }
                        i3++;
                    } catch (Throwable th) {
                        th = th;
                        i2 = i3;
                        MultiDexClassLoaderJava multiDexClassLoaderJava2 = MultiDexClassLoaderJava.this;
                        int i4 = MultiDexClassLoader.BASE_DEX_RETRY_WAIT_MS;
                        multiDexClassLoaderJava2.mClassLoadingStats.incrementDexFileQueries(i2);
                        throw th;
                    }
                }
                MultiDexClassLoaderJava.this.mClassLoadingStats.incrementDexFileQueries(i3);
                return cls;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public LoadApi() {
        }
    }

    /* loaded from: classes.dex */
    public class LoadApiExperiment extends LoadApi {
        @Override // com.facebook.common.dextricks.MultiDexClassLoaderJava.LoadApi
        public Class loadInnerNewApiClass(String str, Pair[] pairArr, int i) {
            int i2 = pairArr[0] == null ? 1 : 0;
            Class cls = null;
            try {
                int min = Math.min(i, pairArr.length);
                while (cls == null && i2 < min) {
                    Pair pair = pairArr[i2];
                    if (!((Boolean) pair.second).booleanValue() || MultiDexClassLoaderJava.mayBeRedexRenamedOrStoreCanary(str)) {
                        DexFile dexFile = (DexFile) pair.first;
                        cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, MultiDexClassLoaderJava.this.mPutativeLoader);
                        MultiDexClassLoaderJava.this.observeDexFileLoad(dexFile, cls);
                    }
                    i2++;
                }
                return cls;
            } finally {
                MultiDexClassLoaderJava multiDexClassLoaderJava = MultiDexClassLoaderJava.this;
                int i3 = MultiDexClassLoader.BASE_DEX_RETRY_WAIT_MS;
                multiDexClassLoaderJava.mClassLoadingStats.incrementDexFileQueries(i2);
            }
        }

        public LoadApiExperiment() {
            super();
        }
    }

    public static int getDexLength(Pair[] pairArr) {
        return (pairArr.length - 1) / 2;
    }

    public static int getFirstIndexOfFixedDexes(Pair[] pairArr) {
        return (pairArr.length + 1) / 2;
    }

    public static int getFixedDexIndex(int i, int i2) {
        return i2 + i + 1;
    }

    private Class loadInnerFallbackApiClass(String str, Pair[] pairArr, int i) {
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            Pair pair = pairArr[0];
            if (pair != null) {
                DexFile dexFile = (DexFile) pair.first;
                cls = dexFile.loadClass(str, classLoader);
                observeDexFileLoad(dexFile, cls);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    DexFile dexFile2 = (DexFile) pairArr[i3].first;
                    cls = dexFile2.loadClass(str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    observeDexFileLoad(dexFile2, cls);
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private Class loadInnerOldApiClass(String str, Pair[] pairArr, int i) {
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            Pair pair = pairArr[0];
            if (pair != null) {
                DexFile dexFile = (DexFile) pair.first;
                cls = DexFileLoadOld.loadClassBinaryName(dexFile, str, classLoader);
                observeDexFileLoad(dexFile, cls);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    DexFile dexFile2 = (DexFile) pairArr[i3].first;
                    cls = DexFileLoadOld.loadClassBinaryName(dexFile2, str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    observeDexFileLoad(dexFile2, cls);
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String toString() {
        return "MultiDexClassLoaderJava";
    }

    private boolean canPromoteDexesAndUpdateState(int i, int i2) {
        int i3;
        if (i2 <= i) {
            return false;
        }
        do {
            i3 = this.mLastLoadedDexIndex.get();
            if (i3 >= i) {
                return true;
            }
        } while (!this.mLastLoadedDexIndex.compareAndSet(i3, i));
        return true;
    }

    public static boolean classInLongtailModule(String str) {
        return NameClassifier.A01(sEncodedLongtailUnrenamedTypes, str);
    }

    private ClassNotFoundException createCNFE(String str) {
        return new ClassNotFoundException(str);
    }

    private Class findClassSlowPath(String str) {
        Pair[] pairArr = this.mDexFiles;
        int length = pairArr.length;
        Class cls = null;
        if (length != 0) {
            ClassLoader classLoader = this.mPutativeLoader;
            int i = 1;
            try {
                try {
                    Pair pair = pairArr[0];
                    if (pair != null) {
                        cls = DexFileLoadNew.loadClassBinaryName((DexFile) pair.first, str, classLoader);
                    } else {
                        onNoDexInThePromotedFrontDexSpot();
                    }
                    int i2 = 1;
                    while (cls == null && i2 < length) {
                        cls = DexFileLoadNew.loadClassBinaryName((DexFile) pairArr[i2].first, str, classLoader);
                        i2++;
                    }
                    if (length > 1) {
                        sApiDetectionState = (byte) 1;
                    }
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    return cls;
                } catch (NoSuchMethodError unused) {
                    sApiDetectionState = (byte) 3;
                    Pair pair2 = pairArr[0];
                    if (pair2 != null) {
                        cls = ((DexFile) pair2.first).loadClass(str, classLoader);
                    } else {
                        onNoDexInThePromotedFrontDexSpot();
                    }
                    while (cls == null && i < length) {
                        cls = ((DexFile) pairArr[i].first).loadClass(str, classLoader);
                        i++;
                    }
                    this.mClassLoadingStats.incrementDexFileQueries(i);
                }
            } catch (NoSuchMethodError unused2) {
                Pair pair3 = pairArr[0];
                if (pair3 != null) {
                    cls = DexFileLoadOld.loadClassBinaryName((DexFile) pair3.first, str, classLoader);
                } else {
                    onNoDexInThePromotedFrontDexSpot();
                }
                int i3 = 1;
                while (cls == null && i3 < length) {
                    cls = DexFileLoadOld.loadClassBinaryName((DexFile) pairArr[i3].first, str, classLoader);
                    i3++;
                }
                sApiDetectionState = (byte) 2;
                this.mClassLoadingStats.incrementDexFileQueries(i3);
                return cls;
            }
        }
        return cls;
    }

    private Class loadInnerNewApiClass(String str, Pair[] pairArr, int i) {
        return this.loadApi.loadInnerNewApiClass(str, pairArr, i);
    }

    public static boolean mayBeRedexRenamedOrStoreCanary(String str) {
        String str2 = sEncodedLongtailUnrenamedTypes;
        int length = str.length();
        if (length <= 6) {
            if (length > 2 && str.charAt(0) == 'X' && str.charAt(1) == '.') {
                return true;
            }
        } else if (length == 22 && str.charAt(0) == 's' && str.charAt(1) == 't' && str.charAt(9) == '.' && str.charAt(10) == 'd' && str.charAt(15) == '.' && str.charAt(16) == 'C' && str.charAt(21) == 'y') {
            return true;
        }
        return NameClassifier.A01(str2, str);
    }

    private void noteClassLoadFailure(String str) {
        String[] strArr = this.mDexLoadFailureHistory;
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            this.mDexLoadFailurePosition = i + 1;
            strArr[i % strArr.length] = str;
        }
    }

    private boolean oldShouldAskBootClassLoader(String str) {
        return !str.startsWith("com.facebook.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNoDexInThePromotedFrontDexSpot() {
        this.mClassLoadingStats.decrementDexFileQueries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void promoteDexFile(DexFile dexFile, int i) {
        Pair[] pairArr = this.mDexFiles;
        if (canPromoteDexesAndUpdateState(i, (pairArr.length + 1) / 2)) {
            synchronized (pairArr) {
                if (pairArr[1].first != dexFile) {
                    Pair pair = pairArr[i];
                    if (pair.first == dexFile) {
                        pairArr[0] = pair;
                        while (i >= 1) {
                            pairArr[i] = pairArr[i - 1];
                            i--;
                        }
                        pairArr[0] = null;
                    }
                }
            }
        }
    }

    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public void configure(ClassLoaderConfiguration classLoaderConfiguration) {
        this.mConfig = classLoaderConfiguration;
        int length = this.mPrimaryDexes.length;
        int size = classLoaderConfiguration.mDexFiles.size();
        int length2 = this.mAuxiliaryDexes.length;
        int i = length + size + length2;
        Pair[] pairArr = new Pair[(i * 2) + 1];
        int i2 = 0;
        pairArr[0] = null;
        int i3 = 0;
        int i4 = 1;
        while (i3 < length) {
            Pair create = Pair.create(this.mPrimaryDexes[i3], Boolean.FALSE);
            pairArr[i4] = create;
            pairArr[i4 + i] = create;
            i3++;
            i4++;
        }
        int i5 = 0;
        while (i5 < size) {
            Pair createPair = createPair((DexFile) classLoaderConfiguration.mDexFiles.get(i5));
            pairArr[i4] = createPair;
            pairArr[i4 + i] = createPair;
            i5++;
            i4++;
        }
        while (i2 < length2) {
            Pair createPair2 = createPair(this.mAuxiliaryDexes[i2]);
            pairArr[i4] = createPair2;
            pairArr[i4 + i] = createPair2;
            i2++;
            i4++;
        }
        this.mDexFiles = pairArr;
        configureArtHacks(classLoaderConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public DexFile[] doGetConfiguredDexFiles() {
        Pair[] pairArr = this.mDexFiles;
        int length = (pairArr.length - 1) / 2;
        DexFile[] dexFileArr = new DexFile[length];
        for (int i = 0; i < length; i++) {
            dexFileArr[i] = pairArr[length + i + 1].first;
        }
        return dexFileArr;
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) {
        Pair[] pairArr = this.mDexFiles;
        int length = pairArr.length;
        if (length != 0) {
            ProfiloClassLoadTracer profiloClassLoadTracer = ProfiloClassLoadTracer.sTracer;
            if (profiloClassLoadTracer != null) {
                ProfiloLogger.classLoadStart();
            }
            ClassTracingLogger.beginClassLoad(str);
            this.mClassLoadingStats.incrementClassLoadsAttempted();
            Class cls = null;
            try {
                byte b = sApiDetectionState;
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b == 3 && (cls = loadInnerFallbackApiClass(str, pairArr, this.mLastLoadedDexIndex.get())) == null) {
                                cls = loadInnerFallbackApiClass(str, pairArr, length);
                            }
                        } else {
                            cls = loadInnerOldApiClass(str, pairArr, this.mLastLoadedDexIndex.get());
                            if (cls == null) {
                                cls = loadInnerOldApiClass(str, pairArr, length);
                            }
                        }
                    } else {
                        cls = loadInnerNewApiClass(str, pairArr, this.mLastLoadedDexIndex.get());
                        if (cls == null) {
                            cls = loadInnerNewApiClass(str, pairArr, length);
                        }
                    }
                } else {
                    cls = findClassSlowPath(str);
                }
                if (cls != null) {
                    ClassTracingLogger.classLoaded(cls);
                    boolean z = ClassCoverageLogger.A02;
                    String name = cls.getName();
                    if (!ClassCoverageLogger.A01.isEmpty() && name.startsWith(ClassCoverageLogger.A01)) {
                        throw new UnsupportedOperationException(AnonymousClass001.A0R("Class load disallowed: ", name));
                    }
                    if (ClassCoverageLogger.A02) {
                        ClassCoverageLogger.A00.add(name);
                    }
                    if (profiloClassLoadTracer != null) {
                        ProfiloLogger.classLoadEnd(cls);
                    }
                }
                if (cls != null) {
                    return cls;
                }
            } finally {
                ClassTracingLogger.classNotFound();
                if (profiloClassLoadTracer != null) {
                    ProfiloLogger.classLoadFailed();
                }
                this.mClassLoadingStats.incrementClassLoadsFailed();
            }
        }
        throw new ClassNotFoundException(str);
    }

    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public String[] getRecentFailedClasses() {
        String[] strArr = this.mDexLoadFailureHistory;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            if (i < length) {
                i += length;
            }
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                strArr2[i2] = strArr[(i - i3) % length];
                i2 = i3;
            }
        }
        return strArr2;
    }

    public void setReoderingDisableTest(boolean z) {
        LoadApi loadApi;
        if (z) {
            loadApi = new LoadApiExperiment();
        } else {
            loadApi = new LoadApi();
        }
        this.loadApi = loadApi;
    }

    @Override // com.facebook.common.dextricks.MultiDexClassLoader
    public String verboseDescription() {
        StringBuilder sb = new StringBuilder();
        Pair[] pairArr = this.mDexFiles;
        int length = (pairArr.length - 1) / 2;
        appendLine(sb, AnonymousClass001.A0O("Number of dex files ", length));
        for (int i = 0; i < length; i++) {
            Pair pair = pairArr[length + i + 1];
            String name = ((DexFile) pair.first).getName();
            if (name != null) {
                long length2 = new File(name).length();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append("|renamed_only=");
                sb2.append(pair.second);
                sb2.append("|file_size=");
                sb2.append(length2);
                appendLine(sb, sb2.toString());
                if (name.contains("longtail")) {
                    try {
                        appendLine(sb, AnonymousClass001.A0R("longtail dex sha1: ", DexStoreUtils.sha1ForFile(name)));
                    } catch (IOException | NoSuchAlgorithmException e) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Could not compute sha1 for longtail dex! ");
                        sb3.append(e);
                        appendLine(sb, sb3.toString());
                    }
                    Enumeration<String> entries = ((DexFile) pair.first).entries();
                    int i2 = 0;
                    while (entries.hasMoreElements()) {
                        String nextElement = entries.nextElement();
                        if (i2 <= 50) {
                            appendLine(sb, AnonymousClass001.A0R("longtail entry: ", nextElement));
                        }
                        i2++;
                    }
                    appendLine(sb, AnonymousClass001.A0O("total entries count ", i2));
                    if (i2 >= 50) {
                        appendLine(sb, "more entries truncated.");
                    }
                }
            }
        }
        return sb.toString();
    }

    public MultiDexClassLoaderJava(Context context, ArrayList arrayList, ArrayList arrayList2) {
        this.mPrimaryDexes = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        this.mAuxiliaryDexes = (DexFile[]) arrayList2.toArray(new DexFile[arrayList2.size()]);
        ClassLoadingStats classLoadingStats = new ClassLoadingStats() { // from class: X.0NQ
            public final AtomicInteger A00 = new AtomicInteger();
            public final AtomicInteger A01 = new AtomicInteger();
            public final AtomicInteger A02 = new AtomicInteger();
            public final AtomicInteger A03 = new AtomicInteger();

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final int getLocatorAssistedClassLoads() {
                return 0;
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final void decrementDexFileQueries() {
                this.A02.decrementAndGet();
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final int getClassLoadsAttempted() {
                return this.A00.get();
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final int getClassLoadsFailed() {
                return this.A01.get();
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final int getDexFileQueries() {
                return this.A02.get();
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final int getIncorrectDfaGuesses() {
                return this.A03.get();
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final void incrementClassLoadsAttempted() {
                this.A00.incrementAndGet();
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final void incrementClassLoadsFailed() {
                this.A01.incrementAndGet();
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final void incrementDexFileQueries(int i) {
                this.A02.addAndGet(i);
            }

            @Override // com.facebook.common.dextricks.stats.ClassLoadingStats
            public final void incrementIncorrectDfaGuesses() {
                this.A03.incrementAndGet();
            }
        };
        ClassLoadingStats.A00.getAndSet(classLoadingStats);
        this.mClassLoadingStats = classLoadingStats;
    }

    private void appendLine(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(System.lineSeparator());
    }

    public static boolean containsOnlyRenamedClasses(DexFile dexFile) {
        String obj = dexFile.toString();
        if (obj != null && obj.contains(AnonymousClass001.A0R("modules/", "longtail"))) {
            return true;
        }
        return false;
    }

    public static Pair createPair(DexFile dexFile) {
        return Pair.create(dexFile, Boolean.valueOf(containsOnlyRenamedClasses(dexFile)));
    }

    private Class loadParentBootLoaderClass(String str) {
        if (getParent() != null) {
            try {
                return getParent().loadClass(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean shouldAskParent(String str) {
        return NameClassifier.A00(str);
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        Class loadParentBootLoaderClass;
        boolean z2 = false;
        if (NameClassifier.A00(str)) {
            z2 = true;
            Class loadParentBootLoaderClass2 = loadParentBootLoaderClass(str);
            if (loadParentBootLoaderClass2 != null) {
                return loadParentBootLoaderClass2;
            }
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException e) {
            e = e;
            if (!z2 && (!str.startsWith("com.facebook.")) && (loadParentBootLoaderClass = loadParentBootLoaderClass(str)) != null) {
                this.mClassLoadingStats.incrementIncorrectDfaGuesses();
                Log.w(MultiDexClassLoader.TAG, AnonymousClass001.A0g("Class ", str, " was loaded on fallback. This should be fixed and added to the shouldAskParent method."));
                return loadParentBootLoaderClass;
            }
            try {
                if (MultiDexClassLoader.maybeFallbackLoadDexes(str, e)) {
                    try {
                        return findClass(str);
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        noteClassLoadFailure(str);
                        throw e;
                    }
                }
            } catch (RuntimeException e3) {
                e = new ClassNotFoundException(AnonymousClass001.A0R("Fallback dex load failed for ", str), e3);
            }
            noteClassLoadFailure(str);
            throw e;
        }
    }

    public ClassNotFoundException createCNFE(String str, Throwable th) {
        return new ClassNotFoundException(str, th);
    }
}
