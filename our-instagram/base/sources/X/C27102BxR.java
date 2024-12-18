package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BxR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27102BxR extends AbstractC42392Ipt {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;

    @Override // X.AbstractC42392Ipt
    public final String A01(C59062n7 c59062n7) {
        String str;
        UserSession userSession = this.A00;
        Object obj = c59062n7.A03;
        C14360o3.A06(obj);
        C38321qM c38321qM = (C38321qM) obj;
        String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
        if (A0F != null) {
            int hashCode = A0F.hashCode();
            C28209Cc7 c28209Cc7 = C28209Cc7.A03;
            C14360o3.A0B(c28209Cc7, 1);
            C28221CcR c28221CcR = c28209Cc7.A00;
            if (c28221CcR.A02) {
                str = new String(new char[]{"0123456789abcdef".charAt((hashCode >> 28) & 15), "0123456789abcdef".charAt((hashCode >> 24) & 15), "0123456789abcdef".charAt((hashCode >> 20) & 15), "0123456789abcdef".charAt((hashCode >> 16) & 15), "0123456789abcdef".charAt((hashCode >> 12) & 15), "0123456789abcdef".charAt((hashCode >> 8) & 15), "0123456789abcdef".charAt((hashCode >> 4) & 15), "0123456789abcdef".charAt(hashCode & 15)});
            } else {
                long j = hashCode;
                String str2 = c28221CcR.A00;
                int length = str2.length();
                int length2 = "".length();
                long j2 = length + 8 + length2;
                if (0 <= j2 && j2 <= 2147483647L) {
                    int i = (int) j2;
                    char[] cArr = new char[i];
                    if (length != 0) {
                        if (length != 1) {
                            str2.getChars(0, length, cArr, 0);
                        } else {
                            cArr[0] = str2.charAt(0);
                        }
                    }
                    int i2 = 0;
                    int i3 = length;
                    int i4 = 32;
                    do {
                        i4 -= 4;
                        length++;
                        cArr[i3] = "0123456789abcdef".charAt((int) ((j >> i4) & 15));
                        i3 = length;
                        i2++;
                    } while (i2 < 8);
                    if (length2 != 0) {
                        if (length2 != 1) {
                            "".getChars(0, length2, cArr, length);
                        } else {
                            cArr[length] = "".charAt(0);
                        }
                    }
                    int i5 = length + length2;
                    if (i5 == i) {
                        str = new String(cArr);
                    } else {
                        C0eC.A01(i5, i);
                        str = new String(cArr, 0, i5);
                    }
                } else {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("The resulting string length is too big: ");
                    throw AbstractC166987dD.A12(AbstractC166997dE.A0v(AbstractC122695h4.A03(j2), A1C));
                }
            }
        } else {
            str = "";
        }
        return AnonymousClass001.A0R(str, c38321qM.getId());
    }

    public C27102BxR(UserSession userSession, C30W c30w, InterfaceC60442pS interfaceC60442pS) {
        this.A02 = interfaceC60442pS;
        this.A00 = userSession;
        this.A01 = c30w;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        AbstractC167017dG.A1N(c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A03;
        C14360o3.A06(obj);
        C38321qM c38321qM = (C38321qM) obj;
        UserSession userSession = this.A00;
        if (AbstractC41071vF.A0U(userSession, c38321qM) && !A03(c59062n7)) {
            A02(c59062n7, interfaceC57162jr);
            if (A03(c59062n7)) {
                C30W c30w = this.A01;
                InterfaceC60442pS interfaceC60442pS = this.A02;
                C82713mZ A04 = c30w.A04(c38321qM, interfaceC60442pS, "full_view_impression", ((C75113Zb) c59062n7.A04).getPosition(), -1);
                if (A04 != null) {
                    C32U.A0H(userSession, A04, interfaceC60442pS);
                }
            }
        }
    }
}
