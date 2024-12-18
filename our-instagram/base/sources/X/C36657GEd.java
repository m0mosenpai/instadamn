package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36657GEd implements GYB {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        C14360o3.A0B(uri, 0);
        Context context = this.A00;
        PackageManager packageManager = context.getPackageManager();
        String A00 = AbstractC58317Pt9.A00(251);
        if (packageManager.getLaunchIntentForPackage(A00) != null) {
            String Baz = AbstractC31171DnF.A0T(this.A02, C17060sy.A01).Baz();
            if (Baz != null) {
                str = StringFormatUtil.formatStrLocaleSafe("fb-pma://pages/inbox/{#%s}", Baz);
            } else {
                str = "fb-pma://login";
            }
            C12260kU.A04(AbstractC31177DnL.A07(str), this.A01);
            return;
        }
        AbstractC14490oL.A07(context, A00, uri.getQueryParameter("referrer"));
    }

    public C36657GEd(Context context, Fragment fragment, UserSession userSession) {
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = userSession;
    }
}
