package X;

/* renamed from: X.76a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1576676a extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq, InterfaceC129555tK {
    public final C162777Qo A00;
    public final C7QY A01;
    public final String A02;

    public C1576676a(C162777Qo c162777Qo, C7QY c7qy, String str) {
        C14360o3.A0B(c7qy, 2);
        this.A02 = str;
        this.A01 = c7qy;
        this.A00 = c162777Qo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1576676a) {
                C1576676a c1576676a = (C1576676a) obj;
                if (!C14360o3.A0K(this.A02, c1576676a.A02) || !C14360o3.A0K(this.A01, c1576676a.A01) || !C14360o3.A0K(this.A00, c1576676a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenericXmaMessageViewModel(id=");
        sb.append(this.A02);
        sb.append(", contentViewModel=");
        sb.append(this.A01);
        sb.append(", commonMessageDecorationsViewModel=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A00;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A01;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
