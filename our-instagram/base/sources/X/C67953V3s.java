package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.V3s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67953V3s extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ V15 A01;
    public final /* synthetic */ boolean A02;

    public C67953V3s(V15 v15, int i, boolean z) {
        this.A01 = v15;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        String str3;
        int A03 = C0f9.A03(-1589850789);
        C67839UzC c67839UzC = (C67839UzC) obj;
        int A032 = C0f9.A03(-1952232790);
        C14360o3.A0B(c67839UzC, 0);
        UPA upa = c67839UzC.A03;
        if (upa != null) {
            boolean z = this.A02;
            V15 v15 = this.A01;
            if (z) {
                W6I w6i = v15.A01;
                if (w6i != null) {
                    w6i.A02("past_promotion_list", upa.A03);
                }
                C14360o3.A0F("adsManagerLogger");
                throw C00O.createAndThrow();
            }
            boolean A1X = AbstractC167007dF.A1X(upa.A01, ErrorIdentifier.A07);
            v15.A0E = A1X;
            v15.A09 = upa.A02;
            UPI upi = upa.A00;
            if (upi != null) {
                str3 = upi.A03;
            } else {
                str3 = null;
            }
            v15.A0A = str3;
            if (!A1X) {
                AbstractC65702TsY.A0q();
                String string = v15.requireContext().getString(2131970315);
                Bundle bundle = new Bundle();
                bundle.putString(TraceFieldType.Error, string);
                V0B v0b = new V0B();
                v0b.setArguments(bundle);
                C140966Yy A0c = AbstractC25231BEo.A0c(v15.requireActivity(), v15.A0I);
                A0c.A0G(null, 0);
                A0c.A0B(null, v0b);
                A0c.A04();
            }
        }
        if (c67839UzC.A03 == null || this.A01.A0E) {
            V15 v152 = this.A01;
            v152.A0C = c67839UzC.A07;
            int i = c67839UzC.A00;
            List<C70654Wea> list = c67839UzC.A05;
            if (list != null) {
                loop0: for (C70654Wea c70654Wea : list) {
                    String str4 = v152.A07;
                    if (str4 != null) {
                        c70654Wea.A0B = str4;
                        String str5 = v152.A0B;
                        str = "fbPageId";
                        if (str5 == null) {
                            break;
                        }
                        c70654Wea.A0L = str5;
                        C1LC A0I = AbstractC43592JPx.A0I(c70654Wea.BzE());
                        while (A0I.hasNext()) {
                            InterfaceC72003XEr interfaceC72003XEr = (InterfaceC72003XEr) A0I.next();
                            C14360o3.A0C(interfaceC72003XEr, "null cannot be cast to non-null type com.instagram.business.promote.model.Promotion");
                            C70654Wea c70654Wea2 = (C70654Wea) interfaceC72003XEr;
                            String str6 = v152.A07;
                            if (str6 != null) {
                                c70654Wea2.A0B = str6;
                                String str7 = v152.A0B;
                                if (str7 == null) {
                                    break loop0;
                                } else {
                                    c70654Wea2.A0L = str7;
                                }
                            }
                        }
                        v152.A0G.add(c70654Wea);
                        W6I w6i2 = v152.A01;
                        if (w6i2 == null) {
                            break;
                        }
                        if (AbstractC001800i.A0J(c70654Wea.BzE()) != null) {
                            str2 = "view_ad_comparison_insights";
                        } else {
                            str2 = "view_insights";
                        }
                        w6i2.A06("past_promotion_list", str2, v152.A08);
                    }
                    C14360o3.A0F("adAccountId");
                }
            }
            if (i == 0 && v152.isAdded()) {
                AbstractC25231BEo.A0c(v152.requireActivity(), v152.A0I).A0G(null, 0);
            }
            v152.A00 += this.A00;
            List list2 = v152.A0H;
            list2.clear();
            List list3 = v152.A0G;
            int size = list3.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list3.get(i2);
                if (i2 != 0) {
                    list2.add(new Object());
                }
                list2.add(obj2);
            }
            C67920V2k c67920V2k = v152.A02;
            if (c67920V2k == null) {
                str = "pastPromotionsAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            c67920V2k.A00(list2);
            if (this.A02) {
                W6I w6i3 = v152.A01;
                if (w6i3 != null) {
                    w6i3.A03("past_promotion_list", null);
                }
                C14360o3.A0F("adsManagerLogger");
                throw C00O.createAndThrow();
            }
        }
        C0f9.A0A(270290413, A032);
        C0f9.A0A(1187428463, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A03 = C0f9.A03(-344639916);
        C14360o3.A0B(abstractC115105If, 0);
        if (this.A02) {
            Throwable A01 = abstractC115105If.A01();
            if (A01 == null || (str = A01.getMessage()) == null) {
                str = "Unknown error";
            }
            W6I w6i = this.A01.A01;
            if (w6i == null) {
                C14360o3.A0F("adsManagerLogger");
                throw C00O.createAndThrow();
            }
            w6i.A02("past_promotion_list", str);
        }
        V15 v15 = this.A01;
        if (v15.isAdded()) {
            AbstractC65702TsY.A0q();
            String string = v15.requireContext().getString(2131970315);
            Bundle bundle = new Bundle();
            bundle.putString(TraceFieldType.Error, string);
            V0B v0b = new V0B();
            v0b.setArguments(bundle);
            C140966Yy A0c = AbstractC25231BEo.A0c(v15.requireActivity(), v15.A0I);
            A0c.A0G(null, 0);
            A0c.A0B(null, v0b);
            A0c.A04();
        }
        C0f9.A0A(-1984105026, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1151173743);
        V15 v15 = this.A01;
        C3FR c3fr = v15.A04;
        String str = "recyclerViewProxy";
        if (c3fr != null) {
            c3fr.ARj();
            C3FR c3fr2 = v15.A04;
            if (c3fr2 != null) {
                c3fr2.EWc(false);
                InterfaceC70513Em interfaceC70513Em = v15.A05;
                if (interfaceC70513Em == null) {
                    str = "pullToRefresh";
                } else {
                    interfaceC70513Em.setIsLoading(false);
                    SpinnerImageView spinnerImageView = v15.A06;
                    if (spinnerImageView == null) {
                        str = "loadingSpinner";
                    } else {
                        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                        v15.A0D = false;
                        C0f9.A0A(918670711, A03);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1036855752);
        V15 v15 = this.A01;
        v15.A0C = false;
        C3FR c3fr = v15.A04;
        String str = "recyclerViewProxy";
        if (c3fr != null) {
            c3fr.APU();
            C3FR c3fr2 = v15.A04;
            if (c3fr2 != null) {
                c3fr2.EWc(true);
                InterfaceC70513Em interfaceC70513Em = v15.A05;
                str = "pullToRefresh";
                if (interfaceC70513Em != null) {
                    interfaceC70513Em.setIsLoading(true);
                    List list = v15.A0H;
                    if (list == null || list.isEmpty()) {
                        InterfaceC70513Em interfaceC70513Em2 = v15.A05;
                        if (interfaceC70513Em2 != null) {
                            if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                                SpinnerImageView spinnerImageView = v15.A06;
                                if (spinnerImageView == null) {
                                    str = "loadingSpinner";
                                } else {
                                    spinnerImageView.setLoadingStatus(C3T1.LOADING);
                                }
                            }
                        }
                    }
                    C0f9.A0A(-893208078, A03);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
