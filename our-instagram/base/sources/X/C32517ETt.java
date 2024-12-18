package X;

import android.view.View;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.user.model.User;

/* renamed from: X.ETt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32517ETt extends C1P1 {
    public User A00;
    public boolean A01;
    public final /* synthetic */ ENJ A02;

    public C32517ETt(ENJ enj, User user, boolean z) {
        this.A02 = enj;
        this.A01 = z;
        this.A00 = user;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32517ETt.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A03 = C0f9.A03(1999050410);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            str = A01.getMessage();
        } else {
            str = "";
        }
        ENJ enj = this.A02;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = enj.A04;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.CjK(new Y7A("invite_followers_via_suma_followings", enj.A07, null, str, null, null, null, null));
        }
        C0f9.A0A(702755836, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-2066879152);
        if (this.A01) {
            ENJ enj = this.A02;
            if (enj.A0I.incrementAndGet() == enj.A09.size()) {
                View view = enj.A01;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (enj.A0A.keySet().isEmpty()) {
                    C31768DxP c31768DxP = enj.A06;
                    c31768DxP.A03 = true;
                    C0fA.A00(c31768DxP, -900434024);
                }
            }
        }
        C0f9.A0A(421865071, A03);
    }
}
