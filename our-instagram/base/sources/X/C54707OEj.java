package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.OEj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54707OEj {
    public TextView A00;
    public TextView A01;
    public final View A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final O98 A05;
    public final String A06;

    public C54707OEj(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg, O98 o98, String str) {
        String str2;
        User user;
        boolean A1a = AbstractC31175DnJ.A1a(view);
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A06 = str;
        this.A05 = o98;
        View findViewById = view.findViewById(R.id.iglive_fan_club_subscribe);
        findViewById = findViewById == null ? AbstractC43594JPz.A0F(view, R.id.iglive_fan_club_subscribe_stub) : findViewById;
        this.A02 = findViewById;
        this.A01 = AbstractC167007dF.A0N(findViewById, R.id.content);
        this.A00 = AbstractC167007dF.A0N(findViewById, R.id.action_button);
        TextView textView = this.A01;
        C51709Mse A0U = MSX.A0U((IgLiveBroadcastInfoManager) AbstractC147826l7.A0K.A00(userSession, enumC142806cg).A05.getValue());
        if (A0U != null && (user = A0U.A05) != null) {
            str2 = user.getUsername();
        } else {
            str2 = null;
        }
        AbstractC31177DnL.A0r(context, textView, str2, 2131965400);
        AbstractC166987dD.A1P(context, this.A00, C18U.A06(C06090Tz.A05, userSession, 36328328038202833L) ? 2131962187 : 2131965399);
        ViewOnClickListenerC55463OkI.A00(this.A00, A1a ? 1 : 0, this);
    }
}
