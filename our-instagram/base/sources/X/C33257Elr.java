package X;

import android.app.Activity;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33257Elr extends AnonymousClass522 {
    public final /* synthetic */ C1577676k A00;
    public final /* synthetic */ Long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33257Elr(C1577676k c1577676k, Integer num, Long l) {
        super(num);
        this.A00 = c1577676k;
        this.A01 = l;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C1577676k c1577676k = this.A00;
        ((InterfaceC163877Vb) c1577676k.A0A).CMc();
        C66277U6x A00 = C66277U6x.A00("com.bloks.www.ig.gen_ai_agent.education");
        Activity activity = c1577676k.A05;
        UserSession userSession = c1577676k.A07;
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0P = C05F.A01;
        A0C.A00 = 32;
        A00.A05(activity, A0C);
        C1577476i c1577476i = c1577676k.A09;
        if (c1577476i != null) {
            long parseLong = Long.parseLong(userSession.userId);
            Long l = this.A01;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c1577476i.A00, "rai_ux_ig_click");
            if (A0f.isSampled()) {
                A0f.A9K("viewer_igid", Long.valueOf(parseLong));
                AbstractC31171DnF.A1E(A0f, AbstractC111324zv.A00(3866));
                A0f.AAP("component", AbstractC111324zv.A00(4503));
                A0f.A9K("author_id", l);
                A0f.AAP("display_name", "learn_more");
                A0f.AAP(AbstractC34875FYk.A00(20, 10, 116), AbstractC31176DnK.A0u(c1577476i.A01));
                A0f.Cht();
            }
        }
    }
}
