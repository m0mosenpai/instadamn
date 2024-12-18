package X;

import java.io.IOException;

/* renamed from: X.JyW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45130JyW extends C0T6 implements InterfaceC50380MMi {
    public final int A00 = 0;
    public final Object A01;

    public C45130JyW(IOException iOException) {
        C14360o3.A0B(iOException, 1);
        this.A01 = iOException;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45130JyW) && ((C45130JyW) obj).A00 == i) {
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
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C45130JyW) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C45130JyW(Rk3 rk3) {
        this.A01 = rk3;
    }
}
