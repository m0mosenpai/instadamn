package X;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class LQJ implements View.OnLongClickListener {
    public final /* synthetic */ C31446Drq A00;
    public final /* synthetic */ C43767JXg A01;
    public final /* synthetic */ InterfaceC50518MRv A02;
    public final /* synthetic */ C48316LZp A03;
    public final /* synthetic */ C48742LhA A04;
    public final /* synthetic */ C3o9 A05;

    public LQJ(C31446Drq c31446Drq, C43767JXg c43767JXg, InterfaceC50518MRv interfaceC50518MRv, C48316LZp c48316LZp, C48742LhA c48742LhA, C3o9 c3o9) {
        this.A04 = c48742LhA;
        this.A05 = c3o9;
        this.A02 = interfaceC50518MRv;
        this.A01 = c43767JXg;
        this.A00 = c31446Drq;
        this.A03 = c48316LZp;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C48742LhA c48742LhA = this.A04;
        C3o9 c3o9 = this.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        boolean CX1 = this.A02.CX1();
        C43767JXg c43767JXg = this.A01;
        c48742LhA.DT9(c43767JXg.A0O.Ahl(), c43767JXg.A07, this.A00, null, c3o9, "", A1E, CX1, this.A03.A07.CVQ());
        return true;
    }
}
