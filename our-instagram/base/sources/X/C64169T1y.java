package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.T1y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64169T1y implements InterfaceC65502TlR {
    public final Context A00;

    public C64169T1y(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    @Override // X.InterfaceC65502TlR
    public final String CgW() {
        return "fs";
    }

    @Override // X.InterfaceC65502TlR
    public final HashMap E6N() {
        HashMap A1G = AbstractC166987dD.A1G();
        S1R.A00(Environment.getDataDirectory(), "device", A1G);
        try {
            synchronized (C0eT.class) {
            }
            C14360o3.A07(Environment.getExternalStorageDirectory());
            Environment.getExternalStorageState();
            String A00 = AbstractC43591JPw.A00(176);
            C0s6 A002 = AbstractC13190m5.A00(this.A00.getExternalFilesDirs(null));
            while (A002.hasNext()) {
                File file = (File) A002.next();
                if (file != null) {
                    String externalStorageState = Environment.getExternalStorageState(file);
                    if (A00.equals(externalStorageState) || AbstractC43591JPw.A00(425).equals(externalStorageState)) {
                        String str = "external";
                        if (Environment.isExternalStorageRemovable()) {
                            str = "sd";
                        }
                        S1R.A00(file, str, A1G);
                    }
                }
            }
        } catch (Exception e) {
            C0I2.A07("FsInfoDataProvider", "Failed to measure external fs information", e);
        }
        return A1G;
    }
}
