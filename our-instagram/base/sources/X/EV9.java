package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EV9 extends AbstractC60592pi {
    public final /* synthetic */ EVQ A00;

    public EV9(EVQ evq) {
        this.A00 = evq;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        C34517FJd c34517FJd;
        EVQ evq = this.A00;
        CallerContext callerContext = EVQ.A0B;
        if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra = intent.getStringExtra("argument_access_token");
            if (booleanExtra) {
                if (stringExtra != null) {
                    Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
                    if (bundleExtra != null) {
                        if (bundleExtra.getString("extra_cal_fb_user_id") != null && bundleExtra.getStringArrayList("extra_cal_usernames") != null && bundleExtra.getStringArray("extra_cal_usernames_with_metadata") != null) {
                            C023409i.A0A.A07(AbstractC31176DnK.A09(stringExtra));
                            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("extra_cal_usernames");
                            stringArrayList.getClass();
                            String[] stringArray = bundleExtra.getStringArray("extra_cal_usernames_with_metadata");
                            stringArray.getClass();
                            ArrayList A17 = AbstractC25225BEi.A17(stringArray.length);
                            for (String str : stringArray) {
                                try {
                                    c34517FJd = AbstractC34297FAr.parseFromJson(C16V.A00(str));
                                } catch (IOException unused) {
                                    c34517FJd = null;
                                }
                                A17.add(c34517FJd);
                            }
                            EVQ.A06(evq, bundleExtra.getString("extra_cal_tos_version"), stringExtra, stringArrayList, A17, true, bundleExtra.getBoolean("extra_cal_force_signup_with_fb_after_cp_claiming"));
                            return;
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else if (stringExtra != null) {
                if (intent.getBundleExtra("argument_client_extras_bundle") == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
            EVQ.A03(evq);
        }
    }
}
