package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36626GCy implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        EnumC160197Gf enumC160197Gf;
        C14360o3.A0B(uri, 0);
        if (C14360o3.A0K(uri.getQueryParameter("command"), AbstractC111324zv.A00(1004))) {
            enumC160197Gf = EnumC160197Gf.A05;
        } else {
            enumC160197Gf = EnumC160197Gf.A03;
        }
        AbstractC31265Don.A00().A01(this.A00, EnumC33519Ers.A0E, this.A01, enumC160197Gf, false, false);
    }

    public C36626GCy(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
