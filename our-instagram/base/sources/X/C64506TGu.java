package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TGu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64506TGu implements BCD {
    public final int A00;
    public final Object A01;

    public C64506TGu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.BCD
    public final void Cz1() {
        C3DN c3dn;
        switch (this.A00) {
            case 0:
                c3dn = (C3DN) this.A01;
                break;
            case 1:
                c3dn = (C3DN) this.A01;
                if (c3dn == null) {
                    return;
                }
                break;
            case 2:
                C63397SjR c63397SjR = (C63397SjR) this.A01;
                BCD bcd = c63397SjR.A0H;
                if (bcd != null) {
                    bcd.Cz1();
                }
                SPM spm = c63397SjR.A0K;
                if (spm == null) {
                    return;
                }
                String str = "collapsed";
                if (!c63397SjR.A0b) {
                    if (c63397SjR.A0c) {
                        str = "secondary_cta";
                    } else if (!c63397SjR.A0a) {
                        return;
                    }
                }
                spm.A02(str, "dismiss", "external_tap");
                return;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                C31255Dod c31255Dod = (C31255Dod) this.A01;
                if (currentTimeMillis - (-1) < 300) {
                    C2UY.A01.A05(14L);
                    UserSession userSession = c31255Dod.A03;
                    C0BQ.A00(userSession).CJm(c31255Dod.A02.requireContext(), userSession, "double_tap_tab_bar_direct_action_bar");
                    return;
                }
                return;
        }
        c3dn.A0Q(null);
    }
}
