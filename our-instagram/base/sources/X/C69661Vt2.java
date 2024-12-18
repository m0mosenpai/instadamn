package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.Vt2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69661Vt2 {
    public final float A00;
    public final Context A01;
    public final UserSession A02;
    public final DirectShareTarget A03;
    public final User A04;
    public final C69759Vuw A05;
    public final C67877V0i A06;
    public final XEG A07;
    public final C67844UzI A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final String A00(String str) {
        int i;
        if ("evidence_confirmation".equals(str)) {
            boolean A08 = AbstractC35261Fgv.A08(this.A02, this.A03, this.A04, this.A0D);
            boolean z = this.A0E;
            Context context = this.A01;
            if (A08) {
                i = 2131962943;
                if (z) {
                    i = 2131962944;
                }
            } else {
                i = 2131962947;
                if (z) {
                    i = 2131962948;
                }
            }
            return context.getString(i);
        }
        ILV ilv = this.A08.A00().A0F;
        if (ilv != null) {
            return ilv.A00;
        }
        return null;
    }

    public C69661Vt2(Context context, UserSession userSession, DirectShareTarget directShareTarget, User user, C69759Vuw c69759Vuw, C67877V0i c67877V0i, XEG xeg, C67844UzI c67844UzI, String str, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = c67877V0i;
        this.A01 = context;
        this.A04 = user;
        this.A08 = c67844UzI;
        this.A03 = directShareTarget;
        this.A02 = userSession;
        this.A07 = xeg;
        this.A09 = str;
        this.A05 = c69759Vuw;
        this.A0C = z;
        this.A00 = f;
        this.A0D = z2;
        this.A0A = c67844UzI.A00().A0H;
        this.A0B = z3;
        this.A0E = z4;
    }
}
