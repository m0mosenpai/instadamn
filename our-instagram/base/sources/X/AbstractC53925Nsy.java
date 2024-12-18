package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import java.util.ArrayDeque;

/* renamed from: X.Nsy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53925Nsy {
    public static final SpannableString A00(Context context, UserSession userSession, String str, OA5... oa5Arr) {
        C14360o3.A0B(userSession, 1);
        context.getResources();
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        ArrayDeque arrayDeque = new ArrayDeque();
        A01.append((CharSequence) str);
        for (OA5 oa5 : oa5Arr) {
            String replace = AbstractC167007dF.A0h(oa5.A00).replace(' ', '_');
            C14360o3.A07(replace);
            AbstractC31423DrT.A00(A01, oa5.A00, AnonymousClass001.A0g("[[", replace, "]]"), arrayDeque, new Object[]{new C33264Ely(context, userSession, oa5, AbstractC31174DnI.A02(context))}, 33);
        }
        return new SpannableString(A01);
    }
}
