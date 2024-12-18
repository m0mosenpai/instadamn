package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.OkW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLongClickListenerC55477OkW implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C51137Mig A01;

    public ViewOnLongClickListenerC55477OkW(C51137Mig c51137Mig, int i) {
        this.A01 = c51137Mig;
        this.A00 = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C51137Mig c51137Mig = this.A01;
        int i = this.A00;
        C55121Obi c55121Obi = new C55121Obi(c51137Mig.A00, c51137Mig.A02.A04, c51137Mig.A01, new O83(c51137Mig, i), (P2Q) c51137Mig.A03.get(i));
        Activity activity = c55121Obi.A00;
        C50674MYs c50674MYs = new C50674MYs(activity, c55121Obi.A01);
        c50674MYs.A03 = new C42685Iug(c55121Obi, 0);
        c50674MYs.A01(ViewOnClickListenerC55455Ok9.A00(c55121Obi, 62), 2131972369);
        c50674MYs.A01(ViewOnClickListenerC55455Ok9.A00(c55121Obi, 63), 2131963528);
        c50674MYs.A03(ViewOnClickListenerC55455Ok9.A00(c55121Obi, 64), 2131976951);
        c50674MYs.A03(ViewOnClickListenerC55455Ok9.A00(c55121Obi, 65), 2131951994);
        c50674MYs.A03(ViewOnClickListenerC55455Ok9.A00(c55121Obi, 66), 2131951993);
        C31727DwY.A00(activity, c50674MYs);
        C55121Obi.A01(c55121Obi, AbstractC43591JPw.A00(289));
        return true;
    }
}
