package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.AHa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23111AHa {
    public static final void A00(Activity activity, Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C6XJ c6xj = new C6XJ(activity, AbstractC177607uu.A00(null, EnumC33405Epc.A05, true), userSession, TransparentModalActivity.class, "nametag");
        c6xj.A0J = ModalActivity.A08;
        c6xj.A0C(context);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (C2TN.A00(userSession)) {
            Context applicationContext = fragmentActivity.getApplicationContext();
            C1RQ A00 = C1RQ.A00();
            MTC mtc = new MTC(EnumC27091Ti.A0O);
            mtc.A03 = C05F.A00;
            mtc.A02 = new C23970Ak5(applicationContext, fragmentActivity, str, str2, z);
            A00.A03(userSession, new MTD(mtc));
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession) {
        if (C2TN.A00(userSession)) {
            Context applicationContext = fragmentActivity.getApplicationContext();
            C1RQ A00 = C1RQ.A00();
            MTC mtc = new MTC(EnumC27091Ti.A0O);
            mtc.A03 = C05F.A00;
            mtc.A02 = new C208379Jw(2, applicationContext, fragmentActivity);
            A00.A03(userSession, new MTD(mtc));
        }
    }
}
