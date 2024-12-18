package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.PGf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56737PGf implements InterfaceC58158PqN {
    public View A00;
    public TextView A01;
    public IgSimpleImageView A02;
    public View A03;
    public TextView A04;
    public final View A05;

    @Override // X.InterfaceC58158PqN
    public final View AnS() {
        return this.A00;
    }

    @Override // X.InterfaceC58158PqN
    public final View Aqk() {
        return this.A05;
    }

    @Override // X.InterfaceC58158PqN
    public final View BHY() {
        return this.A03;
    }

    @Override // X.InterfaceC58158PqN
    public final TextView Brf() {
        return this.A04;
    }

    public C56737PGf(View view) {
        this.A05 = view;
        this.A01 = AbstractC167007dF.A0N(view, R.id.title);
        this.A04 = AbstractC167007dF.A0N(this.A05, R.id.inline_subtitle);
        this.A00 = AbstractC166997dE.A0S(this.A05, R.id.chevron_icon);
        this.A03 = AbstractC166997dE.A0S(this.A05, R.id.info_icon);
        this.A02 = AbstractC31176DnK.A0T(this.A05, R.id.icon);
    }
}
