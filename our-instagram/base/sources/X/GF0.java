package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class GF0 implements InterfaceC140686Xw {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
    }

    public GF0(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.A00 = i;
        this.A03 = obj5;
        this.A08 = obj4;
        this.A07 = obj8;
        this.A05 = obj6;
        this.A02 = obj3;
        this.A04 = obj7;
        this.A01 = obj2;
        this.A06 = obj;
    }

    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        if (this.A00 != 0) {
            C38H c38h = new C38H();
            c38h.A05 = true;
            ReelViewerConfig reelViewerConfig = new ReelViewerConfig(c38h);
            C141586ab A0U = AbstractC31171DnF.A0U();
            List singletonList = Collections.singletonList(this.A04);
            UserSession userSession = (UserSession) this.A03;
            A0U.A02(userSession, str, singletonList);
            A0U.A0A((ArrayList) this.A08);
            A0U.A03 = reelViewerConfig;
            A0U.A03((C3G2) this.A06);
            AbstractC31177DnL.A1P(A0U);
            A0U.A01(userSession);
            A0U.A0W = true;
            A0U.A04(AbstractC25227BEk.A0p());
            ReelRecentlyDeletedViewerController reelRecentlyDeletedViewerController = (ReelRecentlyDeletedViewerController) this.A01;
            C3M4 c3m4 = (C3M4) this.A05;
            Activity activity = (Activity) this.A02;
            C31559Dtj c31559Dtj = new C31559Dtj(activity, (RectF) this.A07, reelRecentlyDeletedViewerController, C05F.A01);
            reelRecentlyDeletedViewerController.mHideAnimationCoordinator = c31559Dtj;
            A0U.A07(c31559Dtj.A03);
            A0U.A05(c3m4.A0x);
            AbstractC31176DnK.A0d(activity, A0U.A00(), userSession, TransparentModalActivity.class, "reel_viewer").A0A(activity, 1001);
            return;
        }
        C141586ab A0U2 = AbstractC31171DnF.A0U();
        List A1J = AbstractC166987dD.A1J(this.A03);
        UserSession userSession2 = (UserSession) this.A08;
        A0U2.A02(userSession2, str, A1J);
        A0U2.A0A((ArrayList) this.A07);
        A0U2.A03((C3G2) this.A05);
        AbstractC31177DnL.A1P(A0U2);
        A0U2.A01(userSession2);
        A0U2.A04(AbstractC25227BEk.A0p());
        EVW evw = (EVW) this.A02;
        C3M4 c3m42 = (C3M4) this.A04;
        Activity activity2 = (Activity) this.A01;
        A0U2.A07(new C31559Dtj(activity2, (RectF) this.A06, evw, C05F.A01).A03);
        A0U2.A05(c3m42.A0x);
        AbstractC31176DnK.A0d(activity2, A0U2.A00(), userSession2, TransparentModalActivity.class, "reel_viewer").A0C(evw.A00);
    }

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
    }
}
