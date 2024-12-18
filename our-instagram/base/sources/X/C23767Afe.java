package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.List;

/* renamed from: X.Afe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23767Afe implements InterfaceC25214BDm {
    public final C54132eL A00;
    public final InterfaceC53752dE A01;
    public final C54822fg A02;
    public final UserSession A03;

    @Override // X.InterfaceC25214BDm
    public final void AIF() {
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void E2e() {
    }

    private final void A00(String str) {
        this.A01.FBp(new PositionConfig(null, null, null, str, null, null, null, null, null, null, null, null, null, 0.0f, 0, false));
    }

    @Override // X.InterfaceC25214BDm
    public final void AIG(String str, List list, List list2, boolean z) {
        if (list == null || list.isEmpty()) {
            C1QO c1qo = C1QO.A0C;
            InterfaceC53752dE interfaceC53752dE = this.A01;
            interfaceC53752dE.FBp(new PositionConfig(null, null, null, "return_from_recipient_pickers_to_inbox", null, null, null, null, null, null, null, null, null, 1.0f, 0, false));
            interfaceC53752dE.EfJ(c1qo);
        }
    }

    @Override // X.InterfaceC25214BDm
    public final void Cqw(String str) {
        C14360o3.A0B("media_posted_to_clips", 0);
        A00("media_posted_to_clips");
        this.A01.EfJ(AbstractC58592mI.A00(this.A03).A00());
    }

    @Override // X.InterfaceC25214BDm
    public final void Crg(String str) {
        C14360o3.A0B("media_posted_to_highlight", 0);
        A00("media_posted_to_highlight");
        this.A01.EfJ(C1QO.A0E);
    }

    public C23767Afe(UserSession userSession, InterfaceC53752dE interfaceC53752dE, C54822fg c54822fg) {
        AbstractC167017dG.A1R(c54822fg, interfaceC53752dE);
        this.A03 = userSession;
        this.A02 = c54822fg;
        this.A01 = interfaceC53752dE;
        C54132eL c54132eL = c54822fg.A04;
        C14360o3.A07(c54132eL);
        this.A00 = c54132eL;
    }

    @Override // X.InterfaceC25214BDm
    public final void Cqz(String str) {
        A00(str);
        this.A01.EfJ(C1QO.A0C);
    }
}
