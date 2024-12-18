package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.CustomTypefaceSpan;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.ADf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23023ADf {
    public static final C202688xm A00(Context context, UserSession userSession, User user, String str) {
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1D(context, 1, user);
        SpannableString spannableString = new SpannableString(str);
        C15980qs A00 = AbstractC15960qq.A00(context);
        Typeface A02 = A00.A02(EnumC15950qp.A12);
        if (A02 == null) {
            A02 = Typeface.DEFAULT;
        }
        spannableString.setSpan(new CustomTypefaceSpan(A02), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(AnonymousClass001.A0D(user.getUsername(), '@'));
        spannableString2.setSpan(new UnderlineSpan(), 1, spannableString2.length(), 0);
        Typeface A022 = A00.A02(EnumC15950qp.A13);
        if (A022 == null) {
            A022 = Typeface.DEFAULT;
        }
        spannableString2.setSpan(new CustomTypefaceSpan(A022), 0, spannableString2.length(), 0);
        spannableString2.setSpan(new C202858y3(AbstractC166997dE.A0M(context), user), 0, spannableString2.length(), 0);
        return new C202688xm(context, userSession, spannableString, spannableString2, AbstractC188878Yd.A01(context), AbstractC167017dG.A08(context), AbstractC167017dG.A05(context), AbstractC167017dG.A0F(context));
    }

    public static final C8FC A01() {
        return new C8FC((C8D0) new C183748Cz(0.5f, 0.45f), (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, false, false, false, false, true, true, true, true, true, false, false);
    }
}
