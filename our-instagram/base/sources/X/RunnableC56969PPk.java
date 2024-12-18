package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.PPk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56969PPk implements Runnable {
    public final /* synthetic */ N9S A00;
    public final /* synthetic */ C52252NAr A01;

    public RunnableC56969PPk(N9S n9s, C52252NAr c52252NAr) {
        this.A01 = c52252NAr;
        this.A00 = n9s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C52252NAr c52252NAr = this.A01;
        C55197Oe4 c55197Oe4 = c52252NAr.A0A;
        String str2 = c55197Oe4.A01;
        if (str2.trim().isEmpty()) {
            str2 = c52252NAr.A07.getResources().getString(2131963609);
        }
        C54662OCo c54662OCo = c55197Oe4.A00;
        c54662OCo.getClass();
        UserSession userSession = c52252NAr.A0D;
        EnumC53243Ngg enumC53243Ngg = c52252NAr.A0C;
        java.util.Set keySet = c55197Oe4.A05.keySet();
        C54662OCo c54662OCo2 = c55197Oe4.A00;
        if (c54662OCo2 == null) {
            str = null;
        } else {
            str = c54662OCo2.A03;
        }
        String str3 = c54662OCo.A04;
        ImageUrl imageUrl = c54662OCo.A02;
        int height = imageUrl.getHeight();
        int width = imageUrl.getWidth();
        C54662OCo c54662OCo3 = c55197Oe4.A00;
        c54662OCo3.getClass();
        C1ON A00 = AbstractC1571873x.A00(enumC53243Ngg, userSession, str2, str, str3, c55197Oe4.A02, C55197Oe4.A03(c54662OCo3), keySet, height, width, c52252NAr.A03);
        A00.A00 = this.A00;
        C1GJ.A00(c52252NAr.A07, c52252NAr.A09, A00);
    }
}
