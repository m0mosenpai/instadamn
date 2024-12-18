package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.0Df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03220Df {
    public C0Hh A00;
    public final Context A01;
    public final File A02;
    public final String A03;
    public final Executor A04;
    public final AbstractC03210De[] A05;
    public static final Executor A07 = new Executor() { // from class: X.0Da
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    };
    public static final C0EA A06 = new C0EA();

    public C03220Df(Context context, File file, String str, ArrayList arrayList, Executor executor) {
        AbstractC05810Sj.A00(context);
        this.A01 = context;
        AbstractC05810Sj.A00(file);
        this.A02 = file;
        this.A05 = (AbstractC03210De[]) arrayList.toArray(new AbstractC03210De[arrayList.size()]);
        this.A04 = executor;
        AbstractC05810Sj.A00(str);
        this.A03 = str;
        this.A00 = null;
    }

    public static void A00(C03220Df c03220Df) {
        C0Hh c0Hh = c03220Df.A00;
        AbstractC05810Sj.A00(c0Hh);
        c0Hh.close();
        c03220Df.A00 = null;
        A06.A01(c03220Df.A03);
    }

    public static byte[] A02(InputStream inputStream, byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(i - i2, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET));
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            i2 += read;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void A01(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    A01(file2);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append("could not delete: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01db, code lost:
    
        throw new java.io.IOException("Could not create the destination directory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01dd, code lost:
    
        A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (r3.exists() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (r0.mkdirs() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        r7 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        if (r14 >= r8) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        r6 = r9[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        r5 = r6.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        r0 = r6.A00;
        X.AbstractC05810Sj.A00(r0);
        r13 = new java.io.FileOutputStream(r0);
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        r3 = r5.read(r10, 0, java.lang.Math.min(Integer.MAX_VALUE - r12, com.facebook.common.dextricks.Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        if (r3 == (-1)) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e9, code lost:
    
        r13.write(r10, 0, r3);
        r12 = r12 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        if (r12 >= Integer.MAX_VALUE) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
    
        r5.close();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
    
        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0181, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0182, code lost:
    
        if (r5 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018c, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0189, code lost:
    
        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0123, code lost:
    
        r0 = r0.getMessage();
        X.AbstractC05810Sj.A00(r0);
        r10 = new java.lang.StringBuilder(r0);
        r3 = r6.A00;
        X.AbstractC05810Sj.A00(r3);
        r10.append(" path: ");
        r10.append(r3.getCanonicalPath());
        r10.append(", exists: ");
        r10.append(r3.exists());
        r10.append(", canWrite: ");
        r10.append(r3.canWrite());
        r10.append(", parent exists: ");
        r3 = r3.getParentFile();
        X.AbstractC05810Sj.A00(r3);
        r10.append(r3.exists());
        r10.append(", parent canWrite: ");
        r10.append(r3.canWrite());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
    
        throw new java.io.FileNotFoundException(r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018e, code lost:
    
        r0 = r0.getMessage();
        X.AbstractC05810Sj.A00(r0);
        r5 = new java.lang.StringBuilder(r0);
        r5.append(X.AnonymousClass001.A0R(", directory path: ", r0.getAbsolutePath()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a7, code lost:
    
        if (r7 >= r8) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a9, code lost:
    
        r0 = r9[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ab, code lost:
    
        if (r0 != r6) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ad, code lost:
    
        r5.append(X.AnonymousClass001.A0R(", passed unpacking: ", r0.toString()));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bd, code lost:
    
        r5.append(X.AnonymousClass001.A0R(", fails to unpack: ", r6.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        throw new java.io.FileNotFoundException(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f9, code lost:
    
        r18.A04.execute(new X.RunnableC03180Db(r18));
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03220Df.A03():boolean");
    }
}
