package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.session.AbstractValueResolverImpl;
import java.util.List;

/* renamed from: X.Ek5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33160Ek5 extends AbstractC55145Od4 {
    public final C0tH A00;
    public final boolean A01;

    @Override // X.AbstractC55145Od4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33160Ek5) {
                C33160Ek5 c33160Ek5 = (C33160Ek5) obj;
                if (!C14360o3.A0K(this.A00, c33160Ek5.A00) || this.A01 != c33160Ek5.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC55145Od4
    public final Object A07(UserSession userSession, AbstractValueResolverImpl abstractValueResolverImpl, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A01;
        C0tH c0tH = this.A00;
        if (z) {
            return c0tH.A01(userSession);
        }
        return c0tH.A00(userSession);
    }

    @Override // X.AbstractC55145Od4
    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C33160Ek5(C0tH c0tH, boolean z) {
        this.A00 = c0tH;
        this.A01 = z;
    }

    @Override // X.AbstractC55145Od4
    public final InterfaceC37109GWu A05() {
        return GGY.A00;
    }

    @Override // X.AbstractC55145Od4
    public final List A08() {
        return C16930sl.A00;
    }

    @Override // X.AbstractC55145Od4
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append(": { ");
        C0tH c0tH = this.A00;
        A1C.append(c0tH.getConfigKey());
        A1C.append(", ");
        A1C.append(c0tH.getParamKey());
        return AbstractC166997dE.A0x(" }", A1C);
    }
}
