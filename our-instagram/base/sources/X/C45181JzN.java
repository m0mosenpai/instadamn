package X;

/* renamed from: X.JzN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45181JzN extends C0T6 implements InterfaceC66482zP {
    public final String A00;

    public C45181JzN(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45181JzN) && C14360o3.A0K(this.A00, ((C45181JzN) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45181JzN c45181JzN = (C45181JzN) obj;
        C14360o3.A0B(c45181JzN, 0);
        return C14360o3.A0K(this.A00, c45181JzN.A00);
    }
}
