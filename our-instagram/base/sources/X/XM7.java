package X;

import java.util.EnumSet;

/* loaded from: classes12.dex */
public final class XM7 extends Y4A {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XM7(X.EnumC72367Xc3 r4, java.util.EnumSet r5) {
        /*
            r3 = this;
            r2 = 4
            r3.A00 = r2
            X.Xbq r1 = X.EnumC72354Xbq.Primitive
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto Ld
            X.Xbq r1 = X.EnumC72354Xbq.Constructed
        Ld:
            r3.<init>(r1, r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XM7.<init>(X.Xc3, java.util.EnumSet):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XM7(X.EnumC72354Xbq r3, X.EnumC72367Xc3 r4, int r5) {
        /*
            r2 = this;
            r2.A00 = r5
            switch(r5) {
                case 1: goto Lf;
                case 2: goto L11;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L13;
                case 6: goto L15;
                case 7: goto L17;
                case 8: goto L1a;
                default: goto L5;
            }
        L5:
            r1 = 16
        L7:
            java.util.EnumSet r0 = java.util.EnumSet.of(r3)
            r2.<init>(r3, r4, r0, r1)
            return
        Lf:
            r1 = 1
            goto L7
        L11:
            r1 = 2
            goto L7
        L13:
            r1 = 5
            goto L7
        L15:
            r1 = 6
            goto L7
        L17:
            r1 = 10
            goto L7
        L1a:
            r1 = 17
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XM7.<init>(X.Xbq, X.Xc3, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XM7(X.EnumC72367Xc3 r3, java.util.EnumSet r4, int r5) {
        /*
            r2 = this;
            r0 = 0
            r2.A00 = r0
            X.Xbq r1 = X.EnumC72354Xbq.Primitive
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto Ld
            X.Xbq r1 = X.EnumC72354Xbq.Constructed
        Ld:
            r2.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XM7.<init>(X.Xc3, java.util.EnumSet, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XM7(EnumC72354Xbq enumC72354Xbq, EnumC72367Xc3 enumC72367Xc3, EnumSet enumSet) {
        super(enumC72354Xbq, enumC72367Xc3, enumSet, 3);
        this.A00 = 3;
    }
}
