package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.VnR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69442VnR {
    public final View A00;
    public final ViewGroup A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgFrameLayout A06;
    public final UJR A07;
    public final IgdsListCell A08;
    public final IgdsListCell A09;
    public final IgdsListCell A0A;

    public C69442VnR(ViewGroup viewGroup, View view) {
        C14360o3.A0B(view, 1);
        this.A01 = viewGroup;
        this.A05 = AbstractC25230BEn.A0Q(view, R.id.inform_message_title);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.inform_message_body);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.actions_title);
        this.A08 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.resource_section_one);
        this.A0A = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.resource_section_two);
        this.A09 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.resource_section_three);
        this.A00 = AbstractC166987dD.A0c(view, R.id.divider);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.see_results_footer);
        this.A06 = (IgFrameLayout) AbstractC166987dD.A0c(view, R.id.inner_container);
        this.A07 = new UJR(view);
    }
}
