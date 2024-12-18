package X;

import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.G3t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36392G3t implements JH1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C36392G3t(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.JH1
    public final void DGi() {
        if (this.A00 == 0) {
            ((C35010Fbh) this.A02).A06.A02();
        }
    }

    @Override // X.JH1
    public final void DVY(C35003Fba c35003Fba) {
        int min;
        if (this.A00 != 0) {
            ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
            C38262Gs5 c38262Gs5 = reelDashboardFragment.mListAdapter;
            if (c38262Gs5 != null) {
                C38264Gs7 c38264Gs7 = (C38264Gs7) c38262Gs5.A0C.get(((C41181vS) this.A02).A0j);
                if (c38264Gs7 != null) {
                    C41181vS c41181vS = c38264Gs7.A0G;
                    c41181vS.getClass();
                    c41181vS.A04 = c35003Fba;
                    c38264Gs7.A0k.A07();
                }
                UserSession userSession = reelDashboardFragment.A06;
                List unmodifiableList = Collections.unmodifiableList(c35003Fba.A04);
                AbstractC167017dG.A1N(userSession, unmodifiableList);
                C1ON A03 = AbstractC151506rw.A03(userSession, unmodifiableList);
                C31714DwJ.A00(A03, this, 32);
                reelDashboardFragment.schedule(A03);
                return;
            }
            return;
        }
        C14360o3.A0B(c35003Fba, 0);
        C35010Fbh c35010Fbh = (C35010Fbh) this.A02;
        c35010Fbh.A01 = c35003Fba;
        C35010Fbh.A00(c35010Fbh);
        java.util.Set set = c35010Fbh.A07;
        int size = set.size();
        List list = c35003Fba.A04;
        int A02 = AbstractC31172DnG.A02(Collections.unmodifiableList(list), size);
        int i = c35003Fba.A00;
        C35003Fba c35003Fba2 = c35010Fbh.A01;
        if (c35003Fba2 == null) {
            min = 0;
        } else {
            min = Math.min(AbstractC31172DnG.A19(c35003Fba2.A04).size(), 5);
        }
        if (i <= min && E70.A00((E70) this.A01) + A02 <= c35010Fbh.A02) {
            set.addAll(AbstractC31172DnG.A19(list));
            c35010Fbh.A01();
        }
        c35010Fbh.A06.A02();
    }
}
