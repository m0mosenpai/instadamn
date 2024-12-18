package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MmG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51355MmG extends C3OO {
    public Context A00;
    public Resources A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final FragmentActivity A09;
    public final UserSession A0A;

    public C51355MmG(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        super(view);
        this.A0A = userSession;
        this.A09 = fragmentActivity;
        this.A08 = AbstractC167007dF.A0N(view, R.id.earnings_section_title);
        this.A06 = AbstractC167007dF.A0N(view, R.id.amount_earned);
        this.A07 = AbstractC167007dF.A0N(view, R.id.incentive_match_amount);
        this.A05 = AbstractC167007dF.A0N(view, R.id.earnings_date);
        this.A04 = AbstractC167007dF.A0N(view, R.id.badges_received);
        this.A03 = AbstractC167007dF.A0N(view, R.id.badges_amount);
        this.A02 = AbstractC166997dE.A0S(view, R.id.see_supporters);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A00 = A0L;
        this.A01 = AbstractC166997dE.A0M(A0L);
    }
}
