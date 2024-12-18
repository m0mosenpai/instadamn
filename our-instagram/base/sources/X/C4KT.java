package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.4KT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KT {
    public final UserSession A00;
    public final C4KU A01;

    public C4KT(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = (C4KU) userSession.A01(C4KU.class, new MHJ(userSession, 30));
    }

    public final boolean A00() {
        InterfaceC19610xo ARD;
        MobileConfigValueSource mobileConfigValueSource;
        C1AC A02;
        C4KU c4ku = this.A01;
        UserSession userSession = c4ku.A00;
        boolean A022 = C6CB.A02(userSession, 36322353741965504L);
        InterfaceC19630xq interfaceC19630xq = c4ku.A01;
        boolean contains = interfaceC19630xq.contains("CUTOVER_ENABLED_PREF_KEY");
        boolean A023 = C6CB.A02(userSession, 36322353738688680L);
        if (A022) {
            if (contains) {
                ARD = interfaceC19630xq.ARD();
                ARD.EEj("CUTOVER_ENABLED_PREF_KEY");
                ARD.apply();
            }
            return A023;
        }
        if (interfaceC19630xq.contains("CUTOVER_ENABLED_PREF_KEY")) {
            boolean z = interfaceC19630xq.getBoolean("CUTOVER_ENABLED_PREF_KEY", true);
            if (A023 != z) {
                C06090Tz A00 = C06090Tz.A00(new C06090Tz());
                A00.A02 = true;
                C06090Tz A002 = C06090Tz.A00(A00);
                A002.A03 = true;
                C18V c18v = C18V.A01;
                if (c18v != null && (A02 = c18v.A02(userSession)) != null) {
                    A02.A01.A00.AhE(A002, 36322353738688680L);
                    mobileConfigValueSource = A002.A00.A00;
                } else {
                    mobileConfigValueSource = MobileConfigValueSource.UNKNOWN;
                }
                C14360o3.A0A(mobileConfigValueSource);
                StringBuilder sb = new StringBuilder();
                sb.append(36322353738688680L);
                sb.append(" had a client cache value of ");
                sb.append(z);
                sb.append(" but mc returned ");
                sb.append(A023);
                sb.append(MSV.A00(615));
                sb.append(mobileConfigValueSource);
                String obj = sb.toString();
                C0f5 AEp = C18950wb.A01.AEp("ONE_WAY_GATING_HELPER_MISMATCH", 13637971);
                AEp.ERI(new IllegalStateException(obj));
                AEp.ABV("mc_param", 36322353738688680L);
                AEp.report();
                return true;
            }
            return true;
        }
        if (A023) {
            ARD = interfaceC19630xq.ARD();
            ARD.E77("CUTOVER_ENABLED_PREF_KEY", true);
            ARD.apply();
        }
        return A023;
    }
}
