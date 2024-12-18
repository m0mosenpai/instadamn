package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PRZ implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ OwC A01;

    public PRZ(Activity activity, OwC owC) {
        this.A01 = owC;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment nVm;
        String str;
        int i;
        OwC owC = this.A01;
        Activity activity = this.A00;
        if (activity.isFinishing() || activity.isDestroyed()) {
            if (C18U.A06(C06090Tz.A05, owC.A0E, 36325695223248146L)) {
                return;
            }
        }
        if (owC instanceof NVj) {
            NVj nVj = (NVj) owC;
            UserSession userSession = nVj.A0E;
            boolean A00 = C196008lp.A00(userSession);
            boolean A002 = C196218mC.A00(userSession);
            C82G c82g = ((OwC) nVj).A00;
            if (c82g != null) {
                C82H c82h = nVj.A00;
                if (c82h == null) {
                    str = "upsellVariant";
                } else {
                    int A07 = nVj.A07();
                    C35038FcB c35038FcB = nVj.A04;
                    if (c35038FcB != null) {
                        i = c35038FcB.A00;
                    } else {
                        i = 0;
                    }
                    boolean z = nVj.A0C;
                    String str2 = nVj.A09;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str4 = nVj.A0A;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putBoolean("args_is_story_enabled", A00);
                    A0b.putBoolean("args_is_post_enabled", A002);
                    OwC.A00(A0b, c82g, c82h, A07);
                    A0b.putInt("arg_nux_attempt_qpl_instance_key", i);
                    A0b.putBoolean("args_is_after_fbc", z);
                    A0b.putString("args_media_id", str2);
                    A0b.putString("args_waterfall_id", str3);
                    nVm = AbstractC54213Nxr.A00(A0b, userSession);
                }
            } else {
                str = "entrypoint";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        UserSession userSession2 = owC.A0E;
        Bundle A01 = owC.A01();
        UserSession A072 = C023409i.A0A.A07(A01);
        if (A072 != null) {
            userSession2 = A072;
        }
        nVm = new NVm(A01, userSession2);
        nVm.setArguments(A01);
        UserSession userSession3 = owC.A0E;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession3, 36331016687731841L);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession3);
        if (A06) {
            AbstractC25225BEi.A1Q(A0y, false);
            A0y.A0k = false;
            A0y.A0U = new PHW(owC);
            A0y.A0X = new C56772PHp(owC, 5);
        } else {
            AbstractC25225BEi.A1Q(A0y, false);
            A0y.A0U = new PHW(owC);
        }
        C189478aR A02 = A0y.A00().A02(activity, nVm);
        owC.A01 = A02;
        if (A02 != null) {
            return;
        }
        C35038FcB c35038FcB2 = owC.A04;
        if (c35038FcB2 != null) {
            c35038FcB2.A03(C05F.A0C);
        }
        new PHW(owC).Czx();
    }
}
