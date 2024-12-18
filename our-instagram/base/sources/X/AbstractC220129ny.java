package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC220129ny extends AbstractC162207Oe {
    public final C162237Oh A00;
    public final C162237Oh A01;

    @Override // X.AbstractC162207Oe
    public final boolean A03(C9C9 c9c9) {
        C162237Oh c162237Oh;
        if (!super.A03(c9c9)) {
            return false;
        }
        if (A00(c9c9.A00)) {
            c162237Oh = this.A01;
        } else {
            c162237Oh = this.A00;
        }
        return c162237Oh.A04(c9c9.A01, System.currentTimeMillis());
    }

    public static final boolean A00(String str) {
        String A00;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -672464592) {
                if (hashCode != -420332607) {
                    if (hashCode == 713969956) {
                        A00 = "direct_v2_like";
                    } else {
                        return false;
                    }
                } else {
                    A00 = AbstractC43591JPw.A00(344);
                }
                if (!str.equals(A00)) {
                    return false;
                }
                return true;
            }
            if (!str.equals(AbstractC43591JPw.A00(345))) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC162207Oe
    public final void A01(C9C9 c9c9) {
        C162237Oh c162237Oh;
        if (A00(c9c9.A00)) {
            c162237Oh = this.A01;
        } else {
            c162237Oh = this.A00;
        }
        c162237Oh.A03(c9c9.A01, System.currentTimeMillis());
    }

    @Override // X.AbstractC162207Oe
    public final void A02(C9C9 c9c9) {
        C162237Oh c162237Oh = this.A00;
        String str = c9c9.A01;
        c162237Oh.A02(str);
        this.A01.A02(str);
    }

    public AbstractC220129ny(UserSession userSession, C162237Oh c162237Oh, C162237Oh c162237Oh2) {
        super(userSession);
        this.A01 = c162237Oh;
        this.A00 = c162237Oh2;
    }
}
