package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163537Tq {
    public final InterfaceC19630xq A00;

    public final void A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        InterfaceC19630xq interfaceC19630xq = this.A00;
        if (!C14360o3.A0K(interfaceC19630xq.getString(AnonymousClass001.A0R("thread_id_", str), null), str2)) {
            String A0R = AnonymousClass001.A0R("thread_id_", str);
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7K(A0R, str2);
            ARD.apply();
        }
    }

    public final void A01(String str, String str2) {
        C14360o3.A0B(str, 0);
        String A0R = AnonymousClass001.A0R("thread_id_feedback_", str);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7K(A0R, str2);
        ARD.apply();
    }

    public final boolean A02(String str, String str2) {
        C14360o3.A0B(str, 0);
        return C14360o3.A0K(this.A00.getString(AnonymousClass001.A0R("thread_id_imagine_", str), null), str2);
    }

    public C163537Tq(UserSession userSession) {
        this.A00 = C1AT.A01(userSession).A04(C1AV.A0A, getClass());
    }
}
