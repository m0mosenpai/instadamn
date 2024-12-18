package X;

import com.instagram.user.model.User;

/* renamed from: X.7d9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166957d9 extends C0T6 implements InterfaceC166427cB {
    public final User A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166957d9) {
                C166957d9 c166957d9 = (C166957d9) obj;
                if (!C14360o3.A0K(this.A03, c166957d9.A03) || !C14360o3.A0K(this.A00, c166957d9.A00) || !C14360o3.A0K(this.A01, c166957d9.A01) || !C14360o3.A0K(this.A02, c166957d9.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public C166957d9(User user, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A03 = str;
        this.A00 = user;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
    }
}
