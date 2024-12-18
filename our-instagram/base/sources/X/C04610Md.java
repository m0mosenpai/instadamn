package X;

import android.app.Application;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.0Md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04610Md {
    public static final Map A05 = new HashMap();
    public int A00;
    public int A01;
    public File A02;
    public Object A03;
    public String A04;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.0Md] */
    public static synchronized C04610Md A00(String str) {
        C04610Md c04610Md;
        synchronized (C04610Md.class) {
            Map map = A05;
            C04610Md c04610Md2 = (C04610Md) map.get(str);
            c04610Md = c04610Md2;
            if (c04610Md2 == null) {
                ?? obj = new Object();
                obj.A03 = new Object();
                obj.A04 = str;
                map.put(str, obj);
                c04610Md = obj;
            }
        }
        return c04610Md;
    }

    public final void A01() {
        synchronized (this.A03) {
            C0K8.A0D("lacrima", "FixedLengthFiles.forceDeleteAllFiles");
            File[] listFiles = this.A02.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
        }
    }

    public final void A02() {
        long j;
        this.A02.mkdirs();
        File[] listFiles = this.A02.listFiles();
        int i = this.A00;
        long j2 = i;
        if (listFiles != null) {
            j2 = i - listFiles.length;
        }
        long min = Math.min(C0M1.A00() / this.A01, j2);
        for (int i2 = 0; i2 < min; i2++) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.A02, AnonymousClass001.A0R(UUID.randomUUID().toString(), "_prop.txt")), "rw");
                long j3 = 0;
                while (true) {
                    try {
                        j = this.A01;
                        if (j3 >= j) {
                            break;
                        }
                        randomAccessFile.seek(j3);
                        randomAccessFile.writeByte(32);
                        j3 += OdexSchemeArtXdex.STATE_PGO_NEEDED;
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                randomAccessFile.setLength(j);
                randomAccessFile.close();
            } catch (IOException e) {
                C0PC.A00().DEh("AddPoolFiles", e, null);
                C0K8.A0H("lacrima", "Initialization failed.", e);
                return;
            }
        }
    }

    public final void A03(Application application, int i, int i2) {
        synchronized (this.A03) {
            if (this.A02 != null) {
                C0K8.A0D("lacrima", "FixedLengthFiles.init() called twice.");
            } else {
                this.A00 = i;
                this.A01 = i2;
                this.A02 = application.getDir(AnonymousClass001.A0R("file_pool", this.A04), 0);
            }
        }
    }
}
