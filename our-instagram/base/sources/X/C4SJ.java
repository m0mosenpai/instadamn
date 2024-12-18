package X;

import java.lang.ref.WeakReference;

/* renamed from: X.4SJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4SJ implements C4SK {
    public C4SL A00 = new C4SL();
    public WeakReference A01;
    public C95224Qi A02;
    public C30P A03;
    public Object A04;
    public final C4SI A05;

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[RETURN] */
    @Override // X.C4SK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4T2 BHi(java.lang.String r7) {
        /*
            r6 = this;
            r3 = 0
            java.lang.ref.WeakReference r0 = r6.A01
            r5 = 0
            if (r0 == 0) goto L92
            java.lang.Object r4 = r0.get()
            X.4QY r4 = (X.C4QY) r4
        Lc:
            X.4SL r0 = r6.A00
            java.util.Map r0 = r0.A00
            java.lang.Object r2 = r0.get(r7)
            if (r2 != 0) goto L1e
            X.4T2 r2 = new X.4T2
            r2.<init>()
            r0.put(r7, r2)
        L1e:
            X.4T2 r2 = (X.C4T2) r2
            r0.remove(r7)
            if (r4 == 0) goto L90
            java.lang.Integer r0 = r4.CFp()
            if (r0 == 0) goto L39
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "view_height"
            r2.A05(r0, r1)
        L39:
            java.lang.Integer r0 = r4.CFx()
            if (r0 == 0) goto L4d
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "view_width"
            r2.A05(r0, r1)
        L4d:
            X.4AK r0 = r4.CFc()
            if (r0 == 0) goto L90
            int r1 = r0.ordinal()
            if (r1 == r3) goto L8d
            r0 = 1
            if (r1 == r0) goto L8d
            r0 = 2
            if (r1 != r0) goto L90
            java.lang.String r1 = "progressive"
        L61:
            java.lang.String r0 = "video_format"
            r2.A06(r0, r1)
            X.4SI r3 = r6.A05
            if (r3 == 0) goto L83
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "audio_derived_content_id"
            r2.A06(r0, r1)
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L83
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "client_position"
            r2.A05(r0, r1)
        L83:
            X.30P r1 = r6.A03
            if (r1 == 0) goto L95
            java.lang.Object r0 = r6.A04
            r1.A06(r2, r0)
            return r2
        L8d:
            java.lang.String r1 = "dash"
            goto L61
        L90:
            r1 = 0
            goto L61
        L92:
            r4 = r5
            goto Lc
        L95:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4SJ.BHi(java.lang.String):X.4T2");
    }

    @Override // X.C4SK
    public final C95224Qi BOk() {
        return this.A02;
    }

    @Override // X.C4SK
    public final Integer BTX() {
        Integer A08;
        C30P c30p = this.A03;
        if (c30p == null || c30p.A0B(this.A04) || (A08 = c30p.A08()) == null) {
            return C05F.A00;
        }
        return A08;
    }

    @Override // X.C4SK
    public final C95804So BoM() {
        C30P c30p = this.A03;
        C95804So c95804So = null;
        if (c30p != null && (c95804So = c30p.A05(this.A04)) != null) {
            c95804So.A06("nav_chain", C1QM.A00.A02.A00);
        }
        return c95804So;
    }

    @Override // X.C4SK
    public final /* bridge */ /* synthetic */ C0eB EW8(C4T2 c4t2, String str) {
        this.A00.A00.put(str, c4t2);
        return C0eB.A00;
    }

    public C4SJ(C95224Qi c95224Qi, C4SI c4si, C30P c30p, Object obj) {
        this.A04 = obj;
        this.A03 = c30p;
        this.A05 = c4si;
        this.A02 = c95224Qi;
    }
}
