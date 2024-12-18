package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.AzT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24868AzT implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C202848y2 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public RunnableC24868AzT(View view, C202848y2 c202848y2, boolean z, boolean z2, boolean z3) {
        this.A00 = view;
        this.A04 = z;
        this.A01 = c202848y2;
        this.A03 = z2;
        this.A02 = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC58132lV enumC58132lV;
        View view = this.A00;
        Context A0L = AbstractC166997dE.A0L(view);
        ViewGroup A01 = AbstractC124845kp.A01(view);
        boolean z = this.A04;
        int i = 2131975328;
        if (z) {
            i = 2131975331;
        }
        C5SU c5su = new C5SU(A0L, A01, new C149686oL(i));
        C202848y2 c202848y2 = this.A01;
        c5su.A03(c202848y2.A01);
        if (this.A03) {
            enumC58132lV = EnumC58132lV.A02;
        } else {
            enumC58132lV = EnumC58132lV.A03;
        }
        c5su.A05 = enumC58132lV;
        c5su.A00 = 5000;
        c5su.A04 = new C220489oY(c202848y2, 0, z, this.A02);
        c5su.A00().A07(c202848y2.A03);
    }
}
