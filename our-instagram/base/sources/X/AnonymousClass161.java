package X;

import java.io.Serializable;

/* renamed from: X.161, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass161 implements AnonymousClass162, AnonymousClass163, Serializable {
    public static final AnonymousClass164 A07 = new AnonymousClass164(" ");
    public InterfaceC912345c A00;
    public InterfaceC912345c A01;
    public C912545e A02;
    public String A03;
    public boolean A04;
    public final AnonymousClass165 A05;
    public transient int A06;

    public AnonymousClass161(AnonymousClass161 anonymousClass161) {
        AnonymousClass165 anonymousClass165 = anonymousClass161.A05;
        this.A00 = C912145a.A00;
        this.A01 = C912445d.A03;
        this.A04 = true;
        this.A00 = anonymousClass161.A00;
        this.A01 = anonymousClass161.A01;
        this.A04 = anonymousClass161.A04;
        this.A06 = anonymousClass161.A06;
        this.A02 = anonymousClass161.A02;
        this.A03 = anonymousClass161.A03;
        this.A05 = anonymousClass165;
    }

    @Override // X.AnonymousClass162
    public final void ADH(AnonymousClass182 anonymousClass182) {
        this.A00.FEY(anonymousClass182, this.A06);
    }

    @Override // X.AnonymousClass162
    public final void ADJ(AnonymousClass182 anonymousClass182) {
        this.A01.FEY(anonymousClass182, this.A06);
    }

    @Override // X.AnonymousClass162
    public final void FEN(AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0e(',');
        this.A00.FEY(anonymousClass182, this.A06);
    }

    @Override // X.AnonymousClass162
    public final void FES(AnonymousClass182 anonymousClass182, int i) {
        InterfaceC912345c interfaceC912345c = this.A00;
        if (!interfaceC912345c.isInline()) {
            this.A06--;
        }
        if (i > 0) {
            interfaceC912345c.FEY(anonymousClass182, this.A06);
        } else {
            anonymousClass182.A0e(' ');
        }
        anonymousClass182.A0e(']');
    }

    @Override // X.AnonymousClass162
    public final void FET(AnonymousClass182 anonymousClass182, int i) {
        InterfaceC912345c interfaceC912345c = this.A01;
        if (!interfaceC912345c.isInline()) {
            this.A06--;
        }
        if (i > 0) {
            interfaceC912345c.FEY(anonymousClass182, this.A06);
        } else {
            anonymousClass182.A0e(' ');
        }
        anonymousClass182.A0e('}');
    }

    @Override // X.AnonymousClass162
    public final void FEc(AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0e(',');
        this.A01.FEY(anonymousClass182, this.A06);
    }

    @Override // X.AnonymousClass162
    public final void FEd(AnonymousClass182 anonymousClass182) {
        if (this.A04) {
            anonymousClass182.A0t(this.A03);
        } else {
            anonymousClass182.A0e(':');
        }
    }

    @Override // X.AnonymousClass162
    public final void FEg(AnonymousClass182 anonymousClass182) {
        AnonymousClass165 anonymousClass165 = this.A05;
        if (anonymousClass165 != null) {
            anonymousClass182.A0m(anonymousClass165);
        }
    }

    @Override // X.AnonymousClass162
    public final void FEk(AnonymousClass182 anonymousClass182) {
        if (!this.A00.isInline()) {
            this.A06++;
        }
        anonymousClass182.A0e('[');
    }

    @Override // X.AnonymousClass162
    public final void FEl(AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0e('{');
        if (!this.A01.isInline()) {
            this.A06++;
        }
    }

    @Override // X.AnonymousClass163
    public final /* bridge */ /* synthetic */ AnonymousClass161 AMQ() {
        Class<?> cls = getClass();
        if (cls == AnonymousClass161.class) {
            return new AnonymousClass161(this);
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Failed `createInstance()`: ", cls.getName(), " does not override method; it has to"));
    }

    public AnonymousClass161() {
        AnonymousClass164 anonymousClass164 = A07;
        this.A00 = C912145a.A00;
        this.A01 = C912445d.A03;
        this.A04 = true;
        this.A05 = anonymousClass164;
        this.A02 = AnonymousClass162.A01;
        this.A03 = AnonymousClass001.A0T(" ", " ", ':');
    }
}
