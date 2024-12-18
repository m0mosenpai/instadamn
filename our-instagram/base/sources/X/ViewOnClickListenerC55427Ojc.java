package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.Ojc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55427Ojc implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ OXR A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public ViewOnClickListenerC55427Ojc(FragmentActivity fragmentActivity, OXR oxr, UserSession userSession, C38321qM c38321qM, String str, int i, boolean z) {
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A06 = z;
        this.A00 = i;
        this.A04 = c38321qM;
        this.A05 = str;
        this.A02 = oxr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-50269314);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A03;
        boolean z = this.A06;
        int i = this.A00;
        C38321qM c38321qM = this.A04;
        String str = this.A05;
        OXR oxr = this.A02;
        C14360o3.A0C(fragmentActivity, "null cannot be cast to non-null type android.content.Context");
        C15370ps A1F = AbstractC25225BEi.A1F();
        int i2 = 2131956760;
        if (z) {
            i2 = 2131956761;
        }
        A1F.A00 = new OWa(fragmentActivity, userSession, new C56322Ozj(fragmentActivity, oxr, userSession, c38321qM, str, A1F, i, z), AbstractC166997dE.A0p(fragmentActivity, i2), fragmentActivity.getString(2131956758), false, true, false, false);
        Date date = new Date(i * 1000);
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, (5 - (calendar.get(12) % 5)) + 20);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        calendar2.add(5, 7);
        OWa oWa = (OWa) A1F.A00;
        if (oWa != null) {
            oWa.A02(false, null, date, calendar.getTime(), calendar2.getTime(), true);
        }
        oxr.A06(C05F.A0C);
        C0f9.A0C(-735889453, A05);
    }
}
