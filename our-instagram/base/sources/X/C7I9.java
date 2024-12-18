package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7I9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7I9 {
    public boolean A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final View A04;
    public final C18920wW A05;
    public final InterfaceC56392iX A06;

    public C7I9(View view, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(interfaceC11380iw, 4);
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A06 = AbstractC56372iV.A01(view.requireViewById(R.id.direct_thread_business_chat_action_bar), false, false);
        View requireViewById = view.requireViewById(R.id.direct_thread_content_below_action_bar);
        C14360o3.A07(requireViewById);
        this.A04 = requireViewById;
        this.A05 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A02(C2EC c2ec) {
        UserSession userSession = this.A03;
        if (!C7IA.A00(userSession, c2ec, true)) {
            this.A06.setVisibility(8);
            return;
        }
        InterfaceC56392iX interfaceC56392iX = this.A06;
        if (interfaceC56392iX.CGb() != 0) {
            interfaceC56392iX.setVisibility(0);
            View view = this.A04;
            View view2 = interfaceC56392iX.getView();
            view2.measure(-2, -2);
            int measuredHeight = view2.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + measuredHeight, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.setLayoutParams(marginLayoutParams);
        }
        if (this.A00) {
            return;
        }
        View view3 = interfaceC56392iX.getView();
        User Ba5 = c2ec.Ba5();
        if (Ba5 != null) {
            EnumC33473Er8 enumC33473Er8 = EnumC33473Er8.VIEW_PROFILE;
            String str = userSession.userId;
            String id = Ba5.getId();
            View requireViewById = view3.requireViewById(R.id.view_profile_button);
            C14360o3.A07(requireViewById);
            C0fQ.A00(new ViewOnClickListenerC35612Fo3(enumC33473Er8, this, Ba5, str, id), requireViewById);
            A01(enumC33473Er8, str, id);
        }
        String BaA = c2ec.BaA();
        if (BaA != null) {
            EnumC33473Er8 enumC33473Er82 = EnumC33473Er8.APPOINTMENT_REQUEST;
            String str2 = userSession.userId;
            View requireViewById2 = view3.requireViewById(R.id.inquire_button);
            C14360o3.A07(requireViewById2);
            C0fQ.A00(new ViewOnClickListenerC35589Fng(enumC33473Er82, this, str2, BaA), requireViewById2);
            A01(enumC33473Er82, str2, BaA);
        }
        this.A00 = true;
    }

    public static final void A00(EnumC33473Er8 enumC33473Er8, C7I9 c7i9, String str, String str2) {
        C18920wW c18920wW = c7i9.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "p2b_diff_ig_consumer_actions_click");
        if (A00.isSampled()) {
            A00.A9K("user_igid", Long.valueOf(Long.parseLong(str)));
            A00.A9K("business_igid", Long.valueOf(Long.parseLong(str2)));
            A00.A8R(EnumC223309tN.A02, "entrypoint");
            A00.A8R(enumC33473Er8, "action_type");
            A00.Cht();
        }
    }

    private final void A01(EnumC33473Er8 enumC33473Er8, String str, String str2) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "p2b_diff_ig_consumer_actions_impression");
        if (A00.isSampled()) {
            A00.A9K("user_igid", Long.valueOf(Long.parseLong(str)));
            A00.A9K("business_igid", Long.valueOf(Long.parseLong(str2)));
            A00.A8R(EnumC223309tN.A02, "entrypoint");
            A00.A8R(enumC33473Er8, "action_type");
            A00.Cht();
        }
    }
}
