package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.V3l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67946V3l extends C1P1 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public C67946V3l(UserSession userSession, Activity activity, String str) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r1 != null) goto L8;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r5) {
        /*
            r4 = this;
            r0 = -691524566(0xffffffffd6c82c2a, float:-1.10046004E14)
            int r3 = X.C0f9.A03(r0)
            r2 = 0
            X.C14360o3.A0B(r5, r2)
            super.onFail(r5)
            java.lang.Throwable r1 = r5.A01()
            boolean r0 = r1 instanceof X.VI9
            if (r0 == 0) goto L3d
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            X.C14360o3.A0C(r1, r0)
            X.VI9 r1 = (X.VI9) r1
            com.google.common.collect.ImmutableList r0 = r1.A00
            java.lang.Object r0 = r0.get(r2)
            X.Tmj r0 = (X.InterfaceC65563Tmj) r0
            if (r0 == 0) goto L3d
            java.lang.String r1 = r0.getDescription()
            if (r1 == 0) goto L3d
        L31:
            java.lang.String r0 = "rapid_feedback_controller"
            X.C0w9.A03(r0, r1)
            r0 = -1912848887(0xffffffff8dfc3e09, float:-1.55456335E-30)
            X.C0f9.A0A(r0, r3)
            return
        L3d:
            java.lang.String r1 = "Survey fetch failed."
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67946V3l.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(288853634);
        V42 v42 = (V42) obj;
        int A032 = C0f9.A03(1065741679);
        C14360o3.A0B(v42, 0);
        C70188WFr.A01(this.A00, this.A01, v42, this.A02, false);
        C0f9.A0A(-1451838074, A032);
        C0f9.A0A(-188437761, A03);
    }
}
