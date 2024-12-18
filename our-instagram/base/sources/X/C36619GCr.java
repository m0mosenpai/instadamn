package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36619GCr implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        EnumC55212gM enumC55212gM = EnumC55212gM.A0X;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (enumC55212gM.A00(userSession, obj)) {
            AbstractC31177DnL.A0m();
            C140966Yy A0r = AbstractC25225BEi.A0r(this.A00, userSession);
            A0r.A0B(null, AbstractC34031F0k.A00(userSession, "", null, true, false, false, false, false));
            A0r.A04();
        }
    }

    public C36619GCr(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
