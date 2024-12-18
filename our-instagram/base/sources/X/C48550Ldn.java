package X;

import android.view.View;
import java.util.Iterator;

/* renamed from: X.Ldn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48550Ldn implements InterfaceC62892tS {
    public final /* synthetic */ C07X A00;
    public final /* synthetic */ InterfaceC147266kB A01;
    public final /* synthetic */ C6WT A02;

    @Override // X.InterfaceC62892tS
    public final boolean CtU() {
        return true;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void E0r(View view) {
    }

    public C48550Ldn(C07X c07x, InterfaceC147266kB interfaceC147266kB, C6WT c6wt) {
        this.A01 = interfaceC147266kB;
        this.A00 = c07x;
        this.A02 = c6wt;
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        InterfaceC143576dw interfaceC143576dw;
        InterfaceC147266kB interfaceC147266kB = this.A01;
        View A0D = ((C147256kA) interfaceC147266kB).A04.A0D(i);
        if (A0D != null) {
            C07X c07x = this.A00;
            C48103LRd c48103LRd = new C48103LRd(c07x, interfaceC147266kB, i);
            C07T lifecycle = c07x.getLifecycle();
            C0eR c0eR = c48103LRd.A00;
            C14360o3.A0B(lifecycle, 0);
            OB1 A00 = AbstractC47892LDm.A00(lifecycle);
            int hashCode = c0eR.hashCode();
            AbstractC47892LDm.A00.put(Integer.valueOf(hashCode), A00);
            c0eR.A09(new LRX(hashCode));
            C6WT c6wt = this.A02;
            Object tag = A0D.getTag();
            if (tag instanceof InterfaceC143576dw) {
                interfaceC143576dw = (InterfaceC143576dw) tag;
            } else {
                interfaceC143576dw = null;
            }
            if (!C14360o3.A0K(interfaceC143576dw, c6wt.A00)) {
                c6wt.A00 = interfaceC143576dw;
                Iterator it = c6wt.A02.A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC16620sF) it.next()).invoke(c48103LRd, interfaceC143576dw);
                }
            }
        }
    }
}
