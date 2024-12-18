package X;

import com.instagram.user.model.User;

/* renamed from: X.G0j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36314G0j implements InterfaceC43071ya {
    public final int A00;
    public final E8F A01;
    public final C32260EIu A02;
    public final Integer A03;
    public final String A04;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Integer num;
        String str;
        C14360o3.A0B(c59062n7, 0);
        String str2 = null;
        if (interfaceC57162jr != null) {
            num = interfaceC57162jr.CFq(c59062n7);
        } else {
            num = null;
        }
        if (num == C05F.A00) {
            User user = (User) c59062n7.A03;
            Integer num2 = this.A03;
            if (num2 != null && num2.intValue() == 1) {
                C32260EIu c32260EIu = this.A02;
                C14360o3.A0A(user);
                String str3 = this.A04;
                C14360o3.A0B(user, 0);
                if (str3 != null) {
                    if (c32260EIu.A01 == null) {
                        str = "discoverAccountsLogger";
                    } else {
                        user.getId();
                        return;
                    }
                } else {
                    return;
                }
            } else {
                E8F e8f = this.A01;
                if (e8f != null) {
                    C32260EIu c32260EIu2 = this.A02;
                    int i = this.A00;
                    if (num2 != null && num2.intValue() == 2) {
                        str2 = "from_your_contacts";
                    }
                    User user2 = e8f.A00;
                    String str4 = e8f.A05;
                    if (user2 != null) {
                        C63702ur c63702ur = c32260EIu2.A02;
                        if (c63702ur == null) {
                            str = "recommendedUserLogger";
                        } else {
                            c63702ur.A09(new C6PH(C32260EIu.A00(e8f, user2, str4, str2, i)));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public C36314G0j(E8F e8f, C32260EIu c32260EIu, Integer num, String str, int i) {
        this.A03 = num;
        this.A01 = e8f;
        this.A02 = c32260EIu;
        this.A04 = str;
        this.A00 = i;
    }
}
