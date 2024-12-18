package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HbQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39438HbQ extends C30O {
    public final UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39438HbQ(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        super(userSession, interfaceC60442pS, null, false);
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A00 = userSession;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.4Sf] */
    @Override // X.C30P
    public final void A0A(C19280xC c19280xC, C4SW c4sw) {
        C14360o3.A0B(c19280xC, 0);
        ?? obj = new Object();
        obj.A0Z = "clips_midcard";
        c19280xC.A0C("subtype", "clips_midcard");
        if (c4sw != null) {
            c4sw.A07 = obj;
        }
    }

    @Override // X.C30O
    public final C95804So A0C(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C95804So A01 = A01(this.A00, c38321qM);
        A01.A06("subtype", "clips_midcard");
        return A01;
    }

    @Override // X.C30P
    public final Integer A08() {
        return C05F.A1F;
    }
}
