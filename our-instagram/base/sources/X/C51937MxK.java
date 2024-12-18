package X;

/* renamed from: X.MxK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51937MxK extends C0T6 implements InterfaceC57875Plf {
    public final int A00;
    public final String A01;

    public C51937MxK(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C51937MxK) {
            C51937MxK c51937MxK = (C51937MxK) obj;
            if (c51937MxK.A00 != i || !C14360o3.A0K(this.A01, c51937MxK.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
