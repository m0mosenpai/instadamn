package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes8.dex */
public final class L3J {
    public int A00;
    public int A01;
    public final Ld5 A02;
    public final MessageIdentifier A03;
    public final String A04;

    public L3J(UserSession userSession, String str, String str2, String str3, C19L c19l, C0UO c0uo) {
        C14360o3.A0B(str3, 5);
        MessageIdentifier messageIdentifier = new MessageIdentifier(str, str2);
        Ld5 ld5 = (Ld5) userSession.A01(Ld5.class, new C37017GSy(userSession, 5));
        C14360o3.A0B(ld5, 5);
        AbstractC166987dD.A1Z(new C57161PZf(ld5, c0uo, this, messageIdentifier, str3, null, 13), c19l);
        this.A02 = ld5;
        this.A03 = messageIdentifier;
        this.A04 = str3;
    }
}
