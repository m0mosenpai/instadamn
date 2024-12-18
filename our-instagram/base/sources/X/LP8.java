package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LP8 implements View.OnClickListener {
    public final /* synthetic */ C76223bS A00;
    public final /* synthetic */ C76943cg A01;
    public final /* synthetic */ C76853cX A02;

    public LP8(C76223bS c76223bS, C76943cg c76943cg, C76853cX c76853cX) {
        this.A00 = c76223bS;
        this.A01 = c76943cg;
        this.A02 = c76853cX;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(171260454);
        C1YY A01 = FVI.A01();
        Activity A00 = AbstractC13330mJ.A00(AbstractC77363dM.A00(this.A00));
        C14360o3.A0C(A00, MSV.A00(0));
        UserSession userSession = this.A01.A00;
        C76853cX c76853cX = this.A02;
        User user = c76853cX.A0G;
        String id = user.getId();
        java.util.Set set = FE3.A00;
        A01.A04((FragmentActivity) A00, userSession, AbstractC166997dE.A0a(), AbstractC166997dE.A0b(), id, "subscribe_cta_in_feed");
        C99694dm A002 = AbstractC99684dl.A00(userSession);
        Integer num = C05F.A07;
        String id2 = user.getId();
        String A2u = c76853cX.A09.A01.A2u();
        if (A2u != null) {
            A002.A08(id2, num, A2u);
            C0f9.A0C(1463560181, A05);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0C(-1105865675, A05);
            throw A0g;
        }
    }
}
