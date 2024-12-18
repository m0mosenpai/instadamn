package X;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.56k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1125656k {
    public File A04;
    public C1125456i A03 = null;
    public java.net.URL A05 = null;
    public long A02 = -1;
    public long A01 = -1;
    public int A00 = -1;

    public final C1125756l A00() {
        if (this.A05 == null) {
            if (this.A04 == null) {
                throw new IllegalArgumentException("Source file and url cannot be both null");
            }
        } else if (this.A04 != null) {
            throw new IllegalArgumentException("Source file and url cannot be both non-null");
        }
        if (this.A03 == null) {
            this.A03 = new C1125456i(TimeUnit.MILLISECONDS, -1L, -1L);
        }
        return new C1125756l(this);
    }

    public C1125656k(File file) {
        this.A04 = file;
    }
}
