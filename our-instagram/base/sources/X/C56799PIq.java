package X;

import com.instagram.user.model.User;

/* renamed from: X.PIq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56799PIq implements InterfaceC58171Pqb {
    public boolean A00;
    public final User A01;
    public final String A02;

    public C56799PIq(User user, String str) {
        C14360o3.A0B(user, 1);
        this.A01 = user;
        this.A02 = str;
    }

    @Override // X.InterfaceC58171Pqb
    public final EnumC53264Nh2 BO3() {
        if (this.A00) {
            return EnumC53264Nh2.A0E;
        }
        return EnumC53264Nh2.A0D;
    }

    @Override // X.InterfaceC58171Pqb
    public final User CDj() {
        return this.A01;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getText() {
        return this.A02;
    }

    @Override // X.InterfaceC58171Pqb
    public final long Asb() {
        return AbstractC43593JPy.A07();
    }

    @Override // X.InterfaceC58171Pqb
    public final String getPk() {
        return String.valueOf(super.hashCode());
    }
}
