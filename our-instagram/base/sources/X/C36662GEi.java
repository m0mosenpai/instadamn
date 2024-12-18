package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36662GEi implements GYB {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        EnumC55212gM enumC55212gM = EnumC55212gM.A2l;
        String obj = uri.toString();
        UserSession userSession = this.A02;
        if (enumC55212gM.A00(userSession, obj)) {
            C17060sy.A01.A01(userSession);
            AbstractC1566271k.A0P(this.A00, userSession, this.A01.getModuleName(), "megaphone", true);
        } else {
            if (!EnumC55212gM.A2k.A00(userSession, uri.toString())) {
                return;
            }
            C1XJ.A00.A0c(this.A00, userSession, this.A01.getModuleName(), true);
        }
    }

    public C36662GEi(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
    }
}
