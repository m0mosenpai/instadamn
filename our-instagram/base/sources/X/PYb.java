package X;

/* loaded from: classes9.dex */
public final class PYb extends AbstractC23611Dp implements InterfaceC16620sF {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYb(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z;
        Object obj2;
        int i;
        switch (this.A01) {
            case 0:
                return new PYb(this.A02, interfaceC23621Ds, 0, this.A03, this.A00);
            case 1:
                z = this.A03;
                obj2 = this.A02;
                i = 1;
                break;
            case 2:
                z = this.A03;
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                return new PYb(this.A02, interfaceC23621Ds, 3, this.A03, this.A00);
            default:
                PYb pYb = new PYb(this.A02, interfaceC23621Ds, 4, this.A03);
                pYb.A00 = AbstractC166987dD.A1a(obj);
                return pYb;
        }
        PYb pYb2 = new PYb(obj2, interfaceC23621Ds, i, z);
        pYb2.A00 = AbstractC166987dD.A1a(obj);
        return pYb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r5.A03 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r2 = (X.C136946Hx) r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r3 == X.AbstractC167007dF.A1N((((X.C4QT) X.C136946Hx.A00(r2).A06).A02 > 0.0f ? 1 : (((X.C4QT) X.C136946Hx.A00(r2).A06).A02 == 0.0f ? 0 : -1)))) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r2.A02(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r5.A03 != false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L96;
                case 1: goto L56;
                case 2: goto L60;
                case 3: goto L85;
                default: goto L5;
            }
        L5:
            X.AbstractC09560e7.A00(r6)
            boolean r4 = r5.A00
            java.lang.Object r3 = r5.A02
            com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment r3 = (com.instagram.creation.publishscreen.fragment.clips.ClipsProfileVisibilityFragment) r3
            com.instagram.igds.components.textcell.IgdsListCell r1 = r3.includeInProfileToggle
            if (r1 == 0) goto L4d
            r0 = r4 ^ 1
            r1.setChecked(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = r3.clipsOnlyToggle
            if (r0 == 0) goto L4a
            r0.setChecked(r4)
            com.instagram.common.ui.base.IgTextView r2 = r3.footerText
            if (r2 == 0) goto L50
            android.content.Context r1 = r3.requireContext()
            boolean r0 = r5.A03
            if (r0 == 0) goto L41
            boolean r0 = X.AbstractC151756sL.A01()
            if (r0 == 0) goto L41
            X.MSX.A0t()
            r0 = 2131969024(0x7f134400, float:1.957496E38)
            if (r4 == 0) goto L3b
            r0 = 2131969023(0x7f1343ff, float:1.9574957E38)
        L3b:
            X.AbstractC166987dD.A1P(r1, r2, r0)
        L3e:
            X.0eB r0 = X.C0eB.A00
            return r0
        L41:
            r0 = 2131955691(0x7f130feb, float:1.9547917E38)
            if (r4 == 0) goto L3b
            r0 = 2131955689(0x7f130fe9, float:1.9547913E38)
            goto L3b
        L4a:
            java.lang.String r0 = "clipsOnlyToggle"
            goto L52
        L4d:
            java.lang.String r0 = "includeInProfileToggle"
            goto L52
        L50:
            java.lang.String r0 = "footerText"
        L52:
            X.C14360o3.A0F(r0)
            goto La5
        L56:
            X.AbstractC09560e7.A00(r6)
            boolean r3 = r5.A00
            boolean r0 = r5.A03
            if (r0 != 0) goto L3e
            goto L69
        L60:
            X.AbstractC09560e7.A00(r6)
            boolean r3 = r5.A00
            boolean r0 = r5.A03
            if (r0 == 0) goto L3e
        L69:
            java.lang.Object r2 = r5.A02
            X.6Hx r2 = (X.C136946Hx) r2
            X.5TA r0 = X.C136946Hx.A00(r2)
            X.4QW r0 = r0.A06
            X.4QT r0 = (X.C4QT) r0
            float r1 = r0.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            if (r3 == r0) goto L3e
            r0 = 0
            r2.A02(r0, r3)
            goto L3e
        L85:
            X.AbstractC09560e7.A00(r6)
            boolean r0 = r5.A03
            if (r0 == 0) goto L3e
            boolean r0 = r5.A00
            if (r0 != 0) goto L3e
            java.lang.Object r0 = r5.A02
            X.AbstractC166987dD.A1Y(r0)
            goto L3e
        L96:
            X.AbstractC09560e7.A00(r6)
            boolean r1 = r5.A03
            boolean r0 = r5.A00
            if (r1 != 0) goto La1
            if (r0 == 0) goto L3e
        La1:
            r0 = 0
            X.C14360o3.A0A(r0)
        La5:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYb) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYb(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = z;
        this.A00 = z2;
    }
}
