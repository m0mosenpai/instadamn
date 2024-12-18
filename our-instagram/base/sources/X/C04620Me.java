package X;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.0Me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04620Me {
    public static C04620Me A03;
    public int A00;
    public C0Pe A01;
    public boolean A02;

    static {
        new Object();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.0Me] */
    public static synchronized void A00(C0Pe c0Pe) {
        synchronized (C04620Me.class) {
            if (A03 == null) {
                ?? obj = new Object();
                obj.A00 = 0;
                obj.A02 = false;
                obj.A01 = c0Pe;
                A03 = obj;
            }
        }
    }

    public final int A01() {
        int i;
        File A02;
        if (this.A02) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A02) {
                i = this.A00;
            } else {
                this.A02 = true;
                C0Pe c0Pe = this.A01;
                i = 0;
                if (c0Pe != null && (A02 = c0Pe.A02(c0Pe.A07)) != null) {
                    File file = new File(A02, "critical_suppl_startup_prop.txt");
                    Properties properties = new Properties();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            properties.load(bufferedInputStream);
                            String property = properties.getProperty("pid");
                            if (property != null) {
                                i = Integer.parseInt(property);
                            }
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (IOException | NumberFormatException e) {
                        C0PC.A00().DEh("PrevSessPrevPID", e, null);
                        C0K8.A0H("lacrima", "Error getting previous process id", e);
                    }
                }
                this.A00 = i;
            }
        }
        return i;
    }
}
