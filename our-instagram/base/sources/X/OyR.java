package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* loaded from: classes9.dex */
public final class OyR implements InterfaceC25207BDf {
    public final Context A00;
    public final AbstractC10360h2 A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C75113Zb A04;
    public final C54798OJr A05;
    public final boolean A06;

    @Override // X.InterfaceC25207BDf
    public final void DqC(String str) {
        C14360o3.A0B(str, 0);
        new C57259Pbh(str, this, 31).invoke();
    }

    @Override // X.InterfaceC25207BDf
    public final void onStart() {
    }

    public static final void A00(OyR oyR) {
        C54798OJr c54798OJr = oyR.A05;
        C47Z c47z = c54798OJr.A03;
        if (c47z != null) {
            MSZ.A1N(AbstractC166987dD.A11(c47z.A1N.A0F));
            MSZ.A1N(MSW.A0w(AbstractC916948n.A03(), c47z.A3w));
        }
        File file = c54798OJr.A05;
        if (file != null) {
            MSZ.A1N(file);
        }
        File file2 = c54798OJr.A04;
        if (file2 != null) {
            MSZ.A1N(file2);
        }
    }

    @Override // X.InterfaceC25207BDf
    public final void DFi(Exception exc) {
        if (C18U.A06(C06090Tz.A05, this.A02, 36326232094160647L)) {
            A00(this);
        }
        C9GR.A0A(this.A00, "watermark_render_failed");
    }

    @Override // X.InterfaceC25207BDf
    public final void onFinish() {
        if (!C18U.A06(C06090Tz.A05, this.A02, 36326386713114465L)) {
            AbstractC63248Sg4.A01(this.A01);
        }
    }

    public OyR(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C54798OJr c54798OJr, boolean z) {
        AbstractC37302Gc3.A1U(abstractC10360h2, interfaceC60442pS);
        C14360o3.A0B(c54798OJr, 6);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = abstractC10360h2;
        this.A03 = interfaceC60442pS;
        this.A04 = c75113Zb;
        this.A05 = c54798OJr;
        this.A06 = z;
    }
}
