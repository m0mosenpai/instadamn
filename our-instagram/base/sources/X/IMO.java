package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IMO {
    public final UserSession A00;
    public final AbstractC64162vb A01;
    public final C57112jm A02;
    public final C38132Gpz A03;
    public final C38133Gq0 A04;
    public final C42379Ipg A05;
    public final C38131Gpy A06;
    public final C64092vU A07;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(View view, C5qT c5qT, C127915qK c127915qK, AbstractC127945qN abstractC127945qN, boolean z) {
        C59072n8 A00 = C59062n7.A00(abstractC127945qN, new C38162GqT(c5qT, c127915qK), abstractC127945qN.getKey());
        A00.A00(this.A05);
        if (abstractC127945qN instanceof C37931GmT) {
            A00.A00(this.A06);
            A00.A00(this.A01);
        }
        if (z && (abstractC127945qN instanceof InterfaceC127965qP) && ((InterfaceC127965qP) abstractC127945qN).CQJ()) {
            A00.A00(this.A03);
        }
        if (C18U.A06(C06090Tz.A05, this.A00, 36315133899181101L)) {
            C38133Gq0 c38133Gq0 = this.A04;
            ((AbstractC64292vo) c38133Gq0).A00.put(abstractC127945qN, view);
            A00.A00(c38133Gq0);
        }
        AbstractC25227BEk.A10(view, A00, this.A02);
    }

    public IMO(C18920wW c18920wW, UserSession userSession, C57112jm c57112jm, JI3 ji3, C41587Iaa c41587Iaa, InterfaceC60442pS interfaceC60442pS) {
        AbstractC37302Gc3.A1U(userSession, ji3);
        this.A02 = c57112jm;
        this.A00 = userSession;
        this.A03 = new C38132Gpz(ji3);
        this.A05 = new C42379Ipg(c41587Iaa, null);
        C64092vU A0R = AbstractC37302Gc3.A0R(userSession);
        this.A07 = A0R;
        this.A06 = new C38131Gpy(c18920wW, userSession, interfaceC60442pS, A0R);
        this.A01 = new C38129Gpw(userSession, null, interfaceC60442pS);
        this.A04 = new C38133Gq0(userSession, interfaceC60442pS);
    }
}
