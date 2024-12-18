package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class D4w extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 2;
    public final int A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4w(Context context, InterfaceC23621Ds interfaceC23621Ds, C05A c05a, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A06 = c05a;
        this.A05 = context;
        this.A02 = z;
        this.A04 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A03) {
            case 0:
                C05A c05a = (C05A) this.A06;
                return new D4w((Context) this.A05, interfaceC23621Ds, c05a, this.A04, this.A02);
            case 1:
                return new D4w((C38687GzS) this.A05, (C38687GzS) this.A06, (C25808BbP) this.A01, interfaceC23621Ds, this.A04, this.A02);
            default:
                D4w d4w = new D4w((C26136BhN) this.A06, (C26897Bty) this.A01, interfaceC23621Ds, (C05A) this.A05, this.A04);
                d4w.A02 = AbstractC166987dD.A1a(obj);
                return d4w;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r5.A07 != com.instagram.api.schemas.MidCardLayoutType.A05) goto L16;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D4w) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4w(C38687GzS c38687GzS, C38687GzS c38687GzS2, C25808BbP c25808BbP, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = c25808BbP;
        this.A04 = i;
        this.A05 = c38687GzS;
        this.A06 = c38687GzS2;
        this.A02 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4w(C26136BhN c26136BhN, C26897Bty c26897Bty, InterfaceC23621Ds interfaceC23621Ds, C05A c05a, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = c26136BhN;
        this.A04 = i;
        this.A01 = c26897Bty;
        this.A05 = c05a;
    }
}
