package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OJA {
    public String A00;
    public final InterfaceC50416MNs A01;
    public final EffectCollectionService A02;
    public final UserSession A03;
    public final C19L A04;

    public final void A00(MPR mpr) {
        C14360o3.A0B(mpr, 0);
        AbstractC166987dD.A1Z(new MCH(mpr, this, (InterfaceC23621Ds) null, 3), this.A04);
    }

    public OJA(Context context, InterfaceC50416MNs interfaceC50416MNs, UserSession userSession, C19L c19l) {
        this.A03 = userSession;
        this.A01 = interfaceC50416MNs;
        this.A04 = c19l;
        this.A02 = AbstractC142256bi.A00(context, userSession);
    }
}
