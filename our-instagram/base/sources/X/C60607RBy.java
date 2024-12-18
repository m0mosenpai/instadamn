package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* renamed from: X.RBy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60607RBy extends RC7 implements Serializable {
    public final RC7 A00;
    public final Class[] A01;

    public C60607RBy(RC7 rc7, Class[] clsArr) {
        super(rc7.A04, rc7);
        this.A00 = rc7;
        this.A01 = clsArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    @Override // X.RC7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.AnonymousClass182 r6, X.AbstractC913345m r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Class r4 = r7.A07
            if (r4 == 0) goto L15
            java.lang.Class[] r3 = r5.A01
            int r2 = r3.length
            r1 = 0
        L8:
            if (r1 >= r2) goto L17
            r0 = r3[r1]
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto L15
            int r1 = r1 + 1
            goto L8
        L15:
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            X.RC7 r0 = r5.A00
            if (r1 == 0) goto L20
            r0.A04(r6, r7, r8)
            return
        L20:
            X.16N r0 = X.AnonymousClass182.A01
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60607RBy.A04(X.182, X.45m, java.lang.Object):void");
    }

    @Override // X.RC7
    public final void A06(JsonSerializer jsonSerializer) {
        this.A00.A06(jsonSerializer);
    }
}
