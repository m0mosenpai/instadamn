package X;

import android.content.Context;
import com.facebook.pando.Summary;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MWH implements C2JL {
    public Integer A00;
    public final Context A01;
    public final UserSession A02;
    public final C1GL A03;
    public final C154796xU A04;
    public final C62112sC A05;
    public final InterfaceC154766xR A06;
    public final EnumC125775mS A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        this.A03.schedule(new G0E(0, this, th));
    }

    public MWH(Context context, UserSession userSession, C1GL c1gl, C154796xU c154796xU, C62112sC c62112sC, InterfaceC154766xR interfaceC154766xR, EnumC125775mS enumC125775mS, boolean z, boolean z2) {
        C14360o3.A0B(c154796xU, 8);
        this.A08 = z;
        this.A09 = z2;
        this.A02 = userSession;
        this.A01 = context;
        this.A05 = c62112sC;
        this.A06 = interfaceC154766xR;
        this.A07 = enumC125775mS;
        this.A04 = c154796xU;
        this.A03 = c1gl;
        this.A00 = C05F.A00;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        if (Systrace.A0E(1L)) {
            C0fO.A01("PROFILE_ON_SUCCESS", -1284189814);
        }
        if (anonymousClass435 == null) {
            onFailure(new Throwable("Unexpected null IGProfileTimelineQueryResponse result"));
            return;
        }
        InterfaceC154766xR interfaceC154766xR = this.A06;
        interfaceC154766xR.DRa("profile_on_data_bg", null);
        Summary summary = anonymousClass435.A00;
        long j = summary.requestStartTime;
        if (j > 0) {
            interfaceC154766xR.DRa("profile_request_start", Long.valueOf(j));
        }
        long j2 = summary.networkStartTime;
        if (j2 > 0) {
            interfaceC154766xR.DRa("profile_network_start", Long.valueOf(j2));
        }
        long j3 = summary.networkEndTime;
        if (j3 > 0) {
            interfaceC154766xR.DRa("profile_network_end", Long.valueOf(j3));
        }
        long j4 = summary.networkResponseStartTime;
        if (j4 > 0) {
            interfaceC154766xR.DRa("profile_network_response_start", Long.valueOf(j4));
        }
        long j5 = summary.parseStartTime;
        if (j5 > 0) {
            interfaceC154766xR.DRa("profile_parse_start", Long.valueOf(j5));
        }
        long j6 = summary.parseEndTime;
        if (j6 > 0) {
            interfaceC154766xR.DRa("profile_parse_end", Long.valueOf(j6));
        }
        C51758Mth c51758Mth = new C51758Mth(37, (Object) Boolean.valueOf(summary.isFinal), true);
        interfaceC154766xR.DRa("profile_graphql_model_conversion_start", null);
        C123645id A00 = AbstractC37979GnM.A00(anonymousClass435, this.A02);
        interfaceC154766xR.DRa("profile_graphql_model_conversion_end", null);
        if (Systrace.A0E(1L)) {
            C0fO.A00(1781092601);
        }
        this.A03.schedule(new C50620MWh(c51758Mth, anonymousClass435, this, A00));
    }
}
