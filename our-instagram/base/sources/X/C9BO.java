package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9BO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BO extends C0T6 {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9BO(int i) {
        this(0, 7, (Object) null);
        this.A02 = i;
        if (2 - i != 0) {
            this.A02 = 7;
        } else {
            this.A02 = 2;
            this(C16930sl.A00, 0, 2);
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A02) {
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
            case 5:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
            case 6:
                if (this != obj) {
                    if (obj instanceof C9BO) {
                        C9BO c9bo = (C9BO) obj;
                        if (c9bo.A02 != 6 || !C14360o3.A0K(this.A01, c9bo.A01) || this.A00 != c9bo.A00) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return true;
            case 7:
                if (this != obj) {
                    i = 7;
                    break;
                } else {
                    return true;
                }
            case 8:
                if (this != obj) {
                    i = 8;
                    break;
                } else {
                    return true;
                }
            case 9:
                if (this != obj) {
                    i = 9;
                    break;
                } else {
                    return true;
                }
            default:
                return super.equals(obj);
        }
        if (obj instanceof C9BO) {
            C9BO c9bo2 = (C9BO) obj;
            if (c9bo2.A02 != i || this.A00 != c9bo2.A00 || !C14360o3.A0K(this.A01, c9bo2.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final int hashCode() {
        int i;
        Object obj;
        int hashCode;
        switch (this.A02) {
            case 1:
            case 7:
            case 9:
                i = this.A00 * 31;
                obj = this.A01;
                if (obj == null) {
                    hashCode = 0;
                    return i + hashCode;
                }
                hashCode = obj.hashCode();
                return i + hashCode;
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                i = this.A00 * 31;
                obj = this.A01;
                hashCode = obj.hashCode();
                return i + hashCode;
            case 6:
                i = this.A01.hashCode() * 31;
                hashCode = this.A00;
                return i + hashCode;
            default:
                return super.hashCode();
        }
    }

    public C9BO(List list, int i, int i2) {
        this.A02 = i2;
        C14360o3.A0B(list, 2);
        this.A00 = i;
        this.A01 = list;
    }

    public C9BO(int i, int i2, Object obj) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = obj;
    }

    public C9BO(User user, int i) {
        this.A02 = 6;
        C14360o3.A0B(user, 1);
        this.A01 = user;
        this.A00 = i;
    }

    public C9BO(InterfaceC115495Kj interfaceC115495Kj, int i) {
        this.A02 = 4;
        C14360o3.A0B(interfaceC115495Kj, 2);
        this.A00 = i;
        this.A01 = interfaceC115495Kj;
    }
}
