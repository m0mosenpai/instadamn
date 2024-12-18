package X;

import android.app.Activity;

/* renamed from: X.IuD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42656IuD implements JG9 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC84443pn A01;
    public final /* synthetic */ InterfaceC88183wS A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ InterfaceC43585JPa A04;
    public final /* synthetic */ C75113Zb A05;

    public C42656IuD(Activity activity, InterfaceC84443pn interfaceC84443pn, InterfaceC88183wS interfaceC88183wS, C38321qM c38321qM, InterfaceC43585JPa interfaceC43585JPa, C75113Zb c75113Zb) {
        this.A03 = c38321qM;
        this.A05 = c75113Zb;
        this.A01 = interfaceC84443pn;
        this.A02 = interfaceC88183wS;
        this.A04 = interfaceC43585JPa;
        this.A00 = activity;
    }

    @Override // X.JG9
    public final void DI1(boolean z, boolean z2) {
        if (z) {
            C41737Ie9.A02(this.A01, this.A02, null, this.A03, this.A04, this.A05);
        }
        if (z2) {
            AbstractC167017dG.A0y(this.A00, C3DN.A00);
        }
    }
}
