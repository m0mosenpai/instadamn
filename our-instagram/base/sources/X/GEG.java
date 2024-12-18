package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class GEG implements GYB {
    public final AbstractC59962oe A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        HashMap A00;
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("bloks_app_id");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("params");
            C6WQ c6wq = null;
            if (queryParameter2 != null) {
                try {
                    A00 = FTf.A00(C07950bF.A04.A01(this.A01, queryParameter2));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                A00 = null;
            }
            AbstractC59962oe abstractC59962oe = this.A00;
            FragmentActivity activity = abstractC59962oe.getActivity();
            if (activity != null) {
                c6wq = AbstractC31174DnI.A0i(activity);
                AbstractC31176DnK.A13(activity, c6wq);
                C0fJ.A00(c6wq);
            }
            AbstractC192798gL A05 = C192108fB.A05(this.A01, queryParameter, A00);
            C32394EOv.A00(A05, c6wq, this, 10);
            abstractC59962oe.schedule(A05);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public GEG(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = (AbstractC59962oe) fragment;
    }
}
