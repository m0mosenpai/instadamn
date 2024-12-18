package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEH implements GYB {
    public final FragmentActivity A00;
    public final AbstractC12990ll A01;

    /* JADX WARN: Type inference failed for: r1v4, types: [X.1P1, X.EjB, X.EUj] */
    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C1ON A0e;
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("use_case");
        AbstractC12990ll abstractC12990ll = this.A01;
        if (queryParameter == null) {
            C25621Ms A0c = AbstractC167017dG.A0c(abstractC12990ll);
            A0c.A0B("security_checkup/start/");
            A0e = AbstractC25227BEk.A0e(A0c, EDB.class, C34866FYb.class);
        } else {
            Integer A0i = AbstractC003100w.A0i(queryParameter);
            C25621Ms A0C = AbstractC31179DnN.A0C(abstractC12990ll);
            A0C.A0B("security_checkup/start/");
            A0C.A0A(A0i, "use_case");
            A0e = AbstractC25227BEk.A0e(A0C, EDB.class, C34866FYb.class);
        }
        FragmentActivity fragmentActivity = this.A00;
        AbstractC10360h2 A0D = AbstractC31172DnG.A0D(fragmentActivity);
        C14360o3.A0C(fragmentActivity, AbstractC58317Pt9.A00(7));
        IgFragmentActivity igFragmentActivity = (IgFragmentActivity) fragmentActivity;
        AbstractC167027dH.A13(A0D, igFragmentActivity, abstractC12990ll);
        ?? abstractC32533EUj = new AbstractC32533EUj(A0D);
        abstractC32533EUj.A00 = A0D;
        abstractC32533EUj.A01 = igFragmentActivity;
        abstractC32533EUj.A02 = abstractC12990ll;
        A0e.A00 = abstractC32533EUj;
        C1GJ.A03(A0e);
    }

    public GEH(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
