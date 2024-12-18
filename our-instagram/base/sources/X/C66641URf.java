package X;

/* renamed from: X.URf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66641URf extends C0T6 implements InterfaceC129555tK {
    public final C62519SEv A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66641URf) {
                C66641URf c66641URf = (C66641URf) obj;
                if (!C14360o3.A0K(this.A01, c66641URf.A01) || !C14360o3.A0K(this.A00, c66641URf.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + AbstractC167017dG.A0M(this.A00);
    }

    public C66641URf(C62519SEv c62519SEv, String str) {
        this.A01 = str;
        this.A00 = c62519SEv;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
