package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Ac5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23551Ac5 implements C2JL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectShareTarget A02;
    public final /* synthetic */ C211689Zc A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ String A05;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
    }

    public C23551Ac5(Context context, UserSession userSession, DirectShareTarget directShareTarget, C211689Zc c211689Zc, C47Z c47z, String str) {
        this.A04 = c47z;
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = str;
        this.A02 = directShareTarget;
        this.A03 = c211689Zc;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Boolean bool = (Boolean) obj;
        String str = this.A04.A3V;
        if (bool != null && bool.booleanValue() && str != null) {
            AKC akc = A49.A02;
            AKC.A01(this.A00, this.A01, this.A02, this.A03, this.A05, str);
            return;
        }
        C9GR.A0A(this.A00, "error");
        C0w9.A03(this.A05, "sendVideoToMsys saveTask failed.");
    }
}
