package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.78r, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78r implements InterfaceC1582578k {
    public static final C78r A00 = new Object();

    public static final C1579877i A00(Context context, UserSession userSession, C160787Im c160787Im, C101864hx c101864hx, long j, boolean z) {
        boolean A002 = c101864hx.A00(Boolean.valueOf(z));
        boolean z2 = c160787Im.A0G.A0r;
        JVR jvr = new JVR(context, true, C18U.A06(C06090Tz.A05, userSession, 36317195482960753L), true);
        boolean z3 = c101864hx.A07;
        Integer num = c101864hx.A02;
        C14360o3.A07(num);
        String str = c101864hx.A03;
        C14360o3.A07(str);
        return new C1579877i(null, null, null, jvr.A02(num, str, z3, A002, false, z2), null, jvr.A01(j, false, A002), null, null, null, null, null, null, null, null, null, 3);
    }

    @Override // X.InterfaceC1582578k
    public final C7QY AMI(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7ql, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c160787Im, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        C101864hx c101864hx = c83403nh.A0c;
        if (c101864hx != null) {
            boolean A1j = c83403nh.A1j(C08730cb.A00(userSession).A00());
            DirectMessageIdentifier A0V = c83403nh.A0V();
            return A01(C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10), c7ql, A00(context, userSession, c160787Im, c101864hx, c83403nh.C8i(), A1j), A0V);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C7QY A01(C7QX c7qx, C7QL c7ql, C1579877i c1579877i, DirectMessageIdentifier directMessageIdentifier) {
        return new C7QY(null, null, null, new C9C9("", "", 5), null, null, null, null, c7qx, c7ql, c1579877i, null, null, null, null, null, EnumC910243u.SINGLE, null, directMessageIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
    }
}
