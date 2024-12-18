package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class ET1 extends C1P1 {
    public String A00;
    public final /* synthetic */ C34949FaZ A01;

    public ET1(C34949FaZ c34949FaZ, String str) {
        this.A01 = c34949FaZ;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(835742633);
        AbstractC35254Fgn.A07(this.A01.A00, abstractC115105If);
        C0f9.A0A(-1344117874, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1086274570);
        int A032 = C0f9.A03(243197169);
        C34949FaZ c34949FaZ = this.A01;
        Fragment fragment = c34949FaZ.A00;
        C140966Yy A0N = AbstractC31177DnL.A0N(fragment.requireActivity(), c34949FaZ.A02);
        C32271EJg c32271EJg = new C32271EJg();
        String str = this.A00;
        Bundle A00 = C35002FbZ.A00(((EDW) obj).A00);
        AbstractC31181DnP.A0R(A00, null, null, str, false);
        AbstractC34231F8d.A00(A00, EnumC33365Eoy.A04);
        A00.putBoolean("HAS_SMS_CONSENT", false);
        A0N.A0B(A00, c32271EJg);
        A0N.A0F(fragment, 0);
        A0N.A04();
        C0f9.A0A(1624612814, A032);
        C0f9.A0A(-1172949484, A03);
    }
}
