package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.instagram.common.session.UserSession;

/* renamed from: X.WmH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71000WmH implements XDQ {
    public final int A00;
    public final UserSession A01;
    public final int A02;
    public final C133115zd A03;
    public final Integer A04;

    @Override // X.XDQ
    public final AnimatorSet Abw() {
        C133115zd c133115zd = this.A03;
        if (c133115zd != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i = c133115zd.A02;
            UserSession userSession = this.A01;
            long A00 = VWF.A00(userSession);
            C06090Tz c06090Tz = C06090Tz.A05;
            long A01 = C18U.A01(c06090Tz, userSession, 36609923274446839L);
            Integer valueOf = Integer.valueOf(i);
            int i2 = this.A00;
            Integer valueOf2 = Integer.valueOf(i2);
            ValueAnimator[] valueAnimatorArr = {new C69633Vsa(c133115zd, valueOf, valueOf2, 0.2f, i, A00, A01).A00(), new C69633Vsa(c133115zd, valueOf2, valueOf, 0.2f, i2, 0L, C18U.A01(c06090Tz, userSession, 36609923274446839L)).A00()};
            C14360o3.A0B(valueAnimatorArr, 0);
            animatorSet.playSequentially(AbstractC009903n.A0I(valueAnimatorArr));
            return animatorSet;
        }
        return new AnimatorSet();
    }

    @Override // X.XDQ
    public final void EhB() {
        C133115zd c133115zd = this.A03;
        if (c133115zd != null) {
            c133115zd.A02(this.A04, Integer.valueOf(this.A02));
        }
    }

    public C71000WmH(UserSession userSession, C133115zd c133115zd, Integer num) {
        int i;
        Integer num2;
        this.A03 = c133115zd;
        this.A01 = userSession;
        if (num != null) {
            i = num.intValue();
        } else {
            i = C6QG.A08[0];
        }
        this.A00 = i;
        if (c133115zd != null) {
            num2 = Integer.valueOf(c133115zd.A02);
        } else {
            num2 = null;
        }
        this.A04 = num2;
        this.A02 = i;
    }

    @Override // X.XDQ
    public final void EK3() {
        EhB();
    }
}
