package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class GCX implements GYB {
    public final Context A00;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("package_name");
        if (queryParameter == null) {
            queryParameter = AbstractC31172DnG.A11(uri);
        }
        AbstractC14490oL.A07(this.A00, queryParameter, uri.getQueryParameter("referrer"));
    }

    public GCX(Context context) {
        this.A00 = context;
    }
}
