package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72973Oy extends C3OO {
    public C3PL A00;
    public C140626Xq A01;
    public C72983Oz A02;
    public C3PF A03;
    public boolean A04;
    public final C3P1 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72973Oy(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = new C72983Oz(view);
        this.A05 = new C3P0(view);
    }

    public final C3PF A00(final UserSession userSession, boolean z) {
        C72983Oz c72983Oz;
        View view;
        C3PF c3pf = this.A03;
        if (c3pf == null || this.A04 != z) {
            if (!z || (view = (c72983Oz = this.A02).A02) == null) {
                c72983Oz = this.A02;
                view = c72983Oz.A05;
            }
            if (view != null) {
                View A00 = c72983Oz.A00();
                C14360o3.A0B(A00, 1);
                C3P9 c3p9 = new C3P9(view);
                c3p9.A01(A00);
                c3p9.A0D = true;
                c3p9.A07 = true;
                boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36327271476246992L);
                c3p9.A0C = A06;
                if (A06) {
                    c3p9.A08 = false;
                    c3p9.A07 = false;
                    c3p9.A0B = false;
                }
                c3p9.A04 = new C3PD() { // from class: X.3PC
                    @Override // X.C3PD, X.C3PE
                    public final void DQY(View view2) {
                        String str;
                        C72973Oy c72973Oy = this;
                        C3PL c3pl = c72973Oy.A00;
                        if (c3pl != null && (str = c72973Oy.A02.A01) != null) {
                            c3pl.Ddt(str);
                        }
                    }

                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view2) {
                        String str;
                        C18U.A06(C06090Tz.A05, UserSession.this, 36327271476246992L);
                        C72973Oy c72973Oy = this;
                        C3PL c3pl = c72973Oy.A00;
                        if (c3pl != null && (str = c72973Oy.A02.A01) != null) {
                            c3pl.De2(str);
                            return true;
                        }
                        return false;
                    }
                };
                c3pf = c3p9.A00();
                this.A03 = c3pf;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A04 = z;
        C14360o3.A0A(c3pf);
        return c3pf;
    }
}
