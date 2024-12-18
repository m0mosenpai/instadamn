package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GDW implements GYB {
    public final Context A00;
    public final Fragment A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        Context context = this.A00;
        PackageManager packageManager = context.getPackageManager();
        String A00 = AbstractC58317Pt9.A00(251);
        if (packageManager != null && packageManager.getLaunchIntentForPackage(A00) != null) {
            C12260kU.A04(AbstractC31177DnL.A07("fb-pma://login"), this.A01);
        } else {
            AbstractC14490oL.A07(context, A00, uri.getQueryParameter("referrer"));
        }
    }

    public GDW(Context context, Fragment fragment) {
        this.A00 = context;
        this.A01 = fragment;
    }
}
