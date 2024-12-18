package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bdf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25938Bdf extends C3OO {
    public final ImageView A00;
    public final TextView A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final InterfaceC56392iX A04;

    public C25938Bdf(View view) {
        super(view);
        this.A00 = (ImageView) AbstractC166987dD.A0c(view, R.id.menu_option_icon);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.menu_option_text);
        this.A03 = AbstractC56372iV.A00(view.findViewById(R.id.profile_menu_option_dot_badge_stub));
        this.A04 = AbstractC56372iV.A00(view.requireViewById(R.id.profile_menu_option_new_badge_stub));
        this.A02 = AbstractC56372iV.A00(view.findViewById(R.id.blue_badge_stub));
    }
}
