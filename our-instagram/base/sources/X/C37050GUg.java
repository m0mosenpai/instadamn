package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import go.Seq;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GUg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37050GUg extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37050GUg(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C37050GUg(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v52 */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object serializable;
        Serializable serializable2;
        switch (this.A00) {
            case 0:
                return new C196088ly((UserSession) this.A01);
            case 1:
                return new C196438mZ((UserSession) this.A01);
            case 2:
                UserSession userSession = (UserSession) this.A01;
                return new C2B9(C12L.A00, userSession, new CXPNoticeStateRepository(userSession, C05F.A01), AbstractC46542Bs.A00(userSession), AbstractC167007dF.A0n(EnumC46582Bw.A0a, new Object()));
            case 3:
                return new C9MU((UserSession) this.A01);
            case 4:
                return AbstractC46542Bs.A00(((C9MU) this.A01).A00);
            case 5:
                return new C196028ls((UserSession) this.A01);
            case 6:
                return new C196228mD((UserSession) this.A01);
            case 7:
                return new AiS((UserSession) this.A01);
            case 8:
                return AbstractC46542Bs.A00(((AiS) this.A01).A00);
            case 9:
                return new AiT((UserSession) this.A01);
            case 10:
                return AbstractC46542Bs.A00(((AiT) this.A01).A00);
            case 11:
                return AbstractC23021Ah.A00(((AiT) this.A01).A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Map map = (Map) ((C51761Mtk) this.A01).A02;
                serializable = AbstractC25225BEi.A17(map.size());
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    serializable.add(new OTO(((EnumC222709sB) A1K.getKey()).name(), AbstractC166987dD.A1a(A1K.getValue())));
                }
                return serializable;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C38155GqM((UserSession) this.A01);
            case 14:
                C51690MsL c51690MsL = C51690MsL.A03;
                return OP5.A00(((G6V) this.A01).A01);
            case Process.SIGTERM /* 15 */:
                Context context = ((View) this.A01).getContext();
                return AbstractC31174DnI.A0q(context, AbstractC53242c7.A07(context));
            case 16:
                return AbstractC31174DnI.A0q(((View) this.A01).getContext(), R.color.igds_pill_active_text);
            case 17:
                return new C7F3(AbstractC166987dD.A0r(((C32268EJd) this.A01).A02));
            case 18:
                return this.A01;
            case Process.SIGSTOP /* 19 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 20:
                return AbstractC167027dH.A0B(this.A01);
            case 21:
                return new C32555EVf(AbstractC166987dD.A0r(((C32268EJd) this.A01).A02));
            case 22:
                return new FKI(AbstractC166987dD.A0r(((C32268EJd) this.A01).A02));
            case 23:
                return AbstractC12220kQ.A02((AbstractC12990ll) this.A01);
            case 24:
                return new C31267Dop((UserSession) this.A01);
            case 25:
                return new FF9(((C31267Dop) this.A01).A01);
            case 26:
                C159437De c159437De = (C159437De) this.A01;
                Integer num = c159437De.A03;
                if (num != null) {
                    C159437De.A03(c159437De, num);
                }
                return C0eB.A00;
            case 27:
                return new C163527Tp(AbstractC166987dD.A0r(((C33205Eks) this.A01).A02));
            case 28:
                return new C7F3(AbstractC166987dD.A0r(((C33205Eks) this.A01).A02));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return Integer.valueOf(((View) this.A01).getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width));
            case 30:
                return Integer.valueOf(((View) this.A01).getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            case 31:
                return Integer.valueOf(((View) this.A01).getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen));
            case 32:
                return new UMD((View) this.A01);
            case 33:
                return Integer.valueOf(((View) this.A01).getResources().getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size));
            case 34:
                return AbstractC120095c8.A00(((AiAgentThreadLauncher) this.A01).A00);
            case 35:
                return new C28484Chc(((AiAgentThreadLauncher) this.A01).A00);
            case 36:
                return C7F4.A00(((AiAgentThreadLauncher) this.A01).A00);
            case 37:
                return AbstractC28761aE.A00(((AiAgentThreadLauncher) this.A01).A00);
            case 38:
                return new C7F3(AbstractC166987dD.A0r(((C33184EkV) this.A01).A01));
            case 39:
                return new C7F3(AbstractC166987dD.A0r(((EI9) this.A01).A02));
            case 40:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                Serializable serializable3 = AbstractC31179DnN.A04(this.A01).getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (serializable3 instanceof EnumC33519Ers) {
                    return serializable3;
                }
                return null;
            case Seq.NULL_REFNUM /* 41 */:
                return new C7F3(AbstractC166987dD.A0r(((EJE) this.A01).A03));
            case 43:
                EHa eHa = (EHa) this.A01;
                return new C28370CfW(AbstractC166987dD.A0r(eHa.A02), AbstractC31180DnO.A0k(eHa.A01.getValue()), null);
            case 44:
                return AbstractC31179DnN.A04(this.A01).getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            case 45:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    return bundle.getString("ai_agent_id");
                }
                return null;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C7F3(AbstractC166987dD.A0r(((EJI) this.A01).A05));
            case 47:
                serializable = AbstractC31179DnN.A04(this.A01).getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (!(serializable instanceof EnumC33519Ers) || serializable == 0) {
                    return EnumC33519Ers.A0J;
                }
                return serializable;
            case 48:
                EJI eji = (EJI) this.A01;
                EnumC33333EoS enumC33333EoS = (EnumC33333EoS) eji.A04.getValue();
                if (enumC33333EoS != null) {
                    int ordinal = enumC33333EoS.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            InterfaceC09390do interfaceC09390do = eji.A01;
                            String A152 = AbstractC25225BEi.A15(interfaceC09390do);
                            if (A152 != null && A152.length() != 0) {
                                AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher(AbstractC166987dD.A0r(eji.A05));
                                FragmentActivity requireActivity = eji.requireActivity();
                                String A153 = AbstractC25225BEi.A15(interfaceC09390do);
                                if (A153 == null) {
                                    A153 = "";
                                }
                                aiAgentThreadLauncher.A08(requireActivity, eji, A153, null, null, null, true);
                            } else {
                                C0K8.A0D("AiAgentUpsellInterstitialFragment", "AgentId must be provided to launch a thread with an agent");
                            }
                        }
                    } else {
                        AbstractC35257Fgr.A02(eji.requireActivity(), AbstractC166987dD.A0r(eji.A05), eji.A03.getValue());
                    }
                }
                return C0eB.A00;
            default:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                serializable = 0;
                if (bundle2 != null) {
                    serializable2 = bundle2.getSerializable("nux_landing_surface");
                } else {
                    serializable2 = null;
                }
                if (serializable2 instanceof EnumC33333EoS) {
                    return serializable2;
                }
                return serializable;
        }
    }
}
