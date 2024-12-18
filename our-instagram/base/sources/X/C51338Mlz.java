package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Mlz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51338Mlz extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgdsSwitch A05;

    public C51338Mlz(View view) {
        super(view);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.sharing_title);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.sharing_description);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.audience_description);
        this.A05 = (IgdsSwitch) AbstractC166987dD.A0c(view, R.id.sharing_switch);
        ImageView imageView = (ImageView) AbstractC166987dD.A0c(view, R.id.sharing_spinner);
        this.A01 = imageView;
        this.A00 = AbstractC166987dD.A0c(view, R.id.sharing_switch_layout);
        AnonymousClass710 A00 = AbstractC54033Nuj.A00(imageView.getContext(), false);
        A00.A01(1.0f);
        A00.A02(true);
        imageView.setImageDrawable(A00);
    }
}
