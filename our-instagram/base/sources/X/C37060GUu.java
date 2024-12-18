package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.simplewebview.SimpleWebViewActivity;
import go.Seq;

/* renamed from: X.GUu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37060GUu extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37060GUu(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C37060GUu(obj, i));
    }

    public static C37060GUu A01(Object obj, int i) {
        return new C37060GUu(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession A0r;
        Bundle bundle;
        Bundle A04;
        String str;
        switch (this.A00) {
            case 0:
                return AbstractC31174DnI.A0n(AbstractC31179DnN.A04(this.A01), "DirectThreadInviteLinkSettingsFragment.IS_ADMIN");
            case 1:
                return AbstractC31174DnI.A0n(AbstractC31179DnN.A04(this.A01), "DirectThreadInviteLinkSettingsFragment.IS_MODERATOR");
            case 2:
                return AbstractC31174DnI.A0n(AbstractC31179DnN.A04(this.A01), "DirectThreadInviteLinkSettingsFragment.IS_SUBSCRIBER_ONLY");
            case 3:
                C32284EJv c32284EJv = (C32284EJv) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(c32284EJv.A0G);
                C14360o3.A0B(A0r2, 0);
                return new FPC(c32284EJv, A0r2);
            case 4:
                InterfaceC83713oG A00 = AbstractC2054897w.A00(AbstractC31179DnN.A04(this.A01), "DirectThreadInviteLinkSettingsFragment.THREAD_ID");
                if (A00 != null) {
                    return A00;
                }
                throw AbstractC166997dE.A0g();
            case 5:
                return AbstractC31179DnN.A04(this.A01).getParcelable("DirectThreadInviteLinkSettingsFragment.IMAGE_URL");
            case 6:
                return AbstractC31179DnN.A04(this.A01).getString("DirectThreadInviteLinkSettingsFragment.THREAD_TITLE");
            case 7:
                return AbstractC31179DnN.A04(this.A01).getString("DirectThreadInviteLinkSettingsFragment.THREAD_V2_ID");
            case 8:
                return AbstractC31179DnN.A04(this.A01).getString("DirectThreadInviteLinkSettingsFragment.ARGUMENT_THREAD_USERTYPE");
            case 9:
            case Process.SIGTERM /* 15 */:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 32:
            case 44:
                return this.A01;
            case 10:
            case 16:
            case 30:
            case 33:
            case 45:
                return AbstractC25226BEj.A1C(this.A01);
            case 11:
            case 17:
            case 31:
            case 34:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                EM8 em8 = (EM8) this.A01;
                A0r = AbstractC166987dD.A0r(em8.A00);
                bundle = em8.mArguments;
                if (bundle == null) {
                    throw AbstractC166997dE.A0g();
                }
                return new C28888Cow(bundle, A0r);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((C25864BcJ) this.A01).A00();
                return C0eB.A00;
            case 14:
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                EM9 em9 = (EM9) this.A01;
                C35133Fea.A01(em9.requireContext(), AbstractC166987dD.A0o(em9.A00), c35133Fea, AbstractC31171DnF.A0R(AbstractC63260SgI.A01(em9.requireContext(), AbstractC43591JPw.A00(1034))), em9.getString(2131959100));
                return C0eB.A00;
            case 18:
                EM9 em92 = (EM9) this.A01;
                A0r = AbstractC166987dD.A0r(em92.A00);
                bundle = em92.mArguments;
                if (bundle == null) {
                    throw AbstractC166997dE.A0g();
                }
                return new C28888Cow(bundle, A0r);
            case Process.SIGSTOP /* 19 */:
                return new C09530e4[((InterfaceC19390xP[]) this.A01).length];
            case 20:
                return AbstractC31174DnI.A0q(AbstractC31172DnG.A07(this.A01), R.color.meta_ai_voice_default_background);
            case 21:
                C32285EJx c32285EJx = (C32285EJx) this.A01;
                return AbstractC31176DnK.A0M(c32285EJx, c32285EJx.A0T);
            case 22:
                C32285EJx c32285EJx2 = (C32285EJx) this.A01;
                if (C32285EJx.A0I(c32285EJx2)) {
                    C32285EJx.A06(c32285EJx2);
                }
                return C0eB.A00;
            case 23:
                C32285EJx c32285EJx3 = (C32285EJx) this.A01;
                c32285EJx3.A0G = true;
                InterfaceC09390do interfaceC09390do = c32285EJx3.A0Q;
                C51029Mgc c51029Mgc = (C51029Mgc) interfaceC09390do.getValue();
                C34494FIg c34494FIg = c32285EJx3.A07;
                boolean z = !c34494FIg.A01;
                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = c51029Mgc.A00;
                if (metaAiRsysSdkRealTimeSession != null) {
                    metaAiRsysSdkRealTimeSession.A02(z);
                }
                C51029Mgc c51029Mgc2 = (C51029Mgc) interfaceC09390do.getValue();
                boolean z2 = !c34494FIg.A00;
                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession2 = c51029Mgc2.A00;
                if (metaAiRsysSdkRealTimeSession2 != null) {
                    metaAiRsysSdkRealTimeSession2.A01(z2);
                }
                c32285EJx3.A0N.markerEnd(894512288, (short) 2);
                return C0eB.A00;
            case 24:
                C32285EJx c32285EJx4 = (C32285EJx) this.A01;
                AbstractC12990ll A0M = AbstractC31178DnM.A0M(c32285EJx4.A0T);
                return new C35767Fr4((C55004OVk) A0M.A01(C55004OVk.class, new C57549PgN(A0M, 4)), C12L.A00.AOT(231292917, 2), A01(c32285EJx4, 22), A01(c32285EJx4, 23));
            case 25:
                return AbstractC31172DnG.A07(this.A01).getDrawable(R.drawable.instagram_microphone_off_pano_outline_24);
            case 26:
                return AbstractC31172DnG.A07(this.A01).getDrawable(R.drawable.instagram_microphone_pano_outline_24);
            case 27:
                return AbstractC31172DnG.A07(this.A01).getDrawable(R.drawable.instagram_volume_off_pano_outline_24);
            case 28:
                return AbstractC31172DnG.A07(this.A01).getDrawable(R.drawable.instagram_volume_pano_outline_24);
            case 35:
                return new EWL(AbstractC166987dD.A0r(((EKK) this.A01).A00), EnumC33357Eoq.A02, "");
            case 36:
                return AbstractC31179DnN.A0X(AbstractC31179DnN.A04(this.A01), "audience_type");
            case 37:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID;
                return AbstractC31175DnJ.A0Y(A04, str);
            case 38:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "thread_v2_id";
                return AbstractC31175DnJ.A0Y(A04, str);
            case 39:
                return AbstractC31176DnK.A0V(((EKL) this.A01).A06);
            case 40:
                return AbstractC31176DnK.A0Q(((EKL) this.A01).A06);
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC31176DnK.A0V(((EKS) this.A01).A07);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC40677I1j.A00(AbstractC166987dD.A0r(((EKS) this.A01).A07));
            case 43:
                return AbstractC31176DnK.A0Q(((EKS) this.A01).A07);
            case 47:
                EKS eks = (EKS) this.A01;
                return new EWL(AbstractC166987dD.A0r(eks.A07), (EnumC33357Eoq) eks.A06.getValue(), AbstractC25225BEi.A15(eks.A02));
            case 48:
                FNR fnr = (FNR) this.A01;
                return AbstractC31175DnJ.A07(fnr.A01, (ViewGroup) fnr.A05.getValue(), R.layout.direct_instant_reply_container, false);
            case 49:
                View A0E = AbstractC31173DnH.A0E(AbstractC31171DnF.A07(((FNR) this.A01).A02, R.id.instant_reply_bar), R.layout.direct_instant_reply_root_container);
                C14360o3.A0C(A0E, "null cannot be cast to non-null type android.view.ViewGroup");
                return A0E;
        }
    }
}
