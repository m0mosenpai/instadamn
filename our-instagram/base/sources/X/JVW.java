package X;

/* loaded from: classes8.dex */
public final class JVW extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq {
    public final JVV A00;
    public final C162777Qo A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JVW) {
                JVW jvw = (JVW) obj;
                if (!C14360o3.A0K(this.A00, jvw.A00) || !C14360o3.A0K(this.A01, jvw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A01;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A06;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public JVW(C162777Qo c162777Qo, JVV jvv) {
        this.A00 = jvv;
        this.A01 = c162777Qo;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
