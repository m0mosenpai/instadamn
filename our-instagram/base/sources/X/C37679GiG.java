package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.GiG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37679GiG implements InterfaceC77833eB {
    public static final C37679GiG A00 = new Object();

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C37678GiF c37678GiF = (C37678GiF) obj2;
        AbstractC167017dG.A1P(view, c37678GiF);
        C120985dq c120985dq = c37678GiF.A02;
        C37616GhB c37616GhB = c37678GiF.A03;
        c37616GhB.A03(view);
        if (AbstractC37647Ghg.A00(c120985dq) || c120985dq.A07() != null || c37678GiF.A06) {
            c37616GhB.A04(view, c37678GiF.A00, c37678GiF.A01, c120985dq, c37678GiF.A04, c37678GiF.A06, c37678GiF.A05);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC68323VMj.A00(this);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        C37678GiF c37678GiF = (C37678GiF) obj2;
        AbstractC167017dG.A1P(view, c37678GiF);
        c37678GiF.A03.A03(view);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
