package X;

/* renamed from: X.JzQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45184JzQ extends C0T6 implements InterfaceC66482zP {
    public final String A00;

    public C45184JzQ(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45184JzQ) && C14360o3.A0K(this.A00, ((C45184JzQ) obj).A00));
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
        return AbstractC31180DnO.A1X(obj, this);
    }
}
