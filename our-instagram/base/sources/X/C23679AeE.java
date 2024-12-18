package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.AeE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23679AeE implements InterfaceC25177BCa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C23679AeE(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i2;
        this.A06 = obj4;
        this.A01 = i;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
        this.A04 = obj5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        C218109ki c218109ki;
        User user;
        Object obj;
        switch (this.A00) {
            case 0:
                C218049kc c218049kc = (C218049kc) this.A06;
                if (c218049kc.A00 != this.A01) {
                    return;
                }
                C88Y c88y = c218049kc.A09;
                if (!c88y.A0L(c218049kc)) {
                    return;
                }
                c88y.A0F(((Medium) this.A05).A0H);
                C148276lx c148276lx = C148276lx.A0a;
                C148276lx A00 = AbstractC148296lz.A00();
                Drawable drawable = (Drawable) this.A03;
                c88y.A0B(drawable, (C5GJ) this.A02, A00, c218049kc.A0B, true, true);
                Context context = c218049kc.A05;
                C38321qM c38321qM = (C38321qM) this.A04;
                User A2E = c38321qM.A2E(c218049kc.A07);
                if (A2E != null) {
                    String id = c38321qM.getId();
                    if (id != null) {
                        C14360o3.A0B(context, 1);
                        Resources resources = context.getResources();
                        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
                        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
                        int A0A = AbstractC166997dE.A0A(resources);
                        C202668xk c202668xk = new C202668xk(context, null, null, A2E, null, id, A0A, A0A, dimensionPixelSize, dimensionPixelSize2, A0A, false);
                        c218049kc.A03 = c202668xk;
                        C23108AGw c23108AGw = c218049kc.A0A;
                        c23108AGw.A06 = new C221619qQ(drawable.getBounds());
                        C88Y.A01(c202668xk, c88y, c23108AGw, false);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 1:
                ((C5RP) this.A04).EFh(this);
                c218109ki = (C218109ki) this.A02;
                UserSession userSession = c218109ki.A09;
                if (C18U.A06(C06090Tz.A05, userSession, 36330720335709168L)) {
                    C11T.A02(new Runnable() { // from class: X.Aqt
                        @Override // java.lang.Runnable
                        public final void run() {
                            C218109ki c218109ki2 = (C218109ki) C23679AeE.this.A02;
                            c218109ki2.A0B.A08(c218109ki2.A02);
                        }
                    });
                } else {
                    c218109ki.A0B.A08(c218109ki.A02);
                }
                C88Y c88y2 = c218109ki.A0B;
                Context context2 = c218109ki.A07;
                user = (User) this.A06;
                c88y2.A0C(AbstractC23023ADf.A00(context2, userSession, user, C218109ki.A00(c218109ki).A01), c218109ki.A0G, false);
                AA0 A002 = C88Y.A00(c88y2, (C38321qM) this.A03);
                A002.A00 = c218109ki.A01;
                c218109ki.A04.add(A002);
                obj = this.A05;
                C218109ki.A03(c218109ki, user, (List) obj, this.A01 + 1);
                return;
            default:
                C216239hg c216239hg = (C216239hg) this.A05;
                c216239hg.EFh(this);
                c218109ki = (C218109ki) this.A02;
                C88Y c88y3 = c218109ki.A0B;
                UserSession userSession2 = c218109ki.A09;
                Context context3 = c218109ki.A07;
                user = (User) this.A06;
                c88y3.A0C(AbstractC23023ADf.A00(context3, userSession2, user, C218109ki.A00(c218109ki).A01), c218109ki.A0G, true);
                c88y3.A0C(c216239hg, AMV.A04(c218109ki.A0A), false);
                AA0 A003 = C88Y.A00(c88y3, (C38321qM) this.A03);
                A003.A00 = c218109ki.A01;
                c218109ki.A04.add(A003);
                obj = this.A04;
                C218109ki.A03(c218109ki, user, (List) obj, this.A01 + 1);
                return;
        }
    }

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }
}
