package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.V5e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67989V5e extends AbstractC66422zJ {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final LE1 A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UJX(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_item_layout, false), this.A00, this.A01, this.A02);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        WhB whB = (WhB) interfaceC66482zP;
        UJX ujx = (UJX) c3oo;
        AbstractC167017dG.A1N(whB, ujx);
        IgImageView igImageView = ujx.A07;
        String str2 = whB.A0D;
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(str2, 100, 100);
        AbstractC59962oe abstractC59962oe = ujx.A01;
        igImageView.setUrl(extendedImageUrl, abstractC59962oe);
        IgTextView igTextView = ujx.A06;
        long j = whB.A08;
        igTextView.setText(MX0.A04("MMM d", j));
        String str3 = whB.A0B;
        Integer num = whB.A0A;
        Bundle bundle = new Bundle();
        bundle.putLong(AbstractC43591JPw.A00(816), j);
        bundle.putString(AbstractC43591JPw.A00(817), str2);
        if (str3 == null || num == null) {
            ujx.A03.setVisibility(8);
        }
        String str4 = null;
        if (str3 != null) {
            IgTextView igTextView2 = ujx.A04;
            Resources A0N = AbstractC166997dE.A0N(abstractC59962oe);
            if (A0N != null) {
                str = AbstractC166997dE.A0r(A0N, str3, 2131964401);
            } else {
                str = null;
            }
            igTextView2.setText(str);
            bundle.putString(AbstractC43591JPw.A00(813), str3);
        }
        if (num != null) {
            IgTextView igTextView3 = ujx.A05;
            Resources A0N2 = AbstractC166997dE.A0N(abstractC59962oe);
            if (A0N2 != null) {
                str4 = AbstractC31175DnJ.A0W(A0N2, num, R.plurals.inbox_campaign_ad_item_message_count, num.intValue());
            }
            igTextView3.setText(str4);
            bundle.putInt(AbstractC43591JPw.A00(815), num.intValue());
        }
        bundle.putString(AbstractC43591JPw.A00(814), whB.A0C);
        bundle.putString(AbstractC43591JPw.A00(812), AbstractC31180DnO.A0k(whB.A09));
        Bundle bundle2 = new Bundle();
        bundle2.putString("remaining_budget", String.valueOf(whB.A02));
        bundle2.putString("remaining_duration", String.valueOf(whB.A03));
        bundle2.putString("daily_spend_offset", String.valueOf(whB.A00));
        bundle2.putInt("spent_budget_offset_amount", whB.A04);
        bundle2.putInt("total_budget_offset_amount", whB.A06);
        bundle2.putInt("elapsed_duration_in_days", whB.A01);
        bundle2.putInt("total_duration_in_days", whB.A07);
        bundle2.putInt("remaining_duration_in_hours", whB.A05);
        bundle.putBundle(AbstractC43591JPw.A00(973), bundle2);
        WNX.A00(ujx.A00, bundle, ujx, whB, 27);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return WhB.class;
    }

    public C67989V5e(AbstractC59962oe abstractC59962oe, UserSession userSession, LE1 le1) {
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = le1;
    }
}
