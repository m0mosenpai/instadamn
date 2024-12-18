package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public abstract class FAH {
    public static final SpannableStringBuilder A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        AbstractC167007dF.A1K(context, userSession);
        String A0p = AbstractC166997dE.A0p(context, 2131966626);
        int i = 2131966623;
        if (num.intValue() != 0) {
            i = 2131966625;
        }
        String A0u = AbstractC25227BEk.A0u(context, i);
        if (A0u.length() == 0) {
            return null;
        }
        String A0g = AnonymousClass001.A0g(A0p, " · ", A0u);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0g);
        Pattern pattern = AbstractC13670mt.A01;
        A0H.setSpan(new TextAppearanceSpan(context, R.style.igds_emphasized_body_1), 0, A0p.length(), 33);
        A0H.setSpan(new ForegroundColorSpan(AbstractC167007dF.A09(context, R.attr.igdsSecondaryText)), 0, AbstractC167007dF.A0A(A0g), 33);
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36885711716811431L);
        if (A04.length() <= 0) {
            return A0H;
        }
        String A0p2 = AbstractC166997dE.A0p(context, 2131966624);
        A0H.append((CharSequence) " ");
        A0H.append((CharSequence) A0p2);
        AnonymousClass773.A05(A0H, new C33262Elw(context, interfaceC11380iw, userSession, num, A04, AbstractC31174DnI.A02(context)), A0p2);
        return A0H;
    }
}
