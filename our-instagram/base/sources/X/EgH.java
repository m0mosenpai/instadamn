package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes6.dex */
public final class EgH extends C163787Us implements InterfaceC83733oI {
    public final C83693oE A00;
    public final MsysThreadId A01;

    @Override // X.C163787Us
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EgH) {
                EgH egH = (EgH) obj;
                if (!C14360o3.A0K(this.A00, egH.A00) || !C14360o3.A0K(this.A01, egH.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C163787Us
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public EgH(C83693oE c83693oE, MsysThreadId msysThreadId) {
        super(c83693oE, msysThreadId);
        this.A00 = c83693oE;
        this.A01 = msysThreadId;
    }
}
