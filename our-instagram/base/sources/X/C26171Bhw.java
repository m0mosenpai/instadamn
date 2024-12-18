package X;

/* renamed from: X.Bhw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26171Bhw extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C26171Bhw(String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26171Bhw) {
                C26171Bhw c26171Bhw = (C26171Bhw) obj;
                if (!C14360o3.A0K(this.A00, c26171Bhw.A00) || !C14360o3.A0K(this.A01, c26171Bhw.A01) || this.A02 != c26171Bhw.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }
}
