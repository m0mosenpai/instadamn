package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FUF {
    public static final AbstractC46972Dl A00(C32071E6x c32071E6x) {
        int i = c32071E6x.A00;
        if (i != 0) {
            if (i != 1) {
                if (i == 7) {
                    String str = c32071E6x.A01;
                    if (str != null) {
                        return new C2E6(str);
                    }
                    throw AbstractC166997dE.A0g();
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Unsupported folder to move to: ");
                A1C.append(c32071E6x);
                throw AbstractC166987dD.A12(AbstractC166997dE.A0x(".threadFolder", A1C));
            }
            return C46962Dk.A00;
        }
        return C47032Dr.A00;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public static final void A01(Context context, C32071E6x c32071E6x, UserSession userSession, String str, int i, boolean z) {
        int i2;
        String[] strArr;
        ?? A1b = AbstractC25233BEq.A1b(context, userSession, c32071E6x);
        if (C2E8.A07(userSession) && c32071E6x.A00 != -1) {
            AbstractC46972Dl A00 = A00(c32071E6x);
            if (str == null) {
                str = JUR.A00(context, userSession, A00);
            }
            if (C2E8.A03(userSession)) {
                Resources resources = context.getResources();
                if (i > A1b) {
                    i2 = 2131964425;
                    strArr = new String[]{String.valueOf(i), str};
                } else {
                    i2 = 2131964426;
                    strArr = new String[]{str};
                }
                Spanned A01 = AbstractC07900bA.A01(resources, strArr, i2);
                C14360o3.A0A(A01);
                C146106i8 A0X = AbstractC31173DnH.A0X(A01);
                AbstractC31175DnJ.A0l(context, A0X, 2131964427);
                G9A.A00(A0X, A00, userSession, 9);
                if (z) {
                    A0X.A0L = A1b;
                }
                AbstractC31178DnM.A1S(A0X);
                return;
            }
            C9GR.A09(context, AbstractC167007dF.A0f(context, str, 2131964424));
        }
    }
}
