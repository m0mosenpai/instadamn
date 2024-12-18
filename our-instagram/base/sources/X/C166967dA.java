package X;

import com.instagram.user.model.User;

/* renamed from: X.7dA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166967dA extends C0T6 implements InterfaceC166427cB {
    public final User A00;
    public final String A01;

    public C166967dA(User user, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166967dA) {
                C166967dA c166967dA = (C166967dA) obj;
                if (!C14360o3.A0K(this.A01, c166967dA.A01) || !C14360o3.A0K(this.A00, c166967dA.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }
}
