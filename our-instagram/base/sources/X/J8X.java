package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import go.Seq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class J8X extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8X(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new J8X(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return ((C38510GwV) this.A01).A00.findViewById(R.id.save_button);
            case 1:
                return ((C38510GwV) this.A01).A00.findViewById(R.id.secondary_body);
            case 2:
                return ((C38510GwV) this.A01).A00.findViewById(R.id.share_button);
            case 3:
                return ((C38510GwV) this.A01).A00.findViewById(R.id.tertiary_body);
            case 4:
                return ((View) this.A01).findViewById(R.id.discount_description);
            case 5:
                return ((View) this.A01).findViewById(R.id.discount_link);
            case 6:
                return ((View) this.A01).findViewById(R.id.discount_title);
            case 7:
                return ((View) this.A01).findViewById(R.id.media);
            case 8:
                ViewStub viewStub = (ViewStub) AbstractC166987dD.A0c(((IFK) this.A01).A00.getView(), R.id.switch_row_stub);
                C14360o3.A0B(viewStub, 0);
                viewStub.setLayoutResource(R.layout.row_switch_item);
                View inflate = viewStub.inflate();
                C14360o3.A0A(inflate);
                C31981E3j c31981E3j = new C31981E3j(inflate);
                inflate.setTag(c31981E3j);
                F89.A00(inflate, c31981E3j.A06);
                return inflate;
            case 9:
                return new C38294Gsd(((C38508GwT) this.A01).A00);
            case 10:
                return new C41696IdP((UserSession) this.A01);
            case 11:
                return new C41642IbY((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C42346Ip8((UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new ILe((UserSession) this.A01);
            case 14:
                return new IFN((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                C41762Ied c41762Ied = (C41762Ied) this.A01;
                return AbstractC12220kQ.A01(c41762Ied.A03, c41762Ied.A02);
            case 16:
                C41234IMz c41234IMz = (C41234IMz) this.A01;
                return AbstractC12220kQ.A01(c41234IMz.A00, c41234IMz.A01);
            case 17:
                C41234IMz c41234IMz2 = (C41234IMz) this.A01;
                ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = c41234IMz2.A02;
                String str = shoppingTaggingFeedArguments.A0E;
                if (str != null) {
                    return C56141Ow2.A04.A00(c41234IMz2.A01).A00(shoppingTaggingFeedArguments.A0G, str);
                }
                return null;
            case 18:
                return new OHU(AbstractC40691uc.A01((UserSession) this.A01));
            case Process.SIGSTOP /* 19 */:
                return AbstractC25227BEk.A0p();
            case 20:
                return C57652ke.A00(((C41082IGz) this.A01).A00);
            case 21:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return this.A01;
            case 22:
            case 47:
                return AbstractC25226BEj.A1C(this.A01);
            case 23:
            case 48:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 24:
                C41646Ibe c41646Ibe = (C41646Ibe) this.A01;
                return new C41742IeG(c41646Ibe.A02.requireActivity(), c41646Ibe.A03);
            case 25:
                C41636IbR c41636IbR = (C41636IbR) this.A01;
                Fragment fragment = c41636IbR.A0K;
                FragmentActivity requireActivity = fragment.requireActivity();
                Context requireContext = fragment.requireContext();
                UserSession userSession = c41636IbR.A0L;
                InterfaceC60442pS interfaceC60442pS = c41636IbR.A0M;
                String str2 = c41636IbR.A0Q;
                return AbstractC64962wu.A00(requireContext, requireActivity, null, userSession, interfaceC60442pS, null, null, null, c41636IbR.A09, null, null, c41636IbR.A0O, c41636IbR.A0P, c41636IbR.A0F, str2, false, AbstractC167007dF.A1X(c41636IbR.A0N, EnumC39622HeW.A0U));
            case 26:
                HHG hhg = (HHG) this.A01;
                List list = HHG.A0U;
                return new IJ8(hhg.A0N, hhg.A0L, hhg.A0O, hhg.A0K.getModuleName());
            case 27:
                C55982hj A0R = AbstractC167007dF.A0R();
                A0R.A06 = true;
                A0R.A00 = 0.019999999552965164d;
                A0R.A09(AbstractC669130i.A00);
                A0R.A0A(new H8I(this.A01, 1));
                return A0R;
            case 28:
                HHG hhg2 = (HHG) this.A01;
                List list2 = HHG.A0U;
                return new IK3(hhg2.A0I, hhg2.A0J, hhg2.A0L, hhg2.A0N, (IJ8) hhg2.A0P.getValue(), hhg2.A0O, hhg2.A0K.getModuleName());
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                int i = ViewOnTouchListenerC668930g.A0I;
                HHG hhg3 = (HHG) this.A01;
                List list3 = HHG.A0U;
                ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = new ViewOnTouchListenerC668930g(hhg3.A0J, hhg3.A0L, hhg3.A0M);
                viewOnTouchListenerC668930g.A0D = false;
                viewOnTouchListenerC668930g.A01 = 0L;
                viewOnTouchListenerC668930g.A04.A09(C55942hf.A02(10.0d));
                viewOnTouchListenerC668930g.A05.A09(C55942hf.A03(8.0d, 12.0d));
                return viewOnTouchListenerC668930g;
            case 30:
                new ArrayList();
                throw AbstractC166987dD.A15("cartActionBarController");
            case 31:
                return new C41204ILs((UserSession) this.A01);
            case 32:
                return AbstractC37301Gc2.A0T(((HHK) this.A01).A05.getResources(), R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            case 33:
                HCR hcr = (HCR) this.A01;
                return new C38973HEb(hcr.requireActivity(), (C61142qc) hcr.A07.getValue(), (C60972qL) hcr.A0A.getValue(), hcr, (C42881Ixv) hcr.A08.getValue());
            case 34:
                return new C61122qa(AbstractC166987dD.A0r(((HCR) this.A01).A0H));
            case 35:
                HCR hcr2 = (HCR) this.A01;
                return new C42881Ixv(hcr2.requireContext(), (IM9) hcr2.A0J.getValue(), hcr2, AbstractC25225BEi.A15(hcr2.A0C));
            case 36:
                HCR hcr3 = (HCR) this.A01;
                AbstractC10360h2 parentFragmentManager = hcr3.getParentFragmentManager();
                InterfaceC09390do interfaceC09390do = hcr3.A06;
                AnonymousClass391 anonymousClass391 = new AnonymousClass391(hcr3, parentFragmentManager, (C38973HEb) interfaceC09390do.getValue(), (C60972qL) hcr3.A0A.getValue());
                int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                anonymousClass391.A0C = new C33A(hcr3, (ViewOnTouchListenerC60632pm) hcr3.A0G.getValue(), hcr3.A05, (C38973HEb) interfaceC09390do.getValue());
                anonymousClass391.A0W = AbstractC25225BEi.A15(hcr3.A0I);
                return anonymousClass391.A00();
            case 37:
                HCR hcr4 = (HCR) this.A01;
                return new C60972qL(hcr4.requireContext(), AbstractC166987dD.A0r(hcr4.A0H), hcr4);
            case 38:
                return Integer.valueOf(AbstractC31179DnN.A04(this.A01).getInt("media_carousel_index", -1));
            case 39:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "media_id");
            case 40:
                HCR hcr5 = (HCR) this.A01;
                C675132q c675132q = new C675132q(hcr5, AbstractC166987dD.A0r(hcr5.A0H), hcr5);
                c675132q.A05 = AbstractC25225BEi.A15(hcr5.A0I);
                return c675132q;
            case Seq.NULL_REFNUM /* 41 */:
                HCR hcr6 = (HCR) this.A01;
                return new C3CO(AbstractC166987dD.A0r(hcr6.A0H), (C38973HEb) hcr6.A06.getValue(), false, false);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC31179DnN.A04(this.A01).getString("permission_id");
            case 43:
                int i3 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return AbstractC60622pl.A00(AbstractC31172DnG.A07(this.A01), null, false);
            case 44:
                return AbstractC61112qZ.A00(((Fragment) this.A01).mArguments);
            case 45:
                HCR hcr7 = (HCR) this.A01;
                return new IM9(hcr7.requireContext(), AbstractC018607g.A00(hcr7), AbstractC166987dD.A0r(hcr7.A0H), hcr7);
            case 49:
                HCR hcr8 = (HCR) this.A01;
                return new C41615Ib5(hcr8, AbstractC166987dD.A0r(hcr8.A0H), hcr8.A04, AbstractC25225BEi.A15(hcr8.A0I), null, null);
        }
    }
}
