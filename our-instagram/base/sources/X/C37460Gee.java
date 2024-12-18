package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.model.shopping.ProductSource;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;

/* renamed from: X.Gee, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37460Gee extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C37460Gee(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
    }

    public static void A00(C1ON c1on, Object obj, Object obj2, Object obj3, int i) {
        c1on.A00 = new C37460Gee(i, obj, obj2, obj3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        C38321qM c38321qM;
        int A03;
        int i2;
        String message;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 191424893);
                super.onFail(abstractC115105If);
                C218939m3.A01((C218939m3) this.A03);
                i = -930895553;
                C0f9.A0A(i, A0N);
                return;
            case 1:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -992862517);
                AbstractC38151GqI.A00(((C58572mG) this.A03).A01).A01(abstractC115105If, (C93Z) this.A02);
                i = -603745098;
                C0f9.A0A(i, A0N);
                return;
            case 2:
            case 5:
            default:
                super.onFail(abstractC115105If);
                return;
            case 3:
                A0N = C0f9.A03(-967811409);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                C38321qM c38321qM2 = (C38321qM) this.A02;
                c38321qM2.A4R(false);
                C9GR.A0D((Context) this.A01, "disable_commenting_network_error");
                c38321qM2.AEH((AbstractC12990ll) this.A03);
                i = 899548114;
                C0f9.A0A(i, A0N);
                return;
            case 4:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1597106021);
                super.onFail(abstractC115105If);
                C38321qM c38321qM3 = (C38321qM) this.A02;
                c38321qM3.A4R(true);
                C9GR.A0D((Context) this.A01, "enable_commenting_network_error");
                c38321qM3.AEH((AbstractC12990ll) this.A03);
                i = 459021093;
                C0f9.A0A(i, A0N);
                return;
            case 6:
                A0N = C0f9.A03(-2113426715);
                AbstractC166987dD.A1Y(this.A01);
                i = 114900942;
                C0f9.A0A(i, A0N);
                return;
            case 7:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -1813464063);
                ((IN0) this.A03).A00 = EnumC39539HdB.A02;
                AbstractC25225BEi.A1U(this.A01, abstractC115105If);
                i = 269858388;
                C0f9.A0A(i, A0N);
                return;
            case 8:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1845145824);
                ((IN0) this.A03).A00 = EnumC39539HdB.A02;
                AbstractC25225BEi.A1U(this.A01, abstractC115105If);
                i = 745107439;
                C0f9.A0A(i, A0N);
                return;
            case 9:
                A0N = C0f9.A03(-273077306);
                AbstractC166987dD.A1Y(this.A01);
                i = -194250126;
                C0f9.A0A(i, A0N);
                return;
            case 10:
                A0N = C0f9.A03(-736446600);
                super.onFail(abstractC115105If);
                ShoppingMoreProductsFragment shoppingMoreProductsFragment = (ShoppingMoreProductsFragment) this.A01;
                C41223IMo c41223IMo = shoppingMoreProductsFragment.A05;
                if (c41223IMo != null && (c38321qM = shoppingMoreProductsFragment.A01) != null) {
                    c41223IMo.A01(c38321qM, null);
                }
                shoppingMoreProductsFragment.A03.A04((EnumC39571Hdh) this.A03, false);
                AbstractC167017dG.A0y(shoppingMoreProductsFragment.requireActivity(), C3DN.A00);
                C9GR.A0F(shoppingMoreProductsFragment.requireContext(), "visualSearch_empty_response", 2131976924);
                i = 1136941283;
                C0f9.A0A(i, A0N);
                return;
            case 11:
                A03 = C0f9.A03(1455555902);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFail(abstractC115105If);
                HD9 hd9 = (HD9) this.A03;
                HEW hew = hd9.A02;
                if (hew == null) {
                    str = "adapter";
                } else {
                    hew.A03.A00 = null;
                    HEW.A00(hew);
                    C9GR.A01(hd9.getContext(), "select_catalog_failed", 2131970016, 0);
                    C41762Ied c41762Ied = hd9.A03;
                    if (c41762Ied == null) {
                        str = "logger";
                    } else {
                        IH8 ih8 = (IH8) this.A01;
                        String str3 = ih8.A01;
                        String str4 = ih8.A02;
                        Integer num = (Integer) this.A02;
                        Throwable A01 = abstractC115105If.A01();
                        C19280xC A00 = C41762Ied.A00(c41762Ied, "catalog_selection_failure");
                        A00.A0C("catalog_id", str3);
                        A00.A0C("products_source_name", str4);
                        A00.A0C("products_source_type", I8Y.A00(num));
                        if (A01 != null && (message = A01.getMessage()) != null) {
                            A00.A0C("error_message", message);
                        }
                        C41762Ied.A05(A00, c41762Ied);
                        i2 = -747269912;
                        C0f9.A0A(i2, A03);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0N = C0f9.A03(1735242758);
                C14360o3.A0B(abstractC115105If, 0);
                IDM idm = (IDM) this.A01;
                C38655Gyw c38655Gyw = (C38655Gyw) this.A02;
                C14360o3.A0B(c38655Gyw, 0);
                IIU iiu = idm.A00;
                iiu.A03.remove(c38655Gyw);
                AdsProductPageFragment adsProductPageFragment = iiu.A00;
                C41753IeT c41753IeT = new C41753IeT(adsProductPageFragment.A0O);
                C41595Iai c41595Iai = adsProductPageFragment.A0O.A02;
                c41753IeT.A02 = new C41595Iai(c41595Iai.A00, c41595Iai.A01, c41595Iai.A02, EnumC39591He1.A04, c41595Iai.A04, c41595Iai.A05, c41595Iai.A06);
                C41726Idx.A01(adsProductPageFragment, c41753IeT);
                if (c38655Gyw.A0A) {
                    C41702IdW c41702IdW = adsProductPageFragment.A06;
                    C4SX c4sx = null;
                    C38683GzO A0M = AbstractC37304Gc5.A0M(c41702IdW, adsProductPageFragment.A0T);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_load_failure");
                    if (A0f.isSampled()) {
                        C38642Gyj c38642Gyj = c41702IdW.A01;
                        if (c38642Gyj == null || (str2 = c38642Gyj.A05) == null) {
                            str2 = "";
                        }
                        AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str2));
                        if (A0M != null) {
                            c4sx = A0M.A01;
                        }
                        C41702IdW.A01(A0f, c41702IdW, AbstractC37304Gc5.A0b(c4sx, A0f, A0M));
                        A0f.Cht();
                    }
                }
                IK4 ik4 = new IK4(adsProductPageFragment.requireActivity(), adsProductPageFragment.A01, adsProductPageFragment, adsProductPageFragment.A0T, adsProductPageFragment.A0M.A0Q, adsProductPageFragment.A0V, adsProductPageFragment.A0X);
                Object A002 = abstractC115105If.A00();
                if (A002 != null && AbstractC37423Ge3.A00(((C40791um) A002).mStatusCode)) {
                    FragmentActivity fragmentActivity = ik4.A00;
                    C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
                    A0H.A0A(2131970060);
                    A0H.A09(2131970059);
                    A0H.A0s(false);
                    A0H.A0t(false);
                    A0H.A0F(DialogInterfaceOnClickListenerC41836Ifq.A00(ik4, 28));
                    if (ik4.A03 != null) {
                        A0H.A0b(DialogInterfaceOnClickListenerC41836Ifq.A00(ik4, 29), AbstractC167007dF.A0f(fragmentActivity, ik4.A04, 2131973938));
                    }
                    AbstractC166987dD.A1W(A0H);
                }
                i = -242209244;
                C0f9.A0A(i, A0N);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(159446180);
                OQF.A01((Context) this.A01, (User) this.A03);
                i2 = -319363258;
                C0f9.A0A(i2, A03);
                return;
            case 14:
                A03 = C0f9.A03(1538056312);
                OQF.A01((Context) this.A01, (User) this.A03);
                i2 = 713508080;
                C0f9.A0A(i2, A03);
                return;
        }
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03 = C0f9.A03(2118169014);
                User user = (User) this.A03;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                user.A03.EUD(Boolean.valueOf(!user.A1z()));
                user.A0c(abstractC12990ll);
                i = -182496113;
                break;
            case 14:
                A03 = C0f9.A03(-1674821571);
                User user2 = (User) this.A03;
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A02;
                user2.A03.EUC(Boolean.valueOf(!user2.A22()));
                user2.A0c(abstractC12990ll2);
                i = -756703087;
                break;
            default:
                super.onFailInBackground(abstractC115105If);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(1913003783);
                AbstractC38151GqI.A00(((C58572mG) this.A03).A01);
                int i2 = ((C93Z) this.A02).A01;
                if (AbstractC38151GqI.A01(i2)) {
                    C006802i.A0p.markerPoint(1011615852, i2, "GRID_RESPONSE_RECEIVED");
                }
                i = -1895362343;
                break;
            case 2:
                A03 = C0f9.A03(-1328682753);
                super.onFinish();
                ((C37466Gek) this.A01).A05.removeAll((LinkedHashSet) this.A02);
                i = -1034440419;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(969700056);
                AbstractC38151GqI.A00(((C58572mG) this.A03).A01).A03((C93Z) this.A02, null);
                i = 1934169792;
                break;
            case 7:
                A03 = C0f9.A03(-1501175350);
                super.onStart();
                ((IN0) this.A03).A00 = EnumC39539HdB.A04;
                i = -1402704223;
                break;
            case 8:
                A03 = C0f9.A03(-1380591316);
                super.onStart();
                ((IN0) this.A03).A00 = EnumC39539HdB.A04;
                i = -1465000171;
                break;
            case 11:
                A03 = C0f9.A03(1462052437);
                super.onStart();
                C41762Ied c41762Ied = ((HD9) this.A03).A03;
                if (c41762Ied == null) {
                    C14360o3.A0F("logger");
                    throw C00O.createAndThrow();
                }
                IH8 ih8 = (IH8) this.A01;
                String str = ih8.A01;
                String str2 = ih8.A02;
                Integer num = (Integer) this.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC37300Gc1.A0C(c41762Ied.A07), "instagram_shopping_catalog_selection_start");
                if (str == null) {
                    str = "";
                }
                A0f.AAP("catalog_id", str);
                String str3 = c41762Ied.A05;
                if (str3 == null) {
                    str3 = "";
                }
                AbstractC37300Gc1.A0n(A0f, str3);
                if (str2 == null) {
                    str2 = "";
                }
                A0f.AAP("products_source_name", str2);
                A0f.AAP("products_source_type", I8Y.A00(num));
                C41762Ied.A03(A0f, c41762Ied);
                C41762Ied.A02(A0f, c41762Ied);
                ProductSource productSource = c41762Ied.A00;
                String str4 = null;
                if (productSource != null) {
                    str4 = productSource.A01;
                }
                A0f.AAP("selected_source_type", C41762Ied.A01(A0f, c41762Ied, str4));
                A0f.AAP("waterfall_id", c41762Ied.A06);
                A0f.Cht();
                i = -1076679512;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(-1726298965);
                i = -42261936;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37460Gee.onSuccess(java.lang.Object):void");
    }
}
