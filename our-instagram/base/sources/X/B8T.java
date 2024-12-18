package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class B8T extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8T(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static View A00(B8T b8t) {
        return (View) ((C23710Aej) b8t.A01).A0C.getValue();
    }

    public static InterfaceC09390do A01(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new B8T(obj, i));
    }

    public static C17050sx A02(Object obj, int i) {
        return AbstractC09440dt.A01(new B8T(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01dd, code lost:
    
        if (X.AbstractC166987dD.A0H(r3.A0r.CES(r3, X.C23031Ai.A8c[512(0x200, float:7.17E-43)])) >= X.C18U.A01(X.C06090Tz.A05, r5, 36606607559693816L)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0272, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0270, code lost:
    
        if (r0.A00 == false) goto L77;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B8T.invoke():java.lang.Object");
    }
}
