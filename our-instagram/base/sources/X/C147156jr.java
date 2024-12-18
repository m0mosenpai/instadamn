package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.6jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147156jr implements InterfaceC144656fl {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C145826hf A02;
    public final C147166js A03;
    public final SearchContext A04;
    public final C57852ky A05;
    public final String A06;
    public final String A07;

    public C147156jr(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C145826hf c145826hf, SearchContext searchContext, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = c145826hf;
        this.A04 = searchContext;
        this.A05 = AbstractC57842kx.A00(userSession);
        this.A03 = new C147166js(userSession);
    }

    @Override // X.InterfaceC144656fl
    public final void DOv(EnumC77173d3 enumC77173d3, Reel reel, C41181vS c41181vS) {
        String str;
        String str2;
        C14360o3.A0B(enumC77173d3, 2);
        C38321qM c38321qM = c41181vS.A0b;
        c38321qM.getClass();
        c38321qM.A4C(enumC77173d3);
        UserSession userSession = this.A01;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        String id = c38321qM.getId();
        if (id != null) {
            A00.E4s(new C141936bC(enumC77173d3, id, false));
            C57852ky c57852ky = this.A05;
            String id2 = c38321qM.getId();
            if (id2 != null) {
                InterfaceC11380iw interfaceC11380iw = this.A00;
                String moduleName = interfaceC11380iw.getModuleName();
                String A002 = AbstractC86623ta.A00(c38321qM.A2P());
                int i = (int) reel.A04;
                String str3 = this.A06;
                String str4 = this.A07;
                C14360o3.A0B(moduleName, 2);
                C54785OJb c54785OJb = new C54785OJb();
                c54785OJb.A04 = id2;
                EnumC77173d3 enumC77173d32 = EnumC77173d3.A02;
                if (enumC77173d3 == enumC77173d32) {
                    str = "send_story_like";
                } else {
                    str = "unsend_story_like";
                }
                c54785OJb.A01 = str;
                c54785OJb.A02 = moduleName;
                c54785OJb.A03 = A002;
                c54785OJb.A00 = i;
                c54785OJb.A05 = str3;
                c54785OJb.A06 = str4;
                c57852ky.A0H(id2, c54785OJb);
                String id3 = c38321qM.getId();
                if (id3 != null) {
                    String moduleName2 = interfaceC11380iw.getModuleName();
                    String A003 = AbstractC86623ta.A00(c38321qM.A2P());
                    int i2 = (int) reel.A04;
                    C41141IJg c41141IJg = new C41141IJg(enumC77173d3, c38321qM, reel, c41181vS, this, c54785OJb);
                    SearchContext searchContext = this.A04;
                    C14360o3.A0B(moduleName2, 3);
                    if (enumC77173d3 == enumC77173d32) {
                        str2 = "send_story_like";
                    } else {
                        str2 = "unsend_story_like";
                    }
                    C1ON A004 = AbstractC54226Ny5.A00(userSession, searchContext, id3, str2, moduleName2, A003, str3, str4, i2);
                    A004.A00 = new C39015HFr(c41141IJg);
                    C1GJ.A03(A004);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
