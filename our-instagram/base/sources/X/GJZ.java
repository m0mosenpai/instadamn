package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GJZ implements InterfaceC31002Dk1 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C36354G2g A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    @Override // X.InterfaceC31002Dk1
    public final void onFailure(Throwable th) {
    }

    public GJZ(Activity activity, UserSession userSession, C36354G2g c36354G2g, String str, boolean z) {
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A00 = activity;
        this.A02 = c36354G2g;
    }

    @Override // X.InterfaceC31002Dk1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        long j;
        EnumC160197Gf enumC160197Gf;
        UserSession userSession = this.A01;
        CHW.A00(userSession).A00(true);
        String str = this.A03;
        if (str != null && str.length() != 0) {
            boolean z = this.A04;
            C14360o3.A0B(userSession, 0);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (z) {
                j = 36325763943707991L;
            } else {
                j = 36325763943445844L;
            }
            if (AbstractC31177DnL.A1U(c06090Tz, userSession, j)) {
                Activity activity = this.A00;
                AbstractC31265Don.A00();
                String A0P = AbstractC167027dH.A0P(activity, 2131960663);
                C14360o3.A07(A0P);
                String A0D = AnonymousClass001.A0D(AbstractC167007dF.A0h(A0P), '/');
                boolean A0h = AbstractC002300n.A0h(str, AnonymousClass001.A0C(A0D, ' '), false);
                C49087LnD c49087LnD = this.A02.A00;
                if (A0h) {
                    str = str.substring(A0D.length() + 1);
                    C14360o3.A07(str);
                }
                c49087LnD.A01(str);
                if (A0h) {
                    enumC160197Gf = EnumC160197Gf.A05;
                } else {
                    enumC160197Gf = EnumC160197Gf.A03;
                }
                c49087LnD.A00(enumC160197Gf);
                c49087LnD.EL0();
            }
        }
    }
}
