package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GFp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36694GFp implements InterfaceC169327h6 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C36694GFp(UserSession userSession, String str, String str2, boolean z) {
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = z;
        this.A01 = str2;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        UserSession userSession = this.A00;
        String str2 = this.A02;
        boolean z = this.A03;
        String str3 = this.A01;
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("direct_v2/direct_invite_main/");
        A0N.A0F = str2;
        A0N.A0S(C32209EDi.class, C34785FUk.class);
        if (z && str3 != null) {
            A0N.A9s("next_page_cursor", str3);
        }
        return A0N.A0N();
    }
}
