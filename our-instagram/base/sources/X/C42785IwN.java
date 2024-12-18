package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IwN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42785IwN implements InterfaceC71931XAz {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public C42785IwN(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, User user) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = user;
        this.A01 = abstractC59962oe;
    }

    @Override // X.InterfaceC71931XAz
    public final void D2y(boolean z, boolean z2) {
        C44I AqZ;
        String Bhk;
        Context context = this.A00;
        Activity activity = (Activity) AbstractC167197dY.A00(context, Activity.class);
        if (activity != null) {
            AbstractC167017dG.A0y(activity, C3DN.A00);
        }
        if (z) {
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = this.A02;
            InterfaceC43578JMm BzX = c08730cb.A01(userSession).A03.BzX();
            if ((BzX == null || !BzX.BB3()) && C18U.A06(C06090Tz.A05, userSession, 36312767371674879L)) {
                User user = this.A03;
                AbstractC59962oe abstractC59962oe = this.A01;
                C44K AnF = user.A03.AnF();
                if (AnF != null && (AqZ = AnF.AqZ()) != null && (Bhk = AqZ.Bhk()) != null) {
                    C66277U6x A01 = C66277U6x.A01("com.instagram.social_impact.fundraiser.component.nonprofit_profile_create", AbstractC06930Yk.A02(AbstractC166987dD.A1L(AbstractC111324zv.A00(5114), Bhk)));
                    FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                    IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
                    A0C.A0l = false;
                    A0C.A0k = false;
                    A0C.A0P = C05F.A01;
                    A01.A04(requireActivity, A0C);
                    return;
                }
                return;
            }
        }
        UserSession userSession2 = this.A02;
        if (AbstractC166987dD.A0x(userSession2).getInt("donation_sticker_profile_dialog_prompt_shown_count", 0) >= 3) {
            return;
        }
        User user2 = this.A03;
        int i = AbstractC166987dD.A0x(userSession2).getInt("donation_sticker_profile_dialog_prompt_shown_count", 0);
        AbstractC59962oe abstractC59962oe2 = this.A01;
        AbstractC167007dF.A18(AbstractC23021Ah.A00(userSession2).A01, "donation_sticker_profile_dialog_prompt_shown_count", i + 1);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131970139);
        AbstractC31177DnL.A0v(context, A0I, user2.getFullName(), 2131970137);
        A0I.A0J(new DialogInterfaceOnClickListenerC23161AOa(2, context, abstractC59962oe2, userSession2, user2), 2131970138);
        A0I.A0H(null, 2131968687);
        AbstractC166987dD.A1W(A0I);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe2, userSession2), "ig_cg_view_create_story_profile_dialog_prompt");
        A0f.AAP("source_name", AbstractC111324zv.A00(1710));
        A0f.Cht();
    }
}
