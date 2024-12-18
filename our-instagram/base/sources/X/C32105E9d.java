package X;

/* renamed from: X.E9d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32105E9d extends C0T6 implements InterfaceC37110GWv {
    public final int A00 = 1;
    public final Object A01;

    public C32105E9d(EnumC72365Xc1 enumC72365Xc1) {
        this.A01 = enumC72365Xc1;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C32105E9d) && ((C32105E9d) obj).A00 == i) {
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
        if (!A00(obj, i) || this.A01 != ((C32105E9d) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return this.A01.hashCode();
        }
        Integer num = (Integer) this.A01;
        return XjZ.A00(num).hashCode() + num.intValue();
    }

    public C32105E9d(Integer num) {
        this.A01 = num;
    }
}
