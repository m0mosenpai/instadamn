package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes6.dex */
public final class G80 implements GZA {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C211739Zk A01;
    public final /* synthetic */ C40701ud A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    @Override // X.GZA
    public final void onActionClicked() {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("supervised_user_id", this.A04);
        A0b.A04("setting_type", this.A03);
        C18C.A0E(true);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(true), "CancelSettingChangeRequest", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59622Qim.class, true, null, 0, null, "xig_cancel_setting_change_request", AbstractC166987dD.A1E());
        C40701ud c40701ud = this.A02;
        InterfaceC16660sJ interfaceC16660sJ = this.A05;
        C211739Zk c211739Zk = this.A01;
        Context context = this.A00;
        C35826Fs2.A00(new C35831Fs7(3, context, c211739Zk, interfaceC16660sJ), pandoGraphQLRequest, c40701ud, context, 11);
    }

    @Override // X.GZA
    public final /* synthetic */ void onBannerDismissed() {
    }

    public G80(Context context, C211739Zk c211739Zk, C40701ud c40701ud, String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = c40701ud;
        this.A05 = interfaceC16660sJ;
        this.A01 = c211739Zk;
        this.A00 = context;
    }
}
