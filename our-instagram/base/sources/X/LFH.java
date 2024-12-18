package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LFH {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(str, 2);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        C52790NXz c52790NXz = new C52790NXz(context, userSession, str3, AbstractC31174DnI.A02(context));
        if (str2 != null) {
            AnonymousClass773.A05(A0H, c52790NXz, str2);
            return A0H;
        }
        return null;
    }

    public final String A01(Context context, UserSession userSession) {
        String A0f;
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36598120705952884L);
        Long valueOf = Long.valueOf(A01);
        if (A01 == -1) {
            A0f = context.getString(2131963089);
        } else {
            A0f = AbstractC167007dF.A0f(context, valueOf, 2131963087);
        }
        C14360o3.A0A(A0f);
        return A0f;
    }
}
