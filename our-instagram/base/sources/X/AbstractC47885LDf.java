package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;
import com.instagram.direct.securityalert.data.SecurityAlertRepository$insertOrUpdateSecurityAlert$1;

/* renamed from: X.LDf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47885LDf {
    public static C46917Koy A00;

    public static final boolean A01(UserSession userSession, Number number, Number number2, Number number3, String str, String str2, String str3, int i, int i2, int i3) {
        Long l;
        Double d;
        Object c09540e5;
        C14360o3.A0B(userSession, 0);
        C46083Kah A002 = AbstractC44183Jfm.A00(userSession);
        Integer valueOf = Integer.valueOf(i);
        C09530e4 A1L = AbstractC166987dD.A1L("update_change_type", valueOf);
        Integer valueOf2 = Integer.valueOf(i2);
        C09530e4 A1L2 = AbstractC166987dD.A1L("device_change_type", valueOf2);
        Integer valueOf3 = Integer.valueOf(i3);
        String A01 = AbstractC31688Dvt.A01();
        C09530e4 A1L3 = AbstractC166987dD.A1L(A01, valueOf3);
        C09530e4 A1L4 = AbstractC166987dD.A1L(AbstractC111324zv.A00(386), str);
        C09530e4 A1L5 = AbstractC166987dD.A1L("device_platform", str2);
        C09530e4 A1L6 = AbstractC166987dD.A1L("device_location", str3);
        Double d2 = null;
        if (number != null) {
            l = Long.valueOf(number.longValue());
        } else {
            l = null;
        }
        C09530e4 A1L7 = AbstractC166987dD.A1L("created_timestamp_ms", l);
        if (number2 != null) {
            d = Double.valueOf(number2.doubleValue());
        } else {
            d = null;
        }
        C09530e4 A1L8 = AbstractC166987dD.A1L("device_latitude", d);
        if (number3 != null) {
            d2 = Double.valueOf(number3.doubleValue());
        }
        int i4 = (i3 * 100) + (i2 * 10) + i;
        A002.A02(959381505, i4, AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AbstractC166987dD.A1L("device_longitude", d2)));
        try {
            SecurityAlertRepository A003 = SecurityAlertRepository.A04.A00(userSession);
            C46083Kah c46083Kah = A003.A01;
            String A0q = AbstractC31173DnH.A0q(A003.A02);
            C14360o3.A07(A0q);
            c46083Kah.A01(959381505, i4, "UPDATE_IN_REPOSITORY", AbstractC06930Yk.A06(AbstractC166987dD.A1L(CacheBehaviorLogger.SOURCE, "repository.insertOrUpdate"), AbstractC166987dD.A1L("datasource", A0q), AbstractC166987dD.A1L("update_change_type", valueOf), AbstractC166987dD.A1L("device_change_type", valueOf2), AbstractC166987dD.A1L(A01, valueOf3)));
            AbstractC166987dD.A1Z(new SecurityAlertRepository$insertOrUpdateSecurityAlert$1(A003, number, number2, number3, str, str2, str3, null, i, i2, i3), ((C4A7) A003).A01);
            c09540e5 = C0eB.A00;
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        Throwable A004 = C09550e6.A00(c09540e5);
        if (A004 != null) {
            AbstractC44183Jfm.A00(userSession).A03(A004, 959381505, i4);
        }
        return !(c09540e5 instanceof C09540e5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Koy, java.lang.Object] */
    public static final void A00() {
        if (A00 == null) {
            A00 = new Object();
        }
    }
}
