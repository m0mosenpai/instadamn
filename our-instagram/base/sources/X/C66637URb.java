package X;

/* renamed from: X.URb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66637URb extends C0T6 implements InterfaceC66482zP {
    public final C51760Mtj A00;
    public final W1S A01;
    public final String A02 = "header";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66637URb) {
                C66637URb c66637URb = (C66637URb) obj;
                if (!C14360o3.A0K(this.A02, c66637URb.A02) || !C14360o3.A0K(this.A00, c66637URb.A00) || !C14360o3.A0K(this.A01, c66637URb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C66637URb(C51760Mtj c51760Mtj, W1S w1s) {
        this.A00 = c51760Mtj;
        this.A01 = w1s;
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
        C51760Mtj c51760Mtj;
        C66637URb c66637URb = (C66637URb) obj;
        C51760Mtj c51760Mtj2 = this.A00;
        if (c66637URb != null) {
            c51760Mtj = c66637URb.A00;
        } else {
            c51760Mtj = null;
        }
        return C14360o3.A0K(c51760Mtj2, c51760Mtj);
    }
}
