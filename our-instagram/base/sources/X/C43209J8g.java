package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.J8g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43209J8g extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43209J8g(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static BaseBundle A00(C43209J8g c43209J8g) {
        return (BaseBundle) ((HCI) c43209J8g.A01).A05.getValue();
    }

    public static C17050sx A01(Object obj, int i) {
        return AbstractC09440dt.A01(new C43209J8g(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v135, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v136, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v138, types: [X.2zJ, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Integer num;
        BaseBundle A04;
        String str;
        switch (this.A00) {
            case 0:
                A04 = A00(this);
                str = "media_id";
                return A04.getString(str);
            case 1:
                HCI hci = (HCI) this.A01;
                C66392zG A0R = AbstractC31174DnI.A0R(hci);
                A0R.A01(new Object());
                InterfaceC09390do interfaceC09390do = hci.A0K;
                A0R.A01(new C39081HIf(C62862tP.A03(hci, AbstractC166987dD.A0o(interfaceC09390do), (C57112jm) hci.A0R.getValue())));
                A0R.A01(new HIK(hci.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)));
                A0R.A01(new C39078HIc(hci.requireContext(), hci, AbstractC166987dD.A0r(interfaceC09390do), hci, C05F.A1F));
                C38057Gok.A00(A0R, new Object());
                A0R.A01(new Object());
                A0R.A01(new C52348NEm(null));
                A0R.A01(new Object());
                A0R.A01(new HIA(hci.requireContext()));
                A0R.A01(new HI8(AbstractC37304Gc5.A0K(hci)));
                return AbstractC31173DnH.A0R(A0R, new HI9(hci));
            case 2:
                A04 = A00(this);
                str = "shops_affiliate_marketer_id";
                return A04.getString(str);
            case 3:
                return AbstractC31179DnN.A04(this.A01);
            case 4:
                HCI hci2 = (HCI) this.A01;
                InterfaceC09390do interfaceC09390do2 = hci2.A0K;
                if (AbstractC37302Gc3.A1a(AbstractC166987dD.A0o(interfaceC09390do2))) {
                    return C1XJ.A00.A0Q(hci2.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do2), null, (C41206ILu) hci2.A07.getValue(), AbstractC25225BEi.A15(hci2.A0M), "instagram_shopping_reconsideration_destination", "reconsideration_destination", AbstractC41071vF.A0I(AbstractC166987dD.A0r(interfaceC09390do2), AbstractC25225BEi.A15(hci2.A02)), null, null, null);
                }
                return null;
            case 5:
                return AbstractC41357ISk.A00(AbstractC166987dD.A0r(((HCI) this.A01).A0K), EnumC39583Hdt.A0A);
            case 6:
                return AbstractC31174DnI.A0n(A00(this), "include_media_in_reconsideration");
            case 7:
                return AbstractC31174DnI.A0n(A00(this), "is_checkout_only");
            case 8:
                return AbstractC31174DnI.A0n(A00(this), "is_creator_shop");
            case 9:
                HCI hci3 = (HCI) this.A01;
                return new C41741IeF(AbstractC166987dD.A0r(hci3.A0K), AbstractC60952qJ.A01("instagram_shopping_reconsideration_destination", true, false), Long.valueOf(AbstractC166987dD.A0N(hci3.A0O.getValue())), AbstractC25225BEi.A15(hci3.A0M), AbstractC25225BEi.A15(hci3.A0E), AbstractC25225BEi.A15(hci3.A0F), AbstractC25225BEi.A15(hci3.A0C), AbstractC167007dF.A1W(hci3.A04.getValue()));
            case 10:
                A04 = A00(this);
                str = "merchant_id";
                return A04.getString(str);
            case 11:
                A04 = A00(this);
                str = "merchant_username";
                return A04.getString(str);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                String string = A00(this).getString("prior_module_name");
                if (string != null) {
                    return string;
                }
                throw AbstractC166987dD.A14("prior module required");
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A04 = A00(this);
                str = "prior_submodule_name";
                return A04.getString(str);
            case 14:
                List list = HHG.A0U;
                HCI hci4 = (HCI) this.A01;
                return new HHG(hci4.requireActivity(), hci4.requireContext(), hci4, AbstractC166987dD.A0r(hci4.A0K), AbstractC25225BEi.A15(hci4.A0M));
            case Process.SIGTERM /* 15 */:
                HCI hci5 = (HCI) this.A01;
                InterfaceC09390do interfaceC09390do3 = hci5.A0K;
                C41636IbR c41636IbR = new C41636IbR(hci5, AbstractC166987dD.A0r(interfaceC09390do3), hci5, EnumC39622HeW.A0R, AbstractC25225BEi.A15(hci5.A0M), AbstractC25225BEi.A15(hci5.A0E), AbstractC25225BEi.A15(hci5.A0F));
                c41636IbR.A00 = (C57112jm) hci5.A0R.getValue();
                InterfaceC09390do interfaceC09390do4 = hci5.A02;
                c41636IbR.A0A = AbstractC25225BEi.A15(interfaceC09390do4);
                c41636IbR.A01 = AbstractC31176DnK.A0Z(interfaceC09390do3).A02(AbstractC25225BEi.A15(interfaceC09390do4));
                c41636IbR.A07 = Long.valueOf(AbstractC166987dD.A0N(hci5.A0O.getValue()));
                c41636IbR.A09 = AbstractC25225BEi.A15(hci5.A04);
                return c41636IbR.A02();
            case 16:
                HCI hci6 = (HCI) this.A01;
                return new HHK(hci6.requireContext(), hci6, hci6, AbstractC166987dD.A0r(hci6.A0K));
            case 17:
                HCI hci7 = (HCI) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(hci7.A0K);
                Context requireContext = hci7.requireContext();
                InterfaceC09390do interfaceC09390do5 = hci7.A0C;
                String A15 = AbstractC25225BEi.A15(interfaceC09390do5);
                C08790ch A00 = AbstractC018607g.A00(hci7);
                if (interfaceC09390do5.getValue() != null) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                return new HH8(requireContext, A00, A0r, hci7, num, A15);
            case 18:
                return AbstractC61112qZ.A00((Bundle) ((HCI) this.A01).A05.getValue());
            case Process.SIGSTOP /* 19 */:
                A04 = A00(this);
                str = "shops_first_entry_point";
                return A04.getString(str);
            case 20:
                return Long.valueOf(A00(this).getLong("shops_profile_entry_ig_id", 0L));
            case 21:
                return this.A01;
            case 22:
                return AbstractC25226BEj.A1C(this.A01);
            case 23:
                return AbstractC167027dH.A0B(this.A01);
            case 24:
                A04 = A00(this);
                str = "surface_title";
                return A04.getString(str);
            case 25:
                HCI hci8 = (HCI) this.A01;
                return new C39060HHk(hci8, AbstractC166987dD.A0r(hci8.A0K), AbstractC37304Gc5.A0K(hci8), hci8, AbstractC25225BEi.A15(hci8.A0C), AbstractC25225BEi.A15(hci8.A0D), AbstractC167007dF.A1Z(hci8.A09), AbstractC167007dF.A1Z(hci8.A0A), AbstractC167007dF.A1Z(hci8.A08));
            case 26:
                HCI hci9 = (HCI) this.A01;
                if (hci9.A0C.getValue() == null) {
                    UserSession A0r2 = AbstractC166987dD.A0r(hci9.A0K);
                    FragmentActivity requireActivity = hci9.requireActivity();
                    Context requireContext2 = hci9.requireContext();
                    String A152 = AbstractC25225BEi.A15(hci9.A0M);
                    C41741IeF A0K = AbstractC37304Gc5.A0K(hci9);
                    hci9.A0E.getValue();
                    hci9.A0F.getValue();
                    return new IMK(requireContext2, requireActivity, A0r2, A0K, "instagram_shopping_reconsideration_destination", A152);
                }
                return null;
            case 27:
                C42931Iyj c42931Iyj = (C42931Iyj) this.A01;
                return new C42913IyR(c42931Iyj.A00, c42931Iyj.A01, c42931Iyj.A02);
            case 28:
                HCP hcp = (HCP) this.A01;
                return new INQ(hcp.requireContext(), AbstractC166987dD.A0r(hcp.A06), hcp, hcp);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                HCU hcu = (HCU) this.A01;
                Context requireContext3 = hcu.requireContext();
                UserSession A0r3 = AbstractC166987dD.A0r(hcu.A0D);
                InterfaceC09390do interfaceC09390do6 = hcu.A08;
                List list2 = AbstractC37303Gc4.A0F(interfaceC09390do6).A08;
                return new HEX(requireContext3, A0r3, hcu, hcu, (C42882Ixw) hcu.A09.getValue(), hcu.A03, AbstractC37300Gc1.A0I(hcu.A0E), list2, AbstractC37303Gc4.A0F(interfaceC09390do6).A09);
            case 30:
                HCU hcu2 = (HCU) this.A01;
                return C38287GsW.A00(AbstractC166987dD.A0r(hcu2.A0D), hcu2, 5);
            case 31:
                Parcelable parcelable = AbstractC31179DnN.A04(this.A01).getParcelable("featured_product_media_feed_grid_configuration");
                C14360o3.A0A(parcelable);
                return parcelable;
            case 32:
                HCU hcu3 = (HCU) this.A01;
                return new C42882Ixw(hcu3.requireContext(), hcu3, AbstractC37303Gc4.A0F(hcu3.A08), AbstractC37300Gc1.A0I(hcu3.A0E));
            case 33:
                HCU hcu4 = (HCU) this.A01;
                C675132q c675132q = new C675132q(hcu4, AbstractC166987dD.A0r(hcu4.A0D), hcu4);
                c675132q.A05 = AbstractC25225BEi.A15(hcu4.A0F);
                return c675132q;
            case 34:
                return AbstractC31179DnN.A04(this.A01).getParcelable("product_details_page_logging_info");
            case 35:
                HCU hcu5 = (HCU) this.A01;
                FragmentActivity requireActivity2 = hcu5.requireActivity();
                AbstractC10360h2 abstractC10360h2 = hcu5.mFragmentManager;
                if (abstractC10360h2 != null) {
                    return new AnonymousClass308(requireActivity2, hcu5, abstractC10360h2, AbstractC166987dD.A0r(hcu5.A0D), null, hcu5, new C42601ItK(hcu5, 0), null, false, true, false);
                }
                throw AbstractC166997dE.A0g();
            case 36:
                HCU hcu6 = (HCU) this.A01;
                return new J1L(hcu6.requireContext(), AbstractC018607g.A00(hcu6), AbstractC166987dD.A0r(hcu6.A0D), hcu6, AbstractC37303Gc4.A0F(hcu6.A08).A05);
            case 37:
                return AbstractC61112qZ.A00(((Fragment) this.A01).mArguments);
            case 38:
                HCU hcu7 = (HCU) this.A01;
                return AbstractC31176DnK.A0M(hcu7, hcu7.A0D);
            case 39:
                HCX hcx = (HCX) this.A01;
                return new C38978HEg(hcx.requireActivity(), (C61142qc) hcx.A09.getValue(), (C60972qL) hcx.A0B.getValue(), hcx, AbstractC37300Gc1.A0I(hcx.A0L));
            case 40:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "api_path");
            case Seq.NULL_REFNUM /* 41 */:
                return new C61122qa(AbstractC166987dD.A0r(((HCX) this.A01).A0K));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                HCX hcx2 = (HCX) this.A01;
                AbstractC10360h2 parentFragmentManager = hcx2.getParentFragmentManager();
                InterfaceC09390do interfaceC09390do7 = hcx2.A07;
                AnonymousClass391 anonymousClass391 = new AnonymousClass391(hcx2, parentFragmentManager, (C38978HEg) interfaceC09390do7.getValue(), (C60972qL) hcx2.A0B.getValue());
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                anonymousClass391.A0C = new C33A(hcx2, (ViewOnTouchListenerC60632pm) hcx2.A0I.getValue(), hcx2.A05, (C38978HEg) interfaceC09390do7.getValue());
                anonymousClass391.A0W = AbstractC25225BEi.A15(hcx2.A0M);
                return anonymousClass391.A00();
            case 43:
                HCX hcx3 = (HCX) this.A01;
                return new C60972qL(hcx3.requireContext(), AbstractC166987dD.A0r(hcx3.A0K), hcx3);
            case 44:
                return AbstractC31179DnN.A04(this.A01).getStringArrayList("media_ids");
            case 45:
                HCX hcx4 = (HCX) this.A01;
                C675132q c675132q2 = new C675132q(hcx4, AbstractC166987dD.A0r(hcx4.A0K), hcx4);
                c675132q2.A05 = AbstractC25225BEi.A15(hcx4.A0M);
                return c675132q2;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                HCX hcx5 = (HCX) this.A01;
                return C38287GsW.A00(AbstractC166987dD.A0r(hcx5.A0K), hcx5, 6);
            case 47:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "merchant_id";
                return A04.getString(str);
            case 48:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "prior_module_name";
                return A04.getString(str);
            default:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "prior_submodule_name";
                return A04.getString(str);
        }
    }
}
