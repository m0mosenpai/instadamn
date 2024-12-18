package X;

/* renamed from: X.Jz1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45161Jz1 extends C0T6 implements InterfaceC50390MMs {
    public final int A00;
    public final Object A01;

    public C45161Jz1(C26059Bfm c26059Bfm, int i) {
        this.A00 = i;
        this.A01 = c26059Bfm;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45161Jz1) && ((C45161Jz1) obj).A00 == i) {
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
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C45161Jz1) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
