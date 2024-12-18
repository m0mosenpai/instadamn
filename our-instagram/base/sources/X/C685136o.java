package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.36o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C685136o {
    public final UserSession A00;
    public final C13920nI A01;
    public final C1DX A02;
    public final InterfaceC60442pS A03;
    public final C23031Ai A04;
    public final C685236p A05;
    public final Map A06;
    public final InterfaceC09390do A07;

    public C685136o(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C685236p c685236p = new C685236p(userSession);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C1DX A002 = C1DW.A00(userSession);
        C13920nI c13920nI = C13920nI.A00;
        this.A00 = userSession;
        this.A03 = interfaceC60442pS;
        this.A05 = c685236p;
        this.A04 = A00;
        this.A02 = A002;
        this.A01 = c13920nI;
        this.A07 = C1XM.A00(new C9EU(this, 26));
        this.A06 = new LinkedHashMap();
    }

    public static final boolean A00(C685136o c685136o) {
        C23031Ai c23031Ai = c685136o.A04;
        if (System.currentTimeMillis() - ((Number) c23031Ai.A6W.CES(c23031Ai, C23031Ai.A8c[529])).longValue() <= C36J.A03(C36H.A04(C36G.A07, C18U.A01(C06090Tz.A05, ((C3BN) c685136o.A05.A00.getValue()).A00, 36610030648629255L)))) {
            return false;
        }
        return true;
    }
}
