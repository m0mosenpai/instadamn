package X;

import com.instagram.user.model.User;

/* renamed from: X.PIn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56796PIn implements InterfaceC58171Pqb {
    public final User A00;
    public final String A01;

    public C56796PIn(User user, String str) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
        this.A01 = str;
    }

    @Override // X.InterfaceC58171Pqb
    public final EnumC53264Nh2 BO3() {
        return EnumC53264Nh2.A0F;
    }

    @Override // X.InterfaceC58171Pqb
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getText() {
        return this.A01;
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
