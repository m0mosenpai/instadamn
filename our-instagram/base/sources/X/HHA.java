package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HHA extends AbstractC60592pi {
    public final InterfaceC43411JGb A00;
    public final Context A01;
    public final AbstractC018607g A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public HHA(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC43411JGb interfaceC43411JGb, String str, String str2, String str3) {
        AbstractC167007dF.A1H(userSession, 1, interfaceC43411JGb);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = abstractC018607g;
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A00 = interfaceC43411JGb;
    }

    public final void A00() {
        LinkedHashMap A1F = AbstractC25232BEp.A1F("waterfall_id", this.A06, AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A04), AbstractC166987dD.A1L("prior_module", this.A05));
        C61972ry c61972ry = new C61972ry(this.A01, this.A02, null);
        AbstractC192798gL A06 = C192108fB.A06(this.A03, AbstractC111324zv.A00(2145), A1F);
        A06.A00(new C38949HDb(this, 4));
        c61972ry.schedule(A06);
    }
}
