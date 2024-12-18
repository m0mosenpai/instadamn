package X;

import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.payout.activity.PayoutOnboardingFlowActivity;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class FW0 {
    public static final void A00(TextView textView, FragmentActivity fragmentActivity, UserSession userSession, C2Fb c2Fb, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(fragmentActivity, 0);
        AbstractC167027dH.A13(userSession, str, textView);
        AnonymousClass773.A07(new C31759DxC(fragmentActivity, userSession, c2Fb, str4, str, interfaceC16820sZ), textView, str3, str2);
    }

    public static final void A01(Fragment fragment, FragmentActivity fragmentActivity, UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        String str6;
        AbstractC167017dG.A1R(userSession, str);
        C56136Ovw A00 = AbstractC35078Fcp.A00(userSession);
        String A01 = AbstractC35078Fcp.A01(userMonetizationProductType);
        String A02 = AbstractC35078Fcp.A02(userMonetizationProductType);
        String str7 = null;
        if (str2 != null) {
            str6 = AbstractC166997dE.A10(Locale.ROOT, str2);
        } else {
            str6 = null;
        }
        A00.A01(A01, A02, "start", MSV.A00(1483), str, str6, null);
        if (C1YS.A00 == null) {
            C14360o3.A0F("plugin");
            throw C00O.createAndThrow();
        }
        Intent intent = new Intent(fragmentActivity, (Class<?>) PayoutOnboardingFlowActivity.class);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.userId);
        intent.putExtra(MSV.A00(142), userMonetizationProductType.A00);
        if (str2 != null) {
            str7 = AbstractC167007dF.A0h(str2);
        }
        intent.putExtra("ARGUMENT_ORIGIN", str7);
        intent.putExtra("ARGUMENT_DEAL_ID", str3);
        intent.putExtra("ARGUMENT_FE_ID", str4);
        intent.putExtra(AbstractC31189DnY.A03(21, 10, 42), str5);
        intent.addFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
        if (fragment != null) {
            C12260kU.A06(fragment, intent, 8888);
        } else {
            C12260kU.A08(fragmentActivity, intent, 8888);
        }
        fragmentActivity.overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}
