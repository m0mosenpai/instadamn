package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.PGg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56738PGg implements InterfaceC58158PqN {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final IgSimpleImageView A05;

    @Override // X.InterfaceC58158PqN
    public final View AnS() {
        return this.A01;
    }

    @Override // X.InterfaceC58158PqN
    public final View Aqk() {
        return this.A00;
    }

    @Override // X.InterfaceC58158PqN
    public final View BHY() {
        return this.A02;
    }

    @Override // X.InterfaceC58158PqN
    public final TextView Brf() {
        return this.A04;
    }

    public C56738PGg(View view) {
        this.A00 = view;
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.primary_text);
        this.A04 = AbstractC25230BEn.A0Q(this.A00, R.id.secondary_text);
        this.A01 = AbstractC166987dD.A0c(this.A00, R.id.chevron_icon);
        this.A02 = AbstractC166987dD.A0c(this.A00, R.id.info_icon);
        this.A05 = (IgSimpleImageView) this.A00.findViewById(R.id.icon);
    }
}
