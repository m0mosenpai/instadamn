package X;

import java.util.List;

/* renamed from: X.Ow2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56141Ow2 implements InterfaceC13000lm {
    public static final OGc A04 = new Object();
    public C52086N2m A00;
    public Integer A01;
    public String A02;
    public List A03;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.MnN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C51415MnN A00(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            r2 = 0
            java.lang.String r0 = r5.A02
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9e
            X.N2m r0 = r5.A00
            if (r0 == 0) goto L88
            java.util.List r0 = r0.A00
            r0.getClass()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            if (r0 == 0) goto L88
            java.util.Iterator r1 = r0.iterator()
        L20:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r4 = r1.next()
            r0 = r4
            X.NnM r0 = (X.C53615NnM) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 == 0) goto L20
        L35:
            X.NnM r4 = (X.C53615NnM) r4
        L37:
            X.MnN r3 = new X.MnN
            r3.<init>()
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L83
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L79;
                case 2: goto L7c;
                default: goto L47;
            }
        L47:
            java.lang.String r1 = "success"
        L49:
            java.lang.String r0 = "status"
            r3.A06(r0, r1)
            java.lang.String r0 = "upload_id"
            r3.A06(r0, r7)
            if (r4 == 0) goto L8c
            java.util.List r0 = r4.A02
            if (r0 == 0) goto L8c
            r2 = 0
            java.util.Iterator r1 = r0.iterator()
        L5e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r1.next()
            com.instagram.tagging.api.model.MediaSuggestedProductTag r0 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r0
            java.util.List r0 = r0.A02
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            if (r0 != 0) goto L74
            X.0sl r0 = X.C16930sl.A00
        L74:
            int r2 = X.AbstractC31172DnG.A02(r0, r2)
            goto L5e
        L79:
            java.lang.String r1 = "fail"
            goto L49
        L7c:
            r0 = 2862(0xb2e, float:4.01E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            goto L49
        L83:
            java.lang.String r1 = ""
            goto L49
        L86:
            r4 = r2
            goto L35
        L88:
            r4 = r2
            goto L37
        L8a:
            long r0 = (long) r2
            goto L94
        L8c:
            java.lang.Integer r1 = r5.A01
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L98
            r0 = 0
        L94:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L98:
            java.lang.String r0 = "suggestions_count"
            r3.A05(r0, r2)
            return r3
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56141Ow2.A00(java.lang.String, java.lang.String):X.MnN");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
    }
}
