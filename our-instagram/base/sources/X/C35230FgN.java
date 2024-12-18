package X;

import android.os.Build;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.FgN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35230FgN {
    public final AbstractC12990ll A00;
    public final String A01;

    public static void A03(C35230FgN c35230FgN, EnumC31713DwI enumC31713DwI) {
        c35230FgN.A06(null, enumC31713DwI).A02();
    }

    public static C19280xC A00(EKF ekf, C1Q9 c1q9) {
        return c1q9.A02(ekf.A05).A05(ekf.B75(), ekf.C0Q());
    }

    public static C35037FcA A01(ENJ enj, C1Q9 c1q9) {
        return c1q9.A02(enj.A05).A06(null, EnumC31713DwI.A1O);
    }

    public final C19280xC A04() {
        C19280xC A04 = C1QE.A01("log_in").A04(this.A01);
        A04.A08(Integer.valueOf(Build.VERSION.SDK_INT), "os_version");
        AbstractC12990ll abstractC12990ll = this.A00;
        A04.A0C("fb_family_device_id", AbstractC31172DnG.A0P(abstractC12990ll).A02(C19T.A1y));
        A04.A0C("guid", AbstractC31174DnI.A0s());
        if (AbstractC31174DnI.A06(abstractC12990ll) > 0) {
            A04.A0C(CacheBehaviorLogger.SOURCE, "mas");
        }
        return A04;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.FcA, java.lang.Object] */
    public final C35037FcA A06(EnumC33445EqI enumC33445EqI, EnumC31713DwI enumC31713DwI) {
        AbstractC12990ll abstractC12990ll = this.A00;
        String str = this.A01;
        ?? obj = new Object();
        obj.A02 = abstractC12990ll;
        C19280xC A04 = C1QE.A01("log_in").A04(str);
        if (enumC31713DwI != null) {
            A04.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, enumC31713DwI.A01);
        }
        if (enumC33445EqI != null) {
            A04.A0C("flow", enumC33445EqI.A00);
        }
        obj.A01 = A04;
        if (enumC33445EqI != null) {
            C34384FEa c34384FEa = new C34384FEa();
            synchronized (c34384FEa) {
            }
            obj.A00 = c34384FEa;
        }
        obj.A03("os_version", Build.VERSION.SDK_INT);
        String A0s = AbstractC31174DnI.A0s();
        A0s.getClass();
        obj.A04("guid", A0s);
        if (AbstractC31174DnI.A06(abstractC12990ll) > 0) {
            obj.A04(CacheBehaviorLogger.SOURCE, "mas");
        }
        if (enumC31713DwI == EnumC31713DwI.A0c) {
            obj.A04("reg_type", "consumer");
        }
        return obj;
    }

    public C35230FgN(AbstractC12990ll abstractC12990ll, String str) {
        this.A00 = abstractC12990ll;
        this.A01 = str;
    }

    public static void A02(C35230FgN c35230FgN, EnumC33445EqI enumC33445EqI, EnumC31713DwI enumC31713DwI) {
        c35230FgN.A06(enumC33445EqI, enumC31713DwI).A02();
    }

    public final C19280xC A05(EnumC33445EqI enumC33445EqI, EnumC31713DwI enumC31713DwI) {
        C19280xC A04 = A04();
        if (enumC31713DwI != null) {
            A04.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, enumC31713DwI.A01);
        }
        if (enumC33445EqI != null) {
            A04.A0C("flow", enumC33445EqI.A00);
        }
        return A04;
    }
}
