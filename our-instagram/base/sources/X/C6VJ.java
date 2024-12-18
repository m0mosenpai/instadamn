package X;

import android.content.SharedPreferences;
import com.facebook.tigon.TigonErrorException;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6VJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VJ {
    public static final InterfaceExecutorServiceC73393Qq A02;
    public static final C1QY A03;
    public static final C1QY A04;
    public final C6VH A00;
    public volatile C6VI A01;

    static {
        C1QX c1qx = new C1QX();
        EnumC23341Bw enumC23341Bw = EnumC23341Bw.Other;
        c1qx.A04 = enumC23341Bw;
        c1qx.A03 = C1Ef.OnScreen;
        A03 = c1qx.A00();
        C1QX c1qx2 = new C1QX();
        c1qx2.A04 = enumC23341Bw;
        c1qx2.A03 = C1Ef.OffScreen;
        A04 = c1qx2.A00();
        A02 = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(2));
    }

    public static C6VQ A00(C3LV c3lv, C6VJ c6vj) {
        C6VQ c6vq;
        String A05;
        String A0R;
        File COc;
        InterfaceC50418MNu interfaceC50418MNu;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        FileInputStream fileInputStream;
        try {
            String str = c3lv.A02;
            AbstractC08820cl.A03(str);
            C2n4 E3L = C2n4.A09.E3L(str);
            int andIncrement = C6QW.A01.getAndIncrement();
            String str2 = c3lv.A01;
            C006802i c006802i = C6QW.A00;
            if (c006802i != null) {
                c006802i.markerStart(38797316, andIncrement);
                c006802i.markerAnnotate(38797316, "File Downloaded", str2);
            }
            try {
                C4J7 A08 = C14M.A03().A08(A03, E3L, null);
                if (c006802i != null) {
                    try {
                        c006802i.markerEnd(38797316, andIncrement, (short) 2);
                    } catch (Throwable th) {
                        try {
                            A08.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                InterfaceC26481Qd interfaceC26481Qd = A08.A02;
                InputStream AjT = interfaceC26481Qd.AjT();
                interfaceC26481Qd.AJp();
                C6VH c6vh = c6vj.A00;
                String str3 = c3lv.A00;
                boolean z = c3lv.A03;
                C6VG c6vg = (C6VG) c6vh;
                C6VO A032 = c6vg.A03();
                File file = null;
                if (A032 != null && (COc = A032.COc((A0R = AnonymousClass001.A0R((A05 = c6vg.A05()), ".tmp")))) != null) {
                    try {
                        fileOutputStream = new FileOutputStream(COc);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            }
                            throw th3;
                        }
                    } catch (IOException e) {
                        Throwable th5 = e;
                        while (true) {
                            if (th5 instanceof TigonErrorException) {
                                break;
                            }
                            th5 = th5.getCause();
                            if (th5 == null) {
                                if (C0K8.A01.isLoggable(6)) {
                                    C0K8.A01.wtf(C6VG.class.getSimpleName(), "Unable to copy stream to temp file", e);
                                }
                            }
                        }
                    }
                    try {
                        AbstractC37701p7.A00(AjT, bufferedOutputStream);
                        bufferedOutputStream.flush();
                        fileOutputStream.getFD().sync();
                        bufferedOutputStream.close();
                        fileOutputStream.close();
                        file = A032.COc(A05);
                        if (file == null) {
                            file = null;
                        } else {
                            if (z) {
                                try {
                                    fileInputStream = new FileInputStream(COc);
                                } catch (IOException unused) {
                                }
                                try {
                                    try {
                                        try {
                                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                            byte[] bArr = new byte[4096];
                                            while (true) {
                                                int read = fileInputStream.read(bArr);
                                                if (read <= 0) {
                                                    break;
                                                }
                                                messageDigest.update(bArr, 0, read);
                                            }
                                            boolean equals = C0JT.A01(messageDigest.digest()).equals(str3);
                                            fileInputStream.close();
                                            if (equals) {
                                            }
                                            C0K8.A04(C6VG.class, "Unable to copy temp file to new location");
                                            A032.remove(A05);
                                        } catch (Throwable th6) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable th7) {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                            }
                                            throw th6;
                                        }
                                    } catch (NoSuchAlgorithmException e2) {
                                        throw new RuntimeException(e2);
                                    }
                                } catch (UnsupportedEncodingException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                            if (COc.renameTo(file)) {
                                C6VK A042 = c6vg.A04();
                                SharedPreferences sharedPreferences = A042.A01;
                                if (sharedPreferences == null) {
                                    sharedPreferences = A042.A00.getSharedPreferences("asset_preferences", 0);
                                    A042.A01 = sharedPreferences;
                                }
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                C95F c95f = A042.A03;
                                if (c95f == null) {
                                    c95f = (C95F) C95E.A04.A00(A042.A04).A00("md5");
                                    A042.A03 = c95f;
                                }
                                edit.putString(c95f.toString(), str3).apply();
                                A042.A00(file);
                            }
                            C0K8.A04(C6VG.class, "Unable to copy temp file to new location");
                            A032.remove(A05);
                        }
                        A032.remove(A0R);
                        if (file != null && file.isFile()) {
                            C6VI c6vi = c6vj.A01;
                            if (c6vi != null) {
                                Object AK1 = c6vi.A01.A02().AK1(file);
                                AtomicReference atomicReference = c6vi.A03;
                                synchronized (atomicReference) {
                                    atomicReference.set(AK1);
                                    c6vi.A05 = 2;
                                }
                                C15670qN.A00(c6vi);
                                if (AK1 != null && (interfaceC50418MNu = c6vi.A00) != null) {
                                    interfaceC50418MNu.DGw(AK1);
                                }
                            }
                            c6vq = new C6VQ(file, str2, str3, false);
                            C6VQ c6vq2 = c6vq;
                            A08.close();
                            return c6vq2;
                        }
                    } finally {
                    }
                }
                c6vq = null;
                C6VQ c6vq22 = c6vq;
                A08.close();
                return c6vq22;
            } catch (Exception e4) {
                C0w9.A06("RasDownloader", "Download failed.", e4);
                if (c006802i != null) {
                    c006802i.markerEnd(38797316, andIncrement, (short) 3);
                }
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public C6VJ(C6VG c6vg) {
        this.A00 = c6vg;
    }
}
