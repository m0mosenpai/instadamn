package X;

import android.animation.AnimatorSet;
import android.view.View;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.WmI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71001WmI implements XDQ {
    public final View A00;
    public final UserSession A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final C133115zd A06;

    @Override // X.XDQ
    public final AnimatorSet Abw() {
        Integer num;
        C133115zd c133115zd = this.A06;
        if (c133115zd != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList A12 = AbstractC166997dE.A12(c133115zd, 0);
            if (this.A04) {
                long A00 = VWF.A00(this.A01);
                int i = C6QG.A08[0];
                Integer num2 = this.A02;
                if (num2 != null && i == num2.intValue() && (num = this.A03) != null) {
                    i = num.intValue();
                }
                A12.add(new C69633Vsa(c133115zd, null, null, 0.0f, i, A00, 0L).A00());
            }
            if (this.A05) {
                View view = this.A00;
                UserSession userSession = this.A01;
                long A002 = VWF.A00(userSession);
                C06090Tz c06090Tz = C06090Tz.A05;
                A12.add(new C47766L7m(view, 0.0f, 0.0f, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, A002, C18U.A01(c06090Tz, userSession, 36609923274250228L)).A00());
                A12.add(new C47766L7m(view, 1.1f, 1.0f, 96, VWF.A00(userSession) + C18U.A01(c06090Tz, userSession, 36609923274381302L) + C18U.A01(c06090Tz, userSession, 36609923274250228L), C18U.A01(c06090Tz, userSession, 36609923274512376L)).A00());
            }
            animatorSet.playTogether(A12);
            return animatorSet;
        }
        return new AnimatorSet();
    }

    @Override // X.XDQ
    public final void EK3() {
        C133115zd c133115zd;
        int i;
        if (this.A04 && (c133115zd = this.A06) != null) {
            Integer num = this.A02;
            if (num != null) {
                i = num.intValue();
            } else {
                i = C6QG.A08[0];
            }
            c133115zd.A02(null, Integer.valueOf(i));
        }
        if (this.A05) {
            AbstractC43593JPy.A1A(this.A00);
        }
    }

    @Override // X.XDQ
    public final void EhB() {
        C133115zd c133115zd;
        Integer num;
        if (this.A04 && (c133115zd = this.A06) != null) {
            int i = C6QG.A08[0];
            Integer num2 = this.A02;
            if (num2 != null && i == num2.intValue() && (num = this.A03) != null) {
                i = num.intValue();
            }
            c133115zd.A02(null, Integer.valueOf(i));
        }
        if (this.A05) {
            AbstractC43593JPy.A1A(this.A00);
        }
    }

    public C71001WmI(View view, UserSession userSession, C133115zd c133115zd, Integer num, Integer num2, boolean z, boolean z2) {
        this.A06 = c133115zd;
        this.A01 = userSession;
        this.A00 = view;
        this.A02 = num;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = num2;
    }
}
