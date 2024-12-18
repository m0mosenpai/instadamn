package X;

/* renamed from: X.K0c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45222K0c extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq, InterfaceC129555tK {
    public final C7QY A00;
    public final String A01;
    public final C162777Qo A02;

    public C45222K0c(C162777Qo c162777Qo, C7QY c7qy, String str) {
        C14360o3.A0B(c7qy, 2);
        this.A01 = str;
        this.A00 = c7qy;
        this.A02 = c162777Qo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45222K0c) {
                C45222K0c c45222K0c = (C45222K0c) obj;
                if (!C14360o3.A0K(this.A01, c45222K0c.A01) || !C14360o3.A0K(this.A00, c45222K0c.A00) || !C14360o3.A0K(this.A02, c45222K0c.A02)) {
                }
            }
            return false;
        }
        return true;
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
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NotesXmaMessageViewModel(id=");
        JQ0.A1U(A1C, this.A01);
        JQ0.A1S(A1C, this.A00);
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
