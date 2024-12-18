package X;

import java.io.File;

/* renamed from: X.Vrm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69583Vrm {
    public long A00 = -1;
    public long A01 = -1;
    public final C69674VtJ A02;
    public final String A03;

    public final long A00() {
        long j = this.A01;
        if (j < 0) {
            long lastModified = this.A02.A00.lastModified();
            this.A01 = lastModified;
            return lastModified;
        }
        return j;
    }

    public C69583Vrm(String str, File file) {
        this.A03 = str;
        this.A02 = new C69674VtJ(file);
    }
}
