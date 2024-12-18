package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.facebook.common.dextricks.DexStoreUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* renamed from: X.08D, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C08D {
    public static final C08C A00 = new C08C() { // from class: X.0cK
        @Override // X.C08C
        public final void Dh5(int i, Object obj) {
        }
    };
    public static final C08C A01 = new C08C() { // from class: X.0cC
        @Override // X.C08C
        public final void Dh5(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i != 6 && i != 7 && i != 8) {
                return;
            }
            android.util.Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.086] */
    /* JADX WARN: Type inference failed for: r10v17, types: [X.086] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v44, types: [X.086] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.086] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.086] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.086] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.086] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.086[]] */
    /* JADX WARN: Type inference failed for: r6v12, types: [X.086] */
    /* JADX WARN: Type inference failed for: r9v8, types: [X.086] */
    public static void A00(Context context, C08C c08c, Executor executor, boolean z) {
        long j;
        int length;
        long j2;
        long readLong;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z2 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            readLong = dataInputStream.readLong();
                            dataInputStream.close();
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (readLong == packageInfo.lastUpdateTime) {
                        c08c.Dh5(2, null);
                        context.getPackageName();
                        C08O.A01(context, z2);
                    }
                }
            }
            context.getPackageName();
            AnonymousClass085 anonymousClass085 = new AnonymousClass085(assets, c08c, new File(new File("/data/misc/profiles/cur/0", packageName), DexStoreUtils.BASELINE_PROFILE_NAME), name, executor);
            if (anonymousClass085.A02()) {
                AnonymousClass085 A012 = anonymousClass085.A01();
                ?? r4 = A012.A02;
                byte[] bArr = A012.A07;
                if (r4 != 0 && bArr != null) {
                    if (A012.A00) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(C08K.A00);
                                byteArrayOutputStream.write(bArr);
                                byte[] bArr2 = C08P.A06;
                                if (Arrays.equals(bArr, bArr2)) {
                                    ?? th = 3;
                                    ArrayList arrayList = new ArrayList(3);
                                    ArrayList arrayList2 = new ArrayList(3);
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    try {
                                        try {
                                            int length2 = r4.length;
                                            AnonymousClass087.A01(byteArrayOutputStream2, 2, length2);
                                            int i = 2;
                                            for (?? r10 : r4) {
                                                AnonymousClass087.A01(byteArrayOutputStream2, 4, r10.A05);
                                                AnonymousClass087.A01(byteArrayOutputStream2, 4, r10.A01);
                                                AnonymousClass087.A01(byteArrayOutputStream2, 4, r10.A04);
                                                String A002 = C08K.A00(r10.A06, r10.A07, bArr2);
                                                Charset charset = StandardCharsets.UTF_8;
                                                int length3 = A002.getBytes(charset).length;
                                                AnonymousClass087.A01(byteArrayOutputStream2, 2, length3);
                                                i = i + 4 + 4 + 4 + 2 + length3;
                                                byteArrayOutputStream2.write(A002.getBytes(charset));
                                            }
                                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                            int length4 = byteArray.length;
                                            if (i == length4) {
                                                C08Q c08q = new C08Q(C05F.A00, byteArray, false);
                                                byteArrayOutputStream2.close();
                                                arrayList.add(c08q);
                                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                                int i2 = 0;
                                                int i3 = 0;
                                                th = byteArray;
                                                while (i2 < length2) {
                                                    try {
                                                        ?? r9 = r4[i2];
                                                        AnonymousClass087.A01(byteArrayOutputStream3, 2, i2);
                                                        AnonymousClass087.A01(byteArrayOutputStream3, 2, r9.A00);
                                                        i3 = i3 + 2 + 2 + (r9.A00 * 2);
                                                        int[] iArr = r9.A02;
                                                        int length5 = iArr.length;
                                                        int i4 = 0;
                                                        int i5 = 0;
                                                        while (i4 < length5) {
                                                            Integer valueOf = Integer.valueOf(iArr[i4]);
                                                            AnonymousClass087.A01(byteArrayOutputStream3, 2, r0 - i5);
                                                            i4++;
                                                            i5 = valueOf.intValue();
                                                        }
                                                        i2++;
                                                        th = i5;
                                                    } catch (Throwable th2) {
                                                        byteArrayOutputStream3.close();
                                                        throw th2;
                                                    }
                                                }
                                                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                                                int length6 = byteArray2.length;
                                                if (i3 == length6) {
                                                    C08Q c08q2 = new C08Q(C05F.A0C, byteArray2, true);
                                                    byteArrayOutputStream3.close();
                                                    arrayList.add(c08q2);
                                                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                                    int i6 = 0;
                                                    int i7 = 0;
                                                    th = byteArray2;
                                                    while (i6 < length2) {
                                                        try {
                                                            th = r4[i6];
                                                            Iterator it = th.A08.entrySet().iterator();
                                                            int i8 = 0;
                                                            while (it.hasNext()) {
                                                                i8 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                                            }
                                                            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                                            try {
                                                                C08K.A02(th, byteArrayOutputStream5);
                                                                byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                                                                byteArrayOutputStream5.close();
                                                                ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                                                                C08K.A03(th, byteArrayOutputStream6);
                                                                byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                                                                byteArrayOutputStream6.close();
                                                                AnonymousClass087.A01(byteArrayOutputStream4, 2, i6);
                                                                int length7 = byteArray3.length + 2 + byteArray4.length;
                                                                AnonymousClass087.A01(byteArrayOutputStream4, 4, length7);
                                                                AnonymousClass087.A01(byteArrayOutputStream4, 2, i8);
                                                                byteArrayOutputStream4.write(byteArray3);
                                                                byteArrayOutputStream4.write(byteArray4);
                                                                i7 = i7 + 2 + 4 + length7;
                                                                i6++;
                                                                th = th;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                try {
                                                                    byteArrayOutputStream5.close();
                                                                    throw th;
                                                                } catch (Throwable th4) {
                                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th4);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            byteArrayOutputStream4.close();
                                                            throw th5;
                                                        }
                                                    }
                                                    byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                                                    int length8 = byteArray5.length;
                                                    if (i7 == length8) {
                                                        C08Q c08q3 = new C08Q(C05F.A0N, byteArray5, true);
                                                        byteArrayOutputStream4.close();
                                                        arrayList.add(c08q3);
                                                        long size = 12 + (arrayList.size() * 16);
                                                        AnonymousClass087.A01(byteArrayOutputStream, 4, arrayList.size());
                                                        for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                                            C08Q c08q4 = (C08Q) arrayList.get(i9);
                                                            switch (c08q4.A00.intValue()) {
                                                                case 0:
                                                                    j = 0;
                                                                    break;
                                                                case 1:
                                                                    j = 1;
                                                                    break;
                                                                case 2:
                                                                    j = 2;
                                                                    break;
                                                                default:
                                                                    j = 3;
                                                                    break;
                                                            }
                                                            AnonymousClass087.A01(byteArrayOutputStream, 4, j);
                                                            AnonymousClass087.A01(byteArrayOutputStream, 4, size);
                                                            boolean z3 = c08q4.A01;
                                                            byte[] bArr3 = c08q4.A02;
                                                            if (z3) {
                                                                j2 = bArr3.length;
                                                                byte[] A04 = AnonymousClass087.A04(bArr3);
                                                                arrayList2.add(A04);
                                                                length = A04.length;
                                                                AnonymousClass087.A01(byteArrayOutputStream, 4, length);
                                                            } else {
                                                                arrayList2.add(bArr3);
                                                                length = bArr3.length;
                                                                AnonymousClass087.A01(byteArrayOutputStream, 4, length);
                                                                j2 = 0;
                                                            }
                                                            AnonymousClass087.A01(byteArrayOutputStream, 4, j2);
                                                            size += length;
                                                        }
                                                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                                            byteArrayOutputStream.write((byte[]) arrayList2.get(i10));
                                                        }
                                                    } else {
                                                        throw new IllegalStateException(AnonymousClass001.A02(i7, length8, "Expected size ", ", does not match actual size "));
                                                    }
                                                } else {
                                                    throw new IllegalStateException(AnonymousClass001.A02(i3, length6, "Expected size ", ", does not match actual size "));
                                                }
                                            } else {
                                                throw new IllegalStateException(AnonymousClass001.A02(i, length4, "Expected size ", ", does not match actual size "));
                                            }
                                        } catch (Throwable th6) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th6);
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        byteArrayOutputStream2.close();
                                        throw th7;
                                    }
                                } else {
                                    byte[] bArr4 = C08P.A05;
                                    if (!Arrays.equals(bArr, bArr4)) {
                                        byte[] bArr5 = C08P.A03;
                                        if (Arrays.equals(bArr, bArr5)) {
                                            AnonymousClass087.A01(byteArrayOutputStream, 1, r4.length);
                                            for (?? r2 : r4) {
                                                int size2 = r2.A08.size() * 4;
                                                String A003 = C08K.A00(r2.A06, r2.A07, bArr5);
                                                Charset charset2 = StandardCharsets.UTF_8;
                                                AnonymousClass087.A01(byteArrayOutputStream, 2, A003.getBytes(charset2).length);
                                                AnonymousClass087.A01(byteArrayOutputStream, 2, r2.A02.length);
                                                AnonymousClass087.A01(byteArrayOutputStream, 4, size2);
                                                AnonymousClass087.A01(byteArrayOutputStream, 4, r2.A05);
                                                byteArrayOutputStream.write(A003.getBytes(charset2));
                                                Iterator it2 = r2.A08.keySet().iterator();
                                                while (it2.hasNext()) {
                                                    AnonymousClass087.A01(byteArrayOutputStream, 2, ((Integer) it2.next()).intValue());
                                                    AnonymousClass087.A01(byteArrayOutputStream, 2, 0L);
                                                }
                                                int length9 = r2.A02.length;
                                                for (int i11 = 0; i11 < length9; i11++) {
                                                    AnonymousClass087.A01(byteArrayOutputStream, 2, r11[i11]);
                                                }
                                            }
                                        } else {
                                            bArr4 = C08P.A04;
                                            if (!Arrays.equals(bArr, bArr4)) {
                                                byte[] bArr6 = C08P.A02;
                                                if (Arrays.equals(bArr, bArr6)) {
                                                    AnonymousClass087.A01(byteArrayOutputStream, 2, r4.length);
                                                    for (?? r6 : r4) {
                                                        String A004 = C08K.A00(r6.A06, r6.A07, bArr6);
                                                        Charset charset3 = StandardCharsets.UTF_8;
                                                        AnonymousClass087.A01(byteArrayOutputStream, 2, A004.getBytes(charset3).length);
                                                        TreeMap treeMap = r6.A08;
                                                        AnonymousClass087.A01(byteArrayOutputStream, 2, treeMap.size());
                                                        AnonymousClass087.A01(byteArrayOutputStream, 2, r6.A02.length);
                                                        AnonymousClass087.A01(byteArrayOutputStream, 4, r6.A05);
                                                        byteArrayOutputStream.write(A004.getBytes(charset3));
                                                        Iterator it3 = treeMap.keySet().iterator();
                                                        while (it3.hasNext()) {
                                                            AnonymousClass087.A01(byteArrayOutputStream, 2, ((Integer) it3.next()).intValue());
                                                        }
                                                        int length10 = r6.A02.length;
                                                        for (int i12 = 0; i12 < length10; i12++) {
                                                            AnonymousClass087.A01(byteArrayOutputStream, 2, r10[i12]);
                                                        }
                                                    }
                                                } else {
                                                    A012.A04.Dh5(5, null);
                                                    A012.A02 = null;
                                                    byteArrayOutputStream.close();
                                                }
                                            }
                                        }
                                    }
                                    int length11 = r4.length;
                                    int i13 = 0;
                                    int i14 = 0;
                                    for (?? r22 : r4) {
                                        i14 += C08K.A00(r22.A06, r22.A07, bArr4).getBytes(StandardCharsets.UTF_8).length + 16 + (r22.A00 * 2) + r22.A03 + (((((r22.A04 * 2) + 8) - 1) & (-8)) / 8);
                                    }
                                    ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream(i14);
                                    if (!Arrays.equals(bArr4, C08P.A04)) {
                                        for (?? r23 : r4) {
                                            C08K.A04(r23, byteArrayOutputStream7, C08K.A00(r23.A06, r23.A07, bArr4));
                                        }
                                        while (i13 < length11) {
                                            C08K.A01(r4[i13], byteArrayOutputStream7);
                                            i13++;
                                        }
                                    } else {
                                        while (i13 < length11) {
                                            ?? r24 = r4[i13];
                                            C08K.A04(r24, byteArrayOutputStream7, C08K.A00(r24.A06, r24.A07, bArr4));
                                            C08K.A01(r24, byteArrayOutputStream7);
                                            i13++;
                                        }
                                    }
                                    if (byteArrayOutputStream7.size() == i14) {
                                        byte[] byteArray6 = byteArrayOutputStream7.toByteArray();
                                        AnonymousClass087.A01(byteArrayOutputStream, 1, length11);
                                        AnonymousClass087.A01(byteArrayOutputStream, 4, byteArray6.length);
                                        byte[] A042 = AnonymousClass087.A04(byteArray6);
                                        AnonymousClass087.A01(byteArrayOutputStream, 4, A042.length);
                                        byteArrayOutputStream.write(A042);
                                    } else {
                                        throw new IllegalStateException(AnonymousClass001.A02(byteArrayOutputStream7.size(), i14, "The bytes saved do not match expectation. actual=", " expected="));
                                    }
                                }
                                A012.A01 = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            } finally {
                            }
                        } catch (IOException e) {
                            A012.A04.Dh5(7, e);
                        } catch (IllegalStateException e2) {
                            A012.A04.Dh5(8, e2);
                        }
                        A012.A02 = null;
                    } else {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                }
                byte[] bArr7 = A012.A01;
                if (bArr7 != null) {
                    if (A012.A00) {
                        try {
                            try {
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr7);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(A012.A05);
                                    try {
                                        byte[] bArr8 = new byte[512];
                                        while (true) {
                                            int read = byteArrayInputStream.read(bArr8);
                                            if (read > 0) {
                                                fileOutputStream.write(bArr8, 0, read);
                                            } else {
                                                AnonymousClass085.A00(A012, null, 1);
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                A012.A01 = null;
                                                A012.A02 = null;
                                                A01(packageInfo, filesDir);
                                                if (z) {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th8) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Throwable th9) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                                    }
                                    throw th8;
                                }
                            } finally {
                                A012.A01 = null;
                                A012.A02 = null;
                            }
                        } catch (FileNotFoundException e3) {
                            AnonymousClass085.A00(A012, e3, 6);
                            C08O.A01(context, z2);
                        } catch (IOException e4) {
                            AnonymousClass085.A00(A012, e4, 7);
                            C08O.A01(context, z2);
                        }
                    } else {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                }
            }
            C08O.A01(context, z2);
        } catch (PackageManager.NameNotFoundException e5) {
            c08c.Dh5(7, e5);
            C08O.A01(context, false);
        }
    }

    public static void A01(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
