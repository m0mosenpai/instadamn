package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lr5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49311Lr5 implements MQ5 {
    public final Context A00;
    public final UserSession A01;
    public final DirectShareTarget A02;
    public final C211689Zc A03;
    public final String A04;

    public C49311Lr5(Context context, UserSession userSession, DirectShareTarget directShareTarget, C211689Zc c211689Zc, String str) {
        C14360o3.A0B(str, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = directShareTarget;
        this.A03 = c211689Zc;
    }

    @Override // X.MQ5
    public final void AJ9(C47Z c47z) {
        AKC akc = A49.A02;
        Context context = this.A00;
        UserSession userSession = this.A01;
        String str = c47z.A33;
        if (str != null) {
            AKC.A00(context, userSession, this.A02, this.A03, "MsysPostMediaConfigureInstruction_photo", str);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.MQ5
    public final String BcD() {
        return this.A04;
    }
}
