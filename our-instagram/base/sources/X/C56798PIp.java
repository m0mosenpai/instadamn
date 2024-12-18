package X;

import com.instagram.user.model.User;

/* renamed from: X.PIp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56798PIp implements InterfaceC58171Pqb {
    public final long A00 = AbstractC43593JPy.A07();
    public final User A01;
    public final String A02;

    @Override // X.InterfaceC58171Pqb
    public final String getPk() {
        return null;
    }

    @Override // X.InterfaceC58171Pqb
    public final long Asb() {
        return this.A00;
    }

    @Override // X.InterfaceC58171Pqb
    public final EnumC53264Nh2 BO3() {
        return EnumC53264Nh2.A0C;
    }

    @Override // X.InterfaceC58171Pqb
    public final User CDj() {
        return this.A01;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getText() {
        return this.A02;
    }

    public /* synthetic */ C56798PIp(User user, String str) {
        this.A02 = str;
        this.A01 = user;
    }
}
