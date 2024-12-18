package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.PIr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56800PIr implements InterfaceC58171Pqb {
    public String A00;
    public List A01;
    public final User A02;

    @Override // X.InterfaceC58171Pqb
    public final EnumC53264Nh2 BO3() {
        return EnumC53264Nh2.A0N;
    }

    @Override // X.InterfaceC58171Pqb
    public final User CDj() {
        return this.A02;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getText() {
        return this.A00;
    }

    public C56800PIr(User user, String str, List list) {
        AbstractC167017dG.A1R(list, str);
        this.A02 = user;
        this.A01 = list;
        this.A00 = str;
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
