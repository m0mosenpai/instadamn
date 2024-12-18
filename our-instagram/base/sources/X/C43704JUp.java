package X;

/* renamed from: X.JUp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43704JUp extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq {
    public final C162777Qo A00;
    public final JUe A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43704JUp) {
                C43704JUp c43704JUp = (C43704JUp) obj;
                if (!C14360o3.A0K(this.A02, c43704JUp.A02) || !C14360o3.A0K(this.A01, c43704JUp.A01) || !C14360o3.A0K(this.A00, c43704JUp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A00;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A01;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02)));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C43704JUp c43704JUp = (C43704JUp) obj;
        if (c43704JUp == null || !C14360o3.A0K(this.A02, c43704JUp.A02)) {
            return false;
        }
        JUe jUe = this.A01;
        JUe jUe2 = c43704JUp.A01;
        C14360o3.A0B(jUe2, 0);
        if (!jUe.equals(jUe2) || !this.A00.equals(c43704JUp.A00)) {
            return false;
        }
        return true;
    }

    public C43704JUp(C162777Qo c162777Qo, JUe jUe, String str) {
        this.A02 = str;
        this.A01 = jUe;
        this.A00 = c162777Qo;
    }
}
