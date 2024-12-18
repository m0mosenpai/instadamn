package X;

/* loaded from: classes6.dex */
public final class E8V extends C0T6 implements InterfaceC66482zP {
    public final String A00;

    public E8V(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E8V) && C14360o3.A0K(this.A00, ((E8V) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        E8V e8v = (E8V) obj;
        String str2 = this.A00;
        if (e8v != null) {
            str = e8v.A00;
        } else {
            str = null;
        }
        return C14360o3.A0K(str2, str);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }
}
