package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5SE, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5SE implements C5H9 {
    public int A00;
    public int A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final UserSession A09;
    public final InterfaceC38371qR A0A;

    public C5SE(UserSession userSession, InterfaceC38371qR interfaceC38371qR) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC38371qR, 2);
        this.A00 = -1;
        this.A01 = -1;
        this.A09 = userSession;
        this.A0A = interfaceC38371qR;
    }

    public C5SE(UserSession userSession, InterfaceC38371qR interfaceC38371qR, Integer num, int i, int i2, boolean z) {
        String str;
        this.A00 = -1;
        this.A01 = -1;
        this.A09 = userSession;
        this.A0A = interfaceC38371qR;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = z;
        switch (num.intValue()) {
            case 0:
                str = "shown_not_highlighted";
                break;
            case 1:
                str = "shown_highlighted";
                break;
            case 2:
                str = "shown_midscene";
                break;
            default:
                str = "not_shown";
                break;
        }
        this.A07 = str;
    }

    @Override // X.C5H9
    public void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(c82713mZ, 2);
        UserSession userSession = this.A09;
        InterfaceC38371qR interfaceC38371qR = this.A0A;
        c82713mZ.A0J(userSession, interfaceC38371qR);
        c82713mZ.A09(this.A01);
        c82713mZ.A4U = this.A04;
        c82713mZ.A13 = Boolean.valueOf(this.A08);
        c82713mZ.A4R = this.A07;
        c82713mZ.A4s = this.A03;
        c82713mZ.A77 = this.A06;
        c82713mZ.A1a = this.A02;
        c82713mZ.A6b = this.A05;
        C32U.A0X(c82713mZ, interfaceC38371qR.BQN(), this.A00);
        C32U.A0G(userSession, c82713mZ, interfaceC38371qR, false);
    }

    public C5SE(UserSession userSession, InterfaceC38371qR interfaceC38371qR, C38616GyJ c38616GyJ) {
        String str;
        C14360o3.A0B(interfaceC38371qR, 2);
        this.A00 = -1;
        this.A01 = -1;
        this.A09 = userSession;
        this.A0A = interfaceC38371qR;
        this.A00 = c38616GyJ.A00;
        this.A01 = c38616GyJ.A01;
        this.A08 = c38616GyJ.A03;
        Integer num = c38616GyJ.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "shown_highlighted";
                    break;
                case 2:
                    str = "shown_midscene";
                    break;
                case 3:
                    str = "not_shown";
                    break;
                default:
                    str = "shown_not_highlighted";
                    break;
            }
        } else {
            str = null;
        }
        this.A07 = str;
    }
}
