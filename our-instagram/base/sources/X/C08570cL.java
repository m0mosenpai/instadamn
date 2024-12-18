package X;

import java.util.Arrays;

/* renamed from: X.0cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08570cL {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C08570cL c08570cL = (C08570cL) obj;
            if (!this.A00.equals(c08570cL.A00) || !this.A01.equals(c08570cL.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C08570cL(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
