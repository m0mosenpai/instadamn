package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.MZw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50701MZw {
    public static final C50701MZw A00 = new Object();

    public static final SpannableString A00(Context context, C130135uJ c130135uJ) {
        String str;
        if (c130135uJ == null || (str = c130135uJ.A04) == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(AbstractC167007dF.A0f(context, str, 2131962453));
        int A08 = AbstractC001900j.A08(spannableString, str, 0, false);
        spannableString.setSpan(new StyleSpan(1), A08, str.length() + A08, 33);
        return spannableString;
    }

    public static final SpannableStringBuilder A01(Spanned spanned, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        MSZ.A1O(userSession, str2);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(spanned);
        AnonymousClass773.A05(A0H, new C58710Q3z(fragmentActivity, userSession, str2, str3, 1), str);
        return A0H;
    }

    public static final String A02(Context context, C130135uJ c130135uJ, boolean z) {
        String str;
        if (c130135uJ != null) {
            str = c130135uJ.A04;
        } else {
            str = null;
        }
        if (z) {
            return context.getString(2131973765);
        }
        if (c130135uJ == null || c130135uJ.A00) {
            return str;
        }
        return null;
    }

    public static final String A03(Context context, EnumC53307Nhj enumC53307Nhj) {
        int i;
        if (enumC53307Nhj != null) {
            int ordinal = enumC53307Nhj.ordinal();
            if (ordinal != 2) {
                if (ordinal == 1) {
                    i = 2131976269;
                } else {
                    return null;
                }
            } else {
                i = 2131976270;
            }
            return context.getString(i);
        }
        return null;
    }

    public final void A04(Context context, EnumC53307Nhj enumC53307Nhj, String str) {
        int i;
        Object[] objArr;
        String A03 = A03(context, enumC53307Nhj);
        if (str == null && A03 == null) {
            return;
        }
        Resources resources = context.getResources();
        if (A03 == null) {
            i = 2131962514;
            objArr = new Object[]{str};
        } else if (str == null) {
            i = 2131962515;
            objArr = new Object[]{A03};
        } else {
            i = 2131962513;
            objArr = new Object[]{str, A03};
        }
        AbstractC07900bA.A00(resources, objArr, i);
    }
}
