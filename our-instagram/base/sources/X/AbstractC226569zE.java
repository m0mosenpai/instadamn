package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;

/* renamed from: X.9zE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226569zE {
    public static final C183978Ee A00(Context context, C206209Bd c206209Bd, UserSession userSession) {
        String str;
        C14360o3.A0B(c206209Bd, 0);
        Bitmap bitmap = (Bitmap) c206209Bd.A01;
        String str2 = null;
        String str3 = null;
        C183978Ee A00 = AbstractC196828nC.A00(context, bitmap, null, userSession, null, bitmap.getWidth(), bitmap.getHeight(), false);
        C9ZP c9zp = (C9ZP) c206209Bd.A00;
        String str4 = c9zp.A03;
        String str5 = c9zp.A04;
        String str6 = c9zp.A05;
        CameraTool cameraTool = c9zp.A00;
        String str7 = str4;
        if (str4 == null) {
            str7 = "";
        }
        String str8 = c9zp.A08;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = c9zp.A09;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = str5;
        if (str5 == null) {
            str10 = "";
        }
        String str11 = str6;
        if (str6 == null) {
            str11 = "";
        }
        String str12 = c9zp.A0A;
        if (str12 == null) {
            str12 = "";
        }
        C28360CfK c28360CfK = C28360CfK.A00;
        CW0 cw0 = c9zp.A01;
        if (cw0 != null) {
            str3 = cw0.A02;
        }
        String A01 = c28360CfK.A01(cameraTool, str3);
        if (A01 == null) {
            A01 = "";
        }
        A00.A0p = AbstractC166987dD.A1J(new OTK(cameraTool, new OUP(str7, str8, str9, "", "", str12, A01, str10, str11)));
        A00.A0e = str4;
        A00.A0f = str5;
        A00.A0g = str6;
        if (cw0 != null) {
            str = cw0.A00;
        } else {
            str = null;
        }
        A00.A0l = str;
        if (cw0 != null) {
            str2 = cw0.A01;
        }
        A00.A0m = str2;
        A00.A0I = AbstractC14620oa.A01(AbstractC14570oV.A01(bitmap, C05F.A00), 0);
        A00.A0i = c9zp.A06;
        return A00;
    }
}
