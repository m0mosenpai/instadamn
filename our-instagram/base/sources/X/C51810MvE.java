package X;

/* renamed from: X.MvE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51810MvE extends C0T6 implements InterfaceC66482zP {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51810MvE) && C14360o3.A0K(this.A00, ((C51810MvE) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public C51810MvE(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
