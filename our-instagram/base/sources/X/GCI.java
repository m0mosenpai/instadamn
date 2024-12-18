package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GCI implements C5OV {
    public final C17280tP A00 = AbstractC166987dD.A0y();
    public final String A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        String str;
        String str2 = this.A01;
        if (str2 == null) {
            return false;
        }
        C17280tP c17280tP = this.A00;
        InterfaceC16530ry interfaceC16530ry = c17280tP.A08;
        C0YR[] c0yrArr = C17280tP.A4G;
        String str3 = (String) AbstractC31171DnF.A0Y(c17280tP, interfaceC16530ry, c0yrArr, 232);
        if (str3 == null || !str3.equals(str2) || (str = (String) AbstractC31171DnF.A0Y(c17280tP, c17280tP.A07, c0yrArr, 231)) == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public GCI(UserSession userSession) {
        this.A01 = userSession.userId;
    }
}
