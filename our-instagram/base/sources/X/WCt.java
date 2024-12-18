package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WCt {
    public static final void A01(Activity activity, UserSession userSession, EnumC92794Ds enumC92794Ds, Long l, Long l2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str2;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, activity);
        V1J v1j = new V1J();
        Bundle bundle = new Bundle();
        AbstractC03240Dh.A00(bundle, userSession);
        bundle.putString("thread_id_for_logging", str);
        if (enumC92794Ds != null) {
            str2 = enumC92794Ds.A00;
        } else {
            str2 = null;
        }
        bundle.putString(AbstractC111324zv.A00(398), str2);
        bundle.putBoolean("is_dm_7_day_enabled", z);
        bundle.putBoolean("is_thread_eligible_open_dm_send", z2);
        bundle.putBoolean(AbstractC111324zv.A00(1039), z3);
        bundle.putBoolean("is_tlc_thread", z4);
        if (l != null) {
            bundle.putLong("dm_ephemeral_lifetime_ms_for_logging", l.longValue());
        }
        if (l2 != null) {
            bundle.putLong("dm_after_viewed_ephemeral_lifetime_ms_for_logging", l2.longValue());
        }
        bundle.putBoolean("dm_is_after_viewed_mode", z5);
        v1j.setArguments(bundle);
        C189448aO c189448aO = new C189448aO(userSession);
        AbstractC25225BEi.A1Q(c189448aO, false);
        c189448aO.A0v = A1R;
        c189448aO.A0g = activity.getResources().getString(2131961060);
        C189478aR A00 = c189448aO.A00();
        C14360o3.A0A(v1j);
        AbstractC140396Wt.A03(activity, v1j, A00, null);
    }

    public final boolean A02(UserSession userSession, boolean z, boolean z2, boolean z3) {
        VER ver;
        C14360o3.A0B(userSession, 0);
        long A00 = A00(userSession);
        if (!z && !z2) {
            if (!z3) {
                ver = VER.A09;
            } else {
                ver = VER.A05;
            }
        } else if (A00(userSession) == 0) {
            ver = VER.A07;
        } else {
            ver = VER.A08;
        }
        return AbstractC25230BEn.A1P((A00 > ver.A00 ? 1 : (A00 == ver.A00 ? 0 : -1)));
    }

    public static final long A00(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A12;
        C0YR[] c0yrArr = C23031Ai.A8c;
        long longValue = ((Number) interfaceC16530ry.CES(A00, c0yrArr[1])).longValue();
        if (longValue <= 0) {
            if (AbstractC167017dG.A1b(A00, A00.A37, c0yrArr, 0)) {
                A00.A0e(1L);
                return 1L;
            }
            return 0L;
        }
        return longValue;
    }
}
