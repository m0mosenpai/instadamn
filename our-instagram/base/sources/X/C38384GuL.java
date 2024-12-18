package X;

import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.GuL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38384GuL extends C1I4 {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ HBC A01;
    public final /* synthetic */ C64062vR A02;
    public final /* synthetic */ C38394GuV A03;
    public final /* synthetic */ C42713Iv8 A04;
    public final /* synthetic */ C69392Vmc A05;
    public final /* synthetic */ boolean A06;

    public C38384GuL(IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, C64062vR c64062vR, C38394GuV c38394GuV, C42713Iv8 c42713Iv8, C69392Vmc c69392Vmc, boolean z) {
        this.A00 = intentAwareAdPivotState;
        this.A02 = c64062vR;
        this.A01 = hbc;
        this.A06 = z;
        this.A04 = c42713Iv8;
        this.A03 = c38394GuV;
        this.A05 = c69392Vmc;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        int A0N = AbstractC167017dG.A0N(recyclerView, -411881598);
        if (i == 0) {
            IntentAwareAdPivotState intentAwareAdPivotState = this.A00;
            if (!intentAwareAdPivotState.A0A) {
                intentAwareAdPivotState.A0A = true;
                C64062vR c64062vR = this.A02;
                c64062vR.A08.A0E(intentAwareAdPivotState, this.A01);
                c64062vR.A02.A01 = null;
            }
            Handler handler = IBT.A01;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new RunnableC43117J4g(recyclerView, intentAwareAdPivotState), 200L);
        }
        if (this.A06 && (i == 0 || i == 1 || i == 2)) {
            AbstractC70663Fe abstractC70663Fe = this.A04.A02.A0D;
            if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null) {
                int A1b = linearLayoutManager.A1b();
                if (Integer.valueOf(A1b) != null && A1b >= 0) {
                    C41L c41l = this.A03.A00;
                    if (c41l != null) {
                        c41l.setCurrentPage(A1b);
                        this.A00.A00 = A1b;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
        C0f9.A0A(-1547840180, A0N);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(1886362305);
        C69392Vmc c69392Vmc = this.A05;
        UserSession userSession = c69392Vmc.A01;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36312874748937607L) && !C18U.A06(c06090Tz, userSession, 36312874750379411L)) {
            c69392Vmc.A02.A01();
        }
        C0f9.A0A(732381129, A03);
    }
}
