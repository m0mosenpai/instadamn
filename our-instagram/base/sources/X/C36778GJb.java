package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.GJb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36778GJb implements InterfaceC196048lu {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C35272Fh7 A01;
    public final /* synthetic */ C15370ps A02;

    public C36778GJb(UserSession userSession, C35272Fh7 c35272Fh7, C15370ps c15370ps) {
        this.A00 = userSession;
        this.A02 = c15370ps;
        this.A01 = c35272Fh7;
    }

    @Override // X.InterfaceC196048lu
    public final void onFailure() {
        this.A01.A0C((EnumC33353Eom) this.A02.A00);
    }

    @Override // X.InterfaceC196048lu
    public final void onSuccess() {
        UserSession userSession = this.A00;
        Number number = (Number) AbstractC40751ui.A00(userSession).A06().get("INSTAGRAM");
        if (number != null && number.intValue() > 1) {
            AnonymousClass253 A00 = AnonymousClass252.A00(userSession);
            CallerContext.A01("NativeScreenNavigatorFactory");
            if (A00.A01) {
                this.A02.A00 = EnumC33353Eom.A04;
            }
        }
        this.A01.A0C((EnumC33353Eom) this.A02.A00);
    }
}
