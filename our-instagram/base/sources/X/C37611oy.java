package X;

import java.util.Arrays;

/* renamed from: X.1oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37611oy extends C0T6 {
    public final String A00;
    public final byte[] A01;

    public C37611oy(String str, byte[] bArr) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(bArr, 2);
        this.A00 = str;
        this.A01 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37611oy) {
                C37611oy c37611oy = (C37611oy) obj;
                if (!C14360o3.A0K(this.A00, c37611oy.A00) || !C14360o3.A0K(this.A01, c37611oy.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A0v("SponsoredPoolItemEntity(surface=", this.A00, ", data=", Arrays.toString(this.A01), ')');
    }
}
