package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;

/* renamed from: X.Wdy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70620Wdy implements XCJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70620Wdy(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XCJ
    public final void DFf() {
        String str;
        W6I w6i;
        String BZZ;
        String str2;
        String str3;
        String str4;
        V15 v15;
        switch (this.A00) {
            case 0:
                C131845xK.A00((C6FQ) this.A02, C6FW.A01, (InterfaceC103384lE) this.A01);
                return;
            case 1:
            case 2:
            case 4:
            default:
                return;
            case 3:
                V16 v16 = (V16) this.A02;
                C3FR c3fr = v16.A0H;
                if (c3fr == null) {
                    str = "recyclerViewProxy";
                } else {
                    c3fr.EWc(false);
                    InterfaceC70513Em interfaceC70513Em = v16.A0J;
                    str4 = "pullToRefresh";
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
                            w6i = v16.A07;
                            if (w6i == null) {
                                str = "adsManagerLogger";
                            } else {
                                BZZ = ((C70654Wea) this.A01).BZZ();
                                str2 = "promotion_list";
                                str3 = "paused";
                                v15 = v16;
                                w6i.A07(str2, str3, BZZ, "FB Login failed or cancelled");
                                AbstractC65702TsY.A17(v15);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                V15 v152 = (V15) this.A02;
                C3FR c3fr2 = v152.A04;
                if (c3fr2 == null) {
                    str4 = "recyclerViewProxy";
                } else {
                    c3fr2.EWc(false);
                    InterfaceC70513Em interfaceC70513Em3 = v152.A05;
                    str = "pullToRefresh";
                    if (interfaceC70513Em3 != null) {
                        interfaceC70513Em3.setIsLoading(false);
                        InterfaceC70513Em interfaceC70513Em4 = v152.A05;
                        if (interfaceC70513Em4 != null) {
                            if (!(interfaceC70513Em4 instanceof C71094Wnq)) {
                                SpinnerImageView spinnerImageView2 = v152.A06;
                                if (spinnerImageView2 == null) {
                                    str4 = "loadingSpinner";
                                } else {
                                    spinnerImageView2.setLoadingStatus(C3T1.SUCCESS);
                                    C67920V2k c67920V2k2 = v152.A02;
                                    if (c67920V2k2 == null) {
                                        str4 = "pastPromotionsAdapter";
                                    } else {
                                        c67920V2k2.A00(v152.A0H);
                                    }
                                }
                            }
                            w6i = v152.A01;
                            if (w6i == null) {
                                str4 = "adsManagerLogger";
                            } else {
                                BZZ = ((C70654Wea) this.A01).BZZ();
                                str2 = "past_promotion_list";
                                str3 = AppStateModule.APP_STATE_ACTIVE;
                                v15 = v152;
                                w6i.A07(str2, str3, BZZ, "FB Login failed or cancelled");
                                AbstractC65702TsY.A17(v15);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str4);
                throw C00O.createAndThrow();
        }
    }

    @Override // X.XCJ
    public final void DqC(String str) {
        HashMap hashMap;
        V16 v16;
        String A0p;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(str, 0);
                C131845xK.A00((C6FQ) this.A02, AbstractC58320PtC.A0g(str), (InterfaceC103384lE) this.A01);
                return;
            case 1:
                C14360o3.A0B(str, 0);
                hashMap = new HashMap();
                v16 = (V16) this.A02;
                A0p = AbstractC166997dE.A0p(v16.requireContext(), 2131971020);
                hashMap.put("media_id", ((InterfaceC72003XEr) this.A01).BZZ());
                hashMap.put("fb_auth_token", str);
                str2 = "com.instagram.ads.awpt_not_delivering_reason_screen.AwPTNotDeliveringReasonScreen";
                break;
            case 2:
                C14360o3.A0B(str, 0);
                hashMap = new HashMap();
                v16 = (V16) this.A02;
                A0p = AbstractC166997dE.A0p(v16.requireContext(), 2131952255);
                C70654Wea c70654Wea = (C70654Wea) this.A01;
                hashMap.put("media_id", c70654Wea.BZZ());
                hashMap.put("fb_auth_token", str);
                String str4 = c70654Wea.A0F;
                if (str4 == null) {
                    str4 = "";
                }
                hashMap.put("boosted_id", str4);
                str2 = "com.instagram.ads.rejection_details.RejectionDetailsScreen";
                break;
            case 3:
                C14360o3.A0B(str, 0);
                V16 v162 = (V16) this.A02;
                C70654Wea c70654Wea2 = (C70654Wea) this.A01;
                C69785VvQ c69785VvQ = v162.A0C;
                if (c69785VvQ == null) {
                    str3 = "promoteAdsManagerDataFetcher";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                c69785VvQ.A02(new C67954V3t(3, c70654Wea2, v162), c70654Wea2.BZZ(), c70654Wea2.A0F, str);
                return;
            case 4:
                V16 v163 = (V16) this.A02;
                W6I w6i = v163.A07;
                if (w6i == null) {
                    str3 = "adsManagerLogger";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                C70654Wea c70654Wea3 = (C70654Wea) this.A01;
                w6i.A08("promotion_list", "pay_now", c70654Wea3.BZZ(), null);
                W6f.A02(v163.requireActivity(), new C70626We4(v163, c70654Wea3), v163.getSession(), false);
                V16.A09(v163);
                return;
            default:
                C14360o3.A0B(str, 0);
                V15 v15 = (V15) this.A02;
                C70654Wea c70654Wea4 = (C70654Wea) this.A01;
                C69785VvQ c69785VvQ2 = v15.A03;
                if (c69785VvQ2 == null) {
                    str3 = "pastPromotionsDataFetcher";
                    C14360o3.A0F(str3);
                    throw C00O.createAndThrow();
                }
                c69785VvQ2.A03(new C67954V3t(4, c70654Wea4, v15), c70654Wea4.BZZ(), c70654Wea4.A0F, str);
                return;
        }
        C66277U6x A01 = C66277U6x.A01(str2, hashMap);
        FragmentActivity requireActivity = v16.requireActivity();
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(v16.getSession());
        igBloksScreenConfig.A0U = A0p;
        A01.A04(requireActivity, igBloksScreenConfig);
    }
}
