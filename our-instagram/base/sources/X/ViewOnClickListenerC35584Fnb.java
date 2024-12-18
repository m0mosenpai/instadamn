package X;

import android.content.Context;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Fnb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35584Fnb implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewOnClickListenerC35584Fnb(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.GZx, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1174431274);
                Integer num = C05F.A00;
                C31535DtK c31535DtK = (C31535DtK) this.A03;
                IT8.A01(c31535DtK, C31535DtK.A03(c31535DtK), num);
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("shared_user_id", AbstractC31171DnF.A0g(this.A02));
                C66277U6x A01 = C66277U6x.A01("com.bloks.www.ig.bloks.your_shared_activity.entry", A1G);
                Context context = (Context) this.A01;
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(C31535DtK.A03(c31535DtK));
                AbstractC31171DnF.A10(c31535DtK.requireContext(), A0C, 2131973810);
                A01.A04(context, A0C);
                i = -552069497;
                break;
            case 1:
                A05 = C0f9.A05(1742372487);
                C31535DtK c31535DtK2 = (C31535DtK) this.A03;
                User user = (User) this.A02;
                String id = user.getId();
                C19280xC A00 = C19280xC.A00(c31535DtK2, "user_following_relationship_alert_mute");
                A00.A0C("target_id", id);
                AbstractC31173DnH.A1S(A00, C31535DtK.A03(c31535DtK2));
                ?? obj = new Object();
                C189448aO A0y = AbstractC25225BEi.A0y(C31535DtK.A03(c31535DtK2));
                AbstractC25225BEi.A1Q(A0y, true);
                AbstractC31172DnG.A1G(((Context) this.A01).getResources(), A0y, 2131962726);
                A0y.A00().A02(c31535DtK2.requireActivity(), AbstractC31364DqT.A02().A09(C31535DtK.A03(c31535DtK2), obj, user.getId(), "self_following"));
                i = -1673664731;
                break;
            case 2:
                A05 = C0f9.A05(-340328714);
                HashMap A1G2 = AbstractC166987dD.A1G();
                HashMap A1G3 = AbstractC166987dD.A1G();
                new BitSet(0);
                FTe.A00(new C36028FvQ(this, 4), "com.bloks.www.ig.supervision.screen_time_enforcement.open_settings.async", A1G2, A1G3).A00(AbstractC31172DnG.A0C(this.A02), (C62862tP) this.A03);
                i = 2142126011;
                break;
            default:
                A05 = C0f9.A05(1207332604);
                EMO emo = (EMO) this.A01;
                if (emo.A0D) {
                    UserSession userSession = emo.A01;
                    User user2 = (User) this.A03;
                    String str = emo.A08;
                    C14360o3.A0B(userSession, 0);
                    AJw.A00(emo, userSession, user2, str, AnonymousClass001.A0R("share_business_bottom_sheet_", AbstractC31180DnO.A0k(user2.A03.Ayk())));
                }
                C63397SjR c63397SjR = new C63397SjR(emo.requireActivity(), emo.A01, C2Fb.A4E, ((InterfaceC111194zh) this.A02).getUrl());
                c63397SjR.A0E(AbstractC31171DnF.A0g(this.A03));
                c63397SjR.A0S = I58.A00(emo, emo.A06);
                c63397SjR.A0A();
                i = -1945045477;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
