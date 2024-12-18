package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.GoalsToastInfo;
import com.instagram.api.schemas.GoalsToastType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ius, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42697Ius implements InterfaceC58152PqH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ GoalsToastInfo A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42697Ius(FragmentActivity fragmentActivity, GoalsToastInfo goalsToastInfo, UserSession userSession, C38321qM c38321qM) {
        this.A02 = userSession;
        this.A03 = c38321qM;
        this.A01 = goalsToastInfo;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        String str;
        UserSession userSession = this.A02;
        String A2u = this.A03.A2u();
        GoalsToastInfo goalsToastInfo = this.A01;
        GoalsToastType C97 = goalsToastInfo.C97();
        if (C97 == null || (str = C97.A00) == null) {
            str = "ERROR_FIX_THIS";
        }
        if (A2u != null) {
            long parseLong = Long.parseLong(A2u);
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A01 = "ig_goals";
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_goals_post_publish_toast_click");
            if (A0f.isSampled()) {
                A0f.A9K("media_igid", Long.valueOf(parseLong));
                A0f.AAP("toast_type", str);
                A0f.Cht();
            }
        }
        String Aw9 = goalsToastInfo.Aw9();
        if (Aw9 != null) {
            FragmentActivity fragmentActivity = this.A00;
            if (AbstractC002300n.A0h(Aw9, "instagram://bloks_screen_query", false)) {
                VR9.A00(fragmentActivity, AbstractC25227BEk.A0B(Aw9), userSession);
            } else if (Aw9.startsWith(AbstractC43591JPw.A00(40))) {
                AbstractC70160WDy.A03(userSession, fragmentActivity, Aw9);
            } else {
                if (!AbstractC115215Is.A00(fragmentActivity, userSession, Aw9)) {
                    return;
                }
                AbstractC41776Ies.A03(fragmentActivity, Aw9);
            }
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        String str;
        UserSession userSession = this.A02;
        String A2u = this.A03.A2u();
        GoalsToastType C97 = this.A01.C97();
        if (C97 == null || (str = C97.A00) == null) {
            str = "ERROR_FIX_THIS";
        }
        if (A2u != null) {
            long parseLong = Long.parseLong(A2u);
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A01 = "ig_goals";
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_goals_post_publish_toast_impression");
            if (A0f.isSampled()) {
                A0f.A9K("media_igid", Long.valueOf(parseLong));
                A0f.AAP("toast_type", str);
                A0f.Cht();
            }
        }
    }
}
