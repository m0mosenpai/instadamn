package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MxU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51947MxU extends C0T6 implements InterfaceC57885Plp {
    public final int A00;
    public final Object A01;

    public C51947MxU(EDR edr) {
        this.A00 = 4;
        this.A01 = edr;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51947MxU) && ((C51947MxU) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C51947MxU) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C51947MxU(User user, int i) {
        this.A00 = i;
        C14360o3.A0B(user, 1);
        this.A01 = user;
    }

    public C51947MxU(List list) {
        this.A00 = 0;
        this.A01 = list;
    }
}
