package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ilr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42143Ilr implements InterfaceC43433JGx {
    public C41635IbQ A00;
    public String A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC43433JGx
    public final void onDestroy() {
        C41635IbQ c41635IbQ = this.A00;
        if (c41635IbQ != null) {
            c41635IbQ.A01();
        }
    }

    public C42143Ilr(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = z;
        if (str3 == null) {
            User A0k = AbstractC31174DnI.A0k(userSession, str);
            if (A0k != null) {
                str4 = A0k.A03.getStorefrontAttributionUsername();
            } else {
                str4 = null;
            }
            this.A01 = str4;
            return;
        }
        this.A01 = str3;
    }

    @Override // X.InterfaceC43433JGx
    public final void AJD(Context context, InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        String str = this.A04;
        String str2 = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String moduleName = interfaceC11380iw.getModuleName();
        C41635IbQ c41635IbQ = new C41635IbQ(context, null, interfaceC11380iw, this.A03, new C42871Ixl(), null, str, str2, moduleName, null, this.A01, this.A06);
        this.A00 = c41635IbQ;
        c41635IbQ.A02(interfaceC56362iU);
    }
}
