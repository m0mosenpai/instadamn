package X;

/* renamed from: X.Jza, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45194Jza extends C0T6 implements InterfaceC66482zP {
    public boolean A00;
    public final C148286ly A01;

    public C45194Jza(C148286ly c148286ly) {
        C14360o3.A0B(c148286ly, 1);
        this.A01 = c148286ly;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45194Jza) && C14360o3.A0K(this.A01, ((C45194Jza) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A01.A0S;
        C14360o3.A07(str);
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
