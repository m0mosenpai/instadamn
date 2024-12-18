package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.WeB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70631WeB implements XLK {
    public final /* synthetic */ V16 A00;
    public final /* synthetic */ C70654Wea A01;
    public final /* synthetic */ String A02;

    @Override // X.XLK
    public final void DoL(LinkingAuthState linkingAuthState) {
    }

    @Override // X.XCJ
    public final void DqC(String str) {
        C14360o3.A0B(str, 0);
        V16 v16 = this.A00;
        C70654Wea c70654Wea = this.A01;
        String str2 = this.A02;
        C69785VvQ c69785VvQ = v16.A0C;
        if (c69785VvQ == null) {
            C14360o3.A0F("promoteAdsManagerDataFetcher");
            throw C00O.createAndThrow();
        }
        c69785VvQ.A03(new C67955V3u(v16, c70654Wea, str2, 0), c70654Wea.BZZ(), c70654Wea.A0F, str);
    }

    public C70631WeB(V16 v16, C70654Wea c70654Wea, String str) {
        this.A00 = v16;
        this.A01 = c70654Wea;
        this.A02 = str;
    }

    @Override // X.XCJ
    public final void DFf() {
        String str;
        V16 v16 = this.A00;
        C3FR c3fr = v16.A0H;
        if (c3fr == null) {
            str = "recyclerViewProxy";
        } else {
            c3fr.EWc(false);
            InterfaceC70513Em interfaceC70513Em = v16.A0J;
            if (interfaceC70513Em != null) {
                interfaceC70513Em.setIsLoading(false);
                InterfaceC70513Em interfaceC70513Em2 = v16.A0J;
                if (interfaceC70513Em2 != null) {
                    if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                        SpinnerImageView spinnerImageView = v16.A0K;
                        if (spinnerImageView == null) {
                            str = "loadingSpinner";
                        } else {
                            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                            C67920V2k c67920V2k = v16.A0B;
                            if (c67920V2k == null) {
                                str = "promoteAdToolsAdapter";
                            } else {
                                c67920V2k.A00(v16.A0e);
                            }
                        }
                    }
                    W6I w6i = v16.A07;
                    if (w6i == null) {
                        str = "adsManagerLogger";
                    } else {
                        w6i.A07("promotion_list", AppStateModule.APP_STATE_ACTIVE, this.A01.BZZ(), "FB Login failed or cancelled");
                        AbstractC65702TsY.A17(v16);
                        return;
                    }
                }
            }
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
