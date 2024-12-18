package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.PTf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57066PTf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ EnumC58132lV A02;
    public final /* synthetic */ PCT A03;
    public final /* synthetic */ Integer A04;

    public RunnableC57066PTf(View view, EnumC58132lV enumC58132lV, PCT pct, Integer num, int i) {
        this.A03 = pct;
        this.A04 = num;
        this.A01 = view;
        this.A00 = i;
        this.A02 = enumC58132lV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PCT pct = this.A03;
        Integer num = this.A04;
        View view = this.A01;
        int i = this.A00;
        EnumC58132lV enumC58132lV = this.A02;
        Context context = pct.A0C;
        C5SU c5su = new C5SU(context, pct.A0K, new C149686oL(AbstractC166997dE.A0p(context, i)));
        c5su.A03(view);
        c5su.A0F = false;
        c5su.A04 = new NMB(6, num, pct);
        c5su.A06(enumC58132lV);
        c5su.A00().A07(pct.A0L);
    }
}
