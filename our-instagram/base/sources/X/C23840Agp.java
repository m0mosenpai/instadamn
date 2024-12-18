package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Agp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23840Agp implements InterfaceC25181BCe {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectShareTarget A02;
    public final /* synthetic */ C211689Zc A03;

    @Override // X.InterfaceC25181BCe
    public final void DiH(boolean z, String str) {
    }

    public C23840Agp(Context context, UserSession userSession, DirectShareTarget directShareTarget, C211689Zc c211689Zc) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = directShareTarget;
        this.A03 = c211689Zc;
    }

    @Override // X.InterfaceC25181BCe
    public final void DfJ(boolean z, String str) {
        if (z && str != null) {
            AKC akc = A49.A02;
            AKC.A00(this.A00, this.A01, this.A02, this.A03, "MultiMediaEditController_sendMessageMsys", str);
        } else {
            C9GR.A0A(this.A00, "error");
        }
    }
}
