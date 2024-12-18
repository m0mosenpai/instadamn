package X;

/* loaded from: classes8.dex */
public final class KVG extends AbstractC1584179b {
    public final C1585879t A00;
    public final AnonymousClass781 A01;
    public final AnonymousClass781 A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KVG) {
                KVG kvg = (KVG) obj;
                if (!C14360o3.A0K(this.A03, kvg.A03) || !C14360o3.A0K(this.A02, kvg.A02) || !C14360o3.A0K(this.A01, kvg.A01) || !C14360o3.A0K(this.A00, kvg.A00)) {
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
    public KVG(C1585879t c1585879t, AnonymousClass781 anonymousClass781, AnonymousClass781 anonymousClass7812, String str) {
        super(c1585879t, anonymousClass781, anonymousClass7812);
        AbstractC25234BEr.A1P(str, anonymousClass781, c1585879t);
        this.A03 = str;
        this.A02 = anonymousClass781;
        this.A01 = anonymousClass7812;
        this.A00 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
