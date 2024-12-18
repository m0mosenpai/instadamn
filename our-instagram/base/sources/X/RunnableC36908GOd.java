package X;

import android.os.Bundle;

/* renamed from: X.GOd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36908GOd implements Runnable {
    public final /* synthetic */ EDW A00;
    public final /* synthetic */ EUF A01;

    public RunnableC36908GOd(EDW edw, EUF euf) {
        this.A01 = euf;
        this.A00 = edw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31721DwQ c31721DwQ = this.A01.A00;
        C34649FOh c34649FOh = c31721DwQ.A0f;
        c34649FOh.getClass();
        String str = c34649FOh.A0M;
        C34649FOh c34649FOh2 = c31721DwQ.A0f;
        String str2 = c34649FOh2.A0B;
        String str3 = c34649FOh2.A0H;
        Bundle A00 = C35002FbZ.A00(this.A00.A00);
        AbstractC31181DnP.A0R(A00, str2, str3, str, false);
        AbstractC34231F8d.A00(A00, EnumC33365Eoy.A04);
        A00.putBoolean("HAS_SMS_CONSENT", false);
        C140966Yy A0N = AbstractC31177DnL.A0N(c31721DwQ.requireActivity(), c31721DwQ.A0V);
        A0N.A0B(A00, new C32271EJg());
        A0N.A0F(c31721DwQ, 0);
        A0N.A04();
    }
}
