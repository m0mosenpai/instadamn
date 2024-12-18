package X;

import com.facebook.proxygen.TraceFieldType;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes11.dex */
public final class U75 extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public U75(Object obj, Object obj2, String str, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = obj;
        this.A05 = z;
        this.A03 = str;
        this.A04 = z2;
        this.A01 = obj2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        Long A00;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-458123745);
            super.onFail(abstractC115105If);
            if (this.A05) {
                C38274GsJ A002 = AbstractC38267GsC.A00(((ReelDashboardFragment) this.A01).A06);
                String str = this.A03;
                C14360o3.A0B(str, 0);
                if (C38274GsJ.A01(A002) && (A00 = C38274GsJ.A00(A002, str)) != null) {
                    long longValue = A00.longValue();
                    C1QT c1qt = A002.A02;
                    c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "ig_viewers_list_fetch_failure");
                    c1qt.flowEndFail(longValue, "ig_viewers_list_fetch_failure", null);
                }
            }
            i = -1477884785;
        } else {
            A03 = C0f9.A03(-571480865);
            InterfaceC65530Tm0 interfaceC65530Tm0 = (InterfaceC65530Tm0) this.A01;
            if (interfaceC65530Tm0 != null) {
                interfaceC65530Tm0.onFailure(abstractC115105If.A01());
            }
            i = 227497566;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        boolean z;
        if (1 - this.A00 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C0f9.A03(1405146395);
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
        C38262Gs5 c38262Gs5 = reelDashboardFragment.mListAdapter;
        if (c38262Gs5 != null) {
            boolean z2 = this.A04;
            String str = this.A03;
            if (!z2) {
                C38264Gs7 c38264Gs7 = (C38264Gs7) c38262Gs5.A0C.get(str);
                if (c38264Gs7 != null) {
                    z = c38264Gs7.A0k.A0A;
                } else {
                    z = false;
                }
                c38262Gs5.A0B(str, z);
            } else {
                C38264Gs7 c38264Gs72 = (C38264Gs7) c38262Gs5.A0C.get(str);
                if (c38264Gs72 != null) {
                    c38264Gs72.A0k.A0A = false;
                }
                reelDashboardFragment.mListAdapter.A0B(str, false);
            }
        }
        C0f9.A0A(687188766, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        C38264Gs7 c38264Gs7;
        Long A00;
        if (1 - this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(1214422198);
        if (this.A05) {
            C38274GsJ A002 = AbstractC38267GsC.A00(((ReelDashboardFragment) this.A01).A06);
            String str = this.A03;
            C14360o3.A0B(str, 0);
            if (C38274GsJ.A01(A002) && (A00 = C38274GsJ.A00(A002, str)) != null) {
                A002.A02.flowMarkPoint(A00.longValue(), "ig_viewers_list_fetch_begin");
            }
        }
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
        C38262Gs5 c38262Gs5 = reelDashboardFragment.mListAdapter;
        if (c38262Gs5 != null) {
            String str2 = this.A03;
            c38262Gs5.A0B(str2, true);
            if (this.A04 && (c38264Gs7 = (C38264Gs7) reelDashboardFragment.mListAdapter.A0C.get(str2)) != null) {
                c38264Gs7.A0k.A0A = true;
            }
        }
        C0f9.A0A(-682111404, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0139, code lost:
    
        if (r12.A0H != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [X.1P1, X.U75] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U75.onSuccess(java.lang.Object):void");
    }
}
