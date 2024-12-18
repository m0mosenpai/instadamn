package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.MlM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51299MlM extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgdsSwitch A02;

    public C51299MlM(View view) {
        super(view);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.title);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.description);
        this.A02 = (IgdsSwitch) AbstractC166987dD.A0c(view, R.id.allow_ads_switch);
        view.findViewById(R.id.section_title).setVisibility(8);
    }
}
