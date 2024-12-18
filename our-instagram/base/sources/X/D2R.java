package X;

import android.app.Activity;
import android.view.View;

/* loaded from: classes5.dex */
public final class D2R implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C7Uo A03;
    public final /* synthetic */ String A04;

    public D2R(Activity activity, View view, View view2, C7Uo c7Uo, String str) {
        this.A02 = view;
        this.A00 = activity;
        this.A04 = str;
        this.A01 = view2;
        this.A03 = c7Uo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU c5su = new C5SU(this.A00, new C149686oL(this.A04));
        c5su.A01();
        c5su.A03(this.A01);
        c5su.A00().A06();
        C7Uo c7Uo = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19630xq interfaceC19630xq = c7Uo.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7G("ai_call_tooltip_last_seen_timestamp", currentTimeMillis);
        ARD.apply();
        String A00 = AbstractC111324zv.A00(1904);
        AbstractC167007dF.A18(interfaceC19630xq, A00, interfaceC19630xq.getInt(A00, 0) + 1);
    }
}
