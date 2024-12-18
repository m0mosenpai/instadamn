package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.HashMap;

/* renamed from: X.LmQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49038LmQ implements C7AX {
    public final UserSession A00;
    public final C7IN A03;
    public final L6K A01 = new L6K();
    public final C7DL A02 = new C7DL();
    public final HashMap A04 = AbstractC166987dD.A1G();

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        return (C7D8) this.A02.A01(directMessageIdentifier);
    }

    public C49038LmQ(UserSession userSession, C7IN c7in) {
        this.A03 = c7in;
        this.A00 = userSession;
    }
}
