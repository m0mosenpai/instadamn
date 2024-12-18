package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C03600Hy;
import X.C0JW;
import X.C0JX;
import X.C0fY;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.storer.Storer;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class OdexSchemeOreo extends OdexScheme {
    public static final Set sForceUnpackSet = new HashSet();
    public static final Map sOurAddedDexElements = new HashMap();
    public static C0JX sRegisteredClassLoaderCallback;
    public Context mContext;
    public HashMap mDexNameMap;
    public int mNumDexes;
    public LightweightQuickPerformanceLogger mQplCollector;
    public long mStorer;
    public IOException[] mSuppressedExceptions;
    public File mZipFile;

    /* loaded from: classes.dex */
    public final class OreoCompiler extends OdexScheme.Compiler {
        public HashMap mDexNameMap;
        public long mStorer;

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            C0fY.A01(32L, "OdexSchemeOreo.compile", 180903662);
            try {
                String str = (String) this.mDexNameMap.get(inputDex.dex.hash);
                if (str != null) {
                    Storer.start(this.mStorer, str, 4);
                    long j = this.mStorer;
                    InputStream dexContents = inputDex.getDexContents();
                    byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                    while (true) {
                        int read = dexContents.read(bArr);
                        if (read >= 0) {
                            Storer.write(j, bArr, read);
                        } else {
                            Storer.finish(this.mStorer);
                            C0fY.A00(32L, 54074668);
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException("Unexpected input dex!");
                }
            } catch (Throwable th) {
                C0fY.A00(32L, -2078960940);
                throw th;
            }
        }

        public OreoCompiler(long j, HashMap hashMap) {
            this.mStorer = j;
            this.mDexNameMap = hashMap;
        }
    }

    public OdexSchemeOreo(DexManifest.Dex[] dexArr, File file, Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        super(1, new String[]{file.getName()});
        this.mContext = context;
        this.mZipFile = file;
        this.mQplCollector = lightweightQuickPerformanceLogger;
        this.mDexNameMap = makeNameMap(dexArr);
        this.mNumDexes = dexArr.length;
    }

    public static HashMap makeNameMap(DexManifest.Dex[] dexArr) {
        String str;
        int length = dexArr.length;
        HashMap hashMap = new HashMap(length);
        for (int i = 0; i < length; i++) {
            String str2 = dexArr[i].hash;
            if (i != 0) {
                str = AnonymousClass001.A0c("classes", DexManifest.DEX_EXT, i + 1);
            } else {
                str = "classes.dex";
            }
            hashMap.put(str2, str);
        }
        return hashMap;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeOreo";
    }

    public void serializeDex2ChecksumMap(File file) {
        Object[] objArr;
        String str;
        HashMap hashMap;
        try {
            ZipFile zipFile = new ZipFile(this.mZipFile);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            hashMap = new HashMap();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (nextElement != null) {
                    hashMap.put(nextElement.getName(), Integer.valueOf((int) nextElement.getCrc()));
                }
            }
            zipFile.close();
        } catch (ZipException e) {
            objArr = new Object[]{e};
            str = "Megazip file cannot be opened as a ZipFile, exception %s";
        } catch (IOException e2) {
            objArr = new Object[]{e2};
            str = "Megazip file io failed in serializeDex2ChecksumMap %s";
        }
        if (!hashMap.isEmpty()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file.getParentFile(), AnonymousClass001.A0R(this.mZipFile.getName(), ".checksum")));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(hashMap);
                objectOutputStream.close();
                fileOutputStream.close();
                return;
            } catch (IOException unused) {
                Mlog.w("fail to write checksum file ", new Object[0]);
                return;
            }
        }
        objArr = new Object[0];
        str = "dexname2ChecksumMap has nothing";
        Mlog.w(str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0JX, java.lang.Object] */
    public static void enableTracingIfNeeded() {
        C0JW A00;
        if (ClassTracingLogger.A00 && (A00 = C0JW.A00()) != 0 && sRegisteredClassLoaderCallback == null) {
            ?? obj = new Object();
            sRegisteredClassLoaderCallback = obj;
            A00.A01(obj);
        }
    }

    private File getProfileFileAndInfo(boolean z) {
        File parentFile = this.mZipFile.getParentFile();
        if (parentFile != null) {
            File profileFile = getProfileFile(parentFile);
            if (profileFile != null && z && C03600Hy.A06) {
                serializeDex2ChecksumMap(profileFile);
            }
            return profileFile;
        }
        return null;
    }

    public static boolean isUnpackRequested(String str) {
        Set set = sForceUnpackSet;
        if (set.contains(str)) {
            set.remove(str);
            return true;
        }
        return false;
    }

    private void registerCodeAndProfileBgDexopt() {
        if (Build.VERSION.SDK_INT == 29) {
            registerCodeAndProfileBgDexoptWithPrimary();
            return;
        }
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        boolean isXiaomiDevice = isXiaomiDevice();
        if (isXiaomiDevice) {
            Achilles.simulateReportClassLoaderChainR(baseDexClassLoader, this.mContext.getPackageName(), VMRuntime.getRuntime().vmInstructionSet(), this.mContext.getPackageManager(), isXiaomiDevice);
        } else {
            Achilles.reportClassLoaderChain(baseDexClassLoader);
        }
    }

    private void registerCodeAndProfileBgDexoptWithPrimary() {
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        File file = new File(getMainDexStoreLocation(), buildPrimaryDexDecoyFilename());
        if (!file.exists()) {
            try {
                createDecoy(file, this.mContext.getApplicationInfo().publicSourceDir);
            } catch (IOException e) {
                Mlog.w(e, "Unable to unpack decoy, continuing without!!!!", new Object[0]);
            }
        }
        String A0g = AnonymousClass001.A0g(file.getAbsolutePath(), File.pathSeparator, this.mZipFile.getAbsolutePath());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseDexClassLoader);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(A0g);
        Achilles.simulateReportClassLoaderChainQ(new String[]{this.mZipFile.getAbsolutePath()}, baseDexClassLoader, arrayList, arrayList2, this.mContext.getPackageName(), VMRuntime.getRuntime().vmInstructionSet(), this.mContext.getPackageManager(), isXiaomiDevice());
    }

    public static Object[] removeFromOldElements(Class cls, Object[] objArr, Object obj) {
        int length;
        if (obj != null && objArr != null && (length = objArr.length) != 0) {
            int i = 0;
            for (Object obj2 : objArr) {
                if (obj == obj2) {
                    Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) cls, length - 1);
                    int i2 = 0;
                    do {
                        Object obj3 = objArr[i];
                        if (obj != obj3) {
                            objArr2[i2] = obj3;
                            i2++;
                        }
                        i++;
                    } while (i < length);
                    return objArr2;
                }
            }
        }
        return objArr;
    }

    public static void requestUnpack(String str) {
        sForceUnpackSet.add(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setupErrorReportingFields() {
        /*
            X.0PX r3 = X.AbstractC04290Kv.A00
            if (r3 == 0) goto L32
            X.0hu r1 = X.C0LK.A7Z
            com.facebook.common.dextricks.OdexSchemeOreo$1 r0 = new com.facebook.common.dextricks.OdexSchemeOreo$1
            r0.<init>()
            r3.A02(r1, r0)
            X.0JW r2 = X.C0JW.A07
            if (r2 == 0) goto L1d
            r1 = r2
            monitor-enter(r1)
            boolean r0 = r2.A06     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L1a:
            monitor-exit(r1)
            if (r0 != 0) goto L23
        L1d:
            java.lang.Class<com.facebook.common.dextricks.OdexSchemeOreo> r0 = com.facebook.common.dextricks.OdexSchemeOreo.class
            java.lang.ClassLoader r2 = r0.getClassLoader()
        L23:
            X.0hu r1 = X.C0LK.A8c
            if (r2 != 0) goto L2d
            java.lang.String r0 = ""
        L29:
            r3.A01(r1, r0)
            return
        L2d:
            java.lang.String r0 = r2.toString()
            goto L29
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.setupErrorReportingFields():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static IOException[] threadSafeAddDexPath(BaseDexClassLoader baseDexClassLoader, File file) {
        int length;
        int length2;
        int length3;
        if (Build.VERSION.SDK_INT >= 33) {
            file.setWritable(false);
        }
        Class<?> cls = Class.forName("dalvik.system.DexPathList");
        Class<?> cls2 = Class.forName("dalvik.system.DexPathList$Element");
        Method declaredMethod = cls.getDeclaredMethod("makeDexElements", List.class, File.class, List.class, ClassLoader.class);
        declaredMethod.setAccessible(true);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(file);
        Object[] objArr = (Object[]) declaredMethod.invoke(null, arrayList2, null, arrayList, baseDexClassLoader);
        if (objArr != null && (length = objArr.length) == 1) {
            Object recordAddedDexElement = recordAddedDexElement(file, objArr[0]);
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseDexClassLoader);
            Field declaredField2 = cls.getDeclaredField("dexElements");
            declaredField2.setAccessible(true);
            Object[] objArr2 = (Object[]) declaredField2.get(obj);
            if (objArr2 != null && ((objArr2.length <= 0 || (objArr2 = removeFromOldElements(cls2, objArr2, recordAddedDexElement)) != null) && (length3 = objArr2.length) > 0)) {
                Object newInstance = Array.newInstance(cls2, length3 + 1);
                System.arraycopy(objArr2, 0, newInstance, 0, length3);
                System.arraycopy(objArr, 0, newInstance, length3, length);
                objArr = newInstance;
            }
            declaredField2.set(obj, objArr);
            Field declaredField3 = cls.getDeclaredField("dexElementsSuppressedExceptions");
            declaredField3.setAccessible(true);
            int size = arrayList.size();
            if (size > 0) {
                IOException[] iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[size]);
                IOException[] iOExceptionArr2 = (IOException[]) declaredField3.get(obj);
                if (iOExceptionArr2 != null && (length2 = iOExceptionArr2.length) > 0) {
                    IOException[] iOExceptionArr3 = new IOException[length2 + size];
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, 0, length2);
                    System.arraycopy(iOExceptionArr, 0, iOExceptionArr3, length2, size);
                    iOExceptionArr = iOExceptionArr3;
                }
                declaredField3.set(obj, iOExceptionArr);
                return iOExceptionArr;
            }
            return (IOException[]) declaredField3.get(obj);
        }
        throw new IllegalStateException("got null or too large array");
    }

    public void finalizeZip() {
        long j = this.mStorer;
        if (j != 0) {
            Storer.cleanup(j);
            this.mStorer = 0L;
        }
    }

    public File getMainDexStoreLocation() {
        try {
            return DexStoreUtils.getMainDexStoreLocation(this.mContext);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public File getProfileFile(File file) {
        File file2 = new File(file, OdexSchemeArtTurbo.OREO_ODEX_DIR);
        if (!file2.exists() && !file2.mkdir()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to mkdir for prof dir: ");
            sb.append(file2);
            DexTricksErrorReporter.reportSampledSoftError("RegisterProf", sb.toString(), null);
            return null;
        }
        File file3 = new File(file2, AnonymousClass001.A0R(this.mZipFile.getName(), ".cur.prof"));
        try {
            if (file3.createNewFile()) {
                Mlog.w("Created new profile file: %s", file3);
            }
            return file3;
        } catch (IOException e) {
            DexTricksErrorReporter.reportSampledSoftError("RegisterProf", "Failed to touch new profile file", e);
            return null;
        }
    }

    public IOException[] getSuppressedExceptions() {
        return this.mSuppressedExceptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[Catch: ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x006d, IllegalAccessException -> 0x006f, InvocationTargetException -> 0x0071, NoSuchMethodException -> 0x0073, NoSuchFieldException -> 0x0075, ClassNotFoundException -> 0x0077, all -> 0x0087, TryCatch #4 {all -> 0x0087, blocks: (B:8:0x001c, B:10:0x0023, B:11:0x0026, B:16:0x0043, B:18:0x0047, B:20:0x004c, B:29:0x0060, B:31:0x0064, B:33:0x0069, B:34:0x006c, B:47:0x0078), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x006d, IllegalAccessException -> 0x006f, InvocationTargetException -> 0x0071, NoSuchMethodException -> 0x0073, NoSuchFieldException -> 0x0075, ClassNotFoundException -> 0x0077, all -> 0x0087, TryCatch #4 {all -> 0x0087, blocks: (B:8:0x001c, B:10:0x0023, B:11:0x0026, B:16:0x0043, B:18:0x0047, B:20:0x004c, B:29:0x0060, B:31:0x0064, B:33:0x0069, B:34:0x006c, B:47:0x0078), top: B:7:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initializeClassLoader() {
        /*
            r11 = this;
            java.lang.String r5 = "Failed to unblock dex2oat"
            java.lang.Class<com.facebook.common.dextricks.OdexSchemeOreo> r0 = com.facebook.common.dextricks.OdexSchemeOreo.class
            java.lang.ClassLoader r10 = r0.getClassLoader()
            boolean r0 = r10 instanceof dalvik.system.BaseDexClassLoader
            java.lang.String r4 = "FBDex101"
            r3 = 0
            if (r0 == 0) goto L92
            r0 = 1
            boolean r0 = com.facebook.common.dextricks.DalvikInternals.toggleBlockDex2Oat(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "Failed to block dex2oat"
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r4, r0, r3)
        L1b:
            r9 = 0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r11.mQplCollector     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
            r8 = 8914508(0x88064c, float:1.2491886E-38)
            if (r0 == 0) goto L26
            r0.markerStart(r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
        L26:
            boolean r7 = r11.isXiaomiDevice()     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
            r6 = 2
            if (r7 == 0) goto L38
            java.lang.Object r2 = com.facebook.common.dextricks.Achilles.getDexLoadReporter()     // Catch: java.lang.Throwable -> L35
            com.facebook.common.dextricks.Achilles.setDexLoadReporter(r3)     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r1 = move-exception
            r2 = r3
            goto L60
        L38:
            r2 = r3
        L39:
            dalvik.system.BaseDexClassLoader r10 = (dalvik.system.BaseDexClassLoader) r10     // Catch: java.lang.Throwable -> L5f
            java.io.File r0 = r11.mZipFile     // Catch: java.lang.Throwable -> L5f
            java.io.IOException[] r0 = threadSafeAddDexPath(r10, r0)     // Catch: java.lang.Throwable -> L5f
            r11.mSuppressedExceptions = r0     // Catch: java.lang.Throwable -> L5f
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r11.mQplCollector     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
            if (r0 == 0) goto L4a
            r0.markerEnd(r8, r6)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
        L4a:
            if (r7 == 0) goto L4f
            com.facebook.common.dextricks.Achilles.setDexLoadReporter(r2)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
        L4f:
            boolean r0 = com.facebook.common.dextricks.DalvikInternals.toggleBlockDex2Oat(r9)
            if (r0 != 0) goto L58
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r4, r5, r3)
        L58:
            enableTracingIfNeeded()
            setupErrorReportingFields()
            return
        L5f:
            r1 = move-exception
        L60:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r11.mQplCollector     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
            if (r0 == 0) goto L67
            r0.markerEnd(r8, r6)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
        L67:
            if (r7 == 0) goto L6c
            com.facebook.common.dextricks.Achilles.setDexLoadReporter(r2)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
        L6c:
            throw r1     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalAccessException -> L6f java.lang.reflect.InvocationTargetException -> L71 java.lang.NoSuchMethodException -> L73 java.lang.NoSuchFieldException -> L75 java.lang.ClassNotFoundException -> L77 java.lang.Throwable -> L87
        L6d:
            r2 = move-exception
            goto L78
        L6f:
            r2 = move-exception
            goto L78
        L71:
            r2 = move-exception
            goto L78
        L73:
            r2 = move-exception
            goto L78
        L75:
            r2 = move-exception
            goto L78
        L77:
            r2 = move-exception
        L78:
            java.lang.String r0 = "Failed to merge dex elements"
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r4, r0, r2)     // Catch: java.lang.Throwable -> L87
            boolean r0 = com.facebook.common.dextricks.DalvikInternals.toggleBlockDex2Oat(r9)
            if (r0 != 0) goto La4
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r4, r5, r3)
            goto La4
        L87:
            r1 = move-exception
            boolean r0 = com.facebook.common.dextricks.DalvikInternals.toggleBlockDex2Oat(r9)
            if (r0 != 0) goto Lab
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r4, r5, r3)
            throw r1
        L92:
            java.lang.String r1 = "Unknown Application ClassLoader: "
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            com.facebook.common.dextricks.DexTricksErrorReporter.reportSampledSoftError(r4, r0, r3)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
        La4:
            java.lang.String r0 = "[FBDex101] Unknown Application ClassLoader or failed to merge dex, app bound to crash with NoClassDef"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r2)
        Lab:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeOreo.initializeClassLoader():void");
    }

    public boolean isXiaomiDevice() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i <= 30) {
            return Achilles.existsNotifyDexLoadWithStatus();
        }
        return false;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        long open = Storer.open(this.mZipFile.getPath(), 420);
        this.mStorer = open;
        return new OreoCompiler(open, this.mDexNameMap);
    }

    public int markLoadResult(int i, boolean z) {
        int i2 = i | 8;
        if (OreoFileUtils.hasVdexOdex(this.mZipFile)) {
            i2 = i | 512 | Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        }
        File file = this.mZipFile;
        if (z) {
            if (OreoFileUtils.getOdex(file).length() < 4194304) {
                return i2;
            }
        } else if (!OreoFileUtils.getReferenceProfile(file).exists()) {
            return i2;
        }
        return i2 | Constants.LOAD_RESULT_PGO;
    }

    public boolean needsUnpack() {
        if (isUnpackRequested(this.mZipFile.getAbsolutePath()) || !this.mZipFile.exists()) {
            return true;
        }
        if (!OreoFileUtils.isTruncated(this.mZipFile)) {
            return false;
        }
        return !OreoFileUtils.hasVdexOdex(this.mZipFile);
    }

    public void requestDexUnpack() {
        requestUnpack(this.mZipFile.getAbsolutePath());
    }

    private String buildPrimaryDexDecoyFilename() {
        return AnonymousClass001.A0g("p-", getPrimaryDexIdentifierString(this.mContext), ".zip");
    }

    public static void createDecoy(File file, String str) {
        long open = Storer.open(file.getPath(), 420);
        Storer.start(open, "classes.dex", 4);
        ZipFile zipFile = new ZipFile(str);
        try {
            InputStream inputStream = zipFile.getInputStream(new ZipEntry("classes.dex"));
            try {
                byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        Storer.write(open, bArr, read);
                    } else {
                        inputStream.close();
                        zipFile.close();
                        Storer.finish(open);
                        Storer.cleanup(open);
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                zipFile.close();
                throw th;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
            }
        }
    }

    private Object disableReporter() {
        Object dexLoadReporter = Achilles.getDexLoadReporter();
        Achilles.setDexLoadReporter(null);
        return dexLoadReporter;
    }

    public static String getPrimaryDexIdentifierString(Context context) {
        return String.valueOf(DexStore.getApkIdentifier(new File(context.getApplicationInfo().publicSourceDir), false));
    }

    public static Object recordAddedDexElement(File file, Object obj) {
        return sOurAddedDexElements.put(file.getAbsolutePath(), obj);
    }

    public void addEmptyDex(Context context) {
        AssetManager assets = context.getAssets();
        String A0c = AnonymousClass001.A0c("classes", DexManifest.DEX_EXT, this.mNumDexes + 1);
        InputStream open = assets.open("secondary-program-dex-jars/empty.dex");
        try {
            Storer.start_unaligned(this.mStorer, A0c, 4);
            long j = this.mStorer;
            byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
            while (true) {
                int read = open.read(bArr);
                if (read >= 0) {
                    Storer.write(j, bArr, read);
                } else {
                    Storer.finish(this.mStorer);
                    open.close();
                    return;
                }
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void registerCodeAndProfile(boolean z, boolean z2) {
        File profileFileAndInfo = getProfileFileAndInfo(z2);
        if (z) {
            registerCodeAndProfileBgDexopt();
            return;
        }
        if (profileFileAndInfo == null) {
            return;
        }
        String path = profileFileAndInfo.getPath();
        String[] strArr = {this.mZipFile.getPath()};
        try {
            Method declaredMethod = VMRuntime.class.getDeclaredMethod("registerAppInfo", String.class, String[].class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, path, strArr);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            Achilles.registerAppInfo(path, strArr);
        }
    }

    private void enableReporter(Object obj) {
        Achilles.setDexLoadReporter(obj);
    }
}
