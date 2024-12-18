package X;

import com.instagram.user.model.User;

/* renamed from: X.Mxe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51957Mxe extends C0T6 implements InterfaceC57890Plu {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;

    public C51957Mxe(C22P c22p, String str) {
        AbstractC167017dG.A1P(c22p, str);
        this.A01 = c22p;
        this.A02 = str;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51957Mxe) && ((C51957Mxe) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (A00(obj, 1)) {
                    C51957Mxe c51957Mxe = (C51957Mxe) obj;
                    if (C14360o3.A0K(this.A02, c51957Mxe.A02)) {
                        obj2 = this.A01;
                        obj3 = c51957Mxe.A01;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!A00(obj, 0)) {
                return false;
            }
            C51957Mxe c51957Mxe2 = (C51957Mxe) obj;
            if (this.A01 != c51957Mxe2.A01) {
                return false;
            }
            obj2 = this.A02;
            obj3 = c51957Mxe2.A02;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0G;
        int hashCode;
        if (this.A00 != 0) {
            A0G = AbstractC166987dD.A0J(this.A02);
            hashCode = AbstractC167017dG.A0M(this.A01);
        } else {
            A0G = AbstractC166987dD.A0G(this.A01);
            hashCode = this.A02.hashCode();
        }
        return A0G + hashCode;
    }

    public C51957Mxe(User user, String str) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = user;
    }
}
