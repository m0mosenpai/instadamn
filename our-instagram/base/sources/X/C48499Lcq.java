package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Lcq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48499Lcq implements C3MR {
    public final /* synthetic */ C83403nh A00;
    public final /* synthetic */ C45093JxN A01;
    public final /* synthetic */ DirectVisualMessageViewerController A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C48499Lcq(C83403nh c83403nh, C45093JxN c45093JxN, DirectVisualMessageViewerController directVisualMessageViewerController, boolean z, boolean z2) {
        this.A02 = directVisualMessageViewerController;
        this.A00 = c83403nh;
        this.A01 = c45093JxN;
        this.A04 = z;
        this.A03 = z2;
    }

    @Override // X.C3MR
    public final void Dih(long j) {
        EnumC123285i3 enumC123285i3;
        double d;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A02;
        UserSession userSession = directVisualMessageViewerController.A0m;
        String A06 = DirectVisualMessageViewerController.A06(directVisualMessageViewerController);
        C2EC c2ec = directVisualMessageViewerController.A0n;
        C83403nh c83403nh = this.A00;
        C45093JxN c45093JxN = this.A01;
        boolean z = this.A04;
        boolean z2 = this.A03;
        C14360o3.A0B(c2ec, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(userSession, "igd_screenshot_capture"), "igd_screenshot_capture");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1F(A0f, A06);
            A0f.A7v("is_ephemeral", AbstractC31173DnH.A0e(A0f, "sender_igid", c83403nh.A1u, z2));
            A0f.A8R(EnumC46262Kdu.IMAGE, "capture_type");
            switch (AbstractC25227BEk.A05(c45093JxN.A0B, 0)) {
                case 0:
                case Process.SIGSTOP /* 19 */:
                case 20:
                case 21:
                case 22:
                case 24:
                    enumC123285i3 = EnumC123285i3.IMAGE;
                    break;
                case 1:
                case 18:
                case 23:
                case 25:
                    enumC123285i3 = EnumC123285i3.VIDEO;
                    break;
                case 2:
                case 5:
                default:
                    enumC123285i3 = EnumC123285i3.UNKNOWN;
                    break;
                case 3:
                    enumC123285i3 = EnumC123285i3.BROADCAST;
                    break;
                case 4:
                    enumC123285i3 = EnumC123285i3.CAROUSEL_V2;
                    break;
                case 6:
                    enumC123285i3 = EnumC123285i3.COLLECTION;
                    break;
                case 7:
                    enumC123285i3 = EnumC123285i3.AUDIO;
                    break;
                case 8:
                    enumC123285i3 = EnumC123285i3.SHOWREEL;
                    break;
                case 9:
                    enumC123285i3 = EnumC123285i3.GUIDE_FACADE;
                    break;
                case 10:
                    enumC123285i3 = EnumC123285i3.HSCROLL_ADS;
                    break;
                case 11:
                    enumC123285i3 = EnumC123285i3.REPOST_FACADE;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 26:
                case 27:
                    enumC123285i3 = EnumC123285i3.TEXT_POST;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    enumC123285i3 = EnumC123285i3.DIRECT_MESSAGE_COMMENT_FACADE;
                    break;
                case 14:
                    enumC123285i3 = EnumC123285i3.AI_AGENT;
                    break;
                case Process.SIGTERM /* 15 */:
                    enumC123285i3 = EnumC123285i3.CONTAINER;
                    break;
                case 16:
                    enumC123285i3 = EnumC123285i3.SHOWCASE;
                    break;
                case 17:
                    enumC123285i3 = EnumC123285i3.FILE;
                    break;
            }
            A0f.A8R(enumC123285i3, "media_type");
            A0f.A7v("should_block", Boolean.valueOf(z));
            C0Zx c0Zx = new C0Zx();
            PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = c45093JxN.A00;
            if (privacyMediaOverlayViewModel != null && privacyMediaOverlayViewModel.A00 == 2) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            c0Zx.A04("nudity", Double.valueOf(d));
            A0f.AAQ(c0Zx, "ml_sensitivity_score");
            A0f.A7v("is_dm", Boolean.valueOf(c2ec.Ay8()));
            A0f.A7v("is_vm", Boolean.valueOf(c45093JxN.A0X));
            A0f.Cht();
        }
    }
}
