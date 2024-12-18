package com.facebook.common.dextricks;

import X.AnonymousClass001;
import com.facebook.common.dextricks.SuperpackInputDexIterator;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes.dex */
public class DexIteratorFactory {
    public static final String SECONDARY_XZS_FILENAME = "secondary.dex.jar.xzs";
    public static final String XZS_EXTENSION = ".dex.jar.xzs";
    public final ResProvider mResProvider;

    private SuperpackInputDexIterator openSuperpackDexIterator(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        SuperpackInputDexIterator.Builder builder = new SuperpackInputDexIterator.Builder(dexManifest, lightweightQuickPerformanceLogger);
        String archiveExtension = SuperpackInputDexIterator.getArchiveExtension(builder);
        for (int i = 0; i < dexManifest.superpackFiles; i++) {
            builder.addRawArchive(this.mResProvider.open(AnonymousClass001.A0c("store-", archiveExtension, i)));
        }
        for (int i2 = 0; i2 < dexManifest.dexes.length; i2++) {
            builder.assignDexToArchive(i2, i2 % dexManifest.superpackFiles);
        }
        return builder.build();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:25|26|(6:28|9|10|(2:12|13)|14|15))|9|10|(0)|14|15) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #2 {all -> 0x004b, blocks: (B:12:0x0027, B:14:0x0039), top: B:9:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.common.dextricks.InputDexIterator openDexIterator(java.lang.String r5, com.facebook.common.dextricks.DexManifest r6, com.facebook.quicklog.LightweightQuickPerformanceLogger r7, android.content.Context r8) {
        /*
            r4 = this;
            int r0 = r6.superpackFiles
            if (r0 <= 0) goto L9
            com.facebook.common.dextricks.SuperpackInputDexIterator r1 = r4.openSuperpackDexIterator(r6, r7)
            return r1
        L9:
            r3 = 0
            if (r5 == 0) goto L1c
            java.lang.String r0 = "dex"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L1c
            java.lang.String r0 = ".dex.jar.xzs"
            java.lang.String r2 = r5.concat(r0)     // Catch: java.lang.Throwable -> L52
            goto L1f
        L1c:
            java.lang.String r2 = "secondary.dex.jar.xzs"
        L1f:
            com.facebook.common.dextricks.ResProvider r0 = r4.mResProvider     // Catch: java.io.FileNotFoundException -> L39 java.lang.Throwable -> L52
            java.io.InputStream r3 = r0.open(r2)     // Catch: java.io.FileNotFoundException -> L39 java.lang.Throwable -> L52
            if (r3 == 0) goto L39
            java.lang.String r1 = "using solid xz dex store at %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L4b
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch: java.lang.Throwable -> L4b
            com.facebook.common.dextricks.ResProvider r0 = r4.mResProvider     // Catch: java.lang.Throwable -> L4b
            com.facebook.common.dextricks.SolidXzInputDexIterator r1 = new com.facebook.common.dextricks.SolidXzInputDexIterator     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r6, r7, r0, r3)     // Catch: java.lang.Throwable -> L4b
            return r1
        L39:
            java.lang.String r1 = "using discrete file inputs for store, no file at %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L4b
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch: java.lang.Throwable -> L4b
            com.facebook.common.dextricks.ResProvider r0 = r4.mResProvider     // Catch: java.lang.Throwable -> L4b
            com.facebook.common.dextricks.DiscreteFileInputDexIterator r1 = new com.facebook.common.dextricks.DiscreteFileInputDexIterator     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L4b
            return r1
        L4b:
            r0 = move-exception
            if (r3 == 0) goto L53
            com.facebook.common.dextricks.Fs.safeClose(r3)
            throw r0
        L52:
            r0 = move-exception
        L53:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexIteratorFactory.openDexIterator(java.lang.String, com.facebook.common.dextricks.DexManifest, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.InputDexIterator");
    }

    public DexIteratorFactory(ResProvider resProvider) {
        this.mResProvider = resProvider;
    }
}
