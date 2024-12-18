package X;

import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Iu7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42650Iu7 implements JG8 {
    public final /* synthetic */ C120985dq A00;
    public final /* synthetic */ JG9 A01;
    public final /* synthetic */ C37540Gfw A02;
    public final /* synthetic */ C37546Gg2 A03;
    public final /* synthetic */ C39465Hbr A04;

    @Override // X.JG8
    public final void D03(java.util.Set set, boolean z) {
        ConfirmationStyle confirmationStyle;
        InterfaceC84443pn AoG;
        C14360o3.A0B(set, 1);
        C39465Hbr c39465Hbr = this.A04;
        C120985dq c120985dq = this.A00;
        List A0L = this.A03.A0A.A0L(EnumC129395t1.A0G);
        Iterator it = A0L.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (C14360o3.A0K(AbstractC37300Gc1.A0A(it).getId(), c120985dq.getId())) {
                if (i2 >= 0) {
                    i = i2;
                }
            } else {
                i2++;
            }
        }
        List subList = A0L.subList(i, A0L.size());
        if (z) {
            C37540Gfw c37540Gfw = this.A02;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (AoG = c38321qM.A0C.AoG()) != null) {
                confirmationStyle = AoG.AqJ();
            } else {
                confirmationStyle = null;
            }
            if (confirmationStyle == ConfirmationStyle.A05) {
                C37540Gfw.A02(c120985dq, c37540Gfw);
                final C37560GgG c37560GgG = c39465Hbr.A02;
                C11T.A03(new Runnable() { // from class: X.J42
                    @Override // java.lang.Runnable
                    public final void run() {
                        C37560GgG.this.A0H();
                    }
                });
            }
            UserSession userSession = c39465Hbr.A01;
            C1ON A01 = MutedWordsApiUtil.A01(userSession, AbstractC001800i.A0a(set));
            A01.A00 = new HG2(3, c37540Gfw, c120985dq, c39465Hbr, subList);
            C1GJ.A03(A01);
            AbstractC40648I0g.A00(c39465Hbr.A00, userSession);
            return;
        }
        JG9 jg9 = this.A01;
        if (jg9 == null) {
            return;
        }
        jg9.DI1(true, false);
    }

    public C42650Iu7(C120985dq c120985dq, JG9 jg9, C37540Gfw c37540Gfw, C37546Gg2 c37546Gg2, C39465Hbr c39465Hbr) {
        this.A04 = c39465Hbr;
        this.A00 = c120985dq;
        this.A03 = c37546Gg2;
        this.A02 = c37540Gfw;
        this.A01 = jg9;
    }
}
