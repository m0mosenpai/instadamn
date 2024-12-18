package X;

import android.os.Bundle;

/* renamed from: X.GPu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36951GPu implements Runnable {
    public final /* synthetic */ C35002FbZ A00;
    public final /* synthetic */ C36671GEr A01;
    public final /* synthetic */ String A02;

    public RunnableC36951GPu(C35002FbZ c35002FbZ, C36671GEr c36671GEr, String str) {
        this.A01 = c36671GEr;
        this.A02 = str;
        this.A00 = c35002FbZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36671GEr c36671GEr = this.A01;
        C140966Yy A0N = AbstractC31177DnL.A0N(c36671GEr.A02, c36671GEr.A04);
        C32271EJg c32271EJg = new C32271EJg();
        String str = this.A02;
        C14360o3.A0A(str);
        Bundle A00 = C35002FbZ.A00(this.A00);
        AbstractC31181DnP.A0R(A00, null, null, str, false);
        AbstractC34231F8d.A00(A00, EnumC33365Eoy.A04);
        A00.putBoolean("HAS_SMS_CONSENT", false);
        A0N.A0B(A00, c32271EJg);
        A0N.A04();
    }
}
