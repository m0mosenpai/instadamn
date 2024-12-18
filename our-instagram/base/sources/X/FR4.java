package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FR4 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final FRP A02;

    public final void A01(String str, String str2, String str3) {
        UserSession userSession = this.A01;
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC167007dF.A1b(AbstractC111324zv.A00(124), str3, AbstractC166987dD.A1L("video_fbid", str2), AbstractC166987dD.A1L(AbstractC43591JPw.A00(93), str)));
        FragmentActivity fragmentActivity = this.A00;
        C6XJ A0L = AbstractC31171DnF.A0L(fragmentActivity, A00, userSession, ModalActivity.class, AbstractC111324zv.A00(4423));
        A0L.A0A = true;
        A0L.A0C(fragmentActivity);
    }

    public /* synthetic */ FR4(FragmentActivity fragmentActivity, UserSession userSession) {
        FRP A00 = FVI.A00();
        AbstractC167027dH.A13(userSession, fragmentActivity, A00);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = A00;
    }

    public final void A00(Context context) {
        FVI.A01();
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(this.A01);
        A0C.A0R = "com.bloks.www.ig_subscriptions.creator_experience.welcome_experience";
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A0h = AbstractC31177DnL.A0h();
        C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.ig_subscriptions.creator_experience.welcome_experience", A1G, A1G2);
        A0H.A03 = null;
        A0H.A02 = null;
        AbstractC31174DnI.A18(context, A0C, A0H, A0h);
    }
}
