package X;

import java.io.File;
import java.util.Arrays;

/* renamed from: X.6VQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VQ {
    public final File A00;
    public final boolean A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj instanceof C6VQ) {
            C6VQ c6vq = (C6VQ) obj;
            if (AbstractC50102Ry.A00(this.A03, c6vq.A03) && AbstractC50102Ry.A00(this.A02, c6vq.A02) && AbstractC50102Ry.A00(this.A00, c6vq.A00) && this.A01 == c6vq.A01) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, this.A00, Boolean.valueOf(this.A01)});
    }

    public C6VQ(File file, String str, String str2, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = z;
        this.A00 = file;
    }
}
