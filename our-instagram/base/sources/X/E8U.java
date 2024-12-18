package X;

/* loaded from: classes6.dex */
public final class E8U extends C0T6 implements InterfaceC66482zP {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E8U) && C14360o3.A0K(this.A00, ((E8U) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public E8U(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
