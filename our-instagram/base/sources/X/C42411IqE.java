package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.IqE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42411IqE implements GXX {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C41702IdW A03;
    public final C41727Idy A04;
    public final JI6 A05;

    @Override // X.GXX
    public final void Dkf(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(str, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!A19) {
                break;
            } else {
                length--;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        if (obj != null && obj.length() != 0) {
            Product A00 = C41726Idx.A00(this.A05);
            if (A00 != null) {
                C41702IdW c41702IdW = this.A03;
                if (c41702IdW != null) {
                    C38683GzO A03 = C128205qp.A03(c41702IdW.A03, A00);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_message_advertiser_send");
                    if (A0f.isSampled()) {
                        C38642Gyj c38642Gyj = c41702IdW.A01;
                        if (c38642Gyj == null || (str2 = c38642Gyj.A05) == null) {
                            str2 = "";
                        }
                        AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str2));
                        C41702IdW.A01(A0f, c41702IdW, C38683GzO.A01(A0f, A03));
                        A0f.Cht();
                    }
                }
                C28531Zo.A04.A0E(this.A02, A00, this.A01.getModuleName(), "message_merchant", obj);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public C42411IqE(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41702IdW c41702IdW, C41727Idy c41727Idy, JI6 ji6) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = interfaceC11380iw;
        this.A05 = ji6;
        this.A04 = c41727Idy;
        this.A03 = c41702IdW;
    }
}
