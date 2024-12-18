package X;

import android.animation.AnimatorSet;
import android.view.View;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.WmJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71002WmJ implements XDQ {
    public final int A00;
    public final View A01;
    public final UserSession A02;
    public final boolean A03;
    public final int A04;
    public final int A05;
    public final C133115zd A06;
    public final Integer A07;
    public final Integer A08;

    @Override // X.XDQ
    public final AnimatorSet Abw() {
        C133115zd c133115zd = this.A06;
        if (c133115zd != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            int i = c133115zd.A02;
            int i2 = this.A00;
            UserSession userSession = this.A02;
            long A00 = VWF.A00(userSession);
            C06090Tz c06090Tz = C06090Tz.A05;
            arrayList.add(new C69633Vsa(c133115zd, Integer.valueOf(i), Integer.valueOf(i2), 0.2f, i, A00, C18U.A01(c06090Tz, userSession, 36609923274119154L)).A00());
            if (this.A03) {
                View view = this.A01;
                arrayList.add(new C47766L7m(view, 0.0f, 0.0f, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, VWF.A00(userSession), C18U.A01(c06090Tz, userSession, 36609923274250228L)).A00());
                arrayList.add(new C47766L7m(view, 1.1f, 1.0f, 96, VWF.A00(userSession) + C18U.A01(c06090Tz, userSession, 36609923274381302L) + C18U.A01(c06090Tz, userSession, 36609923274250228L), C18U.A01(c06090Tz, userSession, 36609923274512376L)).A00());
            }
            animatorSet.playTogether(arrayList);
            return animatorSet;
        }
        return new AnimatorSet();
    }

    @Override // X.XDQ
    public final void EK3() {
        C133115zd c133115zd = this.A06;
        if (c133115zd != null) {
            c133115zd.A02(this.A08, Integer.valueOf(this.A05));
        }
        if (this.A03) {
            AbstractC43593JPy.A1A(this.A01);
        }
    }

    @Override // X.XDQ
    public final void EhB() {
        C133115zd c133115zd = this.A06;
        if (c133115zd != null) {
            c133115zd.A02(Integer.valueOf(this.A04), this.A07);
        }
        if (this.A03) {
            AbstractC43593JPy.A1A(this.A01);
        }
    }

    public C71002WmJ(View view, UserSession userSession, C133115zd c133115zd, Integer num, boolean z) {
        Integer num2;
        int i;
        this.A06 = c133115zd;
        this.A01 = view;
        this.A02 = userSession;
        this.A03 = z;
        if (c133115zd != null) {
            num2 = Integer.valueOf(c133115zd.A02);
        } else {
            num2 = null;
        }
        this.A07 = num2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = C6QG.A08[0];
        }
        this.A04 = i;
        this.A05 = i;
        this.A08 = c133115zd != null ? Integer.valueOf(c133115zd.A02) : null;
        this.A00 = i;
    }
}
