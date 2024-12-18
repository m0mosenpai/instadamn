package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Field;

/* loaded from: classes10.dex */
public final class R9i extends RBV {
    public final RBJ A00;
    public final boolean A01;
    public final transient Field A02;

    public R9i(C913945y c913945y, R9i r9i) {
        super(c913945y, r9i);
        this.A00 = r9i.A00;
        this.A02 = r9i.A02;
        this.A01 = r9i.A01;
    }

    public R9i(JsonDeserializer jsonDeserializer, InterfaceC102444jN interfaceC102444jN, R9i r9i) {
        super(jsonDeserializer, interfaceC102444jN, r9i);
        this.A00 = r9i.A00;
        this.A02 = r9i.A02;
        this.A01 = AbstractC167007dF.A1X(interfaceC102444jN, C64175T2e.A02);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public R9i(X.AbstractC910944l r9, X.RBJ r10, X.AbstractC63037SbC r11, X.AbstractC63020Sal r12, X.C45A r13) {
        /*
            r8 = this;
            X.45y r5 = r11.A0C()
            r11.A0D()
            X.TIH r4 = r11.A0B()
            r2 = r8
            r3 = r9
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A00 = r10
            java.lang.reflect.Field r0 = r10.A00
            r8.A02 = r0
            X.4jN r1 = r8.A07
            X.T2e r0 = X.C64175T2e.A02
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            r8.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R9i.<init>(X.44l, X.RBJ, X.SbC, X.Sal, X.45A):void");
    }
}
