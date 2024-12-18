package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PSD implements Runnable {
    public final /* synthetic */ C54661OCn A00;
    public final /* synthetic */ C52211N9a A01;
    public final /* synthetic */ N6N A02;

    public PSD(C54661OCn c54661OCn, C52211N9a c52211N9a, N6N n6n) {
        this.A02 = n6n;
        this.A00 = c54661OCn;
        this.A01 = c52211N9a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        int i;
        int i2;
        N6N n6n = this.A02;
        C54661OCn c54661OCn = this.A00;
        Map map = c54661OCn.A03;
        C14360o3.A06(map);
        Map map2 = c54661OCn.A04;
        C14360o3.A06(map2);
        C52211N9a c52211N9a = this.A01;
        C55197Oe4 c55197Oe4 = n6n.A01;
        if (c55197Oe4 != null) {
            UserSession A0r = AbstractC166987dD.A0r(n6n.A0C);
            String A15 = AbstractC25225BEi.A15(n6n.A0B);
            EnumC53243Ngg enumC53243Ngg = (EnumC53243Ngg) n6n.A0D.getValue();
            java.util.Set keySet = map.keySet();
            java.util.Set keySet2 = map2.keySet();
            String str3 = c55197Oe4.A01;
            C54662OCo c54662OCo = c55197Oe4.A00;
            if (c54662OCo == null) {
                str = null;
            } else {
                str = c54662OCo.A03;
            }
            if (c54662OCo != null) {
                str2 = c54662OCo.A04;
                i2 = c54662OCo.A02.getHeight();
                i = c54662OCo.A02.getWidth();
            } else {
                str2 = null;
                i = 0;
                i2 = 0;
            }
            C54662OCo c54662OCo2 = c55197Oe4.A00;
            c54662OCo2.getClass();
            C1ON A01 = AbstractC1571873x.A01(enumC53243Ngg, A0r, A15, str3, str, str2, C55197Oe4.A03(c54662OCo2), keySet, keySet2, i2, i);
            A01.A00 = c52211N9a;
            n6n.schedule(A01);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
