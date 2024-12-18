package X;

/* renamed from: X.MdV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50838MdV extends AbstractC55550Olk {
    public AbstractC58374PuE A00;
    public boolean A01 = false;
    public final AbstractC58374PuE A02;

    public final AbstractC58374PuE A00() {
        if (!this.A01) {
            AbstractC58374PuE abstractC58374PuE = this.A00;
            C58378PuI.A02.A00(abstractC58374PuE.getClass()).Cmk(abstractC58374PuE);
            this.A01 = true;
        }
        return this.A00;
    }

    public final void A01() {
        if (this.A01) {
            AbstractC58374PuE abstractC58374PuE = (AbstractC58374PuE) this.A00.A03(C05F.A0N, null, null);
            C58378PuI.A02.A00(abstractC58374PuE.getClass()).CpL(abstractC58374PuE, this.A00);
            this.A00 = abstractC58374PuE;
            this.A01 = false;
        }
    }

    @Override // X.InterfaceC65300ThY
    public final /* bridge */ /* synthetic */ AbstractC58374PuE AwG() {
        return this.A02;
    }

    @Override // X.AbstractC55550Olk
    public final /* bridge */ /* synthetic */ Object clone() {
        AbstractC50838MdV abstractC50838MdV = (AbstractC50838MdV) this.A02.A03(C05F.A0Y, null, null);
        abstractC50838MdV.A02(A00());
        return abstractC50838MdV;
    }

    public AbstractC50838MdV(AbstractC58374PuE abstractC58374PuE) {
        this.A02 = abstractC58374PuE;
        this.A00 = (AbstractC58374PuE) abstractC58374PuE.A03(C05F.A0N, null, null);
    }

    public final void A02(AbstractC58374PuE abstractC58374PuE) {
        A01();
        AbstractC58374PuE abstractC58374PuE2 = this.A00;
        C58378PuI.A02.A00(abstractC58374PuE2.getClass()).CpL(abstractC58374PuE2, abstractC58374PuE);
    }
}
