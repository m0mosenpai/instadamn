package X;

import android.util.LruCache;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UtP extends AbstractC115825Lw {
    @Override // X.AbstractC115825Lw
    public final void A04(C6PT c6pt, C66199U3p c66199U3p) {
        setKeyframes(this.A0J, c66199U3p.A00, c66199U3p.A02, this, this);
        this.A02 = new Pair(c6pt, c66199U3p);
        A03(c6pt);
        A01();
    }

    public final void setShowreelAnimation(UserSession userSession, List list, C41181vS c41181vS, C6PT c6pt, InterfaceC138736Qd interfaceC138736Qd) {
        AbstractC167017dG.A1N(userSession, list);
        C14360o3.A0B(c6pt, 3);
        C41051vD.A01.A00 = userSession;
        setShowreelAnimation(c6pt, interfaceC138736Qd, null, list, c41181vS, Boolean.valueOf(this.A0H.CQb()), null, null);
    }

    @Override // X.AbstractC115825Lw
    public final void A01() {
        C6PT c6pt = this.A05;
        if (c6pt != null) {
            try {
                XP4 drawableProvider = getDrawableProvider();
                C37416Gdw c37416Gdw = (C37416Gdw) c6pt;
                String str = c37416Gdw.A05;
                if (str == null) {
                    str = "";
                }
                String str2 = c37416Gdw.A04;
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    C43658JSq c43658JSq = new C43658JSq(str, str2, null, c6pt.Acw(), c6pt.Acy());
                    LruCache lruCache = ((AbstractC43664JSw) ((C6VU) drawableProvider.A00).A04).A00;
                    if (lruCache != null) {
                        lruCache.remove(AbstractC25228BEl.A12(c43658JSq));
                    }
                } catch (C68209VHr unused) {
                }
                C66199U3p A00 = A00(c6pt);
                if (A00 != null) {
                    Iterator A16 = AbstractC166997dE.A16(A00.A01);
                    while (A16.hasNext()) {
                        try {
                            C43658JSq c43658JSq2 = new C43658JSq(((C68917VeH) A16.next()).A01, str2, null, c6pt.Acw(), c6pt.Acy());
                            LruCache lruCache2 = ((AbstractC43664JSw) ((C6VU) drawableProvider.A00).A04).A00;
                            if (lruCache2 != null) {
                                lruCache2.remove(AbstractC25228BEl.A12(c43658JSq2));
                            }
                        } catch (C68209VHr unused2) {
                        }
                    }
                }
            } catch (C129895tu unused3) {
                C14360o3.A0B("Failed to get drawable provider", 1);
                C0K8.A0O(AbstractC111324zv.A00(3510), AbstractC111324zv.A00(560), "Failed to get drawable provider", "ShowreelNotInitializedException");
                C0w9.A03("ShowreelNotInitializedException", "Failed to get drawable provider");
            }
        }
    }
}
