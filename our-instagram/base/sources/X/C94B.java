package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.94B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94B {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C94B(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = AbstractC09440dt.A01(new C206979Ec(this, 6));
        this.A03 = AbstractC09440dt.A01(new C206979Ec(this, 7));
        this.A02 = AbstractC09440dt.A01(new C206979Ec(this, 5));
    }
}
