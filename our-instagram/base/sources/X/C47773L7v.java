package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.L7v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47773L7v {
    public C2AH A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;

    public C47773L7v(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC25234BEr.A0j(1, context, interfaceC11380iw, str, str2);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = new C43922JbX(this, 16);
    }

    public final void A00(InterfaceC137546La interfaceC137546La) {
        C14360o3.A0B(interfaceC137546La, 0);
        if (Build.VERSION.SDK_INT < 33) {
            Context context = this.A01;
            if (!AbstractC23451Ch.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C48291LYp c48291LYp = new C48291LYp(6, new CallableC43825JZn(15, interfaceC137546La, this), this);
                C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                AbstractC43592JPx.A1C((Activity) context, c48291LYp, "android.permission.WRITE_EXTERNAL_STORAGE");
                return;
            }
        }
        try {
            C121275eQ c121275eQ = new C121275eQ(new CallableC43825JZn(16, interfaceC137546La, this), 1775937301);
            c121275eQ.A00 = this.A00;
            C1GJ.A03(c121275eQ);
        } catch (Exception unused) {
        }
    }
}
