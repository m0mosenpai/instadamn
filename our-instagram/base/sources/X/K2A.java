package X;

/* loaded from: classes8.dex */
public final class K2A extends C0T6 implements InterfaceC66482zP, C7VC {
    public final int A00;
    public final CharSequence A01;
    public final String A02;

    public K2A(String str, CharSequence charSequence, int i) {
        C14360o3.A0B(charSequence, 1);
        this.A01 = charSequence;
        this.A02 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2A) {
                K2A k2a = (K2A) obj;
                if (!C14360o3.A0K(this.A01, k2a.A01) || !C14360o3.A0K(this.A02, k2a.A02) || this.A00 != k2a.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.C7VC
    public final int getType() {
        return 187;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A01)) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        CharSequence charSequence;
        K2A k2a = (K2A) obj;
        String obj2 = this.A01.toString();
        if (k2a != null && (charSequence = k2a.A01) != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        if (C14360o3.A0K(obj2, str) && C14360o3.A0K(this.A02, k2a.A02)) {
            return true;
        }
        return false;
    }
}
