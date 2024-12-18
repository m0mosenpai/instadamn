package X;

/* renamed from: X.WkY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70929WkY implements InterfaceC37200GaB {
    public final /* synthetic */ V1R A00;

    public C70929WkY(V1R v1r) {
        this.A00 = v1r;
    }

    @Override // X.InterfaceC37200GaB
    public final EnumC68206VFy Av9() {
        C68034V7f c68034V7f = this.A00.A08;
        if (c68034V7f == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        EnumC68206VFy enumC68206VFy = c68034V7f.A00;
        C14360o3.A07(enumC68206VFy);
        return enumC68206VFy;
    }

    @Override // X.InterfaceC37200GaB
    public final int AvA() {
        C68034V7f c68034V7f = this.A00.A08;
        if (c68034V7f == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        return c68034V7f.A05();
    }

    @Override // X.InterfaceC37200GaB
    public final int B6r() {
        C65823Tug c65823Tug = this.A00.A07;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        C3FQ c3fq = c65823Tug.A06;
        if (c3fq != null) {
            return c3fq.B6q();
        }
        return -1;
    }

    @Override // X.InterfaceC37200GaB
    public final int BM5() {
        C65823Tug c65823Tug = this.A00.A07;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        C3FQ c3fq = c65823Tug.A06;
        if (c3fq != null) {
            return c3fq.BM3();
        }
        return -1;
    }
}
