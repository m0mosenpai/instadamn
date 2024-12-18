package X;

import android.content.Context;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.IgCallModel;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class OW9 {
    public C50737Mar A00;
    public final Context A01;
    public final UserSession A02;
    public final C54610OAl A03;
    public final C52693NTe A04;
    public final C52714NTz A05;
    public final C52703NTo A06;
    public final C54549O8b A07;
    public final C52705NTq A08;
    public final C52704NTp A09;
    public final C52707NTs A0A;
    public final OIz A0B;
    public final C52696NTh A0C;
    public final C55008OVq A0D;
    public final C52694NTf A0E;
    public final C52709NTu A0F;
    public final C52695NTg A0G;
    public final C52711NTw A0H;
    public final C52698NTj A0I;
    public final O4T A0J;
    public final C55135Oc3 A0K;
    public final C52699NTk A0L;
    public final C52700NTl A0M;
    public final NU5 A0N;
    public final C54698OEa A0O;
    public final C52713NTy A0P;
    public final C52712NTx A0Q;
    public final NU0 A0R;
    public final C52706NTr A0S;
    public final C52710NTv A0T;
    public final C52701NTm A0U;
    public final NU2 A0V;
    public final C52702NTn A0W;
    public final C52697NTi A0X;
    public final NU4 A0Y;
    public final C55207OeK A0Z;
    public final NU3 A0a;
    public final C52708NTt A0b;
    public final NU1 A0c;
    public final C54446O4a A0d;
    public final C56139Ovz A0e;
    public final InterfaceC09390do A0f;
    public final C19L A0g;
    public final C05A A0h;
    public final C0UO A0i;

    public /* synthetic */ OW9(Context context, DevXAgentApi devXAgentApi, UserSession userSession, RealtimeClientManager realtimeClientManager, C54610OAl c54610OAl, O4S o4s, C54446O4a c54446O4a, OWf oWf, OWf oWf2, C56139Ovz c56139Ovz) {
        C23324AVj c23324AVj = new C23324AVj(context, EnumC142606cM.A01, userSession, "instagram_vc");
        C14360o3.A0B(c54610OAl, 7);
        this.A01 = context;
        this.A02 = userSession;
        this.A0d = c54446O4a;
        this.A0e = c56139Ovz;
        this.A03 = c54610OAl;
        C19K A02 = AnonymousClass194.A02(AnonymousClass190.A02(C12L.A00.A04, new AnonymousClass197(null)));
        this.A0g = A02;
        C55135Oc3 c55135Oc3 = new C55135Oc3(userSession, c54446O4a, MSW.A1F(this, 41));
        this.A0K = c55135Oc3;
        NU1 nu1 = new NU1(context, c54446O4a);
        this.A0c = nu1;
        this.A0M = new C52700NTl(userSession, c54446O4a);
        this.A09 = new C52704NTp(userSession, c54446O4a);
        this.A0N = new NU5(context, c23324AVj, userSession, nu1, c54446O4a, oWf, new OLL(this), C57548PgM.A01(this, 35));
        this.A04 = new C52693NTe(nu1, c54446O4a);
        this.A0I = new C52698NTj(userSession, c54446O4a);
        C52699NTk c52699NTk = new C52699NTk(userSession, o4s, new OHG(userSession), c54446O4a);
        this.A0L = c52699NTk;
        this.A0D = new C55008OVq(context, userSession, C57548PgM.A01(this, 41), C57548PgM.A01(this, 42), C57548PgM.A01(this, 43));
        this.A0E = new C52694NTf(userSession, c54446O4a);
        this.A0b = new C52708NTt(context, userSession, c54446O4a, AbstractC208910l.A02(c55135Oc3.A0A));
        this.A07 = new C54549O8b(MSW.A1F(this, 37));
        this.A0C = new C52696NTh(nu1, c54446O4a);
        this.A0H = new C52711NTw(userSession, c54446O4a, C57548PgM.A01(this, 46), C57548PgM.A01(this, 47), C57548PgM.A01(this, 48));
        this.A05 = new C52714NTz(nu1, c54446O4a, new C54447O4b(this), C57548PgM.A01(this, 36));
        this.A0B = new OIz(new C54452O4g(this));
        this.A0A = new C52707NTs(userSession, nu1, c54446O4a, C57548PgM.A01(this, 38));
        this.A0V = new NU2(userSession, c54446O4a);
        this.A0T = new C52710NTv(userSession, c54446O4a, new C54456O4k(this));
        this.A0U = new C52701NTm(c54446O4a);
        C57419PeH c57419PeH = C57419PeH.A00;
        this.A0X = new C52697NTi(nu1, (C56126Ovm) userSession.A01(C56126Ovm.class, c57419PeH), c54446O4a);
        this.A0S = new C52706NTr(userSession, nu1, c54446O4a, C57548PgM.A01(this, 40), MSW.A1E(this, 41));
        this.A0W = new C52702NTn(nu1, c54446O4a, oWf);
        this.A06 = new C52703NTo(context, userSession, nu1, c54446O4a, oWf);
        this.A0F = new C52709NTu(context, userSession, nu1, c54446O4a, C57548PgM.A01(this, 44));
        this.A0Y = new NU4(userSession, c54610OAl, o4s, c54446O4a, oWf, new C54451O4f(this), MSW.A1F(this, 39), MSW.A1E(c56139Ovz, 42));
        this.A0Z = new C55207OeK(context, devXAgentApi, c23324AVj, userSession, realtimeClientManager, oWf, new C54453O4h(this), MSW.A1F(c52699NTk, 40), new C57753Pjg(this, 17), A02);
        this.A0O = new C54698OEa(context, new C54823OLg(userSession), new AvatarStore(userSession), C21B.A00(userSession), nu1, new C54449O4d(this), new C54450O4e(this));
        this.A0P = new C52713NTy(context, userSession, nu1, c54446O4a, oWf, new C54448O4c(this));
        this.A0a = new NU3(context, userSession, new PER(this), nu1, c54446O4a, oWf2, new C54457O4l(this));
        this.A0G = new C52695NTg(userSession, c54446O4a);
        this.A0R = new NU0(context, userSession, c54446O4a, oWf, new C54454O4i(this), new C54455O4j(this), C57548PgM.A01(this, 39));
        this.A0Q = new C52712NTx(c54446O4a, C57548PgM.A01(this, 37), MSW.A1F(this, 38));
        this.A08 = new C52705NTq(context, userSession, (C56126Ovm) userSession.A01(C56126Ovm.class, c57419PeH), c54446O4a);
        this.A0J = new O4T(new OHK(this));
        C008002u A1H = AbstractC25225BEi.A1H(new C51759Mti((EngineModel) null, new C51881MwP(null, C05F.A0Y, C05F.A01)));
        this.A0h = A1H;
        this.A0i = AbstractC208910l.A02(A1H);
        this.A0f = AbstractC09440dt.A00(EnumC09460dv.A02, C57548PgM.A01(this, 45));
        PZC.A02(this, A02, 5);
    }

    public static final void A00(C51759Mti c51759Mti, OW9 ow9) {
        MSY.A1N(c51759Mti, ow9.A0h);
        Iterator it = ow9.A0d.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC58155PqK) it.next()).DDj(c51759Mti);
        }
        C54549O8b c54549O8b = ow9.A07;
        C57548PgM A01 = C57548PgM.A01(ow9, 49);
        if (((C51881MwP) c51759Mti.A01).A01 == C05F.A01 && A01.invoke() != null) {
            c54549O8b.A00.postDelayed(c54549O8b.A01, 500L);
        }
    }

    public final IgCallModel A01() {
        EngineModel engineModel = (EngineModel) ((C51759Mti) this.A0h.getValue()).A00;
        if (engineModel != null) {
            return engineModel.callModel;
        }
        return null;
    }
}
