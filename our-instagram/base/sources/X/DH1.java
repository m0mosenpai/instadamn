package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class DH1 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH1(C07T c07t, InterfaceC09670ek interfaceC09670ek, int i) {
        super(0);
        this.A00 = i;
        if (22 - i != 0) {
            this.A02 = c07t;
            this.A01 = interfaceC09670ek;
        } else {
            this.A01 = c07t;
            this.A02 = interfaceC09670ek;
        }
    }

    public static C27933CSs A00(WUe wUe, C70409WUm c70409WUm) {
        C69706Vu1 c69706Vu1 = c70409WUm.A05;
        C68907Ve7 A01 = c69706Vu1.A01();
        C14360o3.A07(A01);
        C68664Va0 A00 = c69706Vu1.A00();
        Executor executor = ((C1WC) c70409WUm.A04).A01;
        return new C27933CSs(wUe, A00, c70409WUm.A02, A01, executor, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x04a2, code lost:
    
        if (r0 == false) goto L153;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, X.VT9] */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DH1.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH1(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
