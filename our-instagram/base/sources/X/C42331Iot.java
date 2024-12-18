package X;

/* renamed from: X.Iot, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42331Iot implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C41181vS A03;
    public final String A04;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A01);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42331Iot c42331Iot = (C42331Iot) obj;
        if (AbstractC50102Ry.A00(this.A04, c42331Iot.A04) && this.A00 == c42331Iot.A00) {
            return true;
        }
        return false;
    }

    public C42331Iot(JL7 jl7, C41181vS c41181vS, int i) {
        this.A03 = c41181vS;
        this.A01 = jl7.getName().hashCode();
        this.A04 = jl7.getValue();
        this.A00 = jl7.getCount();
        this.A02 = i;
    }
}
