package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class T26 implements InterfaceC95074Pr, Serializable, Cloneable {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public static final C95044Pn A0G = new Object();
    public static final C95054Po A08 = new C95054Po("inForegroundApp", (byte) 2, 1);
    public static final C95054Po A09 = new C95054Po("inForegroundDevice", (byte) 2, 2);
    public static final C95054Po A0A = new C95054Po("keepAliveTimeout", (byte) 8, 3);
    public static final C95054Po A0D = new C95054Po("subscribeTopics", (byte) 15, 4);
    public static final C95054Po A0C = new C95054Po("subscribeGenericTopics", (byte) 15, 5);
    public static final C95054Po A0F = new C95054Po("unsubscribeTopics", (byte) 15, 6);
    public static final C95054Po A0E = new C95054Po("unsubscribeGenericTopics", (byte) 15, 7);
    public static final C95054Po A0B = new C95054Po("requestId", (byte) 10, 8);
    public static final C95054Po A07 = new C95054Po("clientRequestId", (byte) 11, 9);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto La8
            r4 = 1
            if (r6 == r7) goto L93
            boolean r0 = r7 instanceof X.T26
            if (r0 == 0) goto La8
            X.T26 r7 = (X.T26) r7
            java.lang.Boolean r3 = r6.A00
            boolean r2 = X.AbstractC167007dF.A1W(r3)
            java.lang.Boolean r1 = r7.A00
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            r0 = r0 ^ r2
            if (r0 != 0) goto La8
            if (r2 == 0) goto L21
            if (r3 != 0) goto La2
            if (r1 != 0) goto La8
        L21:
            java.lang.Integer r3 = r6.A01
            boolean r2 = X.AbstractC167007dF.A1W(r3)
            java.lang.Integer r1 = r7.A01
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            r0 = r0 ^ r2
            if (r0 != 0) goto La8
            if (r2 == 0) goto L36
            if (r3 != 0) goto L9b
            if (r1 != 0) goto La8
        L36:
            java.util.List r3 = r6.A04
            boolean r2 = X.AbstractC167007dF.A1W(r3)
            java.util.List r1 = r7.A04
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            boolean r0 = X.AbstractC63237Sfp.A03(r3, r1, r2, r0)
            if (r0 == 0) goto La8
            java.util.List r3 = r6.A03
            boolean r2 = X.AbstractC167007dF.A1W(r3)
            java.util.List r1 = r7.A03
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            boolean r0 = X.AbstractC63237Sfp.A03(r3, r1, r2, r0)
            if (r0 == 0) goto La8
            java.util.List r3 = r6.A06
            boolean r2 = X.AbstractC167007dF.A1W(r3)
            java.util.List r1 = r7.A06
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            boolean r0 = X.AbstractC63237Sfp.A03(r3, r1, r2, r0)
            if (r0 == 0) goto La8
            java.util.List r3 = r6.A05
            boolean r2 = X.AbstractC167007dF.A1W(r3)
            java.util.List r1 = r7.A05
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            boolean r0 = X.AbstractC63237Sfp.A03(r3, r1, r2, r0)
            if (r0 == 0) goto La8
            java.lang.String r3 = r6.A02
            boolean r2 = X.AbstractC167007dF.A1W(r3)
            java.lang.String r1 = r7.A02
            boolean r0 = X.AbstractC167007dF.A1W(r1)
            r0 = r0 ^ r2
            if (r0 != 0) goto La8
            if (r2 == 0) goto L93
            if (r3 != 0) goto L94
            if (r1 != 0) goto La8
        L93:
            return r4
        L94:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L93
            return r5
        L9b:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L36
            return r5
        La2:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L21
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T26.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        return AbstractC63237Sfp.A01(this, AbstractC166987dD.A1C(), 1);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A00, null, this.A01, this.A04, this.A03, this.A06, this.A05, null, this.A02});
    }

    public T26(Boolean bool, Integer num, String str, List list, List list2, List list3, List list4) {
        this.A00 = bool;
        this.A01 = num;
        this.A04 = list;
        this.A03 = list2;
        this.A06 = list3;
        this.A05 = list4;
        this.A02 = str;
    }
}
