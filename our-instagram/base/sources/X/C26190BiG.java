package X;

/* renamed from: X.BiG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26190BiG extends C0T6 implements InterfaceC30813Dgo {
    public final int A00;
    public final Object A01;

    public C26190BiG(C5Hb c5Hb, int i) {
        this.A00 = i;
        C14360o3.A0B(c5Hb, 1);
        this.A01 = c5Hb;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26190BiG) && ((C26190BiG) obj).A00 == i) {
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
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C26190BiG) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
