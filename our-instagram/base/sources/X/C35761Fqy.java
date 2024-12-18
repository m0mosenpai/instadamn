package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fqy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35761Fqy implements InterfaceC58362lv {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C60662pp A01;

    public C35761Fqy(FragmentActivity fragmentActivity, C60662pp c60662pp) {
        this.A01 = c60662pp;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int i;
        View view;
        EnumC53152Nf7 enumC53152Nf7 = (EnumC53152Nf7) obj;
        C60662pp c60662pp = this.A01;
        UserSession session = c60662pp.getSession();
        FragmentActivity fragmentActivity = this.A00;
        C3BV A0H = c60662pp.A0A().A0H();
        C14360o3.A0B(session, 0);
        if (enumC53152Nf7 != null) {
            int ordinal = enumC53152Nf7.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    i = 2131975694;
                    view = A0H.A0H.A00;
                } else {
                    return;
                }
            } else {
                i = 2131975692;
                C3BY c3by = A0H.A0G;
                if (c3by == null) {
                    return;
                } else {
                    view = c3by.A00;
                }
            }
            if (view != null) {
                C5SU A0f = AbstractC167017dG.A0f(fragmentActivity, fragmentActivity.getString(i));
                A0f.A07(C5SV.A0A);
                A0f.A08(C5SV.A09);
                A0f.A04(view, 0, fragmentActivity.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), true);
                A0f.A0B = true;
                A0f.A00 = 5000;
                A0f.A00().A07(session);
            }
        }
    }
}
