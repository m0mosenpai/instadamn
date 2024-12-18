package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.NGo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52393NGo extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C006802i A01;
    public final /* synthetic */ C61672rU A02;
    public final /* synthetic */ InterfaceC61642rR A03;
    public final /* synthetic */ C120595d4 A04;
    public final /* synthetic */ AnonymousClass320 A05;
    public final /* synthetic */ EnumC37671p4 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52393NGo(Context context, C006802i c006802i, C61672rU c61672rU, InterfaceC61642rR interfaceC61642rR, C120595d4 c120595d4, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, String str3) {
        super(169758665, 3, false, false);
        this.A01 = c006802i;
        this.A02 = c61672rU;
        this.A04 = c120595d4;
        this.A00 = context;
        this.A09 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A03 = interfaceC61642rR;
        this.A06 = enumC37671p4;
        this.A05 = anonymousClass320;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C55703OoV c55703OoV;
        Double valueOf;
        InterfaceC61642rR interfaceC61642rR;
        EnumC37671p4 enumC37671p4;
        AnonymousClass320 anonymousClass320;
        String str;
        String str2;
        C006802i c006802i = this.A01;
        c006802i.markerPoint(424097382, "runnable_begin");
        C61672rU c61672rU = this.A02;
        c006802i.markerAnnotate(424097382, "threshold", String.valueOf(C61672rU.A00(c61672rU)));
        if (AbstractC31178DnM.A1a(c61672rU.A07)) {
            c55703OoV = new C55703OoV(this.A04);
        } else {
            c55703OoV = null;
        }
        UserSession userSession = c61672rU.A01;
        Context context = this.A00;
        boolean z = true;
        C3SD c3sd = ((C3RS) userSession.A01(C3RS.class, new C57254Pbc(16, context, userSession))).A00;
        c006802i.markerPoint(424097382, "ml_engine_initialization_end");
        OdinContext odinContext = new OdinContext(this.A09, null, null, 30);
        C3SN E59 = c3sd.E59(c55703OoV, odinContext);
        boolean z2 = E59.A02;
        c006802i.markerPoint(424097382, "prediction_end", String.valueOf(z2));
        if (z2) {
            double A00 = MSW.A00(E59.A00);
            c006802i.markerAnnotate(424097382, "score", String.valueOf(A00));
            z = MSY.A1R((A00 > C61672rU.A00(c61672rU) ? 1 : (A00 == C61672rU.A00(c61672rU) ? 0 : -1)));
            String str3 = this.A07;
            String str4 = this.A08;
            valueOf = Double.valueOf(A00);
            interfaceC61642rR = this.A03;
            enumC37671p4 = this.A06;
            anonymousClass320 = this.A05;
            str = str4;
            str2 = str3;
        } else {
            c006802i.markerAnnotate(424097382, TraceFieldType.FailureReason, E59.A01);
            String str5 = this.A07;
            String str6 = this.A08;
            valueOf = Double.valueOf(1.0d);
            interfaceC61642rR = this.A03;
            enumC37671p4 = this.A06;
            anonymousClass320 = this.A05;
            str = str6;
            str2 = str5;
        }
        C61672rU.A01(c61672rU, interfaceC61642rR, anonymousClass320, enumC37671p4, valueOf, str2, str, z);
        if (AbstractC166987dD.A0N(AbstractC166987dD.A17(c61672rU.A02)) > 0) {
            AbstractC24641Ih.A02.Ep8(new C217549jn(context, c55703OoV, odinContext, userSession));
        }
    }
}
