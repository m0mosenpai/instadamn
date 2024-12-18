package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ProductDiscountInformationDictImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.J8d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43206J8d extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43206J8d(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new C43206J8d(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Object value;
        C26085BgE c26085BgE;
        Object value2;
        C26085BgE c26085BgE2;
        switch (this.A00) {
            case 0:
                HCT hct = (HCT) this.A01;
                return new C38975HEd(hct.requireContext(), AbstractC166987dD.A0r(hct.A0D), hct, hct, hct, (C42884Ixy) hct.A09.getValue(), hct.A04, AbstractC37300Gc1.A0I(hct.A0E));
            case 1:
                HCT hct2 = (HCT) this.A01;
                return C38287GsW.A00(AbstractC166987dD.A0r(hct2.A0D), hct2, 10);
            case 2:
                HCT hct3 = (HCT) this.A01;
                return new C42884Ixy(hct3.requireActivity(), AbstractC166987dD.A0r(hct3.A0D), (IN0) hct3.A0A.getValue(), hct3, AbstractC25225BEi.A15(hct3.A0F), C43361JEc.A01(hct3, 0), C43361JEc.A01(hct3, 1));
            case 3:
                HCT hct4 = (HCT) this.A01;
                Context requireContext = hct4.requireContext();
                InterfaceC09390do interfaceC09390do = hct4.A0D;
                return new IN0(requireContext, AbstractC018607g.A00(hct4), AbstractC166987dD.A0r(interfaceC09390do), AbstractC31173DnH.A0t(interfaceC09390do));
            case 4:
                HCT hct5 = (HCT) this.A01;
                C675132q c675132q = new C675132q(hct5, AbstractC166987dD.A0r(hct5.A0D), hct5);
                c675132q.A05 = AbstractC25225BEi.A15(hct5.A0F);
                return c675132q;
            case 5:
                HCT hct6 = (HCT) this.A01;
                return new AnonymousClass308(hct6.requireActivity(), hct6, hct6.getParentFragmentManager(), AbstractC166987dD.A0r(hct6.A0D), null, hct6, new C42601ItK(hct6, 3), null, false, true, false);
            case 6:
                HCT hct7 = (HCT) this.A01;
                return new J1L(hct7.requireContext(), AbstractC018607g.A00(hct7), AbstractC166987dD.A0r(hct7.A0D), hct7, null);
            case 7:
            case 17:
                return AbstractC61112qZ.A00(((Fragment) this.A01).mArguments);
            case 8:
                return ((Fragment) this.A01).getString(2131962404);
            case 9:
                View view = ((Fragment) this.A01).mView;
                if (view != null) {
                    return new IJG(view);
                }
                throw AbstractC166987dD.A14("No view attached");
            case 10:
                return new C66413UGh(AbstractC31172DnG.A07(this.A01));
            case 11:
                C38932HCf c38932HCf = (C38932HCf) this.A01;
                return new HER(c38932HCf.A04, (ArrayList) c38932HCf.A06.getValue(), AbstractC167007dF.A1Z(c38932HCf.A07));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return AbstractC153636vY.A02(AbstractC31179DnN.A04(this.A01), ProductDiscountInformationDictImpl.class, "discounts");
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC31174DnI.A0n(AbstractC31179DnN.A04(this.A01), "display_discount_link");
            case 14:
                C38932HCf c38932HCf2 = (C38932HCf) this.A01;
                return new IK2(AbstractC166987dD.A0r(c38932HCf2.A0B), c38932HCf2, AbstractC25225BEi.A15(c38932HCf2.A0C), AbstractC153636vY.A01(c38932HCf2.requireArguments(), "module_name"), AbstractC153636vY.A01(c38932HCf2.requireArguments(), "prior_module_name"), AbstractC25225BEi.A15(c38932HCf2.A0A));
            case Process.SIGTERM /* 15 */:
                return AbstractC153636vY.A00(AbstractC31179DnN.A04(this.A01), User.class, "merchant");
            case 16:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "prior_submodule_name");
            case 18:
                Parcelable parcelable = AbstractC31179DnN.A04(this.A01).getParcelable("arguments");
                C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments");
                return parcelable;
            case Process.SIGSTOP /* 19 */:
                HCB hcb = (HCB) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(hcb.A0G);
                InterfaceC09390do interfaceC09390do2 = hcb.A0A;
                Product product = AbstractC37300Gc1.A0H(interfaceC09390do2).A01;
                HashMap hashMap = AbstractC37300Gc1.A0H(interfaceC09390do2).A0G;
                return new C39052HHc(A0r, AbstractC37304Gc5.A0L(hcb), product, AbstractC37300Gc1.A0H(interfaceC09390do2).A07, hashMap, AbstractC13880nE.A0A(hcb.requireContext()));
            case 20:
                HCB hcb2 = (HCB) this.A01;
                InterfaceC60442pS interfaceC60442pS = hcb2.A09;
                InterfaceC09390do interfaceC09390do3 = hcb2.A0G;
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do3);
                InterfaceC09390do interfaceC09390do4 = hcb2.A0A;
                Product product2 = AbstractC37300Gc1.A0H(interfaceC09390do4).A01;
                String str2 = AbstractC37300Gc1.A0H(interfaceC09390do4).A03;
                String str3 = AbstractC37300Gc1.A0H(interfaceC09390do4).A09;
                String str4 = AbstractC37300Gc1.A0H(interfaceC09390do4).A0B;
                String str5 = AbstractC37300Gc1.A0H(interfaceC09390do4).A0C;
                String str6 = AbstractC37300Gc1.A0H(interfaceC09390do4).A0E;
                return new C41728Idz(AbstractC37300Gc1.A0H(interfaceC09390do4).A00, interfaceC60442pS, A0r2, AbstractC31176DnK.A0Z(interfaceC09390do3).A02(AbstractC37300Gc1.A0H(interfaceC09390do4).A07), product2, str2, str3, str4, str5, str6, AbstractC37300Gc1.A0H(interfaceC09390do4).A02, AbstractC37300Gc1.A0H(interfaceC09390do4).A04, AbstractC37300Gc1.A0H(interfaceC09390do4).A0D);
            case 21:
                HCB hcb3 = (HCB) this.A01;
                return new C38E(hcb3.A09, AbstractC166987dD.A0r(hcb3.A0G), AbstractC37301Gc2.A0L(hcb3));
            case 22:
                return new C41082IGz(AbstractC166987dD.A0r(((HCB) this.A01).A0G));
            case 23:
            case 36:
            case 45:
            case 48:
                return this.A01;
            case 24:
            case 37:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                return AbstractC25226BEj.A1C(this.A01);
            case 25:
            case 38:
            case 47:
                return AbstractC167027dH.A0B(this.A01);
            case 26:
                HCB hcb4 = (HCB) this.A01;
                return new J0U(hcb4.requireContext(), AbstractC166987dD.A0r(hcb4.A0G), AbstractC37300Gc1.A0H(hcb4.A0A).A01);
            case 27:
                HCB hcb5 = (HCB) this.A01;
                return new INQ(hcb5.requireContext(), AbstractC166987dD.A0r(hcb5.A0G), hcb5.A09, hcb5);
            case 28:
                HCB hcb6 = (HCB) this.A01;
                return new C41045IFo(AbstractC166987dD.A0r(hcb6.A0G), (C57112jm) hcb6.A0K.getValue(), hcb6);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                HCB hcb7 = (HCB) this.A01;
                boolean A06 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(hcb7.A0G), 36313244113045343L);
                View decorView = hcb7.requireActivity().getWindow().getDecorView();
                C14360o3.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) decorView;
                if (A06) {
                    return new C7ET(viewGroup);
                }
                return new ViewOnTouchListenerC676833i(viewGroup, false);
            case 30:
                C05A c05a = ((C38315GtA) ((HDP) this.A01).A06.getValue()).A02;
                do {
                    value2 = c05a.getValue();
                    c26085BgE2 = (C26085BgE) value2;
                } while (!c05a.AIi(value2, C26085BgE.A01((Product) c26085BgE2.A02, AbstractC001800i.A0T(C41638IbU.A00, (Collection) c26085BgE2.A01), c26085BgE2.A04, c26085BgE2.A03)));
                return C0eB.A00;
            case 31:
                C05A c05a2 = ((C38315GtA) ((HDP) this.A01).A06.getValue()).A02;
                do {
                    value = c05a2.getValue();
                    c26085BgE = (C26085BgE) value;
                } while (!c05a2.AIi(value, C26085BgE.A01((Product) c26085BgE.A02, AbstractC001800i.A0T(C41640IbW.A00, (Collection) c26085BgE.A01), c26085BgE.A04, c26085BgE.A03)));
                return C0eB.A00;
            case 32:
                C53Z c53z = (C53Z) this.A01;
                C38321qM A02 = C1DW.A00(c53z.getSession()).A02(c53z.requireArguments().getString("media_id"));
                if (A02 != null) {
                    return A02.A1g(c53z.getSession());
                }
                return null;
            case 33:
                HDP hdp = (HDP) this.A01;
                return AbstractC64962wu.A02(hdp.requireContext(), hdp.requireActivity(), hdp.getSession(), hdp, "shops_mini_pdp", null, null, true);
            case 34:
                HDP hdp2 = (HDP) this.A01;
                return new C52942bb(new HHS(hdp2.getSession(), AbstractC25226BEj.A0z(hdp2.A04)), hdp2).A00(C38315GtA.class);
            case 35:
                HCD hcd = (HCD) this.A01;
                return new ILO(hcd.requireContext(), hcd, new C42840IxG(hcd));
            case 39:
                HCD hcd2 = (HCD) this.A01;
                Bundle requireArguments = hcd2.requireArguments();
                InterfaceC09390do interfaceC09390do5 = hcd2.A01;
                return new C39053HHd(AbstractC166987dD.A0r(interfaceC09390do5), new ILP(AbstractC166987dD.A0r(interfaceC09390do5), hcd2, AbstractC153636vY.A01(requireArguments, "prior_module")), requireArguments.getString(AbstractC111324zv.A00(1808)), requireArguments.getString(AbstractC111324zv.A00(1809)), requireArguments.getString(AbstractC111324zv.A00(1806)), requireArguments.getString(AbstractC111324zv.A00(1807)));
            case 40:
                HCO hco = (HCO) this.A01;
                InterfaceC09390do interfaceC09390do6 = hco.A0M;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do6);
                String str7 = hco.A07;
                if (str7 != null) {
                    return new C39053HHd(AbstractC166987dD.A0r(interfaceC09390do6), new ILP(A0r3, hco, str7), null, null, AbstractC25225BEi.A15(hco.A0N), AbstractC25225BEi.A15(hco.A0O));
                }
                str = "priorModule";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.NULL_REFNUM /* 41 */:
                C1XJ c1xj = C1XJ.A00;
                HCO hco2 = (HCO) this.A01;
                UserSession A0r4 = AbstractC166987dD.A0r(hco2.A0M);
                String str8 = hco2.A08;
                if (str8 == null) {
                    str = "waterfallId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                String str9 = hco2.A07;
                if (str9 != null) {
                    return c1xj.A05(A0r4, hco2, str8, str9, null);
                }
                str = "priorModule";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                HCO hco3 = (HCO) this.A01;
                InterfaceC09390do interfaceC09390do7 = hco3.A0M;
                UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do7);
                C16910sj c16910sj = C16910sj.A00;
                ProductSource A00 = C41768Iek.A00(AbstractC166987dD.A0r(interfaceC09390do7));
                if (A00 == null) {
                    A00 = new ProductSource(EnumC39617HeR.A04, AbstractC31173DnH.A0t(interfaceC09390do7));
                }
                int i = hco3.A00;
                EnumC39584Hdu enumC39584Hdu = hco3.A06;
                if (enumC39584Hdu == null) {
                    str = "surface";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C39056HHg(A0r5, A00, enumC39584Hdu, AbstractC25225BEi.A15(hco3.A0N), AbstractC25225BEi.A15(hco3.A0O), c16910sj, i);
            case 43:
                C27961Xa A002 = AbstractC54912fq.A00();
                HCO hco4 = (HCO) this.A01;
                UserSession A0r6 = AbstractC166987dD.A0r(hco4.A0M);
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0z;
                C54922fr A0S = AbstractC31175DnJ.A0S();
                A0S.A01(new P73(hco4, 5), (C64742wY) hco4.A0L.getValue());
                return AbstractC31175DnJ.A0T(hco4, A0r6, A0S, A002, quickPromotionSlot);
            case 44:
                return AbstractC54912fq.A00().A05(AbstractC166987dD.A0r(((HCO) this.A01).A0M), AbstractC06930Yk.A07(AbstractC25230BEn.A1b(QPTooltipAnchor.A0W, new C64712wV())));
        }
    }
}
