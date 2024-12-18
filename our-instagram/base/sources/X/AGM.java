package X;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class AGM {
    public View A00;
    public ViewGroup A01;
    public ViewStub A02;
    public AGO A03;
    public final FragmentActivity A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final ACU A07;

    public static final SpannableString A00(AGM agm, User user, String str) {
        SpannableString spannableString = new SpannableString(str);
        FragmentActivity fragmentActivity = agm.A04;
        spannableString.setSpan(new C33253Eln(agm, user, fragmentActivity.getColor(AbstractC53242c7.A07(fragmentActivity))), 0, spannableString.length(), 33);
        return spannableString;
    }

    public AGM(ViewStub viewStub, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, InterfaceC59992oh interfaceC59992oh, UserSession userSession, Capabilities capabilities, InterfaceC163977Vl interfaceC163977Vl) {
        AbstractC167017dG.A1S(viewStub, interfaceC11380iw);
        this.A06 = userSession;
        this.A04 = fragmentActivity;
        this.A02 = viewStub;
        this.A05 = interfaceC11380iw;
        this.A07 = AbstractC22719A0p.A00(fragmentActivity.getApplicationContext());
        this.A03 = new AGO(fragmentActivity, interfaceC59992oh, userSession, capabilities, interfaceC163977Vl);
    }
}
