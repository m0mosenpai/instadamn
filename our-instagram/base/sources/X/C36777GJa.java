package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GJa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36777GJa implements InterfaceC196048lu {
    public final /* synthetic */ UserSession A00;

    @Override // X.InterfaceC196048lu
    public final void onFailure() {
    }

    public C36777GJa(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1vw, java.lang.Object] */
    @Override // X.InterfaceC196048lu
    public final void onSuccess() {
        AbstractC54332en.A00(this.A00).A04(EnumC54222eY.A0Z);
        C41451vu.A01.E4s(new Object());
    }
}
