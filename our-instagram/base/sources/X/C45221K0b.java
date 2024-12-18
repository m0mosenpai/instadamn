package X;

/* renamed from: X.K0b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45221K0b extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq, InterfaceC129555tK {
    public final C7QY A00;
    public final C1576676a A01;
    public final C162777Qo A02;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45221K0b) && C14360o3.A0K(this.A01, ((C45221K0b) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A02;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A02;
    }

    public C45221K0b(C1576676a c1576676a) {
        this.A01 = c1576676a;
        this.A00 = c1576676a.A01;
        this.A02 = c1576676a.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LayeredXmaMessageViewModel(model=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
