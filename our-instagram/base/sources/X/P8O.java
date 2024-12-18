package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class P8O implements InterfaceC140606Xo {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public P8O(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.6ab] */
    @Override // X.InterfaceC140606Xo
    public final void Cge(long j, boolean z) {
        if (this.A00 != 0) {
            C52255NAv c52255NAv = (C52255NAv) this.A03;
            AbstractC60672pq abstractC60672pq = c52255NAv.A04;
            if (abstractC60672pq.isResumed()) {
                C3Ow c3Ow = (C3Ow) this.A01;
                c3Ow.CMM();
                C1OU c1ou = C1OU.$redex_init_class;
                ?? obj = new Object();
                ArrayList A02 = c52255NAv.A0A.A02();
                String id = ((Reel) this.A02).getId();
                UserSession userSession = c52255NAv.A06;
                obj.A02(userSession, id, A02);
                obj.A03(C3G2.A0u);
                obj.A08(c52255NAv.A01.A04);
                obj.A01(userSession);
                obj.A0M = c52255NAv.A01.A03;
                obj.A0d = z;
                obj.A03 = new ReelViewerConfig(new C38H());
                C6XJ.A01(abstractC60672pq.getActivity(), obj.A00(), userSession).A0A(abstractC60672pq.getActivity(), 60574);
                c3Ow.EkR(c52255NAv.A05);
                return;
            }
            return;
        }
        AbstractC52526NLv abstractC52526NLv = (AbstractC52526NLv) this.A03;
        Reel reel = (Reel) this.A02;
        C34644FOb c34644FOb = (C34644FOb) this.A01;
        CircularImageView circularImageView = c34644FOb.A0E;
        RectF A0G = AbstractC13880nE.A0G(circularImageView);
        circularImageView.setVisibility(4);
        ArrayList A0z = AbstractC31174DnI.A0z(reel);
        RectF rectF = new RectF(A0G.centerX(), A0G.centerY(), A0G.centerX(), A0G.centerY());
        AbstractC60672pq abstractC60672pq2 = abstractC52526NLv.A01;
        C1OU.A06(abstractC60672pq2.requireActivity(), abstractC52526NLv.A02).A0U(A0G, rectF, abstractC60672pq2, reel, abstractC52526NLv.A03, new P8Z(abstractC52526NLv, c34644FOb, A0z, j, z), -1);
    }
}
