package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Map;

/* renamed from: X.LmP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49037LmP implements C7AX {
    public final UserSession A00;
    public final AbstractC46451KhB A01;
    public final Map A03 = AbstractC166987dD.A1I();
    public final C7DL A02 = new C7DL();

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        return (C7D8) this.A02.A01(directMessageIdentifier);
    }

    public C49037LmP(UserSession userSession, AbstractC46451KhB abstractC46451KhB) {
        this.A00 = userSession;
        this.A01 = abstractC46451KhB;
    }
}
