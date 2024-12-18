package X;

import android.view.animation.OvershootInterpolator;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class D8H extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8H(int i, Object obj, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        switch (this.A00) {
            case 0:
                BQQ bqq = (BQQ) this.A01;
                UserSession userSession = bqq.A01;
                C25515BQd c25515BQd = bqq.A05;
                BOB.A02(userSession, c25515BQd.A06, null, null, c25515BQd.A07, null, this.A02);
                break;
            case 1:
                if (!this.A02) {
                    return "";
                }
                C26590Bon c26590Bon = (C26590Bon) this.A01;
                OvershootInterpolator overshootInterpolator = C26590Bon.A0h;
                BVO bvo = c26590Bon.A04;
                if (bvo == null || (str = bvo.A01) == null) {
                    return "";
                }
                return str;
            case 2:
                if (this.A02) {
                    ((BLI) this.A01).A0H.ARt(false);
                    break;
                }
                break;
            case 3:
                if (this.A02) {
                    BLI bli = (BLI) this.A01;
                    return new SPM(bli.A0C, bli.A0A, AbstractC25226BEj.A1E(bli.A06), null, AbstractC111324zv.A00(2028));
                }
                return null;
            default:
                return new C1126756x((UserSession) this.A01, this.A02);
        }
        return C0eB.A00;
    }
}
