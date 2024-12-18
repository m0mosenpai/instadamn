package X;

/* renamed from: X.Jzn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45207Jzn extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final InterfaceC186088Nc A01;
    public final C148286ly A02;
    public final String A03;

    public C45207Jzn(InterfaceC186088Nc interfaceC186088Nc, C148286ly c148286ly, String str, int i) {
        C14360o3.A0B(c148286ly, 2);
        this.A00 = i;
        this.A02 = c148286ly;
        this.A03 = str;
        this.A01 = interfaceC186088Nc;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45207Jzn) {
                C45207Jzn c45207Jzn = (C45207Jzn) obj;
                if (this.A00 != c45207Jzn.A00 || !C14360o3.A0K(this.A02, c45207Jzn.A02) || !C14360o3.A0K(this.A03, c45207Jzn.A03) || !C14360o3.A0K(this.A01, c45207Jzn.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A02.A0S;
        C14360o3.A07(str);
        return str;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (AbstractC166997dE.A0J(this.A02, this.A00 * 31) + AbstractC167017dG.A0O(this.A03)) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45207Jzn c45207Jzn = (C45207Jzn) obj;
        C14360o3.A0B(c45207Jzn, 0);
        return C14360o3.A0K(this.A02.A0H, c45207Jzn.A02.A0H);
    }
}
