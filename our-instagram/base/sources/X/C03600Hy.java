package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.common.dextricks.DexLibLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* renamed from: X.0Hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03600Hy {
    public static C03600Hy A05;
    public static final boolean A06;
    public static final String[] A07;
    public static final Object A08;
    public final Context A02;
    public final Object A03 = new Object();
    public String A00 = null;
    public boolean A01 = false;
    public volatile boolean A04 = false;

    static {
        String str;
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 30) {
            z = true;
        }
        A06 = z;
        String[] strArr = new String[3];
        A07 = strArr;
        if (z) {
            str = "zyte_v9.prof";
        } else {
            str = "zyte_v7.prof";
        }
        strArr[0] = str;
        strArr[1] = "zyte.prof";
        strArr[2] = "art_pgo_input.txt";
        A08 = new Object();
    }

    public static C03600Hy A00(Context context) {
        C03600Hy c03600Hy;
        C03600Hy c03600Hy2 = A05;
        if (c03600Hy2 == null) {
            synchronized (A08) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                c03600Hy = new C03600Hy(context);
                A05 = c03600Hy;
            }
            return c03600Hy;
        }
        return c03600Hy2;
    }

    public static InputStream A01(Context context, String str, boolean z) {
        String A0g;
        if (str == null) {
            A0g = null;
        } else {
            A0g = AnonymousClass001.A0g(DexLibLoader.ApkResProvider.SECONDARY_PROGRAM_DEX_JARS, File.separator, str);
        }
        InputStream inputStream = null;
        if (A0g == null) {
            return null;
        }
        if (z) {
            A0g = AnonymousClass001.A0R(A0g, ".xz");
        }
        try {
            inputStream = context.getAssets().open(A0g);
            return inputStream;
        } catch (IOException e) {
            String.format("Cannot read %s [check is xz'ed: %s] from from assets. Error: %s", A0g, Boolean.valueOf(z), e.getMessage());
            return inputStream;
        }
    }

    public static String A02(C03600Hy c03600Hy) {
        String obj;
        String replace;
        String str = c03600Hy.A00;
        if (str == null) {
            Context context = c03600Hy.A02;
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            try {
                obj = packageManager.getPackageInfo(packageName, 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                obj = UUID.randomUUID().toString();
                android.util.Log.e("PGOProfileUtil", String.format("Could not find package name %s. Using UUID: %s", packageName, obj), e);
            }
            if (obj == null) {
                replace = null;
            } else {
                replace = obj.replace('.', '_');
            }
            String format = String.format("%s_AV%d_%s%s", "art_pgo_profile", Integer.valueOf(Build.VERSION.SDK_INT), replace, ".prof");
            c03600Hy.A00 = format;
            return format;
        }
        return str;
    }

    public static boolean A03() {
        int i = Build.VERSION.SDK_INT;
        if (i != 29 && i != 28) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x008b, LOOP:1: B:26:0x007a->B:28:0x0080, LOOP_END, TRY_LEAVE, TryCatch #7 {all -> 0x008b, blocks: (B:25:0x0078, B:26:0x007a, B:28:0x0080), top: B:24:0x0078, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[EDGE_INSN: B:29:0x0084->B:30:0x0084 BREAK  A[LOOP:1: B:26:0x007a->B:28:0x0080], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A04(android.content.Context r8, java.io.File r9) {
        /*
            java.lang.String[] r7 = X.C03600Hy.A07
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()     // Catch: java.io.IOException -> La1
            java.lang.String r0 = r0.sourceDir     // Catch: java.io.IOException -> La1
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> La1
            r6.<init>(r0)     // Catch: java.io.IOException -> La1
            r2 = 3
            r5 = 0
            r3 = 0
        L10:
            r4 = 1
            if (r3 >= r2) goto L45
            r1 = r7[r3]     // Catch: java.io.IOException -> La1
            if (r1 == 0) goto L3b
            java.lang.String r0 = ".xz"
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.io.IOException -> La1
            java.util.zip.ZipEntry r0 = r6.getEntry(r0)     // Catch: java.io.IOException -> La1
            if (r0 == 0) goto L2f
            X.0Hx r1 = new X.0Hx     // Catch: java.io.IOException -> La1
            r1.<init>(r0, r4)     // Catch: java.io.IOException -> La1
        L28:
            java.util.zip.ZipEntry r0 = r1.A00     // Catch: java.io.IOException -> La1
            java.io.InputStream r3 = r6.getInputStream(r0)     // Catch: java.io.IOException -> La1
            goto L3e
        L2f:
            java.util.zip.ZipEntry r0 = r6.getEntry(r1)     // Catch: java.io.IOException -> La1
            if (r0 == 0) goto L3b
            X.0Hx r1 = new X.0Hx     // Catch: java.io.IOException -> La1
            r1.<init>(r0, r5)     // Catch: java.io.IOException -> La1
            goto L28
        L3b:
            int r3 = r3 + 1
            goto L10
        L3e:
            boolean r0 = r1.A01     // Catch: java.io.IOException -> L9a
            if (r3 == 0) goto La7
            if (r0 == 0) goto L71
            goto L6b
        L45:
            java.lang.String r0 = java.util.Arrays.toString(r7)     // Catch: java.io.IOException -> La1
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch: java.io.IOException -> La1
            java.lang.String r0 = "Could not find zip profile entries at %s"
            java.lang.String.format(r0, r1)     // Catch: java.io.IOException -> La1
            r1 = 0
        L53:
            r0 = r7[r1]     // Catch: java.io.IOException -> La1
            if (r0 == 0) goto L66
            java.io.InputStream r3 = A01(r8, r0, r4)     // Catch: java.io.IOException -> La1
            if (r3 != 0) goto L6b
            r0 = r7[r1]     // Catch: java.io.IOException -> La1
            java.io.InputStream r3 = A01(r8, r0, r5)     // Catch: java.io.IOException -> La1
            if (r3 == 0) goto L66
            goto L71
        L66:
            int r1 = r1 + 1
            if (r1 >= r2) goto La7
            goto L53
        L6b:
            com.facebook.xzdecoder.XzInputStream r0 = new com.facebook.xzdecoder.XzInputStream     // Catch: java.io.IOException -> L9a
            r0.<init>(r3)     // Catch: java.io.IOException -> L9a
            r3 = r0
        L71:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L95
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L95
            r0 = 512(0x200, float:7.17E-43)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L8b
        L7a:
            int r0 = r3.read(r1)     // Catch: java.lang.Throwable -> L8b
            if (r0 <= 0) goto L84
            r2.write(r1, r5, r0)     // Catch: java.lang.Throwable -> L8b
            goto L7a
        L84:
            r2.close()     // Catch: java.lang.Throwable -> L95
            r3.close()     // Catch: java.io.IOException -> L8a
        L8a:
            return r4
        L8b:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L90
            goto L94
        L90:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.lang.Throwable -> L95
        L94:
            throw r1     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            r3.close()     // Catch: java.io.IOException -> L99
        L99:
            throw r0
        L9a:
            r1 = move-exception
            if (r3 == 0) goto La2
            r3.close()     // Catch: java.io.IOException -> La2
            goto La2
        La1:
            r1 = move-exception
        La2:
            java.lang.String r0 = "PGOProfileUtilextractProfileStreamFromApk failure"
            android.util.Log.w(r0, r1)
        La7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03600Hy.A04(android.content.Context, java.io.File):boolean");
    }

    public static boolean A05(C03600Hy c03600Hy) {
        boolean z;
        Object[] objArr;
        String str;
        if (!c03600Hy.A04) {
            synchronized (c03600Hy.A03) {
                if (!c03600Hy.A04) {
                    String A02 = A02(c03600Hy);
                    Context context = c03600Hy.A02;
                    File fileStreamPath = context.getFileStreamPath(A02);
                    if (fileStreamPath.exists()) {
                        objArr = new Object[]{fileStreamPath.getAbsolutePath()};
                        str = "Already have profile, using that instead. Path: %s";
                    } else if (c03600Hy.A08()) {
                        objArr = new Object[]{fileStreamPath.getAbsolutePath()};
                        str = "Not using default PGO profile from APK. Using empty PGO profile at path: %s";
                    } else {
                        try {
                            String.format("Extracting PGO profile  from APK to path %s", fileStreamPath.getAbsolutePath());
                            z = A04(context, fileStreamPath);
                        } catch (IOException e) {
                            android.util.Log.w("PGOProfileUtil", AnonymousClass001.A0R("Cannot read profile from apk. Error: ", e.getMessage()), e);
                            z = false;
                        }
                        c03600Hy.A01 = z;
                        c03600Hy.A04 = true;
                    }
                    String.format(str, objArr);
                    z = true;
                    c03600Hy.A01 = z;
                    c03600Hy.A04 = true;
                }
            }
        }
        return c03600Hy.A01;
    }

    public final File A07(File file) {
        FileOutputStream fileOutputStream;
        File file2 = new File(file, "art_pgo_ref_profile.prof");
        File A062 = A06();
        if (A062 == null || !A062.exists()) {
            return null;
        }
        if (file2.exists()) {
            String.format("Snapshot file %s already exists. Overwriting with %s.", file2.getAbsolutePath(), A062.getAbsolutePath());
            file2.delete();
        }
        try {
            boolean z = C0H1.A00;
            try {
                FileInputStream fileInputStream = new FileInputStream(A062);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        int A00 = C0H1.A00(fileInputStream, fileOutputStream, Integer.MAX_VALUE);
                        fileInputStream.close();
                        fileOutputStream.close();
                        boolean z2 = false;
                        if (A00 > 0) {
                            z2 = true;
                        }
                        try {
                            String.format("Got ret val %d of copy snapshot of prof %s to %s", Integer.valueOf(A00), A062.getAbsolutePath(), file2.getAbsolutePath());
                            if (!z2) {
                                String.format("Cleaning up failed snapshot pgo at %s", file2);
                                file2.delete();
                                return null;
                            }
                            return file2;
                        } catch (Throwable th) {
                            th = th;
                            if (z2) {
                                throw th;
                            }
                            String.format("Cleaning up failed snapshot pgo at %s", file2);
                            file2.delete();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final boolean A08() {
        C0JJ A00 = C0JJ.A00(this.A02);
        if ((!C0JJ.A00(r0).A15) && !A00.A2a) {
            return true;
        }
        return false;
    }

    public C03600Hy(Context context) {
        this.A02 = context;
    }

    public final File A06() {
        if (!A05(this)) {
            return null;
        }
        return this.A02.getFileStreamPath(A02(this));
    }
}
