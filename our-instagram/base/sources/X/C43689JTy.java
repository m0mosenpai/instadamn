package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JTy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43689JTy {
    public final C23031Ai A00;

    public final void A03(InterfaceC83713oG interfaceC83713oG, String str) {
        String str2;
        C14360o3.A0B(str, 1);
        synchronized (this) {
            C83693oE A00 = AbstractC140956Yx.A00(AbstractC140946Yw.A01(interfaceC83713oG));
            if (A00 != null && (str2 = A00.A00) != null) {
                if (A01(this, str2) != null) {
                    if (A01(this, str2) == C05F.A0Y && !C14360o3.A0K(A02(str2), str)) {
                        C23031Ai c23031Ai = this.A00;
                        c23031Ai.A12(AnonymousClass001.A0g("on_device_nudity_banner_state/sender/", str2, "/message_id/"), str);
                        c23031Ai.A0z(AnonymousClass001.A0R("on_device_nudity_banner_state/sender/", str2), 3);
                    }
                } else if (!C14360o3.A0K(A02(str2), str)) {
                    C23031Ai c23031Ai2 = this.A00;
                    c23031Ai2.A12(AnonymousClass001.A0g("on_device_nudity_banner_state/sender/", str2, "/message_id/"), str);
                    c23031Ai2.A0z(AnonymousClass001.A0R("on_device_nudity_banner_state/sender/", str2), 1);
                }
            }
        }
    }

    public static final Integer A00(C43689JTy c43689JTy, String str) {
        C23031Ai c23031Ai = c43689JTy.A00;
        return AbstractC43690JTz.A00(c23031Ai.A01.getInt(AnonymousClass001.A0R("on_device_nudity_banner_state/recipient/", str), 0));
    }

    public static final Integer A01(C43689JTy c43689JTy, String str) {
        C23031Ai c23031Ai = c43689JTy.A00;
        return AbstractC43690JTz.A00(c23031Ai.A01.getInt(AnonymousClass001.A0R("on_device_nudity_banner_state/sender/", str), 0));
    }

    public final String A02(String str) {
        C23031Ai c23031Ai = this.A00;
        String string = c23031Ai.A01.getString(AnonymousClass001.A0g("on_device_nudity_banner_state/sender/", str, "/message_id/"), "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public C43689JTy(UserSession userSession) {
        this.A00 = AbstractC23021Ah.A00(userSession);
    }
}
