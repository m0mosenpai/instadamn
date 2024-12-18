package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fl2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35467Fl2 implements InputFilter {
    public final int A00;
    public final UserSession A01;
    public final String A02;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C14360o3.A0B(spanned, 3);
        if (spanned.length() >= this.A00) {
            UserSession userSession = this.A01;
            String str = this.A02;
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            C35142Fej.A00(userSession, "customer_details_page_note_exceed_threshold", str, c16920sk);
            return "";
        }
        return null;
    }

    public C35467Fl2(UserSession userSession, String str, int i) {
        AbstractC167017dG.A1R(userSession, str);
        this.A00 = i;
        this.A01 = userSession;
        this.A02 = str;
    }
}
