package X;

/* renamed from: X.6wA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154016wA extends C4F4 {
    public final C51756Mtf A00;
    public final C9JH A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C154016wA) {
                C154016wA c154016wA = (C154016wA) obj;
                if (!C14360o3.A0K(this.A01, c154016wA.A01) || !C14360o3.A0K(this.A00, c154016wA.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C9JH c9jh;
        C154016wA c154016wA = (C154016wA) obj;
        C9JH c9jh2 = this.A01;
        C51756Mtf c51756Mtf = null;
        if (c154016wA != null) {
            c9jh = c154016wA.A01;
        } else {
            c9jh = null;
        }
        if (C14360o3.A0K(c9jh2, c9jh)) {
            C51756Mtf c51756Mtf2 = this.A00;
            if (c154016wA != null) {
                c51756Mtf = c154016wA.A00;
            }
            if (C14360o3.A0K(c51756Mtf2, c51756Mtf)) {
                return true;
            }
        }
        return false;
    }

    public C154016wA(C51756Mtf c51756Mtf, C9JH c9jh) {
        this.A01 = c9jh;
        this.A00 = c51756Mtf;
    }
}
