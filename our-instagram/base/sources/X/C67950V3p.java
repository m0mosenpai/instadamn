package X;

import com.instagram.api.schemas.ErrorIdentifier;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V3p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67950V3p extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ V16 A01;

    public C67950V3p(V16 v16, int i) {
        this.A01 = v16;
        this.A00 = i;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        String str2;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1907046475);
        V16 v16 = this.A01;
        if (!v16.A0V) {
            C70814WhX c70814WhX = v16.A08;
            if (c70814WhX == null) {
                str2 = "userFlowLogger";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            long j = c70814WhX.A00;
            if (j != 0) {
                c70814WhX.A01.flowEndFail(j, "", null);
                c70814WhX.A00 = 0L;
            }
        }
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null || (str = A01.getMessage()) == null) {
            str = "Unknown error";
        }
        W6I w6i = v16.A07;
        if (w6i == null) {
            str2 = "adsManagerLogger";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        w6i.A02("promotion_list", str);
        V16.A03(v16);
        C0f9.A0A(1893705802, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(735732602);
        V16 v16 = this.A01;
        if (!v16.A0V) {
            C70814WhX c70814WhX = v16.A08;
            if (c70814WhX == null) {
                C14360o3.A0F("userFlowLogger");
                throw C00O.createAndThrow();
            }
            long j = c70814WhX.A00;
            if (j != 0) {
                c70814WhX.A01.flowMarkPoint(j, "ads_manager_active_boosts_loaded");
            }
        }
        V16.A05(v16);
        C0f9.A0A(-912126223, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        int A03 = C0f9.A03(1482460794);
        C67839UzC c67839UzC = (C67839UzC) obj;
        int A0N = AbstractC167017dG.A0N(c67839UzC, 806886405);
        V16 v16 = this.A01;
        boolean z = true;
        v16.A0S = true;
        v16.A0T = c67839UzC.A07;
        UPA upa = c67839UzC.A03;
        String str3 = "adsManagerLogger";
        if (upa != null) {
            if (!v16.A0V) {
                W6I w6i = v16.A07;
                if (w6i != null) {
                    w6i.A02("promotion_list", upa.A03);
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            if (upa.A01 != ErrorIdentifier.A07) {
                z = false;
            }
            v16.A0Y = z;
            v16.A0N = upa.A02;
            UPI upi = upa.A00;
            if (upi != null) {
                str2 = upi.A03;
            } else {
                str2 = null;
            }
            v16.A0O = str2;
            if (!z) {
                V16.A03(v16);
            }
        }
        if (c67839UzC.A03 == null || v16.A0Y) {
            v16.A02 = c67839UzC.A01;
            v16.A00 = c67839UzC.A00;
            v16.A03 = c67839UzC.A02;
            v16.A0U = c67839UzC.A06;
            List list = c67839UzC.A04;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    v16.A0d.add(it.next());
                }
            }
            List<C70654Wea> list2 = c67839UzC.A05;
            if (list2 != null) {
                for (C70654Wea c70654Wea : list2) {
                    String str4 = v16.A0L;
                    if (str4 == null) {
                        str4 = "";
                    }
                    c70654Wea.A0B = str4;
                    String str5 = v16.A0P;
                    if (str5 == null) {
                        str5 = "";
                    }
                    c70654Wea.A0L = str5;
                    C1LC A0I = AbstractC43592JPx.A0I(c70654Wea.BzE());
                    while (A0I.hasNext()) {
                        InterfaceC72003XEr interfaceC72003XEr = (InterfaceC72003XEr) A0I.next();
                        C14360o3.A0C(interfaceC72003XEr, "null cannot be cast to non-null type com.instagram.business.promote.model.Promotion");
                        C70654Wea c70654Wea2 = (C70654Wea) interfaceC72003XEr;
                        String str6 = v16.A0L;
                        if (str6 == null) {
                            str6 = "";
                        }
                        c70654Wea2.A0B = str6;
                        String str7 = v16.A0P;
                        if (str7 == null) {
                            str7 = "";
                        }
                        c70654Wea2.A0L = str7;
                    }
                    v16.A0c.add(c70654Wea);
                    W6I w6i2 = v16.A07;
                    if (w6i2 == null) {
                        break;
                    }
                    if (AbstractC001800i.A0J(c70654Wea.BzE()) != null) {
                        str = "view_ad_comparison_insights";
                    } else {
                        str = "view_insights";
                    }
                    String str8 = v16.A0M;
                    if (str8 == null) {
                        str3 = "entryPoint";
                        break;
                    }
                    w6i2.A06("promotion_list", str, str8);
                }
            }
            v16.A01 += this.A00;
            if (!v16.A0V) {
                W6I w6i3 = v16.A07;
                if (w6i3 != null) {
                    w6i3.A03("promotion_list", null);
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            }
            V16.A08(v16);
        }
        C0f9.A0A(-1185894084, A0N);
        C0f9.A0A(-1614225237, A03);
    }
}
