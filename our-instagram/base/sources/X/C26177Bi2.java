package X;

/* renamed from: X.Bi2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26177Bi2 extends C0T6 implements InterfaceC30937Dir {
    public final int A00;
    public final String A01;

    public static C26177Bi2 A00(C5Tl c5Tl, int i) {
        return new C26177Bi2(C5YD.A00(c5Tl, i), 0);
    }

    public C26177Bi2(String str, int i) {
        this.A00 = i;
        C14360o3.A0B(str, 1);
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C26177Bi2) {
            C26177Bi2 c26177Bi2 = (C26177Bi2) obj;
            if (c26177Bi2.A00 != i || !C14360o3.A0K(this.A01, c26177Bi2.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // X.InterfaceC30937Dir
    public final /* bridge */ /* synthetic */ CharSequence BgQ() {
        return this.A01;
    }
}
