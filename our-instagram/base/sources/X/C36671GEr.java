package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GEr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36671GEr implements GYB {
    public final Context A00;
    public final Handler A01 = AbstractC167007dF.A0J();
    public final FragmentActivity A02;
    public final AbstractC018607g A03;
    public final UserSession A04;
    public final boolean A05;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String queryParameter;
        Context context;
        AbstractC018607g abstractC018607g;
        C1ON A04;
        int i;
        C14360o3.A0B(uri, 0);
        if (bundle != null) {
            queryParameter = bundle.getString("custom_param_phone_number");
        } else {
            queryParameter = uri.getQueryParameter("phone");
        }
        if (uri.getBooleanQueryParameter("autoconfirm", false) && this.A05) {
            context = this.A00;
            abstractC018607g = this.A03;
            A04 = AbstractC152476ta.A02(context, this.A04, C05F.A01, queryParameter);
            i = 6;
        } else {
            context = this.A00;
            abstractC018607g = this.A03;
            A04 = AbstractC152476ta.A04(this.A04, queryParameter);
            i = 7;
        }
        A04.A00 = new EUP(queryParameter, this, i);
        C1GJ.A00(context, abstractC018607g, A04);
    }

    public C36671GEr(Context context, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, UserSession userSession) {
        this.A02 = fragmentActivity;
        this.A00 = context;
        this.A03 = abstractC018607g;
        this.A04 = userSession;
        this.A05 = AbstractC23851Es.A04(context);
    }
}
