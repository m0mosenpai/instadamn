package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MmD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51352MmD extends C3OO {
    public Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final FragmentActivity A06;
    public final UserSession A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51352MmD(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        super(view);
        C14360o3.A0B(view, 3);
        this.A00 = view.getContext();
        this.A07 = userSession;
        this.A06 = fragmentActivity;
        this.A01 = AbstractC166997dE.A0T(view, R.id.earnings_total_title);
        this.A03 = AbstractC166997dE.A0T(view, R.id.header_description_one);
        this.A05 = AbstractC166997dE.A0T(view, R.id.matching_description);
        this.A04 = AbstractC166997dE.A0T(view, R.id.header_description_two);
        this.A02 = AbstractC166997dE.A0T(view, R.id.date_range);
    }
}
