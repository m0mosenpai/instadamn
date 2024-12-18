package X;

import android.content.Context;
import android.os.StatFs;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.google.common.io.Closeables;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* renamed from: X.0mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13530mf {
    public static String A07(File file, StringBuilder sb) {
        InputStreamReader inputStreamReader = null;
        try {
            sb.delete(0, sb.length());
            InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(file), ReactWebViewManager.HTML_ENCODING);
            try {
                char[] cArr = new char[1024];
                while (true) {
                    int read = inputStreamReader2.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        String obj = sb.toString();
                        Closeables.A02(inputStreamReader2);
                        return obj;
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader = inputStreamReader2;
                Closeables.A02(inputStreamReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long A01(InterfaceC28041Xi interfaceC28041Xi, String str, java.util.Set set) {
        File[] listFiles;
        File file = new File(str);
        long j = 0;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                j += A01(interfaceC28041Xi, file2.toString(), set);
            }
        }
        if (interfaceC28041Xi.apply(file)) {
            j += file.length();
            file.delete();
            if (set != null) {
                try {
                    set.add(file.getCanonicalPath());
                } catch (IOException unused) {
                }
            }
        }
        return j;
    }

    public static long A03(String str) {
        if (str == null) {
            return 0L;
        }
        return A02(new File(str));
    }

    public static void A09(String str) {
        new File(str).delete();
    }

    public static void A0A(String str) {
        A01(new InterfaceC28041Xi() { // from class: X.0md
            @Override // X.InterfaceC28041Xi
            public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                return true;
            }
        }, str, null);
    }

    public static boolean A0B(File file, InputStream inputStream) {
        byte[] bArr = new byte[4096];
        try {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                bufferedOutputStream.close();
                                return true;
                            } catch (IOException unused) {
                                return true;
                            }
                        }
                    } catch (IOException unused2) {
                        bufferedOutputStream.close();
                        return false;
                    } catch (Throwable th) {
                        try {
                            bufferedOutputStream.close();
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                }
            } catch (IOException unused4) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static long A00(Context context) {
        StatFs statFs = new StatFs(context.getCacheDir().getAbsolutePath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static long A02(File file) {
        File[] listFiles;
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove();
            file2.getClass();
            if (file2.exists() && (listFiles = file2.listFiles()) != null) {
                for (File file3 : listFiles) {
                    if (file3.isFile()) {
                        j += file3.length();
                    } else {
                        file3.isDirectory();
                    }
                }
            }
        }
        return j;
    }

    public static File A04(Context context) {
        try {
            return File.createTempFile("tmp_photo_", ".jpg", context.getCacheDir());
        } catch (IOException e) {
            C0K8.A0F("FileUtil", "failed to create temp file", e);
            return new File("");
        }
    }

    public static File A05(Context context) {
        try {
            return File.createTempFile("tmp_video_", ".mp4", context.getCacheDir());
        } catch (IOException e) {
            C0K8.A0F("FileUtil", "failed to create temp file", e);
            return new File("");
        }
    }

    public static File A06(Context context, String str) {
        try {
            return File.createTempFile(AnonymousClass001.A0R("tmp_audio_", str), ".mp4", context.getCacheDir());
        } catch (IOException e) {
            C0K8.A0F("FileUtil", "failed to create temp file", e);
            return new File("");
        }
    }

    public static void A08(File file) {
        if (!file.exists() && !file.mkdirs()) {
            IOException e = null;
            StringBuilder sb = new StringBuilder();
            sb.append("could not make directory: ");
            try {
                sb.append(file.getCanonicalPath());
                sb.append("-canonical");
            } catch (IOException e2) {
                e = e2;
                sb.append(file.getAbsolutePath());
                sb.append("-absolute");
            }
            IOException iOException = new IOException(sb.toString());
            if (e != null) {
                iOException.initCause(e);
                throw iOException;
            }
            throw iOException;
        }
    }
}
