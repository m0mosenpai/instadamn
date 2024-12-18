package X;

import android.os.FileObserver;
import java.io.File;

/* renamed from: X.0Gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03420Gu {
    public int A00;
    public FileObserver A01;
    public C03830Iy A02;
    public File A03;
    public boolean A04;

    public static void A00(String str) {
        C0K8.A0P("FileBasedMultiProcessTracker", "%s: %s", C0JA.A00().A03(), str);
    }

    public final void A01(int i) {
        File file = new File(AnonymousClass001.A0b(this.A03.getPath(), File.separator, i));
        if (file.exists() && !file.delete()) {
            A00(AnonymousClass001.A0O("Failed to delete file for PID: ", i));
        }
    }
}
