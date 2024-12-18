package X;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: X.Mrn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51656Mrn extends C0T6 {
    public final byte[] A00;

    public final boolean equals(Object obj) {
        C51656Mrn c51656Mrn;
        if (this == obj) {
            return true;
        }
        Class<?> cls = getClass();
        Class<?> cls2 = null;
        if (obj != null) {
            cls2 = obj.getClass();
        }
        if (C14360o3.A0K(cls, cls2) && (obj instanceof C51656Mrn) && (c51656Mrn = (C51656Mrn) obj) != null) {
            return Arrays.equals(this.A00, c51656Mrn.A00);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        String encodeToString = Base64.encodeToString(this.A00, 11);
        C14360o3.A07(encodeToString);
        return encodeToString;
    }

    public C51656Mrn(byte[] bArr) {
        this.A00 = bArr;
    }
}
