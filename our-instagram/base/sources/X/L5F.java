package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes8.dex */
public final class L5F {
    public final Context A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final InterfaceC16820sZ A07;
    public final View A08;
    public final ViewGroup A09;
    public final UserSession A0A;
    public final IgdsButton A0B;

    public L5F(Context context, View view, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC43594JPz.A1P(userSession, interfaceC16820sZ);
        this.A00 = context;
        this.A0A = userSession;
        this.A08 = view;
        this.A07 = interfaceC16820sZ;
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.recommend_actions_nullstate);
        this.A02 = A0C;
        IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(A0C, R.id.recommend_action_cta_button);
        this.A0B = igdsButton;
        IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.change_goal_button);
        this.A03 = A0d;
        ViewGroup A0C2 = AbstractC31176DnK.A0C(view, R.id.recommend_action_goal_view);
        this.A01 = A0C2;
        this.A06 = AbstractC25231BEo.A0d(A0C2, R.id.goal_view_title);
        this.A05 = AbstractC25231BEo.A0d(A0C2, R.id.goal_view_description);
        this.A09 = AbstractC31176DnK.A0C(A0C2, R.id.completion_pill);
        this.A04 = AbstractC25231BEo.A0d(A0C2, R.id.completion_status);
        C0fQ.A00(new ViewOnClickListenerC48071LPw(this, 2), igdsButton);
        C0fQ.A00(new ViewOnClickListenerC48071LPw(this, 3), A0d);
    }
}
