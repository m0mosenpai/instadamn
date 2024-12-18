package X;

import java.util.concurrent.ConcurrentMap;

/* loaded from: classes10.dex */
public final class SYV {
    public static final SYV A02 = new SYV();
    public final ConcurrentMap A01 = AbstractC58318PtA.A14();
    public final InterfaceC65256Tgm A00 = new T60();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r1 != 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC65579TnE A00(java.lang.Class r11) {
        /*
            r10 = this;
            java.lang.String r1 = "messageType"
            java.nio.charset.Charset r0 = X.AbstractC62394S9t.A02
            if (r11 == 0) goto Laf
            java.util.concurrent.ConcurrentMap r3 = r10.A01
            java.lang.Object r1 = r3.get(r11)
            X.TnE r1 = (X.InterfaceC65579TnE) r1
            if (r1 != 0) goto Lae
            X.Tgm r1 = r10.A00
            X.T60 r1 = (X.T60) r1
            X.S2V r0 = X.AbstractC62873SUx.A01
            java.lang.Class<X.RLJ> r2 = X.RLJ.class
            boolean r0 = r2.isAssignableFrom(r11)
            if (r0 != 0) goto L2f
            java.lang.Class r0 = X.AbstractC62873SUx.A02
            if (r0 == 0) goto L2f
            boolean r0 = r0.isAssignableFrom(r11)
            if (r0 != 0) goto L2f
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L2f:
            X.Tlk r0 = r1.A00
            X.Tgk r7 = r0.FFo(r11)
            r5 = r7
            X.T5t r5 = (X.C64244T5t) r5
            int r4 = r5.A00
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L66
            boolean r0 = r2.isAssignableFrom(r11)
            if (r0 == 0) goto L59
            X.S2V r4 = X.AbstractC62873SUx.A01
            X.S2R r2 = X.AbstractC62361S8l.A00
        L49:
            X.Tgl r0 = r5.A01
            X.T5y r1 = new X.T5y
            r1.<init>(r2, r0, r4)
        L50:
            java.lang.Object r0 = r3.putIfAbsent(r11, r1)
            X.TnE r0 = (X.InterfaceC65579TnE) r0
            if (r0 == 0) goto Lae
            return r0
        L59:
            X.S2V r4 = X.AbstractC62873SUx.A00
            X.S2R r2 = X.AbstractC62361S8l.A01
            if (r2 != 0) goto L49
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L66:
            boolean r2 = r2.isAssignableFrom(r11)
            r0 = r4 & 1
            if (r0 == 0) goto L9e
            r0 = 1
        L6f:
            int r1 = r0 + (-1)
            r0 = 1
            if (r1 == r0) goto La5
        L74:
            if (r2 == 0) goto L8b
            X.S2T r8 = X.AbstractC62364S8o.A01
            X.S8m r5 = X.AbstractC62362S8m.A01
            X.S2V r9 = X.AbstractC62873SUx.A01
            if (r0 == 0) goto L87
            X.S2R r4 = X.AbstractC62361S8l.A00
            X.S2S r6 = X.AbstractC62363S8n.A01
        L82:
            X.T5z r1 = X.C64250T5z.A00(r4, r5, r6, r7, r8, r9)
            goto L50
        L87:
            r4 = 0
            X.S2S r6 = X.AbstractC62363S8n.A01
            goto L82
        L8b:
            X.S2T r8 = X.AbstractC62364S8o.A00
            X.S8m r5 = X.AbstractC62362S8m.A00
            X.S2V r9 = X.AbstractC62873SUx.A00
            if (r0 == 0) goto L9a
            X.S2R r4 = X.AbstractC62361S8l.A01
            if (r4 == 0) goto La7
            X.S2S r6 = X.AbstractC62363S8n.A00
            goto L82
        L9a:
            r4 = 0
            X.S2S r6 = X.AbstractC62363S8n.A00
            goto L82
        L9e:
            r1 = 4
            r0 = r4 & 4
            if (r0 != r1) goto La5
            r0 = 3
            goto L6f
        La5:
            r0 = 0
            goto L74
        La7:
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        Lae:
            return r1
        Laf:
            java.lang.NullPointerException r0 = X.AbstractC166987dD.A15(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SYV.A00(java.lang.Class):X.TnE");
    }
}
