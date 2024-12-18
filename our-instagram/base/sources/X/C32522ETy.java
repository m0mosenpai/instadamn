package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.ETy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32522ETy extends C1P1 {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final ProgressButton A03;
    public final EnumC31713DwI A04;

    public C32522ETy(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ProgressButton progressButton, EnumC31713DwI enumC31713DwI) {
        AbstractC167007dF.A1F(userSession, 2, enumC31713DwI);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = enumC31713DwI;
        this.A03 = progressButton;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        String str;
        int A03 = C0f9.A03(-1000272034);
        C14360o3.A0B(abstractC115105If, 0);
        Activity activity = this.A00;
        if (activity != null && !activity.isFinishing()) {
            ProgressButton progressButton = this.A03;
            if (progressButton != null) {
                progressButton.setShowProgressBar(false);
            }
            InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
            if (A0L != null) {
                str = A0L.getErrorMessage();
            } else {
                str = null;
            }
            UserSession userSession = this.A02;
            C47989LJs.A00(userSession, false, this.A04.A01, "client_reg_register_feo2_service_fail", "register auto conf failed", "registration_flow", "ar_code_sms", null, null, str, null);
            AbstractC31525Dt9.A06(activity, null, this.A01, userSession);
            i = 1420382592;
        } else {
            i = -633206948;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        ProgressButton progressButton;
        int A03 = C0f9.A03(858092601);
        super.onStart();
        if (this.A00 != null && (progressButton = this.A03) != null) {
            progressButton.setShowProgressBar(true);
        }
        C0f9.A0A(-1652722847, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(404683185);
        int A032 = C0f9.A03(-1301644236);
        C14360o3.A0B(obj, 0);
        Activity activity = this.A00;
        if (activity != null && !activity.isFinishing()) {
            ProgressButton progressButton = this.A03;
            if (progressButton != null) {
                progressButton.setShowProgressBar(false);
            }
            UserSession userSession = this.A02;
            C47989LJs.A01(userSession, this.A04.A01, "client_reg_register_feo2_service_success", "registration_flow", "ar_code_sms");
            AbstractC31525Dt9.A06(activity, null, this.A01, userSession);
            i = 449275953;
        } else {
            i = 1279955873;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-1800902221, A03);
    }
}
