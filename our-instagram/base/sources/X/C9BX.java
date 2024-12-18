package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9BX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BX extends C0T6 implements InterfaceC166427cB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9BX(List list) {
        this.A00 = 2;
        this.A02 = list;
        this.A01 = null;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BX) && ((C9BX) obj).A00 == i) {
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
                    if (!A00(obj, 1)) {
                        return false;
                    }
                    C9BX c9bx = (C9BX) obj;
                    if (this.A02 != c9bx.A02 || this.A01 != c9bx.A01) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (A00(obj, i)) {
            C9BX c9bx2 = (C9BX) obj;
            if (!C14360o3.A0K(this.A02, c9bx2.A02) || !C14360o3.A0K(this.A01, c9bx2.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        Object obj;
        int hashCode2;
        switch (this.A00) {
            case 0:
                hashCode = this.A02.hashCode();
                i = hashCode * 31;
                obj = this.A01;
                hashCode2 = obj.hashCode();
                break;
            case 1:
                Integer num = (Integer) this.A02;
                hashCode = AbstractC166107be.A01(num).hashCode() + num.intValue();
                i = hashCode * 31;
                obj = this.A01;
                hashCode2 = obj.hashCode();
                break;
            default:
                i = this.A02.hashCode() * 31;
                obj = this.A01;
                if (obj == null) {
                    hashCode2 = 0;
                    break;
                }
                hashCode2 = obj.hashCode();
                break;
        }
        return i + hashCode2;
    }

    public C9BX(EnumC166067ba enumC166067ba, Integer num) {
        this.A00 = 1;
        C14360o3.A0B(num, 1);
        C14360o3.A0B(enumC166067ba, 2);
        this.A02 = num;
        this.A01 = enumC166067ba;
    }

    public C9BX(C84923qg c84923qg, User user) {
        this.A00 = 0;
        C14360o3.A0B(user, 1);
        this.A02 = user;
        this.A01 = c84923qg;
    }
}
