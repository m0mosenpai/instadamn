package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.feeditem.SuggestedChannels;

/* renamed from: X.Fn5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35553Fn5 implements View.OnClickListener {
    public final /* synthetic */ SuggestedChannels A00;
    public final /* synthetic */ C65092x7 A01;

    public ViewOnClickListenerC35553Fn5(SuggestedChannels suggestedChannels, C65092x7 c65092x7) {
        this.A01 = c65092x7;
        this.A00 = suggestedChannels;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment;
        int A05 = C0f9.A05(2084378882);
        C65092x7 c65092x7 = this.A01;
        SuggestedChannels suggestedChannels = this.A00;
        UserSession userSession = c65092x7.A03;
        C36279FzW A00 = AbstractC34241F8n.A00(userSession);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00.A00, "igd_channels_client_actions");
        if (A0f.isSampled()) {
            A0f.AAP("user_igid", A00.A01);
            AbstractC31171DnF.A1B(A0f, "all_netego_feed_suggestion_rendered");
            AbstractC31171DnF.A1E(A0f, "feed_netego");
            AbstractC25232BEp.A1K(A0f, "see_all_button");
            A0f.Cht();
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36319377330740575L)) {
            Fragment c32727Eas = new C32727Eas();
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putSerializable("ChannelDiscoverySuggestionsFragment.ARG_CHANNEL_SUGGESTIONS_ENTRYPOINT", EnumC33329EoO.A03);
            c32727Eas.setArguments(A0b);
            fragment = c32727Eas;
        } else {
            Bundle A0D = AbstractC31174DnI.A0D(userSession);
            A0D.putParcelable("suggested_channels_key", suggestedChannels);
            EJ4 ej4 = new EJ4();
            ej4.setArguments(A0D);
            ej4.A00 = c65092x7;
            fragment = ej4;
        }
        Activity activity = c65092x7.A01;
        C14360o3.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C140966Yy A0P = AbstractC31173DnH.A0P((FragmentActivity) activity, userSession);
        A0P.A0D(fragment);
        A0P.A04();
        C0f9.A0C(728703920, A05);
    }
}
