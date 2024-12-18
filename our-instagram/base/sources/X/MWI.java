package X;

import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public class MWI implements C11R {
    public C2JL A00;
    public final C1Dk A01;
    public final C40701ud A02;
    public final Executor A03;

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
    }

    @Override // X.C11R
    public final String getName() {
        String callName = this.A01.getCallName();
        C14360o3.A07(callName);
        return callName;
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return -2;
    }

    @Override // X.C11R
    public final void onStart() {
        MWH mwh;
        C62112sC c62112sC;
        if (this instanceof NM2) {
            C2JL c2jl = this.A00;
            if ((c2jl instanceof MWH) && (mwh = (MWH) c2jl) != null) {
                mwh.A04.A03.A00(C05F.A00);
                InterfaceC154766xR interfaceC154766xR = mwh.A06;
                boolean z = mwh.A08;
                interfaceC154766xR.DRc(mwh.A07, z, mwh.A09, false);
                if (!z && (c62112sC = mwh.A05) != null) {
                    c62112sC.A01();
                }
            }
        }
    }

    @Override // X.C11R
    public final void run() {
        C2JL c2jl = this.A00;
        if (c2jl != null) {
            C40701ud c40701ud = this.A02;
            C1Dk c1Dk = this.A01;
            c40701ud.ATW(new C55661Onm(c2jl, 6), new MV7(c2jl, 5), c1Dk, this.A03);
        }
    }

    public MWI(C1Dk c1Dk, C2JL c2jl, C40701ud c40701ud, Executor executor) {
        AbstractC167017dG.A1P(c40701ud, c1Dk);
        this.A02 = c40701ud;
        this.A01 = c1Dk;
        this.A00 = c2jl;
        this.A03 = executor;
    }
}
