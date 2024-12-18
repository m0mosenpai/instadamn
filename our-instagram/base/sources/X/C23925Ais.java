package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ais, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23925Ais implements C9AS {
    public final /* synthetic */ UserSession A00;

    public C23925Ais(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C9AS
    public final void CuN(boolean z) {
        C9AH.A00(this.A00).deactivateUserInstanceSequence(false, B0B.A00);
    }
}
