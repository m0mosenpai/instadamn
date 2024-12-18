package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.XDTIGAIAgentBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DpE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31292DpE extends AbstractC46524KiP implements GZA {
    public C45127Jxw A00 = new C45127Jxw();
    public C34588FLx A01;
    public final UserSession A02;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        C34588FLx c34588FLx = new C34588FLx(context, this.A00, this.A02, this);
        this.A01 = c34588FLx;
        return c34588FLx.A03;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        User user;
        String Aab;
        String C7l;
        Integer num;
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (c2ec != null && (user = (User) AbstractC001800i.A0J(c2ec.BSH())) != null && (Aab = user.A03.Aab()) != null && (C7l = c2ec.C7l()) != null) {
            XDTIGAIAgentBannerType AaU = user.A03.AaU();
            if (AaU == null) {
                AaU = XDTIGAIAgentBannerType.A08;
            }
            int ordinal = AaU.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                num = C05F.A00;
                            } else {
                                num = C05F.A0j;
                            }
                        } else {
                            num = C05F.A0Y;
                        }
                    } else {
                        num = C05F.A0N;
                    }
                } else {
                    num = C05F.A0C;
                }
            } else {
                num = C05F.A01;
            }
            this.A00 = new C45127Jxw(C7l, 37, num);
            if (c2ec.C7g() == 1014 && AbstractC31172DnG.A1Z(this.A02, Aab) && this.A00.A00 != C05F.A00) {
                interfaceC37159GYw.Dpu(this);
                return;
            }
        }
        interfaceC37159GYw.onFailure();
    }

    @Override // X.GZA
    public final /* synthetic */ void onBannerDismissed() {
    }

    @Override // X.GZA
    public final void onActionClicked() {
        C34588FLx c34588FLx = this.A01;
        if (c34588FLx != null) {
            c34588FLx.A03.setVisibility(8);
        }
    }

    public C31292DpE(UserSession userSession) {
        this.A02 = userSession;
    }
}
