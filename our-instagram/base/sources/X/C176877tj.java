package X;

import com.facebook.tigon.tigonhuc.HucClient;

/* renamed from: X.7tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176877tj {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C176877tj)) {
            return false;
        }
        C176877tj c176877tj = (C176877tj) obj;
        return this.A02 == c176877tj.A02 && this.A01 == c176877tj.A01;
    }

    public static C176877tj A00(String str) {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0 && (indexOf = str.indexOf(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS)) < 0) {
                throw new NumberFormatException(AnonymousClass001.A0g("Invalid Size: \"", str, "\""));
            }
            try {
                return new C176877tj(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException unused) {
                throw new NumberFormatException(AnonymousClass001.A0g("Invalid Size: \"", str, "\""));
            }
        }
        throw new NullPointerException("string must not be null");
    }

    public final int hashCode() {
        int i = this.A01;
        int i2 = this.A02;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return AnonymousClass001.A0P("x", this.A02, this.A01);
    }

    public C176877tj(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i * i2;
    }
}
