package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Agd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23828Agd implements InterfaceC25207BDf {
    public final /* synthetic */ C8LZ A00;
    public final /* synthetic */ ACA A01;
    public final /* synthetic */ C211689Zc A02;

    @Override // X.InterfaceC25207BDf
    public final void onFinish() {
    }

    @Override // X.InterfaceC25207BDf
    public final void onStart() {
    }

    public C23828Agd(C8LZ c8lz, ACA aca, C211689Zc c211689Zc) {
        this.A00 = c8lz;
        this.A01 = aca;
        this.A02 = c211689Zc;
    }

    @Override // X.InterfaceC25207BDf
    public final void DFi(Exception exc) {
        C9GR.A0A(this.A00.A0A, "photo_to_video_conversion_failed");
    }

    @Override // X.InterfaceC25207BDf
    public final void DqC(String str) {
        ACA aca = this.A01;
        DirectShareTarget directShareTarget = aca.A00;
        directShareTarget.getClass();
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        interfaceC83713oG.getClass();
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            C8LZ c8lz = this.A00;
            Activity activity = c8lz.A0A;
            UserSession userSession = c8lz.A0D;
            C211689Zc c211689Zc = this.A02;
            AKC akc = A49.A02;
            AKC.A01(activity, userSession, directShareTarget, c211689Zc, "PhotoViewController_sendPhotoToMsys", str);
            return;
        }
        InterfaceC36951ns A00 = C36961nt.A00();
        C8LZ c8lz2 = this.A00;
        A00.EOg(null, c8lz2.A0D, c8lz2.A0P, aca, this.A02, null, null, str);
    }
}
