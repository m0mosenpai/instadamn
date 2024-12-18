package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.KEd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45538KEd extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectThreadKey A01;

    public C45538KEd(UserSession userSession, DirectThreadKey directThreadKey) {
        this.A00 = userSession;
        this.A01 = directThreadKey;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1708455951);
        super.onFail(abstractC115105If);
        AbstractC147806l5.A00(this.A00).A0S(this.A01.A00, "configure_voice_message", AbstractC35240FgZ.A00(abstractC115105If).toString());
        C0f9.A0A(1174465874, A0N);
    }
}
