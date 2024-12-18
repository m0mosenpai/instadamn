package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.NJc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52458NJc extends AbstractC55082Oac {
    public C47Z A00;
    public final UserSession A01;
    public final AnonymousClass841 A02;
    public final InterfaceC189598ae A03;
    public final Queue A04;
    public final C05A A05;
    public final C0UO A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C52458NJc(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass841 anonymousClass841) {
        super(userSession);
        C47Z c47z;
        String E3z;
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A02 = anonymousClass841;
        this.A03 = (InterfaceC189598ae) fragmentActivity;
        if (C18U.A06(C06090Tz.A05, userSession, 36323436070513903L)) {
            if (anonymousClass841.CPp()) {
                E3z = ((MX5) anonymousClass841).A01.A0C;
            } else {
                E3z = anonymousClass841.E3z();
            }
            c47z = AbstractC43593JPy.A0h(this.A01, E3z);
        } else {
            c47z = null;
        }
        this.A00 = c47z;
        C008002u A00 = C10E.A00(C193588hd.A00);
        this.A05 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        this.A04 = new LinkedList();
    }

    public final C47Z A04() {
        C47Z c47z = this.A00;
        if (c47z != null) {
            return c47z;
        }
        throw AbstractC166997dE.A0g();
    }

    public final boolean A05() {
        String E3z;
        UserSession userSession = this.A01;
        if (!C18U.A06(C06090Tz.A05, userSession, 36323436070513903L)) {
            AnonymousClass841 anonymousClass841 = this.A02;
            if (anonymousClass841.CPp()) {
                E3z = ((MX5) anonymousClass841).A01.A0C;
            } else {
                E3z = anonymousClass841.E3z();
            }
            this.A00 = AbstractC43593JPy.A0h(userSession, E3z);
        }
        return AbstractC167007dF.A1W(this.A00);
    }
}
