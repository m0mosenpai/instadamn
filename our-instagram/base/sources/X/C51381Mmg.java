package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Mmg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51381Mmg extends C3OO implements InterfaceC58188Pqu {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;

    @Override // X.InterfaceC58188Pqu
    public final View AsW() {
        return this.A00;
    }

    @Override // X.InterfaceC58188Pqu
    public final View B92() {
        return this.A01;
    }

    @Override // X.InterfaceC58188Pqu
    public final View B93() {
        return this.A02;
    }

    @Override // X.InterfaceC58188Pqu
    public final TextView B94() {
        return this.A06;
    }

    @Override // X.InterfaceC58188Pqu
    public final View B9A() {
        return this.A03;
    }

    @Override // X.InterfaceC58188Pqu
    public final TextView B9B() {
        return this.A07;
    }

    @Override // X.InterfaceC58188Pqu
    public final View BmW() {
        return this.A04;
    }

    @Override // X.InterfaceC58188Pqu
    public final View C3p() {
        return this.A05;
    }

    public C51381Mmg(View view) {
        super(view);
        this.A00 = AbstractC166987dD.A0c(view, R.id.create_fundraiser_container);
        this.A02 = AbstractC166987dD.A0c(view, R.id.fundraiser_info_container);
        this.A03 = AbstractC166987dD.A0c(view, R.id.fundraiser_text_container);
        this.A07 = AbstractC25230BEn.A0Q(view, R.id.fundraiser_title_text);
        this.A06 = AbstractC25230BEn.A0Q(view, R.id.fundraiser_info_secondary_text);
        this.A04 = AbstractC166987dD.A0c(view, R.id.remove_fundraiser);
        this.A05 = AbstractC166987dD.A0c(view, R.id.suggested_fundraisers_container);
        this.A01 = view.findViewById(R.id.icon);
    }
}
