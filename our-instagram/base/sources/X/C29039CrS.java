package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.CrS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29039CrS implements C2YT {
    public final C206189Bb A00;
    public final UserSession A01;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        long A00;
        C14360o3.A0B(c2yr, 0);
        if (this.A00.A00 == C05F.A00) {
            A00 = AbstractC25230BEn.A0G();
        } else {
            C51532Yb c51532Yb = C26626BpN.A03;
            Context context = c2yr.A00.A04;
            View ALq = c51532Yb.ALq(context);
            AbstractC35069Fcg.A01(context, ALq, this.A01, false);
            AbstractC25231BEo.A0z(ALq, j);
            A00 = AbstractC78673fZ.A00(Math.max(C78613fT.A03(j), ALq.getMeasuredWidth()), Math.max(C78613fT.A02(j), ALq.getMeasuredHeight()));
        }
        return new C2YU(A00, null);
    }

    public C29039CrS(C206189Bb c206189Bb, UserSession userSession) {
        AbstractC167017dG.A1P(c206189Bb, userSession);
        this.A00 = c206189Bb;
        this.A01 = userSession;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
