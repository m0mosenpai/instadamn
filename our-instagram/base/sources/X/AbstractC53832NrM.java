package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

/* renamed from: X.NrM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53832NrM {
    public static Boolean A00(C6FW c6fw) {
        String str;
        boolean z;
        int width;
        int height;
        String path;
        C6FG c6fg = (C6FG) c6fw.A03(0);
        C102884kP c102884kP = (C102884kP) c6fw.A03(1);
        Context context = c6fg.A00;
        UserSession userSession = (UserSession) C6BQ.A0A(c6fg);
        String A0G = c102884kP.A0G();
        String A0E = c102884kP.A0E();
        String A0K = c102884kP.A0K();
        String A0I = c102884kP.A0I();
        int A03 = c102884kP.A03(40, -1);
        String A0J = c102884kP.A0J();
        String A0L = c102884kP.A0L(46);
        if (A0E != null && A0K != null && A0I != null && A03 != -1 && A0J != null && A0L != null) {
            C14360o3.A0B(userSession, 2);
            C40121td A01 = C40121td.A0G.A01(context, userSession);
            List A0O = c102884kP.A0O(42);
            String str2 = "";
            String A0L2 = c102884kP.A0L(44);
            if (A0L2 != null) {
                str2 = A0L2;
            }
            C6BS c6bs = C6BS.A02;
            android.net.Uri A032 = AbstractC08820cl.A03(A0I);
            C14360o3.A0B(A032, 0);
            String obj = C6BX.A01(A032, true).toString();
            boolean A0S = c102884kP.A0S(45, false);
            AbstractC167007dF.A1H(obj, 4, A0O);
            try {
                str = new java.net.URL(obj).getPath();
            } catch (MalformedURLException unused) {
                C0w9.A03("FundraiserWithFeedPostCreator", AnonymousClass001.A0R("Error parsing image url ", obj));
                str = null;
            }
            if (str != null) {
                Rect A0H = C1NC.A0H(str);
                int A00 = C1NC.A00(str);
                boolean z2 = true;
                if ((A00 / 90) % 2 == 1) {
                    width = A0H.height();
                    height = A0H.width();
                } else {
                    z2 = false;
                    width = A0H.width();
                    height = A0H.height();
                }
                double d = width / height;
                if (d < 0.792d) {
                    height = (int) Math.floor(width / 0.792d);
                } else if (d > 1.9291d) {
                    width = (int) Math.floor(height * 1.9291d);
                }
                int i = width;
                if (z2) {
                    i = height;
                    height = width;
                }
                Bitmap A0G2 = C1NC.A0G(str, A0H.width(), A0H.height(), i, height, A00, false);
                if (A0G2 != null) {
                    File A04 = AbstractC13530mf.A04(context);
                    C14360o3.A07(A04);
                    if (C1NC.A0L(Bitmap.CompressFormat.JPEG, A0G2, A04, 90) && (path = A04.getPath()) != null) {
                        C47Z A012 = AbstractC209399Nx.A01(AbstractC43593JPy.A0x());
                        A01.A0C(A012);
                        Rect A0D = AbstractC50522MSa.A0D(A0G2);
                        A012.A33 = path;
                        A012.A0K = 0;
                        int width2 = A0D.width();
                        int height2 = A0D.height();
                        A012.A0S = width2;
                        A012.A0R = height2;
                        A012.A0A = 90;
                        AnonymousClass257.A00(userSession).A04();
                        A012.A1E = new NewFundraiserInfo(A0G, A0J, A0K, str2, A0L, A0E, FundraiserCampaignTypeEnum.A0E.toString(), null, A0O, A03, A0S);
                        A012.A2y = userSession.userId;
                        A012.A2Z = str2;
                        A012.A0c(ShareType.A0H);
                        A01.A0G(A012, true, true);
                        A01.A09(A012);
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        return false;
    }
}
