package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* loaded from: classes9.dex */
public final class NDD extends AbstractC61132qb {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C53021Nct A03;

    public NDD(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C53021Nct c53021Nct) {
        AbstractC25233BEq.A0w(2, interfaceC11380iw, context, c53021Nct);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A03 = c53021Nct;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        NZZ A02 = OYB.A02(userSession);
        NYV A01 = OQX.A01(this.A01, userSession);
        OLC A022 = A02.A02();
        MTU A03 = A02.A03();
        Context context = this.A00;
        IgLiveCobroadcastRepository A00 = A02.A00(context, userSession);
        ODQ odq = ((C52817NZa) A02).A00;
        IgLiveBroadcastInfoManager A012 = A02.A01();
        C147856lA c147856lA = A02.A03;
        C56805PIw A013 = A01.A01(context);
        C14360o3.A0B(context, 0);
        C55085Oah c55085Oah = ((NYW) A01).A00;
        if (c55085Oah == null) {
            c55085Oah = new C55085Oah(context, ((AbstractC147746kz) A01).A00, ((AbstractC147746kz) A01).A01);
            ((NYW) A01).A00 = c55085Oah;
        }
        C53021Nct c53021Nct = this.A03;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        return new C51037Mgm(userSession, A013, c55085Oah, A00, A012, c147856lA, odq, A022, A03, c53021Nct, C18U.A01(A0j, userSession, 36599499388489301L), C18U.A01(A0j, userSession, 36599499388882519L), C18U.A06(A0j, userSession, 36312380827108448L), C18U.A06(A0j, userSession, 36318024411715385L));
    }
}
