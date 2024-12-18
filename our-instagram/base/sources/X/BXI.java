package X;

/* loaded from: classes5.dex */
public final class BXI extends C58J implements C5DX, InterfaceC1130758u, InterfaceC1129458d {
    public C5ES A00;
    public boolean A01;

    @Override // X.C5DX
    public final /* synthetic */ boolean COp() {
        return false;
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean Ehx() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.C5DX
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void E0S() {
        if (this.A01) {
            this.A01 = false;
            if (this.A08) {
                C15370ps A1F = AbstractC25225BEi.A1F();
                BFZ.A02(this, DRU.A00(A1F, 27));
                BXI bxi = (BXI) A1F.A00;
                if (bxi != null) {
                    A01(bxi);
                    return;
                }
                C5EO c5eo = (C5EO) C5Zy.A00(C5V2.A08, this);
                if (c5eo == null) {
                    return;
                }
                c5eo.EVt(null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0oO, java.lang.Object] */
    @Override // X.C5DX
    public final void DZQ(C6KW c6kw, EnumC25334BJd enumC25334BJd, long j) {
        if (enumC25334BJd == EnumC25334BJd.Main) {
            int i = c6kw.A00;
            if (i == 4) {
                this.A01 = true;
                ?? obj = new Object();
                obj.A00 = true;
                BFZ.A03(this, DRU.A00(obj, 28));
                if (obj.A00) {
                    A01(this);
                    return;
                }
                return;
            }
            if (i != 5) {
                return;
            }
            E0S();
        }
    }

    public static final void A01(BXI bxi) {
        C5ES c5es;
        C15370ps A1F = AbstractC25225BEi.A1F();
        BFZ.A02(bxi, DRU.A00(A1F, 30));
        BXI bxi2 = (BXI) A1F.A00;
        if (bxi2 == null || (c5es = bxi2.A00) == null) {
            c5es = bxi.A00;
        }
        C5EO c5eo = (C5EO) C5Zy.A00(C5V2.A08, bxi);
        if (c5eo != null) {
            c5eo.EVt(c5es);
        }
    }

    @Override // X.C58J
    public final void A0E() {
        E0S();
    }

    @Override // X.InterfaceC1130758u
    public final /* bridge */ /* synthetic */ Object CAp() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // X.C5DX
    /* renamed from: D1u */
    public final void E0S() {
        E0S();
    }
}
