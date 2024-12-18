package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HZ7 extends AbstractC40977ICy implements JPq {
    public final UserSession A00;
    public final INQ A01;
    public final C38A A02;
    public final JI6 A03;
    public final Activity A04;
    public final Context A05;
    public final RankingInfo A06;
    public final C41702IdW A07;
    public final C41727Idy A08;
    public final C41729Ie0 A09;
    public final IND A0A;
    public final C41693IdM A0B;
    public final IHG A0C;
    public final String A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HZ7(Activity activity, Context context, RankingInfo rankingInfo, UserSession userSession, C41702IdW c41702IdW, C41727Idy c41727Idy, INQ inq, C41729Ie0 c41729Ie0, IND ind, C41693IdM c41693IdM, C38A c38a, JI6 ji6, IHG ihg, C41622IbC c41622IbC, String str) {
        super(c41622IbC);
        AbstractC167007dF.A1G(userSession, 2, c41727Idy);
        C14360o3.A0B(ind, 7);
        AbstractC25234BEr.A0l(8, c41729Ie0, c41622IbC, inq, c41693IdM);
        C14360o3.A0B(ihg, 13);
        this.A05 = context;
        this.A00 = userSession;
        this.A04 = activity;
        this.A03 = ji6;
        this.A08 = c41727Idy;
        this.A07 = c41702IdW;
        this.A0A = ind;
        this.A09 = c41729Ie0;
        this.A01 = inq;
        this.A0B = c41693IdM;
        this.A02 = c38a;
        this.A0C = ihg;
        this.A0D = str;
        this.A06 = rankingInfo;
    }

    @Override // X.JPq
    public final void DKN(C39354HZt c39354HZt) {
        C14360o3.A0B(c39354HZt, 0);
        A01(c39354HZt);
        this.A0B.A02 = true;
        C41729Ie0 c41729Ie0 = this.A09;
        ProductArEffectMetadata productArEffectMetadata = c39354HZt.A01;
        Product A00 = C41726Idx.A00(this.A03);
        C14360o3.A0A(A00);
        c41729Ie0.A03(C22P.A4K, productArEffectMetadata, A00);
    }

    @Override // X.JPq
    public final void DKO(ProductArEffectMetadata productArEffectMetadata) {
        C41727Idy c41727Idy = this.A08;
        JI6 ji6 = this.A03;
        Product A00 = C41726Idx.A00(ji6);
        C14360o3.A0A(A00);
        C14360o3.A0B(A00, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41727Idy.A04, "instagram_shopping_ar_try_on_tag_entry_point_tap");
        AbstractC37303Gc4.A0j(A0f, A00);
        AbstractC37301Gc2.A17(A0f, AbstractC37301Gc2.A0o(A00.A0B));
        AbstractC37302Gc3.A10(A0f, A00);
        AbstractC37300Gc1.A0s(A0f, c41727Idy.A0E);
        AbstractC37300Gc1.A0f(A0f, C41727Idy.A00(c41727Idy, null));
        A0f.Cht();
        this.A0B.A02 = true;
        C41729Ie0 c41729Ie0 = this.A09;
        Product A002 = C41726Idx.A00(ji6);
        C14360o3.A0A(A002);
        c41729Ie0.A03(C22P.A4K, productArEffectMetadata, A002);
    }

    @Override // X.JPq
    public final void DKQ(C39350HZp c39350HZp, String str) {
        C14360o3.A0B(c39350HZp, 1);
        A01(c39350HZp);
        A02(c39350HZp, str);
    }

    @Override // X.JPq
    public final void DKR(C39351HZq c39351HZq, String str) {
        C14360o3.A0B(c39351HZq, 1);
        A01(c39351HZq);
        A02(c39351HZq, str);
    }

    @Override // X.JPq
    public final void DKS(C39349HZo c39349HZo, String str) {
        C14360o3.A0B(c39349HZo, 1);
        A01(c39349HZo);
        A02(c39349HZo, str);
    }

    @Override // X.JPq
    public final void DKT(InterfaceC58290Psi interfaceC58290Psi, C39352HZr c39352HZr, String str) {
        C14360o3.A0B(c39352HZr, 1);
        A01(c39352HZr);
        A02(c39352HZr, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    @Override // X.JPq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DKU(X.C39353HZs r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HZ7.DKU(X.HZs, java.lang.String):void");
    }

    @Override // X.JPq
    public final void ED6(View view, String str) {
        C14360o3.A0B(str, 1);
        IHG ihg = this.A0C;
        AbstractC37304Gc5.A0u(view, ihg.A00, ihg.A01, str);
    }

    public static final void A00(FeaturedProductPermissionStatus featuredProductPermissionStatus, HZ7 hz7, IN1 in1, String str) {
        JLH BcS;
        FeaturedProductPermissionStatus featuredProductPermissionStatus2;
        JI6 ji6 = hz7.A03;
        C41753IeT A00 = C41753IeT.A00(ji6);
        C41617Ib7 c41617Ib7 = new C41617Ib7(ji6.C02().A04);
        c41617Ib7.A04.put(in1.A01(), EnumC39591He1.A06);
        A00.A04 = new C41723Idu(c41617Ib7);
        C41726Idx.A02(ji6, A00);
        C38321qM c38321qM = ((C39350HZp) in1).A01;
        Iterator A14 = AbstractC166997dE.A14(AbstractC82403m3.A07(c38321qM));
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object key = A1K.getKey();
            List list = (List) A1K.getValue();
            ArrayList<InterfaceC43546JLg> A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                JLH BcS2 = ((InterfaceC43546JLg) obj).BcS();
                if (BcS2 != null) {
                    featuredProductPermissionStatus2 = BcS2.C0K();
                } else {
                    featuredProductPermissionStatus2 = null;
                }
                if (featuredProductPermissionStatus2 == featuredProductPermissionStatus) {
                    A1E.add(obj);
                }
            }
            for (InterfaceC43546JLg interfaceC43546JLg : A1E) {
                if (interfaceC43546JLg != null && (BcS = interfaceC43546JLg.BcS()) != null) {
                    IND ind = hz7.A0A;
                    ind.A00.schedule(I6U.A00(ind.A01, FeaturedProductPermissionStatus.A05, String.valueOf(BcS.BF7()), new MEC(in1, key, hz7, interfaceC43546JLg, str, 5), new MIV(hz7, key, interfaceC43546JLg, c38321qM, in1, str, 3)));
                }
            }
        }
    }

    private final void A01(IN1 in1) {
        String str;
        C41726Idx C02 = this.A03.C02();
        C41723Idu c41723Idu = C02.A04;
        Product product = C02.A09;
        List A01 = c41723Idu.A01(this.A00, product);
        C41702IdW c41702IdW = this.A07;
        if (c41702IdW != null) {
            C14360o3.A0A(A01);
            if (in1 instanceof C39353HZs) {
                in1 = ((C39353HZs) in1).A00;
            }
            int indexOf = A01.indexOf(in1);
            int size = A01.size();
            C4SX c4sx = null;
            C38683GzO A0M = AbstractC37304Gc5.A0M(c41702IdW, product);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_hero_carousel_click");
            if (A0f.isSampled()) {
                C38642Gyj c38642Gyj = c41702IdW.A01;
                if (c38642Gyj == null || (str = c38642Gyj.A05) == null) {
                    str = "";
                }
                AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str));
                if (A0M != null) {
                    c4sx = A0M.A01;
                }
                C41702IdW.A01(A0f, c41702IdW, AbstractC37304Gc5.A0b(c4sx, A0f, A0M));
                AbstractC37304Gc5.A11(A0f, size);
                A0f.AAP("position_in_carousel", String.valueOf(indexOf));
                A0f.Cht();
            }
        }
    }

    private final void A02(IN1 in1, String str) {
        User user;
        String str2;
        String str3;
        String str4;
        JI6 ji6 = this.A03;
        C41726Idx C02 = ji6.C02();
        C41723Idu c41723Idu = C02.A04;
        Product product = C02.A09;
        C14360o3.A0A(product);
        Product product2 = ji6.C02().A08;
        C14360o3.A0A(product2);
        String str5 = product2.A0H;
        Map unmodifiableMap = Collections.unmodifiableMap(C02.A07.A01);
        C14360o3.A07(unmodifiableMap);
        C38321qM Byj = ji6.Byj();
        List A01 = c41723Idu.A01(this.A00, product);
        C41729Ie0 c41729Ie0 = this.A09;
        String str6 = this.A0D;
        HashMap hashMap = new HashMap(unmodifiableMap);
        C14360o3.A0A(A01);
        boolean A1a = AbstractC25229BEm.A1a(ji6.C02().A02.A01, EnumC39591He1.A05);
        RankingInfo rankingInfo = this.A06;
        AbstractC167017dG.A1P(product, str5);
        Bundle A0E = AbstractC31174DnI.A0E(A01, 8);
        if (Byj != null) {
            user = Byj.A2E(c41729Ie0.A08);
        } else {
            user = null;
        }
        Parcelable[] A00 = I8E.A00(A01);
        C14360o3.A07(A00);
        String str7 = c41729Ie0.A0J;
        String str8 = c41729Ie0.A0C;
        String A012 = in1.A01();
        String moduleName = c41729Ie0.A09.getModuleName();
        if (Byj != null) {
            str2 = Byj.getId();
            if (user != null) {
                str3 = user.getId();
                str4 = Byj.A38();
                JI6 ji62 = c41729Ie0.A0B;
                String str9 = ji62.C02().A03.A03;
                java.util.Set keySet = ji62.C02().A0D.keySet();
                C14360o3.A07(keySet);
                A0E.putParcelable("arguments", new LightboxArguments(rankingInfo, product, str5, str7, str8, A012, moduleName, str, str6, str2, str3, str4, null, str9, c41729Ie0.A0D, c41729Ie0.A0I, hashMap, keySet, A00, A1a, true));
                AbstractC31171DnF.A0L(c41729Ie0.A05, A0E, c41729Ie0.A08, ModalActivity.class, "shopping_lightbox").A0D(c41729Ie0.A07, 7);
            }
        } else {
            str2 = null;
        }
        str3 = null;
        if (Byj == null) {
            str4 = null;
            JI6 ji622 = c41729Ie0.A0B;
            String str92 = ji622.C02().A03.A03;
            java.util.Set keySet2 = ji622.C02().A0D.keySet();
            C14360o3.A07(keySet2);
            A0E.putParcelable("arguments", new LightboxArguments(rankingInfo, product, str5, str7, str8, A012, moduleName, str, str6, str2, str3, str4, null, str92, c41729Ie0.A0D, c41729Ie0.A0I, hashMap, keySet2, A00, A1a, true));
            AbstractC31171DnF.A0L(c41729Ie0.A05, A0E, c41729Ie0.A08, ModalActivity.class, "shopping_lightbox").A0D(c41729Ie0.A07, 7);
        }
        str4 = Byj.A38();
        JI6 ji6222 = c41729Ie0.A0B;
        String str922 = ji6222.C02().A03.A03;
        java.util.Set keySet22 = ji6222.C02().A0D.keySet();
        C14360o3.A07(keySet22);
        A0E.putParcelable("arguments", new LightboxArguments(rankingInfo, product, str5, str7, str8, A012, moduleName, str, str6, str2, str3, str4, null, str922, c41729Ie0.A0D, c41729Ie0.A0I, hashMap, keySet22, A00, A1a, true));
        AbstractC31171DnF.A0L(c41729Ie0.A05, A0E, c41729Ie0.A08, ModalActivity.class, "shopping_lightbox").A0D(c41729Ie0.A07, 7);
    }

    @Override // X.JPq
    public final void A7u(C41726Idx c41726Idx, C39354HZt c39354HZt) {
        IHG ihg = this.A0C;
        String str = c39354HZt.A02;
        C63622uj c63622uj = ihg.A01;
        AbstractC31176DnK.A1V(ihg.A02, C59062n7.A00(c39354HZt, c41726Idx, str), c63622uj, str);
    }

    @Override // X.JPq
    public final void DGS(IN1 in1, String str) {
        Context context = this.A05;
        C50674MYs c50674MYs = new C50674MYs(context, this.A00);
        c50674MYs.A01(new ViewOnClickListenerC41960Iir(in1, this, str, 3), 2131962387);
        C31727DwY.A01(context, c50674MYs);
    }

    @Override // X.JPq
    public final void DGT(IN1 in1, String str) {
        A00(FeaturedProductPermissionStatus.A0E, this, in1, str);
    }

    @Override // X.InterfaceC43421JGl
    public final void DKP(IN1 in1) {
        C38321qM c38321qM;
        INQ inq = this.A01;
        inq.A03("scroll");
        if (in1 == null) {
            JI6 ji6 = this.A03;
            C41726Idx C02 = ji6.C02();
            C41753IeT c41753IeT = new C41753IeT(C02);
            C41753IeT.A01(null, EnumC39541HdD.A02, c41753IeT, new C41617Ib7(C02.A04));
            C41726Idx.A02(ji6, c41753IeT);
            return;
        }
        if (in1 instanceof C39350HZp) {
            c38321qM = ((C39350HZp) in1).A00;
        } else if (in1 instanceof C39349HZo) {
            c38321qM = ((C39349HZo) in1).A00;
        } else if (!(in1 instanceof C39352HZr)) {
            return;
        } else {
            c38321qM = ((C39352HZr) in1).A00;
        }
        JI6 ji62 = this.A03;
        C41726Idx C022 = ji62.C02();
        C41753IeT c41753IeT2 = new C41753IeT(C022);
        C41753IeT.A01(c38321qM, EnumC39541HdD.A04, c41753IeT2, new C41617Ib7(C022.A04));
        C41726Idx.A02(ji62, c41753IeT2);
        inq.A00(c38321qM);
    }
}
