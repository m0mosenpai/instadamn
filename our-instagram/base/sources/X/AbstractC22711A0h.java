package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.facebook.R;
import java.util.regex.Pattern;

/* renamed from: X.A0h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22711A0h {
    public static final C161417Lc A00(Context context, C162297Or c162297Or, int i, int i2, long j, boolean z, boolean z2) {
        C14360o3.A0B(c162297Or, 7);
        if (z) {
            String A0p = AbstractC166997dE.A0p(context, 2131965052);
            int i3 = 2131973916;
            if (z2) {
                i3 = 2131973918;
            }
            String A0r = AbstractC166997dE.A0r(context.getResources(), A0p, i3);
            C14360o3.A07(A0r);
            SpannableString spannableString = new SpannableString(A0r);
            int A08 = AbstractC001900j.A08(A0r, A0p, 0, false);
            Pattern pattern = AbstractC13670mt.A00;
            int A082 = AbstractC001900j.A08(A0r, A0p, 0, false) + A0p.length();
            spannableString.setSpan(new StyleSpan(1), A08, A082, 17);
            spannableString.setSpan(new ForegroundColorSpan(i2), A08, A082, 17);
            String A0q = AbstractC166997dE.A0q(context.getResources(), 2131973919);
            C14360o3.A07(context.getString(2131973920));
            return new C161417Lc(c162297Or, spannableString, A0q, context.getResources().getDimensionPixelSize(R.dimen.direct_standard_xma_grid_view_height), i, j, z);
        }
        int i4 = 2131973914;
        if (z2) {
            i4 = 2131973917;
        }
        String A0q2 = AbstractC166997dE.A0q(context.getResources(), 2131973919);
        String A0q3 = AbstractC166997dE.A0q(context.getResources(), i4);
        C14360o3.A07(context.getString(2131973920));
        return new C161417Lc(c162297Or, A0q3, A0q2, AbstractC167017dG.A09(context), i, j, false);
    }
}
