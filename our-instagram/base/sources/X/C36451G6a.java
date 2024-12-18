package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.G6a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36451G6a implements GZ3 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ String A02;

    @Override // X.GZ3
    public final void DFl(C114675Fx c114675Fx, Integer num) {
        C14360o3.A0B(c114675Fx, 1);
        AbstractC147806l5.A00(this.A00).A0S(this.A01.A00, this.A02, c114675Fx.toString());
    }

    @Override // X.GZ3
    public final void DqN(InterfaceC37134GXv interfaceC37134GXv, Integer num) {
    }

    public C36451G6a(UserSession userSession, DirectThreadKey directThreadKey, String str) {
        this.A00 = userSession;
        this.A01 = directThreadKey;
        this.A02 = str;
    }
}
