package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7AW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AW implements C7AX {
    public final UserSession A00;
    public final C7AV A01;
    public final Map A03 = new LinkedHashMap();
    public final C7DL A02 = new C7DL();

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        return (C7D8) this.A02.A01(directMessageIdentifier);
    }

    public C7AW(UserSession userSession, C7AV c7av) {
        this.A00 = userSession;
        this.A01 = c7av;
    }
}
