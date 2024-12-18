package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.76u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1578676u implements InterfaceC165377aQ {
    public final C7Y8 A00;
    public final Fragment A01;
    public final UserSession A02;

    public C1578676u(Fragment fragment, UserSession userSession, C7Y8 c7y8) {
        C14360o3.A0B(fragment, 2);
        C14360o3.A0B(c7y8, 3);
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = c7y8;
    }

    @Override // X.InterfaceC165377aQ
    public final SpannableString ChE(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C85383rT c85383rT = new C85383rT(spannableStringBuilder, this.A02);
        c85383rT.A08 = new C47350Kvz(this);
        c85383rT.A0U = true;
        Fragment fragment = this.A01;
        c85383rT.A04 = fragment.requireContext().getColor(AbstractC53242c7.A0H(fragment.requireContext(), R.attr.igds_color_link));
        c85383rT.A00();
        return SpannableString.valueOf(spannableStringBuilder);
    }
}
