package X;

import java.util.List;

/* renamed from: X.9Bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206429Bz extends C0T6 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final String A03;

    public C206429Bz(List list, int i, String str) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A02 = list;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206429Bz) {
                    C206429Bz c206429Bz = (C206429Bz) obj;
                    if (c206429Bz.A00 != 1 || !C14360o3.A0K(this.A03, c206429Bz.A03) || this.A01 != c206429Bz.A01 || !C14360o3.A0K(this.A02, c206429Bz.A02)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C206429Bz)) {
                return false;
            }
            C206429Bz c206429Bz2 = (C206429Bz) obj;
            if (c206429Bz2.A00 != 0 || !C14360o3.A0K(this.A03, c206429Bz2.A03) || !C14360o3.A0K(this.A02, c206429Bz2.A02) || this.A01 != c206429Bz2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2 = this.A00;
        int hashCode2 = this.A03.hashCode();
        if (i2 != 0) {
            hashCode = ((hashCode2 * 31) + this.A01) * 31;
            i = this.A02.hashCode();
        } else {
            hashCode = ((hashCode2 * 31) + this.A02.hashCode()) * 31;
            i = this.A01;
        }
        return hashCode + i;
    }

    public C206429Bz(InterfaceC16820sZ interfaceC16820sZ, String str, int i) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A01 = i;
        this.A02 = interfaceC16820sZ;
    }
}
