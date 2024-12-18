package X;

/* renamed from: X.AhQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23871AhQ implements InterfaceC58112Ppb {
    public final Integer A00 = C05F.A00;
    public final String A01;
    public final /* synthetic */ C189988bH A02;

    public C23871AhQ(C189988bH c189988bH) {
        this.A02 = c189988bH;
        this.A01 = AbstractC166997dE.A0p(c189988bH.A0u.requireContext(), 2131955290);
    }

    @Override // X.InterfaceC58112Ppb
    public final Integer BWJ() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r2.A0h != false) goto L10;
     */
    @Override // X.InterfaceC58112Ppb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D01() {
        /*
            r5 = this;
            X.8bH r2 = r5.A02
            X.8Jt r3 = r2.A0L
            r1 = 0
            if (r3 == 0) goto L14
            X.8Jt r0 = r2.A0M
            if (r3 == r0) goto L14
            boolean r0 = r2.A16
            if (r0 == 0) goto L14
            boolean r0 = r2.A0h
            r3 = 1
            if (r0 == 0) goto L15
        L14:
            r3 = 0
        L15:
            android.view.View r0 = r2.A04
            if (r0 == 0) goto L1c
            r0.setVisibility(r1)
        L1c:
            java.lang.Integer r0 = r2.A0d
            if (r0 == 0) goto L2b
            int r1 = r0.intValue()
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L2b
            r0.setVisibility(r1)
        L2b:
            X.AlJ r0 = r2.A0Y
            if (r0 == 0) goto L35
            r1 = 1
            android.view.View r0 = r0.A05
            r0.setEnabled(r1)
        L35:
            r4 = 0
            r2.A0d = r4
            if (r3 == 0) goto Lb8
            android.view.View r0 = r2.A05
            if (r0 != 0) goto L61
            android.view.ViewGroup r3 = r2.A08
            r0 = 0
            if (r3 == 0) goto L52
            r1 = 2131432896(0x7f0b15c0, float:1.8487562E38)
            android.view.View r1 = r3.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L52
            android.view.View r4 = r1.inflate()
        L52:
            r2.A05 = r4
            if (r4 == 0) goto L5f
            r0 = 2131438653(0x7f0b2c3d, float:1.8499239E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
        L5f:
            r2.A0E = r0
        L61:
            android.view.View r0 = r2.A05
            r4 = 0
            if (r0 == 0) goto L69
            r0.setVisibility(r4)
        L69:
            X.AGt r0 = r2.A0U
            if (r0 == 0) goto L7f
            X.2iX r3 = r0.A02
            int r1 = r3.CGb()
            r0 = 8
            if (r1 == r0) goto L7f
            android.view.View r1 = r3.getView()
            r0 = 4
            r1.setVisibility(r0)
        L7f:
            X.AlI r0 = r2.A0T
            if (r0 == 0) goto L88
            android.widget.SeekBar r0 = r0.A03
            r0.setEnabled(r4)
        L88:
            X.Cwu r0 = r2.A0W
            if (r0 == 0) goto L96
            androidx.recyclerview.widget.RecyclerView r1 = r0.A0E
            r1.setNestedScrollingEnabled(r4)
            X.ATW r0 = X.ATW.A00
            r1.setOnTouchListener(r0)
        L96:
            X.AlJ r0 = r2.A0Y
            if (r0 == 0) goto L9f
            android.view.View r0 = r0.A05
            r0.setEnabled(r4)
        L9f:
            android.view.View r0 = r2.A04
            if (r0 == 0) goto La6
            r0.setEnabled(r4)
        La6:
            android.view.View r1 = r2.A04
            if (r1 == 0) goto Lb0
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.setAlpha(r0)
        Lb0:
            X.879 r0 = r2.A0b
            if (r0 == 0) goto Lb7
            r0.pause()
        Lb7:
            return
        Lb8:
            X.C189988bH.A06(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23871AhQ.D01():void");
    }

    @Override // X.InterfaceC58112Ppb
    public final String getTitle() {
        return this.A01;
    }
}
