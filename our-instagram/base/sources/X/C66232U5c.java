package X;

import android.util.SparseArray;

/* renamed from: X.U5c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66232U5c implements InterfaceC126005ms {
    public final /* synthetic */ C78473fD A00;
    public final /* synthetic */ C102884kP A01;

    public C66232U5c(C78473fD c78473fD, C102884kP c102884kP) {
        this.A01 = c102884kP;
        this.A00 = c78473fD;
    }

    @Override // X.InterfaceC126005ms
    public final boolean FDk(C102884kP c102884kP) {
        C78473fD c78473fD = this.A00;
        C14360o3.A0B(c102884kP, 0);
        C78463fC c78463fC = (C78463fC) c78473fD.A06.getValue();
        Integer valueOf = Integer.valueOf(c102884kP.A04);
        Object A00 = c78463fC.A00(valueOf);
        if ((A00 instanceof SparseArray) && A00 != null) {
            c78463fC.A01(valueOf, A00);
        }
        Object A002 = c78463fC.A00(c102884kP);
        if (A002 != null) {
            c78463fC.A01(c102884kP, A002);
        }
        return false;
    }
}
