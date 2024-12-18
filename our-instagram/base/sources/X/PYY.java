package X;

/* loaded from: classes9.dex */
public final class PYY extends AbstractC23611Dp implements InterfaceC16620sF {
    public float A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYY(C55127Obo c55127Obo, InterfaceC23621Ds interfaceC23621Ds, float f) {
        super(2, interfaceC23621Ds);
        this.A01 = 0;
        this.A02 = c55127Obo;
        this.A00 = f;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                return new PYY((C55127Obo) obj2, interfaceC23621Ds, this.A00);
            case 1:
                i = 1;
                PYY pyy = new PYY(obj2, interfaceC23621Ds, i);
                pyy.A00 = AbstractC166987dD.A09(obj);
                return pyy;
            default:
                i = 2;
                PYY pyy2 = new PYY(obj2, interfaceC23621Ds, i);
                pyy2.A00 = AbstractC166987dD.A09(obj);
                return pyy2;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds A1M;
        if (this.A01 != 0) {
            A1M = create(Float.valueOf(AbstractC166987dD.A09(obj)), (InterfaceC23621Ds) obj2);
        } else {
            A1M = AbstractC166987dD.A1M(obj2, obj, this);
        }
        return ((PYY) A1M).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r0 != null) goto L11;
     */
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
                case 0: goto L3a;
                case 1: goto L66;
                default: goto L5;
            }
        L5:
            X.AbstractC09560e7.A00(r6)
            float r4 = r5.A00
            java.lang.Object r2 = r5.A02
            com.instagram.music.search.MusicOverlayResultsListController r2 = (com.instagram.music.search.MusicOverlayResultsListController) r2
            androidx.recyclerview.widget.RecyclerView r0 = r2.recyclerView
            if (r0 == 0) goto L37
            X.MYh r0 = r2.A0E
            X.0UO r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            X.JIN r3 = (X.JIN) r3
            if (r3 == 0) goto L37
            int r1 = com.instagram.music.search.MusicOverlayResultsListController.A00(r3, r2)
            if (r1 < 0) goto L37
            androidx.recyclerview.widget.RecyclerView r0 = r2.A05()
        L28:
            X.3OO r1 = r0.A0V(r1)
            if (r1 == 0) goto L37
            boolean r0 = r1 instanceof X.JGL
            if (r0 == 0) goto L37
            X.JGL r1 = (X.JGL) r1
            r1.FCh(r3, r4)
        L37:
            X.0eB r0 = X.C0eB.A00
            return r0
        L3a:
            X.AbstractC09560e7.A00(r6)
            java.lang.Object r0 = r5.A02
            X.Obo r0 = (X.C55127Obo) r0
            X.Olp r0 = r0.A08
            if (r0 == 0) goto L37
            float r1 = r5.A00
            X.Od2 r0 = r0.A00
            if (r0 != 0) goto L55
            java.lang.String r0 = "provider"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L55:
            X.AKN r0 = r0.A04
            if (r0 == 0) goto L37
            X.7yc r0 = r0.A0E
            android.view.View r0 = r0.Bfy()
            X.C14360o3.A07(r0)
            r0.setAlpha(r1)
            goto L37
        L66:
            X.AbstractC09560e7.A00(r6)
            float r4 = r5.A00
            java.lang.Object r2 = r5.A02
            X.N6x r2 = (X.C52168N6x) r2
            X.0do r0 = r2.A0L
            X.MYh r0 = X.MSW.A0m(r0)
            X.0UO r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            X.JIN r3 = (X.JIN) r3
            if (r3 == 0) goto L37
            int r1 = X.C52168N6x.A00(r3, r2)
            if (r1 < 0) goto L37
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            if (r0 == 0) goto L37
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYY(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
    }
}
