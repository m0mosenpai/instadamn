package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.UJa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66476UJa extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66476UJa(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.earnings_section_title);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.earnings_date);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.estimated_earnings_title);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.amount_earned);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.active_members);
        this.A07 = AbstractC25230BEn.A0Q(view, R.id.num_active_members);
        this.A05 = AbstractC25230BEn.A0Q(view, R.id.expired_membership);
        this.A08 = AbstractC25230BEn.A0Q(view, R.id.num_expired_membership);
        this.A06 = AbstractC25230BEn.A0Q(view, R.id.net_new);
        this.A09 = AbstractC25230BEn.A0Q(view, R.id.num_net_new);
    }
}
