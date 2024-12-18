package X;

import android.content.res.Resources;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.forker.Process;
import java.util.List;

/* loaded from: classes5.dex */
public final class D2X implements Runnable {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ContextChain A02;
    public final /* synthetic */ C25959Be4 A03;
    public final /* synthetic */ C27771Wf A04;
    public final /* synthetic */ C2XE A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ C15100pQ A08;

    public D2X(ContextChain contextChain, C25959Be4 c25959Be4, C27771Wf c27771Wf, C2XE c2xe, Object obj, List list, C15100pQ c15100pQ, int i, int i2) {
        this.A08 = c15100pQ;
        this.A01 = i2;
        this.A05 = c2xe;
        this.A03 = c25959Be4;
        this.A07 = list;
        this.A04 = c27771Wf;
        this.A06 = obj;
        this.A02 = contextChain;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = (this.A00 + 1) % this.A01;
        C2XE c2xe = this.A05;
        Resources A0M = AbstractC166997dE.A0M(c2xe.A0C);
        C25959Be4 c25959Be4 = this.A03;
        List list = this.A07;
        C27771Wf c27771Wf = this.A04;
        Object obj = this.A06;
        ContextChain contextChain = this.A02;
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) c25959Be4.A02(c25959Be4.A00);
        if (interfaceC59242nQ != null) {
            if (!interfaceC59242nQ.CUk() || interfaceC59242nQ.CL2()) {
                InterfaceC59242nQ A05 = c25959Be4.A05();
                if (!A05.CUk() || A05.CL2()) {
                    c25959Be4.A06();
                    CCE.A00(A0M, (android.net.Uri) AbstractC167007dF.A0e(list, i), contextChain, c25959Be4, c27771Wf, obj);
                }
            }
            this.A00 = i;
            if (c2xe.A01 != null) {
                c2xe.A0A(new C125975mo(AbstractC25228BEl.A1Y(i), Process.WAIT_RESULT_STOPPED));
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
