package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: X.05f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C013905f implements C0LR {
    public final File A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0E;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        String obj;
        String str;
        C04670Mj c04670Mj = C0L6.A04;
        if (c04670Mj != null) {
            C10850hu c10850hu = C0LK.A5s;
            File file = this.A00;
            if (file != null) {
                File file2 = new File(file, "navmodules.txt");
                obj = null;
                try {
                    if (!file2.exists()) {
                    }
                } catch (Exception e) {
                    C0PC.A00().DEh("StartupConfigGEReading", e, null);
                }
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
                    try {
                        str = bufferedReader.readLine();
                        bufferedReader.close();
                    } finally {
                    }
                } catch (IOException e2) {
                    C0K8.A0H("lacrima", "Reading granular exposures failed", e2);
                    C0PC.A00().DEh("StartupConfigGEReading", e2, null);
                    str = null;
                }
                c024209q.A03(c10850hu, str);
            }
            StringBuilder sb = c04670Mj.A06;
            synchronized (sb) {
                obj = sb.toString();
            }
            str = obj;
            c024209q.A03(c10850hu, str);
        }
    }

    public C013905f(File file) {
        this.A00 = file;
    }

    public C013905f() {
        this.A00 = null;
    }
}
