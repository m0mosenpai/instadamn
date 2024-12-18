package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import go.Seq;
import instagram.features.stories.fragment.ReelResharesViewerFragment;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class J7R extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7R(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        InterfaceC1118853a interfaceC1118853a;
        switch (this.A00) {
            case 0:
                HCQ hcq = (HCQ) this.A01;
                return C38287GsW.A00(AbstractC166987dD.A0r(hcq.A0P), hcq, 13);
            case 1:
                return AbstractC31179DnN.A04(this.A01).getString("prior_module_name");
            case 2:
                return AbstractC31179DnN.A04(this.A01).getString("prior_submodule_name");
            case 3:
                HCQ hcq2 = (HCQ) this.A01;
                C41636IbR c41636IbR = new C41636IbR(hcq2, AbstractC166987dD.A0r(hcq2.A0P), hcq2, EnumC39622HeW.A0Q, AbstractC25225BEi.A15(hcq2.A0Q), AbstractC25225BEi.A15(hcq2.A0J), AbstractC25225BEi.A15(hcq2.A0K));
                c41636IbR.A00 = hcq2.A01;
                return c41636IbR.A02();
            case 4:
                return new C42915IyT((HCQ) this.A01);
            case 5:
                HCQ hcq3 = (HCQ) this.A01;
                C57112jm c57112jm = hcq3.A01;
                UserSession A0r = AbstractC166987dD.A0r(hcq3.A0P);
                String A15 = AbstractC25225BEi.A15(hcq3.A0Q);
                Bundle bundle = hcq3.mArguments;
                if (bundle != null) {
                    str = bundle.getString("shop_owner_id");
                } else {
                    str = null;
                }
                String A152 = AbstractC25225BEi.A15(hcq3.A0J);
                if (A152 == null) {
                    A152 = "";
                }
                return new C64892wn(A0r, c57112jm, hcq3, A15, null, str, A152, AbstractC25225BEi.A15(hcq3.A0K), null, null, -1);
            case 6:
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return AbstractC60622pl.A00(AbstractC31172DnG.A07(this.A01), null, false);
            case 7:
                return AbstractC61112qZ.A00(AbstractC31179DnN.A04(this.A01));
            case 8:
            case 11:
            case 18:
            case 35:
                return this.A01;
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGSTOP /* 19 */:
            case 36:
                return AbstractC25226BEj.A1C(this.A01);
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 20:
            case 37:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 14:
                return AbstractC31179DnN.A04(this.A01).getString("media_feed_title");
            case Process.SIGTERM /* 15 */:
                HCQ hcq4 = (HCQ) this.A01;
                return new HHV(hcq4.requireArguments().getBundle("media_feed_extras"), AbstractC166987dD.A0r(hcq4.A0P), (EnumC39540HdC) hcq4.A07.getValue());
            case 16:
                HCQ hcq5 = (HCQ) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(hcq5.A0P);
                return new IMK(hcq5.requireContext(), hcq5.requireActivity(), A0r2, null, hcq5.getModuleName(), AbstractC25225BEi.A15(hcq5.A0Q));
            case 17:
                return new C61122qa(AbstractC166987dD.A0r(((HDI) this.A01).A0K));
            case 21:
                C38937HCk c38937HCk = (C38937HCk) this.A01;
                SpinnerImageView spinnerImageView = c38937HCk.A02;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C3T1.LOADING);
                }
                AbstractC167007dF.A0x(c38937HCk.A00);
                return C0eB.A00;
            case 22:
                interfaceC1118853a = ((IE9) this.A01).A00;
                interfaceC1118853a.EJJ();
                return C0eB.A00;
            case 23:
                throw AbstractC166987dD.A15("barPicker");
            case 24:
                throw AbstractC166987dD.A15("privacyBannerContainer");
            case 25:
                throw AbstractC166987dD.A15("stringPicker");
            case 26:
                GIS gis = (GIS) this.A01;
                return new FR7(gis.A02, gis.A04);
            case 27:
                ReelResharesViewerFragment reelResharesViewerFragment = (ReelResharesViewerFragment) this.A01;
                return new C38E(reelResharesViewerFragment, AbstractC166987dD.A0r(reelResharesViewerFragment.A05), AbstractC37301Gc2.A0L(reelResharesViewerFragment));
            case 28:
                ((C145176gc) this.A01).A18.EJz();
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 32:
                ((C145176gc) this.A01).A18.EJE("tapped");
                return C0eB.A00;
            case 30:
            case 31:
            case 33:
                interfaceC1118853a = ((C145176gc) this.A01).A18;
                interfaceC1118853a.EJJ();
                return C0eB.A00;
            case 34:
                interfaceC1118853a = ((C145406gz) this.A01).A0B;
                interfaceC1118853a.EJJ();
                return C0eB.A00;
            case 38:
                UserSession userSession = ((AbstractC67881V0m) this.A01).A00;
                C14360o3.A07(userSession);
                return new C215669gi(userSession);
            case 39:
                return new C217859kI((StoryGroupMentionTappableData) AbstractC153636vY.A00(AbstractC31179DnN.A04(this.A01), StoryGroupMentionTappableData.class, AbstractC111324zv.A00(965)));
            case 40:
                AbstractC67881V0m abstractC67881V0m = (AbstractC67881V0m) this.A01;
                UserSession userSession2 = abstractC67881V0m.A00;
                C14360o3.A06(userSession2);
                return AnonymousClass189.A00(userSession2).A02(abstractC67881V0m.requireArguments().getString(AbstractC43591JPw.A00(418)));
            case Seq.NULL_REFNUM /* 41 */:
                return new PromptStickerModel((StoryPromptTappableDataIntf) AbstractC153636vY.A00(AbstractC31179DnN.A04(this.A01), StoryPromptTappableDataIntf.class, AbstractC43591JPw.A00(9)));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 45:
                Serializable serializable = AbstractC31179DnN.A04(this.A01).getSerializable(AbstractC111324zv.A00(5131));
                if (!(serializable instanceof HashMap)) {
                    return null;
                }
                return serializable;
            case 43:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 44:
                UserSession userSession3 = ((AbstractC67881V0m) this.A01).A00;
                C14360o3.A07(userSession3);
                return new C146116i9(userSession3);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                Serializable serializable2 = AbstractC31179DnN.A04(this.A01).getSerializable(AbstractC111324zv.A00(775));
                if ((serializable2 instanceof C22P) && serializable2 != null) {
                    return serializable2;
                }
                return C22P.A47;
            case 47:
                return AbstractC31179DnN.A04(this.A01).getParcelable(MSV.A00(551));
            case 48:
                return AbstractC31174DnI.A0n(AbstractC31179DnN.A04(this.A01), AbstractC111324zv.A00(5132));
            case 49:
                return AbstractC203338yq.parseFromJson(C16V.A00(AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), MSV.A00(552))));
        }
    }
}
