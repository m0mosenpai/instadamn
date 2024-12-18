package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.uigraph.UiGraph;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1yQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42981yQ extends UiGraph {
    public final C05A A00;
    public final C0UO A01;

    public final void A03(C3ZO c3zo, String str) {
        C14360o3.A0B(str, 0);
        UiGraph.A00(this, new C9G2(this, c3zo, str, 7), false);
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        UiGraph.A00(this, new C207429Fv(str, this, 23), false);
    }

    public final void A05(String str, List list) {
        C14360o3.A0B(str, 0);
        UiGraph.A00(this, new C9G2(this, list, str, 8), false);
    }

    public final void A06(String str, List list) {
        C14360o3.A0B(str, 0);
        UiGraph.A00(this, new C9G6(this, null, list, str, 1), false);
    }

    public C42981yQ(C50525MSe c50525MSe, C0f6 c0f6, UserSession userSession, C43001yT c43001yT) {
        super(c50525MSe, c0f6, C43111ye.A00, C43121yf.A03, C43121yf.A04);
        C008002u c008002u = new C008002u("app_start");
        this.A00 = c008002u;
        this.A01 = new AnonymousClass059(null, c008002u);
        c43001yT.A01.add(this);
        int A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36594139269760600L);
        AbstractC43201yn.A05 = c43001yT;
        AbstractC43201yn.A06 = c43001yT != InterfaceC43011yU.A00;
        AbstractC43201yn.A04 = A01;
        C10190gb.A00().A00.add(new InterfaceC10180ga() { // from class: X.1yr
            @Override // X.InterfaceC10180ga
            public final /* synthetic */ void EHy(String str, String str2, String str3, String str4, WeakReference weakReference, boolean z) {
                if (str2 != null) {
                    C42981yQ.this.A00.Egh(str2);
                }
            }
        });
    }
}
