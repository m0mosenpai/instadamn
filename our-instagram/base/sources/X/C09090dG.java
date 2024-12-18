package X;

import android.content.Context;
import com.facebook.common.dextricks.DexStore;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0dG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09090dG {
    public static List A00;
    public static Map A01;
    public static byte[] A02;
    public static volatile boolean A05;
    public static final ReentrantReadWriteLock A04 = new ReentrantReadWriteLock();
    public static final HashSet A03 = new HashSet<String>() { // from class: X.0dE
        {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    };

    public static String A00(int i) {
        byte[] bArr;
        if (i >= A00.size()) {
            return null;
        }
        int intValue = ((Number) A00.get(i)).intValue();
        int i2 = intValue;
        while (true) {
            bArr = A02;
            if (i2 >= bArr.length || bArr[i2] <= 32) {
                break;
            }
            i2++;
        }
        int i3 = (i2 - intValue) + 6;
        char[] cArr = new char[i3];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i4 = 0; i4 < i3 - 6; i4++) {
            cArr[i4 + 3] = (char) bArr[intValue + i4];
        }
        cArr[i3 - 3] = '.';
        cArr[i3 - 2] = 's';
        cArr[i3 - 1] = 'o';
        return new String(cArr);
    }

    public static void A01(int i, int i2) {
        List list = A00;
        Integer valueOf = Integer.valueOf(i2);
        list.add(valueOf);
        Map map = A01;
        Integer valueOf2 = Integer.valueOf(i);
        List list2 = (List) map.get(valueOf2);
        if (list2 == null) {
            list2 = new ArrayList();
            A01.put(valueOf2, list2);
        }
        list2.add(valueOf);
    }

    public static boolean A02(Context context) {
        int i;
        int length;
        byte b;
        int length2;
        if (A05) {
            synchronized (C09090dG.class) {
                if (A05) {
                    throw new IllegalStateException("Trying to initialize NativeDeps but it was already initialized");
                }
            }
        }
        byte[] A06 = AbstractC09200dV.A06(context, new File(context.getApplicationInfo().sourceDir));
        File file = new File(new File(context.getApplicationInfo().dataDir, "native_deps"), DexStore.DEPS_FILENAME);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] A012 = AbstractC09100dH.A01(fileInputStream, (int) file.length());
            fileInputStream.close();
            if (A06 != null) {
                int length3 = A06.length;
                if (length3 != 0 && (length2 = A012.length) >= (i = length3 + 4) && length2 == ByteBuffer.wrap(A012, length3, 4).getInt() + i) {
                    int i2 = 0;
                    while (A06[i2] == A012[i2]) {
                        i2++;
                        if (i2 >= length3) {
                            if (i == -1) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                return false;
            }
            i = 0;
            int i3 = i;
            while (true) {
                length = A012.length;
                if (i3 >= length || A012[i3] == 10) {
                    break;
                }
                i3++;
            }
            if (i3 < length) {
                i3++;
            }
            if (i3 >= length) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(new String(A012, i, (i3 - i) - 1));
                if (parseInt <= 0) {
                    return false;
                }
                A01 = new HashMap(((int) (parseInt / 1.0f)) + 1, 1.0f);
                A00 = new ArrayList(parseInt);
                while (true) {
                    int i4 = 5381;
                    int i5 = i3;
                    while (true) {
                        try {
                            b = A012[i5];
                            if (b <= 32) {
                                break;
                            }
                            i4 = (i4 << 5) + i4 + b;
                            i5++;
                        } catch (IndexOutOfBoundsException unused) {
                            if (i3 != length) {
                                A01(i4, i3);
                            }
                        }
                    }
                    A01(i4, i3);
                    boolean z = false;
                    if (b != 32) {
                        z = true;
                    }
                    while (true) {
                        i3 = i5 + 1;
                        if (z) {
                            break;
                        }
                        while (A012[i3] != 10) {
                            try {
                                i3++;
                            } catch (IndexOutOfBoundsException unused2) {
                                if (A00.size() != parseInt) {
                                    return false;
                                }
                                A02 = A012;
                                A05 = true;
                                return true;
                            }
                        }
                        z = true;
                        i5 = i3;
                    }
                }
            } catch (NumberFormatException unused3) {
                return false;
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (r6 == (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        r4 = new java.util.ArrayList();
        r6 = (r6 + r7) - 6;
        r1 = 0;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        r3 = X.C09090dG.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if (r6 >= r3.length) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r3 = r3[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r3 == 10) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r3 != 32) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        if (r5 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        r0 = A00(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        if (r0 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        r4.add(r0);
        r1 = 0;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
    
        if (r3 < 48) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        if (r3 > 57) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        r1 = (r1 * 10) + (r3 - 48);
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
    
        if (r5 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        r0 = A00(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c0, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c2, code lost:
    
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c9, code lost:
    
        if (r4.isEmpty() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cb, code lost:
    
        r2 = (java.lang.String[]) r4.toArray(new java.lang.String[r4.size()]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] A03(X.InterfaceC09010d5 r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09090dG.A03(X.0d5, java.lang.String):java.lang.String[]");
    }
}
