package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.7M5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7M5 {
    public final long A00;
    public final UserSession A01;

    public final void A02(C83403nh c83403nh, InterfaceC83713oG interfaceC83713oG, int i) {
        ExtendedImageUrl extendedImageUrl;
        String str;
        String A0h;
        String id;
        ExtendedImageUrl extendedImageUrl2;
        String str2;
        boolean A1S;
        Integer A0c;
        UserSession userSession;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        C14360o3.A0B(c83403nh, 0);
        if ((interfaceC83713oG instanceof InterfaceC83703oF) && C4GR.A06(i)) {
            if (c83403nh.A0W() == EnumC40111tc.A0Q && A01(this, c83403nh.C8i(), c83403nh.A1S())) {
                C101584hT c101584hT = c83403nh.A0e;
                C38321qM c38321qM3 = c83403nh.A0s;
                if (c101584hT != null) {
                    if (c83403nh.A0w == null && (A0h = c83403nh.A0h()) != null && (c38321qM = c101584hT.A05) != null && (id = c38321qM.getId()) != null && (c38321qM2 = c101584hT.A05) != null) {
                        userSession = this.A01;
                        str2 = c38321qM2.A3D(userSession.deviceSession.A06());
                        if (str2 != null) {
                            A1S = c83403nh.A1S();
                            A0c = c83403nh.A0c(id);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (c38321qM3 == null || c38321qM3.A05 != null || (A0h = c83403nh.A0h()) == null || (id = c38321qM3.getId()) == null || (extendedImageUrl2 = c38321qM3.A0E) == null || (str2 = extendedImageUrl2.A0A) == null) {
                        return;
                    }
                    A1S = c83403nh.A1S();
                    A0c = c83403nh.A0c(id);
                    userSession = this.A01;
                }
                int i2 = 1;
                if (C14360o3.A0K(userSession.userId, c83403nh.BtE())) {
                    i2 = 0;
                }
                A00(this, new C45061Jwq(interfaceC83713oG, null, A0h, id, null, i2, A1S, false), A0c, str2);
                return;
            }
            if (!c83403nh.A1a() || !A01(this, c83403nh.C8i(), c83403nh.A1S())) {
                return;
            }
            int i3 = 1;
            if (C14360o3.A0K(this.A01.userId, c83403nh.BtE())) {
                i3 = 0;
            }
            String A0h2 = c83403nh.A0h();
            if (A0h2 == null) {
                return;
            }
            Object obj = c83403nh.A1T;
            if (!(obj instanceof List)) {
                return;
            }
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof C910143t) {
                    C910143t c910143t = (C910143t) obj2;
                    if (c910143t.A0Z == null && (extendedImageUrl = c910143t.A0X) != null && (str = extendedImageUrl.A0A) != null) {
                        long j = c910143t.A0K;
                        if (j != 0) {
                            String valueOf = String.valueOf(j);
                            A00(this, new C45061Jwq(interfaceC83713oG, null, A0h2, valueOf, null, i3, c83403nh.A1S(), false), c83403nh.A0c(valueOf), str);
                        }
                    }
                }
            }
        }
    }

    public final void A03(InterfaceC83713oG interfaceC83713oG, String str, String str2, String str3, boolean z) {
        if (interfaceC83713oG != null && !(interfaceC83713oG instanceof InterfaceC83703oF)) {
            return;
        }
        UserSession userSession = this.A01;
        if (!JUW.A03(userSession, z)) {
            return;
        }
        A00(this, new C45061Jwq(interfaceC83713oG, null, null, str2, str, 0, z, false), -1, str3);
        C2r0 A00 = AbstractC61362qy.A00(userSession);
        synchronized (A00) {
            java.util.Set set = A00.A03;
            if (!set.contains(str)) {
                set.add(str);
            }
        }
    }

    public final void A04(InterfaceC83713oG interfaceC83713oG, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str3, 3);
        if (!str3.equals("0") && str3.length() != 0) {
            C45061Jwq c45061Jwq = new C45061Jwq(interfaceC83713oG, null, null, str3, str2, 0, z, false);
            C2r0 A00 = AbstractC61362qy.A00(this.A01);
            A00.A02(c45061Jwq, str);
            A00.A03(str2);
        }
    }

    public static final void A00(C7M5 c7m5, C45061Jwq c45061Jwq, Integer num, String str) {
        int intValue;
        UserSession userSession = c7m5.A01;
        C2r0 A00 = AbstractC61362qy.A00(userSession);
        if (num != null && ((intValue = num.intValue()) == 0 || intValue == 1)) {
            return;
        }
        String str2 = c45061Jwq.A04;
        if (str2.length() == 0 || str2.equals("0")) {
            return;
        }
        InterfaceC83713oG interfaceC83713oG = c45061Jwq.A00;
        if (A00.A06(str)) {
            if (num == null || num.intValue() != -1 || c45061Jwq.A01 != 1 || interfaceC83713oG == null) {
                return;
            }
            C2JD.A00(userSession).EYs(new DirectMessageIdentifier(null, c45061Jwq.A05, null), interfaceC83713oG, 100, str2);
            return;
        }
        if (c45061Jwq.A01 == 1 && interfaceC83713oG != null) {
            C2JD.A00(userSession).EYs(new DirectMessageIdentifier(null, c45061Jwq.A05, null), interfaceC83713oG, 100, str2);
        }
        A00.A02(c45061Jwq, str);
    }

    public static final boolean A01(C7M5 c7m5, long j, boolean z) {
        long j2 = c7m5.A00;
        if (j2 != 0 && j / 1000 > j2 && JUW.A03(c7m5.A01, z)) {
            return true;
        }
        return false;
    }

    public C7M5(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC23021Ah.A00(userSession).A01.getLong("odnc_last_opt_in_timestamp_ms", 0L);
    }
}
