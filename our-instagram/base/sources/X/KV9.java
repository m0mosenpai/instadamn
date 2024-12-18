package X;

/* loaded from: classes8.dex */
public final class KV9 extends C76P {
    public final C1585879t A00;
    public final C129535tI A01;
    public final AnonymousClass781 A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KV9) {
                KV9 kv9 = (KV9) obj;
                if (!C14360o3.A0K(this.A03, kv9.A03) || !C14360o3.A0K(this.A02, kv9.A02) || !C14360o3.A0K(this.A01, kv9.A01) || !C14360o3.A0K(this.A00, kv9.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArH() {
        return this.A01;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC162787Qp ArQ() {
        return this.A00;
    }

    @Override // X.AnonymousClass782
    public final String Arl() {
        return this.A04;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK Bn9() {
        return this.A02;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0M(this.A01)) * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KV9(C1585879t c1585879t, C129535tI c129535tI, AnonymousClass781 anonymousClass781, String str) {
        super(c1585879t, c129535tI, anonymousClass781);
        AbstractC25234BEr.A1P(str, anonymousClass781, c1585879t);
        this.A03 = str;
        this.A02 = anonymousClass781;
        this.A01 = c129535tI;
        this.A00 = c1585879t;
        this.A04 = anonymousClass781.A05;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
