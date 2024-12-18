package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.8c3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190458c3 {
    public boolean A00;
    public boolean A01;
    public final InterfaceC190488c6 A02;

    public C190458c3(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A02 = AbstractC190468c4.A01(interfaceC11380iw, userSession, obj, C18U.A06(C06090Tz.A05, userSession, 36311165348938184L));
    }

    public final void A00() {
        if (!this.A00) {
            this.A02.Clf();
            this.A00 = true;
        }
    }

    public final void A01() {
        if (!this.A01) {
            this.A02.Clg();
            this.A01 = true;
        }
    }

    public final void A02(String str, String str2, int i) {
        this.A02.ClZ(C70108W4f.A00(null, "server_results", str, "USER", null, "server"), C05F.A0N, C05F.A0C, str2, "", i);
    }
}
