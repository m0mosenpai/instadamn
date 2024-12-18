package X;

/* renamed from: X.9B6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B6 extends C0T6 implements InterfaceC30799Dga {
    public final int A00;
    public final boolean A01;

    public C9B6(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9B6) && ((C9B6) obj).A00 == i) {
            return true;
        }
        return false;
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
        if (!A00(obj, i) || this.A01 != ((C9B6) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.A01) {
            return 1237;
        }
        return 1231;
    }
}
