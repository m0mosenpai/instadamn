package X;

/* renamed from: X.79a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1584079a extends AbstractC1584179b {
    public final C1585879t A00;
    public final AnonymousClass781 A01;
    public final AnonymousClass781 A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584079a(C1585879t c1585879t, AnonymousClass781 anonymousClass781, AnonymousClass781 anonymousClass7812, String str) {
        super(c1585879t, anonymousClass781, anonymousClass7812);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(anonymousClass781, 2);
        C14360o3.A0B(c1585879t, 4);
        this.A03 = str;
        this.A02 = anonymousClass781;
        this.A01 = anonymousClass7812;
        this.A00 = c1585879t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1584079a) {
                C1584079a c1584079a = (C1584079a) obj;
                if (!C14360o3.A0K(this.A03, c1584079a.A03) || !C14360o3.A0K(this.A02, c1584079a.A02) || !C14360o3.A0K(this.A01, c1584079a.A01) || !C14360o3.A0K(this.A00, c1584079a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31;
        AnonymousClass781 anonymousClass781 = this.A01;
        return ((hashCode + (anonymousClass781 == null ? 0 : anonymousClass781.hashCode())) * 31) + this.A00.hashCode();
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

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
