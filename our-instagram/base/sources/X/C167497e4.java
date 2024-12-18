package X;

/* renamed from: X.7e4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167497e4 extends C0T6 implements InterfaceC166407c9 {
    public final C167987et A00;
    public final CharSequence A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167497e4) {
                C167497e4 c167497e4 = (C167497e4) obj;
                if (!C14360o3.A0K(this.A01, c167497e4.A01) || !C14360o3.A0K(this.A00, c167497e4.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CharSequence charSequence = this.A01;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        C167987et c167987et = this.A00;
        return hashCode + (c167987et != null ? c167987et.hashCode() : 0);
    }

    public C167497e4(C167987et c167987et, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = c167987et;
    }
}
