package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes7.dex */
public final class J8Y extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8Y(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new J8Y(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
            case 32:
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return AbstractC60622pl.A00(AbstractC31172DnG.A07(this.A01), null, false);
            case 1:
            case 33:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "selected_media_id");
            case 2:
                HCX hcx = (HCX) this.A01;
                return new J1L(hcx.requireContext(), AbstractC018607g.A00(hcx), AbstractC166987dD.A0r(hcx.A0K), hcx, hcx.requireArguments().getString("next_max_id"));
            case 3:
            case 18:
            case 35:
            case 48:
                return AbstractC61112qZ.A00(((Fragment) this.A01).mArguments);
            case 4:
            case 36:
                return this.A01;
            case 5:
            case 37:
                return AbstractC25226BEj.A1C(this.A01);
            case 6:
            case 38:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 7:
            case 39:
                return AbstractC31179DnN.A04(this.A01).getString("surface_title");
            case 8:
                HCX hcx2 = (HCX) this.A01;
                return AbstractC31176DnK.A0M(hcx2, hcx2.A0K);
            case 9:
                HCX hcx3 = (HCX) this.A01;
                return new C41615Ib5(hcx3, AbstractC166987dD.A0r(hcx3.A0K), hcx3.A04, AbstractC25225BEi.A15(hcx3.A0M), AbstractC25225BEi.A15(hcx3.A0G), AbstractC25225BEi.A15(hcx3.A0H));
            case 10:
                HCV hcv = (HCV) this.A01;
                Context requireContext = hcv.requireContext();
                UserSession A0r = AbstractC166987dD.A0r(hcv.A0D);
                C38U c38u = hcv.A03;
                J1L A0I = AbstractC37300Gc1.A0I(hcv.A0E);
                C42882Ixw c42882Ixw = (C42882Ixw) hcv.A09.getValue();
                hcv.A08.getValue();
                return new HEY(requireContext, A0r, hcv, hcv, c42882Ixw, c38u, A0I);
            case 11:
                HCV hcv2 = (HCV) this.A01;
                return C38287GsW.A00(AbstractC166987dD.A0r(hcv2.A0D), hcv2, 7);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Parcelable parcelable = AbstractC31179DnN.A04(this.A01).getParcelable("featured_product_media_feed_grid_configuration");
                C14360o3.A0A(parcelable);
                return parcelable;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                HCV hcv3 = (HCV) this.A01;
                return new C42882Ixw(hcv3.requireContext(), hcv3, AbstractC37303Gc4.A0F(hcv3.A08), AbstractC37300Gc1.A0I(hcv3.A0E));
            case 14:
                HCV hcv4 = (HCV) this.A01;
                C675132q c675132q = new C675132q(hcv4, AbstractC166987dD.A0r(hcv4.A0D), hcv4);
                c675132q.A05 = AbstractC25225BEi.A15(hcv4.A0F);
                return c675132q;
            case Process.SIGTERM /* 15 */:
                return AbstractC31179DnN.A04(this.A01).getParcelable("product_details_page_logging_info");
            case 16:
                HCV hcv5 = (HCV) this.A01;
                FragmentActivity requireActivity = hcv5.requireActivity();
                AbstractC10360h2 abstractC10360h2 = hcv5.mFragmentManager;
                if (abstractC10360h2 != null) {
                    return new AnonymousClass308(requireActivity, hcv5, abstractC10360h2, AbstractC166987dD.A0r(hcv5.A0D), null, hcv5, new C42601ItK(hcv5, 1), null, false, true, false);
                }
                throw AbstractC166997dE.A0g();
            case 17:
                HCV hcv6 = (HCV) this.A01;
                return new J1L(hcv6.requireContext(), AbstractC018607g.A00(hcv6), AbstractC166987dD.A0r(hcv6.A0D), hcv6, AbstractC37303Gc4.A0F(hcv6.A08).A05);
            case Process.SIGSTOP /* 19 */:
                HCV hcv7 = (HCV) this.A01;
                return AbstractC31176DnK.A0M(hcv7, hcv7.A0D);
            case 20:
                HCW hcw = (HCW) this.A01;
                FragmentActivity requireActivity2 = hcw.requireActivity();
                C60972qL c60972qL = (C60972qL) hcw.A0B.getValue();
                return new C38979HEh(requireActivity2, (C61142qc) hcw.A09.getValue(), c60972qL, (C64862wk) hcw.A0I.getValue(), AbstractC37300Gc1.A0I(hcw.A0M));
            case 21:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "api_path");
            case 22:
                return new C61122qa(AbstractC166987dD.A0r(((HCW) this.A01).A0L));
            case 23:
                HCW hcw2 = (HCW) this.A01;
                AbstractC10360h2 parentFragmentManager = hcw2.getParentFragmentManager();
                InterfaceC09390do interfaceC09390do = hcw2.A07;
                AnonymousClass391 anonymousClass391 = new AnonymousClass391(hcw2, parentFragmentManager, (C38979HEh) interfaceC09390do.getValue(), (C60972qL) hcw2.A0B.getValue());
                int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                anonymousClass391.A0C = new C33A(hcw2, (ViewOnTouchListenerC60632pm) hcw2.A0J.getValue(), hcw2.A05, (C38979HEh) interfaceC09390do.getValue());
                anonymousClass391.A0W = AbstractC25225BEi.A15(hcw2.A0N);
                return anonymousClass391.A00();
            case 24:
                HCW hcw3 = (HCW) this.A01;
                return new C60972qL(hcw3.requireContext(), AbstractC166987dD.A0r(hcw3.A0L), hcw3);
            case 25:
                return AbstractC31179DnN.A04(this.A01).getStringArrayList("media_ids");
            case 26:
                HCW hcw4 = (HCW) this.A01;
                C675132q c675132q2 = new C675132q(hcw4, AbstractC166987dD.A0r(hcw4.A0L), hcw4);
                c675132q2.A05 = AbstractC25225BEi.A15(hcw4.A0N);
                return c675132q2;
            case 27:
                HCW hcw5 = (HCW) this.A01;
                return C38287GsW.A00(AbstractC166987dD.A0r(hcw5.A0L), hcw5, 8);
            case 28:
                return AbstractC31179DnN.A04(this.A01).getString("merchant_id");
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC31179DnN.A04(this.A01).getString("prior_module_name");
            case 30:
                return AbstractC31179DnN.A04(this.A01).getString("prior_submodule_name");
            case 31:
                HCW hcw6 = (HCW) this.A01;
                return new C64862wk(hcw6, AbstractC166987dD.A0r(hcw6.A0L), hcw6.A04, hcw6, EnumC64852wj.A03, AbstractC25225BEi.A15(hcw6.A0N), AbstractC25225BEi.A15(hcw6.A0G), null, null, -1);
            case 34:
                HCW hcw7 = (HCW) this.A01;
                return new J1L(hcw7.requireContext(), AbstractC018607g.A00(hcw7), AbstractC166987dD.A0r(hcw7.A0L), hcw7, hcw7.requireArguments().getString("next_max_id"));
            case 40:
                HCW hcw8 = (HCW) this.A01;
                return AbstractC31176DnK.A0M(hcw8, hcw8.A0L);
            case Seq.NULL_REFNUM /* 41 */:
                HCS hcs = (HCS) this.A01;
                return new C38975HEd(hcs.requireContext(), AbstractC166987dD.A0r(hcs.A0D), hcs, hcs, hcs, (C42883Ixx) hcs.A09.getValue(), hcs.A04, AbstractC37300Gc1.A0I(hcs.A0E));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                HCS hcs2 = (HCS) this.A01;
                return C38287GsW.A00(AbstractC166987dD.A0r(hcs2.A0D), hcs2, 9);
            case 43:
                HCS hcs3 = (HCS) this.A01;
                return new C42883Ixx(hcs3.requireActivity(), AbstractC166987dD.A0r(hcs3.A0D), (IN0) hcs3.A0A.getValue(), hcs3, AbstractC25225BEi.A15(hcs3.A0F), new JEZ(hcs3, 46), new JEZ(hcs3, 47));
            case 44:
                HCS hcs4 = (HCS) this.A01;
                Context requireContext2 = hcs4.requireContext();
                InterfaceC09390do interfaceC09390do2 = hcs4.A0D;
                return new IN0(requireContext2, AbstractC018607g.A00(hcs4), AbstractC166987dD.A0r(interfaceC09390do2), AbstractC31173DnH.A0t(interfaceC09390do2));
            case 45:
                HCS hcs5 = (HCS) this.A01;
                C675132q c675132q3 = new C675132q(hcs5, AbstractC166987dD.A0r(hcs5.A0D), hcs5);
                c675132q3.A05 = AbstractC25225BEi.A15(hcs5.A0F);
                return c675132q3;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                HCS hcs6 = (HCS) this.A01;
                return new AnonymousClass308(hcs6.requireActivity(), hcs6, hcs6.getParentFragmentManager(), AbstractC166987dD.A0r(hcs6.A0D), null, hcs6, new C42601ItK(hcs6, 2), null, false, true, false);
            case 47:
                HCS hcs7 = (HCS) this.A01;
                return new J1L(hcs7.requireContext(), AbstractC018607g.A00(hcs7), AbstractC166987dD.A0r(hcs7.A0D), hcs7, null);
            case 49:
                return ((Fragment) this.A01).getString(2131962404);
        }
    }
}
