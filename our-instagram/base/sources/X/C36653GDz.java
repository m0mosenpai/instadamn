package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GDz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36653GDz implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    public C36653GDz(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        HashMap A1G = AbstractC166987dD.A1G();
        UserSession userSession = this.A01;
        AbstractC31181DnP.A0S(W6d.A00(AbstractC31171DnF.A0C(userSession), C66277U6x.A01("com.instagram.group_chat_commerce.messaging_guidance.gcc_messaging_hub.MessagingHubScreen", A1G)), this.A00, userSession);
    }
}