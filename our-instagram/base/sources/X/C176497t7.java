package X;

/* renamed from: X.7t7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176497t7 extends C0T6 implements InterfaceC191028cy {
    public final Integer A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C176497t7) {
                C176497t7 c176497t7 = (C176497t7) obj;
                if (!C14360o3.A0K(this.A00, c176497t7.A00) || this.A01 != c176497t7.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.A00;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C176497t7(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
