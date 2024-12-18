package X;

/* renamed from: X.URa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66636URa extends C0T6 implements InterfaceC66482zP {
    public final C51756Mtf A00;
    public final W1R A01;
    public final String A02 = "footer";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66636URa) {
                C66636URa c66636URa = (C66636URa) obj;
                if (!C14360o3.A0K(this.A02, c66636URa.A02) || !C14360o3.A0K(this.A00, c66636URa.A00) || !C14360o3.A0K(this.A01, c66636URa.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C66636URa(C51756Mtf c51756Mtf, W1R w1r) {
        this.A00 = c51756Mtf;
        this.A01 = w1r;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, this.A02.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51756Mtf c51756Mtf;
        C66636URa c66636URa = (C66636URa) obj;
        C51756Mtf c51756Mtf2 = this.A00;
        if (c66636URa != null) {
            c51756Mtf = c66636URa.A00;
        } else {
            c51756Mtf = null;
        }
        return C14360o3.A0K(c51756Mtf2, c51756Mtf);
    }
}
