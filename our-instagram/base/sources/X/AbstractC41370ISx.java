package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.instagram.model.people.PeopleTag;

/* renamed from: X.ISx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41370ISx {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableStringBuilder A00(android.content.Context r15, X.C57482kN r16, com.instagram.user.model.Product r17, int r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41370ISx.A00(android.content.Context, X.2kN, com.instagram.user.model.Product, int, boolean, boolean):android.text.SpannableStringBuilder");
    }

    public static SpannableStringBuilder A01(Context context, PeopleTag peopleTag) {
        String str;
        if (peopleTag.A07().A1c() && peopleTag.A02 && peopleTag.A08() != null) {
            str = peopleTag.A08();
        } else {
            str = null;
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(peopleTag.A00.A04);
        A0H.setSpan(new C138566Pm(), 0, A0H.length(), 33);
        if (str != null) {
            SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H("\n");
            int length = A0H2.length();
            A0H2.append((CharSequence) str);
            A0H2.setSpan(new ForegroundColorSpan(context.getResources().getColor(AbstractC53242c7.A09(context))), length, A0H2.length(), 0);
            A0H.append((CharSequence) A0H2);
        }
        return A0H;
    }
}
