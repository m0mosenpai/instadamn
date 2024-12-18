package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes9.dex */
public final class OGt {
    public final C54506O6j A00;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1Ke, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A00() {
        C54506O6j c54506O6j = this.A00;
        C1RQ A00 = C1RQ.A00();
        EnumC27091Ti enumC27091Ti = c54506O6j.A01;
        if (A00.A06(enumC27091Ti) || (C1RQ.A00().A05(enumC27091Ti) && C1RQ.A00().A07(enumC27091Ti))) {
            ?? obj = new Object();
            obj.set(true);
            return obj;
        }
        ?? obj2 = new Object();
        MTC mtc = new MTC(enumC27091Ti);
        mtc.A03 = C05F.A01;
        mtc.A02 = new TGS(obj2, 1);
        C1RQ.A00().A03(c54506O6j.A00, new MTD(mtc));
        return obj2;
    }

    public OGt(C54506O6j c54506O6j) {
        this.A00 = c54506O6j;
    }
}
