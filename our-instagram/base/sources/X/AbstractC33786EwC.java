package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EwC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33786EwC {
    public static final void A00(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        String A00 = C151366re.A00(userSession);
        int A002 = (int) AbstractC126235nK.A00(context, 8);
        Drawable A003 = AbstractC13620mo.A00(context, R.drawable.instagram_chevron_right_pano_filled_12);
        if (A003 != null) {
            Drawable mutate = A003.mutate();
            if (mutate != null) {
                AbstractC166997dE.A1F(mutate, i);
            }
            A003.setBounds(0, 0, A002, A002);
        }
        C33252Elm c33252Elm = new C33252Elm(interfaceC16820sZ, i);
        int i2 = 2131953235;
        if (z) {
            i2 = 2131953257;
        }
        SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, A00, i2);
        AnonymousClass773.A04(A07, c33252Elm, A00);
        spannableStringBuilder.append((CharSequence) A07);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("  ");
        int length = spannableStringBuilder.length() - (A1V ? 1 : 0);
        if (A003 != null) {
            spannableStringBuilder.setSpan(new C85973sR(A003), length, length + 1, 33);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
