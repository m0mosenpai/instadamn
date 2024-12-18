package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7Qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162647Qb {
    public static final C162667Qd A00(UserSession userSession, C160787Im c160787Im) {
        String str;
        C101674hc c101674hc;
        Integer num;
        EnumC101664hb enumC101664hb;
        EnumC162657Qc enumC162657Qc;
        C83403nh c83403nh = c160787Im.A0e;
        DirectMessageIdentifier A0V = c83403nh.A0V();
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        boolean A1j = c83403nh.A1j(C17060sy.A01.A01(userSession));
        C7P3 A03 = c160787Im.A03();
        C14360o3.A07(A03);
        boolean A05 = c160787Im.A05();
        boolean z = c160787Im.A0P;
        boolean z2 = c160787Im.A0R;
        Integer num2 = c160787Im.A0N;
        C14360o3.A07(num2);
        boolean z3 = c83403nh.A2O;
        C4NJ c4nj = c160787Im.A0J;
        boolean z4 = c160787Im.A0U;
        C125805mV c125805mV = c83403nh.A0W;
        if (c125805mV != null) {
            str = c125805mV.A00();
        } else {
            str = "UNKNOWN";
        }
        C101584hT c101584hT = c83403nh.A0e;
        if (c101584hT != null) {
            c101674hc = c101584hT.A03;
        } else {
            c101674hc = null;
        }
        C3YU c3yu = null;
        if (c101674hc != null) {
            num = Integer.valueOf(c101674hc.A00);
            enumC101664hb = c101674hc.A02;
        } else {
            num = null;
            enumC101664hb = null;
        }
        switch (c83403nh.A1F.intValue()) {
            case 0:
            case 1:
            case 2:
                enumC162657Qc = EnumC162657Qc.A05;
                break;
            case 3:
                enumC162657Qc = EnumC162657Qc.A02;
                break;
            case 4:
                enumC162657Qc = EnumC162657Qc.A04;
                break;
            default:
                enumC162657Qc = EnumC162657Qc.A06;
                break;
        }
        boolean z5 = c160787Im.A0a;
        C38321qM A0S = c83403nh.A0S();
        if (A0S != null) {
            c3yu = A0S.A1y();
        }
        return new C162667Qd(enumC162657Qc, A03, c160787Im.A0G, enumC101664hb, c2ey, A0V, c3yu, c4nj, num2, num, str, c83403nh.A29, A1j, A05, z, z2, z3, z4, z5, c160787Im.A0b);
    }
}
