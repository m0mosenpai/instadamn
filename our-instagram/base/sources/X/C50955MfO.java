package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MfO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50955MfO extends AbstractC52922bZ {
    public final C2GT A00;
    public final XIGIGBoostCallToAction A01;
    public final C70399WUb A02;
    public final UserSession A03;
    public final String A04;
    public final List A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;
    public final boolean A09;
    public final C53856Nrk A0A;

    public C50955MfO(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, C70399WUb c70399WUb, C53856Nrk c53856Nrk, UserSession userSession, String str, boolean z) {
        EnumC53276NhE[] enumC53276NhEArr;
        EnumC53276NhE enumC53276NhE;
        List A1Q;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(xIGIGBoostDestination, 2);
        C14360o3.A0B(str, 3);
        C14360o3.A0B(xIGIGBoostCallToAction, 4);
        AbstractC167017dG.A1U(c70399WUb, c53856Nrk);
        this.A03 = userSession;
        this.A04 = str;
        this.A01 = xIGIGBoostCallToAction;
        this.A09 = z;
        this.A02 = c70399WUb;
        this.A0A = c53856Nrk;
        C24721Ip A0q = MSX.A0q();
        this.A06 = A0q;
        this.A07 = AbstractC07080Za.A03(A0q);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A08 = A1A;
        this.A00 = AbstractC31172DnG.A0E(A1A);
        int ordinal = xIGIGBoostDestination.ordinal();
        if (ordinal != 12) {
            if (ordinal != 4) {
                if (ordinal != 10) {
                    A1Q = C16930sl.A00;
                    this.A05 = A1Q;
                } else {
                    enumC53276NhEArr = new EnumC53276NhE[3];
                    enumC53276NhEArr[0] = EnumC53276NhE.A06;
                    enumC53276NhE = EnumC53276NhE.A08;
                }
            } else {
                enumC53276NhEArr = new EnumC53276NhE[]{EnumC53276NhE.A06, EnumC53276NhE.A09, EnumC53276NhE.A07, EnumC53276NhE.A0A};
                A1Q = AbstractC16960so.A1Q(enumC53276NhEArr);
                this.A05 = A1Q;
            }
        } else {
            enumC53276NhEArr = new EnumC53276NhE[3];
            enumC53276NhEArr[0] = EnumC53276NhE.A06;
            enumC53276NhE = EnumC53276NhE.A09;
        }
        enumC53276NhEArr[1] = enumC53276NhE;
        enumC53276NhEArr[2] = EnumC53276NhE.A0A;
        A1Q = AbstractC16960so.A1Q(enumC53276NhEArr);
        this.A05 = A1Q;
    }
}
