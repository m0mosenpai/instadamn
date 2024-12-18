package X;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* loaded from: classes10.dex */
public final class QIu extends C0T6 {
    public final int A00 = 0;
    public final Object A01;

    public QIu(InterfaceC50380MMi interfaceC50380MMi) {
        C14360o3.A0B(interfaceC50380MMi, 1);
        this.A01 = interfaceC50380MMi;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof QIu) && ((QIu) obj).A00 == i) {
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
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((QIu) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public QIu(UserRecoverableAuthException userRecoverableAuthException) {
        C14360o3.A0B(userRecoverableAuthException, 1);
        this.A01 = userRecoverableAuthException;
    }
}
