package X;

/* renamed from: X.Bi3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26178Bi3 extends C0T6 implements InterfaceC30937Dir {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26178Bi3) {
                C26178Bi3 c26178Bi3 = (C26178Bi3) obj;
                if (!C14360o3.A0K(this.A00, c26178Bi3.A00) || !C14360o3.A0K(this.A01, c26178Bi3.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C26178Bi3(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public static C26178Bi3 A00(C5Tl c5Tl, String str, int i) {
        return new C26178Bi3(str, C5YD.A00(c5Tl, i));
    }

    @Override // X.InterfaceC30937Dir
    public final /* bridge */ /* synthetic */ CharSequence BgQ() {
        return this.A00;
    }
}
