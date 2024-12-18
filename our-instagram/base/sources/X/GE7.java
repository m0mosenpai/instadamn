package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class GE7 implements GYB {
    public final FragmentActivity A00;
    public final AbstractC12990ll A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        FragmentActivity fragmentActivity = this.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        HashMap A1G = AbstractC166987dD.A1G();
        String queryParameter = uri.getQueryParameter("origin");
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = "deep_link";
        }
        A1G.put("origin", queryParameter);
        AbstractC35275FhA.A0E(fragmentActivity, abstractC12990ll, A1G);
    }

    public GE7(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        this.A00 = fragmentActivity;
        this.A01 = abstractC12990ll;
    }
}
