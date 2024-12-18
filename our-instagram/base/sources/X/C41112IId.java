package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.IId, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41112IId {
    public final C39436HbO A00;
    public final HashMap A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.30O, X.HbO] */
    public C41112IId(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = AbstractC166987dD.A1G();
        this.A00 = new C30O(userSession, AbstractC60952qJ.A01(interfaceC11380iw.getModuleName(), false, false), null, false);
    }
}
