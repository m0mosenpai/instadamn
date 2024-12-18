package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L91 {
    public String A00;
    public String A01;
    public final EffectCollectionService A02;
    public final MO6 A03;
    public final UserSession A04;
    public final C19L A05;

    public final void A00(MPR mpr) {
        C14360o3.A0B(mpr, 0);
        AbstractC166987dD.A1Z(new MCH(mpr, this, (InterfaceC23621Ds) null, 46), this.A05);
    }

    public final void A01(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public L91(Context context, MO6 mo6, C12N c12n, UserSession userSession) {
        C14360o3.A0B(c12n, 5);
        this.A04 = userSession;
        this.A03 = mo6;
        this.A02 = AbstractC142256bi.A00(context, userSession);
        this.A05 = AbstractC167017dG.A0w(c12n, 345149159);
    }
}
