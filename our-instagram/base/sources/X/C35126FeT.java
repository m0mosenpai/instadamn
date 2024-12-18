package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.FeT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35126FeT {
    public UserSession A00;
    public C38321qM A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;

    public static C35126FeT A00(UserSession userSession) {
        return (C35126FeT) C31651DvH.A00(userSession, C35126FeT.class, 0);
    }

    public static void A01(Context context, C35126FeT c35126FeT, C188538Ws c188538Ws) {
        List list;
        int i;
        int i2;
        boolean z = c188538Ws.A04;
        HashSet A1H = AbstractC166987dD.A1H();
        HashSet A1H2 = AbstractC166987dD.A1H();
        c35126FeT.A01.getClass();
        String id = c35126FeT.A01.getId();
        if (z) {
            A1H.add(id);
        } else {
            A1H2.add(id);
        }
        UserSession userSession = c35126FeT.A00;
        Reel A0M = C1OU.A04(userSession).A0M(c188538Ws.A00);
        A0M.getClass();
        String id2 = c35126FeT.A01.getId();
        id2.getClass();
        C14360o3.A0B(userSession, 0);
        C54662OCo A00 = AbstractC50558MTp.A00(context, userSession, A0M, AbstractC166987dD.A1J(id2));
        String str = null;
        if (A00 != null) {
            str = A00.A03;
            list = AbstractC50558MTp.A04(A00);
            ImageUrl imageUrl = A00.A02;
            i = imageUrl.getHeight();
            i2 = imageUrl.getWidth();
        } else {
            list = null;
            i = 0;
            i2 = 0;
        }
        String str2 = c188538Ws.A00;
        String str3 = c188538Ws.A02;
        C14360o3.A0B(str3, 0);
        Object obj = EnumC53243Ngg.A01.get(str3);
        if (obj != null) {
            EnumC53243Ngg enumC53243Ngg = (EnumC53243Ngg) obj;
            AbstractC167017dG.A1P(str2, enumC53243Ngg);
            C1ON A01 = AbstractC1571873x.A01(enumC53243Ngg, userSession, str2, null, str, null, list, A1H, A1H2, i, i2);
            A01.A00 = new C32475ESb(c35126FeT, c188538Ws.A00, z);
            C1GJ.A03(A01);
            return;
        }
        throw AbstractC166987dD.A14("value not found in the enum's reverse map");
    }

    public static void A02(C35126FeT c35126FeT, C188538Ws c188538Ws) {
        c35126FeT.A01.getClass();
        UserSession userSession = c35126FeT.A00;
        String str = c188538Ws.A02;
        C14360o3.A0B(str, 0);
        Object obj = EnumC53243Ngg.A01.get(str);
        if (obj != null) {
            EnumC53243Ngg enumC53243Ngg = (EnumC53243Ngg) obj;
            HashSet A0k = AbstractC31171DnF.A0k(Collections.singletonList(c35126FeT.A01.getId()));
            String str2 = c188538Ws.A01;
            str2.getClass();
            String id = c35126FeT.A01.getId();
            int A0y = c35126FeT.A01.A0y();
            int A0z = c35126FeT.A01.A0z();
            List list = c188538Ws.A03;
            AbstractC167007dF.A1K(userSession, enumC53243Ngg);
            C1ON A00 = AbstractC1571873x.A00(enumC53243Ngg, userSession, str2, id, null, null, list, A0k, A0y, A0z, false);
            A00.A00 = new ESP(c35126FeT);
            C1GJ.A03(A00);
            return;
        }
        throw AbstractC166987dD.A14("value not found in the enum's reverse map");
    }
}
