package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;

/* renamed from: X.EWa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32575EWa extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final FKR A02;
    public final boolean A03;
    public final boolean A04;

    public C32575EWa(InterfaceC11380iw interfaceC11380iw, UserSession userSession, FKR fkr, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = fkr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi, java.lang.Object] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new DirectShareSheetFragmentViewModel(userSession, this.A02, new Object(), FV2.A00(this.A00, userSession), AnonymousClass189.A00(userSession), this.A03, this.A04);
    }
}
