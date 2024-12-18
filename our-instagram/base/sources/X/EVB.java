package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.ConnectContent;

/* loaded from: classes6.dex */
public final class EVB extends AbstractC60592pi {
    public final /* synthetic */ EVP A00;

    public EVB(EVP evp) {
        this.A00 = evp;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        EVP evp = this.A00;
        if (evp.A02 != null) {
            if (i2 == -1 && intent != null) {
                if (i == intent.getIntExtra("argument_requested_code", -1)) {
                    boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
                    String stringExtra = intent.getStringExtra("argument_access_token");
                    if (booleanExtra) {
                        if (stringExtra != null) {
                            Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
                            if (bundleExtra != null) {
                                Parcelable parcelable = bundleExtra.getParcelable("extra_cal_nux_content");
                                if (parcelable != null) {
                                    String str = ((ConnectContent) parcelable).A04;
                                    if (str != null) {
                                        C1ON A0D = AbstractC35276FhB.A0D(evp.A01, stringExtra, str, null, null, null);
                                        A0D.A00 = new C32495ESv(evp);
                                        C1GJ.A03(A0D);
                                        return;
                                    } else {
                                        UserSession userSession = evp.A01;
                                        CallerContext callerContext = C1L2.A00;
                                        C14360o3.A0B(userSession, 0);
                                        C1L2.A02(userSession, false);
                                        return;
                                    }
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    if (stringExtra != null) {
                        if (intent.getBundleExtra("argument_client_extras_bundle") == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    return;
                }
            }
            UserSession userSession2 = evp.A01;
            CallerContext callerContext2 = C1L2.A00;
            C14360o3.A0B(userSession2, 0);
            C1L2.A02(userSession2, false);
        }
    }
}
