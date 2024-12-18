package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Iuo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42693Iuo implements InterfaceC58152PqH {
    public final /* synthetic */ InterfaceC43578JMm A00;
    public final /* synthetic */ C156286zy A01;
    public final /* synthetic */ User A02;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42693Iuo(InterfaceC43578JMm interfaceC43578JMm, C156286zy c156286zy, User user) {
        this.A01 = c156286zy;
        this.A00 = interfaceC43578JMm;
        this.A02 = user;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C156286zy c156286zy = this.A01;
        UserSession userSession = c156286zy.A03;
        Activity activity = c156286zy.A01;
        AbstractC31171DnF.A1P(activity);
        AbstractC55224Oeq.A0A((FragmentActivity) activity, userSession, String.valueOf(this.A00.getFundraiserId()), "USER_PROFILE", this.A02.getId(), null, true);
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C156286zy c156286zy = this.A01;
        Activity activity = c156286zy.A01;
        UserSession userSession = c156286zy.A03;
        InterfaceC43578JMm interfaceC43578JMm = this.A00;
        AbstractC55224Oeq.A04(activity, userSession, String.valueOf(interfaceC43578JMm.getFundraiserId()), "USER_PROFILE", this.A02.getId(), null);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        A00.A6E.Egi(A00, String.valueOf(interfaceC43578JMm.getFundraiserId()), C23031Ai.A8c[293]);
        AbstractC55215Oed.A07(c156286zy.A02, userSession, "user_self_profile_bio_snack_bar", "USER_PROFILE", null, String.valueOf(interfaceC43578JMm.getFundraiserId()), null);
    }
}
