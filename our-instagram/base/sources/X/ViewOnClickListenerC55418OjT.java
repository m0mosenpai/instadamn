package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;

/* renamed from: X.OjT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55418OjT implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public ViewOnClickListenerC55418OjT(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(478477937);
                view.setOnClickListener(null);
                ((TextView) this.A01).setText(this.A04);
                C54841OMk c54841OMk = ((AbstractC51367MmS) this.A03).A00;
                if (c54841OMk != null) {
                    String obj = ((C51654Mrl) this.A02).A03.toString();
                    C14360o3.A0B(obj, 0);
                    C54976OTi A02 = AbstractC51040Mgq.A02(c54841OMk.A00);
                    InterfaceC58268PsC.A00(C54976OTi.A00(A02, obj, null), A02.A00, A02.A01, "lead_gen_multi_step_consumer_questions", "inline_context_card_expand_description");
                }
                i = 254635874;
                break;
            case 1:
                A05 = C0f9.A05(324255742);
                OB3 ob3 = (OB3) this.A02;
                C52174N7f c52174N7f = ob3.A01;
                User user = ob3.A02;
                C52174N7f.A00(c52174N7f, user, ob3.A00);
                InterfaceC58082Pp7 interfaceC58082Pp7 = c52174N7f.A05;
                if (interfaceC58082Pp7 != null) {
                    interfaceC58082Pp7.AAT(user, false);
                }
                OY9.A01(AbstractC166987dD.A0f((C18920wW) this.A01, "ig_add_collaborator_edit_confirmation_tag_tap"), this.A04);
                i = -611375723;
                break;
            case 2:
                A05 = C0f9.A05(1897582920);
                OB3 ob32 = (OB3) this.A02;
                C52174N7f.A01(ob32.A01, ob32.A02, ob32.A00);
                OY9.A01(AbstractC166987dD.A0f((C18920wW) this.A01, "ig_add_collaborator_edit_confirmation_confirm_tap"), this.A04);
                i = -1647909391;
                break;
            case 3:
                A05 = C0f9.A05(-1312224787);
                IgLiveOptionsDialogViewModel A00 = C55064OaK.A00(this.A03);
                Object obj2 = this.A02;
                String str = this.A04;
                AbstractC166987dD.A1Z(new PZQ(obj2, A00, str, null, 29), MSX.A0B(A00, str, 2));
                i = 1467740200;
                break;
            case 4:
                A05 = C0f9.A05(-1965923379);
                AbstractC13880nE.A0O(((C54708OEk) this.A02).A01);
                FundraiserCampaignTypeEnum B9C = ((InterfaceC39031rc) this.A01).B9C();
                FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = FundraiserCampaignTypeEnum.A0C;
                O7C o7c = ((ODV) this.A03).A02;
                String str2 = this.A04;
                C166887d0 c166887d0 = o7c.A01;
                InterfaceC16820sZ interfaceC16820sZ = c166887d0.A05;
                if (B9C == fundraiserCampaignTypeEnum) {
                    Context context = (Context) interfaceC16820sZ.invoke();
                    if (context != null) {
                        C38321qM BQN = o7c.A00.BQN();
                        UserSession userSession = c166887d0.A03;
                        AbstractC55224Oeq.A02(context, userSession, str2, AbstractC37303Gc4.A0T(userSession, BQN), BQN.A2u());
                        c166887d0.A06.invoke();
                    }
                    i = 1949565462;
                    break;
                } else {
                    FragmentActivity fragmentActivity = (FragmentActivity) interfaceC16820sZ.invoke();
                    if (fragmentActivity != null) {
                        C38321qM BQN2 = o7c.A00.BQN();
                        UserSession userSession2 = c166887d0.A03;
                        AbstractC55215Oed.A08(c166887d0.A04, userSession2, "feed_post_comments_upsell", "FEED_POST_COMMENTS", str2, null);
                        String id = BQN2.getId();
                        String A34 = BQN2.A34();
                        AbstractC72143Ln.A01 = id;
                        AbstractC72143Ln.A00 = A34;
                        AbstractC55224Oeq.A09(fragmentActivity, userSession2, str2, "FEED_POST_COMMENTS", AbstractC37303Gc4.A0T(userSession2, BQN2), BQN2.A2u());
                        c166887d0.A06.invoke();
                    }
                    i = 1949565462;
                }
            default:
                return;
        }
        C0f9.A0C(i, A05);
    }
}
