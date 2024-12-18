package X;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes6.dex */
public final class GD4 implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Object obj;
        C14360o3.A0B(uri, 0);
        if (bundle != null) {
            obj = bundle.get("target_thread_id");
        } else {
            obj = null;
        }
        String str = (String) obj;
        String queryParameter = uri.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if ((str == null || str.length() == 0) && (queryParameter == null || queryParameter.length() == 0)) {
            return;
        }
        UserSession userSession = this.A01;
        C2DS A00 = C2JD.A00(userSession);
        if (str == null) {
            if (queryParameter != null) {
                str = queryParameter;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C81663kb A0h = AbstractC31172DnG.A0h(A00, str);
        if (A0h == null) {
            return;
        }
        String C7I = A0h.C7I();
        if (C7I != null) {
            AbstractC31278Dp0.A0G(userSession, C7I, A0h.C7g(), false);
            A00.Ean(A0h, true);
        }
        AbstractC31173DnH.A1V(A0h, A00);
        Resources resources = this.A00.getResources();
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC31172DnG.A1H(resources, A0K, 2131958865);
        A0K.A02();
        A0K.A07(R.drawable.instagram_pin_pano_filled_24);
        AbstractC25233BEq.A1F(A0K);
    }

    public GD4(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
