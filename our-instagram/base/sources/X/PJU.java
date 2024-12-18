package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes9.dex */
public final class PJU implements InterfaceC58188Pqu {
    public final IgSimpleImageView A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;

    @Override // X.InterfaceC58188Pqu
    public final View AsW() {
        return this.A01;
    }

    @Override // X.InterfaceC58188Pqu
    public final /* bridge */ /* synthetic */ View B92() {
        return this.A00;
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

    public PJU(View view) {
        this.A01 = AbstractC166987dD.A0c(view, R.id.create_container);
        this.A02 = AbstractC166987dD.A0c(view, R.id.info_container);
        this.A03 = AbstractC166987dD.A0c(view, R.id.text_container);
        View findViewById = view.findViewById(R.id.title_text);
        TextView textView = (TextView) findViewById;
        textView.setText(2131963006);
        C14360o3.A07(findViewById);
        this.A07 = textView;
        this.A06 = AbstractC25230BEn.A0Q(view, R.id.secondary_text);
        this.A04 = AbstractC166987dD.A0c(view, R.id.clear_button);
        this.A05 = AbstractC166987dD.A0c(view, R.id.suggested_items_container);
        View findViewById2 = view.findViewById(R.id.icon);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) findViewById2;
        igSimpleImageView.setImageResource(R.drawable.instagram_donations_pano_outline_24);
        C14360o3.A07(findViewById2);
        this.A00 = igSimpleImageView;
        AbstractC166987dD.A0e(view, R.id.create_container_label).setText(2131956949);
    }
}
