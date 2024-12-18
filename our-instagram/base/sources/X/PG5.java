package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PG5 implements InterfaceC58075Pp0 {
    public final /* synthetic */ NVk A00;

    public PG5(NVk nVk) {
        this.A00 = nVk;
    }

    @Override // X.InterfaceC58075Pp0
    public final void D1x() {
        NVk nVk = this.A00;
        MSY.A1G(nVk.A06);
        InterfaceC57991Pnb interfaceC57991Pnb = nVk.A07;
        if (interfaceC57991Pnb != null) {
            interfaceC57991Pnb.E33(C05F.A01);
        }
        nVk.A0B = true;
    }

    @Override // X.InterfaceC58075Pp0
    public final void D70() {
        NVk nVk = this.A00;
        CallerContext callerContext = NVk.A02;
        switch (nVk.A00.ordinal()) {
            case 14:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 31:
            case 34:
                nVk.A03();
                break;
            case Process.SIGTERM /* 15 */:
            case 30:
            case 32:
            case 33:
                nVk.A04();
                break;
            case 37:
                UserSession userSession = nVk.A0E;
                if (C180377zR.A04(userSession)) {
                    new C55623On8(userSession).A01(AbstractC16960so.A1Q(new OTO("FEED", true), new OTO("STORY", true), new OTO("REELS", true)), C57468Pf4.A00, C57469Pf5.A00);
                    break;
                } else {
                    nVk.A03();
                    nVk.A04();
                    if (C200108tF.A03(null, userSession)) {
                        C200108tF.A01.A0C(userSession, "UPSELL", true, true);
                        break;
                    }
                }
                break;
            case 39:
                break;
            default:
                nVk.A02();
                break;
        }
        InterfaceC57990Pna interfaceC57990Pna = nVk.A06;
        if (interfaceC57990Pna != null) {
            interfaceC57990Pna.afterSelection(true);
        }
        InterfaceC57991Pnb interfaceC57991Pnb = nVk.A07;
        if (interfaceC57991Pnb != null) {
            interfaceC57991Pnb.E33(C05F.A00);
        }
        nVk.A0B = true;
    }
}
