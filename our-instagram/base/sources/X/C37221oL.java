package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.1oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37221oL {
    public static final C37221oL A00 = new Object();

    public final SpannableStringBuilder A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, int i) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 3);
        String string = context.getString(2131975516, str3);
        C14360o3.A07(string);
        String string2 = context.getString(2131975515, string);
        C14360o3.A07(string2);
        if (i != 0 && C18U.A06(C06090Tz.A05, userSession, 36325081044628169L)) {
            String A01 = AbstractC43744JWe.A01(context.getResources(), Integer.valueOf(i), false);
            C14360o3.A07(A01);
            CharSequence A002 = BHX.A00(context, new C27054Bwd(new Object[]{A01}, R.plurals.ai_home_chats_count, i));
            if (A002 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string2);
                sb.append(" · ");
                sb.append((Object) A002);
                string2 = sb.toString();
            }
        }
        C33260Elu c33260Elu = new C33260Elu(fragmentActivity, userSession, str2, str, context.getColor(AbstractC53242c7.A06(context)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        AnonymousClass773.A03(spannableStringBuilder, c33260Elu, string);
        return spannableStringBuilder;
    }
}
