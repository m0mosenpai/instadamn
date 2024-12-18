package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.util.List;

/* loaded from: classes9.dex */
public final class Mr1 extends C0T6 {
    public final C51585Mqd A00;
    public final UserMonetizationProductType A01;
    public final List A02;
    public final C51760Mtj A03;
    public final C40120Hqn A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Mr1) {
                Mr1 mr1 = (Mr1) obj;
                if (!C14360o3.A0K(this.A03, mr1.A03) || !C14360o3.A0K(this.A02, mr1.A02) || !C14360o3.A0K(this.A04, mr1.A04) || this.A01 != mr1.A01 || !C14360o3.A0K(this.A00, mr1.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public Mr1(C51760Mtj c51760Mtj, C40120Hqn c40120Hqn, C51585Mqd c51585Mqd, UserMonetizationProductType userMonetizationProductType, List list) {
        AbstractC43594JPz.A1P(list, userMonetizationProductType);
        this.A03 = c51760Mtj;
        this.A02 = list;
        this.A04 = c40120Hqn;
        this.A01 = userMonetizationProductType;
        this.A00 = c51585Mqd;
    }
}
