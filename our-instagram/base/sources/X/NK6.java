package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class NK6 extends OX6 {
    public final C52458NJc A00;
    public final C05A A01;
    public final C0UO A02;
    public final boolean A03;
    public final UserSession A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NK6(UserSession userSession, C52458NJc c52458NJc, boolean z) {
        super(c52458NJc);
        AbstractC167017dG.A1P(c52458NJc, userSession);
        this.A00 = c52458NJc;
        this.A04 = userSession;
        this.A03 = z;
        C008002u A1H = AbstractC25225BEi.A1H(new C51758Mth((EnumC76383bi) null, (DefaultConstructorMarker) null, 3, 15, false));
        this.A01 = A1H;
        this.A02 = A1H;
    }

    public final C65782Tu0 A08(boolean z) {
        int i;
        C54632OBh c54632OBh;
        if (AbstractC55179Odk.A02(A04())) {
            i = 2131970047;
        } else if (z) {
            i = 2131963005;
        } else {
            C51754Mtd A04 = A04();
            C14360o3.A0B(A04, 0);
            C50627MWo c50627MWo = A04.A03;
            if (c50627MWo != null && (c54632OBh = (C54632OBh) c50627MWo.A01) != null && AbstractC166987dD.A1b(c54632OBh.A02)) {
                i = 2131969309;
            } else if (this.A03) {
                i = 2131961929;
            } else {
                return null;
            }
        }
        return new C65782Tu0(i, 2131955279);
    }
}
