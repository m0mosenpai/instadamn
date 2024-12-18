package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ClipsTemplateBrowserV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import go.Seq;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.Pfp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57515Pfp extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57515Pfp(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57515Pfp(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C00M onBackPressedDispatcher;
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A01;
                return Integer.valueOf((int) (((AbstractC13890nF.A01(fragment.requireContext()) - (AbstractC167017dG.A03(fragment.requireContext()) * 2)) - AbstractC167017dG.A06(fragment.requireContext())) / 1.6f));
            case 1:
                return new PKR((C52161N6n) this.A01);
            case 2:
                Fragment fragment2 = (Fragment) this.A01;
                if (fragment2.requireArguments().getSerializable("clips_template_browser_v2_type") == null) {
                    return null;
                }
                Serializable serializable = fragment2.requireArguments().getSerializable("clips_template_browser_v2_type");
                if (serializable != null) {
                    return serializable;
                }
                throw AbstractC166997dE.A0g();
            case 3:
                return new C25908BdB(this.A01, 4);
            case 4:
                return new PKT((C52161N6n) this.A01);
            case 5:
            case 8:
            case 11:
            case Process.SIGSTOP /* 19 */:
            case 27:
                return this.A01;
            case 6:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 20:
            case 28:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 21:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 14:
                Fragment fragment3 = ((Fragment) this.A01).mParentFragment;
                if (fragment3 == null) {
                    return null;
                }
                InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57515Pfp(new C57515Pfp(fragment3, 11), 12));
                return MSY.A0c(new C57515Pfp(A00, 13), new D8J(29, A00, fragment3), new D8J(28, null, A00), AbstractC25225BEi.A1D(C50983Mfq.class));
            case Process.SIGTERM /* 15 */:
                C52161N6n c52161N6n = (C52161N6n) this.A01;
                return new NCO(AbstractC166987dD.A0r(c52161N6n.A0I), c52161N6n.requireActivity());
            case 16:
                C52161N6n c52161N6n2 = (C52161N6n) this.A01;
                return new NDQ((ClipsTemplateBrowserV2Type) c52161N6n2.A0F.getValue(), c52161N6n2, AbstractC166987dD.A0r(c52161N6n2.A0I), AbstractC25225BEi.A15(c52161N6n2.A0M));
            case 17:
                Fragment fragment4 = (Fragment) this.A01;
                if (fragment4.requireArguments().getSerializable("ClipsConstants.ARGS_MWA_AC_TEMPLATE_CATEGORY") == null) {
                    return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
                return fragment4.requireArguments().getSerializable("ClipsConstants.ARGS_MWA_AC_TEMPLATE_CATEGORY");
            case 18:
                return Integer.valueOf(AbstractC167017dG.A0A(AbstractC31172DnG.A07(this.A01)));
            case 22:
                C27343C4y c27343C4y = (C27343C4y) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return AbstractC167017dG.A0U(c27343C4y.A01, R.id.empty_state_layout);
            case 23:
                return new C25908BdB(this.A01, 5);
            case 24:
                C27343C4y c27343C4y2 = (C27343C4y) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new LinearLayoutManager(c27343C4y2.A01.getContext(), 0, false);
            case 25:
                UserSession userSession = ((J23) this.A01).A04;
                return userSession.A01(C47277Kuo.class, new MHO(userSession, 35));
            case 26:
                J23 j23 = (J23) this.A01;
                return new C5TA(j23.A03, j23.A04, null, j23, "ClipsTemplateBrowserVideoPlayer");
            case 30:
                C26832Bsu c26832Bsu = (C26832Bsu) this.A01;
                String str2 = c26832Bsu.A04;
                if (str2 == null) {
                    str = "mediaId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                Context requireContext = c26832Bsu.requireContext();
                UserSession A0r = AbstractC166987dD.A0r(c26832Bsu.A06);
                String str3 = c26832Bsu.A05;
                C08790ch A002 = AbstractC018607g.A00(c26832Bsu);
                AbstractC43594JPz.A1P(A0r, str3);
                return new C27050BwU(requireContext, A002, c26832Bsu, A0r, str3, str2, 1);
            case 31:
                return AbstractC153636vY.A01(AbstractC31179DnN.A04(this.A01), "clips_share_sheet_draft_info_session_id");
            case 32:
                return Boolean.valueOf(AbstractC31172DnG.A1X(AbstractC31179DnN.A04(this.A01), "clips_is_lip_sync_on"));
            case 33:
                return Boolean.valueOf(AbstractC31172DnG.A1X(AbstractC31179DnN.A04(this.A01), "clips_is_voice_translations_on"));
            case 34:
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A01);
                if (A09 != null && (onBackPressedDispatcher = A09.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.A04();
                }
                return C0eB.A00;
            case 35:
                return Integer.valueOf(AbstractC31179DnN.A04(this.A01).getInt("clips_selected_languages_count", 0));
            case 36:
            case 38:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
                return AbstractC25235BEs.A0U(this.A01);
            case 37:
                N5S n5s = (N5S) this.A01;
                FragmentActivity requireActivity = n5s.requireActivity();
                UserSession A0r2 = AbstractC166987dD.A0r(n5s.A0C);
                FragmentActivity requireActivity2 = n5s.requireActivity();
                String str4 = n5s.A05;
                if (str4 == null) {
                    str = "draftSessionId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C50851Mdi(requireActivity2, requireActivity, A0r2, str4);
            case 39:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC50523MSb.A0A(this.A01);
            case 40:
                return AbstractC25230BEn.A0l(((N5S) this.A01).A0C);
            case 44:
                return new MVG(AbstractC166987dD.A0r(((C38921HBt) this.A01).A06));
            case 45:
                return new C56144Ow8((UserSession) this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C37675GiC c37675GiC = (C37675GiC) this.A01;
                return C39E.A00(c37675GiC.A07, c37675GiC.A0D, c37675GiC.A0C);
            case 47:
                C37675GiC c37675GiC2 = (C37675GiC) this.A01;
                MVS mvs = c37675GiC2.A0L;
                Iterator A1J = AbstractC25226BEj.A1J(mvs.A05.getValue());
                while (A1J.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(A1J);
                    if (A1B != null) {
                        mvs.A00(A1B);
                    }
                }
                c37675GiC2.A0d.A0Y(false);
                return C0eB.A00;
            case 48:
                C37675GiC c37675GiC3 = (C37675GiC) this.A01;
                return new IMT(c37675GiC3.A08.requireActivity(), c37675GiC3.A0C, c37675GiC3.A0D, c37675GiC3.A0R.A00);
            case 49:
                C37555GgB c37555GgB = ((C59952od) this.A01).A0F;
                if (c37555GgB != null) {
                    return c37555GgB;
                }
                str = "clipsViewerAppreciationGiftController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
