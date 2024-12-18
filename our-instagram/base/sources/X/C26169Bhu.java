package X;

/* renamed from: X.Bhu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26169Bhu extends C0T6 implements InterfaceC66482zP {
    public final C7IM A00;
    public final String A01;

    public C26169Bhu(C7IM c7im, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c7im;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26169Bhu) {
                C26169Bhu c26169Bhu = (C26169Bhu) obj;
                if (!C14360o3.A0K(this.A01, c26169Bhu.A01) || !C14360o3.A0K(this.A00, c26169Bhu.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
