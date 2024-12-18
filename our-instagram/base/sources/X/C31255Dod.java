package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dod, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31255Dod {
    public InterfaceC56362iU A00;
    public final Fragment A02;
    public final UserSession A03;
    public final UserSession A04;
    public final Fragment A07;
    public final Handler A01 = AbstractC167007dF.A0J();
    public final Runnable A05 = new RunnableC31260Doi(this);
    public final Runnable A06 = new RunnableC31259Doh(this);

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00() {
        int i;
        InterfaceC56362iU interfaceC56362iU = this.A00;
        if (interfaceC56362iU != null) {
            UserSession userSession = this.A03;
            int A00 = AbstractC31264Dom.A00(userSession);
            if (AbstractC54472f1.A03()) {
                i = AbstractC167007dF.A1O(A00);
            } else {
                i = AbstractC71963Ku.A01(userSession);
            }
            C56352iT c56352iT = (C56352iT) interfaceC56362iU;
            C56352iT.A0F(c56352iT);
            AbstractC167007dF.A0L(c56352iT.A0b).setVisibility(AbstractC167007dF.A05(i));
            AbstractC167007dF.A0L(c56352iT.A0c).setVisibility(8);
            AbstractC167007dF.A0L(c56352iT.A0d).setVisibility(0);
            if (A00 > 0) {
                A01(A00);
            }
        }
    }

    public final void A01(int i) {
        UserSession userSession = this.A03;
        int A01 = C71953Kt.A01(userSession, false);
        int A00 = C71953Kt.A00(userSession, false);
        int A04 = C3Ks.A01.A04(userSession, false);
        boolean A1O = AbstractC167007dF.A1O(A04);
        C54392et A0b = AbstractC31173DnH.A0b(userSession);
        EnumC54222eY enumC54222eY = EnumC54222eY.A06;
        C54432ex c54432ex = new C54432ex(enumC54222eY, i);
        EnumC58162lY enumC58162lY = EnumC58162lY.A0A;
        EnumC58122lU enumC58122lU = EnumC58122lU.A03;
        A0b.A04(enumC58122lU, enumC58162lY, c54432ex, C05F.A0N, A00, A1O ? 1 : 0, A01, A04);
        C54412ev A0c = AbstractC31174DnI.A0c(userSession);
        C54432ex c54432ex2 = new C54432ex(enumC54222eY, i);
        C14360o3.A0B(enumC58162lY, 0);
        A0c.A02(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex2);
    }

    public C31255Dod(Fragment fragment, UserSession userSession) {
        this.A02 = fragment;
        this.A03 = userSession;
        this.A07 = fragment;
        this.A04 = userSession;
    }
}
