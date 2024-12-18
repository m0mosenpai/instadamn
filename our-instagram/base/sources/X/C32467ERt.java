package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.ERt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32467ERt extends AbstractC65632xz {
    public final AbstractC018607g A00;
    public final C684436h A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final GIQ A04;
    public final InterfaceC77483dY A05;
    public final String A06;
    public final boolean A07;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        FriendshipStatus B8n;
        Boolean CZB;
        View.OnClickListener viewOnClickListenerC35585Fnc;
        Boolean CZC;
        int A03 = C0f9.A03(-1019981493);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.FollowRelationShipViewBinder.Holder");
        FOQ foq = (FOQ) tag;
        Context context = view.getContext();
        User user = (User) obj;
        UserSession userSession = this.A03;
        GIQ giq = this.A04;
        InterfaceC77483dY interfaceC77483dY = this.A05;
        C684436h c684436h = this.A01;
        AbstractC018607g abstractC018607g = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String str = this.A06;
        if (this.A07) {
            TextView textView = foq.A08;
            AbstractC99834e5.A02(textView, userSession, user.getId());
            C0fQ.A00(new ViewOnClickListenerC42010Ijf(interfaceC11380iw, context, userSession, giq, interfaceC77483dY, user, null, 1), textView);
            foq.A00.setVisibility(8);
            foq.A01.setVisibility(8);
            foq.A02.setVisibility(8);
            foq.A0A.A03(8);
        } else {
            FWX.A00(context, foq, user.A1w());
            C0fQ.A00(new FoY(5, interfaceC11380iw, giq, user, foq, abstractC018607g, c684436h, context), foq.A00);
            if (C18U.A06(C06090Tz.A06, userSession, 36313875475204379L)) {
                boolean A23 = user.A23();
                FWX.A01(context, foq, A23);
                C0fQ.A00(new ViewOnClickListenerC35642Foc(c684436h, context, foq, user, interfaceC11380iw, abstractC018607g, userSession, A06, A23), foq.A01);
            } else {
                foq.A01.setVisibility(8);
            }
            TextView textView2 = foq.A07;
            textView2.getClass();
            textView2.setText(2131962726);
            ViewOnClickListenerC35687FpM.A00(foq.A02, 10, interfaceC11380iw, giq);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (user.A1p()) {
                AbstractC31173DnH.A17(context, A1E, 2131976463);
            }
            if (user.A1r()) {
                AbstractC31173DnH.A17(context, A1E, 2131976465);
            }
            FriendshipStatus B8n2 = user.A03.B8n();
            if ((B8n2 != null && (CZC = B8n2.CZC()) != null && CZC.booleanValue()) || ((B8n = user.A03.B8n()) != null && (CZB = B8n.CZB()) != null && CZB.booleanValue())) {
                AbstractC31173DnH.A17(context, A1E, 2131976461);
            }
            if (!A1E.isEmpty()) {
                ((TextView) foq.A09.A01()).setText(AbstractC13670mt.A05(", ", A1E));
            }
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 2342167776724595140L) && (user.A1U() || user.A03.Aah() == IGAIAgentType.A05)) {
                foq.A0A.A03(8);
            } else if (C28151Xt.A02 != null) {
                View A01 = foq.A0A.A01();
                TextView A0T = AbstractC166997dE.A0T(A01, R.id.profile_follow_relationship_row_title);
                View requireViewById = A01.requireViewById(R.id.profile_follow_relationship_row_icon);
                if (user.isRestricted()) {
                    requireViewById.setVisibility(8);
                    AbstractC166987dD.A1P(context, A0T, 2131976188);
                    viewOnClickListenerC35585Fnc = new ViewOnClickListenerC35687FpM(11, giq, user);
                } else {
                    requireViewById.setVisibility(0);
                    AbstractC166987dD.A1P(context, A0T, 2131972499);
                    viewOnClickListenerC35585Fnc = new ViewOnClickListenerC35585Fnc(giq, user, str, 7);
                }
                C0fQ.A00(viewOnClickListenerC35585Fnc, A01);
            }
            TextView textView3 = foq.A08;
            AbstractC99834e5.A02(textView3, userSession, user.getId());
            C0fQ.A00(new ViewOnClickListenerC42010Ijf(interfaceC11380iw, context, userSession, giq, interfaceC77483dY, user, str, 1), textView3);
        }
        C0f9.A0A(278919697, A03);
    }

    public C32467ERt(AbstractC018607g abstractC018607g, C684436h c684436h, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GIQ giq, InterfaceC77483dY interfaceC77483dY, String str, boolean z) {
        this.A04 = giq;
        this.A05 = interfaceC77483dY;
        this.A01 = c684436h;
        this.A00 = abstractC018607g;
        this.A02 = interfaceC11380iw;
        this.A06 = str;
        this.A03 = userSession;
        this.A07 = z;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1815223260);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_profile_relationship_view);
        A0A.setTag(new FOQ(A0A));
        C0f9.A0A(1639176393, A0G);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
