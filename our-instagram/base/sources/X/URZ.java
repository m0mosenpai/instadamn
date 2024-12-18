package X;

/* loaded from: classes11.dex */
public final class URZ extends C0T6 implements InterfaceC66482zP {
    public final C50627MWo A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URZ) {
                URZ urz = (URZ) obj;
                if (!C14360o3.A0K(this.A01, urz.A01) || !C14360o3.A0K(this.A00, urz.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C50627MWo c50627MWo;
        URZ urz = (URZ) obj;
        C50627MWo c50627MWo2 = this.A00;
        if (urz != null) {
            c50627MWo = urz.A00;
        } else {
            c50627MWo = null;
        }
        return C14360o3.A0K(c50627MWo2, c50627MWo);
    }

    public URZ(C50627MWo c50627MWo, String str) {
        this.A01 = str;
        this.A00 = c50627MWo;
    }
}
