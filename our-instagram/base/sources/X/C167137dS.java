package X;

/* renamed from: X.7dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167137dS extends C0T6 implements InterfaceC166427cB {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167137dS) {
                C167137dS c167137dS = (C167137dS) obj;
                if (!C14360o3.A0K(this.A00, c167137dS.A00) || this.A01 != c167137dS.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C167137dS(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
