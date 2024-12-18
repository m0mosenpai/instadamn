package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7FI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FI {
    public final C1GK A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C7FI(Context context, UserSession userSession) {
        this.A01 = userSession;
        this.A03 = C1XM.A00(new C9FA(18, this, context));
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "DirectMediaSendHelper";
        this.A00 = new C1GK(new C18240vB(A00));
        this.A02 = C1XM.A00(new C9FA(17, this, context));
        this.A04 = C1XM.A00(new C9FA(19, this, context));
    }
}
