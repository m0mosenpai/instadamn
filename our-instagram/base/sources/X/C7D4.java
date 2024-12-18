package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;

/* renamed from: X.7D4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7D4 extends AbstractC159317Cr {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final DirectPromptTypes A02;
    public final C160467Hg A03;
    public final C160487Hi A04;
    public final String A05;
    public final boolean A06;

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A01).A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("add_yours_tool_tip_impression_count", interfaceC19630xq.getInt("add_yours_tool_tip_impression_count", 0) + 1);
        ARD.E7G("add_yours_tool_tip_seen_ts", System.currentTimeMillis());
        ARD.apply();
    }

    public C7D4(InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectPromptTypes directPromptTypes, C160467Hg c160467Hg, C160487Hi c160487Hi, String str, boolean z) {
        super(2131952453);
        this.A01 = userSession;
        this.A04 = c160487Hi;
        this.A03 = c160467Hg;
        this.A02 = directPromptTypes;
        this.A00 = interfaceC11380iw;
        this.A05 = str;
        this.A06 = z;
    }
}
